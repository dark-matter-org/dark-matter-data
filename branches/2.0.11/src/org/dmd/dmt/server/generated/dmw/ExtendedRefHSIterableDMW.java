package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefHSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.ExtendedRefHSDMW;  // wrapper type import
/**
 * The ExtendedRefHSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1795)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:79)
 */
public class ExtendedRefHSIterableDMW extends DmwObjectIterator<ExtendedRefHSDMW, ExtendedRefHSDMO> {

    public final static ExtendedRefHSIterableDMW emptyList = new ExtendedRefHSIterableDMW();

    protected ExtendedRefHSIterableDMW(){
        super();
    }

    public ExtendedRefHSIterableDMW(Iterator<ExtendedRefHSDMO> it){
        super(it);
    }

}

