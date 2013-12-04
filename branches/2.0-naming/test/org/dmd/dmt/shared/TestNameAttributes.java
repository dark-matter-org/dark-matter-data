package org.dmd.dmt.shared;

import static org.junit.Assert.assertNotNull;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class TestNameAttributes {

	
	@Test
	public void testNameAttributes() throws ResultException, DmcValueException, DmcNameClashException {
		SchemaManager schema = new SchemaManager();
		
//		schema.manageSchema(new DmpSchemaAG());
		schema.manageSchema(new DmtSchemaAG());
		
		StringName sn = new StringName("Some name");
		
		DmcAttribute<DmcObjectNameIF> attr = schema.getNameAttributeInstance(sn);
		
		assertNotNull("Name attribute shouldn't be null.", attr);


		NameContainerTestDMO	dmo	= new NameContainerTestDMO();
		dmo.setAnotherDmtName("Here's a name");
		
		
		System.out.println(dmo.toOIF(15));
		
	}
	
}
