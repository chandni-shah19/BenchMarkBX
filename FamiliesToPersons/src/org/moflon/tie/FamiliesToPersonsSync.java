package org.moflon.tie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.EList;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.MatchInfo;
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.algorithm.datastructures.PrecedenceInputGraph;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;


import org.moflon.tgg.runtime.CorrespondenceModel;

import FamiliesModel.Family;
import FamiliesModel.FamilyMember;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;

import FamiliesToPersons.FamiliesToPersonsPackage;
import PersonsModel.Person;
import PersonsModel.PersonsModelPackage;


public class FamiliesToPersonsSync extends SynchronizationHelper{

   public FamiliesToPersonsSync()
   {
      super(FamiliesToPersonsPackage.eINSTANCE, ".");
   }
	
	public static void main(String[] args) throws IOException {
		// Create helper
		BasicConfigurator.configure();
		FamiliesToPersonsSync helper = new FamiliesToPersonsSync();
		//helper.setConfigurator(new PGSavingConfigurator(helper, "instances/pg.xmi"));
		helper.verbose = true;
		helper.setConfigurator(new Configurator() {
			@Override
			public RuleResult chooseOne(Collection<RuleResult> alternatives) {
				
				if(alternatives.size() == 1)
					return Configurator.super.chooseOne(alternatives);
				
				ArrayList<RuleResult> results = new ArrayList<RuleResult>();
				ArrayList[] infos = new ArrayList[alternatives.size()];
				
				System.out.println("Found multiple applicable rules:");
				int i=0;
				for (RuleResult rr : alternatives) {					
					results.add(rr);
					
					int j=0;
					if(!rr.getRule().contains("Existing"))
						System.out.println(i+": "+rr.getRule());
					if(rr.getRule().contains("Existing")) {
						ArrayList<MatchInfo> info = new ArrayList<MatchInfo>();
						infos[i] = info;
						rr.restrictMatchesTo(m -> {
							Family family = (Family) m.getMatchedObject("f");
							Person p = (Person) m.getMatchedObject("p");
							if(p.getFullName().contains(family.getFamilyName())) {
								info.add(m);
								return true;
							}
							return false;
						});
						for(MatchInfo m: info ) {
							Family family = (Family) m.getMatchedObject("f");
							System.out.print(i+":"+j+": "+rr.getRule()+" - "+family.getFamilyName()+ " (");
							FamilyMember father = family.getFather();
							if(father != null)
								System.out.print(father.getFirstName());
							FamilyMember mother = family.getMother();
							if(mother != null)
								System.out.print(", "+mother.getFirstName());
							EList<FamilyMember> sons = family.getSons();
							for(FamilyMember s: sons) {
								System.out.print(", "+s.getFirstName());
							}
							EList<FamilyMember> daughters = family.getDaughters();
							for(FamilyMember d: daughters) {
								System.out.print(", "+d.getFirstName());
							}
							System.out.println(")");
							j++;
						}
						
						
					}
					i++;
				}
				BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			    try {
					String s = bufferRead.readLine();
					String[] subs = s.split(":");
					if(subs.length == 2) {
						int rule = Integer.parseInt(subs[0]);
						int subrule = Integer.parseInt(subs[1]);
						RuleResult rr = results.get(rule);
						rr.restrictMatchesTo(m -> {
							return m == infos[rule].get(subrule);
						});
						return rr;
					}
					else {
						int result = Integer.parseInt(s);
						return results.get(result);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
					return Configurator.super.chooseOne(alternatives);
				}				
			}
		});
		
		
		// Adjust values as required
		boolean forward;
		
		System.out.println("Forward (f) or backward (b)?");
		
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferRead.readLine();
		if(s.startsWith("f")) {
			forward = true;
		}
		else {
			if(s.startsWith("b")) {
				forward = false;
			}
			else {
				return;
			}
		}
		
		if(forward) {
			String delta = "instances/fwd.src.delta.xmi";
			String corr  = "instances/fwd.corr.xmi";
			BiConsumer<String, String> synchronizer = helper::syncForward;
			// Propagate changes
			synchronizer.accept(corr, delta);
		}
		else {
			String delta = "instances/fwd.trg.delta.xmi";
			String corr  = "instances/fwd.corr.xmi";
			BiConsumer<String, String> synchronizer = helper::syncBackward;
			// Propagate changes
			synchronizer.accept(corr, delta);
		}		
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