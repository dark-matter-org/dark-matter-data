package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.EventSpec;
/**
 * The EventSpecIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1517)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:92)
 */
public class EventSpecIterableDMW extends DmwMVIterator<EventSpec> {

    public final static EventSpecIterableDMW emptyList = new EventSpecIterableDMW();

    protected EventSpecIterableDMW(){
        super();
    }

    public EventSpecIterableDMW(Iterator<EventSpec> it){
        super(it);
    }

}
