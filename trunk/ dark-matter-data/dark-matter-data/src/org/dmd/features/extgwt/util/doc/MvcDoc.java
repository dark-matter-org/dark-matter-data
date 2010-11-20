package org.dmd.features.extgwt.util.doc;

import org.dmd.features.extgwt.extended.MvcApplication;
import org.dmd.features.extgwt.extended.MvcConfig;
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
	}
	
	void initDirs(){
		int srcPos = location.getDirectory().indexOf("src");
		String topdir = location.getDirectory().substring(0, srcPos);
	}
}
