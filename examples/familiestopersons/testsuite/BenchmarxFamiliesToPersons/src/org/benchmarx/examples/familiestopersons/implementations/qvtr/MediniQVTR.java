package org.benchmarx.examples.familiestopersons.implementations.qvtr;

import java.util.function.Consumer;

import org.benchmarx.BXTool;
import org.benchmarx.Configurator;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class MediniQVTR implements BXTool<FamilyRegister, PersonRegister, Decisions> {

	@Override
	public void initiateSynchronisationDialogue() {
		// TODO Auto-generated method stub
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<PersonRegister> edit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<FamilyRegister> edit) {
		// TODO:  Do sth with the source edit?
		
		RunTrafo_FWD simpleQVT = new RunTrafo_FWD(System.out);
		simpleQVT.launch("./src/org/benchmarx/examples/familiestopersons/implementations/qvtr/base/", "target.xmi", "source.xmi");
	}

	@Override
	public FamilyRegister getSourceModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonRegister getTargetModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		// Medini QVT does not support interaction
	}

}
