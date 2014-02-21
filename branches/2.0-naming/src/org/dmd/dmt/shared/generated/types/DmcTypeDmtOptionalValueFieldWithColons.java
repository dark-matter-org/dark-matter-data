package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3094)
import java.io.Serializable;                                  // Marker interface for serialization - (GenUtility.java:3076)
import org.dmd.dmc.DmcAttributeInfo;                          // Constructor support - (GenUtility.java:3080)
import org.dmd.dmc.DmcInputStreamIF;                          // To support serialization - (GenUtility.java:3077)
import org.dmd.dmc.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (GenUtility.java:3086)
import org.dmd.dmc.DmcNameResolverIF;                         // Reference resolution - (GenUtility.java:3087)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (GenUtility.java:3085)
import org.dmd.dmc.DmcObject;                                 // Ambiguous reference resolution - (GenUtility.java:3088)
import org.dmd.dmc.DmcOutputStreamIF;                         // To support serialization - (GenUtility.java:3078)
import org.dmd.dmc.DmcValueException;                         // Type checking - (GenUtility.java:3081)
import org.dmd.dmc.DmcValueExceptionSet;                      // Ambiguous reference resolution - (GenUtility.java:3089)
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;          // Derivation base - (GenUtility.java:3084)



@SuppressWarnings("serial")
/**
 * The DmcTypeDmtOptionalValueFieldWithColons class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3101)
 *    Called from: Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:701)
 */
abstract public class DmcTypeDmtOptionalValueFieldWithColons extends DmcTypeComplexTypeWithRefs<DmtOptionalValueFieldWithColons> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDmtOptionalValueFieldWithColons(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDmtOptionalValueFieldWithColons(DmcAttributeInfo ai){
        super(ai);
    }

    protected DmtOptionalValueFieldWithColons typeCheck(Object value) throws DmcValueException {
        DmtOptionalValueFieldWithColons rc = null;

        if (value instanceof DmtOptionalValueFieldWithColons){
            rc = (DmtOptionalValueFieldWithColons)value;
        }
        else if (value instanceof String){
            rc = new DmtOptionalValueFieldWithColons((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmtOptionalValueFieldWithColons expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DmtOptionalValueFieldWithColons cloneValue(DmtOptionalValueFieldWithColons val){
        return(new DmtOptionalValueFieldWithColons(val));
    }

    /**
     * Writes a DmtOptionalValueFieldWithColons.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, DmtOptionalValueFieldWithColons value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a DmtOptionalValueFieldWithColons.
     */
    @Override
    public DmtOptionalValueFieldWithColons deserializeValue(DmcInputStreamIF dis) throws Exception {
        DmtOptionalValueFieldWithColons rc = new DmtOptionalValueFieldWithColons();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a DmtOptionalValueFieldWithColons.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, DmtOptionalValueFieldWithColons value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }

    /**
     * Resolves a DmtOptionalValueFieldWithColons.
     */
    @Override
    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, DmtOptionalValueFieldWithColons value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        value.resolve(resolver,object,ncr,ai);
    }



}