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
package org.dmd.dms;

import java.util.HashMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class TestSchemaManager {
	
	@Test
	public void testHashStringName(){
		HashMap<StringName,String> map = new HashMap<StringName, String>();
		
		map.put(new StringName("key1"), "key1");
		map.put(new StringName("key2"), "key2");
		
		StringName key1 = new StringName();
		try {
			key1.setNameString("key1");
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (map.get(key1) == null)
			System.out.println("Null");
		else
			System.out.println("Got it!");
	}

	@Test
	public void testLoadSchema() throws ResultException, DmcValueException{
		SchemaManager sm = new SchemaManager();
		
//		sm.manageSchema(new DmpSchemaAG());
		
//		assertNotNull("The DMP schema should be parsed properly.", dmp);
	}
	
	@Test
	public void testFormatJSON() throws ResultException, DmcValueException{
		SchemaManager sm = new SchemaManager();
		
		ClassDefinition cd = sm.cdef("ClassDefinition");
		
		System.out.println(cd.getDmcObject().toJSON(16,""));
	}
}
