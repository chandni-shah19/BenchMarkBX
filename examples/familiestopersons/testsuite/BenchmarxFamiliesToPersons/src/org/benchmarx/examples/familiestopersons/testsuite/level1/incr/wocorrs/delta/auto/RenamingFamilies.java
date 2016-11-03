package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wocorrs.delta.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class RenamingFamilies extends FamiliesToPersonsTestCase {

	public RenamingFamilies(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for name change of a family.
	 * Expect a change in the family name part of the full name of all associated family members in the persons model, 
	 * i.e., by replacing the old family name with the new one.
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: renaming family name requires old consistent state as it replace old family name with new one in persons model.
	 * wocorr: it's possible to guess, as only one family is available with this name and all the members which contains this family name has to be renamed in the persons model which is clear. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
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
	
	/**
	 * Test for first name change of the family member (father).
	 * Expect the person full name change by replacing the first name with the new one.
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: renaming member name requires old consistent state as it replace old first name with new one in persons model.
	 * wocorr: it's possible to guess, as only one member is available with this name and this member's first name has to be renamed in the persons model which is clear. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
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
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: renaming member name requires old consistent state as it replace old first name with new one in persons model.
	 * wocorr: it's possible to guess, as only one member is available with this name and this member's first name has to be renamed in the persons model which is clear. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
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
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: renaming member name requires old consistent state as it replace old first name with new one in persons model.
	 * wocorr: it's possible to guess, as only one member is available with this name and this member's first name has to be renamed in the persons model which is clear. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
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
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: renaming member name requires old consistent state as it replace old first name with new one in persons model.
	 * wocorr: it's possible to guess, as only one member is available with this name and this member's first name has to be renamed in the persons model which is clear. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
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
	
	

}
