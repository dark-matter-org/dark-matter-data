package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                                        // Always required - (GenUtility.java:220)
import java.util.*;                                                                 // Always required if we have any MV attributes - (GenUtility.java:215)
import java.util.Date;                                                              // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcAttributeInfo;                                                // Alternative type for AttributeID values - (GenUtility.java:291)
import org.dmd.dmc.DmcNamedObjectIF;                                                // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcObjectName;                                                   // Alternative type for NameContainer values - (GenUtility.java:291)
import org.dmd.dmc.DmcOmni;                                                         // Lazy resolution - (GenUtility.java:328)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.AttributeID;                                               // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dmc.types.IntegerToString;                                           // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dmc.types.NameContainer;                                             // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dmc.types.StringName;                                                // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeAttributeIDSET;                           // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeDateSET;                                  // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeIntegerToStringMAP;                       // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeNameContainerSET;                         // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringMV;                                 // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringNameSET;                            // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                             // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSET;                                // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                 // Required type - (GenUtility.java:324)
import org.dmd.dmt.shared.generated.dmo.BaseObjDMO;                                 // Base class - (GenUtility.java:351)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;                       // Type specific set/add - (GenUtility.java:303)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                             // Type specific set/add - (GenUtility.java:303)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                    // Type specific set/add - (GenUtility.java:303)
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;                              // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dmt.shared.generated.types.DmcTypeClientCountFilterREFMV;            // Reference type - (GenUtility.java:296)
import org.dmd.dmt.shared.generated.types.DmcTypeDmtTestEnumMV;                     // Required type - (GenUtility.java:324)
import org.dmd.dmt.shared.generated.types.DmcTypeDmtTestEnumSET;                    // Required type - (GenUtility.java:324)
import org.dmd.dmt.shared.generated.types.DmcTypeDmtTestEnumSV;                     // Required type - (GenUtility.java:324)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMAP;                 // Reference type - (GenUtility.java:296)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMV;                  // Reference type - (GenUtility.java:296)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFSV;                  // Reference type - (GenUtility.java:296)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationMV;                    // Required type - (GenUtility.java:324)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationSV;                    // Required type - (GenUtility.java:324)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFMV;         // Reference type - (GenUtility.java:296)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                           // Helper class - (GenUtility.java:331)
import org.dmd.dmt.shared.generated.types.SomeRelation;                             // Extended reference type - (GenUtility.java:322)

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ObjWithRefsDMO  extends BaseObjDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ObjWithRefs";


    static {
    }

    public ObjWithRefsDMO() {
        super("ObjWithRefs");
    }

    protected ObjWithRefsDMO(String oc) {
        super(oc);
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
        ObjWithRefsDMO rc = new ObjWithRefsDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof ObjWithRefsDMO){
            return( getObjectName().equals( ((ObjWithRefsDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        StringName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getAnotherSVString(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtDMSAG.__anotherSVString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets anotherSVString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setAnotherSVString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__anotherSVString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__anotherSVString);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__anotherSVString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets anotherSVString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setAnotherSVString(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtDMSAG.__anotherSVString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__anotherSVString);
        
        attr.set(value);
        set(DmtDMSAG.__anotherSVString,attr);
    }

    /**
     * Removes the anotherSVString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remAnotherSVString(){
         rem(DmtDMSAG.__anotherSVString);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:645)
    public ObjWithRefsREF getObjRef(){
        DmcTypeObjWithRefsREFSV attr = (DmcTypeObjWithRefsREFSV) get(DmtDMSAG.__objRef);
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
        DmcTypeObjWithRefsREFSV attr = (DmcTypeObjWithRefsREFSV) get(DmtDMSAG.__objRef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets objRef to the specified value.
     * @param value ObjWithRefsDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:699)
    public void setObjRef(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRef);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSV(DmtDMSAG.__objRef);
        else
            ((DmcTypeObjWithRefsREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmtDMSAG.__objRef,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets objRef to the specified value.
     * @param value A value compatible with DmcTypeObjWithRefsREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setObjRef(Object value) throws DmcValueException {
        DmcTypeObjWithRefsREFSV attr  = (DmcTypeObjWithRefsREFSV) get(DmtDMSAG.__objRef);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSV(DmtDMSAG.__objRef);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmtDMSAG.__objRef,attr);
    }

    /**
     * Removes the objRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remObjRef(){
         rem(DmtDMSAG.__objRef);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public Iterator<ObjWithRefsREF> getObjRefMV(){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(DmtDMSAG.__objRefMV);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:980)
    public Iterator<ObjWithRefsREF> getObjRefMVREFs(){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(DmtDMSAG.__objRefMV);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another objRefMV to the specified value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:994)
    public DmcAttribute<?> addObjRefMV(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefMV);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMV(DmtDMSAG.__objRefMV);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__objRefMV,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addObjRefMV(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefMV);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMV(DmtDMSAG.__objRefMV);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__objRefMV,attr);
        return(attr);
    }

    /**
     * Returns the number of values in objRefMV
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getObjRefMVSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefMV);
        if (attr == null){
            if (DmtDMSAG.__objRefMV.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__objRefMV.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a objRefMV value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delObjRefMV(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefMV);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMV(DmtDMSAG.__objRefMV), value);
        else
            attr = del(DmtDMSAG.__objRefMV, value);
        
        return(attr);
    }

    /**
     * Removes the objRefMV attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remObjRefMV(){
         rem(DmtDMSAG.__objRefMV);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1383)
    @SuppressWarnings("unchecked")
    public Iterator<ObjWithRefsREF> getObjRefHM(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1413)
    @SuppressWarnings("unchecked")
    public Iterator<ObjWithRefsREF> getObjRefHMREFs(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The ObjWithRefs associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1447)
    public ObjWithRefsREF getObjRefHM(Object key){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another objRefHM value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1499)
    public DmcAttribute<?> addObjRefHM(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__objRefHM,attr);
        return(attr);
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1515)
    public DmcAttribute<?> addObjRefHM(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__objRefHM,attr);
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
    public DmcAttribute<?> delObjRefHM(Object value) throws DmcValueException {
        return(del(DmtDMSAG.__objRefHM, value));
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    public DmcAttribute<?> delObjRefHM(ObjWithRefsDMO value){
        return(del(DmtDMSAG.__objRefHM, value));
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1670)
    public void remObjRefHM(){
         rem(DmtDMSAG.__objRefHM);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<String> getMvString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public String getNthMvString(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addMvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__mvString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvString,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean mvStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__mvString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getMvStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null){
            if (DmtDMSAG.__mvString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__mvString), value);
        else
            attr = del(DmtDMSAG.__mvString, value);
        
        return(attr);
    }

    /**
     * Deletes a mvString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delMvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__mvString), value);
        else
            attr = del(DmtDMSAG.__mvString, value);
        
        return(attr);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remMvString(){
         rem(DmtDMSAG.__mvString);
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1429)
    public Iterator<IntegerToString> getIntToString(){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(DmtDMSAG.__intToString);
        if (attr == null)
            return( ((List<IntegerToString>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The IntegerToString associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1461)
    public IntegerToString getIntToString(Object key){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(DmtDMSAG.__intToString);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another intToString value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1499)
    public DmcAttribute<?> addIntToString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToString);
        if (attr == null)
            attr = new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__intToString,attr);
        return(attr);
    }

    /**
     * Adds another intToString value.
     * @param value IntegerToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1536)
    public DmcAttribute<?> addIntToString(IntegerToString value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToString);
        if (attr == null)
            attr = new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__intToString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a intToString value.
     * @param key The key of the IntegerToString to be deleted from the map of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1598)
    public DmcAttribute<?> delIntToString(Object key){
        DmcAttribute<?> attr = get(DmtDMSAG.__intToString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToString), key);
        if (attr == null)
            return(null);
        
        attr = del(DmtDMSAG.__intToString, key);
        
        return(attr);
    }

    /**
     * Deletes a intToString value.
     * @param key the Integer key value
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1616)
    public DmcAttribute<?> delIntToString(Integer key) {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToString), key);
        if (attr == null)
            return(null);
        
        attr = del(DmtDMSAG.__intToString, key);
        
        return(attr);
    }

    /**
     * Removes the intToString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1670)
    public void remIntToString(){
         rem(DmtDMSAG.__intToString);
    }

    /**
     * @return An Iterator of AttributeID objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<AttributeID> getAttrIDs(){
        DmcTypeAttributeIDSET attr = (DmcTypeAttributeIDSET) get(DmtDMSAG.__attrIDs);
        if (attr == null)
            return( ((List<AttributeID>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth AttributeID value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public AttributeID getNthAttrIDs(int i){
        DmcTypeAttributeIDSET attr = (DmcTypeAttributeIDSET) get(DmtDMSAG.__attrIDs);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another attrIDs to the specified value.
     * @param value AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addAttrIDs(AttributeID value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__attrIDs);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(DmtDMSAG.__attrIDs);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__attrIDs,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1182)
    public DmcAttribute<?> addAttrIDs(DmcAttributeInfo value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__attrIDs);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(DmtDMSAG.__attrIDs);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__attrIDs,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean attrIDsContains(AttributeID value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__attrIDs);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcAttributeInfo.
     * @param value DmcAttributeInfo
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1217)
    public boolean attrIDsContains(DmcAttributeInfo value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__attrIDs);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another attrIDs value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addAttrIDs(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__attrIDs);
        if (attr == null)
            attr = new DmcTypeAttributeIDSET(DmtDMSAG.__attrIDs);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__attrIDs,attr);
        return(attr);
    }

    /**
     * Returns the number of values in attrIDs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getAttrIDsSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__attrIDs);
        if (attr == null){
            if (DmtDMSAG.__attrIDs.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__attrIDs.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a attrIDs value.
     * @param value The AttributeID to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delAttrIDs(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__attrIDs);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeIDSET(DmtDMSAG.__attrIDs), value);
        else
            attr = del(DmtDMSAG.__attrIDs, value);
        
        return(attr);
    }

    /**
     * Deletes a attrIDs from the specified value.
     * @param value AttributeID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delAttrIDs(AttributeID value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__attrIDs);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeIDSET(DmtDMSAG.__attrIDs), value);
        else
            attr = del(DmtDMSAG.__attrIDs, value);
        
        return(attr);
    }

    /**
     * Removes the attrIDs attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remAttrIDs(){
         rem(DmtDMSAG.__attrIDs);
    }

    /**
     * @return An Iterator of Date objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<Date> getHsDate(){
        DmcTypeDateSET attr = (DmcTypeDateSET) get(DmtDMSAG.__hsDate);
        if (attr == null)
            return( ((List<Date>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Date value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public Date getNthHsDate(int i){
        DmcTypeDateSET attr = (DmcTypeDateSET) get(DmtDMSAG.__hsDate);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addHsDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        if (attr == null)
            attr = new DmcTypeDateSET(DmtDMSAG.__hsDate);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Date.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean hsDateContains(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addHsDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        if (attr == null)
            attr = new DmcTypeDateSET(DmtDMSAG.__hsDate);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsDate,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsDate
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getHsDateSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        if (attr == null){
            if (DmtDMSAG.__hsDate.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsDate.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delHsDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateSET(DmtDMSAG.__hsDate), value);
        else
            attr = del(DmtDMSAG.__hsDate, value);
        
        return(attr);
    }

    /**
     * Deletes a hsDate from the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delHsDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateSET(DmtDMSAG.__hsDate), value);
        else
            attr = del(DmtDMSAG.__hsDate, value);
        
        return(attr);
    }

    /**
     * Removes the hsDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remHsDate(){
         rem(DmtDMSAG.__hsDate);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<String> getHsString(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__hsString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public String getNthHsString(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__hsString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addHsString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__hsString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsString,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean hsStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addHsString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__hsString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getHsStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        if (attr == null){
            if (DmtDMSAG.__hsString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delHsString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__hsString), value);
        else
            attr = del(DmtDMSAG.__hsString, value);
        
        return(attr);
    }

    /**
     * Deletes a hsString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delHsString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__hsString), value);
        else
            attr = del(DmtDMSAG.__hsString, value);
        
        return(attr);
    }

    /**
     * Removes the hsString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remHsString(){
         rem(DmtDMSAG.__hsString);
    }

    /**
     * @return An Iterator of DmtTestEnum objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<DmtTestEnum> getHsTestEnum(){
        DmcTypeDmtTestEnumSET attr = (DmcTypeDmtTestEnumSET) get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return( ((List<DmtTestEnum>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmtTestEnum value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmtTestEnum getNthHsTestEnum(int i){
        DmcTypeDmtTestEnumSET attr = (DmcTypeDmtTestEnumSET) get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsTestEnum to the specified value.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addHsTestEnum(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            attr = new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsTestEnum,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmtTestEnum.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean hsTestEnumContains(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addHsTestEnum(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            attr = new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsTestEnum,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getHsTestEnumSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        if (attr == null){
            if (DmtDMSAG.__hsTestEnum.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsTestEnum.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsTestEnum value.
     * @param value The DmtTestEnum to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delHsTestEnum(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum), value);
        else
            attr = del(DmtDMSAG.__hsTestEnum, value);
        
        return(attr);
    }

    /**
     * Deletes a hsTestEnum from the specified value.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delHsTestEnum(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum), value);
        else
            attr = del(DmtDMSAG.__hsTestEnum, value);
        
        return(attr);
    }

    /**
     * Removes the hsTestEnum attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remHsTestEnum(){
         rem(DmtDMSAG.__hsTestEnum);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<NameContainer> getHsNames(){
        DmcTypeNameContainerSET attr = (DmcTypeNameContainerSET) get(DmtDMSAG.__hsNames);
        if (attr == null)
            return( ((List<NameContainer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth NameContainer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public NameContainer getNthHsNames(int i){
        DmcTypeNameContainerSET attr = (DmcTypeNameContainerSET) get(DmtDMSAG.__hsNames);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsNames to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addHsNames(NameContainer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNames);
        if (attr == null)
            attr = new DmcTypeNameContainerSET(DmtDMSAG.__hsNames);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsNames,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another hsNames to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1182)
    public DmcAttribute<?> addHsNames(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNames);
        if (attr == null)
            attr = new DmcTypeNameContainerSET(DmtDMSAG.__hsNames);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsNames,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified NameContainer.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean hsNamesContains(NameContainer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNames);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcObjectName.
     * @param value DmcObjectName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1217)
    public boolean hsNamesContains(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNames);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsNames value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addHsNames(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNames);
        if (attr == null)
            attr = new DmcTypeNameContainerSET(DmtDMSAG.__hsNames);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsNames,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsNames
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getHsNamesSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNames);
        if (attr == null){
            if (DmtDMSAG.__hsNames.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsNames.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsNames value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delHsNames(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNames);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerSET(DmtDMSAG.__hsNames), value);
        else
            attr = del(DmtDMSAG.__hsNames, value);
        
        return(attr);
    }

    /**
     * Deletes a hsNames from the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delHsNames(NameContainer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNames);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerSET(DmtDMSAG.__hsNames), value);
        else
            attr = del(DmtDMSAG.__hsNames, value);
        
        return(attr);
    }

    /**
     * Removes the hsNames attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remHsNames(){
         rem(DmtDMSAG.__hsNames);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<String> getNonperString(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__nonperString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public String getNthNonperString(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__nonperString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another nonperString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addNonperString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__nonperString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__nonperString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__nonperString,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean nonperStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__nonperString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another nonperString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addNonperString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__nonperString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__nonperString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__nonperString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in nonperString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getNonperStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__nonperString);
        if (attr == null){
            if (DmtDMSAG.__nonperString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__nonperString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a nonperString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delNonperString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__nonperString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__nonperString), value);
        else
            attr = del(DmtDMSAG.__nonperString, value);
        
        return(attr);
    }

    /**
     * Deletes a nonperString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delNonperString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__nonperString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__nonperString), value);
        else
            attr = del(DmtDMSAG.__nonperString, value);
        
        return(attr);
    }

    /**
     * Removes the nonperString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remNonperString(){
         rem(DmtDMSAG.__nonperString);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<String> getTransString(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__transString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public String getNthTransString(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__transString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another transString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addTransString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__transString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__transString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__transString,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean transStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__transString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another transString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addTransString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__transString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__transString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__transString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in transString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getTransStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__transString);
        if (attr == null){
            if (DmtDMSAG.__transString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__transString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a transString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delTransString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__transString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__transString), value);
        else
            attr = del(DmtDMSAG.__transString, value);
        
        return(attr);
    }

    /**
     * Deletes a transString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delTransString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__transString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__transString), value);
        else
            attr = del(DmtDMSAG.__transString, value);
        
        return(attr);
    }

    /**
     * Removes the transString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remTransString(){
         rem(DmtDMSAG.__transString);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<String> getIndexedString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__indexedString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public String getNthIndexedString(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__indexedString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the value at the specified index.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1149)
    public DmcAttribute<?> setNthIndexedString(int index, String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__indexedString, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeStringMV(DmtDMSAG.__indexedString);
        }
        
        try{
            String previous = (String) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__indexedString,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean indexedStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another indexedString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addIndexedString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__indexedString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__indexedString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in indexedString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getIndexedStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        if (attr == null){
            if (DmtDMSAG.__indexedString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__indexedString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a indexedString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delIndexedString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__indexedString), value);
        else
            attr = del(DmtDMSAG.__indexedString, value);
        
        return(attr);
    }

    /**
     * Deletes a indexedString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delIndexedString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__indexedString), value);
        else
            attr = del(DmtDMSAG.__indexedString, value);
        
        return(attr);
    }

    /**
     * Removes the indexedString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remIndexedString(){
         rem(DmtDMSAG.__indexedString);
    }

    /**
     * @return The nth ObjWithRefs value and attempt lazy resolution if it's on.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1028)
    public ObjWithRefsREF getNthIndexedObjRef(int i){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(DmtDMSAG.__indexedObjRef);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getMVnth(i));
    }

    /**
     * @return The nth ObjWithRefs value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1047)
    public ObjWithRefsREF getNthIndexedObjRefREF(int i){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(DmtDMSAG.__indexedObjRef);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the indexedObjRef value at the specified index.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1061)
    public DmcAttribute<?> setNthIndexedObjRef(int index, ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedObjRef);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__indexedObjRef, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeObjWithRefsREFMV(DmtDMSAG.__indexedObjRef);
        }
        
        try{
            ObjWithRefsREF previous = (ObjWithRefsREF) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__indexedObjRef,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another indexedObjRef value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addIndexedObjRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedObjRef);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMV(DmtDMSAG.__indexedObjRef);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__indexedObjRef,attr);
        return(attr);
    }

    /**
     * Returns the number of values in indexedObjRef
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getIndexedObjRefSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedObjRef);
        if (attr == null){
            if (DmtDMSAG.__indexedObjRef.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__indexedObjRef.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a indexedObjRef value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delIndexedObjRef(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedObjRef);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMV(DmtDMSAG.__indexedObjRef), value);
        else
            attr = del(DmtDMSAG.__indexedObjRef, value);
        
        return(attr);
    }

    /**
     * Removes the indexedObjRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remIndexedObjRef(){
         rem(DmtDMSAG.__indexedObjRef);
    }

    /**
     * @return The nth TestBasicObjectFixed value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1015)
    public TestBasicObjectFixedDMO getNthIndexedPlainObjRef(int i){
        DmcTypeTestBasicObjectFixedREFMV attr = (DmcTypeTestBasicObjectFixedREFMV) get(DmtDMSAG.__indexedPlainObjRef);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the indexedPlainObjRef value at the specified index.
     * @param value TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1061)
    public DmcAttribute<?> setNthIndexedPlainObjRef(int index, TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedPlainObjRef);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__indexedPlainObjRef, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__indexedPlainObjRef);
        }
        
        try{
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__indexedPlainObjRef, index ,attr, null);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another indexedPlainObjRef value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addIndexedPlainObjRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedPlainObjRef);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__indexedPlainObjRef);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__indexedPlainObjRef,attr);
        return(attr);
    }

    /**
     * Returns the number of values in indexedPlainObjRef
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getIndexedPlainObjRefSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedPlainObjRef);
        if (attr == null){
            if (DmtDMSAG.__indexedPlainObjRef.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__indexedPlainObjRef.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a indexedPlainObjRef value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public DmcAttribute<?> delIndexedPlainObjRef(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedPlainObjRef);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__indexedPlainObjRef), value);
        else
            attr = del(DmtDMSAG.__indexedPlainObjRef, value);
        
        return(attr);
    }

    /**
     * Removes the indexedPlainObjRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remIndexedPlainObjRef(){
         rem(DmtDMSAG.__indexedPlainObjRef);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public Iterator<TestBasicObjectFixedDMO> getPlainObjRef(){
        DmcTypeTestBasicObjectFixedREFMV attr = (DmcTypeTestBasicObjectFixedREFMV) get(DmtDMSAG.__plainObjRef);
        if (attr == null)
            return( ((List<TestBasicObjectFixedDMO>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another plainObjRef to the specified value.
     * @param value TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:994)
    public DmcAttribute<?> addPlainObjRef(TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__plainObjRef);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__plainObjRef);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__plainObjRef,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another plainObjRef value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addPlainObjRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__plainObjRef);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__plainObjRef);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__plainObjRef,attr);
        return(attr);
    }

    /**
     * Returns the number of values in plainObjRef
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getPlainObjRefSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__plainObjRef);
        if (attr == null){
            if (DmtDMSAG.__plainObjRef.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__plainObjRef.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a plainObjRef value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public DmcAttribute<?> delPlainObjRef(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__plainObjRef);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__plainObjRef), value);
        else
            attr = del(DmtDMSAG.__plainObjRef, value);
        
        return(attr);
    }

    /**
     * Removes the plainObjRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remPlainObjRef(){
         rem(DmtDMSAG.__plainObjRef);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public DmtTestEnum getSvTestEnum(){
        DmcTypeDmtTestEnumSV attr = (DmcTypeDmtTestEnumSV) get(DmtDMSAG.__svTestEnum);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svTestEnum to the specified value.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSvTestEnum(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svTestEnum);
        if (attr == null)
            attr = new DmcTypeDmtTestEnumSV(DmtDMSAG.__svTestEnum);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svTestEnum,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svTestEnum to the specified value.
     * @param value A value compatible with DmcTypeDmtTestEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSvTestEnum(Object value) throws DmcValueException {
        DmcTypeDmtTestEnumSV attr  = (DmcTypeDmtTestEnumSV) get(DmtDMSAG.__svTestEnum);
        if (attr == null)
            attr = new DmcTypeDmtTestEnumSV(DmtDMSAG.__svTestEnum);
        
        attr.set(value);
        set(DmtDMSAG.__svTestEnum,attr);
    }

    /**
     * Removes the svTestEnum attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSvTestEnum(){
         rem(DmtDMSAG.__svTestEnum);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isSvBoolean(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmtDMSAG.__svBoolean);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__svBoolean);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svBoolean,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSvBoolean(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmtDMSAG.__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__svBoolean);
        
        attr.set(value);
        set(DmtDMSAG.__svBoolean,attr);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSvBoolean(){
         rem(DmtDMSAG.__svBoolean);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isOnOff(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmtDMSAG.__onOff);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets onOff to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setOnOff(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__onOff);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__onOff);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__onOff,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets onOff to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setOnOff(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmtDMSAG.__onOff);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__onOff);
        
        attr.set(value);
        set(DmtDMSAG.__onOff,attr);
    }

    /**
     * Removes the onOff attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remOnOff(){
         rem(DmtDMSAG.__onOff);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isEnabledDisabled(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmtDMSAG.__enabledDisabled);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets enabledDisabled to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setEnabledDisabled(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__enabledDisabled);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__enabledDisabled);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__enabledDisabled,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets enabledDisabled to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setEnabledDisabled(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmtDMSAG.__enabledDisabled);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__enabledDisabled);
        
        attr.set(value);
        set(DmtDMSAG.__enabledDisabled,attr);
    }

    /**
     * Removes the enabledDisabled attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remEnabledDisabled(){
         rem(DmtDMSAG.__enabledDisabled);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:724)
    /**
     * @return The SomeRelation, attempting lazy resolution (if it's turned on).
     */
    public SomeRelation getSomeRelationSV(){
        DmcTypeSomeRelationSV attr = (DmcTypeSomeRelationSV) get(DmtDMSAG.__someRelationSV);
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:753)
    /**
     * @return The SomeRelation without attempting lazy resolution (if it's turned on).
     */
    public SomeRelation getSomeRelationSVREF(){
        DmcTypeSomeRelationSV attr = (DmcTypeSomeRelationSV) get(DmtDMSAG.__someRelationSV);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets someRelationSV to the specified value.
     * @param value SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSomeRelationSV(SomeRelation value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationSV);
        if (attr == null)
            attr = new DmcTypeSomeRelationSV(DmtDMSAG.__someRelationSV);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__someRelationSV,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets someRelationSV to the specified value.
     * @param value A value compatible with DmcTypeSomeRelationSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSomeRelationSV(Object value) throws DmcValueException {
        DmcTypeSomeRelationSV attr  = (DmcTypeSomeRelationSV) get(DmtDMSAG.__someRelationSV);
        if (attr == null)
            attr = new DmcTypeSomeRelationSV(DmtDMSAG.__someRelationSV);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmtDMSAG.__someRelationSV,attr);
    }

    /**
     * Removes the someRelationSV attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSomeRelationSV(){
         rem(DmtDMSAG.__someRelationSV);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public Iterator<SomeRelation> getSomeRelationMV(){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__someRelationMV);
        if (attr == null)
            return( ((List<SomeRelation>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<SomeRelation>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of SomeRelationREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:980)
    public Iterator<SomeRelation> getSomeRelationMVREFs(){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__someRelationMV);
        if (attr == null)
            return( ((List<SomeRelation>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another someRelationMV to the specified value.
     * @param value SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:994)
    public DmcAttribute<?> addSomeRelationMV(SomeRelation value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationMV);
        if (attr == null)
            attr = new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationMV);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__someRelationMV,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another someRelationMV value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addSomeRelationMV(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationMV);
        if (attr == null)
            attr = new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationMV);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__someRelationMV,attr);
        return(attr);
    }

    /**
     * Returns the number of values in someRelationMV
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getSomeRelationMVSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationMV);
        if (attr == null){
            if (DmtDMSAG.__someRelationMV.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__someRelationMV.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a someRelationMV value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delSomeRelationMV(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationMV);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationMV), value);
        else
            attr = del(DmtDMSAG.__someRelationMV, value);
        
        return(attr);
    }

    /**
     * Removes the someRelationMV attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remSomeRelationMV(){
         rem(DmtDMSAG.__someRelationMV);
    }

    /**
     * @return The nth SomeRelation value and attempt lazy resolution if it's on.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1028)
    public SomeRelation getNthSomeRelationMVI(int i){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__someRelationMVI);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getMVnth(i));
    }

    /**
     * @return The nth SomeRelation value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1047)
    public SomeRelation getNthSomeRelationMVIREF(int i){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__someRelationMVI);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the someRelationMVI value at the specified index.
     * @param value SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1061)
    public DmcAttribute<?> setNthSomeRelationMVI(int index, SomeRelation value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationMVI);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__someRelationMVI, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationMVI);
        }
        
        try{
            SomeRelation previous = (SomeRelation) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__someRelationMVI,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another someRelationMVI value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addSomeRelationMVI(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationMVI);
        if (attr == null)
            attr = new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationMVI);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__someRelationMVI,attr);
        return(attr);
    }

    /**
     * Returns the number of values in someRelationMVI
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getSomeRelationMVISize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationMVI);
        if (attr == null){
            if (DmtDMSAG.__someRelationMVI.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__someRelationMVI.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a someRelationMVI value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delSomeRelationMVI(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationMVI);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationMVI), value);
        else
            attr = del(DmtDMSAG.__someRelationMVI, value);
        
        return(attr);
    }

    /**
     * Removes the someRelationMVI attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remSomeRelationMVI(){
         rem(DmtDMSAG.__someRelationMVI);
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1429)
    public Iterator<IntegerToString> getIntToStringMAP(){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return( ((List<IntegerToString>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The IntegerToString associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1461)
    public IntegerToString getIntToStringMAP(Object key){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * @return The first key of the map.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1481)
    public Integer getIntToStringMAPFirstKey(){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(null);

        return(attr.firstKey());
    }

    /**
     * Adds another intToStringMAP value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1499)
    public DmcAttribute<?> addIntToStringMAP(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            attr = new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToStringMAP);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__intToStringMAP,attr);
        return(attr);
    }

    /**
     * Adds another intToStringMAP value.
     * @param value IntegerToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1536)
    public DmcAttribute<?> addIntToStringMAP(IntegerToString value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            attr = new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToStringMAP);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__intToStringMAP,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a intToStringMAP value.
     * @param key The key of the IntegerToString to be deleted from the map of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1598)
    public DmcAttribute<?> delIntToStringMAP(Object key){
        DmcAttribute<?> attr = get(DmtDMSAG.__intToStringMAP);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToStringMAP), key);
        if (attr == null)
            return(null);
        
        attr = del(DmtDMSAG.__intToStringMAP, key);
        
        return(attr);
    }

    /**
     * Deletes a intToStringMAP value.
     * @param key the Integer key value
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1616)
    public DmcAttribute<?> delIntToStringMAP(Integer key) {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToStringMAP);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToStringMAP), key);
        if (attr == null)
            return(null);
        
        attr = del(DmtDMSAG.__intToStringMAP, key);
        
        return(attr);
    }

    /**
     * Removes the intToStringMAP attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1670)
    public void remIntToStringMAP(){
         rem(DmtDMSAG.__intToStringMAP);
    }

    /**
     * @return An Iterator of StringName objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<StringName> getHsStringName(){
        DmcTypeStringNameSET attr = (DmcTypeStringNameSET) get(DmtDMSAG.__hsStringName);
        if (attr == null)
            return( ((List<StringName>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth StringName value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public StringName getNthHsStringName(int i){
        DmcTypeStringNameSET attr = (DmcTypeStringNameSET) get(DmtDMSAG.__hsStringName);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsStringName to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addHsStringName(StringName value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsStringName);
        if (attr == null)
            attr = new DmcTypeStringNameSET(DmtDMSAG.__hsStringName);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsStringName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified StringName.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean hsStringNameContains(StringName value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsStringName);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsStringName value.
     * @param value A value compatible with StringName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addHsStringName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsStringName);
        if (attr == null)
            attr = new DmcTypeStringNameSET(DmtDMSAG.__hsStringName);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsStringName,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsStringName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getHsStringNameSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsStringName);
        if (attr == null){
            if (DmtDMSAG.__hsStringName.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsStringName.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsStringName value.
     * @param value The StringName to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delHsStringName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsStringName);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringNameSET(DmtDMSAG.__hsStringName), value);
        else
            attr = del(DmtDMSAG.__hsStringName, value);
        
        return(attr);
    }

    /**
     * Deletes a hsStringName from the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delHsStringName(StringName value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsStringName);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringNameSET(DmtDMSAG.__hsStringName), value);
        else
            attr = del(DmtDMSAG.__hsStringName, value);
        
        return(attr);
    }

    /**
     * Removes the hsStringName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remHsStringName(){
         rem(DmtDMSAG.__hsStringName);
    }

    /**
     * @return The nth ClientCountFilter value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1015)
    public ClientCountFilterDMO getNthClientCountFilters(int i){
        DmcTypeClientCountFilterREFMV attr = (DmcTypeClientCountFilterREFMV) get(DmtDMSAG.__clientCountFilters);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the clientCountFilters value at the specified index.
     * @param value ClientCountFilter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1061)
    public DmcAttribute<?> setNthClientCountFilters(int index, ClientCountFilterDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__clientCountFilters);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__clientCountFilters, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeClientCountFilterREFMV(DmtDMSAG.__clientCountFilters);
        }
        
        try{
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__clientCountFilters, index ,attr, null);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another clientCountFilters value.
     * @param value A value compatible with ClientCountFilter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addClientCountFilters(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__clientCountFilters);
        if (attr == null)
            attr = new DmcTypeClientCountFilterREFMV(DmtDMSAG.__clientCountFilters);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__clientCountFilters,attr);
        return(attr);
    }

    /**
     * Returns the number of values in clientCountFilters
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getClientCountFiltersSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__clientCountFilters);
        if (attr == null){
            if (DmtDMSAG.__clientCountFilters.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__clientCountFilters.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a clientCountFilters value.
     * @param value The ClientCountFilter to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public DmcAttribute<?> delClientCountFilters(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__clientCountFilters);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeClientCountFilterREFMV(DmtDMSAG.__clientCountFilters), value);
        else
            attr = del(DmtDMSAG.__clientCountFilters, value);
        
        return(attr);
    }

    /**
     * Removes the clientCountFilters attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remClientCountFilters(){
         rem(DmtDMSAG.__clientCountFilters);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setName(Object value) throws DmcValueException {
        DmcTypeStringNameSV attr  = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getSvString(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtDMSAG.__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSvString(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        attr.set(value);
        set(DmtDMSAG.__svString,attr);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSvString(){
         rem(DmtDMSAG.__svString);
    }

    /**
     * @return An Iterator of DmtTestEnum objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<DmtTestEnum> getMvTestEnum(){
        DmcTypeDmtTestEnumMV attr = (DmcTypeDmtTestEnumMV) get(DmtDMSAG.__mvTestEnum);
        if (attr == null)
            return( ((List<DmtTestEnum>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmtTestEnum value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmtTestEnum getNthMvTestEnum(int i){
        DmcTypeDmtTestEnumMV attr = (DmcTypeDmtTestEnumMV) get(DmtDMSAG.__mvTestEnum);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvTestEnum to the specified value.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addMvTestEnum(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestEnum);
        if (attr == null)
            attr = new DmcTypeDmtTestEnumMV(DmtDMSAG.__mvTestEnum);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvTestEnum,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmtTestEnum.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean mvTestEnumContains(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestEnum);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addMvTestEnum(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestEnum);
        if (attr == null)
            attr = new DmcTypeDmtTestEnumMV(DmtDMSAG.__mvTestEnum);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvTestEnum,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getMvTestEnumSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestEnum);
        if (attr == null){
            if (DmtDMSAG.__mvTestEnum.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvTestEnum.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvTestEnum value.
     * @param value The DmtTestEnum to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delMvTestEnum(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestEnum);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmtTestEnumMV(DmtDMSAG.__mvTestEnum), value);
        else
            attr = del(DmtDMSAG.__mvTestEnum, value);
        
        return(attr);
    }

    /**
     * Deletes a mvTestEnum from the specified value.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delMvTestEnum(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestEnum);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmtTestEnumMV(DmtDMSAG.__mvTestEnum), value);
        else
            attr = del(DmtDMSAG.__mvTestEnum, value);
        
        return(attr);
    }

    /**
     * Removes the mvTestEnum attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remMvTestEnum(){
         rem(DmtDMSAG.__mvTestEnum);
    }




}
