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
// Called from: org.dmd.dms.util.GenUtility.dumpIterableREF(GenUtility.java:2054)
import java.util.Iterator;                                // Because we're iterating! - (GenUtility.java:2036)
import org.dmd.dms.Dependency;                            // Because Dependency uses extended wrappers - (GenUtility.java:2045)
import org.dmd.dms.generated.types.DependencyREF;         // To access our reference type - (GenUtility.java:2038)
import org.dmd.dmw.DmwContainerIterator;                  // Because we're extending the parameterized class - (GenUtility.java:2037)


/**
 * The DependencyIteratorDMW will cast from an underlying DependencyREF class to 
 * the associated wrapper class: Dependency when accessing object references in a wrapper context.
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterableREF(GenUtility.java:2061)
 */
public class DependencyIterableDMW extends DmwContainerIterator<Dependency,DependencyREF> {

    public final static DependencyIterableDMW emptyList = new DependencyIterableDMW();

    protected DependencyIterableDMW(){
        super();
    }

    public DependencyIterableDMW(Iterator<DependencyREF> it){
        super(it);
    }

}

