package org.benchmarx.familiestopersons;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamiliesFactory;
import Families.Family;
import Families.FamilyMember;
import Families.FamilyRegister;
import Persons.PersonRegister;

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
	public void testCreateFamily() {
		tool.initiateSynchronisationDialogue();

		// Expect root elements of both source and target models
		System.out.println("Root Elements");
		assertSource("rootElementFamilies");
		assertTarget("rootElementPersons");

		// Test creation of a single family in an empty root container
		tool.performAndPropagateSourceEdit(this::createFamily);
		assertSource("oneFamily");
		assertTarget("personsForOneFamily");
		
		//Test creation of a family member (e.g. family father added in above created one family)
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		assertSource("oneFamilyWithOneFamilyMember");
		assertTarget("PersonWithOneMaleMember");
		
		//Test for creation of multiple family members (with new family register)
		/*
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		assertSource("oneFamilyWithOneMultiFamilyMember");
		assertTarget("PersonWithMaynMaleFemaleMember");
		
		//Test for name family name change for family 'Shah' to 'Gandhi'
		tool.performAndPropagateSourceEdit(this::FamilyNameChange);
		assertSource("NameChangeFamily");
		assertTarget("AllPersonNameChange");
		*/
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
		FamilyMember familyMember = FamiliesFactory.eINSTANCE.createFamilyMember();
		familyMember.setFamily_father(family);
		familyMember.setName("xyz");
		
	}
	
	@SuppressWarnings("unused")
	private void createMultiFamilyMember(FamilyRegister eObject){
		Family family = FamiliesFactory.eINSTANCE.createFamily();
		family.setFamilyName("Shah");
		eObject.getFamily().add(family);
		
		FamilyMember familyMemberFather = FamiliesFactory.eINSTANCE.createFamilyMember();
		familyMemberFather.setFamily_father(family);
		familyMemberFather.setFirstName("AbcFather");
		
		FamilyMember familyMemberMother = FamiliesFactory.eINSTANCE.createFamilyMember();
		familyMemberMother.setFamily_mother(family);
		familyMemberMother.setFirstName("AbcMother");
		
		FamilyMember familyMemberDaughter = FamiliesFactory.eINSTANCE.createFamilyMember();
		familyMemberDaughter.setFamily_daughter(family);
		familyMemberDaughter.setFirstName("AbcDaughter1");
		
	}
	
	@SuppressWarnings("unused")
	private void FamilyNameChange(Families eObject){
		Family family = eObject.getFamily().get(1);
		family.setFamilyName("Gandhi");
		eObject.getFamily().add(1, family);
			
	}
}
