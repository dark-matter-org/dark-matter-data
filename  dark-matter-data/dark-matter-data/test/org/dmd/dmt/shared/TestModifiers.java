package org.dmd.dmt.shared;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestModifiers {

	private SchemaManager schema;
	
	@Before
	public void initialize() throws ResultException, DmcValueException{
		if (schema == null){
			schema = new SchemaManager();
			schema.manageSchema(new DmtSchemaAG());
		}
	}

	@Test
	public void testPrimitiveTypes(){
		TestBasicObjectFixedDMO	dmo = new TestBasicObjectFixedDMO();
		
		dmo.setSvBoolean(true);
		dmo.setSvString("one value");
		
		System.out.println(dmo.toOIF(15));
		
//		DmcTypeModifier mods = new Dmc
//		
//		dmo.setModifier(m)
	}
}
