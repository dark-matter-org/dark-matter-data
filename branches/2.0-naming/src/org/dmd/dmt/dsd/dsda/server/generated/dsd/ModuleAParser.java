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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:283)
import org.dmd.dmc.DmcValueException;                              // May be thrown by schema management - (DSDArtifactFormatter.java:280)
import org.dmd.dmc.definitions.DsdParserInterface;                 // Standard parser interface - (DSDArtifactFormatter.java:273)
import org.dmd.dms.SchemaManager;                                  // Manages the schemas we use - (DSDArtifactFormatter.java:270)
import org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG;         // The schema recognized by this parser - (DSDArtifactFormatter.java:279)
import org.dmd.util.exceptions.ResultException;                    // May be thrown by schema management - (DSDArtifactFormatter.java:281)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:286)
public class ModuleAParser implements DsdParserInterface {

    final static String fileExtension = "tma";

    SchemaManager            schema;




    ModuleAParser() throws ResultException, DmcValueException {

        schema = new SchemaManager();
        schema.manageSchema(new DsdASchemaAG());

    }

    public String getFileExtension(){
        return(fileExtension);
    }


}

