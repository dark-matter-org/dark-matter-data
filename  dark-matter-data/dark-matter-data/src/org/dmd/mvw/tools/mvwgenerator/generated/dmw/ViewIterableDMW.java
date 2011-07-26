package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.ViewREF;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
/**
 * The ViewIteratorDMW will cast from an underlying ViewREF class to 
 * the associated wrapper class: View when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:291)
 */
public class ViewIterableDMW extends DmwContainerIterator<View,ViewREF> {

    public final static ViewIterableDMW emptyList = new ViewIterableDMW();

    protected ViewIterableDMW(){
        super();
    }

    public ViewIterableDMW(Iterator<ViewREF> it){
        super(it);
    }

}

