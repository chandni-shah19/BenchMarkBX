package org.moflon.tie;

import java.io.IOException;
import java.util.Collection;
import java.util.function.BiConsumer;

import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.runtime.CorrespondenceModel;

import AtHome.Directory;
import AtHomeToWeb.AtHomeToWebPackage;
import AtHomeToWeb.Rules.RulesPackage;


public class AtHomeToWebSyncBWD extends SynchronizationHelper{

   public AtHomeToWebSyncBWD()
   {
      super(AtHomeToWebPackage.eINSTANCE, ".");
   }
	
	public static void main(String[] args) throws IOException {
		// Create helper
		BasicConfigurator.configure();
		AtHomeToWebSyncBWD helper = new AtHomeToWebSyncBWD();
		helper.setVerbose(true); 
		helper.setConfigurator(new Configurator() {
			
			@Override
			public RuleResult chooseOne(Collection<RuleResult> alternatives) {
				
				alternatives.forEach(rr -> {
					if (rr.isRule(RulesPackage.eINSTANCE.getAddFileAndWebElementRule().getName())) {
						rr.restrictMatchesTo(match -> {
							Directory dir = Directory.class.cast(match.getMatchedObject("dir"));
							
							// 1. Add new files to leaf directories
							//return dir.getSubDirs().isEmpty();
							
							// 2. Add to the empty directory
							//return dir.getFiles().isEmpty();
							
							//3. Add to the root
							return dir.eContainer() == null;
							
							//4. Add to a particular dir
							//return dir.getName().equals("May");
						});
					}
				});
				
				return Configurator.super.chooseOne(alternatives);
			}
		});		

		// Adjust values as required
		String delta = "instances/fwd.trg.delta.xmi";
		String corr  = "instances/fwd.corr.xmi";
		BiConsumer<String, String> synchronizer = helper::syncBackward;
		// Propagate changes
		synchronizer.accept(corr, delta);
	}

	public void syncForward(String corr, String delta) {
		setChangeSrc(executeDeltaSpec(delta));
		loadTriple(corr);
		loadSynchronizationProtocol("instances/fwd.protocol.xmi");
		integrateForward();
		saveResult("fwd");

		System.out.println("Completed forward synchronization");
	}

	public void syncBackward(String corr, String delta) {
		setChangeTrg(executeDeltaSpec(delta));
		loadTriple(corr);
		loadSynchronizationProtocol("instances/fwd.protocol.xmi");
		integrateBackward();
		saveResult("fwd");

		System.out.println("Completed backward synchronization");
	}

	private void loadTriple(String corr) {
		try {
			loadCorr(corr);
			CorrespondenceModel corrModel = (CorrespondenceModel) getCorr();
			setSrc(corrModel.getSource());
			setTrg(corrModel.getTarget());
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load input triple for " + corr + ", " + iae.getMessage());
		}
	}

	private void saveResult(String direction) {
		saveSrc("instances/" + direction + ".src.xmi");
		saveTrg("instances/" + direction + ".trg.xmi");
		saveCorr("instances/" + direction + ".corr.xmi");
		saveSynchronizationProtocol("instances/" + direction + ".protocol.xmi");
	}
}