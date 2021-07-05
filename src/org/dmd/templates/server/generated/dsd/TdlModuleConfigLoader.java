package org.dmd.templates.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.util.codegen.InitializationInterfaceManager.generateConfigLoader(InitializationInterfaceManager.java:159)
import java.io.IOException;                                                   // For exceptions - (InitializationInterfaceManager.java:147)
import java.util.Iterator;                                                    // Iteration over definitions - (InitializationInterfaceManager.java:148)
import org.dmd.dmc.DmcNameClashException;                                     // For exceptions - (InitializationInterfaceManager.java:150)
import org.dmd.dmc.DmcOmni;                                                   // Back reference tracking - (InitializationInterfaceManager.java:156)
import org.dmd.dmc.DmcValueException;                                         // For exceptions - (InitializationInterfaceManager.java:151)
import org.dmd.dmc.DmcValueExceptionSet;                                      // For exceptions - (InitializationInterfaceManager.java:152)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                 // For exceptions - (InitializationInterfaceManager.java:153)
import org.dmd.templates.server.extended.TdlDefinition;                       // One of our base definition types - (InitializationInterfaceManager.java:109)
import org.dmd.templates.server.extended.TdlModule;                           // The module type we load - (InitializationInterfaceManager.java:69)
import org.dmd.templates.server.generated.dsd.TdlModuleDefinitionsIF;         // Interface for TdlModule definitions - (InitializationInterfaceManager.java:101)
import org.dmd.util.exceptions.ResultException;                               // For exceptions - (InitializationInterfaceManager.java:154)
import org.dmd.util.parsing.ConfigLocation;                                   // Where a module came from - (InitializationInterfaceManager.java:157)


// Generated from: org.dmd.util.codegen.InitializationInterfaceManager.generateConfigLoader(InitializationInterfaceManager.java:162)
public class TdlModuleConfigLoader extends TdlModuleGenUtility {
    private TdlModuleDefinitionManager definitionManager;
    
    public TdlModuleConfigLoader() {
        // Allows us to follow back references
        DmcOmni.instance().backRefTracking(true);
    }
    
    /**
     * Load all modules from the specified directory.
     * @param srcdir the directory from which to load modules
     */
    public void loadAllModules(String srcdir) throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
        String[] args = { "-srcdir", srcdir };
                
        super.run(args);
    }
    
    /**
     * Load the specified module and all of its dependencies.
     * @param srcdir the directory from which to load modules
     * @param module the name of the module (without the file extension)
     */
    public void loadModule(String srcdir, String module) throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
        String[] args = { "-srcdir", srcdir , "-targets", module};
        
        super.run(args);
    }

    /**
     * Adds a directory that will be recursively searched for modules.
     * @param dir the directory to be searched
     */
    public void addSrcDir(String dir){
        searchPaths.add(dir);
    }
    
    public TdlModuleDefinitionManager definitionManager() {
        return(definitionManager);
    }

    @Override
    public void parsingComplete(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws ResultException {
        // This is called once all required modules have been parsed
        // If you need to insert other definitions prior to object resolution, this is where you can do it
        
        // We hold on to the definition manager so that it can be accessed
        definitionManager = definitions;
    }

    @Override
    public void objectResolutionComplete(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws ResultException {
        // This is called when the object resolution phase has completed
    }

    @Override
    public void generate(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws ResultException, IOException {
        initializeDefinitions();
    }

    @Override
    public void generate(TdlModuleDefinitionManager definitions) throws ResultException, IOException {
        initializeDefinitions();
    }

    @Override
    public void displayHelp() {
        // This is not required in this context
    }
    
    private void initializeDefinitions() throws ResultException {
        Iterator<TdlDefinition> TdlDefinitionIT = definitionManager.getAllTdlDefinition();
        while(TdlDefinitionIT.hasNext()) {
            TdlDefinition def = TdlDefinitionIT.next();
            def.initialize((TdlModuleDefinitionsIF)definitionManager);
        }
    }
}

