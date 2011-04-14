package org.dmd.dmt.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:273)
import java.io.Serializable;                                     // Always required
import java.util.*;                                              // Always required
import org.dmd.dmc.DmcAttribute;                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                             // Always required
import org.dmd.dmc.DmcNamedObjectIF;                             // Named object
import org.dmd.dmc.DmcValueException;                            // Any attributes
import org.dmd.dmc.types.IntegerName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                  // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;              // Required type

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class IntegerNamedObjectDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "IntegerNamedObject";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __integerName = new DmcAttributeInfo("integerName",100,"IntegerName",ValueTypeEnum.SINGLE,false);
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
        super("IntegerNamedObject");
    }

    protected IntegerNamedObjectDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public IntegerNamedObjectDMO getNew(){
        IntegerNamedObjectDMO rc = new IntegerNamedObjectDMO();
        return(rc);
    }

    public IntegerNamedObjectDMO(DmcTypeModifierMV mods) {
        super("IntegerNamedObject");
        modrec(true);
        setModifier(mods);
    }

    public IntegerNamedObjectDMO getModificationRecorder(){
        IntegerNamedObjectDMO rc = new IntegerNamedObjectDMO(new DmcTypeModifierMV());
        rc.setIntegerName(getIntegerName());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:667)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(__integerName);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__integerName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof IntegerNamedObjectDMO){
            return( getObjectName().equals( ((IntegerNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remSvString(){
         rem(__svString);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
    public IntegerName getIntegerName(){
        DmcTypeIntegerNameSV attr = (DmcTypeIntegerNameSV) get(__integerName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets integerName to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
    public void setIntegerName(IntegerName value) {
        DmcAttribute<?> attr = get(__integerName);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__integerName);
        
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
     * @param value A value compatible with DmcTypeIntegerNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setIntegerName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__integerName);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__integerName);
        
        attr.set(value);
        set(__integerName,attr);
    }

    /**
     * Removes the integerName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remIntegerName(){
         rem(__integerName);
    }




}
