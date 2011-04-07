package org.dmd.dmt.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:267)
import java.io.Serializable;                                               // Always required
import java.util.*;                                                        // Always required
import org.dmd.dmc.DmcAttribute;                                           // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                       // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                       // Named object
import org.dmd.dmc.DmcValueException;                                      // Any attributes
import org.dmd.dmc.types.StringName;                                       // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                          // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeStringMV;                        // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                        // Required type
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageDMO;         // Base class

/**
 * The TestDerivedDiffSubpackage test derivation from a different subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:126)
 */
@SuppressWarnings("serial")
public class TestDerivedDiffSubpackageDMO  extends TestOneLevelSubpackageDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "TestDerivedDiffSubpackage";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __mvString = new DmcAttributeInfo("mvString",10141,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10140,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__mvString.id,__mvString);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__svString.id,__svString);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__mvString.name,__mvString);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__svString.name,__svString);
    }

    public TestDerivedDiffSubpackageDMO() {
        super("TestDerivedDiffSubpackage");
    }

    protected TestDerivedDiffSubpackageDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public TestDerivedDiffSubpackageDMO getNew(){
        TestDerivedDiffSubpackageDMO rc = new TestDerivedDiffSubpackageDMO();
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:676)
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
        if (obj instanceof TestDerivedDiffSubpackageDMO){
            return( getObjectName().equals( ((TestDerivedDiffSubpackageDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:735)
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:748)
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:768)
    public boolean mvStringContains(String value) {
        DmcAttribute<?> attr = get(__mvString);
        return(attr.contains(value));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:783)
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:845)
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:863)
    public void remMvString(){
         rem(__mvString);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:588)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:615)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:630)
    public void remName(){
         rem(__name);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:588)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:615)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:630)
    public void remSvString(){
         rem(__svString);
    }




}
