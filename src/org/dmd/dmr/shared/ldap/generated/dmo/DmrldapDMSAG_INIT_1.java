package org.dmd.dmr.shared.ldap.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;         // Base class from DmrbaseDMSAG - (DmoCompactSchemaFormatter.java:570)
import org.dmd.dmr.shared.ldap.generated.dmo.DmrldapDMSAG;         // Optional attribute: ldapIdPrefix from DmrldapDMSAG - (DmoCompactSchemaFormatter.java:566)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // For Meta references - (DmoCompactSchemaFormatter.java:552)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DmrldapDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- LDAPSchemaAUX
        DmrldapDMSAG.__LDAPSchemaAUX.addMay(DmrldapDMSAG.__ldapIdPrefix);

    // 2 -- LDAPClassAUX
        DmrldapDMSAG.__LDAPClassAUX.addMay(MetaDMSAG.__namingAttribute);
        DmrldapDMSAG.__LDAPClassAUX.addMay(DmrldapDMSAG.__reposName);

    // 3 -- LDAPAttributeAUX
        DmrldapDMSAG.__LDAPAttributeAUX.addMay(DmrldapDMSAG.__reposName);

    // 4 -- LDAPHierarchicObject
        DmrldapDMSAG.__LDAPHierarchicObject.addMust(MetaDMSAG.__FQN);
        DmrldapDMSAG.__LDAPHierarchicObject.addMay(MetaDMSAG.__file);
        DmrldapDMSAG.__LDAPHierarchicObject.addMay(MetaDMSAG.__lineNumber);


    }

}

