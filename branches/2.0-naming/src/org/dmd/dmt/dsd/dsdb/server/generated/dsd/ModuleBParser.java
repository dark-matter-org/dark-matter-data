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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:194)
import org.dmd.dmc.definitions.DsdParserInterface;         // Standard parser interface - (DSDArtifactFormatter.java:190)
import org.dmd.dms.SchemaManager;                          // Manages the schemas we use - (DSDArtifactFormatter.java:187)
import org.dmd.util.parsing.ConfigFinder;                  // Used to find definition config files - (DSDArtifactFormatter.java:188)
import org.dmd.util.parsing.DmcUncheckedOIFParser;         // Basic parsing of objects - (DSDArtifactFormatter.java:189)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:197)
public class ModuleBParser implements DsdParserInterface {

    final static String fileExtension = "tmb";

    SchemaManager            schema;
    ConfigFinder             finder;
    DmcUncheckedOIFParser    configParser;
    DmcUncheckedOIFParser    defParser;




    ModuleBParser(){

    }

    public String getFileExtension(){
        return(fileExtension);
    }


}

