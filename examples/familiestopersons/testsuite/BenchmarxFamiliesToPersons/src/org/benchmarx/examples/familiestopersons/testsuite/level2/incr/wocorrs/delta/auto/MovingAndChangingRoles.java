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
	 * <b>Test</b> for moving a family member to a new family, i.e., daughter marries and is registered under a new family.
	 * <p>
	 * <b>Expect</b> the family name of the associated person to change appropriately in the person model.
	 * <p>
	 * <b>Classification</b>: incr-wocorr-delta-auto
	 * <ul>
	 * <li><b>incr</b>: moving the family member requires the old consistent state of the persons register to avoid losing birthdays.
	 * <li><b>wocorr</b>: it's possible to guess required correspondences as full names of persons are unique (in this example).
	 * <li><b>delta</b>: moving is delta-based as it cannot be distinguished from appropriate renaming.
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
	 * <b>Test</b> for a swap of family member roles via renaming of the family members (here father and son).
	 * <p>
	 * <b>Expect</b> appropriate male persons should be renamed.
	 * <p>
	 * <b>Classification</b>: incr-wocorr-delta-auto
	 * <ul>
	 * <li><b>incr</b>: requires old person register to avoid losing birthdays.
	 * <li><b>wocorr</b>: it's possible to guess required correspondences as full names of persons are unique (in this example).
	 * <li><b>delta</b>: renaming is delta-based as it cannot be distinguished from combined deletion and creation (of appropriate links).
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
	 */
	@Test
	public void testFamilyMemberSwapRoleFatherToSonViaRenaming() {
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
	 * Analogous to @link {@link #testFamilyMemberSwapRoleFatherToSonViaRenaming()}, but here for daughter <-> mother.
	 */
	@Test
	public void testFamilyMemberSwapRoleMotherToDaughterViaRenaming() {
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
	 * Analogous to @link {@link #testFamilyMemberSwapRoleFatherToSonViaRenaming()}, but here for mother <-> father.
	 * Note that the gender of the persons must be changed.
	 */
	@Test
	public void testFamilyMemberSwapRoleFatherToMotherViaRenaming() {
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
	 * Analogous to @link {@link #testFamilyMemberSwapRoleFatherToSonViaRenaming()}, but here for mother <-> son.
	 * Note that the gender of the persons must be changed.
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
