package org.benchmarx.examples.familiestopersons.testsuite.level3_n.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class CreatingNewFamiliesAndMembers extends FamiliesToPersonsTestCase {

	public CreatingNewFamiliesAndMembers(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for creation of a single family member (a father) in the only existing family.
	 * Expect the creation of new male person in the persons model, with full name consisting of the first name and family name of the associated family member.
	 * 
	 * Classification: batch-wocorr-state-auto
	 * batch: initial state of synchronization, creation of family and family member from scratch so no need for old consistent state.
	 * wocorr: easily can apply default strategy and possible to guess, person has to be created with family name and member name. 
	 * state: it is possible to guess, based on the current state.
	 * auto: there is no decision has to be made, as it's a clear what has to be created.
	 */
	@Test
	public void testCreateFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherHomer));
		//------------
		
		util.assertSource("oneFamilyWithOneFamilyMember");
		util.assertTarget("PersonWithOneMaleMember");
	}
	
}
