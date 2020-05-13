package org.dmd.dmu.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1437)
import java.io.File;                                                         // To access the separator character - (DSDArtifactFormatter.java:1408)
import java.io.IOException;                                                  // In case we have problems opening/writin got files - (DSDArtifactFormatter.java:1407)
import org.dmd.dmc.DmcNameClashException;                                    // To handle parsing errors - (DSDArtifactFormatter.java:1411)
import org.dmd.dmc.DmcValueException;                                        // To handle fundamental value errors - (DSDArtifactFormatter.java:1410)
import org.dmd.dmc.DmcValueExceptionSet;                                     // May occur when resolving objects - (DSDArtifactFormatter.java:1413)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                // To handle rule errors - (DSDArtifactFormatter.java:1412)
import org.dmd.dmu.server.extended.DmuModule;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:1418)
import org.dmd.dmu.server.generated.dsd.DmuModuleGeneratorInterface;         // Called by the parsing coordinator as configs are read - (DSDArtifactFormatter.java:1403)
import org.dmd.dmu.server.generated.dsd.DmuModuleParsingCoordinator;         // Parses modules required for generation - (DSDArtifactFormatter.java:1402)
import org.dmd.util.BooleanVar;                                              // Commandline flags - (DSDArtifactFormatter.java:1405)
import org.dmd.util.exceptions.ResultException;                              // To handle parsing exceptions - (DSDArtifactFormatter.java:1409)
import org.dmd.util.parsing.CommandLine;                                     // Commandline parsing - (DSDArtifactFormatter.java:1404)
import org.dmd.util.parsing.ConfigLocation;                                  // Where a module was loaded from - (DSDArtifactFormatter.java:1414)
import org.dmd.util.parsing.StringArrayList;                                 // Commandline string values - (DSDArtifactFormatter.java:1406)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1439)
public abstract class DmuModuleGenUtility implements DmuModuleGeneratorInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1442)
    protected DmuModuleParsingCoordinator    parser;                                   // Module parser
    protected CommandLine                    commandLine    = new CommandLine();       // Commandline parser
    protected BooleanVar                     helpFlag       = new BooleanVar();        // The help flag value
    protected StringArrayList                srcdir         = new StringArrayList();   // The source directories we'll search
    protected StringBuffer                   workspace      = new StringBuffer();      // The workspace base directory, this is appended to all srcdir directories
    protected StringBuffer                   outdir         = new StringBuffer();      // The output directory for generated artifacts
    protected StringArrayList                targets        = new StringArrayList();   // The target configs on which to base generation
    protected BooleanVar                     debug          = new BooleanVar();        // Dumps debug info if specified
    protected StringArrayList                jars           = new StringArrayList();   // The jars that will be searched for .dmu config files
    protected StringArrayList                searchPaths    = new StringArrayList();   // The srcdirs prefixed with the workspace - useful to pass to config finders

    protected DmuModuleGenUtility() {

        commandLine.addOption("-h",         helpFlag,  "Dumps the help message.");
        commandLine.addOption("-srcdir",    srcdir,    "The source directories to search.");
        commandLine.addOption("-workspace", workspace, "The workspace base directory, this is appended to all srcdir directories.");
        commandLine.addOption("-outdir",    outdir,    "The output directory for generated artifacts.");
        commandLine.addOption("-targets",   targets,    "The names of the target configs. If this isn't specified, we generate for all configs.");
        commandLine.addOption("-debug",     debug,     "Dump debug information.");
        commandLine.addOption("-jars",      jars,     	"The prefixs of jars to search for .dmu config files.");

    }

    /**
     * Based on the command line arguments, we hunt for 
     *
     * @param args the command line arguments
     * @throws ResultException       if there are problems
     * @throws DmcValueException     if values are incorrect
     * @throws IOException           if IO problems
     * @throws DmcRuleExceptionSet   if rule failures
     * @throws DmcNameClashException if name clashes
     * @throws DmcValueExceptionSet  if multiple value problems
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

        parser = new DmuModuleParsingCoordinator(this, searchPaths, jars);

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
     * @throws ResultException is there are problems
     */
    public void initialize() throws ResultException {
    	 
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateBaseUtility(DSDArtifactFormatter.java:1506)
    public ConfigLocation getLocation(DmuModule module){
        return(parser.getLocation(module));
    }

}

