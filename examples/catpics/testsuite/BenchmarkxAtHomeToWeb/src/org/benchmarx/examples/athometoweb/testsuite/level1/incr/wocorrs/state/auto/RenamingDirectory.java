package org.benchmarx.examples.athometoweb.testsuite.level1.incr.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.athometoweb.testsuite.Decisions;
import org.benchmarx.examples.athometoweb.testsuite.AtHomeToWebTestCase;
import org.junit.Test;

import AtHome.Directory;
import OnTheWeb.Web;


public class RenamingDirectory extends AtHomeToWebTestCase {

	public RenamingDirectory(BXTool<Directory, Web, Decisions> tool) {
		super(tool);
	}

	@Test
	public void testNameChangeDirectoryEmpty() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(helperDirectory::createJanDirectory);
		
		//------------
		tool.performAndPropagateSourceEdit(helperDirectory::directoryJanNameChangeEmpty);
		//------------
		
		util.assertSource("NameChangeDirectoryEmpty");
		util.assertTarget("NoChangeWeb");
	}

}
