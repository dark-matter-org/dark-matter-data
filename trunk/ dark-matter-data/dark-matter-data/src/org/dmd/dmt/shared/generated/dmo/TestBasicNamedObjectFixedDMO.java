package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:355)
import java.io.Serializable;                                                             // Always required
import java.util.*;                                                                      // Always required
import org.dmd.dmc.DmcAttribute;                                                         // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                                     // Named object
import org.dmd.dmc.DmcObject;                                                            // Structural class
import org.dmd.dmc.DmcOmni;                                                              // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                         // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                    // Any attributes
import org.dmd.dmc.types.StringName;                                                     // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                    // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;                                      // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                                  // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                                      // Required type
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;                    // Type specific set/add
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicNamedObjectFixedREFMV;         // Reference type
import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectFixedREF;                  // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The TestBasicNamedObjectFixed class provides a test bed for a named object.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class TestBasicNamedObjectFixedDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "TestBasicNamedObjectFixed";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public TestBasicNamedObjectFixedDMO() {
        super("TestBasicNamedObjectFixed");
    }

    protected TestBasicNamedObjectFixedDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public TestBasicNamedObjectFixedDMO getNew(){
        TestBasicNamedObjectFixedDMO rc = new TestBasicNamedObjectFixedDMO();
        return(rc);
    }

    @Override
    public TestBasicNamedObjectFixedDMO getSlice(DmcSliceInfo info){
        TestBasicNamedObjectFixedDMO rc = new TestBasicNamedObjectFixedDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public TestBasicNamedObjectFixedDMO(DmcTypeModifierMV mods) {
        super("TestBasicNamedObjectFixed");
        modrec(true);
        setModifier(mods);
    }

    public TestBasicNamedObjectFixedDMO getModificationRecorder(){
        TestBasicNamedObjectFixedDMO rc = new TestBasicNamedObjectFixedDMO();
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

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof TestBasicNamedObjectFixedDMO){
            return( getObjectName().equals( ((TestBasicNamedObjectFixedDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        StringName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1008)
    public Iterator<String> getMvString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1020)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1034)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1141)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1158)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1232)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1251)
    public void remMvString(){
         rem(DmtDMSAG.__mvString);
    }

    /**
     * @return An Iterator of TestBasicNamedObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:866)
    public Iterator<TestBasicNamedObjectFixedREF> getMvTestBasicNamedObjectFixed(){
        DmcTypeTestBasicNamedObjectFixedREFMV attr = (DmcTypeTestBasicNamedObjectFixedREFMV) get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return( ((List<TestBasicNamedObjectFixedREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<TestBasicNamedObjectFixedREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of TestBasicNamedObjectFixedREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:886)
    public Iterator<TestBasicNamedObjectFixedREF> getMvTestBasicNamedObjectFixedREFs(){
        DmcTypeTestBasicNamedObjectFixedREFMV attr = (DmcTypeTestBasicNamedObjectFixedREFMV) get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return( ((List<TestBasicNamedObjectFixedREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another mvTestBasicNamedObjectFixed to the specified value.
     * @param value TestBasicNamedObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:900)
    public DmcAttribute<?> addMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            attr = new DmcTypeTestBasicNamedObjectFixedREFMV(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvTestBasicNamedObjectFixed,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvTestBasicNamedObjectFixed value.
     * @param value A value compatible with TestBasicNamedObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1141)
    public DmcAttribute<?> addMvTestBasicNamedObjectFixed(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            attr = new DmcTypeTestBasicNamedObjectFixedREFMV(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvTestBasicNamedObjectFixed,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvTestBasicNamedObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1158)
    public int getMvTestBasicNamedObjectFixedSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null){
            if (DmtDMSAG.__mvTestBasicNamedObjectFixed.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvTestBasicNamedObjectFixed.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvTestBasicNamedObjectFixed value.
     * @param value The TestBasicNamedObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1197)
    public DmcAttribute<?> delMvTestBasicNamedObjectFixed(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicNamedObjectFixedREFMV(DmtDMSAG.__mvTestBasicNamedObjectFixed), value);
        else
            attr = del(DmtDMSAG.__mvTestBasicNamedObjectFixed, value);
        
        return(attr);
    }

    /**
     * Removes the mvTestBasicNamedObjectFixed attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1251)
    public void remMvTestBasicNamedObjectFixed(){
         rem(DmtDMSAG.__mvTestBasicNamedObjectFixed);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remSvString(){
         rem(DmtDMSAG.__svString);
    }




}
