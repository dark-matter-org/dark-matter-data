//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.server.generated.dsd;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1007)
import java.io.IOException;                                                  // If we run it to problems finding configs - (MetaDSDHelper.java:971)
import java.util.ArrayList;                                                  // To handle lists of things - (MetaDSDHelper.java:973)
import java.util.Iterator;                                                   // To iterate over collections - (MetaDSDHelper.java:972)
import java.util.TreeMap;                                                    // To handle loaded configs - (MetaDSDHelper.java:974)
import org.dmd.core.feedback.DMFeedback;                                     // To handle exceptions from value handling - (MetaDSDHelper.java:978)
import org.dmd.core.feedback.DMFeedbackSet;                                  // To handle exceptions from value handling - (MetaDSDHelper.java:979)
import org.dmd.core.feedback.DmcNameClashException;                          // To handle exceptions from parsing objects - (MetaDSDHelper.java:980)
import org.dmd.dms.server.extended.DSDefinition;                             // The common base for all modules - so that we can get error location info - (MetaDSDHelper.java:977)
import org.dmd.dms.server.extended.DmsModule;                                // One of the DDS modules we might load - (MetaDSDHelper.java:997)
import org.dmd.dms.server.generated.dsd.DmsModuleDefinitionManager;          // Maintains all parsed definitions - (MetaDSDHelper.java:988)
import org.dmd.dms.server.generated.dsd.DmsModuleGeneratorInterface;         // The generator we call - (MetaDSDHelper.java:991)
import org.dmd.dms.server.generated.dsd.DmsModuleParser;                     // Required to parse DmsModule definitions - (MetaDSDHelper.java:1001)
import org.dmd.dms.shared.generated.types.DmsModuleREF;                      // To access references to DmsModule - (MetaDSDHelper.java:999)
import org.dmd.dms.shared.types.DefinitionName;                              // Allows storage of parsed configs by name - (MetaDSDHelper.java:976)
import org.dmd.dmv.shared.DmvRuleManager;                                    // Allows for application of rules to our definitions - (MetaDSDHelper.java:985)
import org.dmd.util.parsing.ConfigFinder;                                    // Finds configs we may need to parse - (MetaDSDHelper.java:982)
import org.dmd.util.parsing.ConfigLocation;                                  // Handle to a discovered configuration - (MetaDSDHelper.java:983)


// Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1011)
/**
 * The parsing coordinator will find all config files associated with the DmsModule DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class DmsModuleParsingCoordinator {

    // Generated from: org.dmd.util.artifact.java.MemberManager.getFormattedMembers(MemberManager.java:68)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1018)

    DmvRuleManager                            rules                     = new DmvRuleManager();                           // Rule manager
    DmsModuleDefinitionManager                definitions               = new DmsModuleDefinitionManager();               // Maintains all parsed definitions
    DmsModuleGeneratorInterface               generator;                                                                  // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>           loadedConfigs             = new TreeMap<String, ModuleInfoBase>();          // Stores all loaded configs based on the name of the file that was parsed.
    DmsModuleParser                           parserForDmsModule;                                                         // Parser for DmsModule definitions
    ConfigFinder                              finderForDmsModule        = new ConfigFinder(".dms");                       // Config finder for DmsModule config files ending with .dms
    TreeMap<DefinitionName, DmsModuleInfo>    loadedDmsModuleConfigs    = new TreeMap<DefinitionName, DmsModuleInfo>();   // The names/location of the DmsModule modules that have been loaded


// Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1020)
    public DmsModuleParsingCoordinator(DmsModuleGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws DMFeedbackSet, IOException {

        generator = g;

        parserForDmsModule = new DmsModuleParser(definitions, rules);
        finderForDmsModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForDmsModule.findConfigs();

    }


    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1073)
    public void generateForConfig(String configName) throws DMFeedbackSet, DmcNameClashException, IOException {
        ConfigLocation location = finderForDmsModule.getConfig(configName);
        
        if (location == null){
            DMFeedbackSet ex = new DMFeedbackSet("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        DmsModule loaded = loadDmsModuleModule(location);
        
        if (location.isFromJAR()){
            DMFeedback ex = new DMFeedback("We can't run generation for a config loaded from a JAR: " + configName);
            ex.addToMessage(location.toString());
            throw(new DMFeedbackSet(ex));
        }
        
        generator.parsingComplete(loaded, location, definitions);
        
        definitions.resolveReferences();
        
        generator.generate(loaded,location,definitions);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1099)
    public void generateForAllConfigs() throws DMFeedbackSet, DmcNameClashException, IOException {
        DmsModule loaded = null;
        DmsModuleInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForDmsModule.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (DmsModuleInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = loadDmsModuleModule(location);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1131)
    DmsModule loadDmsModuleModule(ConfigLocation location)  throws DMFeedbackSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        DmsModuleInfo info = loadedDmsModuleConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        DmsModule loaded = parserForDmsModule.parseConfig(location);
        DmsModuleInfo loadedInfo = new DmsModuleInfo(loaded,location);
        loadedDmsModuleConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1148)
    public ConfigLocation getLocation(DmsModule module){
        DmsModuleInfo info = loadedDmsModuleConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1159)
    void loadModuleDependencies(ModuleInfoBase mi) throws DMFeedbackSet, DmcNameClashException {

        if (mi.dependenciesLoaded)
            return;

        if (mi instanceof DmsModuleInfo){
            DmsModuleInfo info = (DmsModuleInfo)mi;
            if (info.module.getDependsOnDmsModuleHasValue()){
                Iterator<DmsModuleREF> it = info.module.getDMO().getDependsOnDmsModule();
                while(it.hasNext()){
                    DmsModuleREF ref = it.next();
                    ConfigLocation location = finderForDmsModule.getConfig(ref.toString());
                    
                    if (location == null)
                        missingConfigError(info.module,ref.toString() + ".[dms]");
            
                    loadDmsModuleModule(location);
                }
            }
            info.dependenciesLoaded = true;
        }




    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1189)
    void missingConfigError(String missing) throws DMFeedbackSet {
        DMFeedbackSet ex = new DMFeedbackSet("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1195)
    void missingConfigError(DSDefinition module, String missing) throws DMFeedbackSet {
        DMFeedbackSet ex = new DMFeedbackSet("Could not find config: " + missing);
        ex.setLocation(module.getFile(), module.getLineNumber());
        throw(ex);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParsingCoordinator(MetaDSDHelper.java:1203)
    class ModuleInfoBase {
        ConfigLocation location;
        boolean        dependenciesLoaded;
    }

    class DmsModuleInfo extends ModuleInfoBase {
        DmsModule module;

        DmsModuleInfo(DmsModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

