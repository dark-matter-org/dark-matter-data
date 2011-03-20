package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:711)
import java.util.*;                                       // Always required
import org.dmd.dmc.DmcAttribute;                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                      // Named object
import org.dmd.dmc.DmcValueException;                     // Any attributes
import org.dmd.dmc.types.DmcTypeIntegerName;              // Required type
import org.dmd.dmc.types.DmcTypeString;                   // Required type
import org.dmd.dmc.types.IntegerName;                     // Naming attribute type
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
public class IntegerNamedObjectDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __integerName = new DmcAttributeInfo("integerName",10022,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10140,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__integerName.id,__integerName);
        _ImAp.put(__svString.id,__svString);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__integerName.name,__integerName);
        _SmAp.put(__svString.name,__svString);
    }

    public IntegerNamedObjectDMO() {
        super("IntegerNamedObject",_ImAp,_SmAp);
    }

    protected IntegerNamedObjectDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public IntegerNamedObjectDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public IntegerNamedObjectDMO(IntegerNamedObjectDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public IntegerNamedObjectDMO getOneOfMe() {
        IntegerNamedObjectDMO rc = new IntegerNamedObjectDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:787)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(__integerName);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof IntegerNamedObjectDMO){
            return( getObjectName().equals( ((IntegerNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:354)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:396)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void remSvString(){
         rem(__svString);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:354)
    public IntegerName getIntegerName(){
        DmcTypeIntegerName attr = (DmcTypeIntegerName) get(__integerName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets integerName to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
    public void setIntegerName(IntegerName value) {
        DmcAttribute<?> attr = get(__integerName);
        if (attr == null)
            attr = new DmcTypeIntegerName(__integerName);
        
        try{
            attr.set(value);
            set(__integerName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets integerName to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:396)
    public void setIntegerName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__integerName);
        if (attr == null)
            attr = new DmcTypeIntegerName(__integerName);
        
        attr.set(value);
        set(__integerName,attr);
    }

    /**
     * Removes the integerName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void remIntegerName(){
         rem(__integerName);
    }




}