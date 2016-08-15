package org.benchmarkx.emoflon;
import java.io.IOException;
import java.util.function.Consumer;

import org.benchmarx.core.BXTool;
import org.eclipse.emf.ecore.EObject;

import FamiliesModel.Families;
import FamiliesToPersons.FamiliesToPersonsPackage;
import FamiliesToPersons.impl.FamiliesToPersonsPackageImpl;
import PersonsModel.Persons;
import org.moflon.tie.*;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;




public class EmoflonImpl implements BXTool<Families, Persons>   {
	
	 public EmoflonImpl()
	   {
	      
	   }
	
	@Override
	public void initiateSynchronisationDialogue() {
		FamiliesToPersonsPackage createRootElement = FamiliesToPersonsPackage.eINSTANCE; // ?
		createRootElement.eAllContents(); // ?
		
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer edit) {
		
		// performBackward() like in Trafo??
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer edit) {
		
		// performforwardward() like in Trafo ??
	}

	@Override
	public Families getSourceModel() {
		//  public EObject getSrc() ?? 
		return null;
	}

	@Override
	public Persons getTargetModel() {
		//  public EObject getTrg() ?? (access from org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;)
		  
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		
	}

}
