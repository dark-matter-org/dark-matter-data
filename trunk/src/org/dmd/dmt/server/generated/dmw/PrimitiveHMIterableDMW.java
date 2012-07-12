package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.PrimitiveHMDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.PrimitiveHMDMW;  // wrapper type import
/**
 * The PrimitiveHMIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1784)
 *    Called from: org.dmd.dmg.generators.DmwDMWGenerator.createTypeIterables(DmwDMWGenerator.java:77)
 */
public class PrimitiveHMIterableDMW extends DmwObjectIterator<PrimitiveHMDMW, PrimitiveHMDMO> {

    public final static PrimitiveHMIterableDMW emptyList = new PrimitiveHMIterableDMW();

    protected PrimitiveHMIterableDMW(){
        super();
    }

    public PrimitiveHMIterableDMW(Iterator<PrimitiveHMDMO> it){
        super(it);
    }

}

