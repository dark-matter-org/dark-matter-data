package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestOneLevelSubpackageExtendedREF;

import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestOneLevelSubpackageExtended
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:439)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageExtendedREF extends DmcTypeNamedObjectREF<TestOneLevelSubpackageExtendedREF, StringName> {

    public DmcTypeTestOneLevelSubpackageExtendedREF(){
    
    }

    public DmcTypeTestOneLevelSubpackageExtendedREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestOneLevelSubpackageExtendedREF getNewHelper(){
        return(new TestOneLevelSubpackageExtendedREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestOneLevelSubpackageExtendedDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestOneLevelSubpackageExtendedDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeTestOneLevelSubpackageExtendedREF cloneMe(){
        DmcTypeTestOneLevelSubpackageExtendedREF rc = new DmcTypeTestOneLevelSubpackageExtendedREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<TestOneLevelSubpackageExtendedREF>();
            for(TestOneLevelSubpackageExtendedREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeTestOneLevelSubpackageExtendedREF getOneOfMe(){
        DmcTypeTestOneLevelSubpackageExtendedREF rc = new DmcTypeTestOneLevelSubpackageExtendedREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestOneLevelSubpackageExtendedREF cloneValue(TestOneLevelSubpackageExtendedREF val){
        TestOneLevelSubpackageExtendedREF rc = new TestOneLevelSubpackageExtendedREF(val);
        return(rc);
    }



}