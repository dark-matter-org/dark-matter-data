package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActionREF;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Action;
/**
 * The ActionIteratorDMW will cast from an underlying ActionREF class to 
 * the associated wrapper class: Action when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpIterable(BaseDMWGeneratorNew.java:237)
 */
public class ActionIterableDMW extends DmwContainerIterator<Action,ActionREF> {

    public final static ActionIterableDMW emptyList = new ActionIterableDMW();

    protected ActionIterableDMW(){
        super();
    }

    public ActionIterableDMW(Iterator<ActionREF> it){
        super(it);
    }

}

