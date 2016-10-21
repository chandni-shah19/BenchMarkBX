package org.benchmarx.examples.familiestopersons.testsuite.level1.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
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
