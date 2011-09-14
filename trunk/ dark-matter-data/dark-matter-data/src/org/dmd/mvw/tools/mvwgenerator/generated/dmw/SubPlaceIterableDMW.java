package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.SubPlaceREF;
import org.dmd.mvw.tools.mvwgenerator.extended.SubPlace;
/**
 * The SubPlaceIteratorDMW will cast from an underlying SubPlaceREF class to 
 * the associated wrapper class: SubPlace when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpIterable(BaseDMWGeneratorNew.java:237)
 */
public class SubPlaceIterableDMW extends DmwContainerIterator<SubPlace,SubPlaceREF> {

    public final static SubPlaceIterableDMW emptyList = new SubPlaceIterableDMW();

    protected SubPlaceIterableDMW(){
        super();
    }

    public SubPlaceIterableDMW(Iterator<SubPlaceREF> it){
        super(it);
    }

}

