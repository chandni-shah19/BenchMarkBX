package org.benchmarx.examples.athometoweb.testsuite.level1.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.athometoweb.testsuite.Decisions;
import org.benchmarx.examples.athometoweb.testsuite.AtHomeToWebTestCase;
import org.junit.Test;

import AtHome.Directory;
import OnTheWeb.Web;

public class Initialisation extends AtHomeToWebTestCase {

	public Initialisation(BXTool<Directory, Web, Decisions> tool) {
		super(tool);
	}

	@Test
	public void testInitialiseSynchronisation()
	{
		//------------
		tool.initiateSynchronisationDialogue();
		//------------
		
		util.assertSource("RootElementDirectory");
		util.assertTarget("RootElementWeb");
	}
	
}
