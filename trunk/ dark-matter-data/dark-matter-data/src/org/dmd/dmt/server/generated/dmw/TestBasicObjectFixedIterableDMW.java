package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;  // wrapper type import
/**
 * The TestBasicObjectFixedIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1682)
 *    Called from: org.dmd.dmg.generators.DmwDMWGenerator.createTypeIterables(DmwDMWGenerator.java:77)
 */
public class TestBasicObjectFixedIterableDMW extends DmwObjectIterator<TestBasicObjectFixedDMW, TestBasicObjectFixedDMO> {

    public final static TestBasicObjectFixedIterableDMW emptyList = new TestBasicObjectFixedIterableDMW();

    protected TestBasicObjectFixedIterableDMW(){
        super();
    }

    public TestBasicObjectFixedIterableDMW(Iterator<TestBasicObjectFixedDMO> it){
        super(it);
    }

}

