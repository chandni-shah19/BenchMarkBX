package org.benchmarx.examples.familiestopersons.testsuite.level3_n.incr.wcorrs.state.config;

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
	 * Expect the same result as {#testCreateMultiPerson()}.
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
	
	//TODO: Add same test for different preferences
	/**
	 * Test for creating multiple persons with different last names.
	 * Expect the same result as {#testCreateMultiPerson()}.
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
	 * Expect the same result as {#testCreateMultiPerson()}.
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
	 * Expect the same result as {#testCreateMultiPerson()}.
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
