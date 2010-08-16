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
package org.dmd.dmc;

import org.junit.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.DmcTypeInteger;
import org.dmd.dmc.types.DmcTypeString;

public class TestDmcObject {
	
	private DmcObject dmo;
	
	@Before
	public void initialize(){
		dmo = new DmcObject();
	}

	@Test
	public void testInstantion(){
		assertNotNull("DmcObject should be instantiated without Exceptions", dmo);
	}
	
	@Test
	public void testSetString() throws InstantiationException, IllegalAccessException, DmcValueException {
		String value = "testValue";
		
		dmo.set("attr", DmcTypeString.class, "testValue");
		assertEquals("Single valued String is set and returned", value, dmo.get("attr").getSV());
	}
	
	@Test
	public void testSetIntegerAsInt() throws InstantiationException, IllegalAccessException, DmcValueException {
		Integer value = 9;
		
		dmo.set("attr", DmcTypeInteger.class, 9);
		assertEquals("Single valued Integer is set and returned", value, dmo.get("attr").getSV());
	}
	
	@Test
	public void testSetIntegerAsInteger() throws InstantiationException, IllegalAccessException, DmcValueException {
		Integer value = 9;
		
		dmo.set("attr", DmcTypeInteger.class, new Integer(9));
		assertEquals("Single valued Integer is set and returned", value, dmo.get("attr").getSV());
	}
	
	@Test
	public void testSetIntegerAsString() throws InstantiationException, IllegalAccessException, DmcValueException {
		Integer value = 9;
		
		dmo.set("attr", DmcTypeInteger.class, "9");
		assertEquals("Single valued Integer is set and returned", value, dmo.get("attr").getSV());
	}
	
	@Test(expected=DmcValueException.class)
	public void testSetIntegerAsBigString() throws InstantiationException, IllegalAccessException, DmcValueException {
		dmo.set("attr", DmcTypeInteger.class, "9845938479637967279876958790867286486398795246274987576398756983759867");
	}
	
	@Test(expected=DmcValueException.class)
	public void testSetIntegerInvalid() throws InstantiationException, IllegalAccessException, DmcValueException {
		dmo.set("attr", DmcTypeInteger.class, "notAnInteger");
	}
	
	
	
	
}
