package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefSVDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.ExtendedRefSVDMW;  // wrapper type import
/**
 * The ExtendedRefSVIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1776)
 *    Called from: org.dmd.dmg.generators.DmwDMWGenerator.createTypeIterables(DmwDMWGenerator.java:77)
 */
public class ExtendedRefSVIterableDMW extends DmwObjectIterator<ExtendedRefSVDMW, ExtendedRefSVDMO> {

    public final static ExtendedRefSVIterableDMW emptyList = new ExtendedRefSVIterableDMW();

    protected ExtendedRefSVIterableDMW(){
        super();
    }

    public ExtendedRefSVIterableDMW(Iterator<ExtendedRefSVDMO> it){
        super(it);
    }

}

