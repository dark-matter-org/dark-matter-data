package org.dmd.dmt.dsd.dsda.tools.config;

import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleADefinitionManager;
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGenUtility;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;

public class ModuleAConfigLoader extends ModuleAGenUtility {
	
	private ModuleADefinitionManager definitionManager;
	
	public ModuleAConfigLoader() {
		// TODO Auto-generated constructor stub
	}
	
	public void load(String configDir) throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
		String[] args = { "-srcdir", configDir };
		
		super.run(args);
	}

	public ModuleADefinitionManager definitionmanager() {
		return(definitionManager);
	}

	@Override
	public void parsingComplete(ModuleA module, ConfigLocation location, ModuleADefinitionManager definitions)
			throws ResultException {
		definitionManager = definitions;
		
	}

	@Override
	public void objectResolutionComplete(ModuleA module, ConfigLocation location, ModuleADefinitionManager definitions)
			throws ResultException {
		definitionManager = definitions;
		
	}

	@Override
	public void generate(ModuleA module, ConfigLocation location, ModuleADefinitionManager definitions)
			throws IOException {
		definitionManager = definitions;
		
	}

	@Override
	public void generate(ModuleADefinitionManager definitions) throws IOException {
		definitionManager = definitions;
		
	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub
		
	}

}
