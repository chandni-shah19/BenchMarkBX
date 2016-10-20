package org.benchmarx.examples.familiestopersons.testsuite.level1.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.families.core.FamilyHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class FamiliesDeltas {

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
	 * Test for agreed upon starting state.
	 * Expect root elements of both source and target models.
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		
		//------------
		tool.initiateSynchronisationDialogue();
		//------------
		
		util.assertSource("rootElementFamilies");
		util.assertTarget("rootElementPersons");
	}
	
	/**
	 * Test for creation of a single family in an empty root container.
	 * Expected: Nothing changes in the person model.
	 */
	@Test
	public void testCreateFamily()
	{
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		//------------
		
		util.assertSource("oneFamily");
		util.assertTarget("personsForOneFamily");
	}	
	
	/**
	 * Test for creation of a single family member (a father) in the only existing family.
	 * Expect the creation of new male person in the persons model, with full name consisting of the first name and family name of the associated family member.
	 */
	@Test
	public void testCreateFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		//------------
		
		util.assertSource("oneFamilyWithOneFamilyMember");
		util.assertTarget("PersonWithOneMaleMember");
	}
}
