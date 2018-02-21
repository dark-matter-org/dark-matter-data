package org.dmd.dmv.shared.extended.rulesdmo;

import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmv.server.generated.DmvSchemaAG;
import org.dmd.dmv.shared.DmvRuleManager;
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;
import org.dmd.util.ConsoleRuleTracer;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class StringSetRuleTest {

	static {
		DmcOmni.instance().addCompactSchema(DmvDMSAG.instance());
		DmcOmni.instance().ruleTracing(true);
		DmcOmni.instance().ruleTracer(new ConsoleRuleTracer());
		
		try {
			SchemaManager schema = new SchemaManager();
			
			DmvSchemaAG dmv = new DmvSchemaAG();
			schema.manageSchema(dmv);
			
			DmtSchemaAG dmt = new DmtSchemaAG();
			schema.manageSchema(dmt);
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcNameClashException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test() throws DmcRuleExceptionSet{
		
		DmvRuleManager ruleManager = new DmvRuleManager();
		
		ruleManager.loadRules(DmvDMSAG.instance());
		
		System.out.println();
		
		ruleManager.loadRules(DmtDMSAG.instance());
		
		ObjWithRefsDMO dmo1 = new ObjWithRefsDMO();
		dmo1.setLimitedStringSV("moose");
		
		try {
			ruleManager.executeAttributeValidation(dmo1);
			assertEquals("Expecting an exception",true, false);
		} catch (DmcRuleExceptionSet ex) {
			System.out.println("Expected exception:\n");
			System.err.println(ex.toString());
		}
		
		dmo1.setLimitedStringSV("Uno");
		ruleManager.executeAttributeValidation(dmo1);

		dmo1.setLimitedStringSV("Dos Fish");
		ruleManager.executeAttributeValidation(dmo1);
		
		dmo1.setLimitedStringSV("Hasta la vista");
		ruleManager.executeAttributeValidation(dmo1);

		dmo1.addLimitedStringMV("boing");
		try {
			ruleManager.executeAttributeValidation(dmo1);
			assertEquals("Expecting an exception",true, false);
		} catch (DmcRuleExceptionSet ex) {
			System.out.println("Expected exception:\n");
			System.err.println(ex.toString());
		}

		dmo1.remLimitedStringMV();
		dmo1.addLimitedStringMV("left");
		dmo1.addLimitedStringMV("right");
		dmo1.addLimitedStringMV("over there");
		ruleManager.executeAttributeValidation(dmo1);
		
		
	}
}
