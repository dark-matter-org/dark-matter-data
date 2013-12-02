package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.PrimitiveTSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.PrimitiveTSDMW;  // wrapper type import
/**
 * The PrimitiveTSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1809)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:90)
 */
public class PrimitiveTSIterableDMW extends DmwObjectIterator<PrimitiveTSDMW, PrimitiveTSDMO> {

    public final static PrimitiveTSIterableDMW emptyList = new PrimitiveTSIterableDMW();

    protected PrimitiveTSIterableDMW(){
        super();
    }

    public PrimitiveTSIterableDMW(Iterator<PrimitiveTSDMO> it){
        super(it);
    }

}

