package org.benchmarx.examples.familiestopersons.testsuite.level3_n.incr.wcorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class DeletingFamilyOfSameName extends FamiliesToPersonsTestCase {

	public DeletingFamilyOfSameName(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}
	
	/**
	 * Test for deletion of an entire family with all family members.
	 * Expected: Delete all corresponding persons in the persons model.
	 * 
	 * Classification: incr-wcorr-state-auto
	 * incr: deleting family requires old consistent state.
	 * it's impossible to guess, as multiple families have same name and all the members which contains the same family name and unclear which family member is related to which family. 
	 * state: its possible to determine, old and new state of the families model. 
	 * auto: there is no decision has to be made, as its clear what has to be deleted.
	 */
	@Test
	public void testDeleteFamilyOfSameName() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);

		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherGeorge);
		tool.performAndPropagateSourceEdit(helperFamily::createOtherSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFirstSimpsonFamily);
		//------------
		
		util.assertSource("DeleteFamilySameName");
		util.assertTarget("DeleteAllPersonSameFamilyName");		
	}

}
