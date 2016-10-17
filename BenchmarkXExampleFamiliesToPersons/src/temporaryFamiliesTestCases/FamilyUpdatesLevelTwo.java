package temporaryFamiliesTestCases;

import org.benchmarkx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.families.core.FamilyHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

/**
 * This class test the possible updates (level 2) for the Family Model.
 */
public class FamilyUpdatesLevelTwo {

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
	 * Test for creation of a single family in an empty root container.
	 * Expected: Nothing changes to the person model .
	 */
	@Test
	public void testCreateFamily() {
		tool.initiateSynchronisationDialogue();

		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		util.assertSource("oneFamily");
		util.assertTarget("personsForOneFamily");
	}	
	
	
	/**
	 * Test for creation of a single family member in to the existing family.
	 * Expect the creation of new person(male or female) in the person model, with full name consists of the first name and family name of the associated family member.
	 *  For family members associated via a father or son association to the family a Male object is created, 
	 *  for mothers and daughters a Female object respectively.
	 */
	@Test
	public void testCreateFamilyMember(){
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		util.assertSource("oneFamilyWithOneFamilyMember");
		util.assertTarget("PersonWithOneMaleMember");
	}
	
	/**
	 * Test for family member role change, from father to son or from mother to daughter.
	 * Expected :Nothing changes to the person model, when role changes from father to son or mother to daughter.
	 * Changes in person model expected only if role change from mother to father or son and father to daughter or mother, i.e. when gender changes
	 */
	@Test
	public void testFamilyMemberRoleChange() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::familyFatherHomerRoleChangeToSon);
		util.assertSource("RoleChangeFamilyMember");
		util.assertTarget("NoChangePerson");
	}
	
	/**
	 * Test for family member moved to new family, i.e. daughter is married and created a new family.
	 * Expected the family name of person changed in the person model.
	 */
	@Test
	public void testFamilyMemberDiffFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::moveDaughterToMotherOfNewFamily);
		util.assertSource("FamilyMemberWithDiffFamily");
		util.assertTarget("PersonsFirstNameChange");
	}

	/**
	 * Test for deletion of family member.
	 * Expect the associated person should be deleted from the person model.
	 */
	@Test
	public void testDeleteFamilyMember() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(helperFamily::createFatherHomer);
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(helperFamily::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::deleteFamilyFatherAmitabh);
		util.assertSource("DeleteFamilyMember");
		util.assertTarget("DeletePerson");
	}
}
