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
package org.dmd.dmt.dsd.dsdb.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:105)
import org.dmd.dmc.definitions.DmcDefinitionSet;                  // Our base to provide definition set storage - (DSDArtifactFormatter.java:103)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;         // A definition from the ModuleA Module - (DSDArtifactFormatter.java:135)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;            // A definition from the ModuleA Module - (DSDArtifactFormatter.java:138)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;         // A definition from the ModuleB Module - (DSDArtifactFormatter.java:135)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;            // A definition from the ModuleB Module - (DSDArtifactFormatter.java:138)

// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:109)
public class ModuleBDefinitionManager {

    DmcDefinitionSet<AConceptBase> AConceptBaseDefs;
    DmcDefinitionSet<AConceptX> AConceptXDefs;
    DmcDefinitionSet<BConceptBase> BConceptBaseDefs;
    DmcDefinitionSet<BConceptX> BConceptXDefs;

    ModuleBDefinitionManager(){

        AConceptBaseDefs = new DmcDefinitionSet<AConceptBase>();
        AConceptXDefs = new DmcDefinitionSet<AConceptX>();
        BConceptBaseDefs = new DmcDefinitionSet<BConceptBase>();
        BConceptXDefs = new DmcDefinitionSet<BConceptX>();

    }

}

