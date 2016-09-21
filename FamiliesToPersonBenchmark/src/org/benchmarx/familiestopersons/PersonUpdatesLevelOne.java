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
 * This class test the possible updates (level 1) for the Person Model .
 */
public class PersonUpdatesLevelOne {

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
	 * Expect root elements of both source and target models.
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		tool.initiateSynchronisationDialogue();
				
		assertTarget("rootElementPersons");
		assertSource("rootElementFamilies");
	}
	
	/**
	 * Test for changing the person's first name.
	 * Expected : only the first name in the Families Model has to be changed
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
	 * Expect the person has to be associated with another family as the family name does not fit anymore.
	 * with decisions: if family name already exist, then prefer to add in to existing family.
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
	 * Expect the same behavior as {@#testFamilyNameChangePerson} {@#testFirstNameChangePerson()}
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
	 * Test for changing the birthday of the person.
	 * Expected : Nothing changes to the in the Families Models this information is not contained in to Family Model.
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
