package org.benchmarx.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Persons.Person;

public class NormaliserPersonModel implements Comparator<Person>{
	@Override
	public int compare(Person expected, Person actual) {
		return expected.getName().compareTo(actual.getName());
	}

	@SuppressWarnings("unchecked")
	public void Normalize(List list1){
		Comparator<Person> comparator = new NormaliserPersonModel();
		Collections.sort(list1, comparator);
	}
}
