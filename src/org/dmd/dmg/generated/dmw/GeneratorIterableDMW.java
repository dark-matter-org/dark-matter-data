package org.dmd.dmg.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import org.dmd.dmg.types.Generator;
/**
 * The GeneratorIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1693)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:91)
 */
public class GeneratorIterableDMW extends DmwMVIterator<Generator> {

    public final static GeneratorIterableDMW emptyList = new GeneratorIterableDMW();

    protected GeneratorIterableDMW(){
        super();
    }

    public GeneratorIterableDMW(Iterator<Generator> it){
        super(it);
    }

}

