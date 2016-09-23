package org.benchmarx.examples.familiestopersons.families

import Families.Family
import Families.FamilyRegister
import java.util.ArrayList
import java.util.List
import org.benchmarx.core.Comparator

import static org.junit.Assert.*

public class FamiliesComparator implements Comparator<FamilyRegister> {
	FamilyNormaliser comparator
	
	override compare(FamilyRegister expected, FamilyRegister actual) {
		comparator = new FamilyNormaliser();
		assertEquals(familyToString(expected), familyToString(actual))
	}
	
	def familyToString(FamilyRegister families) {
		return '''
		Families {
			«val List<Family> sortedList = new ArrayList<Family>(families.families)»
			«comparator.normalize(sortedList)»
			«FOR f : sortedList SEPARATOR "\n"»
			Family «f.name»
			  Father: «IF f.father != null»«f.father.name»«ENDIF»
			  Mother: «IF f.mother != null»«f.mother.name»«ENDIF»
				«FOR f_Son : f.sons SEPARATOR "\n"»
				  Son «f_Son.name»
				«ENDFOR»
				«FOR f_Daughter : f.daughters SEPARATOR "\n"»
				  Daughter «f_Daughter.name»
				«ENDFOR»
			«ENDFOR»
		}
		'''
	}
}

	

