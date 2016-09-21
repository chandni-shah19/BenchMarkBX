package org.benchmarkx.emoflon;
import java.util.Collection;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.core.BXTool;
import org.benchmarx.core.Configurator;
import org.benchmarx.familiestopersons.Decisions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import Families.FamiliesFactory;
import Families.FamilyRegister;
import FamiliesToPersons.FamiliesToPersonsPackage;
import Persons.PersonRegister;

/*
 * This class implements the bx tool interface for the eMoflon tool.
 */
public class EMoflon implements BXTool<FamilyRegister, PersonRegister, Configurator<Decisions>>   {
	
	private SynchronizationHelper helper;
	
	@Override
	public void initiateSynchronisationDialogue() {
		BasicConfigurator.configure();
		helper = new SynchronizationHelper(FamiliesToPersonsPackage.eINSTANCE, "../FamiliesToPersons");
		Resource r = helper.getResourceSet().createResource(URI.createURI("sourceModel"));
		FamilyRegister familiesRoot = FamiliesFactory.eINSTANCE.createFamilyRegister();
		r.getContents().add(familiesRoot);
		
		// perform batch to establish consistent starting state
		helper.setSrc(familiesRoot);
		helper.integrateForward();	
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<PersonRegister> edit) {
		helper.setChangeTrg((EObject root) ->  edit.accept((PersonRegister) root));
		helper.integrateBackward();
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<FamilyRegister> edit) {
		helper.setChangeSrc((EObject root) ->  edit.accept((FamilyRegister) root));
		helper.integrateForward();
	}

	@Override
	public FamilyRegister getSourceModel() {
		return (FamilyRegister) helper.getSrc();
	} 

	@Override
	public PersonRegister getTargetModel() {
		return (PersonRegister) helper.getTrg();
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		helper.setConfigurator(new org.moflon.tgg.algorithm.configuration.Configurator() {
			@Override
			public RuleResult chooseOne(Collection<RuleResult> alternatives) {
				handleChoices(configurator, alternatives);
				return org.moflon.tgg.algorithm.configuration.Configurator.super.chooseOne(alternatives);
			}
		});
	}
	
	private void handleChoices(Configurator<Decisions> configurator, Collection<RuleResult> alternatives) {
		boolean handleExisting = alternatives.stream().anyMatch(rr -> rr.getRule().contains("ExistingFamily"));
		if(handleExisting) restrictMatchesToExisting(configurator, alternatives);
	
		boolean handleParentOrChild = alternatives.stream().anyMatch(rr -> rr.getRule().contains("Mother") || rr.getRule().contains("Father"));
		if(handleParentOrChild) restrictMatchesForParents(configurator, alternatives);
	}

	private void restrictMatchesForParents(Configurator<Decisions> configurator, Collection<RuleResult> alternatives) {
		if (configurator.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD)) {
			alternatives.forEach(rr -> rr.restrictMatchesTo(m -> rr.getRule().contains("Mother") || rr.getRule().contains("Father")));
		} else {
			alternatives.forEach(rr -> rr.restrictMatchesTo(m -> !(rr.getRule().contains("Mother") || rr.getRule().contains("Father"))));
		}
		
		alternatives.removeIf(rr -> rr.isEmpty());
	}

	private void restrictMatchesToExisting(Configurator<Decisions> configurator, Collection<RuleResult> alternatives) {
		if (configurator.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW)) {
			alternatives.forEach(rr -> rr.restrictMatchesTo(m -> rr.getRule().contains("ExistingFamily")));
		} else {
			alternatives.forEach(rr -> rr.restrictMatchesTo(m -> !rr.getRule().contains("ExistingFamily")));
		}
		
		alternatives.removeIf(rr -> rr.isEmpty());
	}
}
