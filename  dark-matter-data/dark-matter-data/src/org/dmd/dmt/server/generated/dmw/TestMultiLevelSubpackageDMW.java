package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:936)
import java.util.ArrayList;                                                  // To support getMVCopy()
import java.util.Iterator;                                                   // To support getMVCopy()
import org.dmd.dmc.*;                                                        // If any attributes
import org.dmd.dmc.types.StringName;                                         // Primitive type
import org.dmd.dms.*;                                                        // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor
import org.dmd.dms.generated.dmw.StringIterableDMW;                          // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                            // Attribute from dmt schema
import org.dmd.dmt.shared.generated.dmo.TestMultiLevelSubpackageDMO;         // Class not auxiliary or abstract
import org.dmd.dmw.DmwNamedObjectWrapper;                                    // Named object wrapper

/**
 * The TestOneLevelSubpackage class provides a test bed for generating DMWs
 * in different subpackages.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:349)
 */
public class TestMultiLevelSubpackageDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    public TestMultiLevelSubpackageDMW() {
        super(new TestMultiLevelSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestMultiLevelSubpackage);
    }

    public TestMultiLevelSubpackageDMW(DmcTypeModifierMV mods) {
        super(new TestMultiLevelSubpackageDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestMultiLevelSubpackage);
    }

    public TestMultiLevelSubpackageDMW getModificationRecorder(){
        TestMultiLevelSubpackageDMW rc = new TestMultiLevelSubpackageDMW();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public TestMultiLevelSubpackageDMW(TestMultiLevelSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestMultiLevelSubpackage);
    }

    public TestMultiLevelSubpackageDMO getDMO() {
        return((TestMultiLevelSubpackageDMO) core);
    }

    protected TestMultiLevelSubpackageDMW(TestMultiLevelSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:964)
    public StringName getObjectName(){
        return(((TestMultiLevelSubpackageDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestMultiLevelSubpackageDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestMultiLevelSubpackageDMW){
            return( getObjectName().equals( ((TestMultiLevelSubpackageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1238)
    public int getMvStringSize(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null){
            if (DmtDMSAG.__mvString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1253)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1265)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1463)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestMultiLevelSubpackageDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1479)
    public void addMvString(Object value) throws DmcValueException {
        ((TestMultiLevelSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1489)
    public void addMvString(String value){
        ((TestMultiLevelSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1547)
    public boolean mvStringContains(String value){
        return(((TestMultiLevelSubpackageDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1587)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1614)
    public void delMvString(Object value) throws DmcValueException {
        ((TestMultiLevelSubpackageDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1623)
    public void delMvString(String value){
        ((TestMultiLevelSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1635)
    public void remMvString(){
        ((TestMultiLevelSubpackageDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public StringName getName(){
        return(((TestMultiLevelSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setName(Object value) throws DmcValueException {
        ((TestMultiLevelSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setName(StringName value){
        ((TestMultiLevelSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remName(){
        ((TestMultiLevelSubpackageDMO) core).remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public String getSvString(){
        return(((TestMultiLevelSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setSvString(Object value) throws DmcValueException {
        ((TestMultiLevelSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setSvString(String value){
        ((TestMultiLevelSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remSvString(){
        ((TestMultiLevelSubpackageDMO) core).remSvString();
    }


}
