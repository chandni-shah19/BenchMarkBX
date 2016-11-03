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
	 * 
	 * Classification: batch-wocorr-state-auto
	 * batch: creation of female and male person from scratch so no need for old consistent state.
	 * wocorr: easily can apply default strategy and possible to guess, which member has to be created as child or parent in to new or existing family according to decisions made. 
	 * state: it is possible to guess, based on the current state.
	 * config: here decision has to be made, weather person has to created as child or parent in new or existing family.
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
	 * 
	 * Classification same as @link {@link #testCreateMultiPersonPrefTT()}
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
	 * 
	 * Classification same as @link {@link #testCreateMultiPersonPrefTT()}
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
	 * 
	 * Classification same as @link {@link #testCreateMultiPersonPrefTT()}
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
