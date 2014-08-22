package org.dmd.dmc.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class DefinitionNameTest {
	
	@Test
	public void testConstruction(){
		DefinitionName dn = null;
		
		try {
			dn = new DefinitionName("a.b.c");
		} catch (DmcValueException e) {
			fail("a.b.c should be a valid DefinitionName");
		}
		assertEquals("Should be a.b.c","a.b.c",dn.getNameString());
		
		try {
			dn = new DefinitionName("241");
		} catch (DmcValueException e) {
			fail("241 should be a valid DefinitionName");
		}
		assertEquals("Should be 241","241",dn.getNameString());
		
		try {
			dn = new DefinitionName("24-01");
		} catch (DmcValueException e) {
			fail("24-01 should be a valid DefinitionName");
		}
		assertEquals("Should be 24-01","24-01",dn.getNameString());
		
		try {
			dn = new DefinitionName("_241");
			fail("_241 should not be a valid DefinitionName");
		} catch (DmcValueException e) {
			assertTrue("Exception throw as expected.",true);
			System.out.println(e);
		}
		
//		try {
//			dn = new DotName(".a.b.c");
//			fail(".a.b.c should not be a valid DotName");
//		} catch (DmcValueException e) {
//			assertTrue("Exception throw as expected.",true);
//			System.out.println(e);
//		}
//		
//		try {
//			dn = new DotName(".a. .c");
//			fail(".a. .c should not be a valid DotName");
//		} catch (DmcValueException e) {
//			assertTrue("Exception throw as expected.",true);
//			System.out.println(e);
//		}
	}
	

}
