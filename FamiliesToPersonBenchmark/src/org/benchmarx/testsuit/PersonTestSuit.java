package org.benchmarx.testsuit;

import org.benchmarx.familiestopersons.PersonUpdatesLevelOne;
import org.benchmarx.familiestopersons.PersonUpdatesLevelTwo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	PersonUpdatesLevelOne.class,
	PersonUpdatesLevelTwo.class
})

public class PersonTestSuit {

}
