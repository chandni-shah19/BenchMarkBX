package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wocorrs.state.config;

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
	 * <b>Test</b> for creation of a single male person.
	 * <p>
	 * <b>Expect</b> the creation of a family member in the families model with the given first name.
	 * Decision: Create a parent (in this example a father) instead of a child (but only if possible, i.e., no double fathers or double mothers)
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-config
	 * <ul>
	 * <li><b>incr</b>: family register is required to avoid information
	 * loss (mapping of (fe)males to mothers/fathers or daughters/sons).
	 * <li><b>wocorr</b>:  assumption based on unique naming works here as there
	 * are no persons with the full name exist.
	 * <li><b>state</b>: its possible to determine that new person is created. 
	 * <li><b>config</b>: there is only one decisions to be made here: (i)
	 * whether the member is to be created as a child or parent in their new
	 * family.
	 * <ul>
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
		util.assertSource("OneFamilyWithOneFamilyMember");
	}
	
	/**
	 * <b>Test</b> for creation of a single male person.
	 * <p>
	 * <b>Expect</b> the creation of a family member in the families model with the given first name.
	 * Decision: Create a child (in this example a son) instead of a parent (father).
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-config
	 * Analogous to @link {@link #testCreatePerson()}
	 */
	@Test
	public void testCreatePersonSon()
	{
		tool.initiateSynchronisationDialogue();
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		// ---------------------------------
			
		util.assertTarget("PersonOneMaleMemberSon");
		util.assertSource("oneFamilyWithOneFamilyMemberSon");
	}
	
	/**
	 * <b>Test</b> for creation of a single female person.
	 * <p>
	 * <b>Expect</b> the creation of a family member in the families model with the given first name.
	 * Decision: Create a parent (here a mother) instead of a child (but only if possible, i.e., no double fathers or double mothers)
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-config
	 * Analogous to @link {@link #testCreatePerson()}
	 */
	@Test
	public void testCreatePersonMother()
	{
		tool.initiateSynchronisationDialogue();
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		// ---------------------------------
			
		util.assertTarget("PersonOneFemaleMemberMother");
		util.assertSource("oneFamilyWithOneFamilyMemberMother");
	}
	
	/**
	 * <b>Test</b> for creation of a single female person.
	 * <p>
	 * <b>Expect</b> the creation of a family member in the families model with the given first name.
	 * Decision: Create a child (here a daughter) instead of a parent (here a mother)
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-config
	 * Analogous to @link {@link #testCreatePerson()}
	 */
	@Test
	public void testCreatePersonDaughter()
	{
		tool.initiateSynchronisationDialogue();
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		// ---------------------------------
			
		util.assertTarget("PersonOneFemaleMemberDaughter");
		util.assertSource("oneFamilyWithOneFamilyMemberDaughter");
	}
	
	/**
	 * <b>Test</b> for creation of a single male person where already one male person is there. (i.e. parent is there)
	 * <p>
	 * <b>Expect</b> the creation of a family member in the families model with the given first name.
	 * Decision: Create a child (here a son) even though creating parents is preferred. 
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-config
	 * Analogous to @link {@link #testCreatePerson()} but here, there are two decisions to be made:
	 * (i) whether the member is to be created as a child or parent in their new family, and 
	 * (ii) if a new family is to be created or an existing suitable family is to be used.
	 */
	@Test
	public void testCreatePersonSonFatherExist()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		util.configure().makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		// ---------------------------------
			
		util.assertTarget("PersonMaleMemberExistSon");
		util.assertSource("oneFamilyWithOneFamilyMemberExistSon");
	}
	
	/**
	 * <b>Test</b> for creation of a single female person where already one female person is there. (i.e. parent is there)
	 * <p>
	 * <b>Expect</b> the creation of a family member in the families model with the given first name.
	 * Decision: Create a child (here a daughter) even though creating parents is preferred. 
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-config
	 * Analogous to @link {@link #testCreatePerson()} but here, there are two decisions to be made:
	 * (i) whether the member is to be created as a child or parent in their new family, and 
	 * (ii) if a new family is to be created or an existing suitable family is to be used.
	 */
	@Test
	public void testCreatePersonDaughterMotherExist()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createMotherMarge);
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		util.configure().makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		// ---------------------------------
			
		util.assertTarget("PersonFemaleMemberExistDaughter");
		util.assertSource("oneFamilyWithOneFamilyMemberExistDaughter");
	}
}
