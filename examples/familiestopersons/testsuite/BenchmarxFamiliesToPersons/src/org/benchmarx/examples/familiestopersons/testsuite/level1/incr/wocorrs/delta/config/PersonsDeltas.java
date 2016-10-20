package org.benchmarx.examples.familiestopersons.testsuite.level1.incr.wocorrs.delta.config;

import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.persons.core.PersonHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class PersonsDeltas {

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
	 * Test for changing a person's first name.
	 * Expected: only the first name of the corresponding member in the families model is to be changed.
	 */
	@Test
	public void testFirstNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
					    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		util.configure();
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::firstNameChangeOfHomer);
		//----------------
		
		util.assertTarget("PersonNameChange");
		util.assertSource("MemberNameChange");
	}
	
	/**
	 * Test for changing a person's family name.
	 * Expect the person to be associated with another family as the family name does not fit anymore.
	 * In this case a new family must be created.
	 */
	@Test
	public void testFamilyNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
		   		        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		util.configure();
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::familyNameChangeOfLisa);
		//----------------

		util.assertTarget("PersonFamilyNameChange");
		util.assertSource("MemberFamilyNameChange");
	}
	
	// TODO: Add test for case where a fitting family already exists and must be used.
	// TODO: Add test for case where a fitting family already exists but creating a new family is preferred.
	
	/**
	 * Test for changing a person's full name.
	 * Expect the same behaviour as {@#testFamilyNameChangePerson} {@#testFirstNameChangePerson()}
	 */
	@Test
	public void testFullNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
		   		        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		util.configure();
			
		//----------------
		tool.performAndPropagateTargetEdit(helperPerson::fullNameChangeOfHomer);
		//----------------
		
		util.assertTarget("PersonFullNameChange");
		util.assertSource("MemberFullNameChange");
	}	
	
	/**
	 * Test for deleting a person.
	 * Expect the deletion of the corresponding family member in the families model.
	 */
	@Test
	public void testDeletePerson() {
		tool.initiateSynchronisationDialogue();
			
		util.configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
				        .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performAndPropagateTargetEdit(helperPerson::createMarge);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);
		util.configure();
		
		//---------------------- 
		tool.performAndPropagateTargetEdit(helperPerson::deleteMarge);
		//---------------------- 
		
		util.assertTarget("PersonDelete");
		util.assertSource("MemberDelete");
	}
	
	// TODO: Add test where the first created person is deleted (so delete Homer instead of Marge above)
}
