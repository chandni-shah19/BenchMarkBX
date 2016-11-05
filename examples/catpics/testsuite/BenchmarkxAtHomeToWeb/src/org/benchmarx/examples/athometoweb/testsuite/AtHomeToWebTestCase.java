package org.benchmarx.examples.athometoweb.testsuite;

import java.util.Arrays;
import java.util.Collection;

import org.benchmarx.BXTool;
import org.benchmarx.BenchmarxUtil;
import org.benchmarx.Comparator;

import org.benchmarx.examples.athometoweb.athome.core.AtHomeComparator;
import org.benchmarx.examples.athometoweb.athome.core.AtHomeHelper;
import org.benchmarx.examples.athometoweb.implementations.emoflon.EmoflonAtHomeToWeb;
import org.benchmarx.examples.athometoweb.ontheweb.core.OnTheWebComparator;
import org.benchmarx.examples.athometoweb.ontheweb.core.OnTheWebHelper;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import AtHome.Directory;
import OnTheWeb.Web;

@RunWith(Parameterized.class)
public abstract class AtHomeToWebTestCase {
	protected BXTool<Directory, Web, Decisions> tool;
	protected Comparator<Directory> directoryComparator;
	protected Comparator<Web> webComparator;
	protected BenchmarxUtil<Directory, Web, Decisions> util;
	protected AtHomeHelper helperDirectory;
	protected OnTheWebHelper helperWeb;
	
	@Before
	public void initialise() {
		directoryComparator = new AtHomeComparator();
		webComparator = new OnTheWebComparator();
		util = new BenchmarxUtil<>(directoryComparator, webComparator, tool);
		helperDirectory = new AtHomeHelper();
		helperWeb = new OnTheWebHelper();
	}
	
	@Parameters
	public static Collection<BXTool<Directory, Web, Decisions>> tools() {
		return Arrays.asList(
				new EmoflonAtHomeToWeb()
			);
	}

	protected AtHomeToWebTestCase(BXTool<Directory, Web, Decisions> tool) {
		this.tool = tool; 
	}
}
