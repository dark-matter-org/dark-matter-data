package org.dmd.dmt.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:563)
import java.util.*;                                       // Always required
import java.util.Date;                                    // Primitive type and !auxiliary class
import org.dmd.dmc.DmcAttribute;                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                      // Named object
import org.dmd.dmc.DmcValueException;                     // Any attributes
import org.dmd.dmc.types.DmcTypeBoolean;                  // Required type
import org.dmd.dmc.types.DmcTypeDate;                     // Required type
import org.dmd.dmc.types.DmcTypeDouble;                   // Required type
import org.dmd.dmc.types.DmcTypeString;                   // Required type
import org.dmd.dmc.types.DmcTypeUUIDName;                 // Required type
import org.dmd.dmc.types.UUIDName;                        // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;           // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Required if we have any attributes

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:131)
 */
@SuppressWarnings("serial")
public class UUIDNamedObjectDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

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
    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("uuidName",10180,"UUIDName",ValueTypeEnum.SINGLE,false);

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
        super("UUIDNamedObject",_ImAp,_SmAp);
    }

    protected UUIDNamedObjectDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public UUIDNamedObjectDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public UUIDNamedObjectDMO(UUIDNamedObjectDMO original) {
        super(constructionClassName);
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public UUIDNamedObjectDMO getOneOfMe() {
        UUIDNamedObjectDMO rc = new UUIDNamedObjectDMO(constructionClassName);
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:634)
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

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:348)
    public Boolean getSvBoolean(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__svBoolean);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:381)
    public void setSvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(__svBoolean);
        if (attr == null)
            attr = new DmcTypeBoolean(__svBoolean);
        
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
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:408)
    public void setSvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svBoolean);
        if (attr == null)
            attr = new DmcTypeBoolean(__svBoolean);
        
        attr.set(value);
        set(__svBoolean,attr);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:423)
    public void remSvBoolean(){
         rem(__svBoolean);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:512)
    public Iterator<Boolean> getMvBoolean(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__mvBoolean);
        if (attr == null)
            return( ((List<Boolean>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvBoolean to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:525)
    public DmcAttribute<?> addMvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(__mvBoolean);
        if (attr == null)
            attr = new DmcTypeBoolean(__mvBoolean);
        
        try{
            attr.add(value);
            add(__mvBoolean,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:550)
    public DmcAttribute<?> addMvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvBoolean);
        if (attr == null)
            attr = new DmcTypeBoolean(__mvBoolean);
        
        attr.add(value);
        add(__mvBoolean,attr);
        return(attr);
    }

    /**
     * Deletes a mvBoolean value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:612)
    public DmcAttribute<?> delMvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__mvBoolean, value);
        return(attr);
    }

    /**
     * Removes the mvBoolean attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:633)
    public void remMvBoolean(){
         rem(__mvBoolean);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:348)
    public String getSvString(){
        DmcTypeString attr = (DmcTypeString) get(__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:381)
    public void setSvString(String value) {
        DmcAttribute<?> attr = get(__svString);
        if (attr == null)
            attr = new DmcTypeString(__svString);
        
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
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:408)
    public void setSvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svString);
        if (attr == null)
            attr = new DmcTypeString(__svString);
        
        attr.set(value);
        set(__svString,attr);
    }

    /**
     * Removes the svString attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:423)
    public void remSvString(){
         rem(__svString);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:512)
    public Iterator<String> getMvString(){
        DmcTypeString attr = (DmcTypeString) get(__mvString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvString to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:525)
    public DmcAttribute<?> addMvString(String value) {
        DmcAttribute<?> attr = get(__mvString);
        if (attr == null)
            attr = new DmcTypeString(__mvString);
        
        try{
            attr.add(value);
            add(__mvString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:550)
    public DmcAttribute<?> addMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvString);
        if (attr == null)
            attr = new DmcTypeString(__mvString);
        
        attr.add(value);
        add(__mvString,attr);
        return(attr);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:612)
    public DmcAttribute<?> delMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__mvString, value);
        return(attr);
    }

    /**
     * Removes the mvString attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:633)
    public void remMvString(){
         rem(__mvString);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:348)
    public Date getSvDate(){
        DmcTypeDate attr = (DmcTypeDate) get(__svDate);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:381)
    public void setSvDate(Date value) {
        DmcAttribute<?> attr = get(__svDate);
        if (attr == null)
            attr = new DmcTypeDate(__svDate);
        
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
     * @param value A value compatible with DmcTypeDate
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:408)
    public void setSvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svDate);
        if (attr == null)
            attr = new DmcTypeDate(__svDate);
        
        attr.set(value);
        set(__svDate,attr);
    }

    /**
     * Removes the svDate attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:423)
    public void remSvDate(){
         rem(__svDate);
    }

    /**
     * @return An Iterator of Date objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:512)
    public Iterator<Date> getMvDate(){
        DmcTypeDate attr = (DmcTypeDate) get(__mvDate);
        if (attr == null)
            return( ((List<Date>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvDate to the specified value.
     * @param value Date
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:525)
    public DmcAttribute<?> addMvDate(Date value) {
        DmcAttribute<?> attr = get(__mvDate);
        if (attr == null)
            attr = new DmcTypeDate(__mvDate);
        
        try{
            attr.add(value);
            add(__mvDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:550)
    public DmcAttribute<?> addMvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvDate);
        if (attr == null)
            attr = new DmcTypeDate(__mvDate);
        
        attr.add(value);
        add(__mvDate,attr);
        return(attr);
    }

    /**
     * Deletes a mvDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:612)
    public DmcAttribute<?> delMvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__mvDate, value);
        return(attr);
    }

    /**
     * Removes the mvDate attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:633)
    public void remMvDate(){
         rem(__mvDate);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:348)
    public Double getSvDouble(){
        DmcTypeDouble attr = (DmcTypeDouble) get(__svDouble);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDouble to the specified value.
     * @param value Double
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:381)
    public void setSvDouble(Double value) {
        DmcAttribute<?> attr = get(__svDouble);
        if (attr == null)
            attr = new DmcTypeDouble(__svDouble);
        
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
     * @param value A value compatible with DmcTypeDouble
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:408)
    public void setSvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svDouble);
        if (attr == null)
            attr = new DmcTypeDouble(__svDouble);
        
        attr.set(value);
        set(__svDouble,attr);
    }

    /**
     * Removes the svDouble attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:423)
    public void remSvDouble(){
         rem(__svDouble);
    }

    /**
     * @return An Iterator of Double objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:512)
    public Iterator<Double> getMvDouble(){
        DmcTypeDouble attr = (DmcTypeDouble) get(__mvDouble);
        if (attr == null)
            return( ((List<Double>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvDouble to the specified value.
     * @param value Double
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:525)
    public DmcAttribute<?> addMvDouble(Double value) {
        DmcAttribute<?> attr = get(__mvDouble);
        if (attr == null)
            attr = new DmcTypeDouble(__mvDouble);
        
        try{
            attr.add(value);
            add(__mvDouble,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:550)
    public DmcAttribute<?> addMvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvDouble);
        if (attr == null)
            attr = new DmcTypeDouble(__mvDouble);
        
        attr.add(value);
        add(__mvDouble,attr);
        return(attr);
    }

    /**
     * Deletes a mvDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:612)
    public DmcAttribute<?> delMvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__mvDouble, value);
        return(attr);
    }

    /**
     * Removes the mvDouble attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:633)
    public void remMvDouble(){
         rem(__mvDouble);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:348)
    public UUIDName getUuidName(){
        DmcTypeUUIDName attr = (DmcTypeUUIDName) get(__uuidName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:381)
    public void setUuidName(UUIDName value) {
        DmcAttribute<?> attr = get(__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDName(__uuidName);
        
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
     * @param value A value compatible with DmcTypeUUIDName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:408)
    public void setUuidName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDName(__uuidName);
        
        attr.set(value);
        set(__uuidName,attr);
    }

    /**
     * Removes the uuidName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:423)
    public void remUuidName(){
         rem(__uuidName);
    }




}
