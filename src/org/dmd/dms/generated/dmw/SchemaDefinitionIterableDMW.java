//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012-2021 dark-matter-data committers
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
// Called from: org.dmd.dms.util.GenUtility.dumpIterableREF(GenUtility.java:2074)
import java.util.Iterator;                                      // Because we're iterating! - (GenUtility.java:2056)
import org.dmd.dms.SchemaDefinition;                            // Because SchemaDefinition uses extended wrappers - (GenUtility.java:2065)
import org.dmd.dms.generated.types.SchemaDefinitionREF;         // To access our reference type - (GenUtility.java:2058)
import org.dmd.dmw.DmwContainerIterator;                        // Because we're extending the parameterized class - (GenUtility.java:2057)


/**
 * The SchemaDefinitionIteratorDMW will cast from an underlying SchemaDefinitionREF class to 
 * the associated wrapper class: SchemaDefinition when accessing object references in a wrapper context.
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterableREF(GenUtility.java:2081)
 */
public class SchemaDefinitionIterableDMW extends DmwContainerIterator<SchemaDefinition,SchemaDefinitionREF> {

    public final static SchemaDefinitionIterableDMW emptyList = new SchemaDefinitionIterableDMW();

    protected SchemaDefinitionIterableDMW(){
        super();
    }

    public SchemaDefinitionIterableDMW(Iterator<SchemaDefinitionREF> it){
        super(it);
    }

}

