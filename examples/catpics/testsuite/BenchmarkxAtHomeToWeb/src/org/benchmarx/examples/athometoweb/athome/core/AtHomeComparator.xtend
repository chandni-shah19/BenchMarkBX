package org.benchmarx.examples.athometoweb.athome.core

import AtHome.Directory
import org.benchmarx.Comparator

import static org.junit.Assert.*

class AtHomeComparator implements Comparator<Directory> {
	
	override compare(Directory expected, Directory actual) {
		assertEquals(AtHomeToString(expected), AtHomeToString(actual))
	}
	
	def AtHomeToString(Directory directories) {
		return '''
		DirectoryRoot {
			Directories = [
			«FOR dir: directories.subDirs»
			Directory {
				name = «dir.name»
				«FOR fl:dir.files»
				Files {
					picture = «fl.picture»
					}
				«ENDFOR»
				}
			«ENDFOR»
			]
		}
		'''
	}
}