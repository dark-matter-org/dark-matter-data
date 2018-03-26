//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterableREF(GenUtility.java:1900)
import java.util.Iterator;                                           // Because we're iterating! - (GenUtility.java:1882)
import org.dmd.dms.ComplexTypeDefinition;                            // Because ComplexTypeDefinition uses extended wrappers - (GenUtility.java:1891)
import org.dmd.dms.generated.types.ComplexTypeDefinitionREF;         // To access our reference type - (GenUtility.java:1884)
import org.dmd.dmw.DmwContainerIterator;                             // Because we're extending the parameterized class - (GenUtility.java:1883)


/**
 * The ComplexTypeDefinitionIteratorDMW will cast from an underlying ComplexTypeDefinitionREF class to 
 * the associated wrapper class: ComplexTypeDefinition when accessing object references in a wrapper context.
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterableREF(GenUtility.java:1907)
 */
public class ComplexTypeDefinitionIterableDMW extends DmwContainerIterator<ComplexTypeDefinition,ComplexTypeDefinitionREF> {

    public final static ComplexTypeDefinitionIterableDMW emptyList = new ComplexTypeDefinitionIterableDMW();

    protected ComplexTypeDefinitionIterableDMW(){
        super();
    }

    public ComplexTypeDefinitionIterableDMW(Iterator<ComplexTypeDefinitionREF> it){
        super(it);
    }

}

