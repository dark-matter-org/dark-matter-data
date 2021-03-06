package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpExtendedReferenceTypeDmcType(GenUtility.java:3460)
import org.dmd.dmc.DmcAttributeInfo;                            // Standard attribute interface - (GenUtility.java:3448)
import org.dmd.dmc.DmcInputStreamIF;                            // Serialization support - (GenUtility.java:3445)
import org.dmd.dmc.DmcOutputStreamIF;                           // Serialization support - (GenUtility.java:3446)
import org.dmd.dmc.DmcValueException;                           // Value exceptions - (GenUtility.java:3449)
import org.dmd.dmc.types.DefinitionName;                        // Name type - (GenUtility.java:3454)
import org.dmd.dmc.types.DmcTypeNamedObjectREF;                 // The class we extend - (GenUtility.java:3450)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;         // The class we refer to - (GenUtility.java:3452)



@SuppressWarnings("serial")
/**
 * The DmcTypeSomeRelation class.
 * This code was auto-generated and shouldn't be alterred manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpExtendedReferenceTypeDmcType(GenUtility.java:3483)
 *    Called from: Called from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:466)
 */
abstract public class DmcTypeSomeRelation extends DmcTypeNamedObjectREF<SomeRelation, DefinitionName> {

    /**
     * Default constructor.
     */
    public DmcTypeSomeRelation(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeSomeRelation(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected SomeRelation getNewHelper(){
        return(new SomeRelation());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return(ObjWithRefsDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ObjWithRefsDMO)
            return(true);
        return(false);
    }

    protected SomeRelation typeCheck(Object value) throws DmcValueException {
        SomeRelation rc = null;

        if (value instanceof SomeRelation){
            rc = (SomeRelation)value;
        }
        else if (value instanceof String){
            rc = new SomeRelation((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with SomeRelation expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public SomeRelation cloneValue(SomeRelation val){
        return(new SomeRelation(val));
    }

    /**
     * Writes a SomeRelation.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, SomeRelation value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a SomeRelation.
     */
    @Override
    public SomeRelation deserializeValue(DmcInputStreamIF dis) throws Exception {
        SomeRelation rc = new SomeRelation();
        rc.deserializeIt(dis);
        return(rc);
    }



}
