package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.families.core.FamilyHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;

import Families.FamilyRegister;
import Persons.PersonRegister;

import org.junit.Test;

public class FamiliesDeltaLevel2_IncrWocStAu {
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
	 * Test for creation of a multiple family members in to the existing family.
	 * Expect the creation of multiple person either male or female associated to the family member.
	 */
	@Test
	public void testCreateMultiFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		util.assertSource("FamilyWithMultiFamilyMember");
		util.assertTarget("PersonWithMultiMember");
	}
	
	/**
	 * Test for creation of new family with family members.
	 * Expect the creation of multiple person either male or female corresponding to the family member.
	 */
	@Test 
	public void testNewFamilyWithMultiMembers(){
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		util.assertSource("NewFamilyWithMembers");
		util.assertTarget("PersonsMulti");
	}
	
}
