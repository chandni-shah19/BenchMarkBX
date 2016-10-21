package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wcorrs.state.config;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class CreatingPeople extends FamiliesToPersonsTestCase {
	
	public CreatingPeople(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for creation of a single male person.
	 * Expect the creation of a family member in the families model with the given first name.
	 * Decision: Create a parent (here a father) instead of a child (but only if possible, i.e., no double fathers or double mothers)
	 */
	@Test
	public void testCreatePerson()
	{
		tool.initiateSynchronisationDialogue();
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		// ---------------------------------
			
		util.assertTarget("PersonOneMaleMember");
		util.assertSource("oneFamilyWithOneFamilyMember");
	}
	
	// TODO:  Add test for different preference (so prefer child to parent)
	// TODO: Add a test where there is already a father (so a son has to be created even though creating parents is preferred)
	// TODO: Repeat these two tests for mothers and daughters 
}
