package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.IntegerName;

import org.dmd.dmt.shared.generated.types.IntegerNamedObjectREF;

import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type IntegerNamedObject
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeIntegerNamedObjectREF extends DmcTypeNamedObjectREF<IntegerNamedObjectREF, IntegerName> {

    public DmcTypeIntegerNamedObjectREF(){
    
    }

    public DmcTypeIntegerNamedObjectREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected IntegerNamedObjectREF getNewHelper(){
        return(new IntegerNamedObjectREF());
    }

    @Override
    protected IntegerName getNewName(){
        return(new IntegerName());
    }

    @Override
    protected String getDMOClassName(){
        return( IntegerNamedObjectDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof IntegerNamedObjectDMO)
            return(true);
        return(false);
    }

    @Override
    protected IntegerNamedObjectREF typeCheck(Object value) throws DmcValueException {
        IntegerNamedObjectREF rc = null;

        if (value instanceof IntegerNamedObjectREF)
            rc = (IntegerNamedObjectREF)value;
        else if (value instanceof IntegerNamedObjectDMO)
            rc = new IntegerNamedObjectREF((IntegerNamedObjectDMO)value);
        else if (value instanceof String)
            rc = new IntegerNamedObjectREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerNamedObjectREF, IntegerNamedObjectDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, IntegerNamedObjectREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public IntegerNamedObjectREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        IntegerNamedObjectREF rc = new IntegerNamedObjectREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public IntegerNamedObjectREF cloneValue(IntegerNamedObjectREF value){
        return(new IntegerNamedObjectREF(value));
    }



}
