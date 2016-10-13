package org.benchmarx.examples.familiestopersons.families.core;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.util.EcoreUtil;

import Families.FamiliesFactory;
import Families.Family;
import Families.FamilyMember;
import Families.FamilyRegister;

public class FamilyHelper {
	
	public void createSimpsonFamily(FamilyRegister register) {
		Family family = FamiliesFactory.eINSTANCE.createFamily();
		family.setName("Simpson");
		register.getFamilies().add(family);
	}	
	
	public void createFatherHomer(FamilyRegister register){
		Family family = register.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
		FamilyMember familyFather = FamiliesFactory.eINSTANCE.createFamilyMember();
		family.setFather(familyFather);
		familyFather.setName("Homer");
	}
	
	public void createSimpsonFamilyMembers(FamilyRegister register){
		Family family = register.getFamilies().get(0);
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
	
	public void familyNameSimpsonChange(FamilyRegister register){
		Family family = register.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
		family.setName("Jetson");
	}
	
	public void familyFatherHomerNameChange(FamilyRegister register){
		Family family = register.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
		family.getFather().setName("Jay");
	}
	
	public void familyFatherHomerRoleChangeToSon(FamilyRegister register){
		Family family = register.getFamilies().get(0);
		assertTrue(family.getName().equals("Simpson"));
		
		String familySonName = family.getSons().get(0).getName();
		String familyFatherName = family.getFather().getName();
		
		family.getFather().setName(familySonName);
		family.getSons().get(0).setName(familyFatherName);
	}
	
	public void createNewfamilyBachchanWithMembers(FamilyRegister register){
		Family family = FamiliesFactory.eINSTANCE.createFamily();
		family.setName("Bachchan");
		register.getFamilies().add(family);
		
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
	
	public void moveDaughterToMotherOfNewFamily(FamilyRegister register){
		Family family = register.getFamilies().get(0);
		assertTrue(family.getName().equals("Bachchan"));
		
		FamilyMember familyDaughter = family.getDaughters().get(0);
		assertTrue(familyDaughter.getName().equals("Shweta"));
		
		Family newFamily = FamiliesFactory.eINSTANCE.createFamily();
		newFamily.setName("Nanda");
		register.getFamilies().add(newFamily);
		
		// This also moves the daughter from the old family to the mother in the new family
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
