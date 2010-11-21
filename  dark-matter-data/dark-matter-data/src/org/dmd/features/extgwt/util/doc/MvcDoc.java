package org.dmd.features.extgwt.util.doc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.apache.tools.ant.util.FileUtils;
import org.dmd.features.extgwt.extended.MvcApplication;
import org.dmd.features.extgwt.extended.MvcConfig;
import org.dmd.features.extgwt.extended.MvcController;
import org.dmd.features.extgwt.util.MvcDefinitionManager;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The MvcDoc class will dump the documentation page for an application.
 */
public class MvcDoc {

	MvcDefinitionManager	defManager;
	
	ConfigLocation			location;
	
	String mvcdocDir;
	String outDir;
	
	public MvcDoc(){
		
	}
	
	public void dumpAppDoc(ConfigLocation loc, MvcDefinitionManager dm){
		defManager 	= dm;
		location	= loc;
		
		MvcApplication app = dm.getTheApplication();
		
		initDirs();
		
		String ofn = outDir + File.separator + location.getConfigName() + ".html";
		
		try {
			BufferedWriter out = new BufferedWriter( new FileWriter(ofn) );
		
			ApplicationPage.writeStart(out, app.getName() + " MVC Documentation");
			
			ApplicationListing.writeStart(out, app.getName(), app.getDescription());
			
			
			
			ControllerSummary.writeStart(out);
			
			Iterator<MvcController> controllers = app.getControllers();
			while(controllers.hasNext()){
				MvcController c = controllers.next();
				ControllerSummary.writeControllerEntry(out, c.getName());
			}
			
			ControllerSummary.writeEnd(out);
			
			
			ControllerSection.write(out, app.getControllers());
			
			ControllerSection.writeEnd(out);
			
			
			ApplicationListing.writeEnd(out);
			
			ApplicationPage.writeEnd(out);
			
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the output folder beneath the overall project folder and create a subdirectory
	 * to hold the application documentation. Copy the style file to the output directory.
	 */
	void initDirs(){
		int 	srcPos = location.getDirectory().indexOf("src");
		String 	topdir = location.getDirectory().substring(0, srcPos-1);
		
		mvcdocDir = topdir + File.separator + "mvcdoc";
		
		File mdd = new File(mvcdocDir);
		if (!mdd.exists())
			mdd.mkdir();
		
		outDir = mvcdocDir + File.separator + location.getConfigName();
		
		File odd = new File(outDir);
		if (!odd.exists()){
			odd.mkdir();
			
		}
		
		String style = outDir + File.separator + "mvcstyle.css";
		
		URL url = this.getClass().getResource("mvcstyle.css");
		System.out.println("url: " + url.getFile());

		FileUtils futil = FileUtils.getFileUtils();
		try {
			futil.copyFile(url.getFile(), style);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
