package org.dmd.dmt.shared;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestRules {

	static boolean initialized = false;

	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DebugInfo.debug("STARTING...");
			DmcOmni.instance().addCompactSchema(DmvDMSAG.instance());
			DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
			initialized = true;
		}
	}

	@Test
	public void testInitRule() throws DmcRuleExceptionSet{
		TestBasicObjectFixedDMO	dmo = new TestBasicObjectFixedDMO();
		
		DmtDMSAG.__dmtInitTestBasicObjectFixed.execute(dmo);
		
		DebugInfo.debug(dmo.toOIF());
		
		assertEquals("svString should be \"the single valued string\"", "the single valued string", dmo.getSvString());
		
		assertEquals("mvString[1] should be \"second value\"", "second value", dmo.getNthMvString(1));
				
	}
	
	@Test
	public void testAllowedAttributesRule(){
		TestBasicNamedObjectFixedDMO dmo = new TestBasicNamedObjectFixedDMO();
		
		try {
			DmvDMSAG.__dmvAllowedAttributes.execute(dmo);
			assertEquals("Expecting an exception",true, false);
		} catch (DmcRuleExceptionSet e) {
			DebugInfo.debug("Got expected exception:\n" + e);
		}
		
//		DebugInfo.debug(dmo.toOIF());
//		
//		assertEquals("svString should be \"the single valued string\"", "the single valued string", dmo.getSvString());
//		
//		assertEquals("mvString[1] should be \"second value\"", "second value", dmo.getNthMvString(1));
//				
	}
	
	
	
}
