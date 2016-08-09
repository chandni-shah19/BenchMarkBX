package org.benchmarx.familiestopersons;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import java.io.IOException;

import org.benchmarx.core.BXTool;
import org.benchmarx.core.Comparator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
	
	@Before
	public void initialise(){
		// tool = ???
		familiesComparator = new FamiliesComparator();
		// personsComparator = ???
	}
	
	@Test
	public void testCreateFamilyRegister() {
		tool.initiateSynchronisationDialogue();  // Expect root elements of both source and target models to be consistently created
		tool.checkCreateFamiliesRoot();
		tool.performAndPropagateSourceEdit(this::createFamily);
		familiesComparator.compare(tool.getSourceModel(), (Families) loadExpectedModel("families1"));
		personsComparator.compare(tool.getTargetModel(), (Persons) loadExpectedModel("persons1"));
	}
	

	public void checkCreateFamiliesRoot() {
		int familyRegister = 0;
		Resource familyModel = (Resource) tool.getSourceModel();
		for ( EObject obj : familyModel.getContents()) {
			if ( obj.eClass().getName().equals("Families"))
				familyRegister ++;
		}
		assertEquals ("Expected root element of Families model ", 1, familyRegister);
		}		

	private EObject loadExpectedModel(String name) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI("resources/" + name + ".xmi"));
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource.getContents().get(0);
	}

	private void createFamily(EObject root){
		assertTrue("Expect root element of Families model", root instanceof Families);
		Families familyRoot = Families.class.cast(root);
		
		Family family = FamiliesModelFactory.eINSTANCE.createFamily();
		family.setFamilyName("Simpson");
		
		familyRoot.getFamily().add(family);
	}

}
