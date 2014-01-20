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
package org.dmd.dmt.dsd.dsdc.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:652)
import java.io.IOException;                                                         // If we run it to problems finding configs - (DSDArtifactFormatter.java:614)
import java.util.ArrayList;                                                         // To handle lists of things - (DSDArtifactFormatter.java:616)
import java.util.Iterator;                                                          // To iterate over collections - (DSDArtifactFormatter.java:615)
import java.util.TreeMap;                                                           // To handle loaded configs - (DSDArtifactFormatter.java:617)
import org.dmd.dmc.DmcNameClashException;                                           // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:621)
import org.dmd.dmc.DmcValueException;                                               // To handle exceptions from value handling - (DSDArtifactFormatter.java:620)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                       // In case we have rule failures - (DSDArtifactFormatter.java:623)
import org.dmd.dmc.types.DefinitionName;                                            // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:619)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:641)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParser;                     // Required to parse ModuleA definitions - (DSDArtifactFormatter.java:645)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                         // To allow loading of rules from the dsdA schema - (DSDArtifactFormatter.java:647)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;                      // To access references to ModuleC - (DSDArtifactFormatter.java:643)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:641)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBParser;                     // Required to parse ModuleB definitions - (DSDArtifactFormatter.java:645)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.DsdBDMSAG;                         // To allow loading of rules from the dsdB schema - (DSDArtifactFormatter.java:647)
import org.dmd.dmt.dsd.dsdb.shared.generated.types.ModuleBREF;                      // To access references to ModuleC - (DSDArtifactFormatter.java:643)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:641)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCDefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:632)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:635)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCParser;                     // Required to parse ModuleC definitions - (DSDArtifactFormatter.java:645)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.DsdCDMSAG;                         // To allow loading of rules from the dsdC schema - (DSDArtifactFormatter.java:647)
import org.dmd.dmt.dsd.dsdc.shared.generated.types.ModuleCREF;                      // To access references to ModuleC - (DSDArtifactFormatter.java:643)
import org.dmd.dmv.shared.DmvRuleManager;                                           // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:629)
import org.dmd.util.exceptions.ResultException;                                     // To handle processing exceptions - (DSDArtifactFormatter.java:622)
import org.dmd.util.parsing.ConfigFinder;                                           // Finds configs we may need to parse - (DSDArtifactFormatter.java:625)
import org.dmd.util.parsing.ConfigLocation;                                         // Handle to a discovered configuration - (DSDArtifactFormatter.java:626)
import org.dmd.util.parsing.ConfigVersion;                                          // Handle to a particular config version - (DSDArtifactFormatter.java:627)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:656)
/**
 * The parsing coordinator will find all config files associated with the ModuleC DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class ModuleCParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:663)
    DmvRuleManager                          rules                   = new DmvRuleManager();                         // Rule manager
    ModuleCDefinitionManager                definitions             = new ModuleCDefinitionManager();               // Maintains all parsed definitions
    ModuleCGeneratorInterface               generator;                                                              // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>         loadedConfigs           = new TreeMap<String, ModuleInfoBase>();        // Stores all loaded configs based on the name of the file that was parsed.
    ModuleAParser                           parserForModuleA;                                                       // Parser for ModuleA definitions
    ConfigFinder                            finderForModuleA        = new ConfigFinder("tma");                      // Config finder for ModuleA config files ending with .tma
    TreeMap<DefinitionName, ModuleAInfo>    loadedModuleAConfigs    = new TreeMap<DefinitionName, ModuleAInfo>();   // The names/location of the ModuleA modules that have been loaded

    ModuleBParser                           parserForModuleB;                                                       // Parser for ModuleB definitions
    ConfigFinder                            finderForModuleB        = new ConfigFinder("tmb");                      // Config finder for ModuleB config files ending with .tmb
    TreeMap<DefinitionName, ModuleBInfo>    loadedModuleBConfigs    = new TreeMap<DefinitionName, ModuleBInfo>();   // The names/location of the ModuleB modules that have been loaded

    ModuleCParser                           parserForModuleC;                                                       // Parser for ModuleC definitions
    ConfigFinder                            finderForModuleC        = new ConfigFinder("tmc");                      // Config finder for ModuleC config files ending with .tmc
    TreeMap<DefinitionName, ModuleCInfo>    loadedModuleCConfigs    = new TreeMap<DefinitionName, ModuleCInfo>();   // The names/location of the ModuleC modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:665)
    public ModuleCParsingCoordinator(ModuleCGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

        rules.loadRules(DsdADMSAG.instance());
        parserForModuleA = new ModuleAParser(definitions, rules);
        finderForModuleA.setSourceAndJarInfo(sourceDirs,jars);
        finderForModuleA.findConfigs();

        rules.loadRules(DsdBDMSAG.instance());
        parserForModuleB = new ModuleBParser(definitions, rules);
        finderForModuleB.setSourceAndJarInfo(sourceDirs,jars);
        finderForModuleB.findConfigs();

        rules.loadRules(DsdCDMSAG.instance());
        parserForModuleC = new ModuleCParser(definitions, rules);
        finderForModuleC.setSourceAndJarInfo(sourceDirs,jars);
        finderForModuleC.findConfigs();

        loadBaseModuleModuleC("modcBase");
    }



    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:685)
    void loadBaseModuleModuleC(String config) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {
        ConfigVersion version = finderForModuleC.getConfig(config);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified base configuration file: " + config);
            ex.moreMessages("This is a base module required by the ModuleC DSD");
            ex.moreMessages(finderForModuleC.getSearchInfo());
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        // If we've already loaded the file, skip it
        if (loadedConfigs.get(location.getFileName()) != null)
            return;
        
        ModuleC loaded = parserForModuleC.parseConfig(location);
        ModuleCInfo loadedInfo = new ModuleCInfo(loaded,location);
        loadedModuleCConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        // We've loaded the base configuration file, now load any other modules on which it depends
        loadModuleDependencies(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:727)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        ConfigVersion version = finderForModuleC.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        ModuleC loaded = parserForModuleC.parseConfig(location);
        ModuleCInfo loadedInfo = new ModuleCInfo(loaded,location);
        loadedModuleCConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        // We've loaded the base configuration file, now load any other modules on which it depends
        loadModuleDependencies(loaded);
        
        if (location.isFromJAR()){
            ResultException ex = new ResultException("We can't run generation for a config loaded from a JAR: " + configName);
            ex.moreMessages(location.toString());
            throw(ex);
        }
        
        generator.generate(loaded,location,definitions);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:755)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        ModuleC loaded = null;
        ModuleCInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForModuleC.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (ModuleCInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = parserForModuleC.parseConfig(location);
                loadedInfo = new ModuleCInfo(loaded,location);
                loadedModuleCConfigs.put(loaded.getName(), loadedInfo);
                loadedConfigs.put(location.getFileName(), loadedInfo);

                // We've loaded the base configuration file, now load any other modules on which it depends
                loadModuleDependencies(loaded);
            }
            else{
                loaded = loadedInfo.module;
            }

            if (!location.isFromJAR())
                generator.generate(loaded,location,definitions);

        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:785)
    void loadModuleDependencies(Object obj) throws ResultException {
        if (obj instanceof ModuleA){
            ModuleA module = (ModuleA)obj;
            if (module.getDependsOnModuleAHasValue()){
                Iterator<ModuleAREF> it = module.getDMO().getDependsOnModuleA();
                while(it.hasNext()){
                    ModuleAREF ref = it.next();
                    ConfigVersion version = finderForModuleA.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(ref.toString() + ".tma");
            
                }
            }
        }
        else if (obj instanceof ModuleB){
            ModuleB module = (ModuleB)obj;
            if (module.getDependsOnModuleAHasValue()){
                Iterator<ModuleAREF> it = module.getDMO().getDependsOnModuleA();
                while(it.hasNext()){
                    ModuleAREF ref = it.next();
                    ConfigVersion version = finderForModuleA.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(ref.toString() + ".tma");
            
                }
            }
            if (module.getDependsOnModuleBHasValue()){
                Iterator<ModuleBREF> it = module.getDMO().getDependsOnModuleB();
                while(it.hasNext()){
                    ModuleBREF ref = it.next();
                    ConfigVersion version = finderForModuleB.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(ref.toString() + ".tmb");
            
                }
            }
        }
        else if (obj instanceof ModuleC){
            ModuleC module = (ModuleC)obj;
            if (module.getDependsOnModuleAHasValue()){
                Iterator<ModuleAREF> it = module.getDMO().getDependsOnModuleA();
                while(it.hasNext()){
                    ModuleAREF ref = it.next();
                    ConfigVersion version = finderForModuleA.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(ref.toString() + ".tma");
            
                }
            }
            if (module.getDependsOnModuleBHasValue()){
                Iterator<ModuleBREF> it = module.getDMO().getDependsOnModuleB();
                while(it.hasNext()){
                    ModuleBREF ref = it.next();
                    ConfigVersion version = finderForModuleB.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(ref.toString() + ".tmb");
            
                }
            }
            if (module.getDependsOnModuleCHasValue()){
                Iterator<ModuleCREF> it = module.getDMO().getDependsOnModuleC();
                while(it.hasNext()){
                    ModuleCREF ref = it.next();
                    ConfigVersion version = finderForModuleC.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(ref.toString() + ".tmc");
            
                }
            }
        }




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:810)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:817)
    class ModuleInfoBase {
        ConfigLocation location;
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

    class ModuleCInfo extends ModuleInfoBase {
        ModuleC module;

        ModuleCInfo(ModuleC m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

