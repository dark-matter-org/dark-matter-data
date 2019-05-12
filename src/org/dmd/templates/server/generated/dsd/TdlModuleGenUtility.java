//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.templates.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1356)
import java.io.File;                                                               // To access the separator character - (DSDArtifactFormatter.java:1327)
import java.io.IOException;                                                        // In case we have problems opening/writin got files - (DSDArtifactFormatter.java:1326)
import org.dmd.dmc.DmcNameClashException;                                          // To handle parsing errors - (DSDArtifactFormatter.java:1330)
import org.dmd.dmc.DmcValueException;                                              // To handle fundamental value errors - (DSDArtifactFormatter.java:1329)
import org.dmd.dmc.DmcValueExceptionSet;                                           // May occur when resolving objects - (DSDArtifactFormatter.java:1332)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                      // To handle rule errors - (DSDArtifactFormatter.java:1331)
import org.dmd.templates.server.extended.TdlModule;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:1337)
import org.dmd.templates.server.generated.dsd.TdlModuleGeneratorInterface;         // Called by the parsing coordinator as configs are read - (DSDArtifactFormatter.java:1322)
import org.dmd.templates.server.generated.dsd.TdlModuleParsingCoordinator;         // Parses modules required for generation - (DSDArtifactFormatter.java:1321)
import org.dmd.util.BooleanVar;                                                    // Commandline flags - (DSDArtifactFormatter.java:1324)
import org.dmd.util.exceptions.ResultException;                                    // To handle parsing exceptions - (DSDArtifactFormatter.java:1328)
import org.dmd.util.parsing.CommandLine;                                           // Commandline parsing - (DSDArtifactFormatter.java:1323)
import org.dmd.util.parsing.ConfigLocation;                                        // Where a module was loaded from - (DSDArtifactFormatter.java:1333)
import org.dmd.util.parsing.StringArrayList;                                       // Commandline string values - (DSDArtifactFormatter.java:1325)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1358)
public abstract class TdlModuleGenUtility implements TdlModuleGeneratorInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1361)
    protected TdlModuleParsingCoordinator    parser;                                   // Module parser
    protected CommandLine                    commandLine    = new CommandLine();       // Commandline parser
    protected BooleanVar                     helpFlag       = new BooleanVar();        // The help flag value
    protected StringArrayList                srcdir         = new StringArrayList();   // The source directories we'll search
    protected StringBuffer                   workspace      = new StringBuffer();      // The workspace base directory, this is appended to all srcdir directories
    protected StringBuffer                   outdir         = new StringBuffer();      // The output directory for generated artifacts
    protected StringArrayList                targets        = new StringArrayList();   // The target configs on which to base generation
    protected BooleanVar                     debug          = new BooleanVar();        // Dumps debug info if specified
    protected StringArrayList                jars           = new StringArrayList();   // The jars that will be searched for .dmtdl config files
    protected StringArrayList                searchPaths    = new StringArrayList();   // The srcdirs prefixed with the workspace - useful to pass to config finders

    protected TdlModuleGenUtility() {

        commandLine.addOption("-h",         helpFlag,  "Dumps the help message.");
        commandLine.addOption("-srcdir",    srcdir,    "The source directories to search.");
        commandLine.addOption("-workspace", workspace, "The workspace base directory, this is appended to all srcdir directories.");
        commandLine.addOption("-outdir",    outdir,    "The output directory for generated artifacts.");
        commandLine.addOption("-targets",   targets,    "The names of the target configs. If this isn't specified, we generate for all configs.");
        commandLine.addOption("-debug",     debug,     "Dump debug information.");
        commandLine.addOption("-jars",      jars,     	"The prefixs of jars to search for .dmtdl config files.");

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

        parser = new TdlModuleParsingCoordinator(this, searchPaths, jars);

        if (targets.size() >0){
            for(String target: targets)
                parser.generateForConfig(target);
        }
        else
            parser.generateForAllConfigs();
    }

    /**
     * Derived classes may overload this method to perform additional initialization
     * including checking that commandline arguments are appropriate.
     */
    public void initialize() throws ResultException {
    	 
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1418)
    public ConfigLocation getLocation(TdlModule module){
        return(parser.getLocation(module));
    }

}

