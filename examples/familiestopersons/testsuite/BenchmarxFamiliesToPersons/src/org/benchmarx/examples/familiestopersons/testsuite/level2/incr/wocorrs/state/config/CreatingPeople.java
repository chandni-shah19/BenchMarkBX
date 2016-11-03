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
	 * Test for creation of a single male person.
	 * Expect the creation of a family member in the families model with the given first name.
	 * Decision: Create a parent (here a father) instead of a child (but only if possible, i.e., no double fathers or double mothers)
	 * 
	 * Classification: incr-wocorr-state-config
	 * incr: creating persons requires old consistent state as birthday's of persons must be retained.
	 * wocorr: it's possible to guess, weather member has to be created as mother/daughter or father/son as only single person is created.  
	 * state: its possible to determine, old and new state of the families model. 
	 * config: here decision has to be made, member has to be created as parent in to the new family(new family, because there is no existing family available)
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
	 * Test for creation of a single male person.
	 * Expect the creation of a family member in the families model with the given first name.
	 * Decision: Create a child (here a son) instead of a parent (father).
	 * 
	 *  Classification: incr-wocorr-state-config
	 * incr: creating persons requires old consistent state as birthday's of persons must be retained.
	 * wocorr: it's possible to guess, weather member has to be created as mother/daughter or father/son as only single person is created.  
	 * state: its possible to determine, old and new state of the families model. 
	 * config: here decision has to be made, member has to be created as child in to the new family(new family, because there is no existing family available)
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
	 * Test for creation of a single female person.
	 * Expect the creation of a family member in the families model with the given first name.
	 * Decision: Create a parent (here a mother) instead of a child (but only if possible, i.e., no double fathers or double mothers)
	 * 
	 * Classification: incr-wocorr-state-config
	 * incr: creating persons requires old consistent state as birthday's of persons must be retained.
	 * wocorr: it's possible to guess, weather member has to be created as mother/daughter or father/son as only single person is created.  
	 * state: its possible to determine, old and new state of the families model. 
	 * config: here decision has to be made, member has to be created as parent in to the new family(new family, because there is no existing family available)
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
	 * Test for creation of a single female person.
	 * Expect the creation of a family member in the families model with the given first name.
	 * Decision: Create a child (here a daughter) instead of a parent (here a mother)
	 * 
	 * Classification: incr-wocorr-state-config
	 * incr: creating persons requires old consistent state as birthday's of persons must be retained.
	 * wocorr: it's possible to guess, weather member has to be created as mother/daughter or father/son as only single person is created.  
	 * state: its possible to determine, old and new state of the families model. 
	 * config: here decision has to be made, member has to be created as child in to the new family(new family, because there is no existing family available)
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
	 * Test for creation of a single male person where already one male person is there. (i.e. parent is there)
	 * Expect the creation of a family member in the families model with the given first name.
	 * Decision: Create a child (here a son) even though creating parents is preferred. 
	 * 
	 * Classification: incr-wocorr-state-config
	 * incr: creating persons requires old consistent state as birthday's of persons must be retained.
	 * wocorr: it's possible to guess, weather member has to be created as mother/daughter or father/son as only single person is created.  
	 * state: its possible to determine, old and new state of the families model. 
	 * config: here decision has to be made, member has to be created as child in to the existing family(because there is existing family available)
	 */
	@Test
	public void testCreatePersonSonFatherExist()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		// ---------------------------------
			
		util.assertTarget("PersonMaleMemberExistSon");
		util.assertSource("oneFamilyWithOneFamilyMemberExistSon");
	}
	
	/**
	 * Test for creation of a single female person where already one female person is there. (i.e. parent is there)
	 * Expect the creation of a family member in the families model with the given first name.
	 * Decision: Create a child (here a daughter) even though creating parents is preferred. 
	 * 
	 * Classification: incr-wocorr-state-config
	 * incr: creating persons requires old consistent state as birthday's of persons must be retained.
	 * wocorr: it's possible to guess, weather member has to be created as mother/daughter or father/son as only single person is created.  
	 * state: its possible to determine, old and new state of the families model. 
	 * config: here decision has to be made, member has to be created as child in to the existing family(because there is existing family available)
	 */
	@Test
	public void testCreatePersonDaughterMotherExist()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createMotherMarge);
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		// ---------------------------------
			
		util.assertTarget("PersonFemaleMemberExistDaughter");
		util.assertSource("oneFamilyWithOneFamilyMemberExistDaughter");
	}
}
