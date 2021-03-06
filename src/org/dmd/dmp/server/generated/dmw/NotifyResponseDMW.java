package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmp.server.extended.NotifyResponse;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmp.server.extended.Response;                       // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGenerator.java:948)



/**
 * The NotifyResponse is sent as the result of a NotifyRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class NotifyResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public NotifyResponseDMW() {
        super(new NotifyResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public NotifyResponseDMW(DmcTypeModifierMV mods) {
        super(new NotifyResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:604)
    public NotifyResponse getModificationRecorder(){
        NotifyResponse rc = new NotifyResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public NotifyResponseDMW(NotifyResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
    }

    public NotifyResponse cloneIt() {
        NotifyResponse rc = new NotifyResponse();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NotifyResponseDMO getDMO() {
        return((NotifyResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected NotifyResponseDMW(NotifyResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }


}
