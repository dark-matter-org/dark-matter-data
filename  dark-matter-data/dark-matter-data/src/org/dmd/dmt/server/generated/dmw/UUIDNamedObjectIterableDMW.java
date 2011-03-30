package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmt.shared.generated.types.UUIDNamedObjectREF;
import org.dmd.dmt.server.generated.dmw.UUIDNamedObjectDMW;
/**
 * The UUIDNamedObjectIteratorDMW will cast from an underlying UUIDNamedObjectREF class to 
 * the associated wrapper class: UUIDNamedObjectDMW when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:286)
 */
public class UUIDNamedObjectIterableDMW extends DmwContainerIterator<UUIDNamedObjectDMW,UUIDNamedObjectREF> {

    public final static UUIDNamedObjectIterableDMW emptyList = new UUIDNamedObjectIterableDMW();

    protected UUIDNamedObjectIterableDMW(){
        super();
    }

    public UUIDNamedObjectIterableDMW(Iterator<UUIDNamedObjectREF> it){
        super(it);
    }

}

