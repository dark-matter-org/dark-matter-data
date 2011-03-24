package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestDerivedSubpackageREF;

import org.dmd.dmt.shared.generated.dmo.TestDerivedSubpackageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestDerivedSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:538)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREF extends DmcTypeNamedObjectREF<TestDerivedSubpackageREF, StringName> {

    public DmcTypeTestDerivedSubpackageREF(){
    
    }

    public DmcTypeTestDerivedSubpackageREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestDerivedSubpackageREF getNewHelper(){
        return(new TestDerivedSubpackageREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestDerivedSubpackageDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestDerivedSubpackageDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeTestDerivedSubpackageREF cloneMe(){
        DmcTypeTestDerivedSubpackageREF rc = new DmcTypeTestDerivedSubpackageREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<TestDerivedSubpackageREF>();
            for(TestDerivedSubpackageREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeTestDerivedSubpackageREF getOneOfMe(){
        DmcTypeTestDerivedSubpackageREF rc = new DmcTypeTestDerivedSubpackageREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestDerivedSubpackageREF cloneValue(TestDerivedSubpackageREF val){
        TestDerivedSubpackageREF rc = new TestDerivedSubpackageREF(val);
        return(rc);
    }

    /**
     * Returns the object associated with the name.
     */
    public TestDerivedSubpackageREF getByKey(Object key){
        
        return(null);
    }



}
