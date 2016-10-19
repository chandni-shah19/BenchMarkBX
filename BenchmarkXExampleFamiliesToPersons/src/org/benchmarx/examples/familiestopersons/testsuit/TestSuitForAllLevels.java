package org.benchmarx.examples.familiestopersons.testsuit;

import org.benchmarx.examples.familiestopersons.testsuit.level1.batch.wocorrs.state.auto.FamiliesDelta_Batch;
import org.benchmarx.examples.familiestopersons.testsuit.level1.batch.wocorrs.state.auto.PersonsDelta_Batch;
import org.benchmarx.examples.familiestopersons.testsuit.level1.incr.wcorrs.delta.auto.FamiliesDelta_IncrWcDelAu;
import org.benchmarx.examples.familiestopersons.testsuit.level1.incr.wocorrs.delta.auto.FamiliesDelta_IncrWocDelAu;
import org.benchmarx.examples.familiestopersons.testsuit.level1.incr.wocorrs.delta.config.PersonsDelta_IncrWocDelCon;
import org.benchmarx.examples.familiestopersons.testsuit.level1.incr.wocorrs.state.auto.FamiliesDelta_IncrWocStAu;
import org.benchmarx.examples.familiestopersons.testsuit.level1.incr.wocorrs.state.config.PersonsDelta_IncrWocStCon;
import org.benchmarx.examples.familiestopersons.testsuit.level2.incr.wocorrs.delta.auto.FamiliesDeltaLevel2_IncrWocDelAu;
import org.benchmarx.examples.familiestopersons.testsuit.level2.incr.wocorrs.state.auto.FamiliesDeltaLevel2_IncrWocStAu;
import org.benchmarx.examples.familiestopersons.testsuit.level2.incr.wocorrs.state.conifig.PersonsDeltaLevel2_IncrWocStCon;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	FamiliesDelta_Batch.class,
	PersonsDelta_Batch.class,
	FamiliesDelta_IncrWcDelAu.class,
	FamiliesDelta_IncrWocDelAu.class,
	PersonsDelta_IncrWocDelCon.class,
	FamiliesDelta_IncrWocStAu.class,
	PersonsDelta_IncrWocStCon.class,
	FamiliesDeltaLevel2_IncrWocDelAu.class,
	FamiliesDeltaLevel2_IncrWocStAu.class,
	PersonsDeltaLevel2_IncrWocStCon.class
	
})
public class TestSuitForAllLevels {

}
