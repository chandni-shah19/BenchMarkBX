package org.benchmarx.examples.familiestopersons.testsuit.level1.batch.wocorrs.state.auto;

import org.benchmarkx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.persons.core.PersonHelper;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;


public class PersonsDelta_Batch {

	private BXTool<FamilyRegister, PersonRegister, Decisions> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil<FamilyRegister, PersonRegister, Decisions> util;
	private PersonHelper helperPerson;
	
	@Before
	public void initialise() {
		tool = new EMoflonFamiliesToPersons();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		helperPerson = new PersonHelper();
		util = new BenchmarxUtil<>(familiesComparator, personsComparator, tool);
	}
	
	/**
	 * Expect root elements of both source and target models. 
	 */
	@Test
	public void testInitialiseSynchronisation() // Batch, as starting from the scratch with empty model i.e. only root elements
	{
		tool.initiateSynchronisationDialogue();
				
		util.assertTarget("rootElementPersons");
		util.assertSource("rootElementFamilies");
	}
	
	// no other test case possible currently as it uses Configurator, which is related to 'config' case. 
	// and this test case about 'auto'
	// example creating a single person from scratch also requires access to Configurator as decision has to be made either it is created as father/son or mother/daughhter

}
