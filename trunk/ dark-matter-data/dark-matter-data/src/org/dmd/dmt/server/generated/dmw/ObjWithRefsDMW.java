package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:838)
import java.util.ArrayList;                                             // To support getMVCopy()
import java.util.HashMap;                                               // To support getMVCopy()
import java.util.Iterator;                                              // To support getMVCopy()
import org.dmd.dmc.*;                                                   // If any attributes
import org.dmd.dmc.types.IntegerToString;                               // For multi-valued containsIntegerToString
import org.dmd.dmc.types.StringName;                                    // Primitive type
import org.dmd.dms.*;                                                   // Always 2
import org.dmd.dms.generated.dmw.IntegerToStringIterableDMW;            // For multi-valued IntegerToString
import org.dmd.dms.generated.dmw.StringIterableDMW;                     // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor
import org.dmd.dmt.server.extended.ObjWithRefs;                         // Is reference type aux
import org.dmd.dmt.server.generated.dmw.ObjWithRefsIterableDMW;         // For multi-valued ObjWithRefs
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                 // Class not auxiliary or abstract
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;               // To support getMVCopy() for REFs

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
public class ObjWithRefsDMW extends DmwWrapper implements DmcNamedObjectIF {

    private ObjWithRefsDMO mycore;

    public ObjWithRefsDMW() {
        super(new ObjWithRefsDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefs);
        mycore = (ObjWithRefsDMO) core;
        mycore.setContainer(this);
    }

    public ObjWithRefsDMW(DmcTypeModifierMV mods) {
        super(new ObjWithRefsDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefs);
        mycore = (ObjWithRefsDMO) core;
        mycore.setContainer(this);
    }

    public ObjWithRefs getModificationRecorder(){
        ObjWithRefs rc = new ObjWithRefs();
        rc.setDmcObject(new ObjWithRefsDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
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

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
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

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getSvString(){
        return(mycore.getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setSvString(Object value) throws DmcValueException {
        mycore.setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setSvString(String value){
        mycore.setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remSvString(){
        mycore.remSvString();
    }

    /**
     * @return A ObjWithRefs object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:968)
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
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1013)
    public void setObjRef(ObjWithRefs value) {
        mycore.setObjRef(value.getDMO());
    }

    /**
     * Removes the objRef attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remObjRef(){
        mycore.remObjRef();
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getObjRefMVSize(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefMV);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getObjRefMVIsEmpty(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefMV);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addObjRefMV(ObjWithRefs value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addObjRefMV(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a objRefMV value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delObjRefMV(ObjWithRefs value) throws DmcValueException {
        mycore.delObjRefMV(value);
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<ObjWithRefs> getObjRefMVCopy(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefMV);
        if (attr == null)
            return(new ArrayList<ObjWithRefs>());
        
        ArrayList<ObjWithRefs> rc = new ArrayList<ObjWithRefs>(attr.getMVSize());
        
        ObjWithRefsIterableDMW it = getObjRefMVIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the objRefMV attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remObjRefMV(){
        mycore.remObjRefMV();
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1399)
    public int getObjRefHMSize(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefHM);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1411)
    public boolean getObjRefHMIsEmpty(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefHM);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1423)
    public boolean getObjRefHMHasValue(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefHM);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1438)
    public ObjWithRefs getObjRefHM(Object key){
        // NOT IMPLEMENTED YET 
        return(null);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1456)
    public ObjWithRefsIterableDMW getObjRefHMIterable(){
        DmcAttribute attr = mycore.get(ObjWithRefsDMO.__objRefHM);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(attr.getMV()));
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefsDMW
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1473)
    public DmcAttribute<?> addObjRefHM(ObjWithRefs value) {
        return(mycore.addObjRefHM(value.getDMO()));
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1485)
    public void delObjRefHM(ObjWithRefs value){
        mycore.delObjRefHM(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1519)
    public HashMap<StringName,ObjWithRefs> getObjRefHMCopy(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__objRefHM);
        if (attr == null)
            return(new HashMap<StringName,ObjWithRefs>());
        
        HashMap<StringName,ObjWithRefs> rc = new HashMap<StringName,ObjWithRefs>(attr.getMVSize());
        
        ObjWithRefsIterableDMW it = getObjRefHMIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((StringName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1656)
    public void remObjRefHM(){
        mycore.remObjRefHM();
    }

    /**
     * @return The number of StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getMvStringSize(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1261)
    public void addMvString(Object value) throws DmcValueException {
        mycore.addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1270)
    public void addMvString(String value){
        mycore.addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1282)
    public boolean mvStringContains(String value){
        return(mycore.mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1310)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__mvString);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void delMvString(Object value) throws DmcValueException {
        mycore.delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remMvString(){
        mycore.remMvString();
    }

    /**
     * @return The number of IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1399)
    public int getIntToStringSize(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__intToString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1411)
    public boolean getIntToStringIsEmpty(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__intToString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1423)
    public boolean getIntToStringHasValue(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__intToString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed IntegerToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1438)
    public IntegerToString getIntToString(Object key){
        // NOT IMPLEMENTED YET 
        return(null);
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1544)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1560)
    public void addIntToString(Object value) throws DmcValueException {
        mycore.addIntToString(value);
    }

    /**
     * Adds another intToString value.
     * @param value IntegerToString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1569)
    public void addIntToString(IntegerToString value) {
        mycore.addIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1581)
    public void delIntToString(Object value) throws DmcValueException {
        mycore.delIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1590)
    public void delIntToString(Integer value){
        mycore.delIntToString(value);
    }

    /**
     * @return A COPY of the collection of IntegerToString objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1616)
    @SuppressWarnings("unchecked")
    public HashMap<Integer,IntegerToString> getIntToStringCopy(){
        DmcAttribute<?> attr = mycore.get(ObjWithRefsDMO.__intToString);
        if (attr == null)
            return(new HashMap<Integer,IntegerToString>());
        
        HashMap<Integer,IntegerToString> rc = new HashMap<Integer,IntegerToString>(attr.getMVSize());
        
        Iterator<IntegerToString> it = (Iterator<IntegerToString>) attr.getMV();
        while(it.hasNext()){
            IntegerToString obj = it.next();
            rc.put((Integer)obj.getKey(),obj);
        }
        
        return(rc);
    }

    /**
     * Removes the intToString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1656)
    public void remIntToString(){
        mycore.remIntToString();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remName(){
        mycore.remName();
    }


}
