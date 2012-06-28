package org.dmd.dms.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;
import org.junit.Test;

public class TestDMO {

	@Test
	public void testAttributeDef() throws DmcValueException{
		AttributeDefinitionDMO admo = new AttributeDefinitionDMO();
		
		admo.setAbbrev("TST");
		
		System.out.println(admo.toOIF(15));
		
	}
}
