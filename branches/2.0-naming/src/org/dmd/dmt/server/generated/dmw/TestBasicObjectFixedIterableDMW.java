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
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;  // dmo type import
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;  // wrapper type import
/**
 * The TestBasicObjectFixedIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1809)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:97)
 */
public class TestBasicObjectFixedIterableDMW extends DmwObjectIterator<TestBasicObjectFixedDMW, TestBasicObjectFixedDMO> {

    public final static TestBasicObjectFixedIterableDMW emptyList = new TestBasicObjectFixedIterableDMW();

    protected TestBasicObjectFixedIterableDMW(){
        super();
    }

    public TestBasicObjectFixedIterableDMW(Iterator<TestBasicObjectFixedDMO> it){
        super(it);
    }

}

