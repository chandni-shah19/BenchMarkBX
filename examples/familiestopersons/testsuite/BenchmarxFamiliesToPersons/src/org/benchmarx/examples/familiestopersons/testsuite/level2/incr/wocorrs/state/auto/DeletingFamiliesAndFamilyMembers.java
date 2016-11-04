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
	 * Test for deletion of a single family member.
	 * Expect the associated person to be deleted from the persons model.
	 * 
	 * Classification: incr-wocorr-state-auto
	 * incr: deleting family member requires old consistent state.
	 * wocorr: it's possible to guess, as only one family is available with this name and which person has to be deleted in the persons model which is clear.
	 * state: its possible to determine, old and new state of the persons model. 
	 * auto: there is no decision has to be made, as it's a clear what has to be deleted.
	 */
	@Test
	public void testDeleteFamilyMember() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyFatherAmitabh);
		//------------
		
		util.assertSource("DeleteFamilyMember");
		util.assertTarget("DeletePerson");
	}
	
	/**
	 * Test for deletion of a single family member (father).
	 * Expect the associated person to be deleted from the persons model.
	 * 
	 * Classification same as @link {@link #testDeleteFamilyMember()}
	 */
	@Test
	public void testDeleteFamilyMemberHomer() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createSimpsonFamily)
										       .andThen(helperFamily::createFatherHomer));
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		util.configure();
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyFatherHomer);
		//------------
		
		util.assertSource("DeleteFamilyMemberHomer");
		util.assertTarget("DeletePersonHomer");
	}
}
