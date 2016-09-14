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

	public void Normalize(List<Person> list1){
		Comparator<Person> comparator = new NormaliserPersonModel();
		Collections.sort(list1, comparator);
	}
}
