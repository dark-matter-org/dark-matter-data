package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.TestAbstractFixedDMW;  // wrapper type import
/**
 * The TestAbstractFixedIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:2001)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:102)
 */
public class TestAbstractFixedIterableDMW extends DmwObjectIterator<TestAbstractFixedDMW, TestAbstractFixedDMO> {

    public final static TestAbstractFixedIterableDMW emptyList = new TestAbstractFixedIterableDMW();

    protected TestAbstractFixedIterableDMW(){
        super();
    }

    public TestAbstractFixedIterableDMW(Iterator<TestAbstractFixedDMO> it){
        super(it);
    }

}

