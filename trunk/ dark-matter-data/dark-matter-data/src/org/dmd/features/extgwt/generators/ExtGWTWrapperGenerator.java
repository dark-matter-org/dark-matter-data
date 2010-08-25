package org.dmd.features.extgwt.generators;

import org.dmd.dmg.DarkMatterGeneratorIF;
import org.dmd.dms.SchemaManager;
import org.dmd.util.parsing.ConfigFinder;

/**
 * The ExtGWTWrapperGenerator class is used to generate wrappers for Dark Matter Objects
 * that allow the to be used in various ExtGWT data models. To facilitate this, the
 * wrappers are derived from a parameterized base class: DmoExtGWTWrapperBase. This
 * class implements the com.extjs.gxt.ui.client.data.Model and com.extjs.gxt.ui.client.data.ModelData
 * interfaces so that it behaves in the same way as the com.extjs.gxt.ui.client.data.BaseModel
 * class.
 */
public class ExtGWTWrapperGenerator implements DarkMatterGeneratorIF {
	
	

	@Override
	public void gatherUserInput(ConfigFinder f, SchemaManager sm) {
		// No need for anything, we just need the schemas
	}

	@Override
	public void generateCode(ConfigFinder f, SchemaManager sm) {
		
		System.out.println("Yahoo!");
	}

}
