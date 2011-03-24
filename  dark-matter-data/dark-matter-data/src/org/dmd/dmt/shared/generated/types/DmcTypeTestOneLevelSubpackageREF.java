package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestOneLevelSubpackageREF;

import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestOneLevelSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:538)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageREF extends DmcTypeNamedObjectREF<TestOneLevelSubpackageREF, StringName> {

    public DmcTypeTestOneLevelSubpackageREF(){
    
    }

    public DmcTypeTestOneLevelSubpackageREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestOneLevelSubpackageREF getNewHelper(){
        return(new TestOneLevelSubpackageREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestOneLevelSubpackageDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestOneLevelSubpackageDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeTestOneLevelSubpackageREF cloneMe(){
        DmcTypeTestOneLevelSubpackageREF rc = new DmcTypeTestOneLevelSubpackageREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<TestOneLevelSubpackageREF>();
            for(TestOneLevelSubpackageREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeTestOneLevelSubpackageREF getOneOfMe(){
        DmcTypeTestOneLevelSubpackageREF rc = new DmcTypeTestOneLevelSubpackageREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestOneLevelSubpackageREF cloneValue(TestOneLevelSubpackageREF val){
        TestOneLevelSubpackageREF rc = new TestOneLevelSubpackageREF(val);
        return(rc);
    }

    /**
     * Returns the object associated with the name.
     */
    public TestOneLevelSubpackageREF getByKey(Object key){
        
        return(null);
    }



}
