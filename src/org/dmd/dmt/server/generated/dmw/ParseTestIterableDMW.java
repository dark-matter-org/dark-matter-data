package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ParseTestDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.ParseTestDMW;  // wrapper type import
/**
 * The ParseTestIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1806)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:86)
 */
public class ParseTestIterableDMW extends DmwObjectIterator<ParseTestDMW, ParseTestDMO> {

    public final static ParseTestIterableDMW emptyList = new ParseTestIterableDMW();

    protected ParseTestIterableDMW(){
        super();
    }

    public ParseTestIterableDMW(Iterator<ParseTestDMO> it){
        super(it);
    }

}

