package org.dmd.dmt.shared.generated.dmo;

import java.io.Serializable;
import org.dmd.dms.extended.ActionTriggerInfo;
// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import org.dmd.dmc.DmcAttribute;                                // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcValueException;                           // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.StringName;                            // Primitive type and !auxiliary class - (GenUtility.java:261)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Attribute from meta schema - (GenUtility.java:129)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;            // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeStringNameSV;         // Required type - (GenUtility.java:301)


/**
 * This is the generated ActionTriggerInfo derivative for the testAction action.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoActionFormatter.dumpAction(DmoActionFormatter.java:105)
 */
@SuppressWarnings("serial")
public class TestActionATI extends ActionTriggerInfo implements Serializable {


    public TestActionATI(){
        super("TestAction","testAction");
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
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
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setName(Object value) throws DmcValueException {
        DmcTypeStringNameSV attr  = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public Boolean isSvBoolean(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmtDMSAG.__svBoolean);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setSvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__svBoolean);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svBoolean,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setSvBoolean(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmtDMSAG.__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__svBoolean);
        
        attr.set(value);
        set(DmtDMSAG.__svBoolean,attr);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remSvBoolean(){
         rem(DmtDMSAG.__svBoolean);
    }

}
