package org.dmd.dmr.server.ldap.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;
import org.junit.*;

public class TestDmrLdapSchemaAG {

	@Test
	public void testSchemaLoading() throws ResultException, DmcValueException {
		SchemaManager schema = new SchemaManager();
		
		schema.manageSchema((new DmrldapSchemaAG()).getInstance());
		
		System.out.println(schema.toString());
	}
}
