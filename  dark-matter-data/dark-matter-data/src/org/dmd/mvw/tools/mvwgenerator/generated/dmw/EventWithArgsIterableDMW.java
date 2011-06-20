package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.mvw.tools.mvwgenerator.types.EventWithArgs;
/**
 * The EventWithArgsIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1359)
 *    Called from:  org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:163)
 */
public class EventWithArgsIterableDMW extends DmwMVIterator<EventWithArgs> {

    public final static EventWithArgsIterableDMW emptyList = new EventWithArgsIterableDMW();

    protected EventWithArgsIterableDMW(){
        super();
    }

    public EventWithArgsIterableDMW(Iterator<EventWithArgs> it){
        super(it);
    }

}

