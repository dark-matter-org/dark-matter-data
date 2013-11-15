package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjHSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.UnnamedObjHSDMW;  // wrapper type import
/**
 * The UnnamedObjHSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1806)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:86)
 */
public class UnnamedObjHSIterableDMW extends DmwObjectIterator<UnnamedObjHSDMW, UnnamedObjHSDMO> {

    public final static UnnamedObjHSIterableDMW emptyList = new UnnamedObjHSIterableDMW();

    protected UnnamedObjHSIterableDMW(){
        super();
    }

    public UnnamedObjHSIterableDMW(Iterator<UnnamedObjHSDMO> it){
        super(it);
    }

}

