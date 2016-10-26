package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wcorrs.delta.config;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class RenamingPersonsWithDecisions extends FamiliesToPersonsTestCase {

	public RenamingPersonsWithDecisions(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for changing a person's family name.
	 * Expect the person to be associated with another family as the family name does not fit anymore.
	 * In this case a fitting family does not exist, so a new family must be created.
	 */
	@Test
	public void testFamilyNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
			
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfLisa);
		//----------------

		util.assertTarget("PersonFamilyNameChange");
		util.assertSource("MemberFamilyNameChange");
	}
	
	/**
	 * Test for changing a person's family name.
	 * Expect the person to be associated with another family as the family name does not fit anymore.
	 * In this case fitting family already exists and must be used as this is preferred.
	 */
	@Test
	public void testFamilyNameChangePersonToExist() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		tool.performAndPropagateSourceEdit(helperFamily::createNandaFamily);
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		util.configure().makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfShweta);
		//----------------
		
		util.assertTarget("PersonFamilyNameChangeToExist");
		util.assertSource("MemberFamilyNameChangeToExist");
	}
	
	/**
	 * Test for changing a person's family name.
	 * Expect the person to be associated with another family as the family name does not fit anymore.
	 * In this case a fitting family already exists but creating a new family is preferred.
	 */
	@Test
	public void testFamilyNameChangePersonToExistNew() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		tool.performAndPropagateSourceEdit(helperFamily::createNandaFamily);
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		util.configure().makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false);
		tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfShweta);
		//----------------
		
		util.assertTarget("PersonFamilyNameChangeToExistNew");
		util.assertSource("MemberFamilyNameChangeToExistNew");
	}
}
