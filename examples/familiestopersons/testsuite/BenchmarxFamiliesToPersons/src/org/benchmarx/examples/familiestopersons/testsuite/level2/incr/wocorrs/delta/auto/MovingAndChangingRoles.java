package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wocorrs.delta.auto;

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
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: moving and changing the role of family member requires old consistent state as it replace old family name with new one in persons model either as male or female according to its role.
	 * wocorr: it's possible to guess, as only one member with this name is available and member which contains this family name has to be renamed in the persons model which is clear. 
	 * delta: here it delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFamilyMemberMovesToNewFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createBachchanFamily)
			       .andThen(helperFamily::createFatherAmitabh));
		tool.performAndPropagateSourceEdit(helperFamily::createOtherRemainingMembersInFamilyBachchan);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::moveDaughterToMotherOfNewFamily);
		//------------
		
		util.assertSource("FamilyMemberWithDiffFamily");
		util.assertTarget("PersonsFirstNameChange");
	}
	
	/**
	 * Test for family member role change: here from father to son.
	 * Expected: Nothing changes in the persons model (person remains male).
	 * 
	 * Classification same as @link {@link #testFamilyMemberMovesToNewFamily()}
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
	 * 
	 * Classification same as @link {@link #testFamilyMemberMovesToNewFamily()}
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
	 * 
	 * Classification same as @link {@link #testFamilyMemberMovesToNewFamily()}
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
	 * 
	 * Classification same as @link {@link #testFamilyMemberMovesToNewFamily()}
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
