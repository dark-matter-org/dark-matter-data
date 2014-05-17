package org.dmd.dms.tools.generation.meta;

import org.dmd.core.util.DMUncheckedObject;

public class DSClass {
	
	static String dmtPackage = "org.dmd.dms.shared.generated.types.";
	static String dmePackage = "org.dmd.dms.server.extended.";

	// Module Class
	static public String getDmeImport(DMUncheckedObject moduleClass){
		return(dmePackage + moduleClass.getSV("name"));
	}

	// Module Class
	static public String getDmtREFImport(DMUncheckedObject moduleClass){
		return(dmtPackage + moduleClass.getSV("name") + "REF");
	}

}
