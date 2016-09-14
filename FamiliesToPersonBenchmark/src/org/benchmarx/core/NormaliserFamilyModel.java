package org.benchmarx.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Families.Family;

public class NormaliserFamilyModel implements Comparator<Family>{

	@Override
	public int compare(Family expected, Family actual) {
		return expected.getName().compareTo(actual.getName());
		
	}

	public void Normalize(List<Family> list1){
		Comparator<Family> comparator = new NormaliserFamilyModel();
		Collections.sort(list1, comparator);
	}
}
