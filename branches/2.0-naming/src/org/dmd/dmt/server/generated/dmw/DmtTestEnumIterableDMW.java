package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;
/**
 * The DmtTestEnumIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1752)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:104)
 */
public class DmtTestEnumIterableDMW extends DmwMVIterator<DmtTestEnum> {

    public final static DmtTestEnumIterableDMW emptyList = new DmtTestEnumIterableDMW();

    protected DmtTestEnumIterableDMW(){
        super();
    }

    public DmtTestEnumIterableDMW(Iterator<DmtTestEnum> it){
        super(it);
    }

}

