package org.dmd.util.codegen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DSDefinitionModule;
import org.dmd.dms.SchemaManager;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.ManagedFileWriter;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The InitializationInterfaceManager is used to gather the global interfaces that are
 * implemented by the definition managers for different DSLs. This allows for the creation of
 * a combined interface that can be used when injecting a definition manager into
 * the performAdditionalValidation() method. We need this because the performAdditionalValidation()
 * method in a config loader will call definitions with the same DSLDefinitionManager that
 * must be usable by all DSL definitions up the chain of dependency.
 * 
 * 
 */
public class InitializationInterfaceManager {
	
	public final static String DEF_INT_SUFFIX = "DefinitionsIF";
	
	public final static String CONFIG_LOADER = "ConfigLoader";
	
	public final static String INITIALIZE = "initialize";
	
	private DmgConfigDMO 		config;
	private DSDefinitionModule	dslDef;
	private SchemaManager 		sm;
	
	// Imports required by the definitions interface
	private ImportManager		imports;
	
	// Imports required by the config loader
	private ImportManager		loaderImports;

	// Imports required by the definition manager
	private ImportManager		initializationImports;
	private TreeSet<String>		initializationInterfaces;

	private TreeSet<String>		requiredInterfaces = new TreeSet<String>();
	
	private ArrayList<DSDefinitionModule>	allBaseDefinitions;

	public InitializationInterfaceManager(DmgConfigDMO config, DSDefinitionModule dslDef, SchemaManager sm) throws DmcNameClashException, DmcValueException {
		this.config			= config;
		this.dslDef			= dslDef;
		this.sm				= sm;
		
		imports					= new ImportManager();
		loaderImports			= new ImportManager();
		
		initializationImports	= new ImportManager();
		initializationInterfaces	= new TreeSet<>();
		
		requiredInterfaces	= new TreeSet<>();
		allBaseDefinitions	= new ArrayList<DSDefinitionModule>();
		
		ClassDefinition ddmClass = sm.isClass(dslDef.getName().getNameString());
		loaderImports.addImport(ddmClass.getDmeImport(), "The module type we load");

	}
	
	public ImportManager getInitializationImports() {
		return(initializationImports);
	}
	
	/**
	 * @return the implements statement followed by the required initialization interfaces
	 */
	public String getFormattedInitializationInterfaces(){
		
		if (initializationInterfaces.size() == 0)
			return("");
		
		StringBuffer sb = new StringBuffer();
		
		for(String s: initializationInterfaces){
			if (sb.length() == 0)
				sb.append(s);
			else
				sb.append(", " + s);
		}
		
		return(", " + sb.toString() + " ");
	}

	
	public void addInterfaceFor(DSDefinitionModule ddm) throws DmcNameClashException, DmcValueException {
		imports.addImport(ddm.getGlobalInterfaceImport(), "Interface for " + ddm.getName() + " definitions");
		
		loaderImports.addImport(ddm.getDefinitionsInterfaceImport(), "Interface for " + ddm.getName() + " definitions");
		
		initializationImports.addImport(ddm.getDefinitionsInterfaceImport(), "Interface for " + ddm.getName() + " definitions");
		initializationInterfaces.add(ddm.getDefinitionsInterfaceName());
		
		requiredInterfaces.add(ddm.getGlobalInterfaceName());
		
		ClassDefinition baseDefClass = sm.isClass(ddm.getBaseDefinition().getName().getNameString());
		loaderImports.addImport(baseDefClass.getDmeImport(), "One of our base definition types");
		
//		allBaseDefinitions.add(ddm.getBaseDefinition().getName().getNameString());
		allBaseDefinitions.add(ddm);

	}
	
	public void generateInitializationInterface(String dir) throws IOException {
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, dslDef.getName() + DEF_INT_SUFFIX + ".java");
		
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		out.write(imports.getFormattedImports());
		
		out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public interface " + dslDef.getName() + DEF_INT_SUFFIX + " extends " );
		
		StringBuffer sb = new StringBuffer();
		
		for(String s: requiredInterfaces){
			if (sb.length() == 0)
				sb.append(s);
			else
				sb.append(", " + s);
		}

		out.write(sb.toString() + " {\n\n");
		
		out.write("}\n\n");

		out.close();
	}
	
	public void generateConfigLoader(String dir) throws IOException {
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, dslDef.getName() + CONFIG_LOADER + ".java");
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		loaderImports.addImport("java.io.IOException", "For exceptions");
		loaderImports.addImport("java.util.Iterator", "Iteration over definitions");
		
		loaderImports.addImport("org.dmd.dmc.DmcNameClashException", "For exceptions");
		loaderImports.addImport("org.dmd.dmc.DmcValueException", "For exceptions");
		loaderImports.addImport("org.dmd.dmc.DmcValueExceptionSet", "For exceptions");
		loaderImports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "For exceptions");
		loaderImports.addImport("org.dmd.util.exceptions.ResultException", "For exceptions");
		
		loaderImports.addImport("org.dmd.dmc.DmcOmni", "Back reference tracking");
		loaderImports.addImport("org.dmd.util.parsing.ConfigLocation", "Where a module came from");
		
		out.write(loaderImports.getFormattedImports());
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + dslDef.getName() + "ConfigLoader extends " + dslDef.getName() + "GenUtility {\n");
		
		out.write("    private " + dslDef.getName() + "DefinitionManager definitionManager;\n");
		out.write("    \n");
		out.write("    public " + dslDef.getName() + CONFIG_LOADER + "() {\n");
		out.write("        // Allows us to follow back references\n");
		out.write("        DmcOmni.instance().backRefTracking(true);\n");
		out.write("    }\n");
		out.write("    \n");
		
		out.write("    /**\n");
		out.write("     * Load all modules from the specified directory.\n");
		out.write("     * @param srcdir the directory from which to load modules\n");
		out.write("     */\n");
		out.write("    public void loadAllModules(String srcdir) throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {\n");
		out.write("        String[] args = { \"-srcdir\", srcdir };\n");
		out.write("                \n");
		out.write("        super.run(args);\n");
		out.write("    }\n");
		out.write("    \n");
		
		out.write("    /**\n");
		out.write("     * Load the specified module and all of its dependencies.\n");
		out.write("     * @param srcdir the directory from which to load modules\n");
		out.write("     * @param module the name of the module (without the file extension)\n");
		out.write("     */\n");
		out.write("    public void loadModule(String srcdir, String module) throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {\n");
		out.write("        String[] args = { \"-srcdir\", srcdir , \"-targets\", module};\n");
		out.write("        \n");
		out.write("        super.run(args);\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("    /**\n");
		out.write("     * Adds a directory that will be recursively searched for modules.\n");
		out.write("     * @param dir the directory to be searched\n");
		out.write("     */\n");
		out.write("    public void addSrcDir(String dir){\n");
		out.write("        searchPaths.add(dir);\n");
		out.write("    }\n");
		out.write("    \n");
		
		out.write("    public " + dslDef.getName() + "DefinitionManager definitionManager() {\n");
		out.write("        return(definitionManager);\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("    @Override\n");
		out.write("    public void parsingComplete(" + dslDef.getName() + " module, ConfigLocation location, " + dslDef.getName() + "DefinitionManager definitions) throws ResultException {\n");
		out.write("        // This is called once all required modules have been parsed\n");
		out.write("        // If you need to insert other definitions prior to object resolution, this is where you can do it\n");
		out.write("        \n");
		out.write("        // We hold on to the definition manager so that it can be accessed\n");
		out.write("        definitionManager = definitions;\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("    @Override\n");
		out.write("    public void objectResolutionComplete(" + dslDef.getName() + " module, ConfigLocation location, " + dslDef.getName() + "DefinitionManager definitions) throws ResultException {\n");
		out.write("        // This is called when the object resolution phase has completed\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("    @Override\n");
		out.write("    public void generate(" + dslDef.getName() + " module, ConfigLocation location, " + dslDef.getName() + "DefinitionManager definitions) throws ResultException, IOException {\n");
		out.write("        initializeDefinitions();\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("    @Override\n");
		out.write("    public void generate(" + dslDef.getName() + "DefinitionManager definitions) throws ResultException, IOException {\n");
		out.write("        initializeDefinitions();\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("    @Override\n");
		out.write("    public void displayHelp() {\n");
		out.write("        // This is not required in this context\n");
		out.write("    }\n");
		out.write("    \n");
		
		out.write("    private void initializeDefinitions() throws ResultException {\n");
		for(int i=allBaseDefinitions.size()-1; i>=0; i--) {
			DSDefinitionModule ddm = allBaseDefinitions.get(i);
			
			String base = ddm.getBaseDefinition().getName().getNameString();
			
			out.write("        Iterator<" + base + "> " + base + "IT = definitionManager.getAll" + base + "();\n");
			out.write("        while(" + base + "IT.hasNext()) {\n");
			out.write("            " + base + " def = " + base + "IT.next();\n");
			out.write("            def.initialize((" + ddm.getDefinitionsInterfaceName() + ")definitionManager);\n");
			out.write("        }\n");
		}
		
		out.write("    }\n");
		
		out.write("}\n\n");
		

		out.close();

	}
}
