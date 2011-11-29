package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.dmt.shared.generated.types.SomeRelation;
/**
 * The SomeRelationIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1547)
 *    Called from: org.dmd.dmg.generators.DmwDMWGenerator.createTypeIterables(DmwDMWGenerator.java:89)
 */
public class SomeRelationIterableDMW extends DmwMVIterator<SomeRelation> {

    public final static SomeRelationIterableDMW emptyList = new SomeRelationIterableDMW();

    protected SomeRelationIterableDMW(){
        super();
    }

    public SomeRelationIterableDMW(Iterator<SomeRelation> it){
        super(it);
    }

}

