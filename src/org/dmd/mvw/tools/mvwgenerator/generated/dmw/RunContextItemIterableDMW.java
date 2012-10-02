package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.RunContextItemREF;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
/**
 * The RunContextItemIteratorDMW will cast from an underlying RunContextItemREF class to 
 * the associated wrapper class: RunContextItem when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpIterable(BaseDMWGeneratorNewest.java:245)
 */
public class RunContextItemIterableDMW extends DmwContainerIterator<RunContextItem,RunContextItemREF> {

    public final static RunContextItemIterableDMW emptyList = new RunContextItemIterableDMW();

    protected RunContextItemIterableDMW(){
        super();
    }

    public RunContextItemIterableDMW(Iterator<RunContextItemREF> it){
        super(it);
    }

}

