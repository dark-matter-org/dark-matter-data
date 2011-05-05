package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.DMOViewREF;
import org.dmd.mvw.tools.mvwgenerator.extended.DMOView;
/**
 * The DMOViewIteratorDMW will cast from an underlying DMOViewREF class to 
 * the associated wrapper class: DMOView when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:289)
 */
public class DMOViewIterableDMW extends DmwContainerIterator<DMOView,DMOViewREF> {

    public final static DMOViewIterableDMW emptyList = new DMOViewIterableDMW();

    protected DMOViewIterableDMW(){
        super();
    }

    public DMOViewIterableDMW(Iterator<DMOViewREF> it){
        super(it);
    }

}

