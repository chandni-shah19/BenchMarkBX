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
 * This class test the possible updates (level 2) for the Person Model .
 */
public class PersonUpdatesLevelTwo {

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
	 * Test for creation a single male person.
	 * Expect the creation of corresponding family member in the Families Model with the given first name.
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
	 * Test for creating multiple persons together.
	 * Expect the creation of corresponding family member in the Families Model with the given first name, with prefer decisions.
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
	 * Test for deleting the person.
	 * Expect the deletion of the corresponding family member in the Families Model.
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
	
	/**
	 * Test for creating the multiple person.
	 * Expect the same result as {#testCreateMultiPerson()}.
	 */
	@Test
	public void testMultiPersonWithDiffFamilyNames() {
		tool.initiateSynchronisationDialogue();
		configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
				   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		
		tool.performAndPropagateTargetEdit(helperPerson::createAmitabh);
		tool.performAndPropagateTargetEdit(helperPerson::createJaya);
		tool.performAndPropagateTargetEdit(helperPerson::createAbhishek);
		tool.performAndPropagateTargetEdit(helperPerson::createShweta);
			
		assertTarget("PersonsNewMulti");
		assertSource("familyMulti");
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
