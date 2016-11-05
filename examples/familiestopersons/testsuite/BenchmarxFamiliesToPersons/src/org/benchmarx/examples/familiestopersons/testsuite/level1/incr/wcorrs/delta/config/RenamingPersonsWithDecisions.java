package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wcorrs.delta.config;

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
	 * In this case fitting family already exists and must be used as this is preferred.
	 * 
	 * Classification: incr-wcorr-delta-config
	 * incr: renaming persons family name requires old consistent state as it replace old member name with new one in families model.
	 * wcorr: it's impossible to guess, as here fitting family already exists. So its unclear weather it has to be fitted in to existing family or new family has to be created.  
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * config: here two decision has to be made weather member has to be created as child or parent in to the new family or existing family.
	 */
	@Test
	public void testFamilyNameChangePersonToExist() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createBachchanFamily)
			       .andThen(helperFamily::createFatherAmitabh));
		tool.performAndPropagateSourceEdit(helperFamily::createOtherRemainingMembersInFamilyBachchan);
		
		tool.performAndPropagateSourceEdit(helperFamily::createNandaFamily);
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
						.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfShweta);
		//----------------
		
		util.assertTarget("PersonFamilyNameChangeToExist");
		util.assertSource("MemberFamilyNameChangeToExist");
	}
	
	/**
	 * Test for changing a person's family name.
	 * Expect the person to be associated with another family as the family name does not fit anymore.
	 * In this case a fitting family already exists but creating a new family is preferred.
	 * 
	 * Classification: incr-wcorr-delta-config
	 * incr: renaming persons family name requires old consistent state as it replace old member name with new one in families model.
	 * wcorr: it's impossible to guess, as here fitting family already exists. So its unclear weather it has to be fitted in to existing family or new family has to be created.  
	 * delta: renaming is mostly delta bases as it is impossible to decide weather it is renamed, deleted or recreated.
	 * config: here decision has to be made weather member has to be created as child or parent in to the new family or existing family.
	 */
	@Test
	public void testFamilyNameChangePersonToExistNew() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createBachchanFamily)
			       .andThen(helperFamily::createFatherAmitabh));
		tool.performAndPropagateSourceEdit(helperFamily::createOtherRemainingMembersInFamilyBachchan);
		
		tool.performAndPropagateSourceEdit(helperFamily::createNandaFamily);
		
		//----------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
						.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false);
		tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfShweta);
		//----------------
		
		util.assertTarget("PersonFamilyNameChangeToExistNew");
		util.assertSource("MemberFamilyNameChangeToExistNew");
	}
}
