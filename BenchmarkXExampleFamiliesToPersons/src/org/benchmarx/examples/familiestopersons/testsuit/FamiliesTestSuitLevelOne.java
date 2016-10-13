package org.benchmarx.examples.familiestopersons.testsuit;

import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Batch_Wocorrs_State_Auto;
import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Incr_Wcorrs_Delta_Auto;
import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Incr_Wcorrs_Delta_Config;
import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Incr_Wcorrs_State_Auto;
import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Incr_Wcorrs_State_Config;
import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Incr_Wocorrs_Delta_Auto;
import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Incr_Wocorrs_Delta_Config;
import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Incr_Wocorrs_State_Auto;
import org.benchmarx.examples.familiestopersons.testsuit.familieslevelonedeltas.Incr_Wocorrs_State_Config;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	
	Batch_Wocorrs_State_Auto.class,
	Incr_Wcorrs_State_Auto.class,
	Incr_Wcorrs_Delta_Config.class,
	Incr_Wcorrs_Delta_Auto.class,
	Incr_Wcorrs_State_Config.class,
	Incr_Wocorrs_Delta_Auto.class,
	Incr_Wocorrs_Delta_Config.class,
	Incr_Wocorrs_State_Auto.class,
	Incr_Wocorrs_State_Config.class
	
})

public class FamiliesTestSuitLevelOne {

}
