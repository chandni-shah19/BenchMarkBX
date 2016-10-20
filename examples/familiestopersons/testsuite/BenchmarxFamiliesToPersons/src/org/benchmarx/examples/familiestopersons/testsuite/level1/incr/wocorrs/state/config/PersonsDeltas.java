package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wocorrs.state.config;

import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.persons.core.PersonHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class PersonsDeltas {
	private BXTool<FamilyRegister, PersonRegister, Decisions> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil<FamilyRegister, PersonRegister, Decisions> util;
	private PersonHelper helperPerson;
	
	@Before
	public void initialise() {
		tool = new EMoflonFamiliesToPersons();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		helperPerson = new PersonHelper();
		util = new BenchmarxUtil<>(familiesComparator, personsComparator, tool);
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
	
	// TODO: Add a test where there is already a father (so a son has to be created even though creating parents is preferred)
	// TODO: Repeat these two tests for mothers and daughters 
	
	/**
	 * Test for changing the birthday of the person.
	 * Expected : Nothing changes in the families model.
	 */
	@Test
	public void testBirthdayChange()
	{
		tool.initiateSynchronisationDialogue();
			
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		util.configure();
		
		//-----------------------------
		tool.performAndPropagateTargetEdit((helperPerson::birthdayChangeOfHomer));
		//-----------------------------
		
		util.assertTarget("PersonBirthdayChange");
		util.assertSource("oneFamilyWithOneFamilyMember");
	}

	
}
