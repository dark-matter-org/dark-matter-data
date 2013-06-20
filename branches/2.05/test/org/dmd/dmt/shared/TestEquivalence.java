package org.dmd.dmt.shared;

import static org.junit.Assert.fail;

import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.junit.Test;

public class TestEquivalence {

	static boolean initialized = false;

//	@Before
//	public void initialize() throws ResultException, DmcValueException, IOException {
//			
//		if (!initialized){
//			DebugInfo.debug("STARTING...");
//			DmpSchemaAG dmp = new DmpSchemaAG();
//			DmtSchemaAG dmt = new DmtSchemaAG();			
//			DmwOmni.instance().addSchema(dmp);
//			DmwOmni.instance().addSchema(dmt);
//			initialized = true;
//		}
//	}

	@Test
	public void testBasicObject(){
		TestBasicObjectFixedDMO obj1 = new TestBasicObjectFixedDMO();
		
		TestBasicObjectFixedDMO obj2 = new TestBasicObjectFixedDMO();
		
		
		if (!obj1.equals(obj2))
			fail("The objects should be equal");
		
		obj1.setSvBoolean(true);
		obj2.setSvBoolean(true);
		
		if (!obj1.equals(obj2))
			fail("The objects should be equal");
		
		obj2.setSvBoolean(false);
		if (obj1.equals(obj2))
			fail("The objects should not be equal");
		obj2.setSvBoolean(true);
		
		obj1.setSvString("domain1");
		obj2.setSvString("domain2");
		
		if (obj1.equals(obj2))
			fail("The objects should not be equal");

		obj2.setSvString("domain1");
		
		if (!obj1.equals(obj2))
			fail("The objects should be equal");
		
		TestBasicObjectFixedDMO ind1 = new TestBasicObjectFixedDMO();
		ind1.setSvInteger(1);
		ind1.setSvString("domain1");
		
		TestBasicObjectFixedDMO ind2 = new TestBasicObjectFixedDMO();
		ind2.setSvInteger(2);
		ind2.setSvString("domain2");
		
		obj1.setNthMvIdxUnnamedObj(1, ind1);
		
		if (obj1.equals(obj2))
			fail("The objects should not be equal");
		
		obj2.setNthMvIdxUnnamedObj(2, ind2);
		
		if (obj1.equals(obj2))
			fail("The objects should not be equal");
		
		obj1.setNthMvIdxUnnamedObj(2, ind2);
		obj2.setNthMvIdxUnnamedObj(1, ind1);
		
		if (!obj1.equals(obj2))
			fail("The objects should be equal");
		
		TestBasicObjectFixedDMO ind31 = new TestBasicObjectFixedDMO();
		ind31.setSvInteger(3);
		ind31.setSvString("domain3");
		
		TestBasicObjectFixedDMO ind32 = new TestBasicObjectFixedDMO();
		ind32.setSvInteger(3);
		ind32.setSvString("domain 3");
		
		TestBasicObjectFixedDMO ind33 = new TestBasicObjectFixedDMO();
		ind33.setSvInteger(3);
		ind33.setSvString("domain3");
		
		obj1.setNthMvIdxUnnamedObj(3, ind31);
		obj2.setNthMvIdxUnnamedObj(3, ind32);
		
		if (obj1.equals(obj2))
			fail("The objects should not be equal");
		
		obj2.setNthMvIdxUnnamedObj(3, ind33);
		
		if (!obj1.equals(obj2))
			fail("The objects should be equal");
		
	}
	
	
}
