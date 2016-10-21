package org.benchmarx.examples.familiestopersons.testsuite.level3_n.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
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
	
	// TODO: Test for creation of a larger family with all types of members
}
