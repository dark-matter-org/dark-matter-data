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
package org.dmd.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmsSchemaFinder;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.util.exceptions.ResultException;

public class DmsSchemaParserTest {

	private final static String DMPDIR = "/src/org/dmd/dmp/schema";

	SchemaManager	schema;
	DmsSchemaFinder	finder;
	DmsSchemaParser	parser;
	
	String	dmpDir;
	
	public DmsSchemaParserTest() throws ResultException, IOException {
		
		
		URL url = getClass().getResource("/org/dmd/");
//		System.out.println("URL: " + url.getFile());
		
		
		schema = new SchemaManager();
		
		finder = new DmsSchemaFinder();
//		finder.addSourceDirectory("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp");
		finder.addSourceDirectory(url.getFile());
		finder.findSchemas();
		
		parser = new DmsSchemaParser(schema,finder);
	}
	
	public void run() throws IOException, ResultException, DmcValueException {
		
        System.out.println(finder.getSchemaListing() + "\n");

        parser.parseSchema("dmp", false);
        
        SchemaDefinition sd = parser.getManager().isSchema("dmp");
        
        if (sd != null)
        	System.out.println(sd.toOIF(15));
	}
}
