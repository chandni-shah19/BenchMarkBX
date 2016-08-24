package org.benchmarx.familiestopersons

import Persons.PersonRegister
import org.benchmarx.core.Comparator

import static org.junit.Assert.*

class PersonsComparator implements Comparator<PersonRegister>{
	
	override compare(PersonRegister expected, PersonRegister actual) {
		assertEquals(personsToString(expected), personsToString(actual))
	}
	
	def personsToString(PersonRegister persons) {
		return '''
		Persons	{
			FOR f : persons.person SEPARATOR "\n"
			Person p.fullname "\n"
		'''
	}
	
}