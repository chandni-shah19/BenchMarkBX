package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class RenamingFamily  extends FamiliesToPersonsTestCase{

	public RenamingFamily(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * Test for name change of an empty family i.e, family without family members.
	 * Expect nothing has to be change in the persons model.
	 * 
	 * Classification: incr-wocorr-state-auto
	 * incr: renaming family name requires old consistent state.
	 * wocorr: easily can apply default strategy and possible to guess, as only one family is available with this name and nothing has to be renamed in the persons model. 
	 * state: in this case renaming is state base, as it's clear nothing has to be change in persons model.
	 * auto: there is no decision has to be made, as nothing has to be change in persons model.
	 */
	@Test
	public void testFamilyNameChangeOfEmpty()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyNameSimpsonChangeEmpty);
		//------------
				
		util.assertSource("NameChangeFamilyEmpty");
		util.assertTarget("NameChangePersonEmpty");
	}


}
