package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.UUIDName;

import org.dmd.dmt.shared.generated.types.UUIDNamedObjectREF;

import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type UUIDNamedObject
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:500)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeUUIDNamedObjectREF extends DmcTypeNamedObjectREF<UUIDNamedObjectREF, UUIDName> {

    public DmcTypeUUIDNamedObjectREF(){
    
    }

    public DmcTypeUUIDNamedObjectREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected UUIDNamedObjectREF getNewHelper(){
        return(new UUIDNamedObjectREF());
    }

    @Override
    protected UUIDName getNewName(){
        return(new UUIDName());
    }

    @Override
    protected String getDMOClassName(){
        return( UUIDNamedObjectDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof UUIDNamedObjectDMO)
            return(true);
        return(false);
    }

    @Override
    protected UUIDNamedObjectREF typeCheck(Object value) throws DmcValueException {
        UUIDNamedObjectREF rc = null;

        if (value instanceof UUIDNamedObjectREF)
            rc = (UUIDNamedObjectREF)value;
        else if (value instanceof UUIDNamedObjectDMO)
            rc = new UUIDNamedObjectREF((UUIDNamedObjectDMO)value);
        else if (value instanceof String)
            rc = new UUIDNamedObjectREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with UUIDNamedObjectREF, UUIDNamedObjectDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, UUIDNamedObjectREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public UUIDNamedObjectREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        UUIDNamedObjectREF rc = new UUIDNamedObjectREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public UUIDNamedObjectREF cloneValue(UUIDNamedObjectREF value){
        return(new UUIDNamedObjectREF(value));
    }



}
