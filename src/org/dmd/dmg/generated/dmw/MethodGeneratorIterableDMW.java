package org.dmd.dmg.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmg.generated.types.MethodGeneratorREF;
import org.dmd.dmg.extended.MethodGenerator;
/**
 * The MethodGeneratorIteratorDMW will cast from an underlying MethodGeneratorREF class to 
 * the associated wrapper class: MethodGenerator when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpIterable(BaseDMWGeneratorNewest.java:246)
 */
public class MethodGeneratorIterableDMW extends DmwContainerIterator<MethodGenerator,MethodGeneratorREF> {

    public final static MethodGeneratorIterableDMW emptyList = new MethodGeneratorIterableDMW();

    protected MethodGeneratorIterableDMW(){
        super();
    }

    public MethodGeneratorIterableDMW(Iterator<MethodGeneratorREF> it){
        super(it);
    }

}

