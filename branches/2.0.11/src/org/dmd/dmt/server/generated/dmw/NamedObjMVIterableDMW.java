package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.NamedObjMVDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.NamedObjMVDMW;  // wrapper type import
/**
 * The NamedObjMVIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1795)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:79)
 */
public class NamedObjMVIterableDMW extends DmwObjectIterator<NamedObjMVDMW, NamedObjMVDMO> {

    public final static NamedObjMVIterableDMW emptyList = new NamedObjMVIterableDMW();

    protected NamedObjMVIterableDMW(){
        super();
    }

    public NamedObjMVIterableDMW(Iterator<NamedObjMVDMO> it){
        super(it);
    }

}

