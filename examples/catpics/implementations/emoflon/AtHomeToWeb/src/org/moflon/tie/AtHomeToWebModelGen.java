package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;


import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import AtHomeToWeb.AtHomeToWebPackage;

import static AtHomeToWeb.Rules.RulesPackage.eINSTANCE;

public class AtHomeToWebModelGen extends SynchronizationHelper{

   public AtHomeToWebModelGen()
   {
      super(AtHomeToWebPackage.eINSTANCE, ".");
   }
	
	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		//controller.addContinuationController(new MaxRulePerformCounterController(10000));
      	controller.addContinuationController(new TimeoutController(2000));
      	controller.setRuleSelector(new LimitedRandomRuleSelector()
      			.addRuleLimit(eINSTANCE.getRootDirToWebRule().getName(), 1)
      			.addRuleLimit(eINSTANCE.getFileToWebElementRule().getName(), 500)
      			.addRuleLimit(eINSTANCE.getIgnoreDirectoryRule().getName(), 100)); 

		ModelGenerator gen = new ModelGenerator(AtHomeToWebPackage.eINSTANCE, controller);
		gen.generate();
	}
}