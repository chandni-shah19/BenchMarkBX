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
	 * <b>Test</b> for deletion of an entire family with all family members.
	 * <p>
	 * <b>Expect</b> all corresponding persons in the persons model has to be deleted.
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-auto
	 * <ul>
	 * <li><b>incr</b>: deleting family requires old consistent state as
	 * their birthdays would be otherwise lost.
	 * <li><b>wocorr</b>: it's possible to guess required correspondences as full names of persons are unique (in this example).
	 * <li><b>state</b>:  deleting is state based, as its possible to determine old and new state.
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
	 */
	@Test
	public void testDeleteFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createBachchanFamily)
			       .andThen(helperFamily::createFatherAmitabh));
		tool.performAndPropagateSourceEdit(helperFamily::createOtherRemainingMembersInFamilyBachchan);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyBachchan);
		//------------
		
		util.assertSource("DeleteFamily");
		util.assertTarget("DeleteAllPerson");		
	}
}
