package org.dmd.dms.generated;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.types.Field;
import org.junit.Test;

public class TestField {

	@Test
	public void testStringConstructor() throws Exception{
		Field f1 = new Field("Integer value An integer value");
		
		System.out.println(f1 + "\n");
		
		assertEquals("Expecting type to be: Integer", f1.getType().getObjectName(), "Integer");
		
		assertEquals("Expecting name to be: value.", f1.getName(), "value");
		
		assertEquals("Expecting description to be: An integer value.", f1.getDescription(), "An integer value");
		
	}
	
	@Test
	public void testExtraSeparators() throws Exception{
		Field f1 = new Field("Integer      value               An integer value");
		
		System.out.println(f1 + "\n");
		
		assertEquals("Expecting type to be: Integer", f1.getType().getObjectName(), "Integer");
		
		assertEquals("Expecting name to be: value.", f1.getName(), "value");
		
		assertEquals("Expecting description to be: An integer value.", f1.getDescription(), "An integer value");
		
	}
	
	@Test
	public void testMissingName() throws Exception{
		try{
			@SuppressWarnings("unused")
			Field f1 = new Field("Integer ");
		}
		catch(DmcValueException ex){
			assertTrue("Missing name field",true);
			System.out.println("Got expected exception:\n\n" + ex);
		}
		
	}
	
	@Test
	public void testMissingDescription() throws Exception{
		try{
			@SuppressWarnings("unused")
			Field f1 = new Field("Integer value   ");
		}
		catch(DmcValueException ex){
			assertTrue("Missing description field",true);
			System.out.println("Got expected exception:\n\n" + ex);
		}
		
	}
	
	
}
