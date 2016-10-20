package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wocorrs.delta.auto;

import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.families.core.FamilyHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;


public class FamiliesDeltas {

	private BXTool<FamilyRegister, PersonRegister, Decisions> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil<FamilyRegister, PersonRegister, Decisions> util;
	private FamilyHelper helperFamily;

	@Before
	public void initialise() {
		tool = new EMoflonFamiliesToPersons();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		helperFamily = new FamilyHelper();
		util = new BenchmarxUtil<>(familiesComparator, personsComparator, tool);
	}

	/**
	 * Test for name change of a family.
	 * Expect a change in the family name part of the full name of all associated family members in the persons model, 
	 * i.e., by replacing the old family name with the new one.
	 */
	@Test
	public void testFamilyNameChange()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyNameSimpsonChange);
		//------------
		
		util.assertSource("NameChangeFamily");
		util.assertTarget("NameChangePerson");
	}
}
