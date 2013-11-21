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
package org.dmd.dmt.dsd.dsda.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGenerationCoordinator(DSDArtifactFormatter.java:570)
import java.io.IOException;                                                        // If we run it to problems finding configs - (DSDArtifactFormatter.java:541)
import java.util.ArrayList;                                                        // To handle lists of things - (DSDArtifactFormatter.java:542)
import java.util.TreeMap;                                                          // To handle loaded configs - (DSDArtifactFormatter.java:543)
import org.dmd.dmc.DmcValueException;                                              // To handle exceptions from value handling - (DSDArtifactFormatter.java:545)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                      // In case we have rule failures - (DSDArtifactFormatter.java:547)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                               // One of the DDS modules we might load - (DSDArtifactFormatter.java:561)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleADefinitionManager;         // Maintains all parsed definitions - (DSDArtifactFormatter.java:556)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParser;                    // Required to parse ModuleA definitions - (DSDArtifactFormatter.java:563)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                        // To allow loading of rules from the dsdA schema - (DSDArtifactFormatter.java:565)
import org.dmd.dmv.shared.DmvRuleManager;                                          // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:553)
import org.dmd.util.exceptions.ResultException;                                    // To handle processing exceptions - (DSDArtifactFormatter.java:546)
import org.dmd.util.parsing.ConfigFinder;                                          // Finds configs we may need to parse - (DSDArtifactFormatter.java:549)
import org.dmd.util.parsing.ConfigLocation;                                        // Handle to a discovered configuration - (DSDArtifactFormatter.java:550)
import org.dmd.util.parsing.ConfigVersion;                                         // Handle to a particular config version - (DSDArtifactFormatter.java:551)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGenerationCoordinator(DSDArtifactFormatter.java:574)
/**
 * The generation coordinator will find all config files associated with the ModuleA DSD
 * and coordinate the parsing and artifact generation.
 */
public class ModuleAGenerationCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGenerationCoordinator(DSDArtifactFormatter.java:581)
    DmvRuleManager                    rules                      = new DmvRuleManager();                    // Rule manager
    ModuleADefinitionManager          definitions                = new ModuleADefinitionManager();          // Maintains all parsed definitions
    ModuleAParser                     parserForModuleA;                                                     // Parser for ModuleA definitions
    ConfigFinder                      finderForModuleA           = new ConfigFinder("tma");                 // Config finder for ModuleA config files ending with .tma
    TreeMap<String,ConfigLocation>    loadedConfigsForModuleA    = new TreeMap<String, ConfigLocation>();   // The names/location of the ModuleA modules that have been loaded


    public ModuleAGenerationCoordinator(ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, IOException {
        rules.loadRules(DsdADMSAG.instance());
        parserForModuleA = new ModuleAParser(definitions, rules);
        finderForModuleA.setSourceAndJarInfo(sourceDirs,jars);
        finderForModuleA.findConfigs();

    }


    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet {
        ConfigVersion version = finderForModuleA.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        ModuleA loaded = parserForModuleA.parseConfig(location);


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

}

