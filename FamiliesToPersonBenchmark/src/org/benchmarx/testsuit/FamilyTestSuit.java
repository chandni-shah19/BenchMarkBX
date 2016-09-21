package org.benchmarx.testsuit;

import org.benchmarx.familiestopersons.FamilyUpdatesLevelHigherThanTwo;
import org.benchmarx.familiestopersons.FamilyUpdatesLevelOne;
import org.benchmarx.familiestopersons.FamilyUpdatesLevelTwo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	FamilyUpdatesLevelOne.class,
	FamilyUpdatesLevelTwo.class,
	FamilyUpdatesLevelHigherThanTwo.class
})

public class FamilyTestSuit {

}
