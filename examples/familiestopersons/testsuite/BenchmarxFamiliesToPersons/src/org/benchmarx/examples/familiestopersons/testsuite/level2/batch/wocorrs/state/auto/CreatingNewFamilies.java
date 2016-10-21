package org.benchmarx.examples.familiestopersons.testsuite.level2.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
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
