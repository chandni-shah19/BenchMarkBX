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
import FamiliesToPersons.Rules.RulesPackage;
import Persons.PersonRegister;


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
				handleMothersAndDaughters(configurator, alternatives);
				handleFathersAndSons(configurator, alternatives);
				return org.moflon.tgg.algorithm.configuration.Configurator.super.chooseOne(alternatives);
			}

		});
	}
	
	private void handleMothersAndDaughters(Configurator<Decisions> configurator, Collection<RuleResult> alternatives) {
		final String m2f = RulesPackage.eINSTANCE.getMotherToFemale().getName();
		final String d2f = RulesPackage.eINSTANCE.getDaughterToFemale().getName();
		handleDecision(configurator, alternatives, m2f, d2f, Decisions.PREFER_CREATING_MOTHER_OVER_DAUGHTER);
	}

	private void handleFathersAndSons(Configurator<Decisions> configurator, Collection<RuleResult> alternatives) {
		final String f2m = RulesPackage.eINSTANCE.getFatherToMale().getName();
		final String s2m = RulesPackage.eINSTANCE.getSonToMale().getName();
		handleDecision(configurator, alternatives, f2m, s2m, Decisions.PREFER_CREATING_FATHER_OVER_SON);
	}

	private void handleDecision(Configurator<Decisions> configurator, Collection<RuleResult> alternatives,
			final String r1, final String r2, Decisions preferR1) {
		if(alternatives.size() > 1 && alternatives.stream().allMatch(rr -> rr.isRule(r1) || rr.isRule(r2))){
			if(configurator.decide(preferR1))
				alternatives.forEach(rr -> rr.restrictMatchesTo(m -> m.isRule(r1)));
			else
				alternatives.forEach(rr -> rr.restrictMatchesTo(m -> m.isRule(r2)));
		}
		
		alternatives.removeIf(rr -> rr.isEmpty());
	}
	
}
