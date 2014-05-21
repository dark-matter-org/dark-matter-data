package org.dmd.dms.server.generated.dsd;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateBaseUtility(MetaDSDHelper.java:1327)
import java.io.File;                                                         // To access the separator character - (MetaDSDHelper.java:1300)
import java.io.IOException;                                                  // In case we have problems opening/writin got files - (MetaDSDHelper.java:1299)
import org.dmd.core.feedback.DMFeedbackSet;                                  // Standard feedback mechanism for errors/warnings - (MetaDSDHelper.java:1303)
import org.dmd.core.feedback.DmcNameClashException;                          // To handle parsing errors - (MetaDSDHelper.java:1301)
import org.dmd.core.rules.DmcRuleExceptionSet;                               // To handle rule errors - (MetaDSDHelper.java:1302)
import org.dmd.dms.server.extended.DmsModule;                                // One of the DDS modules we might load - (MetaDSDHelper.java:1308)
import org.dmd.dms.server.generated.dsd.DmsModuleGeneratorInterface;         // Called by the parsing coordinator as configs are read - (MetaDSDHelper.java:1295)
import org.dmd.dms.server.generated.dsd.DmsModuleParsingCoordinator;         // Parses modules required for generation - (MetaDSDHelper.java:1294)
import org.dmd.dms.shared.types.BooleanVar;                                  // Commandline flags - (MetaDSDHelper.java:1297)
import org.dmd.util.parsing.CommandLine;                                     // Commandline parsing - (MetaDSDHelper.java:1296)
import org.dmd.util.parsing.ConfigLocation;                                  // Where a module was loaded from - (MetaDSDHelper.java:1304)
import org.dmd.util.parsing.StringArrayList;                                 // Commandline string values - (MetaDSDHelper.java:1298)


// Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateBaseUtility(MetaDSDHelper.java:1329)
public abstract class DmsModuleGenUtility implements DmsModuleGeneratorInterface {

    // Generated from: org.dmd.util.artifact.java.MemberManager.getFormattedMembers(MemberManager.java:68)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateBaseUtility(MetaDSDHelper.java:1332)

    DmsModuleParsingCoordinator    parser;                                   // Module parser
    protected CommandLine          commandLine    = new CommandLine();       // Commandline parser
    protected BooleanVar           helpFlag       = new BooleanVar();        // The help flag value
    protected StringArrayList      srcdir         = new StringArrayList();   // The source directories we'll search
    protected StringBuffer         workspace      = new StringBuffer();      // The workspace base directory, this is appended to all srcdir directories
    protected StringBuffer         outdir         = new StringBuffer();      // The output directory for generated artifacts
    protected StringArrayList      targets        = new StringArrayList();   // The target configs on which to base generation
    protected BooleanVar           debug          = new BooleanVar();        // Dumps debug info if specified
    protected StringArrayList      jars           = new StringArrayList();   // The jars that will be searched for .dms config files
    protected StringArrayList      searchPaths    = new StringArrayList();   // The srcdirs prefixed with the workspace - useful to pass to config finders

    protected DmsModuleGenUtility() {

        commandLine.addOption("-h",         helpFlag,  "Dumps the help message.");
        commandLine.addOption("-srcdir",    srcdir,    "The source directories to search.");
        commandLine.addOption("-workspace", workspace, "The workspace base directory, this is appended to all srcdir directories.");
        commandLine.addOption("-outdir",    outdir,    "The output directory for generated artifacts.");
        commandLine.addOption("-targets",   targets,    "The names of the target configs. If this isn't specified, we generate for all configs.");
        commandLine.addOption("-debug",     debug,     "Dump debug information.");
        commandLine.addOption("-jars",      jars,     	"The prefixs of jars to search for .dms config files.");

    }

    /**
     * Based on the command line arguments, we hunt for 
     *
     * @param args the command line arguments
     */
    public void run(String[] args) throws DMFeedbackSet, IOException, DmcRuleExceptionSet, DmcNameClashException {

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

        parser = new DmsModuleParsingCoordinator(this, searchPaths, jars);

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
    public void initialize() throws DMFeedbackSet {
    	 
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateBaseUtility(MetaDSDHelper.java:1389)
    public ConfigLocation getLocation(DmsModule module){
        return(parser.getLocation(module));
    }

}

