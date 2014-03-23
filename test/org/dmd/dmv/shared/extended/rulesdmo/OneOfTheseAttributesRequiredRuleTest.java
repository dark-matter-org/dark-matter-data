package org.dmd.dmv.shared.extended.rulesdmo;

import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmv.shared.DmvRuleManager;
import org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO;
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;
import org.dmd.util.ConsoleRuleTracer;
import org.dmd.util.exceptions.DebugInfo;
import org.junit.Test;


public class OneOfTheseAttributesRequiredRuleTest {

	static {
		DmcOmni.instance().addCompactSchema(DmvDMSAG.instance());
	}

	@Test
	public void testMissing() throws DmcValueException {
		CheckAttributesBasedOnValueRuleDataDMO dmo = new CheckAttributesBasedOnValueRuleDataDMO();
		dmo.setRuleName("dmvIncludeOrExclude");
		dmo.setRuleTitle("At least one of the excludeThisAttribute or includeThisAttribute attributes must be specified.");
		
		try {
			DmvDMSAG.__dmvIncludeOrExclude.execute(dmo);
			assertEquals("Expecting an exception",true, false);
		} catch (DmcRuleExceptionSet e) {
			DebugInfo.debug("Got expected exception:\n" + e);
		}
	}

	@Test
	public void testAvailable1() throws DmcValueException, DmcRuleExceptionSet {
		CheckAttributesBasedOnValueRuleDataDMO dmo = new CheckAttributesBasedOnValueRuleDataDMO();
		dmo.setRuleName("dmvIncludeOrExclude");
		dmo.setRuleTitle("At least one of the excludeThisAttribute or includeThisAttribute attributes must be specified.");
		dmo.addExcludeThisAttribute("must");
		
		DmvDMSAG.__dmvIncludeOrExclude.execute(dmo);
	}

	@Test
	public void testAvailable2() throws DmcValueException, DmcRuleExceptionSet {
		CheckAttributesBasedOnValueRuleDataDMO dmo = new CheckAttributesBasedOnValueRuleDataDMO();
		dmo.setRuleName("dmvIncludeOrExclude");
		dmo.setRuleTitle("At least one of the excludeThisAttribute or includeThisAttribute attributes must be specified.");
		dmo.addIncludeThisAttribute("must");
		
		DmvDMSAG.__dmvIncludeOrExclude.execute(dmo);
	}
	
	@Test
	public void testRuleManager() throws DmcValueException, DmcRuleExceptionSet {
		DmvRuleManager rm = new DmvRuleManager();
		ConsoleRuleTracer crt = new ConsoleRuleTracer();
		
		DmcOmni.instance().ruleTracer(crt);
		DmcOmni.instance().ruleTracing(true);
		
		CheckAttributesBasedOnValueRuleDataDMO dmo = new CheckAttributesBasedOnValueRuleDataDMO();
		dmo.setRuleName("dmvIncludeOrExclude");
		dmo.setRuleTitle("At least one of the excludeThisAttribute or includeThisAttribute attributes must be specified.");
		dmo.setBasedOnAttribute("classType");
		dmo.addBasedOnValue("AUXILIARY");
		dmo.addIncludeThisAttribute("must");
		
		rm.executeObjectValidation(dmo);
		
		DebugInfo.debug("\n" + rm.toString());
	}
	
	@Test
	public void tags(){
		String tag1 = "hello";
		String tag2 = "hello there";
		String tag3 = "hello there!";
		
		assertEquals("Should be okay",true, tag1.matches("[a-zA-Z0-9][a-zA-Z0-9 ]*"));
		assertEquals("Should be okay",true, tag2.matches("[a-zA-Z0-9][a-zA-Z0-9 ]*"));
		assertEquals("Should not be okay",false, tag3.matches("[a-zA-Z0-9][a-zA-Z0-9 ]*"));
	}
	
}
