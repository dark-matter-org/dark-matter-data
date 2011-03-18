package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectFixedREF;

import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestBasicNamedObjectFixed
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:439)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectFixedREF extends DmcTypeNamedObjectREF<TestBasicNamedObjectFixedREF, StringName> {

    public DmcTypeTestBasicNamedObjectFixedREF(){
    
    }

    public DmcTypeTestBasicNamedObjectFixedREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestBasicNamedObjectFixedREF getNewHelper(){
        return(new TestBasicNamedObjectFixedREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestBasicNamedObjectFixedDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestBasicNamedObjectFixedDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeTestBasicNamedObjectFixedREF cloneMe(){
        DmcTypeTestBasicNamedObjectFixedREF rc = new DmcTypeTestBasicNamedObjectFixedREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<TestBasicNamedObjectFixedREF>();
            for(TestBasicNamedObjectFixedREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeTestBasicNamedObjectFixedREF getOneOfMe(){
        DmcTypeTestBasicNamedObjectFixedREF rc = new DmcTypeTestBasicNamedObjectFixedREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestBasicNamedObjectFixedREF cloneValue(TestBasicNamedObjectFixedREF val){
        TestBasicNamedObjectFixedREF rc = new TestBasicNamedObjectFixedREF(val);
        return(rc);
    }



}
