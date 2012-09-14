package org.dmd.dms.generated;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ComplexTypeDefinition;
import org.dmd.dms.SchemaManager;
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
	
	@Test
	public void testObjectResolution() throws Exception {
		SchemaManager schema = new SchemaManager();
		
		ComplexTypeDefinition	ctd = new ComplexTypeDefinition();
		ctd.addField("TypeDefinition type The type of the field");
		ctd.addField("String         name The name of the field");
		ctd.addField("String         description A description of the field");
		
		System.out.println(ctd.toOIF());
		
		ctd.resolveReferences(schema);
		assertTrue("No exceptions thrown",true);
		
		Iterator<Field> fields = ctd.getField();
		while(fields.hasNext()){
			Field field = fields.next();
			
			assertNotNull("The type should be resolved.", field.getType().getObject());
	
			System.out.println(field.getType().getObject().toOIF());
		}
	}
	
	
}
