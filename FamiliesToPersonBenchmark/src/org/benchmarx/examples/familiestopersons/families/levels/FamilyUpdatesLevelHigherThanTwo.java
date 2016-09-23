package org.benchmarx.examples.familiestopersons.families.levels;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.families.FamilyHelper;
import org.benchmarx.examples.familiestopersons.persons.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

/**
 * This class test the possible updates (higher than level 2) for the Family Model .
 */
public class FamilyUpdatesLevelHigherThanTwo {

	private BXTool<FamilyRegister, PersonRegister, Decisions> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil<FamilyRegister, PersonRegister, Decisions> util;
	private FamilyHelper helperFamily;

	@Before
	public void initialise() {
		tool = new EMoflon();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		helperFamily = new FamilyHelper();
		util = new BenchmarxUtil<>(familiesComparator, personsComparator, tool);
	}

	/**
	 * Test for creation of a multiple family members in to the existing family.
	 * Expect the creation of multiple person either male or female associated to the family member.
	 */
	@Test
	public void testCreateMultiFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		util.assertSource("FamilyWithMultiFamilyMember");
		util.assertTarget("PersonWithMultiMember");
	}
	
	/**
	 * Test for creation of new family with family members.
	 * Expect the creation of multiple person either male or female corresponding to the family member.
	 */
	@Test 
	public void testNewFamilyWithMultiMembers(){
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		util.assertSource("NewFamilyWithMembers");
		util.assertTarget("PersonsMulti");
	}
	
	/**
	 * Test for deletion of family.
	 * Expected : Delete all corresponding Persons in the Persons Model.
	 */
	@Test
	public void testDeleteFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyBachchan);
		util.assertSource("DeleteFamily");
		util.assertTarget("DeleteAllPerson");		
	}
}
