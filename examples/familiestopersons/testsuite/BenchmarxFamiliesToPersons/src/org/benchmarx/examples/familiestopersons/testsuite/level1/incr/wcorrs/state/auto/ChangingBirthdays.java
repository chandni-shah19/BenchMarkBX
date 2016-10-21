package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wcorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class ChangingBirthdays extends FamiliesToPersonsTestCase {
	
	public ChangingBirthdays(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for changing the birthday of a person.
	 * Expected : Nothing changes in the families model.
	 */
	@Test
	public void testBirthdayChange()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		
		//-----------------------------
		tool.performAndPropagateTargetEdit((helperPerson::birthdayChangeOfHomer));
		//-----------------------------
		
		util.assertTarget("PersonBirthdayChange");
		util.assertSource("OneFamilyWithOneFamilyMember");
	}
}
