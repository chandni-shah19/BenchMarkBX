package org.benchmarx.familiestopersons;

import static org.junit.Assert.assertTrue;

import org.benchmarkx.emoflon.EmoflonImpl;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.Comparator;
import org.benchmarx.core.BenchmarxUtil;
import org.eclipse.emf.ecore.EObject;
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
		tool = new EmoflonImpl();
		util = new BenchmarxUtil();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
	}

	@Test
	public void testCreateFamily(EObject EObject) {
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

	private void createFamily(EObject root) {
		assertTrue("Expect root element of Families model", root instanceof Families);
		Families familyRoot = Families.class.cast(root);

		Family family = FamiliesModelFactory.eINSTANCE.createFamily();
		family.setFamilyName("Simpson");
		familyRoot.getFamily().add(family);
	}

}
