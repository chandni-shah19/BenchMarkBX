package temporaryPersonsTestCases;

import org.benchmarkx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.persons.core.PersonHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

/**
 * This class test the possible updates (level 2) for the Person Model .
 */
public class PersonUpdatesLevelTwo {

	private BXTool<FamilyRegister, PersonRegister, Decisions> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil<FamilyRegister, PersonRegister, Decisions> util;
	private PersonHelper helperPerson;
	
	@Before
	public void initialise() {
		tool = new EMoflonFamiliesToPersons();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		helperPerson = new PersonHelper();
		util = new BenchmarxUtil<>(familiesComparator, personsComparator, tool);
	}
	
	/**
	 * Test for creation a single male person.
	 * Expect the creation of corresponding family member in the Families Model with the given first name.
	 */
	@Test
	public void testCreatePerson() {
		tool.initiateSynchronisationDialogue();
	
		// ---------------------------------
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
			
		util.assertTarget("PersonOneMaleMember");
		util.assertSource("oneFamilyWithOneFamilyMember");
	}

	/**
	 * Test for creating multiple persons together.
	 * Expect the creation of corresponding family member in the Families Model with the given first name, with prefer decisions.
	 */
	@Test
	public void testCreateMultiPerson() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
				        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		util.assertTarget("PersonMultiMembers");
		util.assertSource("FamiliesMultiMembers");
	}
	
	/**
	 * Test for deleting the person.
	 * Expect the deletion of the corresponding family member in the Families Model.
	 */
	@Test
	public void testDeletePerson() {
		tool.initiateSynchronisationDialogue();
			
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
				        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//---------------------- 
		util.configure();
		tool.performAndPropagateTargetEdit(helperPerson::deleteMarge);
		util.assertTarget("PersonDelete");
		util.assertSource("MemberDelete");
	}
	
	/**
	 * Test for deleting the first person.
	 * Expect the deletion of the corresponding family member in the Families Model.
	 */
	@Test
	public void testDeleteFirstPerson() {
		tool.initiateSynchronisationDialogue();
			
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
				        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//---------------------- 
		util.configure();
		tool.performAndPropagateTargetEdit(helperPerson::deleteHomer);
		util.assertTarget("PersonFirstDelete");
		util.assertSource("MemberFirstDelete");
	}
	
	/**
	 * Test for creating the multiple person.
	 * Expect the same result as {#testCreateMultiPerson()}.
	 */
	@Test
	public void testMultiPersonWithDiffFamilyNames() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
				        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		
		tool.performAndPropagateTargetEdit(helperPerson::createAmitabh);
		tool.performAndPropagateTargetEdit(helperPerson::createJaya);
		tool.performAndPropagateTargetEdit(helperPerson::createAbhishek);
		tool.performAndPropagateTargetEdit(helperPerson::createShweta);
			
		util.assertTarget("PersonsNewMulti");
		util.assertSource("familyMulti");
	}	
}
