package org.dmd.dmt.dsd.dsdc.server.extended;

import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCDefinitionManager;
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCGenUtility;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.parsing.ConfigLocation;

public class ModuleCGenerator extends ModuleCGenUtility {

	public ModuleCGenerator() {
		super();
	}

	@Override
	public void generate(ModuleC module, ConfigLocation location, ModuleCDefinitionManager definitions) {
		// TODO Auto-generated method stub
		DebugInfo.debug("Generating for module:\n\n" + module.toOIF());
	}

}
