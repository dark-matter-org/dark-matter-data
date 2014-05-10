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
package org.dmd.dms.server.generated.dmw;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpIterableREF(DmwFormatter.java:342)
import java.util.Iterator;                                               // Because we're iterating! - (DmwFormatter.java:324)
import org.dmd.dms.server.extended.DSDefinitionModule;                   // Because DSDefinitionModule uses extended wrappers - (DmwFormatter.java:333)
import org.dmd.dms.shared.generated.types.DSDefinitionModuleREF;         // To access our reference type - (DmwFormatter.java:326)
import org.dmd.dmw.DmwContainerIterator;                                 // Because we're extending the parameterized class - (DmwFormatter.java:325)


/**
 * The DSDefinitionModuleIteratorDMW will cast from an underlying DSDefinitionModuleREF class to 
 * the associated wrapper class: DSDefinitionModule when accessing object references in a wrapper context.
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpIterableREF(DmwFormatter.java:349)
 */
public class DSDefinitionModuleIterableDMW extends DmwContainerIterator<DSDefinitionModule,DSDefinitionModuleREF> {

    public final static DSDefinitionModuleIterableDMW emptyList = new DSDefinitionModuleIterableDMW();

    protected DSDefinitionModuleIterableDMW(){
        super();
    }

    public DSDefinitionModuleIterableDMW(Iterator<DSDefinitionModuleREF> it){
        super(it);
    }

}

