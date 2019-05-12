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
package org.dmd.concinnity.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1046)
import java.io.IOException;                                                                // If we run it to problems finding configs - (DSDArtifactFormatter.java:1006)
import java.util.ArrayList;                                                                // To handle lists of things - (DSDArtifactFormatter.java:1008)
import java.util.Iterator;                                                                 // To iterate over collections - (DSDArtifactFormatter.java:1007)
import java.util.TreeMap;                                                                  // To handle loaded configs - (DSDArtifactFormatter.java:1009)
import org.dmd.concinnity.server.extended.ConcinnityModule;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:1035)
import org.dmd.concinnity.server.generated.dsd.ConcinnityModuleDefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:1026)
import org.dmd.concinnity.server.generated.dsd.ConcinnityModuleGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:1029)
import org.dmd.concinnity.server.generated.dsd.ConcinnityModuleParser;                     // Required to parse ConcinnityModule definitions - (DSDArtifactFormatter.java:1039)
import org.dmd.concinnity.shared.generated.types.ConcinnityModuleREF;                      // To access references to ConcinnityModule - (DSDArtifactFormatter.java:1037)
import org.dmd.dmc.DmcNameClashException;                                                  // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:1014)
import org.dmd.dmc.DmcValueException;                                                      // To handle exceptions from value handling - (DSDArtifactFormatter.java:1013)
import org.dmd.dmc.DmcValueExceptionSet;                                                   // May occur when resolving objects - (DSDArtifactFormatter.java:1021)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                              // In case we have rule failures - (DSDArtifactFormatter.java:1016)
import org.dmd.dmc.types.DefinitionName;                                                   // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:1011)
import org.dmd.dms.DSDefinition;                                                           // The common base for all modules - so that we can get error location info - (DSDArtifactFormatter.java:1012)
import org.dmd.dmv.shared.DmvRuleManager;                                                  // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:1023)
import org.dmd.util.exceptions.ResultException;                                            // To handle processing exceptions - (DSDArtifactFormatter.java:1015)
import org.dmd.util.parsing.ConfigFinder;                                                  // Finds configs we may need to parse - (DSDArtifactFormatter.java:1018)
import org.dmd.util.parsing.ConfigLocation;                                                // Handle to a discovered configuration - (DSDArtifactFormatter.java:1019)
import org.dmd.util.parsing.ConfigVersion;                                                 // Handle to a particular config version - (DSDArtifactFormatter.java:1020)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1050)
/**
 * The parsing coordinator will find all config files associated with the ConcinnityModule DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class ConcinnityModuleParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1057)
    DmvRuleManager                                   rules                            = new DmvRuleManager();                                  // Rule manager
    ConcinnityModuleDefinitionManager                definitions                      = new ConcinnityModuleDefinitionManager();               // Maintains all parsed definitions
    ConcinnityModuleGeneratorInterface               generator;                                                                                // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>                  loadedConfigs                    = new TreeMap<String, ModuleInfoBase>();                 // Stores all loaded configs based on the name of the file that was parsed.
    ConcinnityModuleParser                           parserForConcinnityModule;                                                                // Parser for ConcinnityModule definitions
    ConfigFinder                                     finderForConcinnityModule        = new ConfigFinder(".dmcm");                             // Config finder for ConcinnityModule config files ending with .dmcm
    TreeMap<DefinitionName, ConcinnityModuleInfo>    loadedConcinnityModuleConfigs    = new TreeMap<DefinitionName, ConcinnityModuleInfo>();   // The names/location of the ConcinnityModule modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1059)
    public ConcinnityModuleParsingCoordinator(ConcinnityModuleGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

        parserForConcinnityModule = new ConcinnityModuleParser(definitions, rules);
        finderForConcinnityModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForConcinnityModule.findConfigs();

    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1112)
    public DmvRuleManager getRuleManager(){
        	return(rules);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1117)
    public ConcinnityModuleParser parserForConcinnityModule(){
        return(parserForConcinnityModule);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1124)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ConfigVersion version = finderForConcinnityModule.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        ConcinnityModule loaded = loadConcinnityModuleModule(location);
        
        if (location.isFromJAR()){
            ResultException ex = new ResultException("We can't run generation for a config loaded from a JAR: " + configName);
            ex.moreMessages(location.toString());
            throw(ex);
        }
        
        generator.parsingComplete(loaded, location, definitions);
        
        definitions.resolveReferences();
        
        generator.generate(loaded,location,definitions);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1150)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ConcinnityModule loaded = null;
        ConcinnityModuleInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForConcinnityModule.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (ConcinnityModuleInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = loadConcinnityModuleModule(location);
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1182)
    ConcinnityModule loadConcinnityModuleModule(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        ConcinnityModuleInfo info = loadedConcinnityModuleConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        ConcinnityModule loaded = parserForConcinnityModule.parseConfig(location);
        ConcinnityModuleInfo loadedInfo = new ConcinnityModuleInfo(loaded,location);
        loadedConcinnityModuleConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1199)
    public ConfigLocation getLocation(ConcinnityModule module){
        ConcinnityModuleInfo info = loadedConcinnityModuleConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1210)
    void loadModuleDependencies(ModuleInfoBase mi) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

        if (mi.dependenciesLoaded)
            return;

        if (mi instanceof ConcinnityModuleInfo){
            ConcinnityModuleInfo info = (ConcinnityModuleInfo)mi;
            if (info.module.getDependsOnConcinnityModuleHasValue()){
                Iterator<ConcinnityModuleREF> it = info.module.getDMO().getDependsOnConcinnityModule();
                while(it.hasNext()){
                    ConcinnityModuleREF ref = it.next();
                    ConfigVersion version = finderForConcinnityModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".dmcm");
            
                    loadConcinnityModuleModule(version.getLatestVersion());
                }
            }
            info.dependenciesLoaded = true;
        }




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1240)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1246)
    void missingConfigError(DSDefinition module, String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        ex.setLocationInfo(module.getFile(), module.getLineNumber());
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1254)
    class ModuleInfoBase {
        ConfigLocation location;
        boolean        dependenciesLoaded;
    }

    class ConcinnityModuleInfo extends ModuleInfoBase {
        ConcinnityModule module;

        ConcinnityModuleInfo(ConcinnityModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

