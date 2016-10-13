package org.benchmarx.examples.familiestopersons.families.core

import Families.Family
import Families.FamilyRegister
import java.util.ArrayList
import java.util.List
import org.benchmarx.core.Comparator

import static org.junit.Assert.*
import Families.FamilyMember

public class FamiliesComparator implements Comparator<FamilyRegister> {
	FamilyNormaliser comparator
	FamilyMemberNormaliser familyMemberComparator
	
	override compare(FamilyRegister expected, FamilyRegister actual) {
		comparator = new FamilyNormaliser();
		familyMemberComparator = new FamilyMemberNormaliser();
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
			«val List<FamilyMember> sortedListOfSon = new ArrayList<FamilyMember>(f.sons)»
			«familyMemberComparator.normalize(sortedListOfSon)»	
				«FOR f_Son : sortedListOfSon SEPARATOR "\n"»
				  Son «f_Son.name»
				«ENDFOR»
			«val List<FamilyMember> sortedListOfDaughter = new ArrayList<FamilyMember>(f.daughters)»
			«familyMemberComparator.normalize(sortedListOfDaughter)»	
				«FOR f_Daughter : sortedListOfDaughter SEPARATOR "\n"»
				  Daughter «f_Daughter.name»
				«ENDFOR»
			«ENDFOR»
		}
		'''
	}
}

	

