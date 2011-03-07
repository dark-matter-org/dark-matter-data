package org.dmd.dmt;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.auxw.TestBasicAuxiliaryDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.util.exceptions.ResultException;
import org.junit.*;

public class TestBasicFunctions {

	@Test
	public void testBasicObject() throws ResultException, DmcValueException{
		SchemaManager schema = new SchemaManager();
		schema.manageSchema(new DmtSchemaAG());
		
		TestBasicObjectFixedDMO tbo = new TestBasicObjectFixedDMO();
		tbo.setSvStringValue("some value");
		tbo.addMvStringValue("val 1");
		tbo.addMvStringValue("val 2");
		
		System.out.println(tbo.toOIF(15));
		
		TestBasicAuxiliaryDMO.setSvAuxString(tbo, "some aux value");
		
		System.out.println(tbo.toOIF(15));
		
		TestBasicAuxiliaryDMO.remSvAuxString(tbo);
		
		System.out.println(tbo.toOIF(15));
		
		tbo.addIntToString("5 Five");
		tbo.addIntToString("1 One");
		tbo.addIntToString("500 Five Hundred");
		tbo.addIntToString("33 Thirty Three");
		
		System.out.println(tbo.toOIF(15));
		
		System.out.println("Get 500: " + tbo.getIntToStringByKey(500));
	}
}
