package org.dmd.dmt.server.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.ArrayList;                                                        // To support getMVCopy()
import java.util.Iterator;                                                         // To support getMVCopy()
import org.dmd.dmc.*;                                                              // If any attributes
import org.dmd.dmc.types.StringName;                                               // Primitive type
import org.dmd.dms.*;                                                              // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                                // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                              // Required for MODREC constructor
import org.dmd.dmt.server.extended.subpack.TestOneLevelSubpackageExtended;         // Required for getModificationRecorder()
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO;         // Class not auxiliary or abstract

/**
 * The TestOneLevelSubpackage class provides a test bed for generating DMWs
 * in different subpackages.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class TestOneLevelSubpackageExtendedDMW extends DmwWrapper implements DmcNamedObjectIF {

    public TestOneLevelSubpackageExtendedDMW() {
        super(new TestOneLevelSubpackageExtendedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    public TestOneLevelSubpackageExtendedDMW(DmcTypeModifierMV mods) {
        super(new TestOneLevelSubpackageExtendedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    public TestOneLevelSubpackageExtended getModificationRecorder(){
        TestOneLevelSubpackageExtended rc = new TestOneLevelSubpackageExtended();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public TestOneLevelSubpackageExtendedDMW(TestOneLevelSubpackageExtendedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    public TestOneLevelSubpackageExtendedDMO getDMO() {
        return((TestOneLevelSubpackageExtendedDMO) core);
    }

    protected TestOneLevelSubpackageExtendedDMW(TestOneLevelSubpackageExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public StringName getObjectName(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestOneLevelSubpackageExtendedDMW){
            return( getObjectName().equals( ((TestOneLevelSubpackageExtendedDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getMvStringSize(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageExtendedDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageExtendedDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageExtendedDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageExtendedDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestOneLevelSubpackageExtendedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addMvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean mvStringContains(String value){
        return(((TestOneLevelSubpackageExtendedDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageExtendedDMO.__mvString);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delMvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remMvString(){
        ((TestOneLevelSubpackageExtendedDMO) core).remMvString();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public StringName getName(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setName(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setName(StringName value){
        ((TestOneLevelSubpackageExtendedDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remName(){
        ((TestOneLevelSubpackageExtendedDMO) core).remName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getSvString(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSvString(){
        ((TestOneLevelSubpackageExtendedDMO) core).remSvString();
    }


}
