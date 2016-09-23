package org.benchmarx.testsuites;

import org.benchmarx.examples.familiestopersons.persons.levels.PersonUpdatesLevelOne;
import org.benchmarx.examples.familiestopersons.persons.levels.PersonUpdatesLevelTwo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	PersonUpdatesLevelOne.class,
	PersonUpdatesLevelTwo.class
})

public class PersonTestSuite {

}
