package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;


import AtHomeToWeb.AtHomeToWebPackage;


public class AtHomeToWebConsistencyCheck extends SynchronizationHelper{

   public AtHomeToWebConsistencyCheck()
   {
      super(AtHomeToWebPackage.eINSTANCE, ".");
   }
	public static void main(String[] args) throws IOException {
		// Set up logging
        BasicConfigurator.configure();

		// Consistency Check
        AtHomeToWebConsistencyCheck helper = new AtHomeToWebConsistencyCheck();
        helper.loadSrc("instances/fwd.src.xmi");
		helper.loadTrg("instances/fwd.trg.xmi");
		helper.createCorrespondences();
		helper.saveCorr("instances/corr.xmi");
	}
}