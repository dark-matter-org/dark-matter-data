package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.NamedObjTMDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.NamedObjTMDMW;  // wrapper type import
/**
 * The NamedObjTMIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1827)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:99)
 */
public class NamedObjTMIterableDMW extends DmwObjectIterator<NamedObjTMDMW, NamedObjTMDMO> {

    public final static NamedObjTMIterableDMW emptyList = new NamedObjTMIterableDMW();

    protected NamedObjTMIterableDMW(){
        super();
    }

    public NamedObjTMIterableDMW(Iterator<NamedObjTMDMO> it){
        super(it);
    }

}

