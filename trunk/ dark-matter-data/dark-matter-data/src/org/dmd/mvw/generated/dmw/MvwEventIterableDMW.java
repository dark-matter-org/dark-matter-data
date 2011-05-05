package org.dmd.mvw.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.generated.types.MvwEventREF;
import org.dmd.mvw.extended.MvwEvent;
/**
 * The MvwEventIteratorDMW will cast from an underlying MvwEventREF class to 
 * the associated wrapper class: MvwEvent when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:289)
 */
public class MvwEventIterableDMW extends DmwContainerIterator<MvwEvent,MvwEventREF> {

    public final static MvwEventIterableDMW emptyList = new MvwEventIterableDMW();

    protected MvwEventIterableDMW(){
        super();
    }

    public MvwEventIterableDMW(Iterator<MvwEventREF> it){
        super(it);
    }

}

