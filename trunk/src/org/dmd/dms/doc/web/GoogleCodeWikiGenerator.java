package org.dmd.dms.doc.web;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;

public class GoogleCodeWikiGenerator {

	TreeMap<Integer,SchemaDefinition>	allSchemasByID;
	
	TreeMap<String,SchemaDefinition>	allSchemasByName;
	
	int longest;
	
	public GoogleCodeWikiGenerator(){
		allSchemasByID 		= new TreeMap<Integer, SchemaDefinition>();
		allSchemasByName 	= new TreeMap<String, SchemaDefinition>();
		longest = 0;
		DmcOmni.instance().setTrackSchemaReferences(true);
		DmcOmni.instance().backRefTracking(true);

	}

	public void addReadSchemas(SchemaManager sm) throws IOException {
				
		Iterator<SchemaDefinition> sdit = sm.getSchemas();
		if (sdit != null){
			while(sdit.hasNext()){
				SchemaDefinition sd = sdit.next();
				
				allSchemasByID.put(sd.getSchemaBaseID(), sd);
				allSchemasByName.put(sd.getName().getNameString(), sd);
				
				if (sd.getName().getNameString().length() > longest)
					longest = sd.getName().getNameString().length();
			}
		}
		
		
	}

	public void dumpDocumentation(String outdir) throws IOException {
		DebugInfo.debug(outdir);
		
		initDirs(outdir);

//		URL url = this.getClass().getResource("dmsstyle.css");
//		DebugInfo.debug("url: " + url.getFile());
//		FileUtils.copyURLToFile(url, new File(outdir + File.separator + "dmsstyle.css"));

		
		try {
			SchemaManager manager = new SchemaManager();
			
			for(SchemaDefinition sd: allSchemasByID.values()){
				if (manager.isSchema(sd.getName().getNameString()) == null)
					manager.manageSchemaInternal(sd,false);
			}
			
			Summarizer summarizer = new Summarizer(manager,outdir);
			
			summarizer.dumpTextSummary();
			
			PrintfFormat format = new PrintfFormat("%-" + longest + "s");
			
			for(SchemaDefinition sd: allSchemasByID.values()){
				int end = sd.getSchemaBaseID() + sd.getSchemaIDRange();
				System.out.println(format.sprintf(sd.getName()) + " " + sd.getSchemaBaseID() +  " - " + end);
				
				SchemaPage.dumpSchemaPage(outdir, manager, sd, summarizer);
			}
						
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void initDirs(String outdir){
		File wikidocdir = new File(outdir);
		if (!wikidocdir.exists())
			wikidocdir.mkdir();
	}

}
