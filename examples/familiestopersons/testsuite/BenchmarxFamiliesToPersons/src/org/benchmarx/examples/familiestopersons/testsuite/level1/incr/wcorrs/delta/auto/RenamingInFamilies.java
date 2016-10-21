package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wcorrs.delta.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;


public class RenamingInFamilies extends FamiliesToPersonsTestCase {

	public RenamingInFamilies(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for name change of a family.
	 * Expect a change in the family name part of the full name of all associated family members in the persons model, 
	 * i.e., by replacing the old family name with the new one.
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
		//------------
		
		util.assertSource("NameChangeFamily");
		util.assertTarget("NameChangePerson");
	}
	
	// TODO: Renaming an empty family?
	
	/**
	 * Test for first name change of the family member.
	 * Expect the person full name change by replacing the first name with the new one.
	 */
	@Test
	public void testFamilyMemberNameChange()
	{	
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyFatherHomerNameChange);
		//------------

		util.assertSource("NameChangeFamilyMember");
		util.assertTarget("NameChangeOfPerson");
	}
	
	// TODO: How about renaming a mother, son, daughter?
}
