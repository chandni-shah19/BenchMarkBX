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
import PersonsModel.Persons;

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
	}

}
