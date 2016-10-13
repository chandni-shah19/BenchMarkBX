package org.benchmarx.examples.familiestopersons.persons.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Persons.Person;

public class PersonNormaliser implements Comparator<Person>{
	@Override
	public int compare(Person expected, Person actual) {
		return expected.getName().compareTo(actual.getName());
	}

	public void normalize(List<Person> persons){
		Comparator<Person> comparator = new PersonNormaliser();
		Collections.sort(persons, comparator);
	}
}
