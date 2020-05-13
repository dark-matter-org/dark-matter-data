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

