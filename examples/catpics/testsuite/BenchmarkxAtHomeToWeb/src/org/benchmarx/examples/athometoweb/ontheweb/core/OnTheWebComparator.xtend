package org.benchmarx.examples.athometoweb.ontheweb.core

import OnTheWeb.OnTheWebFactory;
import OnTheWeb.Tag;
import OnTheWeb.Web;
import OnTheWeb.WebElement;

import static org.junit.Assert.*
import org.benchmarx.Comparator

class OnTheWebComparator implements Comparator<Web>{
	
	override compare(Web expected, Web actual) {
		assertTrue(OnTheWebToString(expected).startsWith("Web"))
		assertEquals(OnTheWebToString(expected), OnTheWebToString(actual))
	}
	
	def OnTheWebToString(Web elements) {
		return '''
		Web {
			WebElemets = [
			«FOR we : elements.elements»
			 picture = «we.picture»
			«ENDFOR»
			]
		}
		'''
	}
	
}