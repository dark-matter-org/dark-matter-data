//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1928)
import java.util.Iterator;                                             // Beacuse we're iterating - (GenUtility.java:1921)
import org.dmd.dmv.shared.generated.enums.NumericRelationEnum;         // This is the type we're iterating - (GenUtility.java:1925)
import org.dmd.dmw.DmwMVIterator;                                      // The base multi-value iterator - (GenUtility.java:1922)


/**
 * The NumericRelationEnumIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1944)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:124)
 */
public class NumericRelationEnumIterableDMW extends DmwMVIterator<NumericRelationEnum> {

    public final static NumericRelationEnumIterableDMW emptyList = new NumericRelationEnumIterableDMW();

    protected NumericRelationEnumIterableDMW(){
        super();
    }

    public NumericRelationEnumIterableDMW(Iterator<NumericRelationEnum> it){
        super(it);
    }

}

