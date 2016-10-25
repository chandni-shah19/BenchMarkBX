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
	 * Test for name change of a family.
	 * Expect no change in the persons model.
	 */
	@Test
	public void testFamilyNameChangeOfEmpty()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyNameSimpsonChangeEmpty);
		//------------
				
		util.assertSource("NameChangeFamilyEmpty");
		util.assertTarget("NameChangePersonEmpty");
	}
	
	/**
	 * Test for first name change of the family member (father).
	 * Expect the person full name change by replacing the first name with the new one.
	 */
	@Test
	public void testFamilyMemberNameChangeFather()
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
	
	/**
	 * Test for first name change of the family member (mother).
	 * Expect the person full name change by replacing the first name with the new one.
	 */
	@Test
	public void testFamilyMemberNameChangeMother() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyMotherMargeNameChange);
		//------------

		util.assertSource("NameChangeFamilyMemberMother");
		util.assertTarget("NameChangeOfPersonMother");
	}
	
	/**
	 * Test for first name change of the family member (Daughter).
	 * Expect the person full name change by replacing the first name with the new one.
	 */
	@Test
	public void testFamilyMemberNameChangeDaughter() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyDaughterLisaNameChange);
		//------------

		util.assertSource("NameChangeFamilyMemberDaughter");
		util.assertTarget("NameChangeOfPersonDaughter");
	}
	
	/**
	 * Test for first name change of the family member (Son).
	 * Expect the person full name change by replacing the first name with the new one.
	 */
	@Test
	public void testFamilyMemberNameChangeSon() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familySonBartNameChange);
		//------------

		util.assertSource("NameChangeFamilyMemberSon");
		util.assertTarget("NameChangeOfPersonSon");
	}
	
	
	// TODO: How about renaming a mother, son, daughter?
}
