package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wcorrs.delta.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class RenamingPersons extends FamiliesToPersonsTestCase {
	
	public RenamingPersons(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for changing a person's first name.
	 * Expected: only the first name of the corresponding member in the families model is to be changed.
	 */
	@Test
	public void testFirstNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::firstNameChangeOfHomer);
		//----------------
		
		util.assertTarget("PersonNameChange");
		util.assertSource("MemberNameChange");
	}
	
	/**
	 * Test for changing a person's full name.
	 * Expect the same behaviour as {@#testFamilyNameChangePerson} and {@#testFirstNameChangePerson()}
	 */
	@Test
	public void testFullNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::fullNameChangeOfHomer);
		//----------------
		
		util.assertTarget("PersonFullNameChange");
		util.assertSource("MemberFullNameChange");
	}
}
