package org.dmd.dmc.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class DotNameTest {
	
	@Test
	public void testConstruction(){
		DotName dn = null;
		
		try {
			dn = new DotName("a.b.c");
		} catch (DmcValueException e) {
			fail("a.b.c should be a valid DotName");

		}
		assertEquals("Should be a.b.c","a.b.c",dn.getNameString());
		
		try {
			dn = new DotName("a.b.*");
			fail("a.b.* should not be a valid DotName");
		} catch (DmcValueException e) {
			assertTrue("Exception throw as expected.",true);
			System.out.println(e);
		}
		
		try {
			dn = new DotName(".a.b.c");
			fail(".a.b.c should not be a valid DotName");
		} catch (DmcValueException e) {
			assertTrue("Exception throw as expected.",true);
			System.out.println(e);
		}
		
		try {
			dn = new DotName(".a. .c");
			fail(".a. .c should not be a valid DotName");
		} catch (DmcValueException e) {
			assertTrue("Exception throw as expected.",true);
			System.out.println(e);
		}
	}
	

}
