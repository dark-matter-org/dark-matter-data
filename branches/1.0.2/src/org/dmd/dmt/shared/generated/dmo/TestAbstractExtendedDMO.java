package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:372)
import java.io.Serializable;                                                     // Always required - (GenUtility.java:201)
import java.util.*;                                                              // Always required if we have any MV attributes - (GenUtility.java:197)
import org.dmd.dmc.DmcAttribute;                                                 // Any attributes - (GenUtility.java:217)
import org.dmd.dmc.DmcObject;                                                    // Structural class - (GenUtility.java:328)
import org.dmd.dmc.DmcOmni;                                                      // Lazy resolution - (GenUtility.java:309)
import org.dmd.dmc.DmcValueException;                                            // Any attributes - (GenUtility.java:218)
import org.dmd.dmc.types.IntegerToString;                                        // Primitive type and !auxiliary class - (GenUtility.java:248)
import org.dmd.dmc.types.StringName;                                             // Primitive type and !auxiliary class - (GenUtility.java:248)
import org.dmd.dms.generated.types.DmcTypeIntegerToStringMAP;                    // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeStringNameSET;                         // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeStringSV;                              // Required type - (GenUtility.java:305)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;                    // Type specific set/add - (GenUtility.java:284)
import org.dmd.dmt.shared.generated.types.DmcTypeClientCountFilterREFMV;         // Reference type - (GenUtility.java:277)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationMV;                 // Required type - (GenUtility.java:305)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationSV;                 // Required type - (GenUtility.java:305)
import org.dmd.dmt.shared.generated.types.SomeRelation;                          // Extended reference type - (GenUtility.java:303)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class TestAbstractExtendedDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "TestAbstractExtended";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public TestAbstractExtendedDMO() {
        super("TestAbstractExtended");
    }

    protected TestAbstractExtendedDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remSomeRelationSV(){
         rem(DmtDMSAG.__someRelationSV);
    }

    /**
     * @return The nth SomeRelation value and attempt lazy resolution if it's on.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1009)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1028)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1042)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1272)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remSomeRelationMVI(){
         rem(DmtDMSAG.__someRelationMVI);
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1410)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1442)
    public IntegerToString getIntToStringMAP(Object key){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * @return The first key of the map.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1462)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1480)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1517)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1579)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1597)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1651)
    public void remIntToStringMAP(){
         rem(DmtDMSAG.__intToStringMAP);
    }

    /**
     * @return An Iterator of StringName objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1083)
    public Iterator<StringName> getHsStringName(){
        DmcTypeStringNameSET attr = (DmcTypeStringNameSET) get(DmtDMSAG.__hsStringName);
        if (attr == null)
            return( ((List<StringName>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth StringName value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1095)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1184)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1307)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remHsStringName(){
         rem(DmtDMSAG.__hsStringName);
    }

    /**
     * @return The nth ClientCountFilter value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:996)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1042)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1255)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remClientCountFilters(){
         rem(DmtDMSAG.__clientCountFilters);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remSvString(){
         rem(DmtDMSAG.__svString);
    }




}
