package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3277)
import java.io.Serializable;                  // Marker interface for serialization - (GenUtility.java:3258)
import java.util.Iterator;                    // For JSON formatting - (GenUtility.java:3259)
import org.dmd.dmc.DmcAttribute;              // Derivation base - (GenUtility.java:3275)
import org.dmd.dmc.DmcAttributeInfo;          // Constructor support - (GenUtility.java:3263)
import org.dmd.dmc.DmcInputStreamIF;          // To support serialization - (GenUtility.java:3260)
import org.dmd.dmc.DmcOutputStreamIF;         // To support serialization - (GenUtility.java:3261)
import org.dmd.dmc.DmcValueException;         // Type checking - (GenUtility.java:3264)



@SuppressWarnings("serial")
/**
 * The DmcTypeMenuElementTypeAndComment class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3284)
 *    Called from: Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:1099)
 */
abstract public class DmcTypeMenuElementTypeAndComment extends DmcAttribute<MenuElementTypeAndComment> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeMenuElementTypeAndComment(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeMenuElementTypeAndComment(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    // Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3307)
    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
        if (getMVSize() == 0){
            getSV().toJSON(sb,padding,indent);
        }
        else {
            Iterator<MenuElementTypeAndComment> it = getMV();
            while(it.hasNext()){
                MenuElementTypeAndComment value = it.next();
                value.toJSON(sb,padding,indent);
                if (it.hasNext())
                    sb.append(", \n");                    
            }
        }
    }

    // Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3323)
    protected MenuElementTypeAndComment typeCheck(Object value) throws DmcValueException {
        MenuElementTypeAndComment rc = null;

        if (value instanceof MenuElementTypeAndComment){
            rc = (MenuElementTypeAndComment)value;
        }
        else if (value instanceof String){
            rc = new MenuElementTypeAndComment((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MenuElementTypeAndComment expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3346)
     */
    public MenuElementTypeAndComment cloneValue(MenuElementTypeAndComment val){
        return(new MenuElementTypeAndComment(val));
    }

    /**
     * Writes a MenuElementTypeAndComment.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3354)
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, MenuElementTypeAndComment value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a MenuElementTypeAndComment.
     * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3363)
     */
    @Override
    public MenuElementTypeAndComment deserializeValue(DmcInputStreamIF dis) throws Exception {
        MenuElementTypeAndComment rc = new MenuElementTypeAndComment();
        rc.deserializeIt(dis);
        return(rc);
    }



}
