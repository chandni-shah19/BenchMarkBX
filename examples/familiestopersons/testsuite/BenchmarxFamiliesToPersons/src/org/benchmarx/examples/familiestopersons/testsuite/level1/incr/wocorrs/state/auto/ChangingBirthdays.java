package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wocorrs.state.auto;

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
	 * Expected : Nothing has to be change in the families model.
	 * 
	 * Classification: incr-wocorr-state-auto
	 * incr: changing persons birthday requires old consistent state.
	 * wocorr: it's possible to guess, as only single person is available with this name and birthday is not part of families model so nothing has to be change there which is quite clear. 
	 * state: here renaming is state base, as it's clear nothing has to be change in families model.
	 * auto: there is no decision has to be made, as nothing has to be change in families model.
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
