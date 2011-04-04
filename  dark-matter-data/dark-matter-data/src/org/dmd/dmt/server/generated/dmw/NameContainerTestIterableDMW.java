package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;
/**
 * The NameContainerTestIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1144)
 */
public class NameContainerTestIterableDMW extends DmwMVIterator<NameContainerTestDMO> {

    public final static NameContainerTestIterableDMW emptyList = new NameContainerTestIterableDMW();

    protected NameContainerTestIterableDMW(){
        super();
    }

    public NameContainerTestIterableDMW(Iterator<NameContainerTestDMO> it){
        super(it);
    }

}

