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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGeneratorInterface(DSDArtifactFormatter.java:1128)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                               // The base module for generation - (DSDArtifactFormatter.java:1122)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCDefinitionManager;         // All parsed definition - (DSDArtifactFormatter.java:1126)
import org.dmd.util.exceptions.ResultException;                                    // For problems found after parsing - (DSDArtifactFormatter.java:1125)
import org.dmd.util.parsing.ConfigLocation;                                        // Where the config was loaded from - (DSDArtifactFormatter.java:1124)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGeneratorInterface(DSDArtifactFormatter.java:1130)
public interface ModuleCGeneratorInterface {

    /**
     * Called prior to generate() method so that derived classes can perform intermediate 
     * processing such as generation of internal types, application of business logic not defined
     * defined as part of rules etc.
     * @param module the module that was just parsed
     * @param location the module's location
     * @param definitions the current set of definitions
     */
    public void parsingComplete(ModuleC module, ConfigLocation location, ModuleCDefinitionManager definitions) throws ResultException;

    /**
     * Derived classes should overload this method to perform artifact generation.
     * @param module the module for which generation is being performed
     * @param location where the module was found
     * @param definitions the current set of definitions
     */
    public void generate(ModuleC module, ConfigLocation location, ModuleCDefinitionManager definitions);

    /**
     * Called if the help flag is found anywhere on the commandline.
     */
    public void displayHelp();

}



