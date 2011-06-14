package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.MvwDefinitionREF;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
/**
 * The MvwDefinitionIteratorDMW will cast from an underlying MvwDefinitionREF class to 
 * the associated wrapper class: MvwDefinition when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:290)
 */
public class MvwDefinitionIterableDMW extends DmwContainerIterator<MvwDefinition,MvwDefinitionREF> {

    public final static MvwDefinitionIterableDMW emptyList = new MvwDefinitionIterableDMW();

    protected MvwDefinitionIterableDMW(){
        super();
    }

    public MvwDefinitionIterableDMW(Iterator<MvwDefinitionREF> it){
        super(it);
    }

}

