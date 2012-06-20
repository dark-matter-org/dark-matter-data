package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:374)
import java.io.Serializable;                                  // Always required - (GenUtility.java:203)
import java.util.*;                                           // Always required if we have any MV attributes - (GenUtility.java:198)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:219)
import org.dmd.dmc.DmcObject;                                 // Structural class - (GenUtility.java:330)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:208)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:220)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:207)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:206)
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type - (GenUtility.java:307)

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
public class ClientCountFilterDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "ClientCountFilter";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

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

    public ClientCountFilterDMO getModificationRecorder(){
        ClientCountFilterDMO rc = new ClientCountFilterDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:757)
    public String getOUIFilter(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtDMSAG.__OUIFilter);
        if (attr == null)
            return("");

        return(attr.getSV());
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:797)
    public void setOUIFilter(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__OUIFilter);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__OUIFilter);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__OUIFilter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:850)
    public void setOUIFilter(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtDMSAG.__OUIFilter);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__OUIFilter);
        
        attr.set(value);
        set(DmtDMSAG.__OUIFilter,attr);
    }

    /**
     * Removes the OUIFilter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:870)
    public void remOUIFilter(){
         rem(DmtDMSAG.__OUIFilter);
    }




}
