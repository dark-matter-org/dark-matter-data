package org.dmd.dms.util;

import java.io.IOException;
import java.net.URL;

import org.junit.*;
import static org.junit.Assert.assertNotNull;

import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.ResultException;


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
