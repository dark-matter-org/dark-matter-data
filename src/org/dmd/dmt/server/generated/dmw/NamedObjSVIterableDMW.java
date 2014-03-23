package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.NamedObjSVDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.NamedObjSVDMW;  // wrapper type import
/**
 * The NamedObjSVIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1815)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:99)
 */
public class NamedObjSVIterableDMW extends DmwObjectIterator<NamedObjSVDMW, NamedObjSVDMO> {

    public final static NamedObjSVIterableDMW emptyList = new NamedObjSVIterableDMW();

    protected NamedObjSVIterableDMW(){
        super();
    }

    public NamedObjSVIterableDMW(Iterator<NamedObjSVDMO> it){
        super(it);
    }

}

