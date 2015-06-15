package org.dmd.dmt.shared;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dms.generated.types.DmcTypeFloatSTATIC;
import org.dmd.dms.generated.types.DmcTypeLongSTATIC;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestNullReturnValueRemoval {
	
//	static String testDataPath = "/test/org/dmd/dmt/shared/data";
//	
//	static boolean initialized = false;
//
//	static File	temp;
//
//	@Before
//	public void initialize() throws ResultException, DmcValueException, IOException {
//			
//		if (!initialized){
//			DebugInfo.debug("STARTING...");
//			DmpSchemaAG dmp = new DmpSchemaAG();
//			DmtSchemaAG dmt = new DmtSchemaAG();			
//			DmwOmni.instance().addSchema(dmp);
//			DmwOmni.instance().addSchema(dmt);
//			DebugInfo.debug("FINISHED...");
//			
//	        File curr = new File(".");
//	        String runDir;
//			runDir = curr.getCanonicalPath();
//			System.out.println("*** Serialization running from: " + runDir);
//	
//			temp = new File(runDir + File.separator + "serialize.txt");
//			
//			System.out.println("temp: " + temp.getAbsolutePath());
//			
//			initialized = true;
//		}
//	}

	@Test
	public void testDirectAlteration() throws DmcValueException{
		TestBasicObjectFixedDMO dmo = new TestBasicObjectFixedDMO();
		
		assertFalse("Object has no explicitly set value", dmo.hasValue(DmtDMSAG.__svBoolean));

		dmo.setSvBoolean(true);
		
		assertTrue("Object has an explicitly set value", dmo.hasValue(DmtDMSAG.__svBoolean));

		dmo.setSvBoolean(false);
		
//		assertFalse("Object has no explicitly set value", dmo.hasValue(DmtDMSAG.__svBoolean));

		double d = 99.0D;
		int i = 99;
		
		Float f = DmcTypeFloatSTATIC.instance.typeCheck("99.0F");
		Long l = DmcTypeLongSTATIC.instance.typeCheck("0");
		System.out.println(" f = " + f);
	}
}
