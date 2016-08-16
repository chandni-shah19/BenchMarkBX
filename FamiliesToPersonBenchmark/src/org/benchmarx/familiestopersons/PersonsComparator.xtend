package org.benchmarx.familiestopersons

import org.benchmarx.core.Comparator

import PersonsModel.Persons
import static org.junit.Assert.*

class PersonsComparator implements Comparator<Persons>{
	
	override compare(Persons expected, Persons actual) {
		assertEquals(personsToString(expected), personsToString(actual))
	}
	
	def personsToString(Persons persons) {
		return '''
		Persons
		'''
	}
	
}