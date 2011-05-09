package org.dmd.dmt.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                    // Always required
import java.util.*;                                             // Always required
import java.util.Date;                                          // Primitive type and !auxiliary class
import org.dmd.dmc.DmcAttribute;                                // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                            // Always required
import org.dmd.dmc.DmcNamedObjectIF;                            // Named object
import org.dmd.dmc.DmcValueException;                           // Any attributes
import org.dmd.dmc.types.StringName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                 // Structural class
import org.dmd.dms.generated.enums.DataTypeEnum;                // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;               // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeDateSV;               // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;         // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
abstract public class BaseObjDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "BaseObj";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __svDate = new DmcAttributeInfo("svDate",10010,"Date",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__svDate.id,__svDate);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__svDate.name,__svDate);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public BaseObjDMO() {
        super("BaseObj");
    }

    protected BaseObjDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:729)
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
        if (obj instanceof BaseObjDMO){
            return( getObjectName().equals( ((BaseObjDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remSvDate(){
         rem(__svDate);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remName(){
         rem(__name);
    }




}
