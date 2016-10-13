package org.benchmarx.examples.familiestopersons.families.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Families.FamilyMember;

public class FamilyMemberNormaliser implements Comparator<FamilyMember>{

	@Override
	public int compare(FamilyMember expected, FamilyMember actual) {
		return expected.getName().compareTo(actual.getName());
	}

	public void normalize(List<FamilyMember> familyMember){
		Comparator<FamilyMember> comparator = new FamilyMemberNormaliser();
		Collections.sort(familyMember, comparator);
	}
}
