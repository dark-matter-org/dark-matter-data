package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVIDXDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.ExtendedRefMVIDXDMW;  // wrapper type import
/**
 * The ExtendedRefMVIDXIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1743)
 *    Called from: org.dmd.dmg.generators.DmwDMWGenerator.createTypeIterables(DmwDMWGenerator.java:77)
 */
public class ExtendedRefMVIDXIterableDMW extends DmwObjectIterator<ExtendedRefMVIDXDMW, ExtendedRefMVIDXDMO> {

    public final static ExtendedRefMVIDXIterableDMW emptyList = new ExtendedRefMVIDXIterableDMW();

    protected ExtendedRefMVIDXIterableDMW(){
        super();
    }

    public ExtendedRefMVIDXIterableDMW(Iterator<ExtendedRefMVIDXDMO> it){
        super(it);
    }

}
