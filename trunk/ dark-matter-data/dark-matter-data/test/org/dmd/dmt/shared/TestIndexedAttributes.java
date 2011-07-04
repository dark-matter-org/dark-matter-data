package org.dmd.dmt.shared;

import static org.junit.Assert.*;

import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestIndexedAttributes {

	static boolean initialized = false;

	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DebugInfo.debug("STARTING...");
			DmpSchemaAG dmp = new DmpSchemaAG();
			DmtSchemaAG dmt = new DmtSchemaAG();			
			DmwOmni.instance().addSchema(dmp);
			DmwOmni.instance().addSchema(dmt);
			initialized = true;
		}
	}

	@Test
	public void testHasMandatory(){
		ObjWithRefsDMO obj = new ObjWithRefsDMO();
		
		obj.setNthIndexedString(0, "value1");
		
		System.out.println(obj.toOIF());
		
//		try {
//			obj.validate();
//			fail("Exception should have been raised for missing attributes.");
//		} catch (DmcValueExceptionSet e) {
//			assertTrue("Mandatory attributes missing",true);
//			System.out.println(e.toString());
//			
//			assertEquals("Should be 3 missing attributes", 3, e.getCount());
//		}
		
	}
	
	
}
