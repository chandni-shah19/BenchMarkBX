package org.benchmarkx.emoflon.AtHomeToWeb;

import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.Configurator;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import AtHome.Directory;
import AtHomeToWeb.AtHomeToWebFactory;
import AtHomeToWeb.AtHomeToWebPackage;
import OnTheWeb.Web;



public class EMoflonAtHomeToWeb implements BXTool<Directory, Web, Decisions>{
	
	private SynchronizationHelper helper;

	@Override
	public void initiateSynchronisationDialogue() {
		BasicConfigurator.configure();
		helper = new SynchronizationHelper(AtHomeToWebPackage.eINSTANCE, "../AtHomeToWeb");
		Resource r = helper.getResourceSet().createResource(URI.createURI("sourceModel"));
		Directory root = (Directory) AtHomeToWebFactory.eINSTANCE.createDirectoryToWeb();
		r.getContents().add(root);
		
		// perform batch to establish consistent starting state
		helper.setSrc(root);
		helper.integrateForward();	
		
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<Web> edit) {
		helper.setChangeTrg((EObject root) ->  edit.accept((Web) root));
		helper.integrateBackward();		
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<Directory> edit) {
		helper.setChangeSrc((EObject root) ->  edit.accept((Directory) root));
		helper.integrateForward();
	}

	@Override
	public Directory getSourceModel() {
		return (Directory) helper.getSrc();
	}

	@Override
	public Web getTargetModel() {
		return (Web) helper.getTrg();
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		
	}

}
