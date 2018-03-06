package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3120)
import java.io.Serializable;                                  // Marker interface for serialization - (GenUtility.java:3101)
import java.util.Iterator;                                    // For JSON formatting - (GenUtility.java:3102)
import org.dmd.dmc.DmcAttributeInfo;                          // Constructor support - (GenUtility.java:3106)
import org.dmd.dmc.DmcInputStreamIF;                          // To support serialization - (GenUtility.java:3103)
import org.dmd.dmc.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (GenUtility.java:3112)
import org.dmd.dmc.DmcNameResolverIF;                         // Reference resolution - (GenUtility.java:3113)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (GenUtility.java:3111)
import org.dmd.dmc.DmcObject;                                 // Ambiguous reference resolution - (GenUtility.java:3114)
import org.dmd.dmc.DmcOutputStreamIF;                         // To support serialization - (GenUtility.java:3104)
import org.dmd.dmc.DmcValueException;                         // Type checking - (GenUtility.java:3107)
import org.dmd.dmc.DmcValueExceptionSet;                      // Ambiguous reference resolution - (GenUtility.java:3115)
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;          // Derivation base - (GenUtility.java:3110)



@SuppressWarnings("serial")
/**
 * The DmcTypeDmtMultiValuedRequiredPartWithReferences class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3127)
 *    Called from: Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:1036)
 */
abstract public class DmcTypeDmtMultiValuedRequiredPartWithReferences extends DmcTypeComplexTypeWithRefs<DmtMultiValuedRequiredPartWithReferences> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDmtMultiValuedRequiredPartWithReferences(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDmtMultiValuedRequiredPartWithReferences(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
        if (getMVSize() == 0){
            getSV().toJSON(sb,padding,indent);
        }
        else {
            Iterator<DmtMultiValuedRequiredPartWithReferences> it = getMV();
            while(it.hasNext()){
                DmtMultiValuedRequiredPartWithReferences value = it.next();
                value.toJSON(sb,padding,indent);
                if (it.hasNext())
                    sb.append(", \n");                    
            }
        }
    }

    protected DmtMultiValuedRequiredPartWithReferences typeCheck(Object value) throws DmcValueException {
        DmtMultiValuedRequiredPartWithReferences rc = null;

        if (value instanceof DmtMultiValuedRequiredPartWithReferences){
            rc = (DmtMultiValuedRequiredPartWithReferences)value;
        }
        else if (value instanceof String){
            rc = new DmtMultiValuedRequiredPartWithReferences((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmtMultiValuedRequiredPartWithReferences expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DmtMultiValuedRequiredPartWithReferences cloneValue(DmtMultiValuedRequiredPartWithReferences val){
        return(new DmtMultiValuedRequiredPartWithReferences(val));
    }

    /**
     * Writes a DmtMultiValuedRequiredPartWithReferences.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, DmtMultiValuedRequiredPartWithReferences value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a DmtMultiValuedRequiredPartWithReferences.
     */
    @Override
    public DmtMultiValuedRequiredPartWithReferences deserializeValue(DmcInputStreamIF dis) throws Exception {
        DmtMultiValuedRequiredPartWithReferences rc = new DmtMultiValuedRequiredPartWithReferences();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a DmtMultiValuedRequiredPartWithReferences.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, DmtMultiValuedRequiredPartWithReferences value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }

    /**
     * Resolves a DmtMultiValuedRequiredPartWithReferences.
     */
    @Override
    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, DmtMultiValuedRequiredPartWithReferences value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        value.resolve(resolver,object,ncr,ai);
    }



}
