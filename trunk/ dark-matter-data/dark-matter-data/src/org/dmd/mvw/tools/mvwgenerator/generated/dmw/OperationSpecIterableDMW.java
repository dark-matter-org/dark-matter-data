package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.OperationSpec;
/**
 * The OperationSpecIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1515)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:163)
 */
public class OperationSpecIterableDMW extends DmwMVIterator<OperationSpec> {

    public final static OperationSpecIterableDMW emptyList = new OperationSpecIterableDMW();

    protected OperationSpecIterableDMW(){
        super();
    }

    public OperationSpecIterableDMW(Iterator<OperationSpec> it){
        super(it);
    }

}

