package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values - (BaseDMWGenerator.java:1158)
import org.dmd.dmc.types.NameContainer;                               // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dms.ClassDefinition;                                   // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.shared.types.DmtStringName;                        // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dmw.DmwWrapper;                                        // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class NameContainerTestDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public NameContainerTestDMW() {
        super(new NameContainerTestDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NameContainerTest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public NameContainerTestDMW(DmcTypeModifierMV mods) {
        super(new NameContainerTestDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NameContainerTest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public NameContainerTestDMW getModificationRecorder(){
        NameContainerTestDMW rc = new NameContainerTestDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected NameContainerTestDMW(NameContainerTestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public NameContainer getAnObjName(){
        return(((NameContainerTestDMO) core).getAnObjName());
    }

    /**
     * Sets anObjName to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setAnObjName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setAnObjName(NameContainer value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1607)
    public void setAnObjName(DmcObjectName value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Removes the anObjName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remAnObjName(){
        ((NameContainerTestDMO) core).remAnObjName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DmtStringName getAnotherDmtName(){
        return(((NameContainerTestDMO) core).getAnotherDmtName());
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setAnotherDmtName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setAnotherDmtName(DmtStringName value){
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Removes the anotherDmtName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remAnotherDmtName(){
        ((NameContainerTestDMO) core).remAnotherDmtName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DmtStringName getDmtStringName(){
        return(((NameContainerTestDMO) core).getDmtStringName());
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setDmtStringName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setDmtStringName(DmtStringName value){
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Removes the dmtStringName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remDmtStringName(){
        ((NameContainerTestDMO) core).remDmtStringName();
    }


}