package org.dmd.dsd.tools.dsdwizard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmg.tools.dmggenerator.DmgGenUtility;
import org.dmd.dms.tools.dmogenerator.DmoGenUtility;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class DSLArtifactGenerator {
	
	String		workspace;
	
	// The project folder name
	String 		dslProject;
	
    // The package for the DSL
    String		dslPackage;
    String		dslPackagePath;
    
    // The folder location for the project - workspace/dslProject/src/dslPackagePath
    String		dslFolder;
    
    // The file extension and/or abbreviation of the DSL name - this is all lowercase
    String		dslAbbrev;
    
    // This is the same as the abbrev except that the first letter is capitalized
    String		dslBaseName;
    // The base name plus Module
    String		moduleName;

	String		sharedDir;				// dslFolder/shared
	String		sharedDmconfigDir;		// dslFolder/shared/dmdconfig
	String		sharedGenDir;			// dslFolder/shared/generated
	String		sharedPackage;
	
	String		dmwDir;
	String		serverDmConfigDir;		// dslFolder/server/dmdconfig
	String		serverGenDir;			// dslFolder/server/generated
	String		serverExtendedDir;		// dslFolder/server/extended
	String		dmwPackage;
	
	String		toolsDir;				// srcdir/tools
	
	String		testDir;				// workspace/dslProject/test/dslPackagePath/tools


	public DSLArtifactGenerator(){
		
	}
	
	public void generateDSD(String ws, String project, String dpack, String folder, String abbrev, String name) throws ResultException, IOException, DmcValueException, DmcValueExceptionSet, DmcNameClashException, DmcRuleExceptionSet{
		workspace 		= ws;
		dslProject		= project;
		dslPackage		= dpack;
		dslPackagePath 	= dslPackage.replaceAll("\\.", File.separator);
		dslFolder		= folder;
		dslAbbrev		= abbrev;
		dslBaseName		= name;
		moduleName		= dslBaseName + "Module";
		
		sharedDir 			= dslFolder + "/shared";
		sharedGenDir 		= sharedDir + "/generated";
		sharedDmconfigDir 	= sharedDir + "/dmconfig";
		sharedPackage		= dslPackage + ".shared";
		
		dmwDir				= dslFolder + "/server";
		serverDmConfigDir 	= dslFolder + "/server/dmconfig";
		serverGenDir 		= dslFolder + "/server/generated";
		serverExtendedDir 	= dslFolder + "/server/extended";
		dmwPackage			= dslPackage + ".server";
		
		toolsDir			= dslFolder + "/tools";
		
		testDir				= workspace + "/" + dslProject + "/test/" + dslPackagePath + "/tools";
		
		// We attempt to create the base directory structure
		System.out.println("Creating source hierarchy:\n");

		createDir(sharedDir);
		createDir(sharedGenDir);
		createDir(sharedDmconfigDir);
		
		createDir(serverGenDir);
		createDir(serverExtendedDir);
		createDir(serverDmConfigDir);
		
		createDir(toolsDir);
		
		createDir(testDir);

		System.out.println("\n\nCreating schema configuration:\n");
		createSchemaFile();
		createModuleFile();
		createAttributesFile();
		createClassFile();
		createPlaceHolder(sharedDmconfigDir, "complex.dmd", "complex type definitions.");
		createPlaceHolder(sharedDmconfigDir, "types.dmd", "type definitions.");
		
		System.out.println("\n\nCreating extended wrapper configuration:\n");
		createDmgFile();
		
		runDmoGenerator();
				
		runDmgGenerator();
		
		// Generate the tools - gen and doc
		// Copy generic template files to doc
		// Copy the generic .css to doc
		// Generate the templates
		
		// Generate the JUnit for the tools
		
		// Create the output dir for doc
		
		// Generate run configs for DMO, DMW, TEMPLATES
		
		
		
	}
	
	void runDmoGenerator() throws ResultException, IOException, DmcValueException, DmcValueExceptionSet, DmcNameClashException, DmcRuleExceptionSet{
		String[] args = {
				"-workspace", workspace,
				"-srcdir", dslProject + "/src", "dark-matter-data/src", "dark-matter-concinnity/src",
				"-autogen"
		};
		
		DmoGenUtility	gen = new DmoGenUtility(args);
		gen.run();
	}
		
	void runDmgGenerator() throws ResultException, IOException, DmcValueException, DmcValueExceptionSet, DmcNameClashException, DmcRuleExceptionSet{
		String[] args = {
				"-workspace", workspace,
				"-srcdir", dslProject + "/src", "dark-matter-data/src", "dark-matter-concinnity/src",
				"-autogen"
		};
		
		DmgGenUtility 	gen = new DmgGenUtility(args);
		gen.run();
	}
		
	void createDir(String dir) throws ResultException {
		File folder = new File(dir);
		
		if (!folder.exists()){
			if (!folder.mkdirs()){
				ResultException rc = new ResultException("Couldn't create directory: " + dir);
				throw(rc);
			}
		}
		
		System.out.println("    - created: " + dir);
	}

	void createSchemaFile() throws IOException{
		String fn = sharedDmconfigDir + File.separator + dslAbbrev + ".dms";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("SchemaDefinition\n");
		out.write("name              " + dslAbbrev + "\n");
		out.write("schemaBaseID      1000000\n");
		out.write("schemaIDRange     50\n");
		out.write("dependsOn         dmv\n");
		out.write("dependsOn         dmconcinnity\n");
		out.write("defFiles          types.dmd\n");
		out.write("defFiles          complex.dmd\n");
		out.write("defFiles          attributes.dmd\n");
		out.write("defFiles          classes.dmd\n");
		out.write("defFiles          module.dmd\n");
		out.write("schemaPackage     " + dslPackage + ".shared\n");
		out.write("dmwPackage        " + dslPackage + ".server\n");
		out.write("description       This is the schema definition for the " + dslAbbrev + " domain-specific language.\n");
		out.write("\n");
		
		out.close();
		
		System.out.println("    - created: " + fn);
	}
	

	void createModuleFile() throws IOException{
		String fn = sharedDmconfigDir + File.separator + "module.dmd";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("DSDefinitionModule\n");
		out.write("name                        " + moduleName + "\n");
		out.write("fileExtension               " + dslAbbrev + "\n");
		out.write("dmdID                       1\n");
		out.write("moduleClassName             " + moduleName + "\n");
		out.write("moduleDependenceAttribute   dependsOn" + moduleName + "\n");
		out.write("baseDefinition              " + dslBaseName + "Definition\n");
		out.write("definedInModuleAttribute    definedIn" + moduleName + "\n");
		out.write("refersToDefsFromDSD         ConcinnityModule\n");
		out.write("supportDynamicSchemaLoading true\n");
		out.write("description                 This is the module definition for the " + dslAbbrev + " domain-specific language.\n");
		out.write("\n");
		
		out.close();
		
		System.out.println("    - created: " + fn);
	}

	void createClassFile() throws IOException{
		String fn = sharedDmconfigDir + File.separator + "classes.dmd";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("ClassDefinition\n");
		out.write("name                        " + dslBaseName + "Definition\n");
		out.write("classType                   ABSTRACT\n");
		out.write("dmdID                       2\n");
		out.write("useWrapperType              EXTENDED\n");
		out.write("derivedFrom                 DSDefinition\n");
		out.write("isNamedBy                   name\n");
		out.write("must                        name\n");
		out.write("must                        definedIn" + moduleName + "\n");
		out.write("description                 This is the module definition for the " + dslAbbrev + " domain-specific language.\n");
		out.write("\n");
		
		out.close();
		
		System.out.println("    - created: " + fn);
	}

	void createAttributesFile() throws IOException{
		String fn = sharedDmconfigDir + File.separator + "attributes.dmd";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("AttributeDefinition\n");
		out.write("name           definedIn" + moduleName + "\n");
		out.write("dmdID          1\n");
		out.write("type           " + moduleName + "\n");
		out.write("description    Indicates that a definition came from this module.\n\n");

		out.write("AttributeDefinition\n");
		out.write("name           dependsOn" + moduleName + "\n");
		out.write("dmdID          2\n");
		out.write("type           " + moduleName + "\n");
		out.write("valueType      MULTI\n");
		out.write("description    Allows us to use definitions from another " + moduleName + "\n\n");
		
		out.close();
		
		System.out.println("    - created: " + fn);
	}
	
	void createPlaceHolder(String dir, String name, String comment) throws IOException {
		String fn = dir + File.separator + name;
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("// This a placeholder file for " + comment + "\n\n");
		
		out.close();
		
		System.out.println("    - created: " + fn);

	}

	void createDmgFile() throws IOException {
		String fn = serverDmConfigDir + File.separator + dslAbbrev + ".dmg";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("DmgConfig\n");
		out.write("genPackage    " + dslPackage + ".server\n");
		out.write("schemaToLoad  " + dslAbbrev + "\n");
		out.write("generator     org.dmd.dmg.generators.DMWGenerator\n");
		out.write("description   We generate wrappers for the " + dslAbbrev + " definitions.\n");
		out.write("\n");
		
		out.close();
		
		System.out.println("    - created: " + fn);

	}

}
