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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:720)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAParsingCoordinator;         // Parses modules required for generation - (DSDArtifactFormatter.java:703)
import org.dmd.util.BooleanVar;                                                     // Commandline flags - (DSDArtifactFormatter.java:705)
import org.dmd.util.parsing.CommandLine;                                            // Commandline parsing - (DSDArtifactFormatter.java:704)
import org.dmd.util.parsing.StringArrayList;                                        // Commandline string values - (DSDArtifactFormatter.java:706)


public class ModuleAGenUtility {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:724)
    ModuleAParsingCoordinator    parser;                                   // Module parser
    CommandLine                  commandLine    = new CommandLine();       // Commandline parser
    BooleanVar                   helpFlag       = new BooleanVar();        // The help flag value
    StringArrayList              srcdir         = new StringArrayList();   // The source directories we'll search
    StringBuffer                 workspace      = new StringBuffer();      // The workspace base directory, this is appended to all srcdir directories
    BooleanVar                   debug          = new BooleanVar();        // Dumps debug info if specified
    StringArrayList              jars           = new StringArrayList();   // The jars that will be searched for .tma config files

    protected ModuleAGenUtility() {

        commandLine.addOption("-h",         helpFlag,  "Dumps the help message.");
        commandLine.addOption("-srcdir",    srcdir,    "The source directories to search.");
        commandLine.addOption("-workspace", workspace, "The workspace base directory, this is appended to all srcdir directories.");
        commandLine.addOption("-debug",     debug,     "Dump debug information.");
        commandLine.addOption("-jars",      jars,     	"The prefixs of jars to search for .tma config files.");

    }

}

