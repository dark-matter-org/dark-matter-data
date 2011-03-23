package org.dmd.dmt.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:563)
import java.util.*;                                                        // Always required
import org.dmd.dmc.DmcAttribute;                                           // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                       // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                       // Named object
import org.dmd.dmc.DmcValueException;                                      // Any attributes
import org.dmd.dmc.types.DmcTypeString;                                    // Required type
import org.dmd.dmc.types.DmcTypeStringName;                                // Required type
import org.dmd.dmc.types.StringName;                                       // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                          // Required if we have any attributes
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageDMO;         // Base class

/**
 * The TestDerivedDiffSubpackage test derivation from a different subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:131)
 */
@SuppressWarnings("serial")
public class TestDerivedDiffSubpackageDMO  extends TestOneLevelSubpackageDMO  implements DmcNamedObjectIF  {

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
        super("TestDerivedDiffSubpackage",_ImAp,_SmAp);
    }

    protected TestDerivedDiffSubpackageDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public TestDerivedDiffSubpackageDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public TestDerivedDiffSubpackageDMO(TestDerivedDiffSubpackageDMO original) {
        super(constructionClassName);
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public TestDerivedDiffSubpackageDMO getOneOfMe() {
        TestDerivedDiffSubpackageDMO rc = new TestDerivedDiffSubpackageDMO(constructionClassName);
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:634)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:381)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:408)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:423)
    public void remName(){
         rem(__name);
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




}
