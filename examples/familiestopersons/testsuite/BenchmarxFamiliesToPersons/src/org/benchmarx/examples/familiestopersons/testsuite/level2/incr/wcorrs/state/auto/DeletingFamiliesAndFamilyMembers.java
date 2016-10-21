package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wcorrs.state.auto;

import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
import org.junit.Test;


public class DeletingFamiliesAndFamilyMembers extends FamiliesToPersonsTestCase {
	
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
	
	//TODO:  Add test deleting homer
}
