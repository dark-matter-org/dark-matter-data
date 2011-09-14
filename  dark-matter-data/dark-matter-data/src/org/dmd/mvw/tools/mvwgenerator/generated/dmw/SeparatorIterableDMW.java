package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.SeparatorREF;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Separator;
/**
 * The SeparatorIteratorDMW will cast from an underlying SeparatorREF class to 
 * the associated wrapper class: Separator when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpIterable(BaseDMWGeneratorNew.java:237)
 */
public class SeparatorIterableDMW extends DmwContainerIterator<Separator,SeparatorREF> {

    public final static SeparatorIterableDMW emptyList = new SeparatorIterableDMW();

    protected SeparatorIterableDMW(){
        super();
    }

    public SeparatorIterableDMW(Iterator<SeparatorREF> it){
        super(it);
    }

}

