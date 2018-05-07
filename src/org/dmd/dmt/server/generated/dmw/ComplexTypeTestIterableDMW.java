package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ComplexTypeTestDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.ComplexTypeTestDMW;  // wrapper type import
/**
 * The ComplexTypeTestIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1981)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:99)
 */
public class ComplexTypeTestIterableDMW extends DmwObjectIterator<ComplexTypeTestDMW, ComplexTypeTestDMO> {

    public final static ComplexTypeTestIterableDMW emptyList = new ComplexTypeTestIterableDMW();

    protected ComplexTypeTestIterableDMW(){
        super();
    }

    public ComplexTypeTestIterableDMW(Iterator<ComplexTypeTestDMO> it){
        super(it);
    }

}

