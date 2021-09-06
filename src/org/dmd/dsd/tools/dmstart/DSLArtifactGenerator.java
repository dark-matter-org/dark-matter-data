package org.dmd.dsd.tools.dmstart;

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
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class DSLArtifactGenerator {
	
	private final static String CONCEPTA = "ConceptA";
	private final static String CONCEPTB = "ConceptB";
	
	private String		workspace;
	
	// The project folder name
	private String 		dslProject;
	
	// The source folder beneath the project
	private String 		dslSourceFolder;
	
	private String 		dslTestFolder;
	
    // The package for the DSL
	private String		dslPackage;
	private String		dslPackagePath;
    
    // The folder location for the project - workspace/dslProject/dslSourceFolder/dslPackagePath
	private String		dslFolder;
    
    // The file extension and/or abbreviation of the DSL name - this is all lowercase
	private String		dslAbbrev;
    
    // This is the same as the abbrev except that the first letter is capitalized
	private String		dslBaseName;
    // The base name plus Module
	private String		moduleName;

	private String		sharedDir;				// dslFolder/shared
	private String		sharedDmconfigDir;		// dslFolder/shared/dmdconfig
	private String		sharedGenDir;			// dslFolder/shared/generated
	private String		sharedPackage;
	
	private String		dmwDir;
	private String		serverDmConfigDir;		// dslFolder/server/dmdconfig
	private String		serverGenDir;			// dslFolder/server/generated
	private String		serverExtendedDir;		// dslFolder/server/extended
	private String		dmwPackage;
	private String		dsdPackage;
	private String		serverExtendedPackage;	
//	String		templatesPackage;		// Package with DM generated template stuff
	
	private String		toolsDir;				// srcdir/tools
	private String		utilDir;				// tools/<dsl>util
	private String		utilMainFileName;		// tools/<dsl>util/<Dsl>UtilMain
	
	private String		utilMainFileTestName;	// In the src/test 
	
	private String		utilMainClassName;		// DslUtilMain
	private String		utilPackage;			// dslPackage.tool.dslutil
	private String		utilMainClass;			// dslPackage.tool.dslutil.DslUtilMain
	
	private String		configLoaderClassName;	// DslConfigLoader
	private String		configLoaderClass;		// dslPackage.tool.dslutil.DslConfigLoader
	
	private String		dslSchemaClassName;		// DslSchemaAG
	private String		dslSchemaClass;			// dmwPackage.generated.DslSchemaAG
	
	// Initially, we'll focus on HTML, but there are many other markup languages
	// in which you may want to generate documents e.g. Google Code wiki, 
	// Swagger etc. It should be easy to add these concepts
//	String		htmlDocGenDir;			// srcdir/tools/doc/html
//	String		htmlDocGenPackage;
//	String		htmlDocGenDmDir;		// srcdir/tools/doc/html/dmconfig
	
	String		testDir;				// workspace/dslProject/test/dslPackagePath/tools/DSLutil
	
	String		dataDir;				// workspace/dslProject/test/dslPackagePath/tools/DSLutil/data
	String		exampleFile;			// workspace/dslProject/test/dslPackagePath/tools/DSLutil/data/example.DSLABBREV


	public DSLArtifactGenerator(){
		
	}
	
	public String utilMainClass() {
		if (utilMainClass == null)
			throw(new IllegalStateException("You must call generateDSD() first"));
		return(utilMainClass);
	}
	
	public void generateDSD(String ws, String project, String src, String dpack, String folder, String abbrev, String name) throws ResultException, IOException, DmcValueException, DmcValueExceptionSet, DmcNameClashException, DmcRuleExceptionSet{
		workspace 				= ws;
		dslProject				= project;
		dslSourceFolder			= src;
		
		dslPackage				= dpack;
		dslPackagePath 			= dslPackage.replaceAll("\\.", File.separator);
		dslFolder				= folder;
		dslTestFolder			= dslFolder.replace("main", "test");

		dslAbbrev				= abbrev;
		dslBaseName				= name;
		moduleName				= dslBaseName + "Module";
		
		sharedDir 				= dslFolder + "/shared";
		sharedGenDir 			= sharedDir + "/generated";
		sharedDmconfigDir 		= sharedDir + "/dmconfig";
		sharedPackage			= dslPackage + ".shared";
		
		dmwDir					= dslFolder + "/server";
		serverDmConfigDir 		= dslFolder + "/server/dmconfig";
		serverGenDir 			= dslFolder + "/server/generated";
		serverExtendedDir 		= dslFolder + "/server/extended";
		dmwPackage				= dslPackage + ".server";
		dsdPackage				= dslPackage + ".server.generated.dsd";
		serverExtendedPackage	= dslPackage + ".server.extended";
		
		toolsDir				= dslFolder + "/tools";
		
		utilDir					= toolsDir + "/" + dslAbbrev + "util";
		
		utilMainFileName		= utilDir + "/" + dslBaseName + "UtilMain.java";
		utilMainClassName		= dslBaseName + "UtilMain";
		utilMainClass			= dslPackage + ".tools." + dslAbbrev + "util." + dslBaseName + "UtilMain";
		utilPackage				= dslPackage + ".tools." + dslAbbrev + "util";
		
		configLoaderClassName	= dslBaseName + "ModuleConfigLoader";
		configLoaderClass		= dsdPackage + "." + configLoaderClassName;
		
		dslSchemaClassName		= dslBaseName + "SchemaAG";
		dslSchemaClass			= dmwPackage + ".generated." + dslSchemaClassName;
		
//		htmlDocGenDir		= toolsDir + "/docgen/html";
//		htmlDocGenPackage	= dslPackage + ".tools.docgen.html";
//		templatesPackage	= dslPackage + ".tools.docgen.html.generated.dmtdl";
//		htmlDocGenDmDir		= htmlDocGenDir + "/dmconfig";
		
		testDir				= dslTestFolder + "/tools/" + dslAbbrev + "util";
		
		utilMainFileTestName = testDir + "/" + dslBaseName + "UtilMainTest.java";
		
		dataDir				= testDir + "/data";
		exampleFile			= dataDir + "/example." + dslAbbrev;
		
		// We attempt to create the base directory structure
		System.out.println("Creating source hierarchy:\n");

		createDir(sharedDir);
		createDir(sharedGenDir);
		createGitIgnore(sharedDir);
		createDir(sharedDmconfigDir);
		
		createDir(serverGenDir);
		createGitIgnore(dmwDir);
		createDir(serverExtendedDir);
		createDir(serverDmConfigDir);
		
		createDir(toolsDir);
		createDir(utilDir);
		
		createDir(testDir);
		createDir(dataDir);

		System.out.println("\n\nCreating schema configuration:\n");
		createSchemaFile();
		createModuleFile();
		createAttributesFile();
		createClassFile();
		createComplexTypesFile();
//		createPlaceHolder(sharedDmconfigDir, "complex.dmd", "complex type definitions.");
		createTypesFile();
//		createPlaceHolder(sharedDmconfigDir, "types.dmd", "type definitions.");
		
		System.out.println("\n\nCreating extended wrapper configuration:\n");
		createDmgFile();
		
		System.out.println("\n\nCreating DSL tools:\n");
		createDslUtility();
		createDslUtilityTest();
		createDslExampleFile();
		
		runDmoGenerator();
				
		runDmgGenerator();
		
		
		
//		runTemplateGenerator();
		
		// Generate the tools - gen and doc
		// Copy generic template files to doc
		// Copy the generic .css to doc
		// Generate the templates
		
		// Generate the JUnit for the tools
		
		// Create the output dir for doc
		
		// Generate run configs for DMO, DMW, TEMPLATES

	}
	
	void createDslUtility() throws IOException{
		BufferedWriter out = new BufferedWriter(new FileWriter(utilMainFileName));
		
		ImportManager imports = new ImportManager();
		imports.addImport("java.io.File", "File operations");
		imports.addImport("java.io.IOException", "File operations");
		imports.addImport("java.util.Iterator", "Iterating");
		imports.addImport("java.util.TreeSet", "Unique srcdirs");
		
		imports.addImport("org.dmd.dmc.DmcNameClashException", "Loading exceptions");
		imports.addImport("org.dmd.dmc.DmcValueException", "Loading exceptions");
		imports.addImport("org.dmd.dmc.DmcValueExceptionSet", "Loading exceptions");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "Loading exceptions");
		imports.addImport("org.dmd.util.exceptions.ResultException", "Loading exceptions");
		imports.addImport("org.dmd.util.exceptions.ResultSet", "Loading exceptions");
		
		imports.addImport("org.dmd.util.BooleanVar", "Command line");
		imports.addImport("org.dmd.util.parsing.CommandLine", "Command line");
		imports.addImport("org.dmd.util.parsing.StringArrayList", "Command line");
		
		imports.addImport("org.dmd.dms.SchemaManager", "Schema loading");
		
		imports.addImport(serverExtendedPackage + "." + dslBaseName + CONCEPTA, "The initial concept");
		
		imports.addImport(configLoaderClass, "Config loader");
		imports.addImport(dslSchemaClass, "DSL Schema");
		
		
		out.write("package " + utilPackage + ";\n\n");
		
		out.write(imports.getFormattedImports() + "\n\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("public class " + dslBaseName + "UtilMain {    \n");
		out.write("\n");
		out.write("    private static String             ___ = \"\\n\";\n");
		out.write("\n");
		out.write("    private CommandLine                commandLine     = new CommandLine();\n");
		out.write("    private BooleanVar                 helpFlag        = new BooleanVar();\n");
		out.write("    private StringArrayList            modules         = new StringArrayList();\n");
		out.write("    private StringArrayList            srcdirs         = new StringArrayList();\n");
		out.write("            \n");
		out.write("    private " + configLoaderClassName + "    loader;\n");
		out.write("\n");
		
		out.write("    public static void main(String[] args) throws ResultException, IOException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, DmcValueExceptionSet {\n");
		out.write("        " + dslBaseName + "UtilMain main = new " + dslBaseName + "UtilMain();\n");
		out.write("        main.run(args);\n");
		out.write("    }\n");
		out.write("\n");

		out.write("    public " + dslBaseName + "UtilMain() {\n");
		out.write("        \n");
		out.write("        commandLine.addOption(\"-h\",         helpFlag,         \"Dumps the help message\");\n");
		out.write("        commandLine.addOption(\"-modules\",     modules,         \"Specifies the modules with CLI code we want to process\");\n");
		out.write("        commandLine.addOption(\"-srcdirs\",     srcdirs,         \"Specifies the source directories to search for .tac modules\");\n");
		out.write("        \n");
		out.write("    }\n");
		out.write("    \n");
		out.write("    public void run(String[] args) throws ResultException, IOException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, DmcValueExceptionSet {\n");
		out.write("        SchemaManager    schema    = new SchemaManager();\n");
		out.write("        " + dslSchemaClassName + "        sd        = new " + dslSchemaClassName + "();\n");
		out.write("        schema.manageSchema(sd);\n");
		out.write("        \n");
		out.write("        ResultSet rs = new ResultSet();\n");
		out.write("        \n");
		out.write("        if (!commandLine.parseArgs(rs,args)) {\n");
		out.write("            throw(new ResultException(rs));\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        if ((args.length == 0) || helpFlag.booleanValue()){\n");
		out.write("            displayHelp();\n");
		out.write("            return;\n");
		out.write("        }\n");
		out.write("                        \n");
		out.write("        File currentDir = new File(\".\");\n");
		out.write("        \n");
		out.write("        TreeSet<String> adjustedSrcDirs = new TreeSet<>();\n");
		out.write("        String initialSrcdir = currentDir.getCanonicalPath();\n");
		out.write("        \n");
		out.write("        if (srcdirs.size() > 0) {\n");
		out.write("            for(String dir: srcdirs) {\n");
		out.write("                if (dir.startsWith(\".\")) {\n");
		out.write("                    // Alter the path to be fully qualified by appending the current directory path\n");
		out.write("                    String alt = currentDir.getCanonicalPath() + dir.replaceFirst(\".\", \"\");\n");
		out.write("                    adjustedSrcDirs.add(alt);\n");
		out.write("                }\n");
		out.write("                else {\n");
		out.write("                    adjustedSrcDirs.add(dir);\n");
		out.write("                }\n");
		out.write("            }\n");
		out.write("            \n");
		out.write("            initialSrcdir = adjustedSrcDirs.first();\n");
		out.write("            \n");
		out.write("            if (adjustedSrcDirs.size() > 1) {\n");
		out.write("                adjustedSrcDirs.remove(initialSrcdir);\n");
		out.write("                \n");
		out.write("                for(String dir: adjustedSrcDirs) {\n");
		out.write("                    loader.addSrcDir(dir);\n");
		out.write("                }\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        loader = new " + configLoaderClassName + "();\n");
		out.write("        \n");
		out.write("        if (modules.size() == 0) {\n");
		out.write("            System.out.println(\"Please specify one or more modules names via the -modules option.\\n\");\n");
		out.write("            return;\n");
		out.write("        }\n");
		out.write("        else if (modules.size() == 1) {\n");
		out.write("            loader.loadModule(initialSrcdir,modules.get(0));\n");
		out.write("            \n");
		out.write("            Iterator<" + dslBaseName + CONCEPTA + "> it = loader.definitionManager().getAll" + dslBaseName + CONCEPTA + "();\n");
		out.write("            while(it.hasNext()) {\n");
		out.write("                " + dslBaseName + CONCEPTA + " concept = it.next();\n");
		out.write("                \n");
		out.write("                System.out.println(concept.toPersistentOIF() + \"\\n\\n\");\n");
		out.write("                System.out.println(concept.toJSON() + \"\\n\\n\");\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        else {\n");
		out.write("            System.out.println(\"Only loading one module at the moment\");\n");
		out.write("        }\n");
		out.write("    }\n");
		out.write("    \n");
		out.write("    public void displayHelp() {\n");
		out.write("        StringBuffer help = new StringBuffer();\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(\"" + dslBaseName + " -h -srcdirs -modules \\n\");\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(\"The " + dslBaseName + " utility allows you to ... whatever...\\n\");\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(\"-h                       Displays help information\\n\");\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(\"-srcdirs [dirs]          Indicates one or more directories to search for ."+ dslAbbrev + " modules. \\n\");\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(\"-modules [mod names]     One or more modules you wish to load.\\n\");\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(\"Example usage:\\n\");\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(\"" + dslBaseName + " -srcdirs . -modules mymodule\\n\");\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(___);\n");
		out.write("        help.append(___);\n");
		out.write("        \n");
		out.write("        System.out.println(help.toString());        \n");
		out.write("    }\n");
		out.write("}\n");
		
		out.close();
		
		System.out.println("    - created: " + utilMainFileName + "\n");
	}
	
	void createDslUtilityTest() throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(utilMainFileTestName));
		
		int srcPos = dataDir.indexOf("/src/test");
		String dataPathSection = dataDir.substring(srcPos);
		
		ImportManager imports = new ImportManager();
		imports.addImport("java.io.File", "Current directory");
		imports.addImport("java.io.IOException", "Exceptions");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "Exceptions");
		imports.addImport("org.dmd.dmc.DmcValueException", "Exceptions");
		imports.addImport("org.dmd.dmc.DmcValueExceptionSet", "Exceptions");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "Exceptions");
		imports.addImport("org.dmd.util.exceptions.ResultException", "Exceptions");
		imports.addImport("org.junit.Before", "Unit test");
		imports.addImport("org.junit.Test", "Unit test");
		
		out.write("package " + utilPackage + ";\n\n");
		
		out.write(imports.getFormattedImports() + "\n\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("public class " + utilMainClassName + "Test {\n");
		out.write("\n");
		out.write("    static String workingDir;\n");
		out.write("    static String dataDir;\n");
		out.write("\n");
		out.write("    @Before\n");
		out.write("    public void initialize() throws IOException {\n");
		out.write("        File curr = new File(\".\");\n");
		out.write("        workingDir = curr.getCanonicalPath();\n");
		out.write("        dataDir = workingDir + \"" + dataPathSection + "\";\n");
		out.write("    }\n");
		out.write("    \n");
		out.write("    @Test\n");
		out.write("    public void test() throws ResultException, IOException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, DmcValueExceptionSet {\n");
		out.write("        " + utilMainClassName + " main = new " + utilMainClassName + "();\n");
		out.write("        \n");
		out.write("        String[] args = {\n");
		out.write("            \"-srcdirs\", dataDir,\n");
		out.write("            \"-modules\", \"example\",\n");
		out.write("        };\n");
		out.write("        \n");
		out.write("        main.run(args);\n");
		out.write("    }\n");
		out.write("    \n");
		out.write("}\n");

		out.close();
	}
	
	void createDslExampleFile() throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(exampleFile));
		
		out.write(dslBaseName + "Module\n");
		out.write("name example\n");
		out.write("\n");
		out.write(dslBaseName + "ConceptA\n");
		out.write("name        concept1\n");
		out.write("stringValue just some string\n");
		out.write("refToB      william\n");
		out.write("intValue    99\n");
		out.write("alternate   william \"prefers this:\" bill note=\"Shakespeare can be odd\"\n");
		out.write("\n");
		out.write(dslBaseName + "ConceptB\n");
		out.write("name        william\n");
		out.write("strArray    string1\n");
		out.write("strArray    string2\n");
		out.write("schemaType  JSON\n");

		out.close();
	}
	
	void runDmoGenerator() throws ResultException, IOException, DmcValueException, DmcValueExceptionSet, DmcNameClashException, DmcRuleExceptionSet{
		String[] args = null;
		
		File dmdsrc = new File(workspace + "/dark-matter-data/src");
		
		if (dmdsrc.exists()){
			// Again, running in test mode in dark matter dev is different than running
			// out of the jar
			String[] temp = {
					"-workspace", workspace,
					"-srcdir", dslProject + File.separator + dslSourceFolder, "dark-matter-data/src",
					"-targets", dslAbbrev,
					"-qwarnings",
					"-qprogress",
					"-autogen"
			};
			args = temp;
		}
		else{
			String[] temp = {
					"-workspace", workspace,
					"-srcdir", dslProject + File.separator + dslSourceFolder,
					"-jars", "dark-matter-data",
					"-targets", dslAbbrev,
					"-qwarnings",
					"-qprogress",
					"-autogen",
//					"-debug"
			};
			args = temp;			
		}
		
		DmoGenUtility	gen = new DmoGenUtility(args);
		gen.run();
	}
		
	void runDmgGenerator() throws ResultException, IOException, DmcValueException, DmcValueExceptionSet, DmcNameClashException, DmcRuleExceptionSet{
		String[] args = null;
		
		File dmdsrc = new File(workspace + "/dark-matter-data/src");

		if (dmdsrc.exists()){
			// Again, running in test mode in dark matter dev is different than running
			// out of the jar
			String[] temp = {
					"-workspace", workspace,
					"-srcdir", dslProject + File.separator + dslSourceFolder, "dark-matter-data/src",
					"-targets", dslAbbrev,
					"-qwarnings",
					"-qprogress",
					"-autogen"
			};
			args = temp;
		}
		else{
			String[] temp = {
					"-workspace", workspace,
					"-srcdir", dslProject + File.separator + dslSourceFolder,
					"-jars", "dark-matter-data",
					"-targets", dslAbbrev,
					"-qwarnings",
					"-qprogress",
					"-autogen"
			};
			args = temp;
			
		}
		
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
		out.write("schemaIDRange     1000000\n");
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
		out.write("description                 This is class definition from which all concepts for the " + dslAbbrev + " domain-specific language will be derived.\n");
		out.write("//\n");
		out.write("description                 DO NOT ALTER THIS DEFINITION!!!\n\n");
		out.write("\n");
		
		out.write("ClassDefinition\n");
		out.write("name                        " + dslBaseName + CONCEPTA + "\n");
		out.write("classType                   STRUCTURAL\n");
		out.write("dmdID                       5\n");
		out.write("useWrapperType              EXTENDED\n");
		out.write("derivedFrom                 " + dslBaseName + "Definition\n");
		out.write("isNamedBy                   name\n");
		out.write("must                        name\n");
		out.write("may                         stringValue\n");
		out.write("may                         intValue\n");
		out.write("may                         refToB\n");
		out.write("may                         alternate\n");
		out.write("may                         description\n");
		out.write("description                 This is an example concept - rename it to reflect a concept you wish to model.\n");
		out.write("\n");

		out.write("ClassDefinition\n");
		out.write("name                        " + dslBaseName + CONCEPTB + "\n");
		out.write("classType                   STRUCTURAL\n");
		out.write("dmdID                       10\n");
		out.write("useWrapperType              EXTENDED\n");
		out.write("derivedFrom                 " + dslBaseName + "Definition\n");
		out.write("isNamedBy                   name\n");
		out.write("must                        name\n");
		out.write("may                         schemaType\n");
		out.write("may                         strArray\n");
		out.write("may                         description\n");
		out.write("description                 This is an example concept - rename it to reflect a concept you wish to model.\n");
		out.write("\n");

		out.close();
		
		System.out.println("    - created: " + fn);
	}

	void createComplexTypesFile() throws IOException{
		String fn = sharedDmconfigDir + File.separator + "complex.dmd";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("// This a placeholder file for complex type definitions.\n");
		out.write("\n");
		out.write("ComplexTypeDefinition\n");
		out.write("name            AlternateNameType\n");
		out.write("requiredPart    XdslConceptB conceptb  \"A reference to a XdslConceptB instance.\"\n");
		out.write("requiredPart    String       why       \"Why you're giving it an alternate name.\" quoted=true\n");
		out.write("requiredPart    String       alternate \"The alternate name of something.\"\n");
		out.write("optionalPart    String       note      \"Some other note you want to add.\"        quoted=true\n");
		out.write("description     An example of a complex type. You can think of this as a micro grammar\n");
		out.write(" to define an attribute with many parts, both required and optional. The generated code\n");
		out.write(" takes care of sanity checking and gathering all of the parts for use.\n");
		out.write(" </p>\n");
		out.write(" The micro grammar is:\n");
		out.write(" <pre>\n");
		out.write(" conceptb \"why\" alternate [note]\n");
		out.write(" </pre>\n");
		out.write(" Where:\n");
		out.write(" <ul>\n");
		out.write(" <li>conceptb  - A reference to a XdslConceptB instance. </li>\n");
		out.write(" <li>why       - Why you're giving it an alternate name. </li>\n");
		out.write(" <li>alternate - The alternate name of something. </li>\n");
		out.write(" </ul>\n");
		out.write(" Optional:\n");
		out.write(" <ul>\n");
		out.write(" <li>optional  - Some other note you want to add. </li>\n");
		out.write(" </ul>\n");
		out.write("//\n");
		out.write("description  An example: william \"prefers this:\" bill note=\"Shakespeare can be odd.\"\n");

		out.close();
		
		System.out.println("    - created: " + fn);
	}

	void createTypesFile() throws IOException{
		String fn = sharedDmconfigDir + File.separator + "types.dmd";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
		out.write("// This a placeholder file for type definitions.\n");
		out.write("\n");
		out.write("EnumDefinition\n");
		out.write("name             SchemaTypeEnum\n");
		out.write("nullReturnValue     SchemaTypeEnum.JSON\n");
		out.write("enumValue        0 AVRO        The schemas is AVRO.\n");
		out.write("enumValue        1 JSON        The schemas is JSON.\n");
		out.write("enumValue        2 XML         The schema is XML.\n");
		out.write("description      An example of an Enum type.\n");

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
		out.write("dataType       NONPERSISTENT\n");
		out.write("internalUse    true\n");
		out.write("description    Indicates that a definition came from this module.\n");
		out.write("//\n");
		out.write("description    DO NOT ALTER THIS DEFINITION!!!\n\n");

		out.write("AttributeDefinition\n");
		out.write("name           dependsOn" + moduleName + "\n");
		out.write("dmdID          2\n");
		out.write("type           " + moduleName + "\n");
		out.write("valueType      MULTI\n");
		out.write("description    Allows us to use definitions from another " + moduleName + "\n");
		out.write("//\n");
		out.write("description    DO NOT ALTER THIS DEFINITION!!!\n\n");
		
		out.write("\n");
		out.write("// Here are some example attributes.\n");
		out.write("// Base primitive types include:\n");
		out.write("// Boolean Double Float Integer Long Short String\n");
		out.write(" \n");
		out.write("AttributeDefinition\n");
		out.write("name           stringValue\n");
		out.write("dmdID          10\n");
		out.write("type           String\n");
		out.write("description    Holds a String\n");
		out.write("\n");
		out.write("AttributeDefinition\n");
		out.write("name           intValue\n");
		out.write("dmdID          15\n");
		out.write("type           Integer\n");
		out.write("description    Holds a Integer\n");
		out.write("\n");
		out.write("AttributeDefinition\n");
		out.write("name           strArray\n");
		out.write("dmdID          20\n");
		out.write("type           String\n");
		out.write("valueType      MULTI\n");
		out.write("description    Holds an multi-valued String\n");
		out.write("\n");
		out.write("AttributeDefinition\n");
		out.write("name           refToB\n");
		out.write("dmdID          25\n");
		out.write("type           XdslConceptB\n");
		out.write("description    A reference to an instance of a XdslConceptB object. A reference\n");
		out.write(" attribute is one that refers to a \"named\" object class\n");
		out.write("\n");
		out.write("AttributeDefinition\n");
		out.write("name           schemaType\n");
		out.write("dmdID          30\n");
		out.write("type           SchemaTypeEnum\n");
		out.write("description    Am indication of schema type - see the types.dmd file for the \n");
		out.write(" definition of the enum type.\n");
		out.write("\n");
		out.write("AttributeDefinition\n");
		out.write("name           alternate\n");
		out.write("dmdID          35\n");
		out.write("type           AlternateNameType\n");
		out.write("description    Allows for the specification of an alternate name for something.\n");
		out.write("\n");
		out.write("\n");

		out.write("// ADD YOUR OWN ATTRIBUTES BELOW THIS POINT \n");
		out.write("// THE dmdID values MUST BE UNIQUE \n\n");
		
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
	
	void createGitIgnore(String dir) throws IOException {
		String fn = dir + "/.gitignore";
		BufferedWriter out = new BufferedWriter(new FileWriter(fn));
		
		out.write("/generated/\n");

		out.close();
		
	}
	

}
