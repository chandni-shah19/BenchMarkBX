package org.benchmarx.examples.athometoweb.testsuite.level3_n.incr.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.athometoweb.testsuite.Decisions;
import org.benchmarx.examples.athometoweb.testsuite.AtHomeToWebTestCase;
import org.junit.Test;

import AtHome.Directory;
import OnTheWeb.Web;

public class CreatingMultipleFiles extends AtHomeToWebTestCase {

	public CreatingMultipleFiles(BXTool<Directory, Web, Decisions> tool) {
		super(tool);
	}

	@Test
	public void testCreateAnotherFile() {
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperDirectory::createJanDirectory)
				.andThen(helperDirectory::createFilePalindrome));
		tool.performAndPropagateSourceEdit(helperDirectory::createFileGamer);
		//------------
		
		util.assertSource("OneDirectoryMoreFile");
		util.assertTarget("MoreWebElement");
	}
	
	@Test
	public void testCreateDirectoryAndFile() {
		tool.initiateSynchronisationDialogue();
		
		//------------
		tool.performAndPropagateSourceEdit(helperDirectory::createMayDirectoryWithFile);
		//------------
		
		util.assertSource("DirectoryFileTogetherCreated");
		util.assertTarget("WebElementMay");		
	}
}
