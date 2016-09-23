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
 * This class test the possible updates (level 1) for the Family Model .
 */
public class FamilyUpdatesLevelOne {

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
	 * Expect root elements of both source and target models.
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		tool.initiateSynchronisationDialogue();

		util.assertSource("rootElementFamilies");
		util.assertTarget("rootElementPersons");
	}
	/**
	 * Test for family-name change of the family member.
	 * Expect the change in the family name in the full name of all associated family members in the person model, 
	 * by replacing the old family name with the new one.
	 */
	@Test
	public void testFamilyNameChange()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyNameSimpsonChange);
		util.assertSource("NameChangeFamily");
		util.assertTarget("NameChangePerson");
	}
	
	/**
	 * Test for first name change of the family member.
	 * Expect the person full name change by replacing the first name with the new one.
	 */
	@Test
	public void testFamilyMemeberNameChange() {	
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyFatherHomerNameChange);
		util.assertSource("NameChangeFamilyMember");
		util.assertTarget("NameChangeOfPerson");
	}
}
