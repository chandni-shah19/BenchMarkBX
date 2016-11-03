package org.benchmarx.examples.familiestopersons.testsuite.level1.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class Initialisation extends FamiliesToPersonsTestCase {
	
	public Initialisation(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for agreed upon starting state.
	 * Expect root elements of both source and target models.
	 * 
	 * Classification: batch-wocorr-state-auto
	 * batch: initial state of synchronization, so no need for old consistent state.
	 * wocorr: easily can apply default strategy and possible to guess, if root element of families created then related persons root element should be created. 
	 * state: it is possible to guess, based on the current state.
	 * auto: there is no decision has to be made, as it's a clear what has to be created.
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
