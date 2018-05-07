package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;  // dmo type import
import org.dmd.dmt.server.extended.TestAbstractExtended;  // wrapper type import
/**
 * The TestAbstractExtendedIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1981)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:99)
 */
public class TestAbstractExtendedIterableDMW extends DmwObjectIterator<TestAbstractExtended, TestAbstractExtendedDMO> {

    public final static TestAbstractExtendedIterableDMW emptyList = new TestAbstractExtendedIterableDMW();

    protected TestAbstractExtendedIterableDMW(){
        super();
    }

    public TestAbstractExtendedIterableDMW(Iterator<TestAbstractExtendedDMO> it){
        super(it);
    }

}

