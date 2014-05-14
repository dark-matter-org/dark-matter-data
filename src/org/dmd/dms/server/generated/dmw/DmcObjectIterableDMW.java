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
// Called from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpIterable(DmwFormatter.java:459)
import java.util.Iterator;                // Because we're iterating - (DmwFormatter.java:452)
import org.dmd.core.DmcObject;            // This is the type we're iterating - (DmwFormatter.java:456)
import org.dmd.dmw.DmwMVIterator;         // The base multi-value iterator - (DmwFormatter.java:453)


/**
 * The DmcObjectIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpIterable(DmwFormatter.java:475)
 *    Called from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpTypeIterables(DmwFormatter.java:434)
 */
public class DmcObjectIterableDMW extends DmwMVIterator<DmcObject> {

    public final static DmcObjectIterableDMW emptyList = new DmcObjectIterableDMW();

    protected DmcObjectIterableDMW(){
        super();
    }

    public DmcObjectIterableDMW(Iterator<DmcObject> it){
        super(it);
    }

}

