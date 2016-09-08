package org.benchmarx.familiestopersons;

import java.util.List;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;

import Families.FamiliesFactory;
import Families.Family;
import Families.FamilyMember;
import Families.FamilyRegister;
import Persons.PersonRegister;
import Persons.PersonsFactory;
import Persons.Person;
import Persons.Male;
import Persons.Female;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

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
}
