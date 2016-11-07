package org.benchmarx.examples.athometoweb.testsuite.level3_n.batch.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.athometoweb.testsuite.Decisions;
import org.benchmarx.examples.athometoweb.testsuite.AtHomeToWebTestCase;
import org.junit.Test;

import AtHome.Directory;
import OnTheWeb.Web;

public class CreatingDirectoryAndFiles extends AtHomeToWebTestCase {

	public CreatingDirectoryAndFiles(BXTool<Directory, Web, Decisions> tool) {
		super(tool);
	}

	@Test
	public void testCreateFile() {
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperDirectory::createJanDirectory)
				.andThen(helperDirectory::createFilePalindrome));
		//------------
		
		util.assertSource("OneDirectoryAndFile");
		util.assertTarget("OneWebElement");
	}
}
