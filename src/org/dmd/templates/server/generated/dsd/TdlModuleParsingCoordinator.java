//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.templates.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1127)
import java.io.IOException;                                                        // If we run it to problems finding configs - (DSDArtifactFormatter.java:1087)
import java.util.ArrayList;                                                        // To handle lists of things - (DSDArtifactFormatter.java:1089)
import java.util.Iterator;                                                         // To iterate over collections - (DSDArtifactFormatter.java:1088)
import java.util.TreeMap;                                                          // To handle loaded configs - (DSDArtifactFormatter.java:1090)
import org.dmd.dmc.DmcNameClashException;                                          // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:1095)
import org.dmd.dmc.DmcValueException;                                              // To handle exceptions from value handling - (DSDArtifactFormatter.java:1094)
import org.dmd.dmc.DmcValueExceptionSet;                                           // May occur when resolving objects - (DSDArtifactFormatter.java:1102)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                      // In case we have rule failures - (DSDArtifactFormatter.java:1097)
import org.dmd.dmc.types.DefinitionName;                                           // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:1092)
import org.dmd.dms.DSDefinition;                                                   // The common base for all modules - so that we can get error location info - (DSDArtifactFormatter.java:1093)
import org.dmd.dmv.shared.DmvRuleManager;                                          // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:1104)
import org.dmd.templates.server.extended.TdlModule;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:1116)
import org.dmd.templates.server.generated.dsd.TdlModuleDefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:1107)
import org.dmd.templates.server.generated.dsd.TdlModuleGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:1110)
import org.dmd.templates.server.generated.dsd.TdlModuleParser;                     // Required to parse TdlModule definitions - (DSDArtifactFormatter.java:1120)
import org.dmd.templates.shared.generated.types.TdlModuleREF;                      // To access references to TdlModule - (DSDArtifactFormatter.java:1118)
import org.dmd.util.exceptions.ResultException;                                    // To handle processing exceptions - (DSDArtifactFormatter.java:1096)
import org.dmd.util.parsing.ConfigFinder;                                          // Finds configs we may need to parse - (DSDArtifactFormatter.java:1099)
import org.dmd.util.parsing.ConfigLocation;                                        // Handle to a discovered configuration - (DSDArtifactFormatter.java:1100)
import org.dmd.util.parsing.ConfigVersion;                                         // Handle to a particular config version - (DSDArtifactFormatter.java:1101)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1131)
/**
 * The parsing coordinator will find all config files associated with the TdlModule DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class TdlModuleParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1138)
    DmvRuleManager                            rules                     = new DmvRuleManager();                           // Rule manager
    TdlModuleDefinitionManager                definitions               = new TdlModuleDefinitionManager();               // Maintains all parsed definitions
    TdlModuleGeneratorInterface               generator;                                                                  // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>           loadedConfigs             = new TreeMap<String, ModuleInfoBase>();          // Stores all loaded configs based on the name of the file that was parsed.
    TdlModuleParser                           parserForTdlModule;                                                         // Parser for TdlModule definitions
    ConfigFinder                              finderForTdlModule        = new ConfigFinder(".dmtdl");                     // Config finder for TdlModule config files ending with .dmtdl
    TreeMap<DefinitionName, TdlModuleInfo>    loadedTdlModuleConfigs    = new TreeMap<DefinitionName, TdlModuleInfo>();   // The names/location of the TdlModule modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1140)
    public TdlModuleParsingCoordinator(TdlModuleGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

        parserForTdlModule = new TdlModuleParser(definitions, rules);
        finderForTdlModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForTdlModule.findConfigs();

    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1193)
    public DmvRuleManager getRuleManager(){
        	return(rules);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1198)
    public TdlModuleParser parserForTdlModule(){
        return(parserForTdlModule);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1205)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ConfigVersion version = finderForTdlModule.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        TdlModule loaded = loadTdlModuleModule(location);
        
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
        TdlModule loaded = null;
        TdlModuleInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForTdlModule.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (TdlModuleInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = loadTdlModuleModule(location);
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
    TdlModule loadTdlModuleModule(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        TdlModuleInfo info = loadedTdlModuleConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        TdlModule loaded = parserForTdlModule.parseConfig(location);
        TdlModuleInfo loadedInfo = new TdlModuleInfo(loaded,location);
        loadedTdlModuleConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1280)
    public ConfigLocation getLocation(TdlModule module){
        TdlModuleInfo info = loadedTdlModuleConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1291)
    void loadModuleDependencies(ModuleInfoBase mi) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

        if (mi.dependenciesLoaded)
            return;

        if (mi instanceof TdlModuleInfo){
            TdlModuleInfo info = (TdlModuleInfo)mi;
            if (info.module.getDependsOnTdlModuleHasValue()){
                Iterator<TdlModuleREF> it = info.module.getDMO().getDependsOnTdlModule();
                while(it.hasNext()){
                    TdlModuleREF ref = it.next();
                    ConfigVersion version = finderForTdlModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".dmtdl");
            
                    loadTdlModuleModule(version.getLatestVersion());
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

    class TdlModuleInfo extends ModuleInfoBase {
        TdlModule module;

        TdlModuleInfo(TdlModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

