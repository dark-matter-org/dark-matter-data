package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmp.server.extended.LogoutRequest;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.dmp.server.extended.Request;                       // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:1071)



/**
 * The LogoutRequest allows you to disconnect from your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class LogoutRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public LogoutRequestDMW() {
        super(new LogoutRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public LogoutRequestDMW(DmcTypeModifierMV mods) {
        super(new LogoutRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:585)
    public LogoutRequest getModificationRecorder(){
        LogoutRequest rc = new LogoutRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public LogoutRequestDMW(LogoutRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
    }

    public LogoutRequest cloneIt() {
        LogoutRequest rc = new LogoutRequest();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public LogoutRequestDMO getDMO() {
        return((LogoutRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected LogoutRequestDMW(LogoutRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getSessionID(){
        return(((LogoutRequestDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setSessionID(Object value) throws DmcValueException {
        ((LogoutRequestDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setSessionID(String value){
        ((LogoutRequestDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remSessionID(){
        ((LogoutRequestDMO) core).remSessionID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getUserName(){
        return(((LogoutRequestDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setUserName(Object value) throws DmcValueException {
        ((LogoutRequestDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setUserName(String value){
        ((LogoutRequestDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remUserName(){
        ((LogoutRequestDMO) core).remUserName();
    }


}
