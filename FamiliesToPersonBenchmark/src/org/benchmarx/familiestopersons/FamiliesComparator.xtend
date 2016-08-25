package org.benchmarx.familiestopersons

import Families.FamilyRegister
import Families.Family;
import Families.FamilyMember;
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
				«FOR f_Daughter : families.families.get(0).daughters SEPARATOR "\n"»
					FamilyMember Daughter «f_Daughter.name» "\n"
				«ENDFOR»
				«FOR f_Son : families.families.get(0).sons SEPARATOR "\n"»
					FamilyMember Daughter «f_Son.name» "\n"
				«ENDFOR»
			«ENDFOR»
			
		}
		'''
	}
}
