package org.dmd.dmt.dsd.dsdb.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1138)
import java.io.IOException;                                                         // If we run it to problems finding configs - (DSDArtifactFormatter.java:1098)
import java.util.ArrayList;                                                         // To handle lists of things - (DSDArtifactFormatter.java:1100)
import java.util.Iterator;                                                          // To iterate over collections - (DSDArtifactFormatter.java:1099)
import java.util.TreeMap;                                                           // To handle loaded configs - (DSDArtifactFormatter.java:1101)
import org.dmd.dmc.DmcNameClashException;                                           // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:1106)
import org.dmd.dmc.DmcValueException;                                               // To handle exceptions from value handling - (DSDArtifactFormatter.java:1105)
import org.dmd.dmc.DmcValueExceptionSet;                                            // May occur when resolving objects - (DSDArtifactFormatter.java:1113)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                       // In case we have rule failures - (DSDArtifactFormatter.java:1108)
import org.dmd.dmc.types.DefinitionName;                                            // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:1103)
import org.dmd.dms.DSDefinition;                                                    // The common base for all modules - so that we can get error location info - (DSDArtifactFormatter.java:1104)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:1127)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParser;                     // Required to parse ModuleA definitions - (DSDArtifactFormatter.java:1131)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;                      // To access references to ModuleB - (DSDArtifactFormatter.java:1129)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:1127)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBDefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:1118)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:1121)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBParser;                     // Required to parse ModuleB definitions - (DSDArtifactFormatter.java:1131)
import org.dmd.dmt.dsd.dsdb.shared.generated.types.ModuleBREF;                      // To access references to ModuleB - (DSDArtifactFormatter.java:1129)
import org.dmd.dmv.shared.DmvRuleManager;                                           // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:1115)
import org.dmd.util.exceptions.ResultException;                                     // To handle processing exceptions - (DSDArtifactFormatter.java:1107)
import org.dmd.util.parsing.ConfigFinder;                                           // Finds configs we may need to parse - (DSDArtifactFormatter.java:1110)
import org.dmd.util.parsing.ConfigLocation;                                         // Handle to a discovered configuration - (DSDArtifactFormatter.java:1111)
import org.dmd.util.parsing.ConfigVersion;                                          // Handle to a particular config version - (DSDArtifactFormatter.java:1112)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1142)
/**
 * The parsing coordinator will find all config files associated with the ModuleB DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class ModuleBParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1149)
    DmvRuleManager                          rules                   = new DmvRuleManager();                         // Rule manager
    ModuleBDefinitionManager                definitions             = new ModuleBDefinitionManager();               // Maintains all parsed definitions
    ModuleBGeneratorInterface               generator;                                                              // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>         loadedConfigs           = new TreeMap<String, ModuleInfoBase>();        // Stores all loaded configs based on the name of the file that was parsed.
    ModuleAParser                           parserForModuleA;                                                       // Parser for ModuleA definitions
    ConfigFinder                            finderForModuleA        = new ConfigFinder(".tma");                     // Config finder for ModuleA config files ending with .tma
    TreeMap<DefinitionName, ModuleAInfo>    loadedModuleAConfigs    = new TreeMap<DefinitionName, ModuleAInfo>();   // The names/location of the ModuleA modules that have been loaded

    ModuleBParser                           parserForModuleB;                                                       // Parser for ModuleB definitions
    ConfigFinder                            finderForModuleB        = new ConfigFinder(".tmb");                     // Config finder for ModuleB config files ending with .tmb
    TreeMap<DefinitionName, ModuleBInfo>    loadedModuleBConfigs    = new TreeMap<DefinitionName, ModuleBInfo>();   // The names/location of the ModuleB modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1151)
    public ModuleBParsingCoordinator(ModuleBGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

        parserForModuleA = new ModuleAParser(definitions, rules);
        finderForModuleA.setSourceAndJarInfo(sourceDirs,jars);
        finderForModuleA.findConfigs();

        parserForModuleB = new ModuleBParser(definitions, rules);
        finderForModuleB.setSourceAndJarInfo(sourceDirs,jars);
        finderForModuleB.findConfigs();

    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1204)
    public DmvRuleManager getRuleManager(){
        	return(rules);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1209)
    public ModuleAParser parserForModuleA(){
        return(parserForModuleA);
    }

    public ModuleBParser parserForModuleB(){
        return(parserForModuleB);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1216)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ConfigVersion version = finderForModuleB.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        ModuleB loaded = loadModuleBModule(location);
        
        if (location.isFromJAR()){
            ResultException ex = new ResultException("We can't run generation for a config loaded from a JAR: " + configName);
            ex.moreMessages(location.toString());
            throw(ex);
        }
        
        generator.parsingComplete(loaded, location, definitions);
        
        definitions.resolveReferences();
        
        generator.generate(loaded,location,definitions);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1242)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ModuleB loaded = null;
        ModuleBInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForModuleB.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (ModuleBInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = loadModuleBModule(location);
            }
            else{
                loaded = loadedInfo.module;
            }

            generator.parsingComplete(loaded, location, definitions);

            definitions.resolveReferences();

            generator.objectResolutionComplete(loaded, location, definitions);

        }

        generator.generate(definitions);

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1274)
    ModuleA loadModuleAModule(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        ModuleAInfo info = loadedModuleAConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        ModuleA loaded = parserForModuleA.parseConfig(location);
        ModuleAInfo loadedInfo = new ModuleAInfo(loaded,location);
        loadedModuleAConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1291)
    public ConfigLocation getLocation(ModuleA module){
        ModuleAInfo info = loadedModuleAConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1274)
    ModuleB loadModuleBModule(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        ModuleBInfo info = loadedModuleBConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        ModuleB loaded = parserForModuleB.parseConfig(location);
        ModuleBInfo loadedInfo = new ModuleBInfo(loaded,location);
        loadedModuleBConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1291)
    public ConfigLocation getLocation(ModuleB module){
        ModuleBInfo info = loadedModuleBConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1302)
    void loadModuleDependencies(ModuleInfoBase mi) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

        if (mi.dependenciesLoaded)
            return;

        if (mi instanceof ModuleAInfo){
            ModuleAInfo info = (ModuleAInfo)mi;
            if (info.module.getDependsOnModuleAHasValue()){
                Iterator<ModuleAREF> it = info.module.getDMO().getDependsOnModuleA();
                while(it.hasNext()){
                    ModuleAREF ref = it.next();
                    ConfigVersion version = finderForModuleA.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".tma");
            
                    loadModuleAModule(version.getLatestVersion());
                }
            }
            info.dependenciesLoaded = true;
        }
        else if (mi instanceof ModuleBInfo){
            ModuleBInfo info = (ModuleBInfo)mi;
            if (info.module.getDependsOnModuleAHasValue()){
                Iterator<ModuleAREF> it = info.module.getDMO().getDependsOnModuleA();
                while(it.hasNext()){
                    ModuleAREF ref = it.next();
                    ConfigVersion version = finderForModuleA.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".tma");
            
                    loadModuleAModule(version.getLatestVersion());
                }
            }
            if (info.module.getDependsOnModuleBHasValue()){
                Iterator<ModuleBREF> it = info.module.getDMO().getDependsOnModuleB();
                while(it.hasNext()){
                    ModuleBREF ref = it.next();
                    ConfigVersion version = finderForModuleB.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".tmb");
            
                    loadModuleBModule(version.getLatestVersion());
                }
            }
            info.dependenciesLoaded = true;
        }




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1332)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1338)
    void missingConfigError(DSDefinition module, String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        ex.setLocationInfo(module.getFile(), module.getLineNumber());
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1346)
    class ModuleInfoBase {
        ConfigLocation location;
        boolean        dependenciesLoaded;
    }

    class ModuleAInfo extends ModuleInfoBase {
        ModuleA module;

        ModuleAInfo(ModuleA m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

    class ModuleBInfo extends ModuleInfoBase {
        ModuleB module;

        ModuleBInfo(ModuleB m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

