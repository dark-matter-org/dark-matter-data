package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.ComponentREF;
import org.dmd.mvw.tools.mvwgenerator.extended.Component;
/**
 * The ComponentIteratorDMW will cast from an underlying ComponentREF class to 
 * the associated wrapper class: Component when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:289)
 */
public class ComponentIterableDMW extends DmwContainerIterator<Component,ComponentREF> {

    public final static ComponentIterableDMW emptyList = new ComponentIterableDMW();

    protected ComponentIterableDMW(){
        super();
    }

    public ComponentIterableDMW(Iterator<ComponentREF> it){
        super(it);
    }

}

