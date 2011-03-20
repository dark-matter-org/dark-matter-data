package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
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
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:439)
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerNamedObjectREF extends DmcTypeNamedObjectREF<IntegerNamedObjectREF, IntegerName> {

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

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeIntegerNamedObjectREF cloneMe(){
        DmcTypeIntegerNamedObjectREF rc = new DmcTypeIntegerNamedObjectREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<IntegerNamedObjectREF>();
            for(IntegerNamedObjectREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeIntegerNamedObjectREF getOneOfMe(){
        DmcTypeIntegerNamedObjectREF rc = new DmcTypeIntegerNamedObjectREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public IntegerNamedObjectREF cloneValue(IntegerNamedObjectREF val){
        IntegerNamedObjectREF rc = new IntegerNamedObjectREF(val);
        return(rc);
    }



}