package org.benchmarx.examples.familiestopersons.testsuite.level3_n.batch.wocorrs.state.config;

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
	 * Test for creating multiple persons together.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parents to children, and existing families to creating new ones
	 */
	@Test
	public void testCreateMultiPersonPrefTT() {
		tool.initiateSynchronisationDialogue();
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
						.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::createHomer)
			    .andThen(helperPerson::createMarge));
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		//----------------
		
		util.assertTarget("PersonMultiMembers");
		util.assertSource("FamiliesMultiMembers");
	}
	
	/**
	 * Test for creating multiple persons together.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer children to parent, and existing families to creating new ones
	 */
	@Test
	public void testCreateMultiPersonWithDiffPrefFT() {
		tool.initiateSynchronisationDialogue();
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false)
						.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::createLisa)
			    .andThen(helperPerson::createBart));
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		//----------------
		
		util.assertTarget("PersonMultiMembersPref");
		util.assertSource("FamiliesMultiMembersPref");
	}
	
	/**
	 * Test for creating multiple persons together.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parent to children, and creating new ones to existing families 
	 */
	@Test
	public void testCreateMultiPersonWithDiffPrefTF() {
		tool.initiateSynchronisationDialogue();
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
						.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::createHomer)
			    .andThen(helperPerson::createMarge));
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		//----------------
		
		util.assertTarget("PersonMultiMembersPrefTF");
		util.assertSource("FamiliesMultiMembersPrefTF");
	}
	
	/**
	 * Test for creating multiple persons together.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer children to parent, and creating new ones to existing families
	 */
	@Test
	public void testCreateMultiPersonWithDiffPrefFF() {
		tool.initiateSynchronisationDialogue();
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false)
						.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::createLisa)
			    .andThen(helperPerson::createBart));
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		//----------------
		
		util.assertTarget("PersonMultiMembersPrefFF");
		util.assertSource("FamiliesMultiMembersPrefFF");
	}
}
