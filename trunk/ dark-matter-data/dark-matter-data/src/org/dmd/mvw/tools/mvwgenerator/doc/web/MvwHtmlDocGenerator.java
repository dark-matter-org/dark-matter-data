package org.dmd.mvw.tools.mvwgenerator.doc.web;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.dmd.dmc.DmcOmni;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.util.MvwDefinitionManager;
import org.dmd.util.exceptions.DebugInfo;

public class MvwHtmlDocGenerator {
	
	String outdir;
	
	MvwDefinitionManager defManager;

	public MvwHtmlDocGenerator(MvwDefinitionManager dm){
		defManager = dm;
	}

	public void dumpDocumentation(String od) throws IOException {
		outdir = od + File.separator + "mvw";
		
		DebugInfo.debug("Generating MVW documentation: " + outdir);
		
		Summarizer summary = new Summarizer(defManager,od);
		
		initDirs();

		URL url = this.getClass().getResource("mvwstyle.css");
		DebugInfo.debug("url: " + url.getFile());
		FileUtils.copyURLToFile(url, new File(outdir + File.separator + "mvwstyle.css"));
		
		DmcOmni.instance().backRefTracking(true);
		defManager.prepAggregatedInfo();
		
		for (Module module: defManager.getModules().values()){
			ModulePage.dumpModule(outdir, module, summary);
		}
		
		summary.dumpSummaryFiles();
	}
	
	void initDirs(){
		File dmsdocdir = new File(outdir);
		if (!dmsdocdir.exists())
			dmsdocdir.mkdir();
	}

}
