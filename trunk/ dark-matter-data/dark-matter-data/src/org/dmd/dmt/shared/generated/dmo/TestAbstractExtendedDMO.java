package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:713)
import java.util.*;                                       // Always required
import org.dmd.dmc.DmcAttribute;                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                      // Always required
import org.dmd.dmc.DmcValueException;                     // Any attributes
import org.dmd.dmc.types.DmcTypeString;                   // Required type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;           // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Required if we have any attributes

/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:139)
 */
@SuppressWarnings("serial")
abstract public class TestAbstractExtendedDMO  extends DmwWrapperDMO  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10140,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__svString.id,__svString);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__svString.name,__svString);
    }

    public TestAbstractExtendedDMO() {
        super("TestAbstractExtended",_ImAp,_SmAp);
    }

    protected TestAbstractExtendedDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public TestAbstractExtendedDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public TestAbstractExtendedDMO(TestAbstractExtendedDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:372)
    public String getSvString(){
        DmcTypeString attr = (DmcTypeString) get(__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:393)
    public void setSvString(String value) {
        DmcAttribute<?> attr = get(__svString);
        if (attr == null)
            attr = new DmcTypeString(__svString);
        
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
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:420)
    public void setSvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svString);
        if (attr == null)
            attr = new DmcTypeString(__svString);
        
        attr.set(value);
        set(__svString,attr);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:435)
    public void remSvString(){
         rem(__svString);
    }




}
