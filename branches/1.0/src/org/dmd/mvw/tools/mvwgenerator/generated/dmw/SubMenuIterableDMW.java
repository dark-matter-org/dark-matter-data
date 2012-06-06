package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.SubMenuREF;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.SubMenu;
/**
 * The SubMenuIteratorDMW will cast from an underlying SubMenuREF class to 
 * the associated wrapper class: SubMenu when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpIterable(BaseDMWGeneratorNewest.java:245)
 */
public class SubMenuIterableDMW extends DmwContainerIterator<SubMenu,SubMenuREF> {

    public final static SubMenuIterableDMW emptyList = new SubMenuIterableDMW();

    protected SubMenuIterableDMW(){
        super();
    }

    public SubMenuIterableDMW(Iterator<SubMenuREF> it){
        super(it);
    }

}

