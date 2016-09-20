package org.benchmarx.familiestopersons;

import static org.junit.Assert.assertTrue;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.benchmarx.core.Configurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;

import Families.FamiliesFactory;
import Families.Family;
import Families.FamilyMember;
import Families.FamilyRegister;
import Persons.PersonRegister;

/**
 * This class test the possible updates applied to the source model, i.e Family Model
 */
public class BenchmarkTestsSourceDelta {

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

		assertSource("rootElementFamilies");
		assertTarget("rootElementPersons");
	}
	
	/**
	 * Test for creation of a single family in an empty root container
	 */
	@Test
	public void testCreateFamily() {
		tool.initiateSynchronisationDialogue();

		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		assertSource("oneFamily");
		assertTarget("personsForOneFamily");
	}	
	
	/**
	 * Test for creation of a single family member in to the existing family
	 */
	@Test
	public void testCreateFamilyMember(){
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		
		//------------
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		assertSource("oneFamilyWithOneFamilyMember");
		assertTarget("PersonWithOneMaleMember");
	}
	
	/**
	 * Test for creation of a multiple family members in to the existing family
	 */
	@Test
	public void testCreateMultiFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(this::createSimpsonFamilyMembers);
		assertSource("FamilyWithMultiFamilyMember");
		assertTarget("PersonWithMultiMember");
	}
	
	/**
	 * Test for family-name change of the family member
	 */
	@Test
	public void testFamilyNameChange()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		tool.performAndPropagateSourceEdit(this::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(this::familyNameSimpsonChange);
		assertSource("NameChangeFamily");
		assertTarget("NameChangePerson");
	}
	
	/**
	 * Test for first name change of the family member
	 */
	@Test
	public void testFamilyMemeberNameChange() {	
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(this::familyFatherHomerNameChange);
		assertSource("NameChangeFamilyMember");
		assertTarget("NameChangeOfPerson");
	}
	
	/**
	 * Test for family member role change, from father to son and from mother to daughter.
	 */
	@Test
	public void testFamilyMemberRoleChange() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		tool.performAndPropagateSourceEdit(this::createSimpsonFamilyMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(this::familyFatherHomerRoleChangeToSon);
		assertSource("RoleChangeFamilyMember");
		assertTarget("NoChangePerson");
	}
	
	/**
	 * Test for creation of new family with family members
	 */
	@Test 
	public void testNewFamilyWithMultiMembers(){
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(this::createNewfamilyBachchanWithMembers);
		assertSource("NewFamilyWithMembers");
		assertTarget("PersonsMulti");
	}
	
	/**
	 * Test for family member moved to new family, i.e. daughter is married and created a new family.
	 */
	@Test
	public void testFamilyMemberDiffFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(this::moveDaughterToMotherOfNewFamily);
		assertSource("FamilyMemberWithDiffFamily");
		assertTarget("PersonsFirstNameChange");
	}
	
	/**
	 * Test for deletion of family member
	 */
	@Test
	public void testDeleteFamilyMember() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		tool.performAndPropagateSourceEdit(this::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(this::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(this::deleteFamilyFatherHomer);
		assertSource("DeleteFamilyMember");
		assertTarget("DeletePerson");
	}
	
	/**
	 * Test for deletion of family
	 */
	@Test
	public void testDeleteFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		tool.performAndPropagateSourceEdit(this::createSimpsonFamilyMembers);
		tool.performAndPropagateSourceEdit(this::createNewfamilyBachchanWithMembers);
		
		//------------
		tool.performAndPropagateSourceEdit(this::deleteFamilySimpson);
		assertSource("DeleteFamily");
		assertTarget("DeleteAllPerson");		
	}
	
	
	private void assertSource(String path){
		familiesComparator.compare(util.loadExpectedModel(path), tool.getSourceModel());
	}
	
	private void assertTarget(String path){
		personsComparator.compare(util.loadExpectedModel(path), tool.getTargetModel());
	}

	private void createSimpsonFamily(FamilyRegister register) {
		Family family = FamiliesFactory.eINSTANCE.createFamily();
		family.setName("Simpson");
		register.getFamilies().add(family);
	}
	
	private void createFatherHomer(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		FamilyMember familyFather = FamiliesFactory.eINSTANCE.createFamilyMember();
		family.setFather(familyFather);
		familyFather.setName("Homer");
	}
	
	private void createSimpsonFamilyMembers(FamilyRegister eObject){
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
	
	private void familyNameSimpsonChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		family.setName("SimpsonS");
	}
	
	private void familyFatherHomerNameChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		family.getFather().setName("HomerX");
		
	}
	
	private void familyFatherHomerRoleChangeToSon(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		
		String familySonName = family.getSons().get(0).getName();
		String familyFatherName = family.getFather().getName();
		
		family.getFather().setName(familySonName);
		family.getSons().get(0).setName(familyFatherName);
	}
	
	private void createNewfamilyBachchanWithMembers(FamilyRegister eObject){
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
	
	private void moveDaughterToMotherOfNewFamily(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		assertTrue(family.getName().equals("Bachchan"));
		FamilyMember familyDaughter = family.getDaughters().get(0);
		assertTrue(familyDaughter.getName().equals("Shweta"));
		
		Family newFamily = FamiliesFactory.eINSTANCE.createFamily();
		newFamily.setName("Nanda");
		eObject.getFamilies().add(newFamily);
		
		// This moves the daughter from the old family to the mother in the new family
		newFamily.setMother(familyDaughter);
	}
	
	private void deleteFamilyFatherHomer(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(1);
		EcoreUtil.delete(family.getFather());
	}
	
	private void deleteFamilySimpson(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(1);
		EcoreUtil.delete(family);
	}
	
}
