package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmt.shared.generated.types.IntegerNamedObjectREF;
import org.dmd.dmt.server.generated.dmw.IntegerNamedObjectDMW;
/**
 * The IntegerNamedObjectIteratorDMW will cast from an underlying IntegerNamedObjectREF class to 
 * the associated wrapper class: IntegerNamedObjectDMW when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:290)
 */
public class IntegerNamedObjectIterableDMW extends DmwContainerIterator<IntegerNamedObjectDMW,IntegerNamedObjectREF> {

    public final static IntegerNamedObjectIterableDMW emptyList = new IntegerNamedObjectIterableDMW();

    protected IntegerNamedObjectIterableDMW(){
        super();
    }

    public IntegerNamedObjectIterableDMW(Iterator<IntegerNamedObjectREF> it){
        super(it);
    }

}

