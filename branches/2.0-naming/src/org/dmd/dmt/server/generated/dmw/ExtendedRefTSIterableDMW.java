package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefTSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.ExtendedRefTSDMW;  // wrapper type import
/**
 * The ExtendedRefTSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1809)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:90)
 */
public class ExtendedRefTSIterableDMW extends DmwObjectIterator<ExtendedRefTSDMW, ExtendedRefTSDMO> {

    public final static ExtendedRefTSIterableDMW emptyList = new ExtendedRefTSIterableDMW();

    protected ExtendedRefTSIterableDMW(){
        super();
    }

    public ExtendedRefTSIterableDMW(Iterator<ExtendedRefTSDMO> it){
        super(it);
    }

}

