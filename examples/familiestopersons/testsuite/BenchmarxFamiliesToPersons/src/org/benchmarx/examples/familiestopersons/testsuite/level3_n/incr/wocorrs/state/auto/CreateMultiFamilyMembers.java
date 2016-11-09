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
	 * <b>Test</b> for creation of multiple family members in an existing family.
	 * <p>
	 * <b>Expect</b> the creation of multiple persons (male/female fittingly) associated to the new family members.
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-auto
	 * <ul>
	 * <li><b>incr</b>: creation of family and multiple family member requires old(er) state otherwise birthday would be loss for person register.
	 * <li><b>wocorr</b>: no need for traceability links, as it is easy to determine person has to be created with full name.
	 * <li><b>state</b>: easy to guess/compute the delta involved here based on the current state.
	 * <li><b>auto</b>:  propagation is deterministic so no choice involved.
	 * <ul>
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
	 * <b>Test</b> for creation of a new family with new family members.
	 * <p>
	 * <b>Expect</b> the creation of multiple persons (male/female fittingly) corresponding to the family member.
	 * <p>
	 * <b>Classification</b>: Analogous to @link {@link #testCreateMultiFamilyMember()}
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
