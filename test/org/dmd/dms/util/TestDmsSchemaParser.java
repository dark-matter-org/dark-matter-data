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

import java.io.File;
import java.io.IOException;

import org.junit.*;
import static org.junit.Assert.assertNotNull;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;

public class TestDmsSchemaParser {

	SchemaManager	dmsSchema;
	
	SchemaManager	readSchemas;
	
	ConfigFinder	finder;
	
	@Before
	public void initialize() throws ResultException, IOException, DmcValueException, DmcNameClashException {
		dmsSchema = new SchemaManager();
		readSchemas	= new SchemaManager();

        File curr = new File(".");
        String runDir;
		runDir = curr.getCanonicalPath();
		System.out.println("*** Running from: " + runDir);
		
		finder = new ConfigFinder();
		finder.addSourceDirectory(runDir + "/src");
		finder.debug(true);
		finder.addSuffix(".dms");
//		finder.addJarEnding("DMSchema.jar");
		finder.findConfigs();

		
	}
	
	@Test
	public void testParseDMPSchema() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException{
		DmsSchemaParser parser = new DmsSchemaParser(dmsSchema, finder);
		SchemaDefinition dmp	= null;
		
		dmp = parser.parseSchema(readSchemas, "dmp", true);
		
		assertNotNull("The DMP schema should be parsed properly.", dmp);
	}
	
	@Test(expected=ResultException.class)
	public void testParseUnknownSchema() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException{
		DmsSchemaParser parser = new DmsSchemaParser(dmsSchema, finder);
		
		parser.parseSchema(readSchemas, "unknown", true);
	}
}
