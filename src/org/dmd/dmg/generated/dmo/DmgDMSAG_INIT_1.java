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
package org.dmd.dmg.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dmg.generated.dmo.DmgDMSAG;          // Required attribute from DmgDMSAG - (DmoCompactSchemaFormatter.java:562)
import org.dmd.dms.generated.dmo.MetaDMSAG;         // For Meta references - (DmoCompactSchemaFormatter.java:552)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DmgDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- DmgConfig
        DmgDMSAG.__DmgConfig.addMust(DmgDMSAG.__genPackage);
        DmgDMSAG.__DmgConfig.addMust(DmgDMSAG.__generator);
        DmgDMSAG.__DmgConfig.addMay(DmgDMSAG.__configSuffix);
        DmgDMSAG.__DmgConfig.addMay(MetaDMSAG.__description);
        DmgDMSAG.__DmgConfig.addMay(MetaDMSAG.__generatedFileHeader);
        DmgDMSAG.__DmgConfig.addMay(DmgDMSAG.__schemaToLoad);

    // 2 -- GenerationContext
        DmgDMSAG.__GenerationContext.addMust(DmgDMSAG.__genContextName);

    // 3 -- WrapperGenerator
        DmgDMSAG.__WrapperGenerator.addMust(MetaDMSAG.__classType);
        DmgDMSAG.__WrapperGenerator.addMust(DmgDMSAG.__genClass);
        DmgDMSAG.__WrapperGenerator.addMust(DmgDMSAG.__genContext);
        DmgDMSAG.__WrapperGenerator.addMust(MetaDMSAG.__name);

    // 4 -- MethodGenerator
        DmgDMSAG.__MethodGenerator.addMust(MetaDMSAG.__baseType);
        DmgDMSAG.__MethodGenerator.addMust(DmgDMSAG.__genClass);
        DmgDMSAG.__MethodGenerator.addMust(DmgDMSAG.__genContext);
        DmgDMSAG.__MethodGenerator.addMust(MetaDMSAG.__name);
        DmgDMSAG.__MethodGenerator.addMust(MetaDMSAG.__valueType);

    // 5 -- ActifactGenerator
        DmgDMSAG.__ActifactGenerator.addMust(DmgDMSAG.__genClass);
        DmgDMSAG.__ActifactGenerator.addMust(MetaDMSAG.__name);


    }

}

