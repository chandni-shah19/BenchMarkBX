package org.benchmarx.examples.familiestopersons.testsuite.level3_n.incr.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class CreateMultiFamilyMembers extends FamiliesToPersonsTestCase {
	
	public CreateMultiFamilyMembers(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for creation of multiple family members in an existing family.
	 * Expect the creation of multiple persons (male/female fittingly) associated to the new family members.
	 * 
	 * Classification: incr-wocorr-state-auto
	 * incr: creating member requires old consistent state.
	 * wocorr: it's possible to guess, weather member has to be created as male or female in the persons model.  
	 * state: its possible to determine, old and new state of the families model. 
	 * auto: there is no decision has to be made, as its clear what has to be created.
	 */
	@Test
	public void testCreateMultiFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		//------------
		
		util.assertSource("FamilyWithMultiFamilyMember");
		util.assertTarget("PersonWithMultiMember");
	}
	
	/**
	 * Test for creation of a new family with new family members.
	 * Expect the creation of multiple persons (male/female fittingly) corresponding to the family member.
	 * 
	 * Classification same as @link #testCreateMultiFamilyMember()
	 */
	@Test 
	public void testNewFamilyWithMultiMembers(){
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		//------------
		
		util.assertSource("NewFamilyWithMembers");
		util.assertTarget("PersonsMulti");
	}
	
}
