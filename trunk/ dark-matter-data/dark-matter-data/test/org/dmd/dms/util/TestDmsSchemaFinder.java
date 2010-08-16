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
package org.dmd.dms.util;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URL;

import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;


public class TestDmsSchemaFinder {

	// The search root
	private URL dmdRoot;
	
	@Before
	public void initialize(){
		dmdRoot = getClass().getResource("/org/dmd/");
	}
	
	@Test
	public void testFindBaseSchemas() throws ResultException, IOException{
		DmsSchemaFinder	finder = new DmsSchemaFinder();
		finder.addSourceDirectory(dmdRoot.getFile());
		
		finder.findSchemas();
		
		assertNotNull("The dmp schema should be found.", finder.getLocation("dmp"));
		
		assertNotNull("The metaSchema schema should be found.", finder.getLocation("metaSchema"));
	}
	
	@Test(expected=ResultException.class)
	public void testUnknownSourceDir() throws ResultException, IOException{
		DmsSchemaFinder	finder = new DmsSchemaFinder();
		finder.addSourceDirectory("C:/unknown");
		
		finder.findSchemas();
	}
	
	
}
