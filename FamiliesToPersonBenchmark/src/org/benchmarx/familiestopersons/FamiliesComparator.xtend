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
			FamilyMember Father: «IF f.father != null»«f.father.name»«ENDIF»
			FamilyMember Mother: «IF f.mother != null»«f.mother.name»«ENDIF»
				«FOR f_Son : f.sons SEPARATOR "\n"»
					FamilyMember Son «f_Son.name» "\n"
				«ENDFOR»
				«FOR f_Daughter : f.daughters SEPARATOR "\n"»
					FamilyMember Daughter «f_Daughter.name» "\n"
				«ENDFOR»
			«ENDFOR»
		}
		'''
	}
}
