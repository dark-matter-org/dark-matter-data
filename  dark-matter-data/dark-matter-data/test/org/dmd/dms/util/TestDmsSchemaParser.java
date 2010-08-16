package org.dmd.dms.util;

import java.io.IOException;

import org.junit.*;
import static org.junit.Assert.assertNotNull;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;

public class TestDmsSchemaParser {

	SchemaManager	schema;
	
	DmsSchemaFinder	finder;
	
	@Before
	public void initialize() throws ResultException, IOException{
		schema = new SchemaManager();
		
		finder = new DmsSchemaFinder();
		finder.addSourceDirectory(getClass().getResource("/org/dmd/").getFile());
		finder.findSchemas();
	}
	
	@Test
	public void testParseDMPSchema() throws ResultException, DmcValueException{
		DmsSchemaParser parser = new DmsSchemaParser(schema, finder);
		SchemaDefinition dmp	= null;
		
		dmp = parser.parseSchema("dmp", true);
		
		assertNotNull("The DMP schema should be parsed properly.", dmp);
	}
	
	@Test(expected=ResultException.class)
	public void testParseUnknownSchema() throws ResultException, DmcValueException{
		DmsSchemaParser parser = new DmsSchemaParser(schema, finder);
		
		parser.parseSchema("unknown", true);
	}
}
