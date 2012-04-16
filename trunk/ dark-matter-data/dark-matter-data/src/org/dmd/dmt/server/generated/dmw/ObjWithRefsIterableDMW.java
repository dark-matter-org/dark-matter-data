package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;
import org.dmd.dmt.server.extended.ObjWithRefs;
/**
 * The ObjWithRefsIteratorDMW will cast from an underlying ObjWithRefsREF class to 
 * the associated wrapper class: ObjWithRefs when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpIterable(BaseDMWGeneratorNew.java:246)
 */
public class ObjWithRefsIterableDMW extends DmwContainerIterator<ObjWithRefs,ObjWithRefsREF> {

    public final static ObjWithRefsIterableDMW emptyList = new ObjWithRefsIterableDMW();

    protected ObjWithRefsIterableDMW(){
        super();
    }

    public ObjWithRefsIterableDMW(Iterator<ObjWithRefsREF> it){
        super(it);
    }

}

