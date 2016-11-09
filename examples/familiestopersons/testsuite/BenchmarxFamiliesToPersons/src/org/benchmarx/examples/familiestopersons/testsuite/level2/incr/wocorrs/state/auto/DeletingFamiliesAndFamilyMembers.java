package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;


public class DeletingFamiliesAndFamilyMembers extends FamiliesToPersonsTestCase {
	
	public DeletingFamiliesAndFamilyMembers(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Test</b> for deletion of a single family member, where member created as first.
	 * In this case father is created as first member.
	 * <p>
	 * <b>Expect</b> the associated person to be deleted from the persons model.
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-auto
	 * <ul>
	 * <li><b>incr</b>: deleting family member requires old consistent state as
	 * their birthdays would be otherwise lost.
	 * <li><b>wocorr</b>: it's possible to guess required correspondences as full names of persons are unique (in this example).
	 * associated person has to be deleted in the persons model which is clear.
	 * <li><b>state</b>: deleting is state based, as its possible to determine old and new state. 
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
	 */
	@Test
	public void testDeleteFamilyMember() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createSimpsonFamily)
			       							   .andThen(helperFamily::createFatherHomer));
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createBachchanFamily)
			       							   .andThen(helperFamily::createFatherAmitabh));
		tool.performAndPropagateSourceEdit(helperFamily::createOtherRemainingMembersInFamilyBachchan);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyFatherAmitabh);
		//------------
		
		util.assertSource("DeleteFamilyMember");
		util.assertTarget("DeletePerson");
	}
	
	/**
	 * <b>Test</b> for deletion of a single family member, where member created as first.
	 * In this case father is created as first member.
	 * <p>
	 * <b>Expect</b> the associated person to be deleted from the persons model.
	 * <p>
	 * <b>Classification</b>: Analogous to @link {@link #testDeleteFamilyMember()}
	 */
	@Test
	public void testDeleteFamilyMemberHomer() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createSimpsonFamily)
										       .andThen(helperFamily::createFatherHomer));
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyFatherHomer);
		//------------
		
		util.assertSource("DeleteFamilyMemberHomer");
		util.assertTarget("DeletePersonHomer");
	}
}
