package org.dmd.dmt.dsd.dsdc.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // For Meta references - (DmoCompactSchemaFormatter.java:552)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;         // Optional attribute (1): dependsOnModuleA from DsdADMSAG - (DmoCompactSchemaFormatter.java:566)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.DsdBDMSAG;         // Optional attribute (1): dependsOnModuleB from DsdBDMSAG - (DmoCompactSchemaFormatter.java:566)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.DsdCDMSAG;         // Required attribute from DsdCDMSAG - (DmoCompactSchemaFormatter.java:562)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DsdCDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- CConceptBase
        DsdCDMSAG.__CConceptBase.addMust(DsdCDMSAG.__definedInModuleC);
        DsdCDMSAG.__CConceptBase.addMust(MetaDMSAG.__dotName);
        DsdCDMSAG.__CConceptBase.addMust(MetaDMSAG.__name);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__comment);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__definedIn);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__description);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__dmoFromModule);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__dotName);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__example);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__file);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__hint);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__lineNumber);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__nvp);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__obsolete);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__optimize);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__question);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__relationship);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__searchable);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__skip);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__sortName);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__tags);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__version);
        DsdCDMSAG.__CConceptBase.addMay(MetaDMSAG.__why);

    // 2 -- CConceptX
        DsdCDMSAG.__CConceptX.addMust(DsdCDMSAG.__definedInModuleC);
        DsdCDMSAG.__CConceptX.addMust(MetaDMSAG.__dotName);
        DsdCDMSAG.__CConceptX.addMust(MetaDMSAG.__name);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__comment);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__definedIn);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__description);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__dmoFromModule);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__dotName);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__example);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__file);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__hint);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__lineNumber);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__nvp);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__obsolete);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__optimize);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__question);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__relationship);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__searchable);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__skip);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__sortName);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__tags);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__version);
        DsdCDMSAG.__CConceptX.addMay(MetaDMSAG.__why);

    // 3 -- ModuleC
        DsdCDMSAG.__ModuleC.addMust(DsdCDMSAG.__definedInModuleC);
        DsdCDMSAG.__ModuleC.addMust(MetaDMSAG.__dotName);
        DsdCDMSAG.__ModuleC.addMust(MetaDMSAG.__name);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__comment);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__defFiles);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__definedIn);
        DsdCDMSAG.__ModuleC.addMay(DsdADMSAG.__dependsOnModuleA);
        DsdCDMSAG.__ModuleC.addMay(DsdBDMSAG.__dependsOnModuleB);
        DsdCDMSAG.__ModuleC.addMay(DsdCDMSAG.__dependsOnModuleC);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__description);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__dmoFromModule);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__dotName);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__example);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__file);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__hint);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__lineNumber);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__nvp);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__obsolete);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__optimize);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__question);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__relationship);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__searchable);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__skip);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__sortName);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__tags);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__version);
        DsdCDMSAG.__ModuleC.addMay(MetaDMSAG.__why);


    }

}

