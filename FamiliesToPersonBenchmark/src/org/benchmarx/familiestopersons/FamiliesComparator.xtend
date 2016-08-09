package org.benchmarx.familiestopersons

import FamiliesModel.Families
import org.benchmarx.core.Comparator

import static org.junit.Assert.*

class FamiliesComparator implements Comparator<Families> {
	
	override compare(Families expected, Families actual) {
		assertEquals(familyToString(expected), familyToString(actual))
	}
	
	def familyToString(Families families) {
		'''
		Families {
			«FOR f : families.family SEPARATOR "\n"»
			Family «f.familyName»
			«ENDFOR»
		}
		'''
	}

		
}
