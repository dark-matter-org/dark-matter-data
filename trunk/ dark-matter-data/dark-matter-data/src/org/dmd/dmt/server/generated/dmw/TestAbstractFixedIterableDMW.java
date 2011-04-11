package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;
/**
 * The TestAbstractFixedIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1167)
 */
public class TestAbstractFixedIterableDMW extends DmwMVIterator<TestAbstractFixedDMO> {

    public final static TestAbstractFixedIterableDMW emptyList = new TestAbstractFixedIterableDMW();

    protected TestAbstractFixedIterableDMW(){
        super();
    }

    public TestAbstractFixedIterableDMW(Iterator<TestAbstractFixedDMO> it){
        super(it);
    }

}

