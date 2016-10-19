package org.benchmarx.examples.familiestopersons.testsuit.level1.batch.wocorrs.state.auto;

import org.benchmarkx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.families.core.FamilyHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class FamiliesDelta_Batch {

	private BXTool<FamilyRegister, PersonRegister, Decisions> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil<FamilyRegister, PersonRegister, Decisions> util;
	private FamilyHelper helperFamily;
	
	@Before
	public void initialise() {
		tool = new EMoflonFamiliesToPersons();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		helperFamily = new FamilyHelper();
		util = new BenchmarxUtil<>(familiesComparator, personsComparator, tool);
	}
	
	/**
	 * Expect root elements of both source and target models. 
	 *
	 */
	@Test
	public void testInitialiseSynchronisation() // Batch/WoCorr as starting from the scratch with empty model i.e. only root elements
	{
		tool.initiateSynchronisationDialogue();

		util.assertSource("rootElementFamilies");
		util.assertTarget("rootElementPersons");
	}
	
	/**
	 * Test for creation of a single family in an empty root container.
	 * Expected: Nothing changes to the person model .
	 */
	@Test
	public void testCreateFamily() // WoCorr/auto/state
	{
		tool.initiateSynchronisationDialogue();

		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		util.assertSource("oneFamily");
		util.assertTarget("personsForOneFamily");
	}	
	
	/**
	 * Test for creation of a single family member in to the existing family.
	 * Expect the creation of new person(male or female) in the person model, with full name consists of the first name and family name of the associated family member.
	 *  For family members associated via a father or son association to the family a Male object is created, 
	 *  for mothers and daughters a Female object respectively.
	 */
	@Test
	public void testCreateFamilyMember() // WoCorr/auto/state
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		util.assertSource("oneFamilyWithOneFamilyMember");
		util.assertTarget("PersonWithOneMaleMember");
	}

}
