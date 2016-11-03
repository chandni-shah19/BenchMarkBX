package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wocorrs.delta.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class RenamingPerson extends FamiliesToPersonsTestCase {
	
	public RenamingPerson(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for changing a person's first name.
	 * Expected: only the first name of the corresponding member in the families model has to be changed.
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: renaming persons first name requires old consistent state as it replace old member name with new one in families model.
	 * wocorr: it's possible to guess, as only one person is available with this name and the related member's name has to be renamed in the families model which is clear. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
	 */
	@Test
	public void testFirstNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherHomer)
				.andThen(helperFamily::createSimpsonFamilyMembers));
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::firstNameChangeOfHomer);
		//----------------
		
		util.assertTarget("PersonNameChange");
		util.assertSource("MemberNameChange");
	}
	
	/**
	 * Test for changing a person's full name. (first person i.e., member which is created first in the family)
	 * Expected: first name of the corresponding member and family name has to be change in the families model
	 * 
	 * Classification: incr-wocorr-delta-auto
	 * incr: renaming persons full name requires old consistent state as it replace old member name and family name with new one in families model.
	 * wocorr: it's possible to guess, as only one person is available with this name and the related member's name has to be renamed in the families model which is clear. 
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * auto: there is no decision has to be made, as it's a clear what has to be renamed.
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
	
	/**
	 * Test for changing a person's full name. (second person i.e., member which is not created first in the family)
	 * Expected and Classification: same as @link {@link #testFullNameChangePerson()}
	 * 
	 */
	@Test
	public void testFullNameChangeSecondPerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::fullNameChangeOfBart);
		//----------------
		
		util.assertTarget("PersonFullNameChangeSecond");
		util.assertSource("MemberFullNameChangeSecond");
	}
}
