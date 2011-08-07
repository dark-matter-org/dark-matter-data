package org.dmd.dmp.server.servlet.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmp.server.servlet.generated.types.PluginConfigREF;
import org.dmd.dmp.server.servlet.extended.PluginConfig;
/**
 * The PluginConfigIteratorDMW will cast from an underlying PluginConfigREF class to 
 * the associated wrapper class: PluginConfig when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpIterable(BaseDMWGeneratorNew.java:232)
 */
public class PluginConfigIterableDMW extends DmwContainerIterator<PluginConfig,PluginConfigREF> {

    public final static PluginConfigIterableDMW emptyList = new PluginConfigIterableDMW();

    protected PluginConfigIterableDMW(){
        super();
    }

    public PluginConfigIterableDMW(Iterator<PluginConfigREF> it){
        super(it);
    }

}

