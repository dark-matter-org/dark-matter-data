package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.NameContainerTestDMW;  // wrapper type import
/**
 * The NameContainerTestIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1740)
 *    Called from: org.dmd.dmg.generators.DmwDMWGenerator.createTypeIterables(DmwDMWGenerator.java:77)
 */
public class NameContainerTestIterableDMW extends DmwObjectIterator<NameContainerTestDMW, NameContainerTestDMO> {

    public final static NameContainerTestIterableDMW emptyList = new NameContainerTestIterableDMW();

    protected NameContainerTestIterableDMW(){
        super();
    }

    public NameContainerTestIterableDMW(Iterator<NameContainerTestDMO> it){
        super(it);
    }

}

