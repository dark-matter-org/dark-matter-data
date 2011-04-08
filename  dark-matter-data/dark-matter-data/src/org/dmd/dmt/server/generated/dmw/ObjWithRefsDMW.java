package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:751)
import org.dmd.dmc.*;                                                   // If any attributes
import org.dmd.dmc.types.IntegerToString;                               // For multi-valued containsIntegerToString
import org.dmd.dmc.types.StringName;                                    // Primitive type
import org.dmd.dms.*;                                                   // Always 2
import org.dmd.dms.generated.dmw.IntegerToStringIterableDMW;            // For multi-valued IntegerToString
import org.dmd.dms.generated.dmw.StringIterableDMW;                     // For multi-valued String
import org.dmd.dmt.server.extended.ObjWithRefs;                         // Is reference type aux
import org.dmd.dmt.server.generated.dmw.ObjWithRefsIterableDMW;         // For multi-valued ObjWithRefs
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                 // Class not auxiliary or abstract
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;               // Is reference type REF

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:339)
 */
public class ObjWithRefsDMW extends DmwWrapper implements DmcNamedObjectIF {

    private ObjWithRefsDMO mycore;

    public ObjWithRefsDMW() {
        super(new ObjWithRefsDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefs);
        mycore = (ObjWithRefsDMO) core;
        mycore.setContainer(this);
    }

    public ObjWithRefsDMW(ObjWithRefsDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefs);
        mycore = (ObjWithRefsDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (ObjWithRefsDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public ObjWithRefsDMO getDMO() {
        return(mycore);
    }

    protected ObjWithRefsDMW(ObjWithRefsDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ObjWithRefsDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:777)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ObjWithRefsDMW){
            return( getObjectName().equals( ((ObjWithRefsDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:881)
    public String getSvString(){
        return(mycore.getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:928)
    public void setSvString(Object value) throws DmcValueException {
        mycore.setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:937)
    public void setSvString(String value){
        mycore.setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:952)
    public void remSvString(){
        mycore.remSvString();
    }

    /**
     * @return A ObjWithRefs object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:861)
    public ObjWithRefs getObjRef(){
        ObjWithRefsREF ref = mycore.getObjRef();
        if (ref == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * Sets the objRef to the specified value.
     * @param value A value compatible with ObjWithRefsREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:905)
    public void setObjRef(ObjWithRefs value) {
        mycore.setObjRef(value.getDMO());
    }

    /**
     * Removes the objRef attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:952)
    public void remObjRef(){
        mycore.remObjRef();
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1002)
    public int getObjRefMVSize(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefMV);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1014)
    public boolean getObjRefMVIsEmpty(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefMV);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1026)
    public boolean getObjRefMVHasValue(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefMV);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1045)
    public ObjWithRefsIterableDMW getObjRefMVIterable(){
        DmcAttribute attr = mycore.get(ObjWithRefsDMO.__objRefMV);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(attr.getMV()));
    }

    /**
     * Adds another objRefMV value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1061)
    public DmcAttribute<?> addObjRefMV(ObjWithRefs value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addObjRefMV(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a objRefMV value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1075)
    public void delObjRefMV(ObjWithRefs value) throws DmcValueException {
        mycore.delObjRefMV(value);
    }

    /**
     * Removes the objRefMV attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1150)
    public void remObjRefMV(){
        mycore.remObjRefMV();
    }

    /**
     * @return The number of StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1002)
    public int getMvStringSize(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1014)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1026)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1098)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(mycore.getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1114)
    public void addMvString(Object value) throws DmcValueException {
        mycore.addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1126)
    public boolean mvStringContains(String value){
        return(mycore.mvStringContains(value));
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1138)
    public void delMvString(Object value) throws DmcValueException {
        mycore.delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1150)
    public void remMvString(){
        mycore.remMvString();
    }

    /**
     * @return The number of IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1200)
    public int getIntToStringSize(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__intToString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1212)
    public boolean getIntToStringIsEmpty(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__intToString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1224)
    public boolean getIntToStringHasValue(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__intToString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed IntegerToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1239)
    public IntegerToString getIntToString(Object key){
        // NOT IMPLEMENTED YET 
        return(null);
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1297)
    public IntegerToStringIterableDMW getIntToStringIterable(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__intToString);
        if (attr == null)
            return(IntegerToStringIterableDMW.emptyList);
        
        return(new IntegerToStringIterableDMW(mycore.getIntToString()));
    }

    /**
     * Adds another intToString value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1313)
    public void addIntToString(Object value) throws DmcValueException {
        mycore.addIntToString(value);
    }

    /**
     * Adds another intToString value.
     * @param value IntegerToString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1322)
    public void addIntToString(IntegerToString value) {
        mycore.addIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1334)
    public void delIntToString(Object value) throws DmcValueException {
        mycore.delIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1343)
    public void delIntToString(Integer value){
        mycore.delIntToString(value);
    }

    /**
     * Removes the intToString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1367)
    public void remIntToString(){
        mycore.remIntToString();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:881)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:928)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:937)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:952)
    public void remName(){
        mycore.remName();
    }


}
