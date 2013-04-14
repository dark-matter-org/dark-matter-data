package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.PrimitiveMVIDXDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.PrimitiveMVIDXDMW;  // wrapper type import
/**
 * The PrimitiveMVIDXIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1806)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:79)
 */
public class PrimitiveMVIDXIterableDMW extends DmwObjectIterator<PrimitiveMVIDXDMW, PrimitiveMVIDXDMO> {

    public final static PrimitiveMVIDXIterableDMW emptyList = new PrimitiveMVIDXIterableDMW();

    protected PrimitiveMVIDXIterableDMW(){
        super();
    }

    public PrimitiveMVIDXIterableDMW(Iterator<PrimitiveMVIDXDMO> it){
        super(it);
    }

}

