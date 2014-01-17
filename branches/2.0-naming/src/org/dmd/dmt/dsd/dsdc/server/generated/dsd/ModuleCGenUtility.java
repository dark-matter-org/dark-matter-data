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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:833)
import java.io.IOException;                                                         // In case we have problems opening/writin got files - (DSDArtifactFormatter.java:815)
import org.dmd.dmc.DmcNameClashException;                                           // To handle parsing errors - (DSDArtifactFormatter.java:818)
import org.dmd.dmc.DmcValueException;                                               // To handle fundamental value errors - (DSDArtifactFormatter.java:817)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                       // To handle rule errors - (DSDArtifactFormatter.java:819)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCGeneratorInterface;         // Called by the parsing coordinator as configs are read - (DSDArtifactFormatter.java:811)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCParsingCoordinator;         // Parses modules required for generation - (DSDArtifactFormatter.java:810)
import org.dmd.util.BooleanVar;                                                     // Commandline flags - (DSDArtifactFormatter.java:813)
import org.dmd.util.exceptions.ResultException;                                     // To handle parsing exceptions - (DSDArtifactFormatter.java:816)
import org.dmd.util.parsing.CommandLine;                                            // Commandline parsing - (DSDArtifactFormatter.java:812)
import org.dmd.util.parsing.StringArrayList;                                        // Commandline string values - (DSDArtifactFormatter.java:814)


public abstract class ModuleCGenUtility implements ModuleCGeneratorInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:837)
    ModuleCParsingCoordinator    parser;                                   // Module parser
    CommandLine                  commandLine    = new CommandLine();       // Commandline parser
    BooleanVar                   helpFlag       = new BooleanVar();        // The help flag value
    StringArrayList              srcdir         = new StringArrayList();   // The source directories we'll search
    StringBuffer                 workspace      = new StringBuffer();      // The workspace base directory, this is appended to all srcdir directories
    BooleanVar                   debug          = new BooleanVar();        // Dumps debug info if specified
    StringArrayList              jars           = new StringArrayList();   // The jars that will be searched for .tmc config files

    protected ModuleCGenUtility() {

        commandLine.addOption("-h",         helpFlag,  "Dumps the help message.");
        commandLine.addOption("-srcdir",    srcdir,    "The source directories to search.");
        commandLine.addOption("-workspace", workspace, "The workspace base directory, this is appended to all srcdir directories.");
        commandLine.addOption("-debug",     debug,     "Dump debug information.");
        commandLine.addOption("-jars",      jars,     	"The prefixs of jars to search for .tmc config files.");

    }

    /**
     * Based on the command line arguments, we hunt for 
     *
     * @param args the command line arguments
     */
    public void run(String[] args) throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException {

        commandLine.parseArgs(args);

        parser = new ModuleCParsingCoordinator(this, srcdir,jars);

        parser.generateForAllConfigs();
    }

}

