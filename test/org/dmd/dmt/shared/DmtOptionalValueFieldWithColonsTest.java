package org.dmd.dmt.shared;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithColons;
import org.junit.Test;

public class DmtOptionalValueFieldWithColonsTest {

	@Test
	public void testAllValues() throws DmcValueException {
		DmtOptionalValueFieldWithColons field = new DmtOptionalValueFieldWithColons("String:test:description=\"this is the rest\"");
		
		assertNotNull(field.getType());
		assertEquals("The type should be String", "String", field.getType().toString());
		
		assertNotNull(field.getName());
		assertEquals("The name should be test", "test", field.getName());
		
		assertNotNull(field.getDescription());
		assertEquals("The type should be \"this is the rest\"", "this is the rest", field.getDescription());
	}
	
	@Test
	public void testOneValue() throws DmcValueException {
		
		try{
			@SuppressWarnings("unused")
			DmtOptionalValueFieldWithColons field = new DmtOptionalValueFieldWithColons("String");
			
			assertTrue("Should have thrown an exception", false);

		}
		catch(DmcValueException ex){
			System.out.println(ex);
		}
		
	}
	
	@Test
	public void testTwoValues() throws DmcValueException {
		DmtOptionalValueFieldWithColons field = new DmtOptionalValueFieldWithColons("String:test");
		
		assertNotNull(field.getType());
		
		assertNotNull(field.getName());
		
		assertNull(field.getDescription());
		
		field = new DmtOptionalValueFieldWithColons("String:test");
		
		assertNotNull(field.getType());
		
		assertNotNull(field.getName());
		
		assertNull(field.getDescription());
		
	}
	
	
}
