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
// Called from: org.dmd.dms.tools.meta.DmwFormatter.dumpIterable(DmwFormatter.java:464)
import java.util.Iterator;                                      // Because we're iterating - (DmwFormatter.java:457)
import org.dmd.dms.shared.generated.enums.BaseTypeEnum;         // This is the type we're iterating - (DmwFormatter.java:461)
import org.dmd.dmw.DmwMVIterator;                               // The base multi-value iterator - (DmwFormatter.java:458)


/**
 * The BaseTypeEnumIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.meta.DmwFormatter.dumpIterable(DmwFormatter.java:480)
 *    Called from: org.dmd.dms.tools.meta.DmwFormatter.dumpTypeIterables(DmwFormatter.java:439)
 */
public class BaseTypeEnumIterableDMW extends DmwMVIterator<BaseTypeEnum> {

    public final static BaseTypeEnumIterableDMW emptyList = new BaseTypeEnumIterableDMW();

    protected BaseTypeEnumIterableDMW(){
        super();
    }

    public BaseTypeEnumIterableDMW(Iterator<BaseTypeEnum> it){
        super(it);
    }

}

