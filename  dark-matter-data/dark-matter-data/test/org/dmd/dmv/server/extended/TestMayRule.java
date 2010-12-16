package org.dmd.dmv.server.extended;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeString;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;
import org.junit.*;


public class TestMayRule {

	@Test
	public void testMissingConstructionClass() throws DmcValueException, ResultException {
		DmcObject obj = new DmcObject();
		
		DmcTypeString attr = new DmcTypeString();
		attr.set("testValue");

		obj.set("someAttribute", attr);
		
		SchemaManager schema = new SchemaManager();
		
		MayRule may = new MayRule();
		
		try {
			may.applyRule(schema, obj);
			fail("Exception should have been raised for missing construction class.");
		} catch (DmcValueExceptionSet e) {
			assertTrue("Check for missing construction class",true);
		}
	}
	
	@Test
	public void testUnknownConstructionClass() throws DmcValueException, ResultException {
		DmcObject obj = new FakeClass();
		
		DmcTypeString attr = new DmcTypeString();
		attr.set("testValue");

		obj.set("someAttribute", attr);
		
		SchemaManager schema = new SchemaManager();
		
		MayRule may = new MayRule();
		
		try {
			may.applyRule(schema, obj);
			fail("Exception should have been raised for unknown construction class.");
		} catch (DmcValueExceptionSet e) {
			assertTrue("Check for unknown construction class",true);
		}
	}
	
	
	@Test
	public void testMust() throws DmcValueException, ResultException {
		ClassDefinition cd = new ClassDefinition();
		cd.setName("TestClass");
		cd.setAbbrev("TC");
		cd.setDescription("Setting the description");
		
		DmcTypeString attr = new DmcTypeString();
		attr.set("testValue");
		
		cd.getDmcObject().set("fakeAttribute", attr);

		SchemaManager schema = new SchemaManager();
		
		MayRule may = new MayRule();
		
		try {
			may.applyRule(schema, cd.getDmcObject());
			fail("Exception should have been raised for unknown construction class.");
		} catch (DmcValueExceptionSet e) {
			assertTrue("Check for unknown construction class",true);
			
			System.out.println(e);
		}
	}
	
}
