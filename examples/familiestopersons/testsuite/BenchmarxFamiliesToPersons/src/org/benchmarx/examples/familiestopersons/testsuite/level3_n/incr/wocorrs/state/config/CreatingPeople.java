package org.benchmarx.examples.familiestopersons.testsuite.level3_n.incr.wocorrs.state.config;

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
	 * Test for creating multiple persons with different last names.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parents to children, and existing families to creating new ones
	 * 
	 * Classification: incr-wocorr-state-config
	 * incr: creation of female and male person with different family names requires old consistent state.
	 * wocorr: easily can apply default strategy and possible to guess, which member has to be created as child or parent in to new or existing family according to decisions made. 
	 * state: it is possible to guess, based on the current state.
	 * config: here decision has to be made, weather person has to created as child or parent in new or existing family.
	 */
	@Test
	public void testMultiPersonWithDiffFamilyNamesTT() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
			
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
					    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		
		tool.performAndPropagateTargetEdit(helperPerson::createAmitabh);
		tool.performAndPropagateTargetEdit(helperPerson::createJaya);
		tool.performAndPropagateTargetEdit(helperPerson::createAbhishek);
		tool.performAndPropagateTargetEdit(helperPerson::createShweta);
		//----------------
			
		util.assertTarget("PersonsNewMulti");
		util.assertSource("familyMulti");
	}	
	
	/**
	 * Test for creating multiple persons with different last names.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer children to parent, and existing families to creating new ones
	 * 
	 * Classification same as @link {@link #testMultiPersonWithDiffFamilyNamesTT()}
	 */
	@Test
	public void testMultiPersonWithDiffFamilyNamesWithDiffPrefFT() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
			
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false)
					    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		
		tool.performAndPropagateTargetEdit(helperPerson::createAbhishek);
		tool.performAndPropagateTargetEdit(helperPerson::createShweta);
		//----------------
			
		util.assertTarget("PersonsNewMultiDiffPref");
		util.assertSource("familyMultiDiffPref");
	}	
	
	/**
	 * Test for creating multiple persons with different last names.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parent to children, and creating new ones to existing families 
	 * 
	 * Classification same as @link {@link #testMultiPersonWithDiffFamilyNamesTT()}
	 */
	@Test
	public void testMultiPersonWithDiffFamilyNamesWithDiffPrefTF() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
			
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
					    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false);
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		
		tool.performAndPropagateTargetEdit(helperPerson::createAmitabh);
		tool.performAndPropagateTargetEdit(helperPerson::createAbhishek);
		//----------------
			
		util.assertTarget("PersonsNewMultiDiffPrefTF");
		util.assertSource("familyMultiDiffPrefTF");
	}	
	
	/**
	 * Test for creating multiple persons with different last names.
	 * Expect the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer children to parent, and creating new ones to existing families
	 * 
	 * Classification same as @link {@link #testMultiPersonWithDiffFamilyNamesTT()}
	 */
	@Test
	public void testMultiPersonWithDiffFamilyNamesWithDiffPrefFF() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
			
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false)
					    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false);
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		
		tool.performAndPropagateTargetEdit(helperPerson::createAbhishek);
		tool.performAndPropagateTargetEdit(helperPerson::createShweta);
		//----------------
			
		util.assertTarget("PersonsNewMultiDiffPrefFF");
		util.assertSource("familyMultiDiffPrefFF");
	}	
}
