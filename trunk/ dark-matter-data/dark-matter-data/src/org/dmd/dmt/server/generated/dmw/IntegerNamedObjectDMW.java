package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:879)
import org.dmd.dmc.*;                                                  // If any attributes
import org.dmd.dmc.types.IntegerName;                                  // Primitive type
import org.dmd.dms.*;                                                  // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;         // Class not auxiliary or abstract
import org.dmd.dmw.DmwNamedObjectWrapper;                              // Named object wrapper

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:293)
 */
public class IntegerNamedObjectDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:370)
    public IntegerNamedObjectDMW() {
        super(new IntegerNamedObjectDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:376)
    public IntegerNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new IntegerNamedObjectDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:427)
    public IntegerNamedObjectDMW getModificationRecorder(){
        IntegerNamedObjectDMW rc = new IntegerNamedObjectDMW();
        rc.setIntegerName(getIntegerName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:439)
    public IntegerNamedObjectDMW(IntegerNamedObjectDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    public IntegerNamedObjectDMO getDMO() {
        return((IntegerNamedObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:456)
    protected IntegerNamedObjectDMW(IntegerNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:906)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1058)
    public String getSvString(){
        return(((IntegerNamedObjectDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1117)
    public void setSvString(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1126)
    public void setSvString(String value){
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1152)
    public void remSvString(){
        ((IntegerNamedObjectDMO) core).remSvString();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1058)
    public IntegerName getIntegerName(){
        return(((IntegerNamedObjectDMO) core).getIntegerName());
    }

    /**
     * Sets integerName to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1117)
    public void setIntegerName(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Sets integerName to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1126)
    public void setIntegerName(IntegerName value){
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Removes the integerName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1152)
    public void remIntegerName(){
        ((IntegerNamedObjectDMO) core).remIntegerName();
    }


}
