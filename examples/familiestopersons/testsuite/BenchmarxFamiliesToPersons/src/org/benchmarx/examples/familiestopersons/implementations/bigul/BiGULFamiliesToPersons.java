package org.benchmarx.examples.familiestopersons.implementations.bigul;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
	private static final String BIGUL_EXE = "src/org/benchmarx/examples/familiestopersons/implementations/bigul/FamiliesToPersons";
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
		performAndPropagateEdit(() -> edit.accept(trg), () -> runBigulBWD(srcHelper.familyToString(src), trgHelper.personsToString(trg)));
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<FamilyRegister> edit) {
		performAndPropagateEdit(() -> edit.accept(src), () -> runBigulFWD(srcHelper.familyToString(src), trgHelper.personsToString(trg)));
	}

	private void performAndPropagateEdit(Runnable edit, Runnable propagation){
		if(updated)
			throw new IllegalStateException("Cannot run BiGUL twice in the same sync run!");
		
		// Just perform the edit and update the target model, BiGUL does not care about deltas
		edit.run();;
		
		// If we're ready to go, run propagation
		if(preconditionIsSet)
			propagation.run();
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
		
		normaliseAndCompare(expectedFamilyRegister, resultSrc);
		normaliseAndCompare(expectedPersonsRegister, resultTrg);
	}
	
	private void normaliseAndCompare(String expected, String actual) {
		Assert.assertEquals(expected.replaceAll("\\s+",""), actual.replaceAll("\\s+",""));
	}

	private String runBigul(String dir, String familyRegister, String personsRegister) {
		// Signalises that we have performed a propagation (we can only do this once)
		updated = true;
		
		try {
			File pathToExecutable = new File(BIGUL_EXE);
			String input = "(" + "\"" + dir + "\"" + ", " + familyRegister + "," + personsRegister + ")";
			ProcessBuilder processBuilder = new ProcessBuilder(pathToExecutable.getAbsoluteFile().toString());
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			
			OutputStream stdin = process.getOutputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stdin));
			
			InputStream stdout = process.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
			
			writer.write(input);
			writer.flush();
			writer.close();
			
			String output = reader.lines().collect(Collectors.joining(" "));
			reader.close();
			
			return output;
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

