package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                  // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                 // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ClientCountFilterDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "ClientCountFilter";


    static {
    }

    public ClientCountFilterDMO() {
        super("ClientCountFilter");
    }

    protected ClientCountFilterDMO(String oc) {
        super(oc);
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
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
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remOUIFilter(){
         rem(DmtDMSAG.__OUIFilter);
    }




}
