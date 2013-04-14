package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.dmt.shared.generated.types.DmtField;
/**
 * The DmtFieldIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1752)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:115)
 */
public class DmtFieldIterableDMW extends DmwMVIterator<DmtField> {

    public final static DmtFieldIterableDMW emptyList = new DmtFieldIterableDMW();

    protected DmtFieldIterableDMW(){
        super();
    }

    public DmtFieldIterableDMW(Iterator<DmtField> it){
        super(it);
    }

}

