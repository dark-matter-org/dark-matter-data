package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.mvw.tools.mvwgenerator.types.MethodWithArgs;
/**
 * The MethodWithArgsIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1689)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:91)
 */
public class MethodWithArgsIterableDMW extends DmwMVIterator<MethodWithArgs> {

    public final static MethodWithArgsIterableDMW emptyList = new MethodWithArgsIterableDMW();

    protected MethodWithArgsIterableDMW(){
        super();
    }

    public MethodWithArgsIterableDMW(Iterator<MethodWithArgs> it){
        super(it);
    }

}

