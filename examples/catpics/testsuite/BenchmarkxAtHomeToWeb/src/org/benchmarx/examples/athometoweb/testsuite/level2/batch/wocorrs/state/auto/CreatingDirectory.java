package org.benchmarx.examples.athometoweb.testsuite.level2.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.athometoweb.testsuite.Decisions;
import org.benchmarx.examples.athometoweb.testsuite.AtHomeToWebTestCase;
import org.junit.Test;

import AtHome.Directory;
import OnTheWeb.Web;

public class CreatingDirectory extends AtHomeToWebTestCase  {

	public CreatingDirectory(BXTool<Directory, Web, Decisions> tool) {
		super(tool);
	}

	@Test
	public void testCreateDirectory() {
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(helperDirectory::createJanDirectory);
		//------------
		
		util.assertSource("oneDirectory");
		util.assertTarget("NoChangeWeb");
	}
}
