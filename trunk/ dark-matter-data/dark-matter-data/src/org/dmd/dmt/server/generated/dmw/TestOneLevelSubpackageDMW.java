package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:922)
import java.util.ArrayList;                                                // To support getMVCopy()
import java.util.Iterator;                                                 // To support getMVCopy()
import org.dmd.dmc.*;                                                      // If any attributes
import org.dmd.dmc.types.StringName;                                       // Primitive type
import org.dmd.dms.*;                                                      // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                        // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageDMO;         // Class not auxiliary or abstract
import org.dmd.dmw.DmwNamedObjectWrapper;                                  // Named object wrapper

/**
 * The TestOneLevelSubpackage class provides a test bed for generating DMWs
 * in different subpackages.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class TestOneLevelSubpackageDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    public TestOneLevelSubpackageDMW() {
        super(new TestOneLevelSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackage);
    }

    public TestOneLevelSubpackageDMW(DmcTypeModifierMV mods) {
        super(new TestOneLevelSubpackageDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackage);
    }

    public TestOneLevelSubpackageDMW getModificationRecorder(){
        TestOneLevelSubpackageDMW rc = new TestOneLevelSubpackageDMW();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public TestOneLevelSubpackageDMW(TestOneLevelSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackage);
    }

    public TestOneLevelSubpackageDMO getDMO() {
        return((TestOneLevelSubpackageDMO) core);
    }

    protected TestOneLevelSubpackageDMW(TestOneLevelSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:950)
    public StringName getObjectName(){
        return(((TestOneLevelSubpackageDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestOneLevelSubpackageDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestOneLevelSubpackageDMW){
            return( getObjectName().equals( ((TestOneLevelSubpackageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1221)
    public int getMvStringSize(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1233)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1357)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestOneLevelSubpackageDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1373)
    public void addMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1382)
    public void addMvString(String value){
        ((TestOneLevelSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1406)
    public boolean mvStringContains(String value){
        return(((TestOneLevelSubpackageDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(TestOneLevelSubpackageDMO.__mvString);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1473)
    public void delMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1482)
    public void delMvString(String value){
        ((TestOneLevelSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1494)
    public void remMvString(){
        ((TestOneLevelSubpackageDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public StringName getName(){
        return(((TestOneLevelSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setName(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setName(StringName value){
        ((TestOneLevelSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remName(){
        ((TestOneLevelSubpackageDMO) core).remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getSvString(){
        return(((TestOneLevelSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setSvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setSvString(String value){
        ((TestOneLevelSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remSvString(){
        ((TestOneLevelSubpackageDMO) core).remSvString();
    }


}
