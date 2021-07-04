package org.dmd.concinnity.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGeneratorInterface(DSDArtifactFormatter.java:1553)
import java.io.IOException;                                                               // May occur during artifact generation - (DSDArtifactFormatter.java:1548)
import org.dmd.concinnity.server.extended.ConcinnityModule;                               // The base module for generation - (DSDArtifactFormatter.java:1546)
import org.dmd.concinnity.server.generated.dsd.ConcinnityModuleDefinitionManager;         // All parsed definition - (DSDArtifactFormatter.java:1551)
import org.dmd.util.exceptions.ResultException;                                           // For problems found after parsing - (DSDArtifactFormatter.java:1550)
import org.dmd.util.parsing.ConfigLocation;                                               // Where the config was loaded from - (DSDArtifactFormatter.java:1549)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGeneratorInterface(DSDArtifactFormatter.java:1555)
public interface ConcinnityModuleGeneratorInterface {

    /**
     * Called prior to the object resolution phase so that derived classes can perform intermediate 
     * processing such as generation of internal types.
     * @param module the module that was just parsed
     * @param location the module's location
     * @param definitions the current set of definitions
     * @throws ResultException if there are problems
     */
    public void parsingComplete(ConcinnityModule module, ConfigLocation location, ConcinnityModuleDefinitionManager definitions) throws ResultException;

    /**
     * Called after object resolution has completely successfully. This allows for 
     * application of business logic not defined as part of rules etc.
     * @param module the module that was just parsed
     * @param location the module's location
     * @param definitions the current set of definitions
     * @throws ResultException if there are problems
     */
    public void objectResolutionComplete(ConcinnityModule module, ConfigLocation location, ConcinnityModuleDefinitionManager definitions) throws ResultException;

    /**
     * Derived classes should overload this method to perform artifact generation.
     * @param module the module for which generation is being performed
     * @param location where the module was found
     * @param definitions the current set of definitions
     * @throws ResultException if there are problems
     * @throws IOException if IO problems
     */
    public void generate(ConcinnityModule module, ConfigLocation location, ConcinnityModuleDefinitionManager definitions) throws ResultException, IOException;

    /**
     * Derived classes should overload this method to perform artifact generation when no target module
     * has been specified on the commandline. This is useful when doing things like generating documentation 
     * where you want to load and resolve objects across many modules.
     * @param definitions the current set of definitions
     * @throws ResultException is there are problems
     * @throws IOException if IO problems
     */
    public void generate(ConcinnityModuleDefinitionManager definitions) throws ResultException, IOException;

    /**
     * Called if the help flag is found anywhere on the commandline.
     */
    public void displayHelp();

}



