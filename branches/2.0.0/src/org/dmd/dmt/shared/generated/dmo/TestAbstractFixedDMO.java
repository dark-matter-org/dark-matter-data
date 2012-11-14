package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                            // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcObject;                               // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcValueException;                       // Any attributes - (GenUtility.java:237)
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Required type - (GenUtility.java:324)

/**
 * The TestAbstract class just defines an abstract base class from which\n
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class TestAbstractFixedDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "TestAbstractFixed";


    static {
    }

    public TestAbstractFixedDMO() {
        super("TestAbstractFixed");
    }

    protected TestAbstractFixedDMO(String oc) {
        super(oc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getSvString(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtDMSAG.__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSvString(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        attr.set(value);
        set(DmtDMSAG.__svString,attr);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSvString(){
         rem(DmtDMSAG.__svString);
    }




}
