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
package org.dmd.dmr.shared.base.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dms.generated.dmo.MetaDMSAG;         // For Meta references - (DmoCompactSchemaFormatter.java:552)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DmrbaseDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- HierarchicObject
        DmrbaseDMSAG.__HierarchicObject.addMust(MetaDMSAG.__FQN);
        DmrbaseDMSAG.__HierarchicObject.addMay(MetaDMSAG.__file);
        DmrbaseDMSAG.__HierarchicObject.addMay(MetaDMSAG.__lineNumber);

    // 2 -- DotNamedObject
        DmrbaseDMSAG.__DotNamedObject.addMust(MetaDMSAG.__FQN);
        DmrbaseDMSAG.__DotNamedObject.addMay(MetaDMSAG.__file);
        DmrbaseDMSAG.__DotNamedObject.addMay(MetaDMSAG.__lineNumber);


    }

}

