package org.dmd.dsd.tools.dsdwizard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmg.tools.dmggenerator.DmgGenUtility;
import org.dmd.dms.tools.dmogenerator.DmoGenUtility;
import org.dmd.dsd.tools.dsdwizard.generated.dmtdl.DsdwizardTemplateLoader;
import org.dmd.dsd.tools.dsdwizard.generated.dmtdl.DslDmtdlFile;
import org.dmd.templates.server.util.FormattedStringBuffer;
import org.dmd.templates.tools.dmtdlgen.DmtdlGen;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.StringArrayList;

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
	String		dsdPackage;
	String		serverExtendedPackage;	
	String		templatesPackage;		// Package with DM generated template stuff
	
	String		toolsDir;				// srcdir/tools
	// Initially, we'll focus on HTML, but there are many other markup languages
	// in which you may want to generate documents e.g. Google Code wiki, 
	// Swagger etc. It should be easy to add these concepts
	String		htmlDocGenDir;			// srcdir/tools/doc/html
	String		htmlDocGenPackage;
	String		htmlDocGenDmDir;		// srcdir/tools/doc/html/dmconfig
	
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
		dsdPackage			= dslPackage + ".server.generated.dsd";
		serverExtendedPackage	= dslPackage + ".server.extended";
		
		toolsDir			= dslFolder + "/tools";
		htmlDocGenDir		= toolsDir + "/docgen/html";
		htmlDocGenPackage	= dslPackage + ".tools.docgen.html";
		templatesPackage	= dslPackage + ".tools.docgen.html.generated.dmtdl";
		htmlDocGenDmDir		= htmlDocGenDir + "/dmconfig";
		
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
		createDir(htmlDocGenDir);
		createDir(htmlDocGenDmDir);
		copyResource("base.css", htmlDocGenDir, dslAbbrev + ".css");
		copyResource("base.dmt.txt", htmlDocGenDmDir, dslAbbrev + ".dmt");
		generateDslDocTemplates();
//		copyResource("base.dmtdl.txt", htmlDocGenDmDir, dslAbbrev + ".dmtdl");
		
		createDocGenTool();
		
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
		
		runTemplateGenerator();
		
		// Generate the tools - gen and doc
		// Copy generic template files to doc
		// Copy the generic .css to doc
		// Generate the templates
		
		// Generate the JUnit for the tools
		
		// Create the output dir for doc
		
		// Generate run configs for DMO, DMW, TEMPLATES
		
		
		
	}
	
	void generateDslDocTemplates() throws ResultException, IOException{
		StringArrayList searchPaths = new StringArrayList();
		searchPaths.add(workspace + "/dark-matter-data/src/org/dmd/dsd/tools/dsdwizard");
		DsdwizardTemplateLoader loader;
		
		try{
			loader = new DsdwizardTemplateLoader(searchPaths);
			loader.findAndLoadTemplate();
		}
		catch(Exception e){
			throw(new ResultException(e.toString()));
		}
		
		DslDmtdlFile artifact = new DslDmtdlFile();
		artifact.getDmtdlFile().setComment("::comment::").setPackage(htmlDocGenPackage).setDslName(dslAbbrev);
		
		FormattedStringBuffer sb = new FormattedStringBuffer();
		
		artifact.format(sb);
		
		String fn = htmlDocGenDmDir + File.separator + dslAbbrev + ".dmtdl";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		
		// Replace the /// cheat with line feeds
		String output = sb.toString().replaceAll("///", "");
		
		out.write(output + "\n");

		out.close();
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
		
	void runTemplateGenerator() throws ResultException, IOException, DmcValueException, DmcValueExceptionSet, DmcNameClashException, DmcRuleExceptionSet{
		String[] args = {
				"-workspace", workspace,
				"-srcdir", dslProject + "/src",
				"-autogen"
		};
		
		DmtdlGen 	gen = new DmtdlGen();
		gen.run(args);
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
	
	void copyResource(String from, String toDir, String toName) throws IOException{
		URL url = this.getClass().getResource(from);
//		DebugInfo.debug("url: " + url.getFile());
		FileUtils.copyURLToFile(url, new File(toDir + File.separator + toName));
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
	
	void createDocGenTool() throws IOException{
		String cn = Manipulator.capFirstChar(dslAbbrev) + "DocGenerator";
		String upperAbbrev = Manipulator.capFirstChar(dslAbbrev);
		String fn = htmlDocGenDir + File.separator + cn + ".java";
		ImportManager imports = new ImportManager();
		
		imports.addImport("java.net.URL", 								"To support resource copying");
		imports.addImport("org.apache.commons.io.FileUtils", 			"To support file copy");
		imports.addImport("java.io.File", 								"To support file operations");
		imports.addImport("java.io.IOException", 						"May result from doc generation");
		imports.addImport("org.dmd.dmc.DmcOmni", 						"To turn on reference tracing");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", 		"Location info for config modules");
		imports.addImport("org.dmd.util.parsing.StringArrayList", 		"Commandline arguments");
		imports.addImport("org.dmd.util.exceptions.ResultException", 	"If difficulties arise");
		imports.addImport(dsdPackage + "." + upperAbbrev + "ModuleGenUtility", "The base generator");
		imports.addImport(dsdPackage + "." + upperAbbrev + "ModuleDefinitionManager", "The DSL definition manager");
		imports.addImport(templatesPackage + "." + upperAbbrev + "TemplateLoader", "The template loader");
		imports.addImport(serverExtendedPackage + "." + upperAbbrev + "Module", "The DSL module");

		
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("package " + dslPackage + ".tools.docgen.html;\n\n");
		
		out.write(imports.getFormattedImports());
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("public class " + cn + " extends " + upperAbbrev + "ModuleGenUtility{\n");
		out.write("    \n");
		out.write("    // Indicates the version for which we want to generate the documentation files\n");
		out.write("    StringBuffer        genversion = new StringBuffer();\n");
		out.write("\n");
		out.write("    // The root directory of generated documents \n");
		out.write("    StringBuffer        outdir = new StringBuffer();\n");
		out.write("    \n");
		out.write("    // The subdirectory where beneath outdir where we'll dump our docs\n");
		out.write("    String                outdir" + upperAbbrev + ";\n");
		out.write("    \n");
		out.write("    // The set of extension classes that we'll load. These must be the fully qualified\n");
		out.write("    // names of classes that implement the GpbdocExtensionHookIF\n");
		out.write("    StringArrayList        extensions         = new StringArrayList();\n");
		out.write("\n");
		out.write("    " + upperAbbrev + "TemplateLoader    loader;\n");
		out.write("\n");
		out.write("    public " + upperAbbrev + "DocGenerator(){\n");
		out.write("        commandLine.addOption(\"-genversion\",     genversion, \"The version for  which we'll generated the .proto files\");\n");
		out.write("        commandLine.addOption(\"-outdir\",         outdir,     \"The base directory where we'll dump the docs - we'll create the dmgpb subdirectory\");\n");
		out.write("        commandLine.addOption(\"-extensions\",     extensions, \"Classes that implement the GpbdocExtensionsHookIF interface\");\n");
		out.write("    }\n\n");
		
		out.write("    @Override\n");
		out.write("    public void initialize() throws ResultException {\n");
		out.write("        ResultException ex = null;\n");
		out.write("        \n");
		out.write("        DmcOmni.instance().backRefTracking(true);\n");
		out.write("        DmcOmni.instance().setTrackSchemaReferences(true);\n");
		out.write("        \n");
		out.write("        if (srcdir.size() == 0){\n");
		out.write("            \n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        if (outdir.length() == 0){\n");
		out.write("            ex = new ResultException(\"You must specify the outdir argument to indicate the base documentation directory. The generated docs will be placed in subfolder " + dslAbbrev + " beneath that directory.\");\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        outdir" + upperAbbrev + " = outdir + File.separator + \"" + dslAbbrev + "\";\n");
		out.write("        createDir(outdir" + upperAbbrev + ");\n");
		out.write("        \n");
		out.write("        try {\n");
		out.write("            loader = new " + upperAbbrev + "TemplateLoader(searchPaths);\n");
		out.write("            loader.findAndLoadTemplate();\n");
		out.write("            \n");
		out.write("            // Load any extension hooks\n");
		out.write("            // You'll only need to do this if you specified ExtensionHooks in your doc template\n");
		out.write("//            if (extensions.size() > 0){\n");
		out.write("//                loader.loadExtensionHooks(extensions);\n");
		out.write("//            }\n");
		out.write("        } catch (Exception e) {\n");
		out.write("            // TODO Auto-generated catch block\n");
		out.write("            if (ex == null)\n");
		out.write("                ex = new ResultException(e.toString());\n");
		out.write("            else\n");
		out.write("                ex.addError(e.toString());\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        try {\n");
		out.write("            copyResource(\"" + dslAbbrev + ".css\");\n");
		out.write("            // Insert any other resources e.g. images that you need copied to the output directory\n");
		out.write("        } catch (IOException e) {\n");
		out.write("            if (ex == null)\n");
		out.write("                ex = new ResultException(e.toString());\n");
		out.write("            else\n");
		out.write("                ex.addError(e.toString());\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        if (ex != null)\n");
		out.write("            throw(ex);\n");
		out.write("        \n");
		out.write("    }\n");
		
		out.write("    @Override\n");
		out.write("    public void parsingComplete(MoodslModule module, ConfigLocation location, MoodslModuleDefinitionManager definitions) throws ResultException {\n");
		out.write("        // TODO Auto-generated method stub\n");
		out.write("        \n");
		out.write("    }\n");
		out.write("\n");
		out.write("    @Override\n");
		out.write("    public void objectResolutionComplete(MoodslModule module, ConfigLocation location, MoodslModuleDefinitionManager definitions) throws ResultException {\n");
		out.write("        // TODO Auto-generated method stub\n");
		out.write("        \n");
		out.write("    }\n");
		out.write("\n");
		out.write("    @Override\n");
		out.write("    public void generate(MoodslModule module, ConfigLocation location, MoodslModuleDefinitionManager definitions) throws IOException {\n");
		out.write("        // TODO Auto-generated method stub\n");
		out.write("        \n");
		out.write("    }\n");
		out.write("\n");
		out.write("    @Override\n");
		out.write("    public void generate(MoodslModuleDefinitionManager definitions) throws IOException {\n");
		out.write("        // TODO Auto-generated method stub\n");
		out.write("        \n");
		out.write("    }\n");
		out.write("\n");
		out.write("    @Override\n");
		out.write("    public void displayHelp() {\n");
		out.write("        // TODO Auto-generated method stub\n");
		out.write("        \n");
		out.write("    }\n\n");
		
		out.write("    void copyResource(String name) throws IOException{\n");
		out.write("        URL url = this.getClass().getResource(name);\n");
		out.write("        FileUtils.copyURLToFile(url, new File(outdir" + upperAbbrev + " + File.separator + name));\n");
		out.write("    }\n\n");

		out.write("\n");
		out.write("    void createDir(String dir) throws ResultException {\n");
		out.write("        File folder = new File(dir);\n");
		out.write("        \n");
		out.write("        if (!folder.exists()){\n");
		out.write("            if (!folder.mkdirs()){\n");
		out.write("                ResultException rc = new ResultException(\"Couldn't create directory: \" + dir);\n");
		out.write("                throw(rc);\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("    }\n");

		
		out.write("}\n\n");

		out.close();
		
		createDocGenToolMain();
	}

	void createDocGenToolMain() throws IOException{
		String cn = Manipulator.capFirstChar(dslAbbrev) + "DocGeneratorMain";
		String gn = Manipulator.capFirstChar(dslAbbrev) + "DocGenerator";
		
		String fn = htmlDocGenDir + File.separator + cn + ".java";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));

		out.write("package " + dslPackage + ".tools.docgen.html;\n\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("public class " + cn + " {\n");		
		
		out.write("    public static void main(String[] args) {\n");
		out.write("\n");
		out.write("        " + gn + " generator = new " + gn + "();\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            generator.run(args);\n");
		out.write("        }\n");
		out.write("        catch(Exception e){\n");
		out.write("            System.err.println(e.toString());\n");
		out.write("        }\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("}\n\n");
		
		out.close();
	}

}
