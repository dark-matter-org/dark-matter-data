package org.dmd.dmt.shared;

import static org.junit.Assert.*;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;
import org.junit.Test;

public class TestValidation {

	@Test
	public void testHasMandatory(){
		ObjWithRefsDMO obj = new ObjWithRefsDMO();
		
		try {
			obj.validate();
			fail("Exception should have been raised for missing attributes.");
		} catch (DmcValueExceptionSet e) {
			assertTrue("Mandatory attributes missing",true);
			System.out.println(e.toString());
			
			assertEquals("Should be 3 missing attributes", 3, e.getCount());
		}
		
	}
	
	@Test
	public void testValidObject() throws DmcValueException{
		ObjWithRefsDMO obj = new ObjWithRefsDMO();
		
		obj.setName("object1");
		obj.setSvString("some string");
		obj.addMvTestEnum(DmtTestEnum.TEST1);
		
		try {
			obj.validate();
		} catch (DmcValueExceptionSet e) {
			fail("This object has all required mandatory attributes - no exceptions should occur.");
		}
		
	}
	
	
}
