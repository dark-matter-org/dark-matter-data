package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.ImplAndClass;
/**
 * The ImplAndClassIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1476)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:163)
 */
public class ImplAndClassIterableDMW extends DmwMVIterator<ImplAndClass> {

    public final static ImplAndClassIterableDMW emptyList = new ImplAndClassIterableDMW();

    protected ImplAndClassIterableDMW(){
        super();
    }

    public ImplAndClassIterableDMW(Iterator<ImplAndClass> it){
        super(it);
    }

}

