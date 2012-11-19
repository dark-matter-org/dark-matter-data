package org.dmd.dmt.shared;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmv.shared.DmvRuleManager;
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestRules {

	static boolean initialized = false;
	
	static DmvRuleManager ruleManager = new DmvRuleManager();

	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DebugInfo.debug("STARTING...");
			DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
			ruleManager.loadRules(DmtDMSAG.instance());
			initialized = true;
		}
	}

	@Test
	public void testInitRule() throws DmcRuleExceptionSet{
		TestBasicObjectFixedDMO	dmo = new TestBasicObjectFixedDMO();
		
//		DmtDMSAG.__dmtInitTestBasicObjectFixed.execute(dmo);
		ruleManager.executeInitializers(dmo);
		
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
	
	@Test
	public void testNumericRange(){
		TestBasicObjectFixedDMO dmo1 = new TestBasicObjectFixedDMO();
		dmo1.setSvInteger(5);
		dmo1.setSvFloat(1.8f);
		
		try {
			ruleManager.executeAttributeValidation(dmo1);
		} catch (DmcRuleExceptionSet e) {
			assertEquals("Not expecting an exception",true, false);
		}
		
		
		TestBasicObjectFixedDMO dmo2 = new TestBasicObjectFixedDMO();
		dmo2.setSvInteger(25);
		dmo2.setSvFloat(3.1f);
		
		try {
			ruleManager.executeAttributeValidation(dmo1);
			
			assertEquals("Expecting an exception",true, false);
		} catch (DmcRuleExceptionSet e) {
			assertEquals("There should be 2 exceptions",2, e.getCount());
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
