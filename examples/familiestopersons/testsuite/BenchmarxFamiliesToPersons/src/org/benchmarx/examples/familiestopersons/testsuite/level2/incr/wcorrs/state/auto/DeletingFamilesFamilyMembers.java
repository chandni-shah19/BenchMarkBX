package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wcorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class DeletingFamilesFamilyMembers extends FamiliesToPersonsTestCase {

	public DeletingFamilesFamilyMembers(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Test</b> for deletion of a single family member, where two members have same name.
	 * In this case mother and daughter have same name.
	 * <p>
	 * <b>Expect</b> the associated person has to be deleted from the persons model.
	 * <p>
	 * <b>Classification</b>: incr-wcorr-state-auto
	 * <ul>
	 * <li><b>incr</b>: deleting family member requires the old consistent state as
	 * their birthdays would be otherwise lost.
	 * <li><b>wcorr</b>: traceability links are required as it is impossible to
	 * guess correctly which persons correspond to which family members, given
	 * that there are multiple persons with the exact same full name.
	 * <li><b>state</b>:  deleting is state based, as its possible to determine old and new state. 
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
	 */
	@Test
	public void testDeleteFamilyMemberOfSamename() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createMotherMarge);
		tool.performAndPropagateSourceEdit(helperFamily::createDaughterMarge);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyDaughterMarge);
		//------------
		
		util.assertSource("DeleteFamilyMemberOfSameName");
		util.assertTarget("DeletePersonSameName");
	}
	
	/**
	 * <b>Test</b> for deletion of a single family member, where two members have same name.
	 * In this case father and son have same name.
	 * <p>
	 * <b>Expect</b> the associated person has to be deleted from the persons model.
	 * <p>
	 * <b>Classification</b>: Analogous to @link {@link #testDeleteFamilyMemberOfSamename()}
	 */
	@Test
	public void testDeleteFamilyMemberHomerOfSamename() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createMotherMarge);
		tool.performAndPropagateSourceEdit(helperFamily::createSonHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilySonHomer);
		//------------
		
		util.assertSource("DeleteFamilyMemberSonHomer");
		util.assertTarget("DeletePersonSonHomer");
	}
}
