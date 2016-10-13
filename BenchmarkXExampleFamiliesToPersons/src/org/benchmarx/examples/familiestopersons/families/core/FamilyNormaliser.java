package org.benchmarx.examples.familiestopersons.families.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Families.Family;

public class FamilyNormaliser implements Comparator<Family>{

	@Override
	public int compare(Family expected, Family actual) {
		return expected.getName().compareTo(actual.getName());
	}

	public void normalize(List<Family> families){
		Comparator<Family> comparator = new FamilyNormaliser();
		Collections.sort(families, comparator);
	}
}
