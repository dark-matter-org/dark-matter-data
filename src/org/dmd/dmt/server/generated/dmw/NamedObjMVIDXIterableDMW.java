package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.NamedObjMVIDXDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.NamedObjMVIDXDMW;  // wrapper type import
/**
 * The NamedObjMVIDXIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:2001)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:102)
 */
public class NamedObjMVIDXIterableDMW extends DmwObjectIterator<NamedObjMVIDXDMW, NamedObjMVIDXDMO> {

    public final static NamedObjMVIDXIterableDMW emptyList = new NamedObjMVIDXIterableDMW();

    protected NamedObjMVIDXIterableDMW(){
        super();
    }

    public NamedObjMVIDXIterableDMW(Iterator<NamedObjMVIDXDMO> it){
        super(it);
    }

}

