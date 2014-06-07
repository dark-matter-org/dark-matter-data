package org.dmd.dms.tools.generation.dmogen;

import java.io.File;
import java.io.IOException;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.server.extended.DmsModule;
import org.dmd.dms.server.generated.dsd.DmsModuleDefinitionManager;
import org.dmd.dms.server.generated.dsd.DmsModuleGenUtility;
import org.dmd.dms.tools.util.DMSchemaHelper;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.runtime.DebugInfo;

public class DMOGen extends DmsModuleGenUtility {
	
	public DMOGen(){
	
	}
	
	@Override
	public void initialize() throws DMFeedbackSet {
		
	}

	@Override
	public void parsingComplete(DmsModule module, ConfigLocation location, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		DebugInfo.debug("");
		
		DMSchemaHelper.initializeInternals(module, definitions);
	}
	
	@Override
	public void objectResolutionComplete(DmsModule module, ConfigLocation location, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		// TODO Auto-generated method stub
		DebugInfo.debug("");
		
	}

	@Override
	public void generate(DmsModule module, ConfigLocation location, DmsModuleDefinitionManager definitions) throws IOException {
		// TODO Auto-generated method stub
		DebugInfo.debug("");
		
		FileUpdateManager.instance().generationStarting();

		String dmodir = location.getConfigParentDirectory() + "/generated/dmo";
		createDir(dmodir);
		
		DmoCompactSchemaFormatter.dumpCompactSchema(module, dmodir);

		FileUpdateManager.instance().generationComplete();
	}

	@Override
	public void generate(DmsModuleDefinitionManager definitions) throws IOException {
		// TODO Auto-generated method stub
		DebugInfo.debug("");
		
	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub
		DebugInfo.debug("");
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates the specified directory if it doesn't exist.
	 * @param dir the directory to create.
	 */
	void createDir(String dir) {
		File folder = new File(dir);
		
		if (!folder.exists()){
			if (!folder.mkdirs()){
				throw(new IllegalStateException("Couldn't create directory: " + dir));
			}
		}
		
	}

}
