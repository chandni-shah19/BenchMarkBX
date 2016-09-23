package org.benchmarx.testsuites;

import org.benchmarx.examples.familiestopersons.families.levels.FamilyUpdatesLevelHigherThanTwo;
import org.benchmarx.examples.familiestopersons.families.levels.FamilyUpdatesLevelOne;
import org.benchmarx.examples.familiestopersons.families.levels.FamilyUpdatesLevelTwo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	FamilyUpdatesLevelOne.class,
	FamilyUpdatesLevelTwo.class,
	FamilyUpdatesLevelHigherThanTwo.class
})

public class FamilyTestSuite {

}
