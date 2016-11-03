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
	 * Test for name change of a one family. (where two families have same name)
	 * Expect a change in the family name part of the full name of all associated family members in the persons model, 
	 * i.e., by replacing the old family name with the new one.
	 * 
	 * Classification: incr-wcorr-delta-auto
	 * incr: renaming family name requires old consistent state as it replace old family name with new one in persons model.
	 * wcorr: it's impossible to guess, as multiple families have same name and all the members which contains the same family name and unclear which family member is related to which family. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFamilyNameChangeOfSameFamilyName()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherGeorge);
		tool.performAndPropagateSourceEdit(helperFamily::createOtherSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyNameOtherSimpsonChange);
		//------------
		
		util.assertSource("NameChangeOtherFamily");
		util.assertTarget("NameChangeOtherPerson");
	}
	
	/**
	 * Test for first name change of the (father) family member (where two families have same name)
	 * Expect the person full name change by replacing the first name with the new one.
	 * 
	 * Classification: incr-wcorr-delta-auto
	 * incr: renaming member name requires old consistent state as it replace old first name with new one in persons model.
	 * wcorr: it's impossible to guess, as multiple families have same name and all the members which contains the same family name and unclear which family member is related to which family. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFamilyMemberNameChangeFatherOfSameFamilyName()
	{	
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherGeorge);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyFatherGeorgeNameChange);
		//------------

		util.assertSource("NameChangeOtherFamilyMember");
		util.assertTarget("NameChangeOfOtherPerson");
	}
	
	/**
	 * Test for first name change of the (mother) family member (where two families have same name).
	 * Expect the person full name change by replacing the first name with the new one.
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: renaming member name requires old consistent state as it replace old first name with new one in persons model.
	 * wcorr: it's impossible to guess, as multiple families have same name and all the members which contains the same family name and unclear which family member is related to which family. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFamilyMemberNameChangeMotherOfSameFamilyName() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherGeorge);
		tool.performAndPropagateSourceEdit(helperFamily::createOtherSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyMotherJaneNameChange);
		//------------

		util.assertSource("NameChangeFamilyMemberOtherMother");
		util.assertTarget("NameChangeOfPersonOtherMother");
	}
	
	/**
	 * Test for first name change of the (daughter) family member (where two families have same name).
	 * Expect the person full name change by replacing the first name with the new one.
	 * 
	 * Classification: incr-wcorr-delta-auto
	 * incr: renaming member name requires old consistent state as it replace old first name with new one in persons model.
	 * wcorr: it's impossible to guess, as multiple families have same name and all the members which contains the same family name and unclear which family member is related to which family. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFamilyMemberNameChangeDaughterOfSameFamilyName() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherGeorge);
		tool.performAndPropagateSourceEdit(helperFamily::createOtherSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyDaughterJudyNameChange);
		//------------

		util.assertSource("NameChangeFamilyMemberOtherDaughter");
		util.assertTarget("NameChangeOfPersonOtherDaughter");
	}
	
	/**
	 * Test for first name change of the (Son) family member  (where two families have same name).
	 * Expect the person full name change by replacing the first name with the new one.
	 * 
	 * Classification: incr-wcorr-delta-auto
	 * incr: renaming member name requires old consistent state as it replace old first name with new one in persons model.
	 * wcorr: it's impossible to guess, as multiple families have same name and all the members which contains the same family name and unclear which family member is related to which family. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFamilyMemberNameChangeSonOfSameFamilyName() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherGeorge);
		tool.performAndPropagateSourceEdit(helperFamily::createOtherSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familySonElroyNameChange);
		//------------

		util.assertSource("NameChangeFamilyMemberOtherSon");
		util.assertTarget("NameChangeOfPersonOtherSon");
	}
}
