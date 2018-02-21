package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmv.server.generated.DmvSchemaAG;
import org.dmd.dmv.shared.DmvRuleManager;
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;
import org.dmd.util.ConsoleRuleTracer;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class CardinalityRuleTest {

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
	public void test(){
		
		DmvRuleManager ruleManager = new DmvRuleManager();
		
		ruleManager.loadRules(DmvDMSAG.instance());
		
		System.out.println();
		
		ruleManager.loadRules(DmtDMSAG.instance());
		

	}
}
