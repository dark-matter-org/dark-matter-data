package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.HashSet;                                                // To support getMVCopy() - (BaseDMWGenerator.java:1124)
import java.util.Iterator;                                               // Support copy of MV objects - (BaseDMWGenerator.java:2164)
import java.util.TreeMap;                                                // To support getMVCopy() - (BaseDMWGenerator.java:1114)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmc.types.IntegerToString;                                // Primitive type - (BaseDMWGenerator.java:1074)
import org.dmd.dmc.types.StringName;                                     // Primitive type - (BaseDMWGenerator.java:1074)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmw.IntegerToStringIterableDMW;             // For multi-valued IntegerToString - (BaseDMWGenerator.java:2490)
import org.dmd.dms.generated.dmw.StringNameIterableDMW;                  // For multi-valued StringName - (BaseDMWGenerator.java:2027)
import org.dmd.dmt.server.extended.ClientCountFilter;                    // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.dmt.server.extended.ObjWithRefs;                          // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.dmt.server.extended.TestAbstractExtended;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1000)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;            // For setNth of ClientCountFilter - (BaseDMWGenerator.java:1838)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                        // Attribute hsStringName from the dmt schema - (BaseDMWGenerator.java:821)
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;         // Abstract class - (BaseDMWGenerator.java:1154)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // For setNth of SomeRelation - (BaseDMWGenerator.java:1838)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGenerator.java:1159)



/**
 * The TestAbstract class just defines an abstract base class from which\n
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class TestAbstractExtendedDMW extends DmwWrapper {

    protected TestAbstractExtendedDMW() {
        super();
    }

    abstract public TestAbstractExtended getModificationRecorder();

    public TestAbstractExtendedDMO getDMO() {
        return((TestAbstractExtendedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected TestAbstractExtendedDMW(TestAbstractExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ClientCountFilter items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getClientCountFiltersSize(){
        return(((TestAbstractExtendedDMO) core).getClientCountFiltersSize());
    }

    /**
     * @return true if there are no ClientCountFilterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getClientCountFiltersIsEmpty(){
        if (((TestAbstractExtendedDMO) core).getClientCountFiltersSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ClientCountFilterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getClientCountFiltersHasValue(){
        if (((TestAbstractExtendedDMO) core).getClientCountFiltersSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the clientCountFilters value at the specified index.
     * @param value A value compatible with ClientCountFilter
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1855)
    public DmcAttribute<?> setNthClientCountFilters(int index, ClientCountFilter value){
        if (value == null)
            return(((TestAbstractExtendedDMO) core).setNthClientCountFilters(index, null));
        else
            return(((TestAbstractExtendedDMO) core).setNthClientCountFilters(index, ((ClientCountFilterDMO)value.getDmcObject())));
    }

    /**
     * @return The ClientCountFilter object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1899)
    public ClientCountFilter getNthClientCountFilters(int index){
        ClientCountFilterDMO dmo = ((TestAbstractExtendedDMO) core).getNthClientCountFilters(index);
        if (dmo == null)
            return(null);
        
        return((ClientCountFilter)dmo.getContainer());
    }

    /**
     * Removes the clientCountFilters attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remClientCountFilters(){
        ((TestAbstractExtendedDMO) core).remClientCountFilters();
    }

    /**
     * @return The number of StringName items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getHsStringNameSize(){
        return(((TestAbstractExtendedDMO) core).getHsStringNameSize());
    }

    /**
     * @return true if there are no StringNameDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getHsStringNameIsEmpty(){
        if (((TestAbstractExtendedDMO) core).getHsStringNameSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringNameDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getHsStringNameHasValue(){
        if (((TestAbstractExtendedDMO) core).getHsStringNameSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of StringName objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public StringNameIterableDMW getHsStringNameIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsStringName);
        if (attr == null)
            return(StringNameIterableDMW.emptyList);
        
        return(new StringNameIterableDMW(((TestAbstractExtendedDMO) core).getHsStringName()));
    }

    /**
     * Adds another hsStringName value.
     * @param value A value compatible with StringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public void addHsStringName(Object value) throws DmcValueException {
        ((TestAbstractExtendedDMO) core).addHsStringName(value);
    }

    /**
     * Adds another hsStringName value.
     * @param value A value compatible with StringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2067)
    public void addHsStringName(StringName value){
        ((TestAbstractExtendedDMO) core).addHsStringName(value);
    }

    /**
     * Returns true if the collection contains the hsStringName value.
     * @param value A value compatible with StringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2124)
    public boolean hsStringNameContains(StringName value){
        return(((TestAbstractExtendedDMO) core).hsStringNameContains(value));
    }

    /**
     * @return A COPY of the collection of StringName objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
    @SuppressWarnings("unchecked")
    public HashSet<StringName> getHsStringNameCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsStringName);
        if (attr == null)
            return(new HashSet<StringName>());
        
        HashSet<StringName> rc = new HashSet<StringName>(attr.getMVSize());
        
        Iterator<StringName> it = (Iterator<StringName>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsStringName value.
     * @param value The StringName to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2195)
    public void delHsStringName(Object value) throws DmcValueException {
        ((TestAbstractExtendedDMO) core).delHsStringName(value);
    }

    /**
     * Deletes a hsStringName value.
     * @param value The StringName to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2204)
    public void delHsStringName(StringName value){
        ((TestAbstractExtendedDMO) core).delHsStringName(value);
    }

    /**
     * Removes the hsStringName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remHsStringName(){
        ((TestAbstractExtendedDMO) core).remHsStringName();
    }

    /**
     * @return The number of IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2268)
    public int getIntToStringMAPSize(){
        DmcAttribute<?> attr = ((TestAbstractExtendedDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2280)
    public boolean getIntToStringMAPIsEmpty(){
        DmcAttribute<?> attr = ((TestAbstractExtendedDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2292)
    public boolean getIntToStringMAPHasValue(){
        DmcAttribute<?> attr = ((TestAbstractExtendedDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed IntegerToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2308)
    public IntegerToString getIntToStringMAP(Object key){
        DmcAttribute<?> attr = ((TestAbstractExtendedDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(null);
        
        return((IntegerToString)attr.getByKey(key));
    }

    /**
     * @return the first key of the map.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2339)
    public Integer getIntToStringMAPFirstKey(){
        return(((TestAbstractExtendedDMO) core).getIntToStringMAPFirstKey());
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2495)
    public IntegerToStringIterableDMW getIntToStringMAPIterable(){
        DmcAttribute<?> attr = ((TestAbstractExtendedDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(IntegerToStringIterableDMW.emptyList);
        
        return(new IntegerToStringIterableDMW(((TestAbstractExtendedDMO) core).getIntToStringMAP()));
    }

    /**
     * Adds another intToStringMAP value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2522)
    public void addIntToStringMAP(Object value) throws DmcValueException {
        ((TestAbstractExtendedDMO) core).addIntToStringMAP(value);
    }

    /**
     * Adds another intToStringMAP value.
     * @param value IntegerToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2531)
    public void addIntToStringMAP(IntegerToString value) {
        ((TestAbstractExtendedDMO) core).addIntToStringMAP(value);
    }

    /**
     * Deletes a intToStringMAP value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2543)
    public void delIntToStringMAP(Object value){
        ((TestAbstractExtendedDMO) core).delIntToStringMAP(value);
    }

    /**
     * Deletes a intToStringMAP value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2552)
    public void delIntToStringMAP(Integer value){
        ((TestAbstractExtendedDMO) core).delIntToStringMAP(value);
    }

    /**
     * @return A COPY of the collection of IntegerToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2582)
    @SuppressWarnings("unchecked")
    public TreeMap<Integer,IntegerToString> getIntToStringMAPCopy(){
        DmcAttribute<?> attr = ((TestAbstractExtendedDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(new TreeMap<Integer,IntegerToString>());
        
        TreeMap<Integer,IntegerToString> rc = new TreeMap<Integer,IntegerToString>();
        
        Iterator<IntegerToString> it = (Iterator<IntegerToString>) attr.getMV();
        while(it.hasNext()){
            IntegerToString obj = it.next();
            rc.put((Integer)obj.getKey(),obj);
        }
        
        return(rc);
    }

    /**
     * Removes the intToStringMAP attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2623)
    public void remIntToStringMAP(){
        ((TestAbstractExtendedDMO) core).remIntToStringMAP();
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getSomeRelationMVISize(){
        return(((TestAbstractExtendedDMO) core).getSomeRelationMVISize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getSomeRelationMVIIsEmpty(){
        if (((TestAbstractExtendedDMO) core).getSomeRelationMVISize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getSomeRelationMVIHasValue(){
        if (((TestAbstractExtendedDMO) core).getSomeRelationMVISize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the someRelationMVI value at the specified index.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1845)
    public DmcAttribute<?> setNthSomeRelationMVI(int index, SomeRelation value){
        return(((TestAbstractExtendedDMO) core).setNthSomeRelationMVI(index, value));
    }

    /**
     * @return The SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1935)
    public ObjWithRefs getNthSomeRelationMVI(int index){
        SomeRelation ref = ((TestAbstractExtendedDMO) core).getNthSomeRelationMVI(index);
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * @return The reference to the SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1981)
    public SomeRelation getNthSomeRelationMVIREF(int index){
        SomeRelation ref = ((TestAbstractExtendedDMO) core).getNthSomeRelationMVIREF(index);
        return(ref);
    }

    /**
     * Removes the someRelationMVI attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remSomeRelationMVI(){
        ((TestAbstractExtendedDMO) core).remSomeRelationMVI();
    }

    /**
     * @return A SomeRelation object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1358)
    public SomeRelation getSomeRelationSV(){
        SomeRelation ref = ((TestAbstractExtendedDMO) core).getSomeRelationSV();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((SomeRelation)ref.getObject().getContainer());
    }

    /**
     * Sets the someRelationSV to the specified value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1424)
    public void setSomeRelationSV(SomeRelation value) {
        ((TestAbstractExtendedDMO) core).setSomeRelationSV(value);
    }

    /**
     * Sets the someRelationSV to the specified value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1433)
    public void setSomeRelationSV(Object value) throws DmcValueException {
        ((TestAbstractExtendedDMO) core).setSomeRelationSV(value);
    }

    /**
     * Removes the someRelationSV attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remSomeRelationSV(){
        ((TestAbstractExtendedDMO) core).remSomeRelationSV();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public String getSvString(){
        return(((TestAbstractExtendedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setSvString(Object value) throws DmcValueException {
        ((TestAbstractExtendedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setSvString(String value){
        ((TestAbstractExtendedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remSvString(){
        ((TestAbstractExtendedDMO) core).remSvString();
    }


}
