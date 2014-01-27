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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1053)
import java.io.IOException;                                                         // In case we have problems opening/writin got files - (DSDArtifactFormatter.java:1033)
import org.dmd.dmc.DmcNameClashException;                                           // To handle parsing errors - (DSDArtifactFormatter.java:1036)
import org.dmd.dmc.DmcValueException;                                               // To handle fundamental value errors - (DSDArtifactFormatter.java:1035)
import org.dmd.dmc.DmcValueExceptionSet;                                            // May occur when resolving objects - (DSDArtifactFormatter.java:1038)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                       // To handle rule errors - (DSDArtifactFormatter.java:1037)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGeneratorInterface;         // Called by the parsing coordinator as configs are read - (DSDArtifactFormatter.java:1029)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParsingCoordinator;         // Parses modules required for generation - (DSDArtifactFormatter.java:1028)
import org.dmd.util.BooleanVar;                                                     // Commandline flags - (DSDArtifactFormatter.java:1031)
import org.dmd.util.exceptions.ResultException;                                     // To handle parsing exceptions - (DSDArtifactFormatter.java:1034)
import org.dmd.util.parsing.CommandLine;                                            // Commandline parsing - (DSDArtifactFormatter.java:1030)
import org.dmd.util.parsing.StringArrayList;                                        // Commandline string values - (DSDArtifactFormatter.java:1032)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1055)
public abstract class ModuleAGenUtility implements ModuleAGeneratorInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1058)
    ModuleAParsingCoordinator    parser;                                   // Module parser
    CommandLine                  commandLine    = new CommandLine();       // Commandline parser
    BooleanVar                   helpFlag       = new BooleanVar();        // The help flag value
    StringArrayList              srcdir         = new StringArrayList();   // The source directories we'll search
    StringBuffer                 workspace      = new StringBuffer();      // The workspace base directory, this is appended to all srcdir directories
    StringBuffer                 target         = new StringBuffer();      // The target config on which to base generation
    BooleanVar                   debug          = new BooleanVar();        // Dumps debug info if specified
    StringArrayList              jars           = new StringArrayList();   // The jars that will be searched for .tma config files

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

        parser = new ModuleAParsingCoordinator(this, srcdir,jars);

        if (target.length() > 0)
            parser.generateForConfig(target.toString());
        else
            parser.generateForAllConfigs();
    }

}

