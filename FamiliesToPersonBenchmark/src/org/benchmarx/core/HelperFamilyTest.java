package org.benchmarx.core;

import static org.junit.Assert.assertTrue;

import org.benchmarx.familiestopersons.Decisions;
import org.eclipse.emf.ecore.util.EcoreUtil;

import Families.FamiliesFactory;
import Families.Family;
import Families.FamilyMember;
import Families.FamilyRegister;
import Persons.PersonRegister;


public class HelperFamilyTest {

	public Comparator<FamilyRegister> familiesComparator;
	public BenchmarxUtil util;
	public BXTool<FamilyRegister, PersonRegister, Configurator<Decisions>> tool;
	
	public void createSimpsonFamily(FamilyRegister register) {
		Family family = FamiliesFactory.eINSTANCE.createFamily();
		family.setName("Simpson");
		register.getFamilies().add(family);
	}	
	
	public void createFatherHomer(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
		FamilyMember familyFather = FamiliesFactory.eINSTANCE.createFamilyMember();
		family.setFather(familyFather);
		familyFather.setName("Homer");
	}
	
	public void createSimpsonFamilyMembers(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
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
	
	public void familyNameSimpsonChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
		family.setName("SimpsonS");
	}
	
	public void familyFatherHomerNameChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
		family.getFather().setName("HomerX");
		
	}
	
	public void familyFatherHomerRoleChangeToSon(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
		String familySonName = family.getSons().get(0).getName();
		String familyFatherName = family.getFather().getName();
		
		family.getFather().setName(familySonName);
		family.getSons().get(0).setName(familyFatherName);
	}
	
	public void createNewfamilyBachchanWithMembers(FamilyRegister eObject){
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
	
	public void moveDaughterToMotherOfNewFamily(FamilyRegister eObject){
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
	
	public void deleteFamilyFatherAmitabh(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(1);
		assertTrue(family.getName().equals("Bachchan"));
		
		EcoreUtil.delete(family.getFather());
	}
	
	public void deleteFamilyBachchan(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(1);
		assertTrue(family.getName().equals("Bachchan"));
		
		EcoreUtil.delete(family);
	}
	
	
}
