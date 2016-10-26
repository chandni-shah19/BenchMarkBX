package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wcorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;


public class DeletingFamiliesAndFamilyMembers extends FamiliesToPersonsTestCase {
	
	public DeletingFamiliesAndFamilyMembers(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for deletion of a single family member.
	 * Expect the associated person to be deleted from the persons model.
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
		//------------
		
		util.assertSource("DeleteFamilyMember");
		util.assertTarget("DeletePerson");
	}
	
	/**
	 * Test for deletion of a single family member (father).
	 * Expect the associated person to be deleted from the persons model.
	 */
	@Test
	public void testDeleteFamilyMemberHomer() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyFatherHomer);
		//------------
		
		util.assertSource("DeleteFamilyMemberHomer");
		util.assertTarget("DeletePersonHomer");
	}
}
