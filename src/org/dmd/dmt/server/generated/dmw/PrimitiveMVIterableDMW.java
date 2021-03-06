package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.PrimitiveMVDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.PrimitiveMVDMW;  // wrapper type import
/**
 * The PrimitiveMVIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:2001)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:102)
 */
public class PrimitiveMVIterableDMW extends DmwObjectIterator<PrimitiveMVDMW, PrimitiveMVDMO> {

    public final static PrimitiveMVIterableDMW emptyList = new PrimitiveMVIterableDMW();

    protected PrimitiveMVIterableDMW(){
        super();
    }

    public PrimitiveMVIterableDMW(Iterator<PrimitiveMVDMO> it){
        super(it);
    }

}

