package org.dmd.dmt.shared;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class TestNameAttributes {

	
	@Test
	public void testSchema() throws ResultException, DmcValueException{
		SchemaManager schema = new SchemaManager();
		
		schema.manageSchema(new DmpSchemaAG());
//		schema.manageSchema(new DmtSchemaAG());
		
		StringName sn = new StringName("Some name");
		
		DmcAttribute<DmcObjectNameIF> attr = schema.getNameAttributeInstance(sn);

		
	}
	
}
