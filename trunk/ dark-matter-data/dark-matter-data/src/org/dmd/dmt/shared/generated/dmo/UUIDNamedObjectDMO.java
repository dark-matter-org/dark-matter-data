package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:267)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import java.util.Date;                                        // Primitive type and !auxiliary class
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                          // Always required
import org.dmd.dmc.DmcNamedObjectIF;                          // Named object
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dmc.types.UUIDName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;               // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeBooleanMV;          // Required type
import org.dmd.dms.generated.types.DmcTypeBooleanSV;          // Required type
import org.dmd.dms.generated.types.DmcTypeDateMV;             // Required type
import org.dmd.dms.generated.types.DmcTypeDateSV;             // Required type
import org.dmd.dms.generated.types.DmcTypeDoubleMV;           // Required type
import org.dmd.dms.generated.types.DmcTypeDoubleSV;           // Required type
import org.dmd.dms.generated.types.DmcTypeStringMV;           // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type
import org.dmd.dms.generated.types.DmcTypeUUIDNameSV;         // Required type

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:126)
 */
@SuppressWarnings("serial")
public class UUIDNamedObjectDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "UUIDNamedObject";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __mvBoolean = new DmcAttributeInfo("mvBoolean",10001,"Boolean",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mvDate = new DmcAttributeInfo("mvDate",10011,"Date",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mvDouble = new DmcAttributeInfo("mvDouble",10041,"Double",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mvString = new DmcAttributeInfo("mvString",10141,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __svBoolean = new DmcAttributeInfo("svBoolean",10000,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svDate = new DmcAttributeInfo("svDate",10010,"Date",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svDouble = new DmcAttributeInfo("svDouble",10040,"Double",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10140,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("uuidName",101,"UUIDName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__mvBoolean.id,__mvBoolean);
        _ImAp.put(__mvDate.id,__mvDate);
        _ImAp.put(__mvDouble.id,__mvDouble);
        _ImAp.put(__mvString.id,__mvString);
        _ImAp.put(__svBoolean.id,__svBoolean);
        _ImAp.put(__svDate.id,__svDate);
        _ImAp.put(__svDouble.id,__svDouble);
        _ImAp.put(__svString.id,__svString);
        _ImAp.put(__uuidName.id,__uuidName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__mvBoolean.name,__mvBoolean);
        _SmAp.put(__mvDate.name,__mvDate);
        _SmAp.put(__mvDouble.name,__mvDouble);
        _SmAp.put(__mvString.name,__mvString);
        _SmAp.put(__svBoolean.name,__svBoolean);
        _SmAp.put(__svDate.name,__svDate);
        _SmAp.put(__svDouble.name,__svDouble);
        _SmAp.put(__svString.name,__svString);
        _SmAp.put(__uuidName.name,__uuidName);
    }

    public UUIDNamedObjectDMO() {
        super("UUIDNamedObject");
    }

    protected UUIDNamedObjectDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public UUIDNamedObjectDMO getNew(){
        UUIDNamedObjectDMO rc = new UUIDNamedObjectDMO();
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:676)
    public UUIDName getObjectName(){
        DmcAttribute<?> name = get(__uuidName);
        if (name != null)
            return((UUIDName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__uuidName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof UUIDNamedObjectDMO){
            return( getObjectName().equals( ((UUIDNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public Boolean isSvBoolean(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__svBoolean);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setSvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__svBoolean);
        
        try{
            attr.set(value);
            set(__svBoolean,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setSvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__svBoolean);
        
        attr.set(value);
        set(__svBoolean,attr);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remSvBoolean(){
         rem(__svBoolean);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:739)
    public Iterator<Boolean> getMvBoolean(){
        DmcTypeBooleanMV attr = (DmcTypeBooleanMV) get(__mvBoolean);
        if (attr == null)
            return( ((List<Boolean>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:752)
    public DmcAttribute<?> addMvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(__mvBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanMV(__mvBoolean);
        
        try{
            setLastValue(attr.add(value));
            add(__mvBoolean,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Boolean.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:772)
    public boolean mvBooleanContains(Boolean value) {
        DmcAttribute<?> attr = get(__mvBoolean);
        return(attr.contains(value));
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addMvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanMV(__mvBoolean);
        
        setLastValue(attr.add(value));
        add(__mvBoolean,attr);
        return(attr);
    }

    /**
     * Deletes a mvBoolean value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:849)
    public DmcAttribute<?> delMvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvBoolean);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeBooleanMV(__mvBoolean), value);
        else
            attr = del(__mvBoolean, value);
        
        return(attr);
    }

    /**
     * Removes the mvBoolean attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remMvBoolean(){
         rem(__mvBoolean);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remSvString(){
         rem(__svString);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:739)
    public Iterator<String> getMvString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__mvString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:752)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:772)
    public boolean mvStringContains(String value) {
        DmcAttribute<?> attr = get(__mvString);
        return(attr.contains(value));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(__mvString);
        
        setLastValue(attr.add(value));
        add(__mvString,attr);
        return(attr);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:849)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remMvString(){
         rem(__mvString);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public Date getSvDate(){
        DmcTypeDateSV attr = (DmcTypeDateSV) get(__svDate);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setSvDate(Date value) {
        DmcAttribute<?> attr = get(__svDate);
        if (attr == null)
            attr = new DmcTypeDateSV(__svDate);
        
        try{
            attr.set(value);
            set(__svDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDateSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setSvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svDate);
        if (attr == null)
            attr = new DmcTypeDateSV(__svDate);
        
        attr.set(value);
        set(__svDate,attr);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remSvDate(){
         rem(__svDate);
    }

    /**
     * @return An Iterator of Date objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:739)
    public Iterator<Date> getMvDate(){
        DmcTypeDateMV attr = (DmcTypeDateMV) get(__mvDate);
        if (attr == null)
            return( ((List<Date>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:752)
    public DmcAttribute<?> addMvDate(Date value) {
        DmcAttribute<?> attr = get(__mvDate);
        if (attr == null)
            attr = new DmcTypeDateMV(__mvDate);
        
        try{
            setLastValue(attr.add(value));
            add(__mvDate,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:772)
    public boolean mvDateContains(Date value) {
        DmcAttribute<?> attr = get(__mvDate);
        return(attr.contains(value));
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addMvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvDate);
        if (attr == null)
            attr = new DmcTypeDateMV(__mvDate);
        
        setLastValue(attr.add(value));
        add(__mvDate,attr);
        return(attr);
    }

    /**
     * Deletes a mvDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:849)
    public DmcAttribute<?> delMvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateMV(__mvDate), value);
        else
            attr = del(__mvDate, value);
        
        return(attr);
    }

    /**
     * Removes the mvDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remMvDate(){
         rem(__mvDate);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public Double getSvDouble(){
        DmcTypeDoubleSV attr = (DmcTypeDoubleSV) get(__svDouble);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setSvDouble(Double value) {
        DmcAttribute<?> attr = get(__svDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSV(__svDouble);
        
        try{
            attr.set(value);
            set(__svDouble,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDouble to the specified value.
     * @param value A value compatible with DmcTypeDoubleSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setSvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSV(__svDouble);
        
        attr.set(value);
        set(__svDouble,attr);
    }

    /**
     * Removes the svDouble attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remSvDouble(){
         rem(__svDouble);
    }

    /**
     * @return An Iterator of Double objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:739)
    public Iterator<Double> getMvDouble(){
        DmcTypeDoubleMV attr = (DmcTypeDoubleMV) get(__mvDouble);
        if (attr == null)
            return( ((List<Double>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:752)
    public DmcAttribute<?> addMvDouble(Double value) {
        DmcAttribute<?> attr = get(__mvDouble);
        if (attr == null)
            attr = new DmcTypeDoubleMV(__mvDouble);
        
        try{
            setLastValue(attr.add(value));
            add(__mvDouble,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Double.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:772)
    public boolean mvDoubleContains(Double value) {
        DmcAttribute<?> attr = get(__mvDouble);
        return(attr.contains(value));
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addMvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvDouble);
        if (attr == null)
            attr = new DmcTypeDoubleMV(__mvDouble);
        
        setLastValue(attr.add(value));
        add(__mvDouble,attr);
        return(attr);
    }

    /**
     * Deletes a mvDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:849)
    public DmcAttribute<?> delMvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleMV(__mvDouble), value);
        else
            attr = del(__mvDouble, value);
        
        return(attr);
    }

    /**
     * Removes the mvDouble attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remMvDouble(){
         rem(__mvDouble);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public UUIDName getUuidName(){
        DmcTypeUUIDNameSV attr = (DmcTypeUUIDNameSV) get(__uuidName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setUuidName(UUIDName value) {
        DmcAttribute<?> attr = get(__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDNameSV(__uuidName);
        
        try{
            attr.set(value);
            set(__uuidName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setUuidName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDNameSV(__uuidName);
        
        attr.set(value);
        set(__uuidName,attr);
    }

    /**
     * Removes the uuidName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remUuidName(){
         rem(__uuidName);
    }




}
