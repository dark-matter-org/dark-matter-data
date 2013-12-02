package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjSVDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.UnnamedObjSVDMW;  // wrapper type import
/**
 * The UnnamedObjSVIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1809)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:90)
 */
public class UnnamedObjSVIterableDMW extends DmwObjectIterator<UnnamedObjSVDMW, UnnamedObjSVDMO> {

    public final static UnnamedObjSVIterableDMW emptyList = new UnnamedObjSVIterableDMW();

    protected UnnamedObjSVIterableDMW(){
        super();
    }

    public UnnamedObjSVIterableDMW(Iterator<UnnamedObjSVDMO> it){
        super(it);
    }

}

