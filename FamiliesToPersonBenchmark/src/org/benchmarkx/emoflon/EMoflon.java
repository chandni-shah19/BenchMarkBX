package org.benchmarkx.emoflon;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.core.BXTool;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import FamiliesModel.Families;
import FamiliesModel.FamiliesModelFactory;
import FamiliesToPersons.FamiliesToPersonsPackage;
import PersonsModel.Persons;


public class EMoflon implements BXTool<Families, Persons>   {
	
	private SynchronizationHelper helper;
	
	@Override
	public void initiateSynchronisationDialogue() {
		BasicConfigurator.configure();
		helper = new SynchronizationHelper(FamiliesToPersonsPackage.eINSTANCE, "../FamiliesToPersons");
		Resource r = helper.getResourceSet().createResource(URI.createURI("sourceModel"));
		Families familiesRoot = FamiliesModelFactory.eINSTANCE.createFamilies();
		r.getContents().add(familiesRoot);
		
		// perform batch to establish consistent starting state
		helper.setSrc(familiesRoot);
		helper.integrateForward();
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<Persons> edit) {
		helper.setChangeTrg((EObject root) ->  edit.accept((Persons) root));
		helper.integrateBackward();
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<Families> edit) {
		helper.setChangeSrc((EObject root) ->  edit.accept((Families) root));
		helper.integrateForward();
	}

	@Override
	public Families getSourceModel() {
		return (Families) helper.getSrc();
	} 

	@Override
	public Persons getTargetModel() {
		return (Persons) helper.getTrg();
	}
}
