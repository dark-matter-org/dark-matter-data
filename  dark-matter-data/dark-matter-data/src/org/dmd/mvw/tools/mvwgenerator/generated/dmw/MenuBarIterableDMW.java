package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuBarREF;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuBar;
/**
 * The MenuBarIteratorDMW will cast from an underlying MenuBarREF class to 
 * the associated wrapper class: MenuBar when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:290)
 */
public class MenuBarIterableDMW extends DmwContainerIterator<MenuBar,MenuBarREF> {

    public final static MenuBarIterableDMW emptyList = new MenuBarIterableDMW();

    protected MenuBarIterableDMW(){
        super();
    }

    public MenuBarIterableDMW(Iterator<MenuBarREF> it){
        super(it);
    }

}

