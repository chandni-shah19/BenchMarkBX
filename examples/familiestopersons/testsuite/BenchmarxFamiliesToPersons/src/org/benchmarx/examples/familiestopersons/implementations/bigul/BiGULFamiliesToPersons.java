package org.benchmarx.examples.familiestopersons.implementations.bigul;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.benchmarx.BXTool;
import org.benchmarx.Configurator;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.junit.Assert;

import Families.FamiliesFactory;
import Families.FamilyRegister;
import Persons.PersonRegister;
import Persons.PersonsFactory;

public class BiGULFamiliesToPersons implements BXTool<FamilyRegister, PersonRegister, Decisions> {
	private boolean preconditionIsSet;
	private boolean updated;
	private FamilyRegister src;
	private PersonRegister trg;
	private String resultSrc;
	private String resultTrg;
	private FamiliesComparator srcHelper = new FamiliesComparator();
	private PersonsComparator trgHelper = new PersonsComparator();
	
	@Override
	public void initiateSynchronisationDialogue() {
		// Used to decide when the actual test delta is to be propagated
		preconditionIsSet = false;
		
		// Used to indicate that BiGUL has been run and no further delta can be propagated
		updated = false;
		
		// BiGUL does not require any internal state
		src = FamiliesFactory.eINSTANCE.createFamilyRegister();
		trg = PersonsFactory.eINSTANCE.createPersonRegister();
		
		// Initial results
		resultSrc = srcHelper.familyToString(src);
		resultTrg = trgHelper.personsToString(trg);
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<PersonRegister> edit) {
		if(updated)
			throw new IllegalStateException("Cannot run BiGUL twice in the same sync run!");
		
		edit.accept(trg);
		
		if(preconditionIsSet)
			runBigulBWD(srcHelper.familyToString(src), trgHelper.personsToString(trg));
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<FamilyRegister> edit) {
		if(updated)
			throw new IllegalStateException("Cannot run BiGUL twice in the same sync run!");
		
		edit.accept(src);
		
		if(preconditionIsSet)
			runBigulFWD(srcHelper.familyToString(src), trgHelper.personsToString(trg));
	}
	
	private void runBigulBWD(String familyToString, String personsToString) {
		resultSrc = runBigul("bwd", familyToString, personsToString);
		resultTrg = personsToString;
	}

	private void runBigulFWD(String familyToString, String personsToString) {
		resultTrg = runBigul("fwd", familyToString, personsToString);
		resultSrc = familyToString;
	}

	@Override
	public void assertPostcondition(FamilyRegister fr, PersonRegister pr) {
		String expectedFamilyRegister = srcHelper.familyToString(fr);
		String expectedPersonsRegister = trgHelper.personsToString(pr);
		
		Assert.assertEquals(expectedFamilyRegister, resultSrc);
		Assert.assertEquals(expectedPersonsRegister, resultTrg);
	}
	
	private String runBigul(String dir, String familyRegister, String personsRegister) {
		updated = true;
		
		try {
			File pathToExecutable = new File("src/org/benchmarx/examples/familiestopersons/implementations/bigul/FamiliesToPersons");
			Process process = new ProcessBuilder(pathToExecutable.getAbsoluteFile().toString(), dir, familyRegister, personsRegister).start();
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "ERROR";
	}

	@Override
	public void assertPrecondition(FamilyRegister source, PersonRegister target) {
		src = source;
		trg = target;
		preconditionIsSet = true;
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		// No configuration
	}
}
