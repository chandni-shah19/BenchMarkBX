package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wocorrs.delta.config;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class RenamingPersonsWithDecisions extends FamiliesToPersonsTestCase {
	
	public RenamingPersonsWithDecisions(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for changing a person's family name.
	 * Expect the person to be associated with another family as the family name does not fit anymore.
	 * In this case a fitting family does not exist, so a new family must be created.
	 * 
	 * Classification: incr-wocorr-delta-config
	 * incr: renaming persons family name requires old consistent state as it replace old member name with new one in families model.
	 * wocorr: it's possible to guess, as only single person is available with this name and the related member's name has to be renamed in the families model 
	 *         Also, fitting family does not exist, so a new family must be created which is quite clear. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * config: here decision has to be made weather member has to be created as child or parent in to the new family.
	 */
	@Test
	public void testFamilyNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
			
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfLisa);
		//----------------

		util.assertTarget("PersonFamilyNameChange");
		util.assertSource("MemberFamilyNameChange");
	}
}
