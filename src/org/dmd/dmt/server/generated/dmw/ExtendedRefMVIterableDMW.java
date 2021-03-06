package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.ExtendedRefMVDMW;  // wrapper type import
/**
 * The ExtendedRefMVIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:2001)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:102)
 */
public class ExtendedRefMVIterableDMW extends DmwObjectIterator<ExtendedRefMVDMW, ExtendedRefMVDMO> {

    public final static ExtendedRefMVIterableDMW emptyList = new ExtendedRefMVIterableDMW();

    protected ExtendedRefMVIterableDMW(){
        super();
    }

    public ExtendedRefMVIterableDMW(Iterator<ExtendedRefMVDMO> it){
        super(it);
    }

}

