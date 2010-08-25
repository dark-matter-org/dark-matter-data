package org.dmd.features.extgwt.generators;

import org.dmd.dmg.DarkMatterGeneratorIF;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
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
	
	String gendir;
	String dmwdir;

	@Override
	public void gatherUserInput(DmgConfigDMO config, ConfigFinder f, SchemaManager sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateCode(DmgConfigDMO config, ConfigFinder f, SchemaManager sm) {

		
		
	}

}
