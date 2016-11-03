package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wcorrs.delta.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class RenamingPersons extends FamiliesToPersonsTestCase {
	
	public RenamingPersons(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}
	
	/**
	 * Test for changing a person's first name. (where two persons have same name)
	 * Expected: only the first name of the corresponding member in the families model has to be changed.
	 * 
	 * Classification: incr-wcorr-delta-auto
	 * incr: renaming persons first name requires old consistent state as it replace old member name with new one in families model.
	 * wcorr: it's impossible to guess which family member has to be renamed in the families model as two persons have same name. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFirstNameChangePersonOfSameName() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherHomer)
				.andThen(helperFamily::createSimpsonFamilyMembers));
		tool.performAndPropagateTargetEdit(helperPerson::createOtherBart);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::firstNameChangeOfBart);
		//----------------
		
		util.assertTarget("PersonNameChangeOther");
		util.assertSource("MemberNameChangeOther");
	}
	
	/**
	 * Test for changing a person's full name. (where two persons have same name)
	 * Expected: first name of the corresponding member and family name has to be change in the families model
	 * 
	 * Classification: incr-wcorr-delta-auto
	 * incr: renaming persons full name requires old consistent state as it replace old member name and family name with new one in families model.
	 * wcorr: it's impossible to guess which family member has to be renamed in the families model as two persons have same name. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFullNameChangePersonOfSameName() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		tool.performAndPropagateTargetEdit(helperPerson::createOtherBart);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::fullNameChangeOfOtherBart);
		//----------------
		
		util.assertTarget("PersonFullNameChangeOther");
		util.assertSource("MemberFullNameChangeOther");
	}
}
