package org.benchmarx.familiestopersons

import Families.FamilyRegister
import org.benchmarx.core.Comparator

import static org.junit.Assert.*

class FamiliesComparator implements Comparator<FamilyRegister> {
	
	override compare(FamilyRegister expected, FamilyRegister actual) {
		assertEquals(familyToString(expected), familyToString(actual))
	}
	
	def familyToString(FamilyRegister families) {
		return '''
		Families {
			«FOR f : families.families SEPARATOR "\n"»
			Family «f.name»  "\n"
			FamilyMember «IF f.father != null»«f.father.name»«ENDIF»
			«ENDFOR»
			
		}
		'''
	}
}
