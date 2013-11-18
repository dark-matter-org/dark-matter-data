package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3091)
import java.io.Serializable;                                  // Marker interface for serialization - (GenUtility.java:3073)
import org.dmd.dmc.DmcAttributeInfo;                          // Constructor support - (GenUtility.java:3077)
import org.dmd.dmc.DmcInputStreamIF;                          // To support serialization - (GenUtility.java:3074)
import org.dmd.dmc.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (GenUtility.java:3083)
import org.dmd.dmc.DmcNameResolverIF;                         // Reference resolution - (GenUtility.java:3084)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (GenUtility.java:3082)
import org.dmd.dmc.DmcObject;                                 // Ambiguous reference resolution - (GenUtility.java:3085)
import org.dmd.dmc.DmcOutputStreamIF;                         // To support serialization - (GenUtility.java:3075)
import org.dmd.dmc.DmcValueException;                         // Type checking - (GenUtility.java:3078)
import org.dmd.dmc.DmcValueExceptionSet;                      // Ambiguous reference resolution - (GenUtility.java:3086)
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;          // Derivation base - (GenUtility.java:3081)



@SuppressWarnings("serial")
/**
 * The DmcTypeDmtField class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3098)
 *    Called from: Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:406)
 */
abstract public class DmcTypeDmtField extends DmcTypeComplexTypeWithRefs<DmtField> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDmtField(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDmtField(DmcAttributeInfo ai){
        super(ai);
    }

    protected DmtField typeCheck(Object value) throws DmcValueException {
        DmtField rc = null;

        if (value instanceof DmtField){
            rc = (DmtField)value;
        }
        else if (value instanceof String){
            rc = new DmtField((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmtField expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DmtField cloneValue(DmtField val){
        return(new DmtField(val));
    }

    /**
     * Writes a DmtField.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, DmtField value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a DmtField.
     */
    @Override
    public DmtField deserializeValue(DmcInputStreamIF dis) throws Exception {
        DmtField rc = new DmtField();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a DmtField.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, DmtField value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }

    /**
     * Resolves a DmtField.
     */
    @Override
    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, DmtField value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        value.resolve(resolver,object,ncr,ai);
    }



}
