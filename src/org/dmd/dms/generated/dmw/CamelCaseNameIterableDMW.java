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
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1757)
import java.util.Iterator;                      // Beacuse we're iterating - (GenUtility.java:1750)
import org.dmd.dmc.types.CamelCaseName;         // This is the type we're iterating - (GenUtility.java:1754)
import org.dmd.dmw.DmwMVIterator;               // The base multi-value iterator - (GenUtility.java:1751)


/**
 * The CamelCaseNameIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1773)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpTypeIterables(MetaGenerator.java:694)
 */
public class CamelCaseNameIterableDMW extends DmwMVIterator<CamelCaseName> {

    public final static CamelCaseNameIterableDMW emptyList = new CamelCaseNameIterableDMW();

    protected CamelCaseNameIterableDMW(){
        super();
    }

    public CamelCaseNameIterableDMW(Iterator<CamelCaseName> it){
        super(it);
    }

}

