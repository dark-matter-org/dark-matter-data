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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGeneratorInterface(DSDArtifactFormatter.java:764)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                               // The base module for generation - (DSDArtifactFormatter.java:759)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCDefinitionManager;         // All parsed definition - (DSDArtifactFormatter.java:762)
import org.dmd.util.parsing.ConfigLocation;                                        // Where the config was loaded from - (DSDArtifactFormatter.java:761)


public interface ModuleCGeneratorInterface {

    public void generate(ModuleC module, ConfigLocation location, ModuleCDefinitionManager definitions);


}



