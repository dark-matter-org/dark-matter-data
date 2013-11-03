package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                        // Always required - (GenUtility.java:221)
import java.util.Date;                                              // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.dmc.DmcAttribute;                                    // Named object - (GenUtility.java:373)
import org.dmd.dmc.DmcNamedObjectIF;                                // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcObject;                                       // Structural class - (GenUtility.java:348)
import org.dmd.dmc.DmcValueException;                               // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.DefinitionName;                            // Naming attribute type - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Attribute from meta schema - (GenUtility.java:194)
import org.dmd.dms.generated.types.DmcTypeDateSV;                   // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;         // Required type - (GenUtility.java:325)

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class BaseObjDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "BaseObj";


    static {
    }

    public BaseObjDMO() {
        super("BaseObj");
    }

    protected BaseObjDMO(String oc) {
        super(oc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:750)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:767)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:774)
    public boolean equals(Object obj){
        if (obj instanceof BaseObjDMO){
            return( getObjectName().equals( ((BaseObjDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:782)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public Date getSvDate(){
        DmcTypeDateSV attr = (DmcTypeDateSV) get(DmtDMSAG.__svDate);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setSvDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svDate);
        if (attr == null)
            attr = new DmcTypeDateSV(DmtDMSAG.__svDate);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDateSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvDate(Object value) throws DmcValueException {
        DmcTypeDateSV attr  = (DmcTypeDateSV) get(DmtDMSAG.__svDate);
        if (attr == null)
            attr = new DmcTypeDateSV(DmtDMSAG.__svDate);
        
        attr.set(value);
        set(DmtDMSAG.__svDate,attr);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvDate(){
         rem(DmtDMSAG.__svDate);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setName(DefinitionName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setName(Object value) throws DmcValueException {
        DmcTypeDefinitionNameSV attr  = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}
