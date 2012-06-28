package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmt.shared.generated.types.SomeRelation;
import org.dmd.dmt.server.extended.ObjWithRefs;

/**
 * The SomeRelationIteratorDMW will cast from an underlying SomeRelation class to 
 * the associated wrapper class: ObjWithRefs when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpExtendedReferenceIterable(BaseDMWGeneratorNewest.java:305)
 */
public class SomeRelationIterableDMW extends DmwContainerIterator<ObjWithRefs,SomeRelation> {

    public final static SomeRelationIterableDMW emptyList = new SomeRelationIterableDMW();

    protected SomeRelationIterableDMW(){
        super();
    }

    public SomeRelationIterableDMW(Iterator<SomeRelation> it){
        super(it);
    }

}

