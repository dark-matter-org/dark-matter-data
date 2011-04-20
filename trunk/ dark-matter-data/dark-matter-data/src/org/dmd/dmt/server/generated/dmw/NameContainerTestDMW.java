package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values
import org.dmd.dmc.types.NameContainer;                               // Primitive type
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;         // Class not auxiliary or abstract
import org.dmd.dmt.shared.types.DmtStringName;                        // Primitive type

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class NameContainerTestDMW extends DmwWrapper {

    public NameContainerTestDMW() {
        super(new NameContainerTestDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NameContainerTest);
    }

    public NameContainerTestDMW(DmcTypeModifierMV mods) {
        super(new NameContainerTestDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NameContainerTest);
    }

    public NameContainerTestDMW(NameContainerTestDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NameContainerTest);
    }

    public NameContainerTestDMO getDMO() {
        return((NameContainerTestDMO) core);
    }

    protected NameContainerTestDMW(NameContainerTestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public DmtStringName getAnotherDmtName(){
        return(((NameContainerTestDMO) core).getAnotherDmtName());
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setAnotherDmtName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setAnotherDmtName(DmtStringName value){
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Removes the anotherDmtName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remAnotherDmtName(){
        ((NameContainerTestDMO) core).remAnotherDmtName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public DmtStringName getDmtStringName(){
        return(((NameContainerTestDMO) core).getDmtStringName());
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setDmtStringName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setDmtStringName(DmtStringName value){
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Removes the dmtStringName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remDmtStringName(){
        ((NameContainerTestDMO) core).remDmtStringName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public NameContainer getAnObjName(){
        return(((NameContainerTestDMO) core).getAnObjName());
    }

    /**
     * Sets anObjName to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setAnObjName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setAnObjName(NameContainer value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1082)
    public void setAnObjName(DmcObjectName value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Removes the anObjName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remAnObjName(){
        ((NameContainerTestDMO) core).remAnObjName();
    }


}
