//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.features.extgwt.util.doc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.apache.tools.ant.util.FileUtils;
import org.dmd.features.extgwt.extended.MvcApplication;
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
			
			ApplicationListing.writeStart(out, app.getName().getNameString(), app.getDescription());
			
			
			
			ControllerSummary.writeStart(out);
			
			for(MvcController c: app.getControllersIterable()){
//			Iterator<MvcController> controllers = app.getControllers();
//			while(controllers.hasNext()){
//				MvcController c = controllers.next();
				ControllerSummary.writeControllerEntry(out, c.getName().getNameString());
			}
			
			ControllerSummary.writeEnd(out);
			
			
			ControllerSection.write(out, app.getControllersIterable());
			
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
