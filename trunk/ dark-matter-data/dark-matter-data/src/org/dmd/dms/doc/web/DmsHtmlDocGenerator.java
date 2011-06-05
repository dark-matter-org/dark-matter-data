package org.dmd.dms.doc.web;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;

public class DmsHtmlDocGenerator {
	
	public DmsHtmlDocGenerator(){
		
	}

	public void dumpSchemaDoc(String outdir, SchemaManager sm) throws IOException {
		DebugInfo.debug(outdir);
		
		URL url = this.getClass().getResource("dmsstyle.css");
		DebugInfo.debug("url: " + url.getFile());
		FileUtils.copyURLToFile(url, new File(outdir + File.separator + "dmsstyle.css"));

		
		initDirs(outdir);
		
		Iterator<SchemaDefinition> sdit = sm.getSchemas();
		if (sdit != null){
			while(sdit.hasNext()){
				SchemaDefinition sd = sdit.next();
				
				SchemaPage.dumpSchemaPage(outdir, sm, sd);
			}
		}
		
	}
	
	void initDirs(String outdir){
		File dmsdocdir = new File(outdir);
		if (!dmsdocdir.exists())
			dmsdocdir.mkdir();
	}
}
