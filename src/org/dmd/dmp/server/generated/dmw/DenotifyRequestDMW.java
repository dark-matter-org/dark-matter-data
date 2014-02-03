package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.DmcObjectName;                                   // Alternative type for NameContainer values - (BaseDMWGenerator.java:1158)
import org.dmd.dmc.types.NameContainer;                             // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dmp.server.extended.DenotifyRequest;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.dmp.server.extended.Request;                         // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (BaseDMWGenerator.java:1071)



/**
 * The DenotifyRequest allows you to deregister for event notification on\n
 * one or more objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class DenotifyRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public DenotifyRequestDMW() {
        super(new DenotifyRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public DenotifyRequestDMW(DmcTypeModifierMV mods) {
        super(new DenotifyRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:585)
    public DenotifyRequest getModificationRecorder(){
        DenotifyRequest rc = new DenotifyRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public DenotifyRequestDMW(DenotifyRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DenotifyRequest);
    }

    public DenotifyRequest cloneIt() {
        DenotifyRequest rc = new DenotifyRequest();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public DenotifyRequestDMO getDMO() {
        return((DenotifyRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected DenotifyRequestDMW(DenotifyRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getFilter(){
        return(((DenotifyRequestDMO) core).getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setFilter(Object value) throws DmcValueException {
        ((DenotifyRequestDMO) core).setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setFilter(String value){
        ((DenotifyRequestDMO) core).setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remFilter(){
        ((DenotifyRequestDMO) core).remFilter();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public Long getListenerID(){
        return(((DenotifyRequestDMO) core).getListenerID());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setListenerID(Object value) throws DmcValueException {
        ((DenotifyRequestDMO) core).setListenerID(value);
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setListenerID(Long value){
        ((DenotifyRequestDMO) core).setListenerID(value);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remListenerID(){
        ((DenotifyRequestDMO) core).remListenerID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public ScopeEnum getScope(){
        return(((DenotifyRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setScope(Object value) throws DmcValueException {
        ((DenotifyRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setScope(ScopeEnum value){
        ((DenotifyRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remScope(){
        ((DenotifyRequestDMO) core).remScope();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public NameContainer getTarget(){
        return(((DenotifyRequestDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setTarget(Object value) throws DmcValueException {
        ((DenotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setTarget(NameContainer value){
        ((DenotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1607)
    public void setTarget(DmcObjectName value){
        ((DenotifyRequestDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remTarget(){
        ((DenotifyRequestDMO) core).remTarget();
    }


}
