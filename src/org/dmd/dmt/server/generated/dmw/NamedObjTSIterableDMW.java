package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.NamedObjTSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.NamedObjTSDMW;  // wrapper type import
/**
 * The NamedObjTSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:2001)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:102)
 */
public class NamedObjTSIterableDMW extends DmwObjectIterator<NamedObjTSDMW, NamedObjTSDMO> {

    public final static NamedObjTSIterableDMW emptyList = new NamedObjTSIterableDMW();

    protected NamedObjTSIterableDMW(){
        super();
    }

    public NamedObjTSIterableDMW(Iterator<NamedObjTSDMO> it){
        super(it);
    }

}

