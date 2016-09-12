package org.benchmarx.familiestopersons;

import java.util.Date;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;

import Families.FamiliesFactory;
import Families.Family;
import Families.FamilyMember;
import Families.FamilyRegister;
import Persons.Person;
import Persons.PersonRegister;
import Persons.PersonsFactory;

public class CreateRootElements {

	private BXTool<FamilyRegister, PersonRegister> tool;
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

	// Possible updates in Family Model, i.e test cases for source edit
	
	@Test
	public void testInitialiseSynchronisation()
	{
		tool.initiateSynchronisationDialogue();

		// Expect root elements of both source and target models (FM1 and PM1)
		assertSource("rootElementFamilies");
		assertTarget("rootElementPersons");
	}
	
	@Test
	public void testCreateFamily() {
		
		tool.initiateSynchronisationDialogue();
		
		// Test creation of a single family in an empty root container (FM4)
		tool.performAndPropagateSourceEdit(this::createFamily);
		assertSource("oneFamily");
		assertTarget("personsForOneFamily");
	}	
	
	@Test
	public void testCreateFamilyMemeber(){
		
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createFamily);
		
		//Test creation of a family member (e.g. family father added in above created one family) (FM5)
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		assertSource("oneFamilyWithOneFamilyMember");
		assertTarget("PersonWithOneMaleMember");
	}
	
	@Test
	public void testCreateMultiFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createFamily);
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		
		//Test for creation of multiple family members (with new family register) (FM6) 
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		assertSource("FamilyWithMultiFamilyMember");
		assertTarget("PersonWithMultiMember");
	}
	
	@Test
	public void testFamilyNameChange()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createFamily);
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		
		//Test for family name of a family is changed (FM3)
		tool.performAndPropagateSourceEdit(this::familyNameChange);
		assertSource("NameChangeFamily");
		assertTarget("NameChangePerson");
	}
	
	@Test
	public void testFamilyMemeberNameChange() {	
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createFamily);
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		
		//Test for name of a family member is changed (FM2)
		tool.performAndPropagateSourceEdit(this::familyMemberNameChange);
		assertSource("NameChangeFamilyMember");
		assertTarget("NameChangeOfPerson");
	}
	
	@Test
	public void testFamilyMemberRoleChange() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createFamily);
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		
		//Test for role of a family member is changed (FM7)
		tool.performAndPropagateSourceEdit(this::familyMemberRoleChange);
		assertSource("RoleChangeFamilyMember");
		assertTarget("NoChangePerson");
	}
	
	@Test 
	public void testNewFamilyWithMultiMembers(){
		tool.initiateSynchronisationDialogue();
		
		//Test for new family creation with multiple family members (FM11)
		tool.performAndPropagateSourceEdit(this::newfamilyMultiMember);
		assertSource("NewFamilyWithMembers");
		assertTarget("PersonsMulti");
	}
	
	@Test
	public void testDeleteFamilyMember() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createFamily);
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		tool.performAndPropagateSourceEdit(this::newfamilyMultiMember);
		
		//Test for family member deletion (FM9)
		tool.performAndPropagateSourceEdit(this::deleteFamilyMember);
		assertSource("DeleteFamilyMember");
		assertTarget("DeletePerson");
	}
	
	@Test
	public void testDeleteFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createFamily);
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		tool.performAndPropagateSourceEdit(this::newfamilyMultiMember);
		
		//Test for family member deletion (FM10)
		tool.performAndPropagateSourceEdit(this::deleteFamily);
		assertSource("DeleteFamily");
		assertTarget("DeleteAllPerson");		
	}
	
	// Possible updates in Person Model, i.e test cases for target edit
	
	@Test
	public void testCreatePerson() {
		tool.initiateSynchronisationDialogue();
		
		// Test for new person is added. (PM4)
		tool.performAndPropagateTargetEdit(this::createPerson);
		assertTarget("PersonWithOneMaleMember");
		assertSource("oneFamilyWithOneFamilyMember");
	}
	
	/*
	@Test
	public void testBirthdayChange(){
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateTargetEdit(this::createPerson);
		
		//Test for birthday change of person (PM3)
		tool.performAndPropagateTargetEdit((this::birthdayChange));
	}*/
	
	@Test
	public void testCreateMultiPerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateTargetEdit(this::createPerson);
		
		//many people added, with different family name so other test cases can be tested  e.g if full name change for the person
		tool.performAndPropagateTargetEdit(this::createMultiPerson);
		assertTarget("PersonMultiMembers");
		assertSource("FamiliesMultiMembers");
		
	}
	
	@Test
	public void testFullNameChangePerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateTargetEdit(this::createPerson);
		tool.performAndPropagateTargetEdit(this::createMultiPerson);
		
		//Test for full name change.
		tool.performAndPropagateTargetEdit(this::nameChangePerson);
		assertTarget("PersonNameChange");
		assertSource("MemberNameChange");
	}
	
	private void assertSource(String path){
		familiesComparator.compare(util.loadExpectedModel(path), tool.getSourceModel());
	}
	
	private void assertTarget(String path){
		personsComparator.compare(util.loadExpectedModel(path), tool.getTargetModel());
	}

	private void createFamily(FamilyRegister root) {
		Family family = FamiliesFactory.eINSTANCE.createFamily();
		family.setName("Simpson");
		root.getFamilies().add(family);
	}
	
	private void createFamilyMember(FamilyRegister eObject){
		
		Family family = eObject.getFamilies().get(0);
		FamilyMember familyFather = FamiliesFactory.eINSTANCE.createFamilyMember();
		family.setFather(familyFather);
		familyFather.setName("Homer");
	}
	
	private void createMultiFamilyMember(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		
		FamilyMember familyMother = FamiliesFactory.eINSTANCE.createFamilyMember();
		family.setMother(familyMother);
		familyMother.setName("Marge");
		
		FamilyMember familySon = FamiliesFactory.eINSTANCE.createFamilyMember();
		familySon.setName("Bart");
		family.getSons().add(familySon);
		
		FamilyMember familyDaughterOne = FamiliesFactory.eINSTANCE.createFamilyMember();
		familyDaughterOne.setName("Lisa");
		family.getDaughters().add(familyDaughterOne);
		
		FamilyMember familyDaughterTwo = FamiliesFactory.eINSTANCE.createFamilyMember();
		familyDaughterTwo.setName("Maggie");
		family.getDaughters().add(familyDaughterTwo);
		
	}
	
	private void familyNameChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		family.setName("SimpsonS");
	}
	
	private void familyMemberNameChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		family.getFather().setName("HomerX");
		
	}
	
	private void familyMemberRoleChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		
		String familySonName = family.getSons().get(0).getName();
		String familyFatherName = family.getFather().getName();
		
		family.getFather().setName(familySonName);
		family.getSons().get(0).setName(familyFatherName);
	}
	
	private void newfamilyMultiMember(FamilyRegister eObject){
		Family family = FamiliesFactory.eINSTANCE.createFamily();
		family.setName("Bachchan");
		eObject.getFamilies().add(family);
		
		FamilyMember familyFather = FamiliesFactory.eINSTANCE.createFamilyMember();
		family.setFather(familyFather);
		familyFather.setName("Amitabh");
		
		FamilyMember familyMother = FamiliesFactory.eINSTANCE.createFamilyMember();
		family.setMother(familyMother);
		familyMother.setName("Jaya");
		
		FamilyMember familySon = FamiliesFactory.eINSTANCE.createFamilyMember();
		familySon.setName("Abhishek");
		family.getSons().add(familySon);
		
		FamilyMember familyDaughter = FamiliesFactory.eINSTANCE.createFamilyMember();
		familyDaughter.setName("Shweta");
		family.getDaughters().add(familyDaughter);
	}
	
	private void deleteFamilyMember(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(1);
		EcoreUtil.delete(family.getFather());
	}
	
	private void deleteFamily(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(1);
		EcoreUtil.delete(family);
	}
	
	//
	private void createPerson(PersonRegister eObject) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Simpson, Homer");
		eObject.getPersons().add(person);
		
	}
	
	@SuppressWarnings("unused")
	private void birthdayChange(PersonRegister eObject) {
		Person person = eObject.getPersons().get(0);
		@SuppressWarnings("deprecation")
		Date date1 = new Date(2011, 07, 3);
		
		
	}
	
	private void createMultiPerson(PersonRegister eObject) {
		Person person1 = PersonsFactory.eINSTANCE.createFemale();
		person1.setName("Simpson, Lisa");
		eObject.getPersons().add(person1);
		
		Person person2 = PersonsFactory.eINSTANCE.createFemale();
		person2.setName("Simpson, Marge");
		eObject.getPersons().add(person2);
	}
	
	private void nameChangePerson(PersonRegister eObject) {
		Person person = eObject.getPersons().get(0);
		person.setName("Simpson, HomerX");
	}
	
}
