package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.BaseObjREF;

import org.dmd.dmt.shared.generated.dmo.BaseObjDMO;

/**
 * This is the generated DmcAttribute derivative for values of type BaseObj
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:543)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeBaseObjREF extends DmcTypeNamedObjectREF<BaseObjREF, StringName> {

    public DmcTypeBaseObjREF(){
    
    }

    public DmcTypeBaseObjREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected BaseObjREF getNewHelper(){
        return(new BaseObjREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( BaseObjDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof BaseObjDMO)
            return(true);
        return(false);
    }

    @Override
    protected BaseObjREF typeCheck(Object value) throws DmcValueException {
        BaseObjREF rc = null;

        if (value instanceof BaseObjREF)
            rc = (BaseObjREF)value;
        else if (value instanceof BaseObjDMO)
            rc = new BaseObjREF((BaseObjDMO)value);
        else if (value instanceof StringName)
            rc = new BaseObjREF((StringName)value);
        else if (value instanceof String)
            rc = new BaseObjREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with BaseObjREF, BaseObjDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, BaseObjREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public BaseObjREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        BaseObjREF rc = new BaseObjREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public BaseObjREF cloneValue(BaseObjREF value){
        return(new BaseObjREF(value));
    }



}
