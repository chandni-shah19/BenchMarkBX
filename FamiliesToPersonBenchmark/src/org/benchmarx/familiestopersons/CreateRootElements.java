package org.benchmarx.familiestopersons;

import static org.junit.Assert.assertTrue;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.Comparator;
import org.benchmarx.core.ModelUtil;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;

import FamiliesModel.Families;
import FamiliesModel.FamiliesModelFactory;
import FamiliesModel.Family;
import PersonsModel.Persons;


public class CreateRootElements {

	private BXTool<Families, Persons> EmoflonImpl;
	private Comparator<Families> familiesComparator;
	private Comparator<Persons> personsComparator;
	
	@Before
	public void initialise(){
				
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
			
	}
	
	@Test
	public void testCreateFamilyRegister(EObject EObject) {
		EmoflonImpl.initiateSynchronisationDialogue();  // Expect root elements of both source and target models to be consistently created
		
		ModelUtil loadMethod = new ModelUtil();
		familiesComparator.compare((Families) loadMethod.loadExpectedModel("“onlyRootElement”"), EmoflonImpl.getSourceModel());
		personsComparator.compare((Persons) loadMethod.loadExpectedModel("“onlyRootElement”"), EmoflonImpl.getTargetModel());
		
		EmoflonImpl.performAndPropagateSourceEdit(this::createFamily);
		familiesComparator.compare((Families) loadMethod.loadExpectedModel("Families"), EmoflonImpl.getSourceModel());
				
	}
	
		
	private void createFamily(EObject root){
		assertTrue("Expect root element of Families model", root instanceof Families);
		Families familyRoot = Families.class.cast(root);
		
		Family family = FamiliesModelFactory.eINSTANCE.createFamily();
		family.setFamilyName("Simpson");
		
		familyRoot.getFamily().add(family);
	}
	
	}
