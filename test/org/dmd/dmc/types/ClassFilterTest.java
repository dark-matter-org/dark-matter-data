package org.dmd.dmc.types;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.dmo.TypeDefinitionDMO;
import org.junit.Test;

public class ClassFilterTest {

	@Test
	public void testBasicMatching() throws DmcValueException{
		ClassDefinitionDMO	dmo = new ClassDefinitionDMO();
		
		TypeDefinitionDMO	dmo2 = new TypeDefinitionDMO();
		
		ClassFilter filter = new ClassFilter("ClassDefinition");
		
		assertTrue("Filter should match", filter.objectMatches(dmo));
		
		assertFalse("Filter should not match", filter.objectMatches(dmo2));
	}

	@Test
	public void testBaseClassMatching() throws DmcValueException {
		ClassDefinitionDMO	dmo = new ClassDefinitionDMO();
				
		ClassFilter filter = new ClassFilter(MetaDMSAG.__DmsDefinition);
		
		assertTrue("Filter should match", filter.objectMatches(dmo));
		
	}
}
