package org.dmd.dmg.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;  // dmo type import
import org.dmd.dmg.generated.dmw.DmgConfigDMW;  // wrapper type import
/**
 * The DmgConfigIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1530)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:149)
 */
public class DmgConfigIterableDMW extends DmwObjectIterator<DmgConfigDMW, DmgConfigDMO> {

    public final static DmgConfigIterableDMW emptyList = new DmgConfigIterableDMW();

    protected DmgConfigIterableDMW(){
        super();
    }

    public DmgConfigIterableDMW(Iterator<DmgConfigDMO> it){
        super(it);
    }

}

