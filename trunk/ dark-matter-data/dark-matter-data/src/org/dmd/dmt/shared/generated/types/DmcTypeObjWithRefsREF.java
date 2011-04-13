package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;

import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ObjWithRefs
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:496)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeObjWithRefsREF extends DmcTypeNamedObjectREF<ObjWithRefsREF, StringName> {

    public DmcTypeObjWithRefsREF(){
    
    }

    public DmcTypeObjWithRefsREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ObjWithRefsREF getNewHelper(){
        return(new ObjWithRefsREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( ObjWithRefsDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ObjWithRefsDMO)
            return(true);
        return(false);
    }

    @Override
    protected ObjWithRefsREF typeCheck(Object value) throws DmcValueException {
        ObjWithRefsREF rc = null;

        if (value instanceof ObjWithRefsREF)
            rc = (ObjWithRefsREF)value;
        else if (value instanceof ObjWithRefsDMO)
            rc = new ObjWithRefsREF((ObjWithRefsDMO)value);
        else if (value instanceof String)
            rc = new ObjWithRefsREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ObjWithRefsREF, ObjWithRefsDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ObjWithRefsREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ObjWithRefsREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ObjWithRefsREF rc = new ObjWithRefsREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ObjWithRefsREF cloneValue(ObjWithRefsREF value){
        return(new ObjWithRefsREF(value));
    }



}
