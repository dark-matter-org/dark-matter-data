package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.ControllerREF;
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
/**
 * The ControllerIteratorDMW will cast from an underlying ControllerREF class to 
 * the associated wrapper class: Controller when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpIterable(BaseDMWGeneratorNew.java:246)
 */
public class ControllerIterableDMW extends DmwContainerIterator<Controller,ControllerREF> {

    public final static ControllerIterableDMW emptyList = new ControllerIterableDMW();

    protected ControllerIterableDMW(){
        super();
    }

    public ControllerIterableDMW(Iterator<ControllerREF> it){
        super(it);
    }

}

