package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wcorrs.state.auto;

import org.benchmarx.examples.familiestopersons.FamiliesToPersonsTestCase;
import org.junit.Test;

public class ChangingBirthdays extends FamiliesToPersonsTestCase {
	
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
