package org.benchmarx.familiestopersons;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.benchmarx.core.Configurator;
import org.benchmarx.core.HelperPersonTest;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

/**
 * This class test the possible updates applied to the source model, i.e Person Model
 */
public class BenchmarkTestsTargetDelta {

	private BXTool<FamilyRegister, PersonRegister, Configurator<Decisions>> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil util;
	private HelperPersonTest helperPerson;
	
	@Before
	public void initialise() {
		tool = new EMoflon();
		util = new BenchmarxUtil();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		helperPerson = new HelperPersonTest();
	}
	
	/**
	 * Expect root elements of both source and target models
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		tool.initiateSynchronisationDialogue();
		
		assertSource("rootElementFamilies");
		assertTarget("rootElementPersons");
	}
	
	/**
	 * Test for creation a single male person
	 */
	@Test
	public void testCreatePerson() {
		tool.initiateSynchronisationDialogue();
	
		// ---------------------------------
		configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
			
		assertTarget("PersonOneMaleMember");
		assertSource("oneFamilyWithOneFamilyMember");
	}

	/**
	 * Test for changing the birthday of the person.
	 */
	@Test
	public void testBirthdayChange(){
		tool.initiateSynchronisationDialogue();
			
		configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		
		//-----------------------------
		tool.performAndPropagateTargetEdit((helperPerson::birthdayChangeOfHomer));
		assertTarget("PersonBirthdayChange");
		assertSource("oneFamilyWithOneFamilyMember");
	}
	
	/**
	 * Test for creating multiple persons together.
	 */
	@Test
	public void testCreateMultiPerson() {
		tool.initiateSynchronisationDialogue();
		configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
				   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		assertTarget("PersonMultiMembers");
		assertSource("FamiliesMultiMembers");
	}
	
	/**
	 * Test for changing the person's first name.
	 */
	@Test
	public void testFirstNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
					   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::firstNameChangeOfHomer);
		assertTarget("PersonNameChange");
		assertSource("MemberNameChange");
	}
	
	/**
	 * Test for changing the person's family name.
	 */
	@Test
	public void testFamilyNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
		   		   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//----------------
			configure();
			tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfLisa);
			assertTarget("PersonFamilyNameChange");
			assertSource("MemberFamilyNameChange");
	}
	
	/**
	 * Test for changing the person's full name.
	 */
	@Test
	public void testFullNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
		   		   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//----------------
		configure();
		tool.performAndPropagateTargetEdit(helperPerson::fullNameChangeOfHomer);
		assertTarget("PersonFullNameChange");
		assertSource("MemberFullNameChange");
	}
	
	/**
	 * Test for deleting the person.
	 */
	@Test
	public void testDeletePerson() {
		tool.initiateSynchronisationDialogue();
			
		configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
				   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//---------------------- 
		configure();
		tool.performAndPropagateTargetEdit(helperPerson::deleteMarge);
		assertTarget("PersonDelete");
		assertSource("MemberDelete");
	}
	
		private void assertSource(String path){
			familiesComparator.compare(util.loadExpectedModel(path), tool.getSourceModel());
		}
		
		private void assertTarget(String path){
			personsComparator.compare(util.loadExpectedModel(path), tool.getTargetModel());
		}
		
		private Configurator<Decisions> configure() {
			Configurator<Decisions> c = new Configurator<>();
			tool.setConfigurator(c);
			return c;
		}
		
		
}
