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


public class FamiliesDelta_IncrWocDelAu {

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
	 * Test for family-name change of the family member.
	 * Expect the change in the family name in the full name of all associated family members in the person model, 
	 * by replacing the old family name with the new one.
	 */
	@Test
	public void testFamilyNameChange() // incr/wocorr/delta/auto
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyNameSimpsonChange);
		util.assertSource("NameChangeFamily");
		util.assertTarget("NameChangePerson");
	}
	
	/**
	 * Test for family member role change, from father to son or from mother to daughter.
	 * Expected :Nothing changes to the person model, when role changes from father to son or mother to daughter.
	 * Changes in person model expected only if role change from mother to father or son and father to daughter or mother, i.e. when gender changes
	 */
	@Test
	public void testFamilyMemberRoleChange() // incr/wocorr/delta/auto
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyFatherHomerRoleChangeToSon);
		util.assertSource("RoleChangeFamilyMember");
		util.assertTarget("NoChangePerson");
	}

}
