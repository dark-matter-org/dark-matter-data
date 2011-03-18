package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:711)
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
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:139)
 */
@SuppressWarnings("serial")
public class UUIDNamedObjectDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __mvBooleanValue = new DmcAttributeInfo("mvBooleanValue",801,"Boolean",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mvDateValue = new DmcAttributeInfo("mvDateValue",803,"Date",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mvDoubleValue = new DmcAttributeInfo("mvDoubleValue",807,"Double",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mvStringValue = new DmcAttributeInfo("mvStringValue",817,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __svBooleanValue = new DmcAttributeInfo("svBooleanValue",800,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svDateValue = new DmcAttributeInfo("svDateValue",802,"Date",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svDoubleValue = new DmcAttributeInfo("svDoubleValue",806,"Double",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svStringValue = new DmcAttributeInfo("svStringValue",816,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("uuidName",821,"UUIDName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__mvBooleanValue.id,__mvBooleanValue);
        _ImAp.put(__mvDateValue.id,__mvDateValue);
        _ImAp.put(__mvDoubleValue.id,__mvDoubleValue);
        _ImAp.put(__mvStringValue.id,__mvStringValue);
        _ImAp.put(__svBooleanValue.id,__svBooleanValue);
        _ImAp.put(__svDateValue.id,__svDateValue);
        _ImAp.put(__svDoubleValue.id,__svDoubleValue);
        _ImAp.put(__svStringValue.id,__svStringValue);
        _ImAp.put(__uuidName.id,__uuidName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__mvBooleanValue.name,__mvBooleanValue);
        _SmAp.put(__mvDateValue.name,__mvDateValue);
        _SmAp.put(__mvDoubleValue.name,__mvDoubleValue);
        _SmAp.put(__mvStringValue.name,__mvStringValue);
        _SmAp.put(__svBooleanValue.name,__svBooleanValue);
        _SmAp.put(__svDateValue.name,__svDateValue);
        _SmAp.put(__svDoubleValue.name,__svDoubleValue);
        _SmAp.put(__svStringValue.name,__svStringValue);
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
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public UUIDNamedObjectDMO getOneOfMe() {
        UUIDNamedObjectDMO rc = new UUIDNamedObjectDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:787)
    public UUIDName getObjectName(){
        DmcAttribute<?> name = get(__uuidName);
        if (name != null)
            return((UUIDName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof UUIDNamedObjectDMO){
            return( getObjectName().equals( ((UUIDNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:354)
    public Boolean getSvBooleanValue(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__svBooleanValue);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets svBooleanValue to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
    public void setSvBooleanValue(Boolean value) {
        DmcAttribute<?> attr = get(__svBooleanValue);
        if (attr == null)
            attr = new DmcTypeBoolean(__svBooleanValue);
        
        try{
            attr.set(value);
            set(__svBooleanValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svBooleanValue to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:396)
    public void setSvBooleanValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svBooleanValue);
        if (attr == null)
            attr = new DmcTypeBoolean(__svBooleanValue);
        
        attr.set(value);
        set(__svBooleanValue,attr);
    }

    /**
     * Removes the svBooleanValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void remSvBooleanValue(){
         rem(__svBooleanValue);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:500)
    public Iterator<Boolean> getMvBooleanValue(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__mvBooleanValue);
        if (attr == null)
            return( ((List<Boolean>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvBooleanValue to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:515)
    public DmcAttribute<?> addMvBooleanValue(Boolean value) {
        DmcAttribute<?> attr = get(__mvBooleanValue);
        if (attr == null)
            attr = new DmcTypeBoolean(__mvBooleanValue);
        
        try{
            attr.add(value);
            add(__mvBooleanValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvBooleanValue value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:541)
    public DmcAttribute<?> addMvBooleanValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvBooleanValue);
        if (attr == null)
            attr = new DmcTypeBoolean(__mvBooleanValue);
        
        attr.add(value);
        add(__mvBooleanValue,attr);
        return(attr);
    }

    /**
     * Deletes a mvBooleanValue value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:608)
    public DmcAttribute<?> delMvBooleanValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__mvBooleanValue, value);
        return(attr);
    }

    /**
     * Removes the mvBooleanValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:630)
    public void remMvBooleanValue(){
         rem(__mvBooleanValue);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:354)
    public String getSvStringValue(){
        DmcTypeString attr = (DmcTypeString) get(__svStringValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svStringValue to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
    public void setSvStringValue(String value) {
        DmcAttribute<?> attr = get(__svStringValue);
        if (attr == null)
            attr = new DmcTypeString(__svStringValue);
        
        try{
            attr.set(value);
            set(__svStringValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svStringValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:396)
    public void setSvStringValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svStringValue);
        if (attr == null)
            attr = new DmcTypeString(__svStringValue);
        
        attr.set(value);
        set(__svStringValue,attr);
    }

    /**
     * Removes the svStringValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void remSvStringValue(){
         rem(__svStringValue);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:500)
    public Iterator<String> getMvStringValue(){
        DmcTypeString attr = (DmcTypeString) get(__mvStringValue);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvStringValue to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:515)
    public DmcAttribute<?> addMvStringValue(String value) {
        DmcAttribute<?> attr = get(__mvStringValue);
        if (attr == null)
            attr = new DmcTypeString(__mvStringValue);
        
        try{
            attr.add(value);
            add(__mvStringValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvStringValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:541)
    public DmcAttribute<?> addMvStringValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvStringValue);
        if (attr == null)
            attr = new DmcTypeString(__mvStringValue);
        
        attr.add(value);
        add(__mvStringValue,attr);
        return(attr);
    }

    /**
     * Deletes a mvStringValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:608)
    public DmcAttribute<?> delMvStringValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__mvStringValue, value);
        return(attr);
    }

    /**
     * Removes the mvStringValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:630)
    public void remMvStringValue(){
         rem(__mvStringValue);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:354)
    public Date getSvDateValue(){
        DmcTypeDate attr = (DmcTypeDate) get(__svDateValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDateValue to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
    public void setSvDateValue(Date value) {
        DmcAttribute<?> attr = get(__svDateValue);
        if (attr == null)
            attr = new DmcTypeDate(__svDateValue);
        
        try{
            attr.set(value);
            set(__svDateValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDateValue to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:396)
    public void setSvDateValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svDateValue);
        if (attr == null)
            attr = new DmcTypeDate(__svDateValue);
        
        attr.set(value);
        set(__svDateValue,attr);
    }

    /**
     * Removes the svDateValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void remSvDateValue(){
         rem(__svDateValue);
    }

    /**
     * @return An Iterator of Date objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:500)
    public Iterator<Date> getMvDateValue(){
        DmcTypeDate attr = (DmcTypeDate) get(__mvDateValue);
        if (attr == null)
            return( ((List<Date>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvDateValue to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:515)
    public DmcAttribute<?> addMvDateValue(Date value) {
        DmcAttribute<?> attr = get(__mvDateValue);
        if (attr == null)
            attr = new DmcTypeDate(__mvDateValue);
        
        try{
            attr.add(value);
            add(__mvDateValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvDateValue value.
     * @param value A value compatible with Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:541)
    public DmcAttribute<?> addMvDateValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvDateValue);
        if (attr == null)
            attr = new DmcTypeDate(__mvDateValue);
        
        attr.add(value);
        add(__mvDateValue,attr);
        return(attr);
    }

    /**
     * Deletes a mvDateValue value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:608)
    public DmcAttribute<?> delMvDateValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__mvDateValue, value);
        return(attr);
    }

    /**
     * Removes the mvDateValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:630)
    public void remMvDateValue(){
         rem(__mvDateValue);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:354)
    public Double getSvDoubleValue(){
        DmcTypeDouble attr = (DmcTypeDouble) get(__svDoubleValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDoubleValue to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
    public void setSvDoubleValue(Double value) {
        DmcAttribute<?> attr = get(__svDoubleValue);
        if (attr == null)
            attr = new DmcTypeDouble(__svDoubleValue);
        
        try{
            attr.set(value);
            set(__svDoubleValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDoubleValue to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:396)
    public void setSvDoubleValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svDoubleValue);
        if (attr == null)
            attr = new DmcTypeDouble(__svDoubleValue);
        
        attr.set(value);
        set(__svDoubleValue,attr);
    }

    /**
     * Removes the svDoubleValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void remSvDoubleValue(){
         rem(__svDoubleValue);
    }

    /**
     * @return An Iterator of Double objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:500)
    public Iterator<Double> getMvDoubleValue(){
        DmcTypeDouble attr = (DmcTypeDouble) get(__mvDoubleValue);
        if (attr == null)
            return( ((List<Double>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvDoubleValue to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:515)
    public DmcAttribute<?> addMvDoubleValue(Double value) {
        DmcAttribute<?> attr = get(__mvDoubleValue);
        if (attr == null)
            attr = new DmcTypeDouble(__mvDoubleValue);
        
        try{
            attr.add(value);
            add(__mvDoubleValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvDoubleValue value.
     * @param value A value compatible with Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:541)
    public DmcAttribute<?> addMvDoubleValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mvDoubleValue);
        if (attr == null)
            attr = new DmcTypeDouble(__mvDoubleValue);
        
        attr.add(value);
        add(__mvDoubleValue,attr);
        return(attr);
    }

    /**
     * Deletes a mvDoubleValue value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:608)
    public DmcAttribute<?> delMvDoubleValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__mvDoubleValue, value);
        return(attr);
    }

    /**
     * Removes the mvDoubleValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:630)
    public void remMvDoubleValue(){
         rem(__mvDoubleValue);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:354)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:396)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void remUuidName(){
         rem(__uuidName);
    }




}
