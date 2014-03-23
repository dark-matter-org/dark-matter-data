package org.dmd.dmt.shared;

import java.io.IOException;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.dmo.ParseTestDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmv.shared.DmvRuleManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestUCOParsing {

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
	public void testFormatting() throws DmcValueException {
		ParseTestDMO	dmo = new ParseTestDMO();
		dmo.setSvBoolean(true);
		TestBasicObjectFixedDMO tbof = new TestBasicObjectFixedDMO();
		tbof.setSvLong(10);
		
		dmo.setSvUnnamedObj(tbof);
		
		tbof = new TestBasicObjectFixedDMO();
		tbof.setSvString("value1");
		
		dmo.addMvUnnamedObj(tbof);
		
		tbof = new TestBasicObjectFixedDMO();
		tbof.setSvString("value2");
		
		dmo.addMvUnnamedObj(tbof);
		
		ObjWithRefsDMO owr = new ObjWithRefsDMO();
		owr.setName(new DefinitionName("obj1"));
		owr.setOnOff(true);
		
		dmo.setNthMvIdxNamedObj(2, owr);
		
		tbof = new TestBasicObjectFixedDMO();
		tbof.setSvString("single string");
		
		dmo.setNthMvIdxUnnamedObj(5, tbof);
		
		System.out.println(dmo.toOIF());
	}
	
	
	
}
