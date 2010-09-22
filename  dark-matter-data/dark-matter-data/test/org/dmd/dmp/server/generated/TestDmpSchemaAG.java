package org.dmd.dmp.server.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class TestDmpSchemaAG {

	@Test
	public void testSchemaInstantiation() throws ResultException, DmcValueException, DmcValueExceptionSet {
		SchemaManager sm = new SchemaManager();
		
		DmpSchemaAG	dmp = DmpSchemaAG.getInstance();
		dmp.resolveReferences(sm);
		
		DebugInfo.debug("MANAGING SCHEMA\n");
		
		sm.manageSchema(dmp);
		
		System.out.println(DmpSchemaAG._GetRequest.toOIF(15));
	}
}
