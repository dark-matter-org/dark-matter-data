package org.dmd.dms.doc.web;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;

public class DmsHtmlDocGenerator {
	
	TreeMap<Integer,SchemaDefinition>	allSchemasByID;
	
	TreeMap<String,SchemaDefinition>	allSchemasByName;
	
	int longest;
	
	public DmsHtmlDocGenerator(){
		allSchemasByID 		= new TreeMap<Integer, SchemaDefinition>();
		allSchemasByName 	= new TreeMap<String, SchemaDefinition>();
		longest = 0;
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
				
				allSchemasByID.put(sd.getSchemaBaseID(), sd);
				if (sd.getName().getNameString().length() > longest)
					longest = sd.getName().getNameString().length();
				
				SchemaPage.dumpSchemaPage(outdir, sm, sd);
			}
		}
		
		
	}
	
	public void dumpSummary(){
		try {
			SchemaManager manager = new SchemaManager();
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintfFormat format = new PrintfFormat("%-" + longest + "s");
		
		for(SchemaDefinition sd: allSchemasByID.values()){
			int end = sd.getSchemaBaseID() + sd.getSchemaIDRange();
			System.out.println(format.sprintf(sd.getName()) + " " + sd.getSchemaBaseID() +  " - " + end);
		}
	
	}
	
	void initDirs(String outdir){
		File dmsdocdir = new File(outdir);
		if (!dmsdocdir.exists())
			dmsdocdir.mkdir();
	}
}
