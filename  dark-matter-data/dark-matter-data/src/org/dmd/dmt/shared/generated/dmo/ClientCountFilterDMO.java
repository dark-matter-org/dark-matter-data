package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                          // Always required
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dms.generated.dmo.DmwWrapperDMO;               // Structural class
import org.dmd.dms.generated.enums.DataTypeEnum;              // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class ClientCountFilterDMO  extends DmwWrapperDMO  implements Serializable  {

    public final static String constructionClassName = "ClientCountFilter";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __OUIFilter = new DmcAttributeInfo("OUIFilter",10407,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__OUIFilter.id,__OUIFilter);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__OUIFilter.name,__OUIFilter);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ClientCountFilterDMO() {
        super("ClientCountFilter");
    }

    protected ClientCountFilterDMO(String oc) {
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

    @Override
    public ClientCountFilterDMO getNew(){
        ClientCountFilterDMO rc = new ClientCountFilterDMO();
        return(rc);
    }

    @Override
    public ClientCountFilterDMO getSlice(DmcSliceInfo info){
        ClientCountFilterDMO rc = new ClientCountFilterDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ClientCountFilterDMO(DmcTypeModifierMV mods) {
        super("ClientCountFilter");
        modrec(true);
        setModifier(mods);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getOUIFilter(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__OUIFilter);
        if (attr == null)
            return("");

        return(attr.getSV());
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setOUIFilter(String value) {
        DmcAttribute<?> attr = get(__OUIFilter);
        if (attr == null)
            attr = new DmcTypeStringSV(__OUIFilter);
        
        try{
            attr.set(value);
            set(__OUIFilter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setOUIFilter(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__OUIFilter);
        if (attr == null)
            attr = new DmcTypeStringSV(__OUIFilter);
        
        attr.set(value);
        set(__OUIFilter,attr);
    }

    /**
     * Removes the OUIFilter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remOUIFilter(){
         rem(__OUIFilter);
    }




}
