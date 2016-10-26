package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wcorrs.delta.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class MovingAndChangingRoles extends FamiliesToPersonsTestCase {
	
	public MovingAndChangingRoles(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for family member moved to new family, i.e., daughter marries and is registered under a new family.
	 * Expect the family name of person to change appropriately in the person model.
	 */
	@Test
	public void testFamilyMemberMovesToNewFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::moveDaughterToMotherOfNewFamily);
		//------------
		
		util.assertSource("FamilyMemberWithDiffFamily");
		util.assertTarget("PersonsFirstNameChange");
	}
	
	/**
	 * Test for family member role change: here from father to son.
	 * Expected: Nothing changes in the persons model (person remains male).
	 */
	@Test
	public void testFamilyMemberRoleChangeFatherToSon() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyFatherHomerRoleChangeToSon);
		//------------

		util.assertSource("RoleChangeFamilyMember");
		util.assertTarget("NoChangePerson");
	}
	
	/**
	 * Test for family member role change: here from mother to daughter.
	 * Expected: Nothing changes in the persons model (person remains female).
	 */
	@Test
	public void testFamilyMemberRoleChangeMotherToDaughter() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyMotherMargeRoleChangeToDaughterLisa);
		//------------

		util.assertSource("RoleChangeFamilyMemberMoToDau");
		util.assertTarget("NoChangePersonFemale");
	}
	
	/**
	 * Test for family member role change: here from father to mother.
	 * Expected: Changes in the persons model to male to female.
	 */
	@Test
	public void testFamilyMemberRoleChangeFatherToMother() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyFatherHomerRoleChangeToMotherMarge);
		//------------

		util.assertSource("RoleChangeFamilyMemberFaToMo");
		util.assertTarget("ChangePersonMToF");
	}
	
	/**
	 * Test for family member role change: here from son to mother.
	 * Expected: Changes in the persons model to male to female.
	 */
	@Test
	public void testFamilyMemberRoleChangeSonToMother() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familySonBartRoleChangeToMotherMarge);
		//------------

		util.assertSource("RoleChangeFamilyMemberSoToMo");
		util.assertTarget("ChangePersonMaToFe");
	}
	
}
