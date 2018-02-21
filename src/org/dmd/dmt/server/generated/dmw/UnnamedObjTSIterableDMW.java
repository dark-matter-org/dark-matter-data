package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjTSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.UnnamedObjTSDMW;  // wrapper type import
/**
 * The UnnamedObjTSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1824)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:99)
 */
public class UnnamedObjTSIterableDMW extends DmwObjectIterator<UnnamedObjTSDMW, UnnamedObjTSDMO> {

    public final static UnnamedObjTSIterableDMW emptyList = new UnnamedObjTSIterableDMW();

    protected UnnamedObjTSIterableDMW(){
        super();
    }

    public UnnamedObjTSIterableDMW(Iterator<UnnamedObjTSDMO> it){
        super(it);
    }

}

