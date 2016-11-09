package org.benchmarx.examples.familiestopersons.testsuite.level3_n.incr.wocorrs.state.config;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class CreatingPeopleOfWithSameFamilyName extends FamiliesToPersonsTestCase {

	public CreatingPeopleOfWithSameFamilyName(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Test</b> for creating multiple persons together with same last name.
	 * <p>
	 * <b>Expect</b> the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parents to children, and existing families to creating new ones
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-config
	 * <ul>
	 * <li><b>incr</b>: family register is required to avoid information
	 * loss (mapping of (fe)males to mothers/fathers or daughters/sons).
	 * <li><b>wocorr</b>:  assumption based on unique naming works here as there
	 * are no member with the same first name exist.
	 * <li><b>state</b>: its possible to determine that new member has to created in to associated family. 
	 * <li><b>config</b>: there are two decisions to be made:
	 * (i) whether the member is to be created as a child or parent in their new family, and 
	 * (ii) if a new family is to be created or an existing suitable family is to be used.
	 * <ul>
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
	 * <b>Test</b> for creating multiple persons together.
	 * <p>
	 * <b>Expect</b> the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer children to parent, and existing families to creating new ones
	 * <p>
	 * <b>Classification</b> Analogous to {@link #testCreateMultiPersonPrefTT()}
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
	 * <b>Test</b> for creating multiple persons together.
	 * <p>
	 * <b>Expect</b> the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parent to children, and creating new ones to existing families 
	 * <p>
	 * <b>Classification</b> Analogous to {@link #testCreateMultiPersonPrefTT()}
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
	 * <b>Test</b> for creating multiple persons together.
	 * <p>
	 * <b>Expect</b> the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer children to parent, and creating new ones to existing families
	 * <p>
	 * <b>Classification</b> Analogous to {@link #testCreateMultiPersonPrefTT()}
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
