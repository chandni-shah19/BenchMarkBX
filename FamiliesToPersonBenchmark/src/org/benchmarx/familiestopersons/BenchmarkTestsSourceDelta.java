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

	// Family updates
	
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
	
	/**
	 * Test creation of a single family in an empty root container
	 */
	@Test
	public void testCreateFamily() {
		tool.initiateSynchronisationDialogue();
		
		//------------
		
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		assertSource("oneFamily");
		assertTarget("personsForOneFamily");
	}	
	
	@Test
	public void testCreateFamilyMember(){
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		
		//------------
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		assertSource("oneFamilyWithOneFamilyMember");
		assertTarget("PersonWithOneMaleMember");
	}
	
	@Test
	public void testCreateMultiFamilyMember()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		assertSource("FamilyWithMultiFamilyMember");
		assertTarget("PersonWithMultiMember");
	}
	
	@Test
	public void testFamilyNameChange()
	{
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		
		//------------
		tool.performAndPropagateSourceEdit(this::familyNameChange);
		assertSource("NameChangeFamily");
		assertTarget("NameChangePerson");
	}
	
	@Test
	public void testFamilyMemeberNameChange() {	
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		
		//------------
		tool.performAndPropagateSourceEdit(this::familyMemberNameChange);
		assertSource("NameChangeFamilyMember");
		assertTarget("NameChangeOfPerson");
	}
	
	@Test
	public void testFamilyMemberRoleChange() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		
		//------------
		tool.performAndPropagateSourceEdit(this::familyMemberRoleChange);
		assertSource("RoleChangeFamilyMember");
		assertTarget("NoChangePerson");
	}
	
	@Test 
	public void testNewFamilyWithMultiMembers(){
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(this::newfamilyMultiMember);
		assertSource("NewFamilyWithMembers");
		assertTarget("PersonsMulti");
	}
	
	@Test
	public void testFamilyMemberDiffFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::newfamilyMultiMember);
		
		//------------
		tool.performAndPropagateSourceEdit(this::memberNewFamily);
		assertSource("FamilyMemberWithDiffFamily");
		assertTarget("PersonsFirstNameChange");
	}
	
	@Test
	public void testDeleteFamilyMember() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		tool.performAndPropagateSourceEdit(this::newfamilyMultiMember);
		
		//------------
		tool.performAndPropagateSourceEdit(this::deleteFamilyMember);
		assertSource("DeleteFamilyMember");
		assertTarget("DeletePerson");
	}
	
	@Test
	public void testDeleteFamily() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(this::createSimpsonFamily);
		tool.performAndPropagateSourceEdit(this::createFatherHomer);
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		tool.performAndPropagateSourceEdit(this::newfamilyMultiMember);
		
		//------------
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
	
	private void memberNewFamily(FamilyRegister eObject){
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
	
	private void deleteFamilyMember(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(1);
		EcoreUtil.delete(family.getFather());
	}
	
	private void deleteFamily(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(1);
		EcoreUtil.delete(family);
	}
	
}
