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
package org.dmd.dms.meta;

import static org.junit.Assert.assertNotNull;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.MetaSchema;
import org.junit.Test;

public class TestMetaSchema {

	@Test
	public void testIntantiation() throws DmcValueException {
		MetaSchema schema = new MetaSchema();
		
		assertNotNull("MetaSchema should be instantiated without Exceptions", schema);
		
		ClassDefinition cd = MetaSchema._ClassDefinition;
		
		System.out.println(cd.toOIF(20));
	}
	
}
