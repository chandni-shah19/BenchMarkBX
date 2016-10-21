package org.benchmarx.examples.familiestopersons.testsuite.level3_n.batch.wocorrs.state.config;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class CreatingPeople extends FamiliesToPersonsTestCase {
	
	public CreatingPeople(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for creating multiple persons together.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parents to children, and existing families to creating new ones
	 */
	@Test
	public void testCreateMultiPerson() {
		tool.initiateSynchronisationDialogue();
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
						.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		//----------------
		
		util.assertTarget("PersonMultiMembers");
		util.assertSource("FamiliesMultiMembers");
	}
	
	//TODO:  Add same test for different preferences
}
