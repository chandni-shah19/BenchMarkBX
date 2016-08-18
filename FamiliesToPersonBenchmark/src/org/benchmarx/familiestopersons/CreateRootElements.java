package org.benchmarx.familiestopersons;

import org.benchmarkx.emoflon.EMoflon;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.BenchmarxUtil;
import org.benchmarx.core.Comparator;
import org.junit.Before;
import org.junit.Test;

import FamiliesModel.Families;
import FamiliesModel.FamiliesModelFactory;
import FamiliesModel.Family;
import FamiliesModel.FamilyMember;
import FamiliesModel.util.FamiliesModelAdapterFactory;
import PersonsModel.Person;
import PersonsModel.Persons;
import PersonsModel.PersonsModelFactory;

public class CreateRootElements {

	private BXTool<Families, Persons> tool;
	private Comparator<Families> familiesComparator;
	private Comparator<Persons> personsComparator;
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
		assertSource("rootElementFamilies");
		assertTarget("rootElementPersons");

		// Test creation of a single family in an empty root container
		tool.performAndPropagateSourceEdit(this::createFamily);
		assertSource("oneFamily");
		assertTarget("personsForOneFamily");
		
		// Test for family single member e.g family father
		/* this Way ??????
		tool.performAndPropagateSourceEdit(this::createFamilyMember);
		assertSource("oneFamilyWithFamilyMemeber");
		
		tool.performAndPropagateTargetEdit(this::createMale);
		assertTarget("personsForOneFamilyMemeber");
		*/
	}

	private void assertSource(String path){
		familiesComparator.compare(util.loadExpectedModel(path), tool.getSourceModel());
	}
	
	private void assertTarget(String path){
		personsComparator.compare(util.loadExpectedModel(path), tool.getTargetModel());
	}

	private void createFamily(Families root) {
		Family family = FamiliesModelFactory.eINSTANCE.createFamily();
		family.setFamilyName("Simpson");
		root.getFamily().add(family);
		
		/* or this way ???????
		FamilyMember familyFather =  FamiliesModelFactory.eINSTANCE.createFamilyMember();
		familyFather.setFirstName("XYZ");
		*/
	}
	
	/*
	private void createFamilyMember(Families root)
	{
		root.getFamily().get(0);
		FamilyMember familyFather =  FamiliesModelFactory.eINSTANCE.createFamilyMember();
		familyFather.setFirstName("XYZ");
		root.getFamily().get(0).setFather(familyFather);
	}

	private void createMale(Persons root)
	{
		Person male = PersonsModelFactory.eINSTANCE.createMale();
		male.setFullName("Simpson XYZ");
		root.getPerson().add(male);
		
		
	}
	*/
}
