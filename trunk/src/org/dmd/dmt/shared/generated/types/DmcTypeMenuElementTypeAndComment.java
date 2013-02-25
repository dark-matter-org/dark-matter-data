package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcAttribute;
@SuppressWarnings("serial")
/**
 * The DmcTypeMenuElementTypeAndComment class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3080)
 *    Called from: Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:374)
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
     */
    public MenuElementTypeAndComment cloneValue(MenuElementTypeAndComment val){
        return(new MenuElementTypeAndComment(val));
    }

    /**
     * Writes a MenuElementTypeAndComment.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, MenuElementTypeAndComment value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a MenuElementTypeAndComment.
     */
    @Override
    public MenuElementTypeAndComment deserializeValue(DmcInputStreamIF dis) throws Exception {
        MenuElementTypeAndComment rc = new MenuElementTypeAndComment();
        rc.deserializeIt(dis);
        return(rc);
    }



}
