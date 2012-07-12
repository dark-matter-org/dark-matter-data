package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.PrimitiveHSDMW;  // wrapper type import
/**
 * The PrimitiveHSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1784)
 *    Called from: org.dmd.dmg.generators.DmwDMWGenerator.createTypeIterables(DmwDMWGenerator.java:77)
 */
public class PrimitiveHSIterableDMW extends DmwObjectIterator<PrimitiveHSDMW, PrimitiveHSDMO> {

    public final static PrimitiveHSIterableDMW emptyList = new PrimitiveHSIterableDMW();

    protected PrimitiveHSIterableDMW(){
        super();
    }

    public PrimitiveHSIterableDMW(Iterator<PrimitiveHSDMO> it){
        super(it);
    }

}

