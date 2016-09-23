package org.benchmarx.examples.familiestopersons.persons

import Persons.Male
import Persons.Person
import Persons.PersonRegister
import java.util.ArrayList
import java.util.List
import org.benchmarx.core.Comparator

import static org.junit.Assert.*

public class PersonsComparator implements Comparator<PersonRegister>{
	PersonNormaliser comparator
	
	override compare(PersonRegister expected, PersonRegister actual) {
		comparator = new PersonNormaliser();
		assertEquals(personsToString(expected), personsToString(actual))
	}
	
	def personsToString(PersonRegister persons) {
		return '''
		Persons	{
			«val List<Person> sortedList = new ArrayList<Person>(persons.persons)»
			«comparator.normalize(sortedList)»
			«FOR p: sortedList SEPARATOR "\n"»
				«IF p instanceof Male»
				 Male: «p.name»
				 Birthday: «p.birthday»
				«ELSE»
				Female: «p.name»
				Birthday: «p.birthday»
				«ENDIF»
			«ENDFOR»
		'''
	}
	
}
