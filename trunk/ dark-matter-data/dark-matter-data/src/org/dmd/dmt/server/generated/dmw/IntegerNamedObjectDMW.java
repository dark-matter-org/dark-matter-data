package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:885)
import org.dmd.dmc.*;                                                  // If any attributes
import org.dmd.dmc.types.IntegerName;                                  // Primitive type
import org.dmd.dms.*;                                                  // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;         // Class not auxiliary or abstract

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class IntegerNamedObjectDMW extends DmwWrapper implements DmcNamedObjectIF {

    public IntegerNamedObjectDMW() {
        super(new IntegerNamedObjectDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    public IntegerNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new IntegerNamedObjectDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    public IntegerNamedObjectDMW getModificationRecorder(){
        IntegerNamedObjectDMW rc = new IntegerNamedObjectDMW(new DmcTypeModifierMV());
        rc.setIntegerName(getIntegerName());
        return(rc);
    }

    public IntegerNamedObjectDMW(IntegerNamedObjectDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    public IntegerNamedObjectDMO getDMO() {
        return((IntegerNamedObjectDMO) core);
    }

    protected IntegerNamedObjectDMW(IntegerNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:913)
    public IntegerName getObjectName(){
        return(((IntegerNamedObjectDMO) core).getIntegerName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((IntegerNamedObjectDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof IntegerNamedObjectDMW){
            return( getObjectName().equals( ((IntegerNamedObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public String getSvString(){
        return(((IntegerNamedObjectDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setSvString(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setSvString(String value){
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remSvString(){
        ((IntegerNamedObjectDMO) core).remSvString();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public IntegerName getIntegerName(){
        return(((IntegerNamedObjectDMO) core).getIntegerName());
    }

    /**
     * Sets integerName to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setIntegerName(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Sets integerName to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setIntegerName(IntegerName value){
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Removes the integerName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remIntegerName(){
        ((IntegerNamedObjectDMO) core).remIntegerName();
    }


}
