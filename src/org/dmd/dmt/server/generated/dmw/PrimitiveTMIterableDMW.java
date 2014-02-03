package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.PrimitiveTMDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.PrimitiveTMDMW;  // wrapper type import
/**
 * The PrimitiveTMIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1809)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:98)
 */
public class PrimitiveTMIterableDMW extends DmwObjectIterator<PrimitiveTMDMW, PrimitiveTMDMO> {

    public final static PrimitiveTMIterableDMW emptyList = new PrimitiveTMIterableDMW();

    protected PrimitiveTMIterableDMW(){
        super();
    }

    public PrimitiveTMIterableDMW(Iterator<PrimitiveTMDMO> it){
        super(it);
    }

}

