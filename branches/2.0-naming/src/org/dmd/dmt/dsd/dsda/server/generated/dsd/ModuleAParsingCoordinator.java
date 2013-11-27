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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:563)
import java.io.IOException;                                                         // If we run it to problems finding configs - (DSDArtifactFormatter.java:527)
import java.util.ArrayList;                                                         // To handle lists of things - (DSDArtifactFormatter.java:529)
import java.util.Iterator;                                                          // To iterate over collections - (DSDArtifactFormatter.java:528)
import java.util.TreeMap;                                                           // To handle loaded configs - (DSDArtifactFormatter.java:530)
import org.dmd.dmc.DmcValueException;                                               // To handle exceptions from value handling - (DSDArtifactFormatter.java:533)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                       // In case we have rule failures - (DSDArtifactFormatter.java:535)
import org.dmd.dmc.types.DefinitionName;                                            // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:532)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:552)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleADefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:544)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:547)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParser;                     // Required to parse ModuleA definitions - (DSDArtifactFormatter.java:556)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                         // To allow loading of rules from the dsdA schema - (DSDArtifactFormatter.java:558)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;                      // To access references to ModuleA - (DSDArtifactFormatter.java:554)
import org.dmd.dmv.shared.DmvRuleManager;                                           // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:541)
import org.dmd.util.exceptions.ResultException;                                     // To handle processing exceptions - (DSDArtifactFormatter.java:534)
import org.dmd.util.parsing.ConfigFinder;                                           // Finds configs we may need to parse - (DSDArtifactFormatter.java:537)
import org.dmd.util.parsing.ConfigLocation;                                         // Handle to a discovered configuration - (DSDArtifactFormatter.java:538)
import org.dmd.util.parsing.ConfigVersion;                                          // Handle to a particular config version - (DSDArtifactFormatter.java:539)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:567)
/**
 * The generation coordinator will find all config files associated with the ModuleA DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class ModuleAParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:574)
    DmvRuleManager                          rules                   = new DmvRuleManager();                         // Rule manager
    ModuleADefinitionManager                definitions             = new ModuleADefinitionManager();               // Maintains all parsed definitions
    ModuleAGeneratorInterface               generator;                                                              // Injected generator that we call when config loading is complete
    ModuleAParser                           parserForModuleA;                                                       // Parser for ModuleA definitions
    ConfigFinder                            finderForModuleA        = new ConfigFinder("tma");                      // Config finder for ModuleA config files ending with .tma
    TreeMap<DefinitionName, ModuleAInfo>    loadedModuleAConfigs    = new TreeMap<DefinitionName, ModuleAInfo>();   // The names/location of the ModuleA modules that have been loaded


    public ModuleAParsingCoordinator(ModuleAGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, IOException {

        generator = g;

        rules.loadRules(DsdADMSAG.instance());
        parserForModuleA = new ModuleAParser(definitions, rules);
        finderForModuleA.setSourceAndJarInfo(sourceDirs,jars);
        finderForModuleA.findConfigs();

    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:592)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet {
        ConfigVersion version = finderForModuleA.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        ModuleA loaded = parserForModuleA.parseConfig(location);
        loadedModuleAConfigs.put(loaded.getName(), new ModuleAInfo(loaded,location));

        // We've loaded the base configuration file, now load any other modules on which it depends
        loadModuleDependencies(loaded);
        
        generator.generate(loaded,location,definitions);
        

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:614)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet {

        Iterator<ConfigLocation> it = finderForModuleA.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();
            ModuleA loaded = parserForModuleA.parseConfig(location);
            loadedModuleAConfigs.put(loaded.getName(), new ModuleAInfo(loaded,location));

            // We've loaded the base configuration file, now load any other modules on which it depends
            loadModuleDependencies(loaded);

            generator.generate(loaded,location,definitions);

        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:631)
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




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:656)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:663)
    class ModuleAInfo {
        ModuleA module;
        ConfigLocation location;

        ModuleAInfo(ModuleA m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

