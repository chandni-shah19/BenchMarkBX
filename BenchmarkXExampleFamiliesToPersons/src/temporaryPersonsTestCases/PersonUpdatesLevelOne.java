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
 * This class test the possible updates (level 1) for the Person Model .
 */
public class PersonUpdatesLevelOne {

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
	 * Expect root elements of both source and target models.
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		tool.initiateSynchronisationDialogue();
				
		util.assertTarget("rootElementPersons");
		util.assertSource("rootElementFamilies");
	}
	
	/**
	 * Test for changing the person's first name.
	 * Expected : only the first name in the Families Model has to be changed
	 */
	@Test
	public void testFirstNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
					    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::firstNameChangeOfHomer);
		util.assertTarget("PersonNameChange");
		util.assertSource("MemberNameChange");
	}
	
	/**
	 * Test for changing the person's family name.
	 * Expect the person has to be associated with another family as the family name does not fit anymore.
	 * with decisions: if family name already exist, then prefer to add in to existing family.
	 */
	@Test
	public void testFamilyNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
		   		        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//----------------
		util.configure();
		tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfLisa);
		util.assertTarget("PersonFamilyNameChange");
		util.assertSource("MemberFamilyNameChange");
	}
	
	/**
	 * Test for changing the person's full name.
	 * Expect the same behavior as {@#testFamilyNameChangePerson} {@#testFirstNameChangePerson()}
	 */
	@Test
	public void testFullNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
		   		        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
			
		//----------------
		util.configure();
		tool.performAndPropagateTargetEdit(helperPerson::fullNameChangeOfHomer);
		util.assertTarget("PersonFullNameChange");
		util.assertSource("MemberFullNameChange");
	}
	
	/**
	 * Test for changing the birthday of the person.
	 * Expected : Nothing changes to the in the Families Models this information is not contained in to Family Model.
	 */
	@Test
	public void testBirthdayChange(){
		tool.initiateSynchronisationDialogue();
			
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		
		//-----------------------------
		tool.performAndPropagateTargetEdit((helperPerson::birthdayChangeOfHomer));
		util.assertTarget("PersonBirthdayChange");
		util.assertSource("oneFamilyWithOneFamilyMember");
	}
	
	/**
	 * Test for changing the person's family name.
	 * Expect the person has to be associated with another family as the family name does not fit anymore.
	 * with decisions: if family name already exist, then prefer to add in to existing family.
	 */
	@Test
	public void testNameChangeFamily() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
		   		        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		tool.performAndPropagateTargetEdit(helperPerson::createBart);
		
		tool.performAndPropagateTargetEdit(helperPerson::createAmitabh);
		tool.performAndPropagateTargetEdit(helperPerson::createJaya);
		tool.performAndPropagateTargetEdit(helperPerson::createAbhishek);
		tool.performAndPropagateTargetEdit(helperPerson::createShweta);
		
		//--------------------------
		tool.performAndPropagateTargetEdit((helperPerson::familyNameChangeShweta));
		
	}
}
