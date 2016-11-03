package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
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
	 * 
	 * Classification: incr-wocorr-state-auto
	 * incr: deleting person requires old consistent state.
	 * wocorr: it's possible to guess which family member has to be deleted in the families model as only single persons have this name. 
	 * state: deleting is generally state based, it is easy to decide that it is deleted.
	 * auto: there is no decision has to be made, as it's a clear what has to be deleted.
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
	
	/**
	 * Test for deleting a person.
	 * Expect the deletion of the corresponding family member in the families model.
	 * Classification same as @link {@link #testDeletePerson()}
	 */
	@Test
	public void testDeleteFirstPerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//---------------------- 
		tool.performAndPropagateTargetEdit(helperPerson::deleteHomer);
		//---------------------- 
		
		util.assertTarget("PersonFirstDelete");
		util.assertSource("MemberFirstDelete");
	}
	
}
