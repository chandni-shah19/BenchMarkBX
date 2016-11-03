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
	 * Test for deletion of a single family member. (where two members have same name i.e. mother and daughter, delete one of them)
	 * Expect the associated person to be deleted from the persons model.
	 * 
	 * Classification: incr-wcorr-state-auto
	 * incr: deleting family member requires old consistent state.
	 * wcorr: it's impossible to guess, as multiple member have same name and which person has to be deleted in the persons model.
	 * state: its possible to determine, old and new state of the persons model. 
	 * auto: there is no decision has to be made, as it's a clear what has to be deleted.
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
	 * Test for deletion of a single (father) family member. (where two members have same name i.e. father and son, delete father)
	 * Expect the associated person to be deleted from the persons model.
	 * 
	 * Classification same as @link {@link #testDeleteFamilyMemberOfSamename()}
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
