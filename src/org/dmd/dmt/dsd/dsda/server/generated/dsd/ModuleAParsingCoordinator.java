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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:814)
import java.io.IOException;                                                         // If we run it to problems finding configs - (DSDArtifactFormatter.java:774)
import java.util.ArrayList;                                                         // To handle lists of things - (DSDArtifactFormatter.java:776)
import java.util.Iterator;                                                          // To iterate over collections - (DSDArtifactFormatter.java:775)
import java.util.TreeMap;                                                           // To handle loaded configs - (DSDArtifactFormatter.java:777)
import org.dmd.dmc.DmcNameClashException;                                           // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:782)
import org.dmd.dmc.DmcValueException;                                               // To handle exceptions from value handling - (DSDArtifactFormatter.java:781)
import org.dmd.dmc.DmcValueExceptionSet;                                            // May occur when resolving objects - (DSDArtifactFormatter.java:789)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                       // In case we have rule failures - (DSDArtifactFormatter.java:784)
import org.dmd.dmc.types.DefinitionName;                                            // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:779)
import org.dmd.dms.DSDefinition;                                                    // The common base for all modules - so that we can get error location info - (DSDArtifactFormatter.java:780)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:803)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleADefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:794)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:797)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParser;                     // Required to parse ModuleA definitions - (DSDArtifactFormatter.java:807)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;                      // To access references to ModuleA - (DSDArtifactFormatter.java:805)
import org.dmd.dmv.shared.DmvRuleManager;                                           // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:791)
import org.dmd.util.exceptions.ResultException;                                     // To handle processing exceptions - (DSDArtifactFormatter.java:783)
import org.dmd.util.parsing.ConfigFinder;                                           // Finds configs we may need to parse - (DSDArtifactFormatter.java:786)
import org.dmd.util.parsing.ConfigLocation;                                         // Handle to a discovered configuration - (DSDArtifactFormatter.java:787)
import org.dmd.util.parsing.ConfigVersion;                                          // Handle to a particular config version - (DSDArtifactFormatter.java:788)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:818)
/**
 * The parsing coordinator will find all config files associated with the ModuleA DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class ModuleAParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:825)
    DmvRuleManager                          rules                   = new DmvRuleManager();                         // Rule manager
    ModuleADefinitionManager                definitions             = new ModuleADefinitionManager();               // Maintains all parsed definitions
    ModuleAGeneratorInterface               generator;                                                              // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>         loadedConfigs           = new TreeMap<String, ModuleInfoBase>();        // Stores all loaded configs based on the name of the file that was parsed.
    ModuleAParser                           parserForModuleA;                                                       // Parser for ModuleA definitions
    ConfigFinder                            finderForModuleA        = new ConfigFinder(".tma");                     // Config finder for ModuleA config files ending with .tma
    TreeMap<DefinitionName, ModuleAInfo>    loadedModuleAConfigs    = new TreeMap<DefinitionName, ModuleAInfo>();   // The names/location of the ModuleA modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:827)
    public ModuleAParsingCoordinator(ModuleAGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

//        rules.loadRules(DsdADMSAG.instance());
        parserForModuleA = new ModuleAParser(definitions, rules);
        finderForModuleA.setSourceAndJarInfo(sourceDirs,jars);
        finderForModuleA.findConfigs();

    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:879)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ConfigVersion version = finderForModuleA.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        ModuleA loaded = loadModuleAModule(location);
        
        if (location.isFromJAR()){
            ResultException ex = new ResultException("We can't run generation for a config loaded from a JAR: " + configName);
            ex.moreMessages(location.toString());
            throw(ex);
        }
        
        generator.parsingComplete(loaded, location, definitions);
        
        definitions.resolveReferences();
        
        generator.generate(loaded,location,definitions);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:905)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ModuleA loaded = null;
        ModuleAInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForModuleA.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (ModuleAInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = loadModuleAModule(location);
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:937)
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:954)
    public ConfigLocation getLocation(ModuleA module){
        ModuleAInfo info = loadedModuleAConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:965)
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




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:995)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1001)
    void missingConfigError(DSDefinition module, String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        ex.setLocationInfo(module.getFile(), module.getLineNumber());
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1009)
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

}

