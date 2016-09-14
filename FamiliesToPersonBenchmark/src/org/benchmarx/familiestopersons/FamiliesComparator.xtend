package org.benchmarx.familiestopersons

import Families.FamilyRegister
import org.benchmarx.core.Comparator
import org.benchmarx.core.NormaliserFamilyModel

import static org.junit.Assert.*
import Families.Family
import java.util.List
import java.util.ArrayList

class FamiliesComparator implements Comparator<FamilyRegister> {
	NormaliserFamilyModel comparator
	
	override compare(FamilyRegister expected, FamilyRegister actual) {
		comparator = new NormaliserFamilyModel();
		assertEquals(familyToString(expected), familyToString(actual))
	}
	
	def familyToString(FamilyRegister families) {
		return '''
		Families {
			«val List<Family> sortedList = new ArrayList<Family>(families.families)»
			«comparator.Normalize(sortedList)»
			«FOR f : sortedList SEPARATOR "\n"»
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

	

