package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.dmt.shared.generated.types.TestDerivedSubpackageREF;

import org.dmd.dmt.shared.generated.dmo.TestDerivedSubpackageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestDerivedSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:589)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTestDerivedSubpackageREF extends DmcTypeNamedObjectREF<TestDerivedSubpackageREF, DefinitionName> {

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
    protected DefinitionName getNewName(){
        return(new DefinitionName());
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

    @Override
    protected TestDerivedSubpackageREF typeCheck(Object value) throws DmcValueException {
        TestDerivedSubpackageREF rc = null;

        if (value instanceof TestDerivedSubpackageREF)
            rc = (TestDerivedSubpackageREF)value;
        else if (value instanceof TestDerivedSubpackageDMO)
            rc = new TestDerivedSubpackageREF((TestDerivedSubpackageDMO)value);
        else if (value instanceof DefinitionName)
            rc = new TestDerivedSubpackageREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new TestDerivedSubpackageREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestDerivedSubpackageREF, TestDerivedSubpackageDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TestDerivedSubpackageREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TestDerivedSubpackageREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TestDerivedSubpackageREF rc = new TestDerivedSubpackageREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TestDerivedSubpackageREF cloneValue(TestDerivedSubpackageREF value){
        return(new TestDerivedSubpackageREF(value));
    }



}
