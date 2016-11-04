package org.benchmarx.examples.familiestopersons.testsuite.level3_n.incr.wocorrs.state.auto;

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
	 * Test for deletion of an entire family with all family members.
	 * Expected: Delete all corresponding persons in the persons model.
	 * 
	 * Classification: incr-wocorr-state-auto
	 * incr: deleting family requires old consistent state.
	 * wocorr: it's possible to guess, which members related to family has to be deleted in the persons model.  
	 * state: its possible to determine, old and new state of the families model as only one family with this name is available. 
	 * auto: there is no decision has to be made, as its clear what has to be deleted.
	 */
	@Test
	public void testDeleteFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createBachchanFamily)
			       .andThen(helperFamily::createFatherAmitabh));
		tool.performAndPropagateSourceEdit(helperFamily::createfamilyBachchanWithOtherRemainingMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyBachchan);
		//------------
		
		util.assertSource("DeleteFamily");
		util.assertTarget("DeleteAllPerson");		
	}
}
