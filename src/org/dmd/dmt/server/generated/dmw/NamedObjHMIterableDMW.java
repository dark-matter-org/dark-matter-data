package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.NamedObjHMDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.NamedObjHMDMW;  // wrapper type import
/**
 * The NamedObjHMIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1806)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:84)
 */
public class NamedObjHMIterableDMW extends DmwObjectIterator<NamedObjHMDMW, NamedObjHMDMO> {

    public final static NamedObjHMIterableDMW emptyList = new NamedObjHMIterableDMW();

    protected NamedObjHMIterableDMW(){
        super();
    }

    public NamedObjHMIterableDMW(Iterator<NamedObjHMDMO> it){
        super(it);
    }

}

