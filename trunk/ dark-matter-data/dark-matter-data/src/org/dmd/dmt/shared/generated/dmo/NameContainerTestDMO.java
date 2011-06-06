package org.dmd.dmt.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                              // Always required
import java.util.*;                                                       // Always required
import org.dmd.dmc.DmcAttribute;                                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                      // Always required
import org.dmd.dmc.DmcObjectName;                                         // Alternative type for NameContainer values
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing
import org.dmd.dmc.DmcValueException;                                     // Any attributes
import org.dmd.dmc.types.NameContainer;                                   // Primitive type and !auxiliary class
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                           // Structural class
import org.dmd.dms.generated.enums.DataTypeEnum;                          // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                         // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;                // Required type
import org.dmd.dmt.shared.generated.types.DmcTypeDmtStringNameSV;         // Required type
import org.dmd.dmt.shared.types.DmtStringName;                            // Primitive type and !auxiliary class

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
public class NameContainerTestDMO  extends DmwWrapperDMO  implements Serializable  {

    public final static String constructionClassName = "NameContainerTest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __anObjName = new DmcAttributeInfo("anObjName",10400,"NameContainer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __anotherDmtName = new DmcAttributeInfo("anotherDmtName",10402,"DmtStringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __dmtStringName = new DmcAttributeInfo("dmtStringName",10401,"DmtStringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__anObjName.id,__anObjName);
        _ImAp.put(__anotherDmtName.id,__anotherDmtName);
        _ImAp.put(__dmtStringName.id,__dmtStringName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__anObjName.name,__anObjName);
        _SmAp.put(__anotherDmtName.name,__anotherDmtName);
        _SmAp.put(__dmtStringName.name,__dmtStringName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public NameContainerTestDMO() {
        super("NameContainerTest");
    }

    protected NameContainerTestDMO(String oc) {
        super(oc);
    }

    @Override
    public boolean supportsBackrefTracking(){
        return(false);
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

    @Override
    public NameContainerTestDMO getNew(){
        NameContainerTestDMO rc = new NameContainerTestDMO();
        return(rc);
    }

    @Override
    public NameContainerTestDMO getSlice(DmcSliceInfo info){
        NameContainerTestDMO rc = new NameContainerTestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NameContainerTestDMO(DmcTypeModifierMV mods) {
        super("NameContainerTest");
        modrec(true);
        setModifier(mods);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public DmtStringName getAnotherDmtName(){
        DmcTypeDmtStringNameSV attr = (DmcTypeDmtStringNameSV) get(__anotherDmtName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value DmtStringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setAnotherDmtName(DmtStringName value) {
        DmcAttribute<?> attr = get(__anotherDmtName);
        if (attr == null)
            attr = new DmcTypeDmtStringNameSV(__anotherDmtName);
        
        try{
            attr.set(value);
            set(__anotherDmtName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setAnotherDmtName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__anotherDmtName);
        if (attr == null)
            attr = new DmcTypeDmtStringNameSV(__anotherDmtName);
        
        attr.set(value);
        set(__anotherDmtName,attr);
    }

    /**
     * Removes the anotherDmtName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remAnotherDmtName(){
         rem(__anotherDmtName);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public DmtStringName getDmtStringName(){
        DmcTypeDmtStringNameSV attr = (DmcTypeDmtStringNameSV) get(__dmtStringName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value DmtStringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setDmtStringName(DmtStringName value) {
        DmcAttribute<?> attr = get(__dmtStringName);
        if (attr == null)
            attr = new DmcTypeDmtStringNameSV(__dmtStringName);
        
        try{
            attr.set(value);
            set(__dmtStringName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setDmtStringName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dmtStringName);
        if (attr == null)
            attr = new DmcTypeDmtStringNameSV(__dmtStringName);
        
        attr.set(value);
        set(__dmtStringName,attr);
    }

    /**
     * Removes the dmtStringName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remDmtStringName(){
         rem(__dmtStringName);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public NameContainer getAnObjName(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(__anObjName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setAnObjName(NameContainer value) {
        DmcAttribute<?> attr = get(__anObjName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__anObjName);
        
        try{
            attr.set(value);
            set(__anObjName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:643)
    public void setAnObjName(DmcObjectName value) {
        DmcAttribute<?> attr = get(__anObjName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__anObjName);
        
        try{
            attr.set(value);
            set(__anObjName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets anObjName to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setAnObjName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__anObjName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__anObjName);
        
        attr.set(value);
        set(__anObjName,attr);
    }

    /**
     * Removes the anObjName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remAnObjName(){
         rem(__anObjName);
    }




}
