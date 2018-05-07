package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.NamedObjHSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.NamedObjHSDMW;  // wrapper type import
/**
 * The NamedObjHSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1981)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:99)
 */
public class NamedObjHSIterableDMW extends DmwObjectIterator<NamedObjHSDMW, NamedObjHSDMO> {

    public final static NamedObjHSIterableDMW emptyList = new NamedObjHSIterableDMW();

    protected NamedObjHSIterableDMW(){
        super();
    }

    public NamedObjHSIterableDMW(Iterator<NamedObjHSDMO> it){
        super(it);
    }

}

