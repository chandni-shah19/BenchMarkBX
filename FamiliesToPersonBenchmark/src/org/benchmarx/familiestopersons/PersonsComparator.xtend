package org.benchmarx.familiestopersons

import Persons.PersonRegister
import Persons.Male
import org.benchmarx.core.Comparator

import static org.junit.Assert.*
import java.util.Arrays
import Persons.Female
import org.eclipse.emf.common.util.EList
import Persons.Person

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