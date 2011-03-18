package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:711)
import java.util.*;                                       // Always required
import org.dmd.dmc.DmcAttribute;                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                      // Named object
import org.dmd.dmc.DmcValueException;                     // Any attributes
import org.dmd.dmc.types.DmcTypeString;                   // Required type
import org.dmd.dmc.types.DmcTypeStringName;               // Required type
import org.dmd.dmc.types.StringName;                      // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;           // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Required if we have any attributes

/**
 * The TestOneLevelSubpackage class provides a test bed for generating DMWs
 * in different subpackages.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:139)
 */
@SuppressWarnings("serial")
public class TestOneLevelSubpackageDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __mvStringValue = new DmcAttributeInfo("mvStringValue",817,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svStringValue = new DmcAttributeInfo("svStringValue",816,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__mvStringValue.id,__mvStringValue);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__svStringValue.id,__svStringValue);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__mvStringValue.name,__mvStringValue);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__svStringValue.name,__svStringValue);
    }

    public TestOneLevelSubpackageDMO() {
        super("TestOneLevelSubpackage",_ImAp,_SmAp);
    }

    protected TestOneLevelSubpackageDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public TestOneLevelSubpackageDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public TestOneLevelSubpackageDMO(TestOneLevelSubpackageDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public TestOneLevelSubpackageDMO getOneOfMe() {
        TestOneLevelSubpackageDMO rc = new TestOneLevelSubpackageDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:787)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof TestOneLevelSubpackageDMO){
            return( getObjectName().equals( ((TestOneLevelSubpackageDMO) obj).getObjectName()) );
        }
        return(false);
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
    public StringName getName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName(__name);
        
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
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:396)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void remName(){
         rem(__name);
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




}
