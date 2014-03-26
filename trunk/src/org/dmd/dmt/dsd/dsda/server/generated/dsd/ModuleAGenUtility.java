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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1110)
import java.io.File;                                                                // To access the separator character - (DSDArtifactFormatter.java:1082)
import java.io.IOException;                                                         // In case we have problems opening/writin got files - (DSDArtifactFormatter.java:1081)
import org.dmd.dmc.DmcNameClashException;                                           // To handle parsing errors - (DSDArtifactFormatter.java:1085)
import org.dmd.dmc.DmcValueException;                                               // To handle fundamental value errors - (DSDArtifactFormatter.java:1084)
import org.dmd.dmc.DmcValueExceptionSet;                                            // May occur when resolving objects - (DSDArtifactFormatter.java:1087)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                       // To handle rule errors - (DSDArtifactFormatter.java:1086)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:1092)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGeneratorInterface;         // Called by the parsing coordinator as configs are read - (DSDArtifactFormatter.java:1077)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParsingCoordinator;         // Parses modules required for generation - (DSDArtifactFormatter.java:1076)
import org.dmd.util.BooleanVar;                                                     // Commandline flags - (DSDArtifactFormatter.java:1079)
import org.dmd.util.exceptions.ResultException;                                     // To handle parsing exceptions - (DSDArtifactFormatter.java:1083)
import org.dmd.util.parsing.CommandLine;                                            // Commandline parsing - (DSDArtifactFormatter.java:1078)
import org.dmd.util.parsing.ConfigLocation;                                         // Where a module was loaded from - (DSDArtifactFormatter.java:1088)
import org.dmd.util.parsing.StringArrayList;                                        // Commandline string values - (DSDArtifactFormatter.java:1080)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1112)
public abstract class ModuleAGenUtility implements ModuleAGeneratorInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1115)
    ModuleAParsingCoordinator    parser;                                   // Module parser
    protected CommandLine        commandLine    = new CommandLine();       // Commandline parser
    protected BooleanVar         helpFlag       = new BooleanVar();        // The help flag value
    protected StringArrayList    srcdir         = new StringArrayList();   // The source directories we'll search
    protected StringBuffer       workspace      = new StringBuffer();      // The workspace base directory, this is appended to all srcdir directories
    protected StringBuffer       target         = new StringBuffer();      // The target config on which to base generation
    protected BooleanVar         debug          = new BooleanVar();        // Dumps debug info if specified
    protected StringArrayList    jars           = new StringArrayList();   // The jars that will be searched for .tma config files
    protected StringArrayList    searchPaths    = new StringArrayList();   // The srcdirs prefixed with the workspace - useful to pass to config finders

    protected ModuleAGenUtility() {

        commandLine.addOption("-h",         helpFlag,  "Dumps the help message.");
        commandLine.addOption("-srcdir",    srcdir,    "The source directories to search.");
        commandLine.addOption("-workspace", workspace, "The workspace base directory, this is appended to all srcdir directories.");
        commandLine.addOption("-target",    target, "The name of the target config. If this isn't specified, we generate for all configs.");
        commandLine.addOption("-debug",     debug,     "Dump debug information.");
        commandLine.addOption("-jars",      jars,     	"The prefixs of jars to search for .tma config files.");

    }

    /**
     * Based on the command line arguments, we hunt for 
     *
     * @param args the command line arguments
     */
    public void run(String[] args) throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {

        commandLine.parseArgs(args);

        if (helpFlag.booleanValue()){
            displayHelp();
            return;
        }

        for(String src: srcdir){
            if (workspace.length() > 0)
                searchPaths.add(workspace + File.separator + src);
            else
                searchPaths.add(src);
        }

        initialize();

        parser = new ModuleAParsingCoordinator(this, searchPaths, jars);

        if (target.length() > 0)
            parser.generateForConfig(target.toString());
        else
            parser.generateForAllConfigs();
    }

    /**
     * Derived classes may overload this method to perform additional initialization
     * including checking that commandline arguments are appropriate.
     */
    public void initialize() throws ResultException {
    	 
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1169)
    public ConfigLocation getLocation(ModuleA module){
        return(parser.getLocation(module));
    }

}

