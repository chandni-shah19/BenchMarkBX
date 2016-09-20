package org.benchmarx.familiestopersons;

import java.util.Calendar;
import java.util.Date;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.benchmarx.core.Configurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.Person;
import Persons.PersonRegister;
import Persons.PersonsFactory;

public class BenchmarkTestsTargetDelta {

	private BXTool<FamilyRegister, PersonRegister, Configurator<Decisions>> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil util;
	
	@Before
	public void initialise() {
		tool = new EMoflon();
		util = new BenchmarxUtil();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
	}
	
	/**
	 * Expect root elements of both source and target models
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		tool.initiateSynchronisationDialogue();

		//------------
		
		assertSource("rootElementFamilies");
		assertTarget("rootElementPersons");
	}
	
	private void assertSource(String path){
		familiesComparator.compare(util.loadExpectedModel(path), tool.getSourceModel());
	}
	
	private void assertTarget(String path){
		personsComparator.compare(util.loadExpectedModel(path), tool.getTargetModel());
	}
	
	// Possible updates in Person Model, i.e test cases for target edit
	
		@Test
		public void testCreatePerson() {
			tool.initiateSynchronisationDialogue();
			
			// ---------------------------------
			configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
			tool.performAndPropagateTargetEdit(this::createHomer);
			
			assertTarget("PersonOneMaleMember");
			assertSource("oneFamilyWithOneFamilyMember");
		}

		private Configurator<Decisions> configure() {
			Configurator<Decisions> c = new Configurator<>();
			tool.setConfigurator(c);
			return c;
		}
		
		
		@Test
		public void testBirthdayChange(){
			tool.initiateSynchronisationDialogue();
			
			configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
			tool.performAndPropagateTargetEdit(this::createHomer);
			
			//-----------------------------
			tool.performAndPropagateTargetEdit((this::birthdayChangeOfHomer));
			assertTarget("PersonBirthdayChange");
			assertSource("oneFamilyWithOneFamilyMember");
		}
		
		@Test
		public void testCreateMultiPerson() {
			tool.initiateSynchronisationDialogue();
			configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
					   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
			tool.performAndPropagateTargetEdit(this::createHomer);
			
			//----------------
			
			tool.performAndPropagateTargetEdit(this::createMarge);
			tool.performAndPropagateTargetEdit(this::createLisa);
			
			assertTarget("PersonMultiMembers");
			assertSource("FamiliesMultiMembers");
		}
		
		@Test
		public void testFirstNameChangePerson() {
			tool.initiateSynchronisationDialogue();
			configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
					   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
			tool.performAndPropagateTargetEdit(this::createHomer);
			tool.performAndPropagateTargetEdit(this::createMarge);
			tool.performAndPropagateTargetEdit(this::createLisa);
			
			//----------------

			tool.performAndPropagateTargetEdit(this::firstNameChangeOfHomer);
			assertTarget("PersonNameChange");
			assertSource("MemberNameChange");
		}
		
		@Test
		public void testFamilyNameChangePerson() {
			tool.initiateSynchronisationDialogue();
			configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
			   		   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
			tool.performAndPropagateTargetEdit(this::createHomer);
			tool.performAndPropagateTargetEdit(this::createMarge);
			tool.performAndPropagateTargetEdit(this::createLisa);
			
			//----------------
			
			configure();
			tool.performAndPropagateTargetEdit(this::familyNameChangeOfLisa);
			assertTarget("PersonFamilyNameChange");
			assertSource("MemberFamilyNameChange");
		}
		
		@Test
		public void testFullNameChangePerson() {
			tool.initiateSynchronisationDialogue();
			configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
			   		   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
			tool.performAndPropagateTargetEdit(this::createHomer);
			tool.performAndPropagateTargetEdit(this::createMarge);
			tool.performAndPropagateTargetEdit(this::createLisa);
			
			//----------------
			configure();
			tool.performAndPropagateTargetEdit(this::fullNameChangeOfHomer);
			assertTarget("PersonFullNameChange");
			assertSource("MemberFullNameChange");
		}
		
		@Test
		public void testDeletePerson() {
			tool.initiateSynchronisationDialogue();
			
			
			configure().makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
					   .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true);
			tool.performAndPropagateTargetEdit(this::createHomer);
			tool.performAndPropagateTargetEdit(this::createMarge);
			tool.performAndPropagateTargetEdit(this::createLisa);
			
			//---------------------- 
			tool.performAndPropagateTargetEdit(this::deleteHomer);
			assertTarget("PersonDelete");
			assertSource("MemberDelete");
		}
	
		private void createHomer(PersonRegister eObject) {
			Person person = PersonsFactory.eINSTANCE.createMale();
			person.setName("Simpson, Homer");
			eObject.getPersons().add(person);
		}
		
		private void birthdayChangeOfHomer(PersonRegister eObject) {
			Person person = eObject.getPersons().get(0);
			Calendar cal = Calendar.getInstance();
			cal.set(2013, Calendar.JANUARY, 9, 10, 11, 12); 
			Date date = cal.getTime();
			person.setBirthday(date);
		}
		
		private void createMarge(PersonRegister register) {
			Person person = PersonsFactory.eINSTANCE.createFemale();
			person.setName("Simpson, Marge");
			register.getPersons().add(person);
		}
		
		private void createLisa(PersonRegister register){
			Person person = PersonsFactory.eINSTANCE.createFemale();
			person.setName("Simpson, Lisa");
			register.getPersons().add(person);
		}
		
		private void firstNameChangeOfHomer(PersonRegister eObject) {
			Person person = eObject.getPersons().get(0);
			person.setName("Simpson, HomerX");
		}
		
		private void familyNameChangeOfLisa(PersonRegister register) {
			Person person = register.getPersons().get(1);
			person.setName("SimpsonS, Lisa");
		}
		
		private void fullNameChangeOfHomer(PersonRegister register) {
			Person person = register.getPersons().get(0);
			person.setName("SimpsonS, HomerX");
		}
		
		private void deleteHomer(PersonRegister register) {
			Person person = register.getPersons().get(0);
			EcoreUtil.delete(person);
		}
}
