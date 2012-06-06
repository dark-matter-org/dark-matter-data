package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.SelectionTypeEnum;
/**
 * The SelectionTypeEnumIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1689)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:102)
 */
public class SelectionTypeEnumIterableDMW extends DmwMVIterator<SelectionTypeEnum> {

    public final static SelectionTypeEnumIterableDMW emptyList = new SelectionTypeEnumIterableDMW();

    protected SelectionTypeEnumIterableDMW(){
        super();
    }

    public SelectionTypeEnumIterableDMW(Iterator<SelectionTypeEnum> it){
        super(it);
    }

}

