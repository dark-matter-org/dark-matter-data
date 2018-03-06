package org.dmd.dmt.dsd.dsdb.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // For Meta references - (DmoCompactSchemaFormatter.java:552)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;         // Optional attribute (1): dependsOnModuleA from DsdADMSAG - (DmoCompactSchemaFormatter.java:566)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.DsdBDMSAG;         // Required attribute from DsdBDMSAG - (DmoCompactSchemaFormatter.java:562)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DsdBDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- BConceptBase
        DsdBDMSAG.__BConceptBase.addMust(DsdBDMSAG.__definedInModuleB);
        DsdBDMSAG.__BConceptBase.addMust(MetaDMSAG.__dotName);
        DsdBDMSAG.__BConceptBase.addMust(MetaDMSAG.__name);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__comment);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__definedIn);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__description);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__dotName);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__example);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__file);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__hint);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__lineNumber);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__nvp);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__obsolete);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__optimize);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__question);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__relationship);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__searchable);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__skip);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__sortName);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__tags);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__version);
        DsdBDMSAG.__BConceptBase.addMay(MetaDMSAG.__why);

    // 2 -- BConceptX
        DsdBDMSAG.__BConceptX.addMust(DsdBDMSAG.__definedInModuleB);
        DsdBDMSAG.__BConceptX.addMust(MetaDMSAG.__dotName);
        DsdBDMSAG.__BConceptX.addMust(MetaDMSAG.__name);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__comment);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__definedIn);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__description);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__dotName);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__example);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__file);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__hint);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__lineNumber);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__nvp);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__obsolete);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__optimize);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__question);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__relationship);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__searchable);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__skip);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__sortName);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__tags);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__version);
        DsdBDMSAG.__BConceptX.addMay(MetaDMSAG.__why);

    // 3 -- ModuleB
        DsdBDMSAG.__ModuleB.addMust(DsdBDMSAG.__definedInModuleB);
        DsdBDMSAG.__ModuleB.addMust(MetaDMSAG.__dotName);
        DsdBDMSAG.__ModuleB.addMust(MetaDMSAG.__name);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__comment);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__defFiles);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__definedIn);
        DsdBDMSAG.__ModuleB.addMay(DsdADMSAG.__dependsOnModuleA);
        DsdBDMSAG.__ModuleB.addMay(DsdBDMSAG.__dependsOnModuleB);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__description);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__dotName);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__example);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__file);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__hint);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__lineNumber);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__nvp);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__obsolete);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__optimize);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__question);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__relationship);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__searchable);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__skip);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__sortName);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__tags);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__version);
        DsdBDMSAG.__ModuleB.addMay(MetaDMSAG.__why);


    }

}

