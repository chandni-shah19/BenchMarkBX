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
	 * <b>Test</b> for deletion of an entire family with all family members.
	 * <p>
	 * <b>Expect</b> Delete all corresponding persons in the persons model.
	 * <p>
	 * <b>Classification</b>: incr-wcorr-state-auto
	 * <ul>
	 * <li><b>incr</b>: deleting family requires old consistent state as
	 * their birthdays would be otherwise lost.
	 * <li><b>wcorr</b>: traceability links are required as it is impossible to
	 * guess correctly which persons correspond to which family members, given
	 * that there are multiple persons with the exact same family name.
	 * <li><b>state</b>: deleting is state based, as its possible to determine old and new state. 
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
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
