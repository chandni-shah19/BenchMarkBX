package org.benchmarx.examples.familiestopersons.testsuite.level3_n.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class CreatingNewFamiliesAndMembers extends FamiliesToPersonsTestCase {

	public CreatingNewFamiliesAndMembers(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Test</b> for creation of a single family member (a father) in the only existing family.
	 * <p>
	 * <b>Expect</b> the creation of new male person in the persons model, with full name consisting of the first name and family name of the associated family member.
	 * <p>
	 * <b>Classification</b>: batch-wocorr-state-auto
	 * <ul>
	 * <li><b>batch</b>: creation of family and only one family member does not require old(er) state as birthday would not be loss for person register.
	 * <li><b>wocorr</b>: no need for traceability links, as it is easy to determine person has to be created with full name.
	 * <li><b>state</b>: easy to guess/compute the delta involved here based on the current state.
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
	 */
	@Test
	public void testCreateFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherHomer));
		//------------
		
		util.assertSource("oneFamilyWithOneFamilyMember");
		util.assertTarget("PersonWithOneMaleMember");
	}
	
}
