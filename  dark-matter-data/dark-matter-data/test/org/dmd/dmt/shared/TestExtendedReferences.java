package org.dmd.dmt.shared;


import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;
import org.dmd.dmt.shared.generated.types.SomeRelation;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestExtendedReferences {

	@Test
	public void testCreation() throws DmcValueException{
		SomeRelation	rel = new SomeRelation(new StringName("some name"), 4, 2);
		
		assertNotNull(rel.getName());
		
		System.out.println(rel);
	}
	
	@Test
	public void testParsing() throws DmcValueException{
		SomeRelation	rel = new SomeRelation("some name:4:2");
		
		assertEquals("some name", rel.getName().getNameString());
		assertEquals(4,rel.getCount().intValue());
		assertEquals(2,rel.getOrder().intValue());
		
		System.out.println(rel);
	}
	
	
}
