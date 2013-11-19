package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmt.shared.generated.types.BaseObjREF;
import org.dmd.dmt.server.generated.dmw.BaseObjDMW;
/**
 * The BaseObjIteratorDMW will cast from an underlying BaseObjREF class to 
 * the associated wrapper class: BaseObjDMW when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:246)
 */
public class BaseObjIterableDMW extends DmwContainerIterator<BaseObjDMW,BaseObjREF> {

    public final static BaseObjIterableDMW emptyList = new BaseObjIterableDMW();

    protected BaseObjIterableDMW(){
        super();
    }

    public BaseObjIterableDMW(Iterator<BaseObjREF> it){
        super(it);
    }

}

