package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:279)
import java.io.Serializable;                                                // Always required
import java.util.*;                                                         // Always required
import org.dmd.dmc.DmcAttribute;                                            // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                        // Alternative type for AttributeID values
import org.dmd.dmc.DmcNamedObjectIF;                                        // Named object
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                            // Required for object slicing
import org.dmd.dmc.DmcValueException;                                       // Any attributes
import org.dmd.dmc.types.AttributeID;                                       // Primitive type and !auxiliary class
import org.dmd.dmc.types.IntegerToString;                                   // Primitive type and !auxiliary class
import org.dmd.dmc.types.StringName;                                        // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                             // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;                           // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeAttributeIDSET;                   // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerToStringMAP;               // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;                         // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                     // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                         // Required type
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                     // Type specific set/add
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMAP;         // Reference type
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMV;          // Reference type
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFSV;          // Reference type
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                   // Helper class

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class ObjWithRefsDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ObjWithRefs";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __attrIDs = new DmcAttributeInfo("attrIDs",10406,"AttributeID",ValueTypeEnum.HASHSET,false);
    public final static DmcAttributeInfo __intToString = new DmcAttributeInfo("intToString",10080,"IntegerToString",ValueTypeEnum.HASHMAPPED,false);
    public final static DmcAttributeInfo __mvString = new DmcAttributeInfo("mvString",10141,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objRef = new DmcAttributeInfo("objRef",10403,"ObjWithRefs",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objRefHM = new DmcAttributeInfo("objRefHM",10405,"ObjWithRefs",ValueTypeEnum.HASHMAPPED,false);
    public final static DmcAttributeInfo __objRefMV = new DmcAttributeInfo("objRefMV",10404,"ObjWithRefs",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10140,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__attrIDs.id,__attrIDs);
        _ImAp.put(__intToString.id,__intToString);
        _ImAp.put(__mvString.id,__mvString);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__objRef.id,__objRef);
        _ImAp.put(__objRefHM.id,__objRefHM);
        _ImAp.put(__objRefMV.id,__objRefMV);
        _ImAp.put(__svString.id,__svString);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__attrIDs.name,__attrIDs);
        _SmAp.put(__intToString.name,__intToString);
        _SmAp.put(__mvString.name,__mvString);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__objRef.name,__objRef);
        _SmAp.put(__objRefHM.name,__objRefHM);
        _SmAp.put(__objRefMV.name,__objRefMV);
        _SmAp.put(__svString.name,__svString);
    }

    public ObjWithRefsDMO() {
        super("ObjWithRefs");
    }

    protected ObjWithRefsDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ObjWithRefsDMO getNew(){
        ObjWithRefsDMO rc = new ObjWithRefsDMO();
        return(rc);
    }

    @Override
    public ObjWithRefsDMO getSlice(DmcSliceInfo info){
        ObjWithRefsDMO rc = new ObjWithRefsDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ObjWithRefsDMO(DmcTypeModifierMV mods) {
        super("ObjWithRefs");
        modrec(true);
        setModifier(mods);
    }

    public ObjWithRefsDMO getModificationRecorder(){
        ObjWithRefsDMO rc = new ObjWithRefsDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:674)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ObjWithRefsDMO){
            return( getObjectName().equals( ((ObjWithRefsDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public String getSvString(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setSvString(String value) {
        DmcAttribute<?> attr = get(__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(__svString);
        
        try{
            attr.set(value);
            set(__svString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setSvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(__svString);
        
        attr.set(value);
        set(__svString,attr);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remSvString(){
         rem(__svString);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:511)
    public ObjWithRefsREF getObjRef(){
        DmcTypeObjWithRefsREFSV attr = (DmcTypeObjWithRefsREFSV) get(__objRef);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to ObjWithRefs without attempting lazy resolution (if turned on).
     */
    public ObjWithRefsREF getObjRefREF(){
        DmcTypeObjWithRefsREFSV attr = (DmcTypeObjWithRefsREFSV) get(__objRef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets objRef to the specified value.
     * @param value ObjWithRefsDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:564)
    public void setObjRef(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(__objRef);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSV(__objRef);
        
        try{
            attr.set(value);
            set(__objRef,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets objRef to the specified value.
     * @param value A value compatible with DmcTypeObjWithRefsREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setObjRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objRef);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSV(__objRef);
        
        attr.set(value);
        set(__objRef,attr);
    }

    /**
     * Removes the objRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remObjRef(){
         rem(__objRef);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:743)
    public Iterator<ObjWithRefsREF> getObjRefMV(){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(__objRefMV);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ObjWithRefsREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:763)
    public Iterator<ObjWithRefsREF> getObjRefMVREFs(){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(__objRefMV);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another objRefMV to the specified value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:778)
    public DmcAttribute<?> addObjRefMV(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(__objRefMV);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMV(__objRefMV);
        
        try{
            setLastValue(attr.add(value));
            add(__objRefMV,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another objRefMV value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:884)
    public DmcAttribute<?> addObjRefMV(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objRefMV);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMV(__objRefMV);
        
        setLastValue(attr.add(value));
        add(__objRefMV,attr);
        return(attr);
    }

    /**
     * Returns the number of values in objRefMV
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public int getObjRefMVSize(){
        DmcAttribute<?> attr = get(__objRefMV);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a objRefMV value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:931)
    public DmcAttribute<?> delObjRefMV(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__objRefMV, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the objRefMV attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:961)
    public void remObjRefMV(){
         rem(__objRefMV);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1000)
    @SuppressWarnings("unchecked")
    public Iterator<ObjWithRefsREF> getObjRefHM(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(__objRefHM);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ObjWithRefsREFs without attempting lazy resolution (if it's turned on).
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1030)
    @SuppressWarnings("unchecked")
    public Iterator<ObjWithRefsREF> getObjRefHMREFs(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(__objRefHM);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The ObjWithRefs associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1064)
    public ObjWithRefsREF getObjRefHM(Object key){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(__objRefHM);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another objRefHM value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1095)
    public DmcAttribute<?> addObjRefHM(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objRefHM);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(__objRefHM);
        
        setLastValue(attr.add(value));
        add(__objRefHM,attr);
        return(attr);
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1111)
    public DmcAttribute<?> addObjRefHM(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(__objRefHM);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(__objRefHM);
        
        try{
            setLastValue(attr.add(value));
            add(__objRefHM,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delObjRefHM(Object value) throws DmcValueException {
        return(del(__objRefHM, value));
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delObjRefHM(ObjWithRefsDMO value){
        DmcAttribute<?> rc = null;
        rc = del(__objRefHM, value);
        return(rc);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1227)
    public void remObjRefHM(){
         rem(__objRefHM);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:800)
    public Iterator<String> getMvString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__mvString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:812)
    public String getNthMvString(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__mvString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:825)
    public DmcAttribute<?> addMvString(String value) {
        DmcAttribute<?> attr = get(__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(__mvString);
        
        try{
            setLastValue(attr.add(value));
            add(__mvString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public boolean mvStringContains(String value) {
        DmcAttribute<?> attr = get(__mvString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:884)
    public DmcAttribute<?> addMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(__mvString);
        
        setLastValue(attr.add(value));
        add(__mvString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public int getMvStringSize(){
        DmcAttribute<?> attr = get(__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:943)
    public DmcAttribute<?> delMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__mvString), value);
        else
            attr = del(__mvString, value);
        
        return(attr);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:961)
    public void remMvString(){
         rem(__mvString);
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1046)
    public Iterator<IntegerToString> getIntToString(){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(__intToString);
        if (attr == null)
            return( ((List<IntegerToString>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The IntegerToString associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1078)
    public IntegerToString getIntToString(Object key){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(__intToString);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another intToString value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1095)
    public DmcAttribute<?> addIntToString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__intToString);
        if (attr == null)
            attr = new DmcTypeIntegerToStringMAP(__intToString);
        
        setLastValue(attr.add(value));
        add(__intToString,attr);
        return(attr);
    }

    /**
     * Adds another intToString value.
     * @param value IntegerToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1132)
    public DmcAttribute<?> addIntToString(IntegerToString value) {
        DmcAttribute<?> attr = get(__intToString);
        if (attr == null)
            attr = new DmcTypeIntegerToStringMAP(__intToString);
        
        try{
            setLastValue(attr.add(value));
            add(__intToString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a intToString value.
     * @param key The key of the IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1193)
    public DmcAttribute<?> delIntToString(Object key) throws DmcValueException {
        DmcAttribute<?> attr = del(__intToString, key);
        return(attr);
    }

    /**
     * Deletes a intToString value.
     * @param key The key of the IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1203)
    public DmcAttribute<?> delIntToString(Integer key){
        return(del(__intToString, key));
    }

    /**
     * Removes the intToString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1227)
    public void remIntToString(){
         rem(__intToString);
    }

    /**
     * @return An Iterator of AttributeID objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:800)
    public Iterator<AttributeID> getAttrIDs(){
        DmcTypeAttributeIDSET attr = (DmcTypeAttributeIDSET) get(__attrIDs);
        if (attr == null)
            return( ((List<AttributeID>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth AttributeID value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:812)
    public AttributeID getNthAttrIDs(int i){
        DmcTypeAttributeIDSET attr = (DmcTypeAttributeIDSET) get(__attrIDs);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another attrIDs to the specified value.
     * @param value AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:825)
    public DmcAttribute<?> addAttrIDs(AttributeID value) {
        DmcAttribute<?> attr = get(__attrIDs);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(__attrIDs);
        
        try{
            setLastValue(attr.add(value));
            add(__attrIDs,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another attrIDs to the specified value.
     * @param value AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:846)
    public DmcAttribute<?> addAttrIDs(DmcAttributeInfo value) {
        DmcAttribute<?> attr = get(__attrIDs);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(__attrIDs);
        
        try{
            setLastValue(attr.add(value));
            add(__attrIDs,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified AttributeID.
     * @param value AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public boolean attrIDsContains(AttributeID value) {
        DmcAttribute<?> attr = get(__attrIDs);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another attrIDs value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:884)
    public DmcAttribute<?> addAttrIDs(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__attrIDs);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(__attrIDs);
        
        setLastValue(attr.add(value));
        add(__attrIDs,attr);
        return(attr);
    }

    /**
     * Returns the number of values in attrIDs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public int getAttrIDsSize(){
        DmcAttribute<?> attr = get(__attrIDs);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a attrIDs value.
     * @param value The AttributeID to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:943)
    public DmcAttribute<?> delAttrIDs(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__attrIDs);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeIDSET(__attrIDs), value);
        else
            attr = del(__attrIDs, value);
        
        return(attr);
    }

    /**
     * Removes the attrIDs attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:961)
    public void remAttrIDs(){
         rem(__attrIDs);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        try{
            attr.set(value);
            set(__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remName(){
         rem(__name);
    }




}
