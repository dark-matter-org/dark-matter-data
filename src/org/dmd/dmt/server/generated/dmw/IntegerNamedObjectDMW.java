package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.types.IntegerName;                                  // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.ClassDefinition;                                    // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmw.DmwNamedObjectWrapper;                              // Named object wrapper - (BaseDMWGeneratorNewest.java:1111)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class IntegerNamedObjectDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public IntegerNamedObjectDMW() {
        super(new IntegerNamedObjectDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public IntegerNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new IntegerNamedObjectDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:504)
    public IntegerNamedObjectDMW getModificationRecorder(){
        IntegerNamedObjectDMW rc = new IntegerNamedObjectDMW();
        rc.setIntegerName(getIntegerName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public IntegerNamedObjectDMW(IntegerNamedObjectDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._IntegerNamedObject);
    }

    public IntegerNamedObjectDMW cloneIt() {
        IntegerNamedObjectDMW rc = new IntegerNamedObjectDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public IntegerNamedObjectDMO getDMO() {
        return((IntegerNamedObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected IntegerNamedObjectDMW(IntegerNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1166)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public IntegerName getIntegerName(){
        return(((IntegerNamedObjectDMO) core).getIntegerName());
    }

    /**
     * Sets integerName to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setIntegerName(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Sets integerName to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setIntegerName(IntegerName value){
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Removes the integerName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remIntegerName(){
        ((IntegerNamedObjectDMO) core).remIntegerName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getSvString(){
        return(((IntegerNamedObjectDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setSvString(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setSvString(String value){
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remSvString(){
        ((IntegerNamedObjectDMO) core).remSvString();
    }


}