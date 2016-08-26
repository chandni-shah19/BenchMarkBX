package org.benchmarx.familiestopersons;

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

		// Expect root elements of both source and target models (FM1 and PM1)
		assertSource("rootElementFamilies");
		assertTarget("rootElementPersons");

		// Test creation of a single family in an empty root container (FM4)
		tool.performAndPropagateSourceEdit(this::createFamily);
		assertSource("oneFamily");
		assertTarget("personsForOneFamily");
		
		//Test creation of a family member (e.g. family father added in above created one family) (FM5)
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		assertSource("oneFamilyWithOneFamilyMember");
		assertTarget("PersonWithOneMaleMember");
		
		//Test for creation of multiple family members (with new family register) (FM6) 
		
		tool.performAndPropagateSourceEdit(this::createMultiFamilyMember);
		assertSource("FamilyWithMultiFamilyMember");
		assertTarget("PersonWithMultiMember");
		
		
		//Test for name FamilyMemberName change and familyName change (FM2 & FM3)
		tool.performAndPropagateSourceEdit(this::FamilyNameChange);
		assertSource("NameChangeFamily");
		assertTarget("NameChangePerson");

		//Test for The role of a family member is changed. (FM7)
		tool.performAndPropagateSourceEdit(this::familyMemberRoleChange);
		assertSource("RoleChangeFatherToSon");
		assertTarget("PersonNoEffect");
		
		//Test for deletion family member(FM9)
		tool.performAndPropagateSourceEdit(this::deleteFamilyMember);
		assertSource("DeleteFather");
		assertTarget("DeletePerson");
		
		//Test for delete family (FM10)
		tool.performAndPropagateSourceEdit(this::deleteFamily);
		assertSource("DeleteFamily");
		assertTarget("DeleteAllPerson");
		
		
		// Test cases for now PM : TargetEdit
		//tool.performAndPropagateTargetEdit(this::createPerson);
		
	}

	/*private void createPerson(PersonRegister eObject){
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Homer");
		eObject.getPersons().add(person);
	}*/
	
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
	
	
	private void FamilyNameChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		
		family.getFather().setName("Jay"); //Father name changed from Homer to Jay
		
		family.setName("SimpsonS");
		eObject.getFamilies().add(family); //Family name changed to SimponS
	}
		
	private void familyMemberRoleChange(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		
		String fatherName = family.getFather().getName();
		family.getFather().setName(family.getSons().get(0).getName()); //Father name changed to Son name
		
		family.getSons().get(0).setName(fatherName); //Son name change to Father name
	}
	
	private void deleteFamilyMember(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		
		EcoreUtil.delete(family.getFather());
	}
	
	private void deleteFamily(FamilyRegister eObject){
		Family family = eObject.getFamilies().get(0);
		
		EcoreUtil.delete(family);
	}
}
