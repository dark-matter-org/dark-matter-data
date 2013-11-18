package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values - (BaseDMWGeneratorNewest.java:1050)
import org.dmd.dmc.types.NameContainer;                               // Primitive type - (BaseDMWGeneratorNewest.java:1042)
import org.dmd.dms.ClassDefinition;                                   // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmt.shared.types.DmtStringName;                        // Primitive type - (BaseDMWGeneratorNewest.java:1042)
import org.dmd.dmw.DmwWrapper;                                        // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1127)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class NameContainerTestDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public NameContainerTestDMW() {
        super(new NameContainerTestDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NameContainerTest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public NameContainerTestDMW(DmcTypeModifierMV mods) {
        super(new NameContainerTestDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NameContainerTest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:505)
    public NameContainerTestDMW getModificationRecorder(){
        NameContainerTestDMW rc = new NameContainerTestDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public NameContainerTestDMW(NameContainerTestDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NameContainerTest);
    }

    public NameContainerTestDMW cloneIt() {
        NameContainerTestDMW rc = new NameContainerTestDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NameContainerTestDMO getDMO() {
        return((NameContainerTestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected NameContainerTestDMW(NameContainerTestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public NameContainer getAnObjName(){
        return(((NameContainerTestDMO) core).getAnObjName());
    }

    /**
     * Sets anObjName to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setAnObjName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setAnObjName(NameContainer value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1499)
    public void setAnObjName(DmcObjectName value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Removes the anObjName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remAnObjName(){
        ((NameContainerTestDMO) core).remAnObjName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public DmtStringName getAnotherDmtName(){
        return(((NameContainerTestDMO) core).getAnotherDmtName());
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setAnotherDmtName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setAnotherDmtName(DmtStringName value){
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Removes the anotherDmtName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remAnotherDmtName(){
        ((NameContainerTestDMO) core).remAnotherDmtName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public DmtStringName getDmtStringName(){
        return(((NameContainerTestDMO) core).getDmtStringName());
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setDmtStringName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setDmtStringName(DmtStringName value){
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Removes the dmtStringName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remDmtStringName(){
        ((NameContainerTestDMO) core).remDmtStringName();
    }


}
