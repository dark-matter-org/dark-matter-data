package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectExtendedREF;

import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectExtendedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestBasicNamedObjectExtended
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:472)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectExtendedREF extends DmcTypeNamedObjectREF<TestBasicNamedObjectExtendedREF, StringName> {

    public DmcTypeTestBasicNamedObjectExtendedREF(){
    
    }

    public DmcTypeTestBasicNamedObjectExtendedREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestBasicNamedObjectExtendedREF getNewHelper(){
        return(new TestBasicNamedObjectExtendedREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestBasicNamedObjectExtendedDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestBasicNamedObjectExtendedDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeTestBasicNamedObjectExtendedREF cloneMe(){
        DmcTypeTestBasicNamedObjectExtendedREF rc = new DmcTypeTestBasicNamedObjectExtendedREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<TestBasicNamedObjectExtendedREF>();
            for(TestBasicNamedObjectExtendedREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeTestBasicNamedObjectExtendedREF getOneOfMe(){
        DmcTypeTestBasicNamedObjectExtendedREF rc = new DmcTypeTestBasicNamedObjectExtendedREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestBasicNamedObjectExtendedREF cloneValue(TestBasicNamedObjectExtendedREF val){
        TestBasicNamedObjectExtendedREF rc = new TestBasicNamedObjectExtendedREF(val);
        return(rc);
    }

    /**
     * Returns the object associated with the name.
     */
    public TestBasicNamedObjectExtendedREF getByKey(Object key){
        
        return(null);
    }



}
