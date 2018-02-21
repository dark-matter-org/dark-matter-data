package org.dmd.dmv.shared.extended.rulesdmo;

import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.extended.ObjWithRefsDerivedA;
import org.dmd.dmt.server.extended.ObjWithRefsDerivedB;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;
import org.dmd.dmv.server.generated.DmvSchemaAG;
import org.dmd.dmv.shared.DmvRuleManager;
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;
import org.dmd.util.ConsoleRuleTracer;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class RestrictReferencesRuleTest {

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
	public void test() throws DmcValueException, DmcRuleExceptionSet {
		DmvRuleManager ruleManager = new DmvRuleManager();
		
		ruleManager.loadRules(DmvDMSAG.instance());
		
		System.out.println();
		
		ruleManager.loadRules(DmtDMSAG.instance());
		
		ObjWithRefsDerivedB obj3 = new ObjWithRefsDerivedB();
		obj3.setName("Object3");
		obj3.setSvString("a string");
		obj3.addMvTestEnum(DmtTestEnum.TEST2);
		
		System.out.println(obj3.toOIF() + "\n");
		
		ObjWithRefsDerivedA obj1 = new ObjWithRefsDerivedA();
		obj1.setName("Object1");
		obj1.setSvString("single string");
		obj1.addMvTestEnum(DmtTestEnum.TEST2);
		obj1.setObjRef(obj3);
		
		System.out.println(obj1.toOIF() + "\n");

		try {
			ruleManager.executeObjectValidation(obj1.getDMO());
			ruleManager.executeAttributeValidation(obj1.getDMO());
			assertEquals("Expecting an exception",true, false);
		}
		catch(DmcRuleExceptionSet ex){
			System.out.println("Expected exception:\n");
			System.err.println(ex.toString());
		}
			
		ObjWithRefsDerivedA obj2 = new ObjWithRefsDerivedA();
		obj2.setName("Object2");
		obj2.setSvString("single string");
		obj2.addMvTestEnum(DmtTestEnum.TEST2);
		obj2.setObjRef(obj1);
		obj2.addObjRefMV(obj1);
		
		System.out.println(obj2.toOIF());
		
		try {
			ruleManager.executeObjectValidation(obj2.getDMO());
			ruleManager.executeAttributeValidation(obj2.getDMO());
		}
		catch(DmcRuleExceptionSet ex){
			System.err.println(ex.toString());
		}
		
		
		obj2.remObjRefMV();
		obj2.addObjRefMV(obj3);
		
		try {
			ruleManager.executeObjectValidation(obj2.getDMO());
			ruleManager.executeAttributeValidation(obj2.getDMO());
			assertEquals("Expecting an exception",true, false);
		}
		catch(DmcRuleExceptionSet ex){
			System.out.println("Expected exception:\n");
			System.err.println(ex.toString());
		}

	}
}
