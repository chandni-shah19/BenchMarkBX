package org.benchmarx.core;

import java.util.HashMap;
import java.util.Map;

public class Configurator<D> {
	
	private Map<D, Boolean> decisions = new HashMap<>();
	
	public boolean decide(D decision){
		if(decisions.containsKey(decision))
			return decisions.get(decision);
		else
			throw new IllegalArgumentException("I don't know how to handle: " + decision);
	}
	
	public Map<D, Boolean> getDecisions(){
		return decisions;
	}
}
