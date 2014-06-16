package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.PrimitiveSVDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.PrimitiveSVDMW;  // wrapper type import
/**
 * The PrimitiveSVIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1795)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:79)
 */
public class PrimitiveSVIterableDMW extends DmwObjectIterator<PrimitiveSVDMW, PrimitiveSVDMO> {

    public final static PrimitiveSVIterableDMW emptyList = new PrimitiveSVIterableDMW();

    protected PrimitiveSVIterableDMW(){
        super();
    }

    public PrimitiveSVIterableDMW(Iterator<PrimitiveSVDMO> it){
        super(it);
    }

}

