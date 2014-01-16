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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGeneratorInterface(DSDArtifactFormatter.java:823)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                               // The base module for generation - (DSDArtifactFormatter.java:818)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleADefinitionManager;         // All parsed definition - (DSDArtifactFormatter.java:821)
import org.dmd.util.parsing.ConfigLocation;                                        // Where the config was loaded from - (DSDArtifactFormatter.java:820)


public interface ModuleAGeneratorInterface {

    public void generate(ModuleA module, ConfigLocation location, ModuleADefinitionManager definitions);


}



