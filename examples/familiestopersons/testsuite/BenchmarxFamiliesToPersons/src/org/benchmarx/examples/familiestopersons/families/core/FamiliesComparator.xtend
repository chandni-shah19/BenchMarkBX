package org.benchmarx.examples.familiestopersons.families.core

import Families.Family
import Families.FamilyRegister
import java.util.ArrayList
import java.util.List
import org.benchmarx.Comparator

import static org.junit.Assert.*
import Families.FamilyMember

public class FamiliesComparator implements Comparator<FamilyRegister> {
	FamilyNormaliser comparator
	FamilyMemberNormaliser familyMemberComparator
	
	override compare(FamilyRegister expected, FamilyRegister actual) {
		comparator = new FamilyNormaliser();
		familyMemberComparator = new FamilyMemberNormaliser();
		
		assertTrue(familyToString(expected).startsWith("FamilyRegister"))
		assertEquals(familyToString(expected), familyToString(actual))
	}
	
	def familyToString(FamilyRegister families) {
		return '''
		FamilyRegister {
		    families = [
		    «val List<Family> sortedList = new ArrayList<Family>(families.families)»
		    «comparator.normalize(sortedList)»
				«FOR f : sortedList SEPARATOR ", "»
				Family {
				      familyName = «f.name»
				    , father     = «familyMember(f.father)»
				    , mother     = «familyMember(f.mother)»
			  		«val List<FamilyMember> sortedListOfSon = new ArrayList<FamilyMember>(f.sons)»
			  		«familyMemberComparator.normalize(sortedListOfSon)»
				    , sons       = [«FOR son : sortedListOfSon SEPARATOR ", "»«familyMember(son)»«ENDFOR»]
			  		«val List<FamilyMember> sortedListOfDaughter = new ArrayList<FamilyMember>(f.daughters)»
			  		«familyMemberComparator.normalize(sortedListOfDaughter)»
					, daughters  = [«FOR daughter : sortedListOfDaughter SEPARATOR ", "»«familyMember(daughter)»«ENDFOR»]
				}
			«ENDFOR»
			]
		}
		'''
	}
	
	def familyMember(FamilyMember fm){
		return '''«IF fm != null»Just (FamilyMember { firstName = «fm.name» })«ELSE»Nothing«ENDIF»'''
	}
}

	

