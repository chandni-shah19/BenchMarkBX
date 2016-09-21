package org.benchmarx.familiestopersons;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.benchmarx.core.Configurator;
import org.benchmarx.core.HelperFamilyTest;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

/**
 * This class test the possible updates (level 2) for the Family Model.
 */
public class FamilyUpdatesLevelTwo {

	private BXTool<FamilyRegister, PersonRegister, Configurator<Decisions>> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil util;
	private HelperFamilyTest helperFamily;

	@Before
	public void initialise() {
		tool = new EMoflon();
		util = new BenchmarxUtil();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		helperFamily = new HelperFamilyTest();
	}

	/**
	 * Test for creation of a single family in an empty root container.
	 * Expected: Nothing changes to the person model .
	 */
	@Test
	public void testCreateFamily() {
		tool.initiateSynchronisationDialogue();

		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		assertSource("oneFamily");
		assertTarget("personsForOneFamily");
	}	
	
	
	/**
	 * Test for creation of a single family member in to the existing family.
	 * Expect the creation of new person(male or female) in the person model, with full name consists of the first name and family name of the associated family member.
	 *  For family members associated via a father or son association to the family a Male object is created, 
	 *  for mothers and daughters a Female object respectively.
	 */
	@Test
	public void testCreateFamilyMember(){
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		assertSource("oneFamilyWithOneFamilyMember");
		assertTarget("PersonWithOneMaleMember");
	}
	
	/**
	 * Test for family member role change, from father to son or from mother to daughter.
	 * Expected :Nothing changes to the person model, when role changes from father to son or mother to daughter.
	 * Changes in person model expected only if role change from mother to father or son and father to daughter or mother, i.e. when gender changes
	 */
	@Test
	public void testFamilyMemberRoleChange() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyFatherHomerRoleChangeToSon);
		assertSource("RoleChangeFamilyMember");
		assertTarget("NoChangePerson");
	}
	
	/**
	 * Test for family member moved to new family, i.e. daughter is married and created a new family.
	 * Expected the family name of person changed in the person model.
	 */
	@Test
	public void testFamilyMemberDiffFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::moveDaughterToMotherOfNewFamily);
		assertSource("FamilyMemberWithDiffFamily");
		assertTarget("PersonsFirstNameChange");
	}

	/**
	 * Test for deletion of family member.
	 * Expect the associated person should be deleted from the person model.
	 */
	@Test
	public void testDeleteFamilyMember() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyFatherAmitabh);
		assertSource("DeleteFamilyMember");
		assertTarget("DeletePerson");
	}
	
	
	private void assertSource(String path){
		familiesComparator.compare(util.loadExpectedModel(path), tool.getSourceModel());
	}
	
	
	private void assertTarget(String path){
		personsComparator.compare(util.loadExpectedModel(path), tool.getTargetModel());
	}

}
