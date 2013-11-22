//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmg.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmg.generated.types.GenerationContextREF;
import org.dmd.dmg.extended.GenerationContext;
/**
 * The GenerationContextIteratorDMW will cast from an underlying GenerationContextREF class to 
 * the associated wrapper class: GenerationContext when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:247)
 */
public class GenerationContextIterableDMW extends DmwContainerIterator<GenerationContext,GenerationContextREF> {

    public final static GenerationContextIterableDMW emptyList = new GenerationContextIterableDMW();

    protected GenerationContextIterableDMW(){
        super();
    }

    public GenerationContextIterableDMW(Iterator<GenerationContextREF> it){
        super(it);
    }

}

