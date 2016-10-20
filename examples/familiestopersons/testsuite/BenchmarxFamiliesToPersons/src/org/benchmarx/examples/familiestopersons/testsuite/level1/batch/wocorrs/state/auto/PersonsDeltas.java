package org.benchmarx.examples.familiestopersons.testsuite.level1.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;
import org.benchmarx.emoflon.familiestopersons.EMoflonFamiliesToPersons;
import org.benchmarx.examples.familiestopersons.Decisions;
import org.benchmarx.examples.familiestopersons.families.core.FamiliesComparator;
import org.benchmarx.examples.familiestopersons.persons.core.PersonsComparator;
import org.junit.Before;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;


public class PersonsDeltas {

	private BXTool<FamilyRegister, PersonRegister, Decisions> tool;
	private Comparator<FamilyRegister> familiesComparator;
	private Comparator<PersonRegister> personsComparator;
	private BenchmarxUtil<FamilyRegister, PersonRegister, Decisions> util;
	
	@Before
	public void initialise() {
		tool = new EMoflonFamiliesToPersons();
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		util = new BenchmarxUtil<>(familiesComparator, personsComparator, tool);
	}
	
	/**
	 * Test for agreed upon starting state.
	 * Expect root elements of both source and target models. 
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		
		//------------
		tool.initiateSynchronisationDialogue();
		//------------
		
		util.assertTarget("rootElementPersons");
		util.assertSource("rootElementFamilies");
	}
	
	// No other test cases as it is unclear if mother/daughter or father/son should be created. 
}
