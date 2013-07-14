package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.ArrayList;                                                // Support for MULTI attribute - (BaseDMWGeneratorNewest.java:2093)
import java.util.Iterator;                                                 // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2105)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dms.ClassDefinition;                                        // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.dmw.StringIterableDMW;                        // For multi-valued String - (BaseDMWGeneratorNewest.java:1970)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmt.server.extended.ObjWithRefs;                            // Is reference type - (BaseDMWGeneratorNewest.java:976)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                          // Attribute indexedString from the dmt schema - (BaseDMWGeneratorNewest.java:771)
import org.dmd.dmt.shared.generated.dmo.UsingIndexedAttributesDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmt.shared.generated.types.SomeRelation;                    // For setNth of SomeRelation - (BaseDMWGeneratorNewest.java:1781)
import org.dmd.dmw.DmwWrapper;                                             // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1104)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class UsingIndexedAttributesDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public UsingIndexedAttributesDMW() {
        super(new UsingIndexedAttributesDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UsingIndexedAttributes);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public UsingIndexedAttributesDMW(DmcTypeModifierMV mods) {
        super(new UsingIndexedAttributesDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UsingIndexedAttributes);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public UsingIndexedAttributesDMW getModificationRecorder(){
        UsingIndexedAttributesDMW rc = new UsingIndexedAttributesDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public UsingIndexedAttributesDMW(UsingIndexedAttributesDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UsingIndexedAttributes);
    }

    public UsingIndexedAttributesDMW cloneIt() {
        UsingIndexedAttributesDMW rc = new UsingIndexedAttributesDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UsingIndexedAttributesDMO getDMO() {
        return((UsingIndexedAttributesDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected UsingIndexedAttributesDMW(UsingIndexedAttributesDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1540)
    public int getIndexedStringSize(){
        return(((UsingIndexedAttributesDMO) core).getIndexedStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1548)
    public boolean getIndexedStringIsEmpty(){
        if (((UsingIndexedAttributesDMO) core).getIndexedStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1558)
    public boolean getIndexedStringHasValue(){
        if (((UsingIndexedAttributesDMO) core).getIndexedStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1974)
    public StringIterableDMW getIndexedStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__indexedString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((UsingIndexedAttributesDMO) core).getIndexedString()));
    }

    /**
     * Adds another indexedString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2000)
    public void addIndexedString(Object value) throws DmcValueException {
        ((UsingIndexedAttributesDMO) core).addIndexedString(value);
    }

    /**
     * Sets a indexedString value at the specified index.
     * @param index The index to set.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2021)
    public void setNthIndexedString(int index, String value){
        ((UsingIndexedAttributesDMO) core).setNthIndexedString(index, value);
    }

    /**
     * Gets the indexedString value at the specified index.
     * @param index The index to retreive.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2030)
    public String getNthIndexedString(int index){
        return(((UsingIndexedAttributesDMO) core).getNthIndexedString(index));
    }

    /**
     * Returns true if the collection contains the indexedString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2067)
    public boolean indexedStringContains(String value){
        return(((UsingIndexedAttributesDMO) core).indexedStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2109)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getIndexedStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__indexedString);
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
     * Deletes a indexedString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2136)
    public void delIndexedString(Object value) throws DmcValueException {
        ((UsingIndexedAttributesDMO) core).delIndexedString(value);
    }

    /**
     * Deletes a indexedString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2145)
    public void delIndexedString(String value){
        ((UsingIndexedAttributesDMO) core).delIndexedString(value);
    }

    /**
     * Removes the indexedString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2157)
    public void remIndexedString(){
        ((UsingIndexedAttributesDMO) core).remIndexedString();
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1540)
    public int getSomeRelationIndexedSize(){
        return(((UsingIndexedAttributesDMO) core).getSomeRelationIndexedSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1548)
    public boolean getSomeRelationIndexedIsEmpty(){
        if (((UsingIndexedAttributesDMO) core).getSomeRelationIndexedSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1558)
    public boolean getSomeRelationIndexedHasValue(){
        if (((UsingIndexedAttributesDMO) core).getSomeRelationIndexedSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the someRelationIndexed value at the specified index.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1788)
    public DmcAttribute<?> setNthSomeRelationIndexed(int index, SomeRelation value){
        return(((UsingIndexedAttributesDMO) core).setNthSomeRelationIndexed(index, value));
    }

    /**
     * @return The SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1878)
    public ObjWithRefs getNthSomeRelationIndexed(int index){
        SomeRelation ref = ((UsingIndexedAttributesDMO) core).getNthSomeRelationIndexed(index);
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * @return The reference to the SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1924)
    public SomeRelation getNthSomeRelationIndexedREF(int index){
        SomeRelation ref = ((UsingIndexedAttributesDMO) core).getNthSomeRelationIndexedREF(index);
        return(ref);
    }

    /**
     * Removes the someRelationIndexed attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2157)
    public void remSomeRelationIndexed(){
        ((UsingIndexedAttributesDMO) core).remSomeRelationIndexed();
    }


}