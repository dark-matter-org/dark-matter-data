package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestMultiLevelSubpackageREF;

import org.dmd.dmt.shared.generated.dmo.TestMultiLevelSubpackageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestMultiLevelSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:439)
 */
@SuppressWarnings("serial")
public class DmcTypeTestMultiLevelSubpackageREF extends DmcTypeNamedObjectREF<TestMultiLevelSubpackageREF, StringName> {

    public DmcTypeTestMultiLevelSubpackageREF(){
    
    }

    public DmcTypeTestMultiLevelSubpackageREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestMultiLevelSubpackageREF getNewHelper(){
        return(new TestMultiLevelSubpackageREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestMultiLevelSubpackageDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestMultiLevelSubpackageDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeTestMultiLevelSubpackageREF cloneMe(){
        DmcTypeTestMultiLevelSubpackageREF rc = new DmcTypeTestMultiLevelSubpackageREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<TestMultiLevelSubpackageREF>();
            for(TestMultiLevelSubpackageREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeTestMultiLevelSubpackageREF getOneOfMe(){
        DmcTypeTestMultiLevelSubpackageREF rc = new DmcTypeTestMultiLevelSubpackageREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestMultiLevelSubpackageREF cloneValue(TestMultiLevelSubpackageREF val){
        TestMultiLevelSubpackageREF rc = new TestMultiLevelSubpackageREF(val);
        return(rc);
    }



}
