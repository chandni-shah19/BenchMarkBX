package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;


import FamiliesToPersons.FamiliesToPersonsPackage;


public class FamiliesToPersonsConsistencyCheck extends SynchronizationHelper{

   public FamiliesToPersonsConsistencyCheck()
   {
      super(FamiliesToPersonsPackage.eINSTANCE, ".");
   }
	public static void main(String[] args) throws IOException {
		// Set up logging
        BasicConfigurator.configure();

		// Consistency Check
        FamiliesToPersonsConsistencyCheck helper = new FamiliesToPersonsConsistencyCheck();
        helper.loadSrc("instances/src.xmi");
		helper.loadTrg("instances/trg.xmi");
		helper.createCorrespondences();
		helper.saveCorr("instances/corr.xmi");
	}
}