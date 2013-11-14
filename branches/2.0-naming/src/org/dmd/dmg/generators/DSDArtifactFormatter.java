//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmg.generators;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DSDefinitionModule;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmw.DSDefinitionModuleIterableDMW;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.ManagedFileWriter;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The DSDArtifactFormatter will generate a variety of artifacts based on the specification of
 * a DSDefinitionModule. This includes a definition manager for the DSD and a DSD parser.
 */
public class DSDArtifactFormatter {

	String						fileHeader;
	PrintStream					progress;
	
	public DSDArtifactFormatter(){
		
	}
	
	/**
	 * This method will determine if the schema for which we're generating artifacts
	 * includes any DSD module definitions and, if so, will generate the classes
	 * that provide base DSD functionality.
	 * @param config
	 * @param loc
	 * @param f
	 * @param sd the schema to load from the DMG config
	 * @param sm
	 * @throws IOException  
	 */
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaDefinition sd, SchemaManager sm) throws IOException {
		DebugInfo.debug(loc.toString());
		
		DebugInfo.debug(config.toOIF());
		
		if (sm.getDSDefinitionModulesCount() > 0){
			
			String dirname = checkOutputDirectory(loc);
			
			Iterator<DSDefinitionModule> it =  sm.getDSDefinitionModules();
			while(it.hasNext()){
				DSDefinitionModule module = it.next();
				DebugInfo.debug("DSDMODULE " + module.getName().getNameString());
				
				// We only generate code for modules defined in the schema that
				// was specified as part of the DMG config
				if (module.getDefinedIn().getName().equals(sd.getName())){
					generateDefinitionManager(config, dirname, module);
					generateParser(config, dirname, module);
				}
			}
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	void generateDefinitionManager(DmgConfigDMO config, String dir, DSDefinitionModule ddm) throws IOException {
		if (fileHeader != null)
			FileUpdateManager.instance().fileHeader(fileHeader);
		
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "DefinitionManager.java");
		
		ImportManager imports = new ImportManager();
		
		// When we build up the set of imports we'll need, we also build the complete set of
		// modules from which we'll need definitions.
		TreeMap<String,DSDefinitionModule> includedModules = new TreeMap<String, DSDefinitionModule>();
		
		getImportsForDefinitions(imports, ddm, includedModules);
		
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		imports.addImport("org.dmd.dmc.definitions.DmcDefinitionSet", "Our base to provide definition set storage");
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + ddm.getName() + "DefinitionManager {\n\n");
		
		dumpDefinitionManagerMembers(out, includedModules);
		
		out.write("    " + ddm.getName() + "DefinitionManager(){\n\n");
		
		initializeDefinitionManagerMembers(out, includedModules);
		
		out.write("    }\n\n");
		
		out.write("}\n\n");
		
		out.close();
	}
	
	/**
	 * This method will call itself recursively until we've progressed through all
	 * dependencies of a given DSD module via the refersToDefsFromDSD attribute.
	 * @param imports place to gather imports
	 * @param ddm the definition for which we're gathering imports
	 * @param includedModules the names of modules from which we've already gathered import info
	 */
	void getImportsForDefinitions(ImportManager imports, DSDefinitionModule ddm, TreeMap<String, DSDefinitionModule> includedModules){
		ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
		
		imports.addImport(dsd.getDmeImport(), "A definition from the " + ddm.getName() + " Module");
		
		for(ClassDefinition cd : dsd.getDerivedClasses()){
			imports.addImport(cd.getDmeImport(), "A definition from the " + ddm.getName() + " Module");
		}
		
		includedModules.put(ddm.getName().getNameString(),ddm);
		
		if (ddm.getRefersToDefsFromDSDSize() > 0){
			DSDefinitionModuleIterableDMW it = ddm.getRefersToDefsFromDSD();
			while(it.hasNext()){
				DSDefinitionModule module = it.next();
				if (includedModules.get(module.getName().getNameString()) == null)
					getImportsForDefinitions(imports, module, includedModules);
			}
		}
	}
	
	void dumpDefinitionManagerMembers(ManagedFileWriter out, TreeMap<String,DSDefinitionModule> modules) throws IOException {
		for(DSDefinitionModule ddm : modules.values()){
			ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
			
			out.write("    DmcDefinitionSet<" + dsd.getName() + "> " + dsd.getName() + "Defs;\n");
			
			for(ClassDefinition cd : dsd.getDerivedClasses()){
				out.write("    DmcDefinitionSet<" + cd.getName() + "> " + cd.getName() + "Defs;\n");			
			}
		}
		out.write("\n");
	}
	
	void initializeDefinitionManagerMembers(ManagedFileWriter out, TreeMap<String,DSDefinitionModule> modules) throws IOException {
		for(DSDefinitionModule ddm : modules.values()){
			ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
			
			out.write("        " + dsd.getName() + "Defs = new DmcDefinitionSet<" + dsd.getName() + ">();\n");
			
			for(ClassDefinition cd : dsd.getDerivedClasses()){
				out.write("        " + cd.getName() + "Defs = new DmcDefinitionSet<" + cd.getName() + ">();\n");
			}
		}
		out.write("\n");
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	
	void generateParser(DmgConfigDMO config, String dir, DSDefinitionModule ddm) throws IOException {
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "Parser.java");
		
		ImportManager imports = new ImportManager();
		
		imports.addImport("org.dmd.dms.SchemaManager", "Manages the schemas we use");
		imports.addImport("org.dmd.util.parsing.ConfigFinder", "Used to find definition config files");
		imports.addImport("org.dmd.util.parsing.DmcUncheckedOIFParser", "Basic parsing of objects");
				
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		out.write(imports.getFormattedImports() + "\n");
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + ddm.getName() + "Parser {\n\n");
		
		out.write("    SchemaManager            schema;\n");
		out.write("    ConfigFinder             finder;\n");
		out.write("    DmcUncheckedOIFParser    configParser;\n");
		out.write("    DmcUncheckedOIFParser    defParser;\n");
		out.write("\n");
		out.write("\n");
		out.write("\n");
		out.write("\n");
		
		out.write("    " + ddm.getName() + "Parser(){\n\n");
		out.write("    }\n\n");
		
		out.write("}\n\n");
		
		out.close();		
	}
	
	void dumpParserMembers(){
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates the output directory if required
	 * @param loc the config location
	 * @return the full name of the output directory
	 */
	String checkOutputDirectory(ConfigLocation loc){
		String dirname = loc.getConfigParentDirectory() + "/generated/dsd";
		
		File outdir= new File(dirname);
		if (!outdir.exists()){
			outdir.mkdirs();
		}
		
		return(dirname);
	}
	
	
	/**
	 * Set the stream where we'll report progress.
	 * @param ps the stream.
	 */
	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}
	
	/**
	 * sets the standard header information to be included on generated files.
	 * @param fh the header info.
	 */
	public void setFileHeader(String fh) {
		fileHeader = fh;
	}


}