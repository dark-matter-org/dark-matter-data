package org.dmd.dms.generated;

import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.types.RuleParam;
import org.junit.Test;

public class RuleParamTest {

	@Test
	public void testParsing() throws DmcValueException {
		RuleParam param = new RuleParam("a:b:c:d");
		assertEquals("import should be a", "a", param.getImportStatement());
		assertEquals("generic args should be b", "b", param.getGenericArgs());
		assertEquals("name should be c", "c", param.getName());
		assertEquals("description should be d", "d", param.getDescription());
	}

	@Test
	public void testBlankParsing() throws DmcValueException {
		RuleParam param = new RuleParam("a: :c:d");
		assertEquals("import should be a", "a", param.getImportStatement());
		assertEquals("generic args should be empty string", "", param.getGenericArgs());
		assertEquals("name should be c", "c", param.getName());
		assertEquals("description should be d", "d", param.getDescription());
	}

	@Test
	public void testSeparatorBySeparatorParsing() throws DmcValueException {
		RuleParam param = new RuleParam("a::c:d");
		assertEquals("import should be a", "a", param.getImportStatement());
		assertEquals("generic args should be empty string", "", param.getGenericArgs());
		assertEquals("name should be c", "c", param.getName());
		assertEquals("description should be d", "d", param.getDescription());
	}

	@Test
	public void testAllEmptyParsing() throws DmcValueException {
		RuleParam param = new RuleParam(":::");
		assertEquals("import should be empty string", "", param.getImportStatement());
		assertEquals("generic args should be empty string", "", param.getGenericArgs());
		assertEquals("name should be empty string", "", param.getName());
		assertEquals("description should be empty string", "", param.getDescription());
	}

//	@Test
//	public void testMissingImport(){
//		
//		try {
//			@SuppressWarnings("unused")
//			RuleParam param = new RuleParam(":b:c:d");
//			assertTrue("Should have thrown an exception about a missing import field",false);
//		} catch (DmcValueException ex) {
//			assertTrue("Missing import field",true);
//			System.out.println("Got expected exception:\n\n" + ex);
//		}
//	}
}
