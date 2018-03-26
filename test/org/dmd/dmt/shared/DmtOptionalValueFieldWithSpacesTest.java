package org.dmd.dmt.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithSpaces;
import org.junit.Test;

public class DmtOptionalValueFieldWithSpacesTest {

	@Test
	public void testAllValues() throws DmcValueException {
		DmtOptionalValueFieldWithSpaces field = new DmtOptionalValueFieldWithSpaces("String test description=\"this is the rest\"");
		
		assertNotNull(field.getType());
		assertEquals("The type should be String", "String", field.getType().toString());
		
		assertNotNull(field.getName());
		assertEquals("The name should be test", "test", field.getName());
		
		assertNotNull(field.getDescription());
	}
	
	@Test
	public void testOneValue() throws DmcValueException {
		
		try{
			@SuppressWarnings("unused")
			DmtOptionalValueFieldWithSpaces field = new DmtOptionalValueFieldWithSpaces("String");
			
			assertTrue("Should have thrown an exception", false);

		}
		catch(DmcValueException ex){
			System.out.println(ex);
		}
		
	}
	
	@Test
	public void testTwoValues() throws DmcValueException {
		DmtOptionalValueFieldWithSpaces field = new DmtOptionalValueFieldWithSpaces("String test");
		
		assertNotNull(field.getType());
		
		assertNotNull(field.getName());
		
		assertNull(field.getDescription());
	}
	
	@Test
	public void boundaryConditions() throws DmcValueException{
		DmtOptionalValueFieldWithSpaces field = new DmtOptionalValueFieldWithSpaces("String test description=x");
		
		assertNotNull(field.getType());
		assertEquals("The type should be String", "String", field.getType().toString());
		
		assertNotNull(field.getName());
		assertEquals("The name should be test", "test", field.getName());
		
		assertNotNull(field.getDescription());
		assertEquals("The description should be x", "x", field.getDescription());
	}
	
	
}
