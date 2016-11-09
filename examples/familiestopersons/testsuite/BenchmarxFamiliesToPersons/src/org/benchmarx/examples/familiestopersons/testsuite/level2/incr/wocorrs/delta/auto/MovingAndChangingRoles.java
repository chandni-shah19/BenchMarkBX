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
	 * <b>Test</b> for family member moved to new family, i.e., daughter marries and is registered under a new family.
	 * <p>
	 * <b>Expect</b> the family name of person to change appropriately in the person model.
	 * <p>
	 * <b>Classification</b>: incr-wocorr-delta-auto
	 * <ul>
	 * <li><b>incr</b>: moving the family member requires old consistent state as
	 * old person register is required to avoid losing birthdays.
	 * <li><b>wocorr</b>: it's possible to guess required correspondences as full names of persons are unique (in this example).
	 * <li><b>delta</b>: moving is delta bases as it cannot be distinguished from combined deletion and creation.
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
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
	 * <b>Test</b> for family member role change: here from father to son.
	 * <p>
	 * <b>Expect</b> nothing has to change in the persons model (person remains male).
	 * <p>
	 * <b>Classification</b>: incr-wocorr-delta-auto
	 * <ul>
	 * <li><b>incr</b>: changing the family member role requires old consistent state as
	 * old person register is required to avoid losing birthdays.
	 * <li><b>wocorr</b>: it's possible to guess required correspondences as full names of persons are unique (in this example).
	 * <li><b>delta</b>: changing is delta bases as it cannot be distinguished from combined deletion and creation.
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
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
	 * <b>Test</b> for family member role change: here from mother to daughter.
	 * <p>
	 * <b>Expect</b> nothing has to be changes in the persons model (person remains female).
	 * <p>
	 * <b>Classification</b>: Analogous to @link {@link #testFamilyMemberRoleChangeFatherToSon()}
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
	 * <b>Test</b> for family member role change: here from father to mother.
	 * <p>
	 * <b>Expect</b> Changes in the persons model from male to female.
	 * <p>
	 * <b>Classification</b>: Analogous to as @link {@link testFamilyMemberRoleChangeFatherToSon()}
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
	 * <b>Test</b> for family member role change: here from son to mother.
	 * <p>
	 * <b>Expect</b> Changes in the persons model from male to female.
	 * <p>
	 * <b>Classification</b>: Analogous to as @link {@link testFamilyMemberRoleChangeFatherToSon()}
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
