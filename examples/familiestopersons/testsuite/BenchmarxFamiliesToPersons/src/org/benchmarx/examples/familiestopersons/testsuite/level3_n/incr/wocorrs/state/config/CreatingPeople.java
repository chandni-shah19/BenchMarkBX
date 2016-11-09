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
	 * <b>Test</b> for creating multiple persons with different last names.
	 * <p>
	 * <b>Expect</b> the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parents to children, and existing families to creating new ones
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-config
	 * <ul>
	 * <li><b>incr</b>: family register is required to avoid information
	 * loss (mapping of (fe)males to mothers/fathers or daughters/sons).
	 * <li><b>wocorr</b>: assumption based on unique naming works here as there
	 * are no member with the same first name exist.
	 * <li><b>state</b>: its possible to determine that new member has to created in to associated family.
	 * <li><b>config</b>: there are two decisions to be made:
	 * (i) whether the member is to be created as a child or parent in their new family, and 
	 * (ii) if a new family is to be created or an existing suitable family is to be used.
	 * <ul>
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
	 * <b>Test</b> for creating multiple persons with different last names.
	 * <p>
	 * <b>Expect</b> the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer children to parent, and existing families to creating new ones
	 * <p>
	 * <b>Classification</b>: Analogous to @link {@link #testMultiPersonWithDiffFamilyNamesTT()}
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
	 * <b>Test</b> for creating multiple persons with different last names.
	 * <p>
	 * <b>Expect</b> the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer parent to children, and creating new ones to existing families 
	 * <p>
	 * <b>Classification</b> Analogous to @link {@link #testMultiPersonWithDiffFamilyNamesTT()}
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
	 * <b>Test</b> for creating multiple persons with different last names.
	 * <p>
	 * <b>Expect</b> the creation of corresponding family member in the families model with the given first names.
	 * Decision:  Prefer children to parent, and creating new ones to existing families
	 * <p>
	 * <b>Classification</b> Analogous to @link {@link #testMultiPersonWithDiffFamilyNamesTT()}
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
