package org.dmd.dmt.dsd.dsdc.server.extended;

import java.io.IOException;

import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCDefinitionManager;
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCGenUtility;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
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

	@Override
	public void displayHelp() {
		System.out.println("\nHELP!\n\n");
	}

	@Override
	public void parsingComplete(ModuleC module, ConfigLocation location, ModuleCDefinitionManager definitions) throws ResultException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectResolutionComplete(ModuleC module,
			ConfigLocation location, ModuleCDefinitionManager definitions)
			throws ResultException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generate(ModuleCDefinitionManager definitions)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

}
