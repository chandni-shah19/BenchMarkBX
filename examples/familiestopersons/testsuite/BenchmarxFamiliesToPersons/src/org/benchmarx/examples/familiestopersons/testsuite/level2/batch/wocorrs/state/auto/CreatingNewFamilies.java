package org.benchmarx.examples.familiestopersons.testsuite.level2.batch.wocorrs.state.auto;

import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
import org.junit.Test;

public class CreatingNewFamilies extends FamiliesToPersonsTestCase {

	/**
	 * Test for creation of a single family in an empty root container.
	 * Expected: Nothing changes in the person model.
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
