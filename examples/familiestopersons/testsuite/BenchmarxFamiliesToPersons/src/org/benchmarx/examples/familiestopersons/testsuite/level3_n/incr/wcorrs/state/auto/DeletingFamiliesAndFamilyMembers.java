package org.benchmarx.examples.familiestopersons.testsuite.level3_n.incr.wcorrs.state.auto;

import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
import org.junit.Test;


public class DeletingFamiliesAndFamilyMembers extends FamiliesToPersonsTestCase {
	
	/**
	 * Test for deletion of an entire family with all family members.
	 * Expected: Delete all corresponding persons in the persons model.
	 */
	@Test
	public void testDeleteFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyBachchan);
		//------------
		
		util.assertSource("DeleteFamily");
		util.assertTarget("DeleteAllPerson");		
	}
}
