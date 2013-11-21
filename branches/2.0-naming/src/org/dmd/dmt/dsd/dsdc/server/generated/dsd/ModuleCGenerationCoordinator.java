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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGenerationCoordinator(DSDArtifactFormatter.java:570)
import java.io.IOException;                                                        // If we run it to problems finding configs - (DSDArtifactFormatter.java:541)
import java.util.ArrayList;                                                        // To handle lists of things - (DSDArtifactFormatter.java:542)
import java.util.TreeMap;                                                          // To handle loaded configs - (DSDArtifactFormatter.java:543)
import org.dmd.dmc.DmcValueException;                                              // To handle exceptions from value handling - (DSDArtifactFormatter.java:545)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                      // In case we have rule failures - (DSDArtifactFormatter.java:547)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                               // One of the DDS modules we might load - (DSDArtifactFormatter.java:561)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParser;                    // Required to parse ModuleA definitions - (DSDArtifactFormatter.java:563)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                        // To allow loading of rules from the dsdA schema - (DSDArtifactFormatter.java:565)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                               // One of the DDS modules we might load - (DSDArtifactFormatter.java:561)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBParser;                    // Required to parse ModuleB definitions - (DSDArtifactFormatter.java:563)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.DsdBDMSAG;                        // To allow loading of rules from the dsdB schema - (DSDArtifactFormatter.java:565)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                               // One of the DDS modules we might load - (DSDArtifactFormatter.java:561)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCDefinitionManager;         // Maintains all parsed definitions - (DSDArtifactFormatter.java:556)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCParser;                    // Required to parse ModuleC definitions - (DSDArtifactFormatter.java:563)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.DsdCDMSAG;                        // To allow loading of rules from the dsdC schema - (DSDArtifactFormatter.java:565)
import org.dmd.dmv.shared.DmvRuleManager;                                          // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:553)
import org.dmd.util.exceptions.ResultException;                                    // To handle processing exceptions - (DSDArtifactFormatter.java:546)
import org.dmd.util.parsing.ConfigFinder;                                          // Finds configs we may need to parse - (DSDArtifactFormatter.java:549)
import org.dmd.util.parsing.ConfigLocation;                                        // Handle to a discovered configuration - (DSDArtifactFormatter.java:550)
import org.dmd.util.parsing.ConfigVersion;                                         // Handle to a particular config version - (DSDArtifactFormatter.java:551)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGenerationCoordinator(DSDArtifactFormatter.java:574)
/**
 * The generation coordinator will find all config files associated with the ModuleC DSD
 * and coordinate the parsing and artifact generation.
 */
public class ModuleCGenerationCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGenerationCoordinator(DSDArtifactFormatter.java:581)
    DmvRuleManager                    rules                      = new DmvRuleManager();                    // Rule manager
    ModuleCDefinitionManager          definitions                = new ModuleCDefinitionManager();          // Maintains all parsed definitions
    ModuleAParser                     parserForModuleA;                                                     // Parser for ModuleA definitions
    ConfigFinder                      finderForModuleA           = new ConfigFinder("tma");                 // Config finder for ModuleA config files ending with .tma
    TreeMap<String,ConfigLocation>    loadedConfigsForModuleA    = new TreeMap<String, ConfigLocation>();   // The names/location of the ModuleA modules that have been loaded

    ModuleBParser                     parserForModuleB;                                                     // Parser for ModuleB definitions
    ConfigFinder                      finderForModuleB           = new ConfigFinder("tmb");                 // Config finder for ModuleB config files ending with .tmb
    TreeMap<String,ConfigLocation>    loadedConfigsForModuleB    = new TreeMap<String, ConfigLocation>();   // The names/location of the ModuleB modules that have been loaded

    ModuleCParser                     parserForModuleC;                                                     // Parser for ModuleC definitions
    ConfigFinder                      finderForModuleC           = new ConfigFinder("tmc");                 // Config finder for ModuleC config files ending with .tmc
    TreeMap<String,ConfigLocation>    loadedConfigsForModuleC    = new TreeMap<String, ConfigLocation>();   // The names/location of the ModuleC modules that have been loaded


    public ModuleCGenerationCoordinator(ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, IOException {
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

    }


    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet {
        ConfigVersion version = finderForModuleC.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        ModuleC loaded = parserForModuleC.parseConfig(location);


    }

    public void generateForAllConfigs(){




    }

    class ModuleAInfo {
        ModuleA module;
        ConfigLocation location;

        ModuleAInfo(ModuleA m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

    class ModuleBInfo {
        ModuleB module;
        ConfigLocation location;

        ModuleBInfo(ModuleB m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

    class ModuleCInfo {
        ModuleC module;
        ConfigLocation location;

        ModuleCInfo(ModuleC m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

