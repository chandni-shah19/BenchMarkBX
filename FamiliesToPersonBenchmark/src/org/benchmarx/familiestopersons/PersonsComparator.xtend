package org.benchmarx.familiestopersons

import Persons.PersonRegister

import Persons.Male
import org.benchmarx.core.Comparator

import static org.junit.Assert.*
import java.util.*
import java.util.Arrays
import Persons.Female
import Persons.Male
import org.eclipse.emf.common.util.EList
import Persons.Person
import org.eclipse.emf.common.util.ECollections
import java.util.List
import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.common.util.BasicEList

class PersonsComparator implements Comparator<PersonRegister>{
	
	override compare(PersonRegister expected, PersonRegister actual) {
		assertEquals(personsToString(expected), personsToString(actual))
	}
	
	
	def personsToString(PersonRegister persons) {
		return '''
		Persons	{
			«FOR p: persons.persons SEPARATOR "\n"»
				«IF p instanceof Male» Male:
				«ELSE» Female: 
				«ENDIF»
				«p.name»
			«ENDFOR»
		'''
	}
	
}