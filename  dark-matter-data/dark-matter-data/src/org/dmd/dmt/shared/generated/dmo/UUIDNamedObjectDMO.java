package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:357)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import java.util.Date;                                        // Primitive type and !auxiliary class
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                          // Named object
import org.dmd.dmc.DmcObject;                                 // Structural class
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dmc.types.UUIDName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeBooleanMV;          // Required type
import org.dmd.dms.generated.types.DmcTypeBooleanSV;          // Required type
import org.dmd.dms.generated.types.DmcTypeDateMV;             // Required type
import org.dmd.dms.generated.types.DmcTypeDateSV;             // Required type
import org.dmd.dms.generated.types.DmcTypeDoubleMV;           // Required type
import org.dmd.dms.generated.types.DmcTypeDoubleSV;           // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;           // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type
import org.dmd.dms.generated.types.DmcTypeUUIDNameSV;         // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class UUIDNamedObjectDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "UUIDNamedObject";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public UUIDNamedObjectDMO() {
        super("UUIDNamedObject");
    }

    protected UUIDNamedObjectDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public UUIDNamedObjectDMO getNew(){
        UUIDNamedObjectDMO rc = new UUIDNamedObjectDMO();
        return(rc);
    }

    @Override
    public UUIDNamedObjectDMO getSlice(DmcSliceInfo info){
        UUIDNamedObjectDMO rc = new UUIDNamedObjectDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UUIDNamedObjectDMO(DmcTypeModifierMV mods) {
        super("UUIDNamedObject");
        modrec(true);
        setModifier(mods);
    }

    public UUIDNamedObjectDMO getModificationRecorder(){
        UUIDNamedObjectDMO rc = new UUIDNamedObjectDMO();
        rc.setUuidName(getUuidName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:742)
    public UUIDName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__uuidName);
        if (name != null)
            return((UUIDName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__uuidName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof UUIDNamedObjectDMO){
            return( getObjectName().equals( ((UUIDNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remSvBoolean(){
         rem(DmtDMSAG.__svBoolean);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1010)
    public Iterator<Boolean> getMvBoolean(){
        DmcTypeBooleanMV attr = (DmcTypeBooleanMV) get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            return( ((List<Boolean>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Boolean value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1022)
    public Boolean getNthMvBoolean(int i){
        DmcTypeBooleanMV attr = (DmcTypeBooleanMV) get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1036)
    public DmcAttribute<?> addMvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanMV(DmtDMSAG.__mvBoolean);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvBoolean,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1111)
    public boolean mvBooleanContains(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addMvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanMV(DmtDMSAG.__mvBoolean);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvBoolean,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvBoolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getMvBooleanSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        if (attr == null){
            if (DmtDMSAG.__mvBoolean.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvBoolean.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvBoolean value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1218)
    public DmcAttribute<?> delMvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeBooleanMV(DmtDMSAG.__mvBoolean), value);
        else
            attr = del(DmtDMSAG.__mvBoolean, value);
        
        return(attr);
    }

    /**
     * Deletes a mvBoolean from the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1234)
    public DmcAttribute<?> delMvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeBooleanMV(DmtDMSAG.__mvBoolean), value);
        else
            attr = del(DmtDMSAG.__mvBoolean, value);
        
        return(attr);
    }

    /**
     * Removes the mvBoolean attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remMvBoolean(){
         rem(DmtDMSAG.__mvBoolean);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remSvString(){
         rem(DmtDMSAG.__svString);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1010)
    public Iterator<String> getMvString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1022)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1036)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1111)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1218)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1234)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remMvString(){
         rem(DmtDMSAG.__mvString);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public Date getSvDate(){
        DmcTypeDateSV attr = (DmcTypeDateSV) get(DmtDMSAG.__svDate);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setSvDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svDate);
        if (attr == null)
            attr = new DmcTypeDateSV(DmtDMSAG.__svDate);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDateSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setSvDate(Object value) throws DmcValueException {
        DmcTypeDateSV attr  = (DmcTypeDateSV) get(DmtDMSAG.__svDate);
        if (attr == null)
            attr = new DmcTypeDateSV(DmtDMSAG.__svDate);
        
        attr.set(value);
        set(DmtDMSAG.__svDate,attr);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remSvDate(){
         rem(DmtDMSAG.__svDate);
    }

    /**
     * @return An Iterator of Date objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1010)
    public Iterator<Date> getMvDate(){
        DmcTypeDateMV attr = (DmcTypeDateMV) get(DmtDMSAG.__mvDate);
        if (attr == null)
            return( ((List<Date>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Date value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1022)
    public Date getNthMvDate(int i){
        DmcTypeDateMV attr = (DmcTypeDateMV) get(DmtDMSAG.__mvDate);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1036)
    public DmcAttribute<?> addMvDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        if (attr == null)
            attr = new DmcTypeDateMV(DmtDMSAG.__mvDate);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvDate,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1111)
    public boolean mvDateContains(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addMvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        if (attr == null)
            attr = new DmcTypeDateMV(DmtDMSAG.__mvDate);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvDate,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvDate
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getMvDateSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        if (attr == null){
            if (DmtDMSAG.__mvDate.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvDate.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1218)
    public DmcAttribute<?> delMvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateMV(DmtDMSAG.__mvDate), value);
        else
            attr = del(DmtDMSAG.__mvDate, value);
        
        return(attr);
    }

    /**
     * Deletes a mvDate from the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1234)
    public DmcAttribute<?> delMvDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateMV(DmtDMSAG.__mvDate), value);
        else
            attr = del(DmtDMSAG.__mvDate, value);
        
        return(attr);
    }

    /**
     * Removes the mvDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remMvDate(){
         rem(DmtDMSAG.__mvDate);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public Double getSvDouble(){
        DmcTypeDoubleSV attr = (DmcTypeDoubleSV) get(DmtDMSAG.__svDouble);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setSvDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSV(DmtDMSAG.__svDouble);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svDouble,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDouble to the specified value.
     * @param value A value compatible with DmcTypeDoubleSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setSvDouble(Object value) throws DmcValueException {
        DmcTypeDoubleSV attr  = (DmcTypeDoubleSV) get(DmtDMSAG.__svDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSV(DmtDMSAG.__svDouble);
        
        attr.set(value);
        set(DmtDMSAG.__svDouble,attr);
    }

    /**
     * Removes the svDouble attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remSvDouble(){
         rem(DmtDMSAG.__svDouble);
    }

    /**
     * @return An Iterator of Double objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1010)
    public Iterator<Double> getMvDouble(){
        DmcTypeDoubleMV attr = (DmcTypeDoubleMV) get(DmtDMSAG.__mvDouble);
        if (attr == null)
            return( ((List<Double>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Double value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1022)
    public Double getNthMvDouble(int i){
        DmcTypeDoubleMV attr = (DmcTypeDoubleMV) get(DmtDMSAG.__mvDouble);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1036)
    public DmcAttribute<?> addMvDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        if (attr == null)
            attr = new DmcTypeDoubleMV(DmtDMSAG.__mvDouble);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvDouble,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1111)
    public boolean mvDoubleContains(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addMvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        if (attr == null)
            attr = new DmcTypeDoubleMV(DmtDMSAG.__mvDouble);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvDouble,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvDouble
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getMvDoubleSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        if (attr == null){
            if (DmtDMSAG.__mvDouble.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvDouble.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1218)
    public DmcAttribute<?> delMvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleMV(DmtDMSAG.__mvDouble), value);
        else
            attr = del(DmtDMSAG.__mvDouble, value);
        
        return(attr);
    }

    /**
     * Deletes a mvDouble from the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1234)
    public DmcAttribute<?> delMvDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleMV(DmtDMSAG.__mvDouble), value);
        else
            attr = del(DmtDMSAG.__mvDouble, value);
        
        return(attr);
    }

    /**
     * Removes the mvDouble attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remMvDouble(){
         rem(DmtDMSAG.__mvDouble);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public UUIDName getUuidName(){
        DmcTypeUUIDNameSV attr = (DmcTypeUUIDNameSV) get(MetaDMSAG.__uuidName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setUuidName(UUIDName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDNameSV(MetaDMSAG.__uuidName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__uuidName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setUuidName(Object value) throws DmcValueException {
        DmcTypeUUIDNameSV attr  = (DmcTypeUUIDNameSV) get(MetaDMSAG.__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDNameSV(MetaDMSAG.__uuidName);
        
        attr.set(value);
        set(MetaDMSAG.__uuidName,attr);
    }

    /**
     * Removes the uuidName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remUuidName(){
         rem(MetaDMSAG.__uuidName);
    }




}
