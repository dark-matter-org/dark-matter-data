package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.PresenterREF;
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
/**
 * The PresenterIteratorDMW will cast from an underlying PresenterREF class to 
 * the associated wrapper class: Presenter when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpIterable(BaseDMWGeneratorNewest.java:245)
 */
public class PresenterIterableDMW extends DmwContainerIterator<Presenter,PresenterREF> {

    public final static PresenterIterableDMW emptyList = new PresenterIterableDMW();

    protected PresenterIterableDMW(){
        super();
    }

    public PresenterIterableDMW(Iterator<PresenterREF> it){
        super(it);
    }

}

