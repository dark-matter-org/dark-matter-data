package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjMVDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.UnnamedObjMVDMW;  // wrapper type import
/**
 * The UnnamedObjMVIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1743)
 *    Called from: org.dmd.dmg.generators.DmwDMWGenerator.createTypeIterables(DmwDMWGenerator.java:77)
 */
public class UnnamedObjMVIterableDMW extends DmwObjectIterator<UnnamedObjMVDMW, UnnamedObjMVDMO> {

    public final static UnnamedObjMVIterableDMW emptyList = new UnnamedObjMVIterableDMW();

    protected UnnamedObjMVIterableDMW(){
        super();
    }

    public UnnamedObjMVIterableDMW(Iterator<UnnamedObjMVDMO> it){
        super(it);
    }

}

