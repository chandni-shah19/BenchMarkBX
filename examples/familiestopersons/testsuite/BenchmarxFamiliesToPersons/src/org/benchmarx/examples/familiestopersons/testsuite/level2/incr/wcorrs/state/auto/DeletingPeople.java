package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wcorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class DeletingPeople extends FamiliesToPersonsTestCase {
	
	public DeletingPeople(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for deleting a person.
	 * Expect the deletion of the corresponding family member in the families model.
	 */
	@Test
	public void testDeletePerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//---------------------- 
		tool.performAndPropagateTargetEdit(helperPerson::deleteMarge);
		//---------------------- 
		
		util.assertTarget("PersonDelete");
		util.assertSource("MemberDelete");
	}
	
	// TODO: Add test where the first created person is deleted (so delete Homer instead of Marge above)
}
