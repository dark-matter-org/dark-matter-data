package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.PlaceREF;
import org.dmd.mvw.tools.mvwgenerator.extended.Place;
/**
 * The PlaceIteratorDMW will cast from an underlying PlaceREF class to 
 * the associated wrapper class: Place when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:291)
 */
public class PlaceIterableDMW extends DmwContainerIterator<Place,PlaceREF> {

    public final static PlaceIterableDMW emptyList = new PlaceIterableDMW();

    protected PlaceIterableDMW(){
        super();
    }

    public PlaceIterableDMW(Iterator<PlaceREF> it){
        super(it);
    }

}

