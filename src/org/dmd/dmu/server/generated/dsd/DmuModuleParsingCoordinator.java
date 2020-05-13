package org.dmd.dmu.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1127)
import java.io.IOException;                                                  // If we run it to problems finding configs - (DSDArtifactFormatter.java:1087)
import java.util.ArrayList;                                                  // To handle lists of things - (DSDArtifactFormatter.java:1089)
import java.util.Iterator;                                                   // To iterate over collections - (DSDArtifactFormatter.java:1088)
import java.util.TreeMap;                                                    // To handle loaded configs - (DSDArtifactFormatter.java:1090)
import org.dmd.dmc.DmcNameClashException;                                    // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:1095)
import org.dmd.dmc.DmcValueException;                                        // To handle exceptions from value handling - (DSDArtifactFormatter.java:1094)
import org.dmd.dmc.DmcValueExceptionSet;                                     // May occur when resolving objects - (DSDArtifactFormatter.java:1102)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                // In case we have rule failures - (DSDArtifactFormatter.java:1097)
import org.dmd.dmc.types.DefinitionName;                                     // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:1092)
import org.dmd.dms.DSDefinition;                                             // The common base for all modules - so that we can get error location info - (DSDArtifactFormatter.java:1093)
import org.dmd.dmu.server.extended.DmuModule;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:1116)
import org.dmd.dmu.server.generated.dsd.DmuModuleDefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:1107)
import org.dmd.dmu.server.generated.dsd.DmuModuleGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:1110)
import org.dmd.dmu.server.generated.dsd.DmuModuleParser;                     // Required to parse DmuModule definitions - (DSDArtifactFormatter.java:1120)
import org.dmd.dmu.shared.generated.types.DmuModuleREF;                      // To access references to DmuModule - (DSDArtifactFormatter.java:1118)
import org.dmd.dmv.shared.DmvRuleManager;                                    // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:1104)
import org.dmd.util.exceptions.ResultException;                              // To handle processing exceptions - (DSDArtifactFormatter.java:1096)
import org.dmd.util.parsing.ConfigFinder;                                    // Finds configs we may need to parse - (DSDArtifactFormatter.java:1099)
import org.dmd.util.parsing.ConfigLocation;                                  // Handle to a discovered configuration - (DSDArtifactFormatter.java:1100)
import org.dmd.util.parsing.ConfigVersion;                                   // Handle to a particular config version - (DSDArtifactFormatter.java:1101)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1131)
/**
 * The parsing coordinator will find all config files associated with the DmuModule DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class DmuModuleParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1138)
    DmvRuleManager                            rules                     = new DmvRuleManager();                           // Rule manager
    DmuModuleDefinitionManager                definitions               = new DmuModuleDefinitionManager();               // Maintains all parsed definitions
    DmuModuleGeneratorInterface               generator;                                                                  // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>           loadedConfigs             = new TreeMap<String, ModuleInfoBase>();          // Stores all loaded configs based on the name of the file that was parsed.
    DmuModuleParser                           parserForDmuModule;                                                         // Parser for DmuModule definitions
    ConfigFinder                              finderForDmuModule        = new ConfigFinder(".dmu");                       // Config finder for DmuModule config files ending with .dmu
    TreeMap<DefinitionName, DmuModuleInfo>    loadedDmuModuleConfigs    = new TreeMap<DefinitionName, DmuModuleInfo>();   // The names/location of the DmuModule modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1140)
    public DmuModuleParsingCoordinator(DmuModuleGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

        parserForDmuModule = new DmuModuleParser(definitions, rules);
        finderForDmuModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForDmuModule.findConfigs();

    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1193)
    public DmvRuleManager getRuleManager(){
        	return(rules);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1198)
    public DmuModuleParser parserForDmuModule(){
        return(parserForDmuModule);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1205)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ConfigVersion version = finderForDmuModule.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        DmuModule loaded = loadDmuModuleModule(location);
        
        if (location.isFromJAR()){
            ResultException ex = new ResultException("We can't run generation for a config loaded from a JAR: " + configName);
            ex.moreMessages(location.toString());
            throw(ex);
        }
        
        generator.parsingComplete(loaded, location, definitions);
        
        definitions.resolveReferences();
        
        generator.generate(loaded,location,definitions);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1231)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        DmuModule loaded = null;
        DmuModuleInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForDmuModule.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (DmuModuleInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = loadDmuModuleModule(location);
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1263)
    DmuModule loadDmuModuleModule(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        DmuModuleInfo info = loadedDmuModuleConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        DmuModule loaded = parserForDmuModule.parseConfig(location);
        DmuModuleInfo loadedInfo = new DmuModuleInfo(loaded,location);
        loadedDmuModuleConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1280)
    public ConfigLocation getLocation(DmuModule module){
        DmuModuleInfo info = loadedDmuModuleConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1291)
    void loadModuleDependencies(ModuleInfoBase mi) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

        if (mi.dependenciesLoaded)
            return;

        if (mi instanceof DmuModuleInfo){
            DmuModuleInfo info = (DmuModuleInfo)mi;
            if (info.module.getDependsOnDmuModuleHasValue()){
                Iterator<DmuModuleREF> it = info.module.getDMO().getDependsOnDmuModule();
                while(it.hasNext()){
                    DmuModuleREF ref = it.next();
                    ConfigVersion version = finderForDmuModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".dmu");
            
                    loadDmuModuleModule(version.getLatestVersion());
                }
            }
            info.dependenciesLoaded = true;
        }




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1321)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1327)
    void missingConfigError(DSDefinition module, String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        ex.setLocationInfo(module.getFile(), module.getLineNumber());
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1335)
    class ModuleInfoBase {
        ConfigLocation location;
        boolean        dependenciesLoaded;
    }

    class DmuModuleInfo extends ModuleInfoBase {
        DmuModule module;

        DmuModuleInfo(DmuModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

