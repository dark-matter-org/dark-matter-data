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
package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.PrimitiveHSDMW;  // wrapper type import
/**
 * The PrimitiveHSIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1809)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:92)
 */
public class PrimitiveHSIterableDMW extends DmwObjectIterator<PrimitiveHSDMW, PrimitiveHSDMO> {

    public final static PrimitiveHSIterableDMW emptyList = new PrimitiveHSIterableDMW();

    protected PrimitiveHSIterableDMW(){
        super();
    }

    public PrimitiveHSIterableDMW(Iterator<PrimitiveHSDMO> it){
        super(it);
    }

}

