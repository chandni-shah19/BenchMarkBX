package org.benchmarx.familiestopersons

import FamiliesModel.Families
import FamiliesModel.Family;
import org.benchmarx.core.Comparator

import static org.junit.Assert.*

class FamiliesComparator implements Comparator<Families> {
	
	override compare(Families expected, Families actual) {
		assertEquals(familyToString(expected), familyToString(actual))
		System.out.println("Expected="+familyToString(expected));
		System.out.println("Actual="+familyToString(actual));
	}
	
	def familyToString(Families families) {
		return '''
		Families {
			«FOR f : families.family SEPARATOR "\n"»
			Family «f.familyName»  "\n"
			«f.father.firstName»
			«ENDFOR»
			
		}
		'''
	}
	
	

		
}
