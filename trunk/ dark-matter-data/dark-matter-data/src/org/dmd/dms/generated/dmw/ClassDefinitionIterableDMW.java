//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dms.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dms.generated.types.ClassDefinitionREF;
import org.dmd.dms.ClassDefinition;
/**
 * The ClassDefinitionIteratorDMW will cast from an underlying ClassDefinitionREF class to 
 * the associated wrapper class: ClassDefinition when accessing object references in a wrapper context.
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterableREF(GenUtility.java:996)
 */
public class ClassDefinitionIterableDMW extends DmwContainerIterator<ClassDefinition,ClassDefinitionREF> {

    public final static ClassDefinitionIterableDMW emptyList = new ClassDefinitionIterableDMW();

    protected ClassDefinitionIterableDMW(){
        super();
    }

    public ClassDefinitionIterableDMW(Iterator<ClassDefinitionREF> it){
        super(it);
    }

}

