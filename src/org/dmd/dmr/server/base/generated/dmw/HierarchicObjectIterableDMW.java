package org.dmd.dmr.server.base.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmr.shared.base.generated.types.HierarchicObjectREF;
import org.dmd.dmr.server.base.extended.HierarchicObject;
/**
 * The HierarchicObjectIteratorDMW will cast from an underlying HierarchicObjectREF class to 
 * the associated wrapper class: HierarchicObject when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmrbase schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:247)
 */
public class HierarchicObjectIterableDMW extends DmwContainerIterator<HierarchicObject,HierarchicObjectREF> {

    public final static HierarchicObjectIterableDMW emptyList = new HierarchicObjectIterableDMW();

    protected HierarchicObjectIterableDMW(){
        super();
    }

    public HierarchicObjectIterableDMW(Iterator<HierarchicObjectREF> it){
        super(it);
    }

}

