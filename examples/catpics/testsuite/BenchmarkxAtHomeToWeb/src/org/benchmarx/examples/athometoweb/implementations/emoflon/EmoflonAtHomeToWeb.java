package org.benchmarx.examples.athometoweb.implementations.emoflon;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.BXTool;
import org.benchmarx.Configurator;
import org.benchmarx.examples.athometoweb.testsuite.Decisions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import AtHome.AtHomeFactory;
import AtHome.Directory;
import AtHomeToWeb.AtHomeToWebPackage;
import OnTheWeb.Web;

public class EmoflonAtHomeToWeb implements BXTool<Directory, Web, Decisions> {
	private SynchronizationHelper helper;
	
	@Override
	public void initiateSynchronisationDialogue() {
		BasicConfigurator.configure();
		helper = new SynchronizationHelper(AtHomeToWebPackage.eINSTANCE, "../../implementations/emoflon/AtHomeToWeb");
		Resource r = helper.getResourceSet().createResource(URI.createURI("sourceModel"));
		Directory rootDirectory = AtHomeFactory.eINSTANCE.createDirectory();
		r.getContents().add(rootDirectory);
		
		// perform batch to establish consistent starting state
		helper.setSrc(rootDirectory);
		helper.integrateForward();	
			
		helper.setMute(true);
		
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
