package org.dmd.dms.tools.meta;

import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.core.util.DMUncheckedObject;

public class DSModule {
	
	static String generatedDsdPackage = "org.dmd.dms.server.generated.dsd";

	//	DSDefinitionModule
	static public String getDefinitionManagerImport(DMUncheckedObject module){
		return(generatedDsdPackage + "." + getDefinitionManagerName(module));
	}

	//	DSDefinitionModule
	static public String getDefinitionManagerName(DMUncheckedObject module){
		return(module.getSV("name") + "DefinitionManager");
	}

	//	DSDefinitionModule
	static public String getGeneratorInterfaceImport(DMUncheckedObject module){
		return(generatedDsdPackage + "." + getGeneratorInterfaceName(module));
	}

	//	DSDefinitionModule
	static public String getGeneratorInterfaceName(DMUncheckedObject module){
		return(module.getSV("name") + "GeneratorInterface");
	}

	// DSDefinitionModule
	static public String getDefinitionParserImport(DMUncheckedObject module){
		return(generatedDsdPackage + "." + getDefinitionParserName(module));
	}

	// DSDefinitionModule
	static public String getDefinitionParserName(DMUncheckedObject module){
		return(module.getSV("name") + "Parser");
	}

	// DSDefinitionModule
	static public String getGlobalInterfaceImport(DMUncheckedObject module){
		return(generatedDsdPackage + "." + getGlobalInterfaceName(module));
	}

	// DSDefinitionModule
	static public String getGlobalInterfaceName(DMUncheckedObject module){
		return(module.getSV("name") + "GlobalInterface");
	}

	// DSDefinitionModule
	static public String getGeneratedDsdPackage(DMUncheckedObject module){
		return(generatedDsdPackage);
	}

	// DSDefinitionModule
	static public Iterator<DMUncheckedObject> getDDMDependencies(DMUncheckedObject module){
		// In reality this would gather all of the refers to defs from DSD stuff all the
		// way up the hierachy, but in this case, it only depends on the meta DSD so 
		// we fake it out
		ArrayList<DMUncheckedObject>	dep = new ArrayList<DMUncheckedObject>();
		dep.add(module);
		return(dep.iterator());
	}
}
