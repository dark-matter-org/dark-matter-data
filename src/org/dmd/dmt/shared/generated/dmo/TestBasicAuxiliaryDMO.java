package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import org.dmd.dmc.DmcAttribute;                            // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcAttributeInfo;                        // Auxiliary class - (GenUtility.java:358)
import org.dmd.dmc.DmcObject;                               // Auxiliary class - (GenUtility.java:357)
import org.dmd.dmc.DmcValueException;                       // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Required type - (GenUtility.java:339)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;           // Attribute from dmt schema - (GenUtility.java:132)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The TestBasicAuxiliary class allows us to test basic auxiliary class
 * functionality.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpAUX(DmoFormatter.java:347)
 */
public class TestBasicAuxiliaryDMO  {

    public final static String _auxClass = "TestBasicAuxiliary";

    static {
    }
    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:380)
    static private void removeAuxIfRequired(DmcObject core){
        boolean anyLeft = false;

        if (core.get(DmtDMSAG.__svString) != null)
            anyLeft = true;

        if (!anyLeft)
            core.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:398)
    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {
        if (!core.hasAux(_auxClass))
            core.addAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:408)
    static public boolean hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return(false);
        return(core.hasAux(_auxClass));
    }

    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:416)
    static private DmcAttribute<?> get(DmcObject core, DmcAttributeInfo ai){
        if (core == null)
            return(null);
        return(core.get(ai));
    }

    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:425)
    static private DmcAttribute<?> set(DmcObject core, DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {
        if (core == null)
            return(null);
        addAuxIfRequired(core);
        return(core.set(ai,attr));
    }

    /**
     * Removes the svString attribute from the object.
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:872)
    static public DmcAttribute<?> remSvString(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute<?> rc = core.rem(DmtDMSAG.__svString);
        removeAuxIfRequired(core);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:905)
    static public String getSvString(DmcObject core){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(core, DmtDMSAG.__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:927)
    static public void setSvString(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(core, DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        attr.set(value);
        set(core, DmtDMSAG.__svString,attr);
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:962)
    static public void setSvString(DmcObject core, String value){
        DmcAttribute<?> attr = get(core, DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        try {
            attr.set(value);
            set(core, DmtDMSAG.__svString,attr);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Type specific modification shouldn't cause an error.", e));
        }
    }




}
