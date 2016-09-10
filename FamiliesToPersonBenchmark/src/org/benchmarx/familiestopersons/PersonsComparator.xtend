package org.benchmarx.familiestopersons

import Persons.Male
import Persons.Person
import Persons.PersonRegister
import java.util.ArrayList
import java.util.List
import org.benchmarx.core.Comparator
import org.benchmarx.core.NormaliserPersonModel

import static org.junit.Assert.*

class PersonsComparator implements Comparator<PersonRegister>{
	NormaliserPersonModel comparator
	
	override compare(PersonRegister expected, PersonRegister actual) {
		comparator = new NormaliserPersonModel();
		assertEquals(personsToString(expected), personsToString(actual))
	}
	
	def personsToString(PersonRegister persons) {
		return '''
		Persons	{
			«val List<Person> sortedList = new ArrayList<Person>(persons.persons)»
			«comparator.Normalize(sortedList)»
			«FOR p: sortedList SEPARATOR "\n"»
				«IF p instanceof Male» Male: «p.name»
				«ELSE» Female: «p.name»
				«ENDIF»
			«ENDFOR»
		'''
	}
	
}