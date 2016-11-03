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
	 * Test for creation of a single family in an empty root container.
	 * Expected: Nothing changes in the person model.
	 * 
	 * Classification: batch-wocorr-state-auto
	 * batch: initial state of synchronization, family created from scratch so no need for old consistent state.
	 * wocorr: easily can apply default strategy and possible to guess, as creating only single family nothing has to be change in persons model.
	 * state: it is possible to guess, based on the current state.
	 * auto: there is no decision has to be made, as it's a clear what has to be done.
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
