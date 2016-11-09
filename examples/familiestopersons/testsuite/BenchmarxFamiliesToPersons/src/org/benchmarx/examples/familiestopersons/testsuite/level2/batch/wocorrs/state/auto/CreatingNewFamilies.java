package org.benchmarx.examples.familiestopersons.testsuite.level2.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class CreatingNewFamilies extends FamiliesToPersonsTestCase {

	public CreatingNewFamilies(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Test</b> for creation of a single family in an empty root container.
	 * <p>
	 * <b>Expect</b> Nothing has to change in the person model.
	 * <p>
	 * <b>Classification</b>: batch-wocorr-state-auto
	 * <ul>
	 * <li><b>batch</b>: family created from scratch so an old(er) state doesn't require.
	 * <li><b>wocorr</b>: no need for traceability links, as creating only single family nothing has to be change in persons model.
	 * <li><b>state</b>: easy to guess/compute the delta involved here based on the current state (nothing has to be change in persons model)
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
	 */
	@Test
	public void testCreateFamily()
	{
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		//------------
		
		util.assertSource("oneFamily");
		util.assertTarget("personsForOneFamily");
	}
}
