package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmp.server.extended.PreAuthRequest;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmp.server.extended.Request;                        // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dmp.shared.generated.dmo.PreAuthRequestDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGenerator.java:948)



/**
 * The PreAuthRequest allows for the retrieval of information from the\n
 * servlet before a user has authenticated. Exactly what type of information
 * can be \n retrieved is application specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class PreAuthRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public PreAuthRequestDMW() {
        super(new PreAuthRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public PreAuthRequestDMW(DmcTypeModifierMV mods) {
        super(new PreAuthRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:604)
    public PreAuthRequest getModificationRecorder(){
        PreAuthRequest rc = new PreAuthRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public PreAuthRequestDMW(PreAuthRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._PreAuthRequest);
    }

    public PreAuthRequest cloneIt() {
        PreAuthRequest rc = new PreAuthRequest();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PreAuthRequestDMO getDMO() {
        return((PreAuthRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected PreAuthRequestDMW(PreAuthRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }


}
