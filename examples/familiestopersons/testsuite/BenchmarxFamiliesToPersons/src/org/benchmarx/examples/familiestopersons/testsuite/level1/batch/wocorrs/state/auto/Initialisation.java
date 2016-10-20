package org.benchmarx.examples.familiestopersons.testsuite.level1.batch.wocorrs.state.auto;

import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
import org.junit.Test;

public class Initialisation extends FamiliesToPersonsTestCase {
	
	/**
	 * Test for agreed upon starting state.
	 * Expect root elements of both source and target models.
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		//------------
		tool.initiateSynchronisationDialogue();
		//------------
		
		util.assertSource("RootElementFamilies");
		util.assertTarget("RootElementPersons");
	}
}
