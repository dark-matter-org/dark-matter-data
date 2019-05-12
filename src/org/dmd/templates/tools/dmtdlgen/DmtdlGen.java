                                                                                                                                        package org.dmd.templates.tools.dmtdlgen;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.templates.server.extended.ContainedElement;
import org.dmd.templates.server.extended.ExtensionHook;
import org.dmd.templates.server.extended.Section;
import org.dmd.templates.server.extended.TdlModule;
import org.dmd.templates.server.extended.TextualArtifact;
import org.dmd.templates.server.generated.dmw.ContainsIterableDMW;
import org.dmd.templates.server.generated.dsd.TdlModuleDefinitionManager;
import org.dmd.templates.server.generated.dsd.TdlModuleGenUtility;
import org.dmd.templates.shared.generated.enums.CardinalityEnum;
import org.dmd.templates.shared.generated.types.Contains;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;

public class DmtdlGen extends TdlModuleGenUtility {

	@Override
	public void parsingComplete(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws ResultException {
		// Nothing to do
	}
	
	@Override
	public void objectResolutionComplete(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws ResultException {
		onlySectionsInArtifact(module);
		extensionHooksAlwaysMany(module);
		extensionHooksUseSectionWithValues(module);
	}
	
	/**
	 * Checks that ExtensionHooks refer to Sections that have values. Otherwise, what's the
	 * point of having an extension hook.
	 * @param module
	 * @throws ResultException  
	 */
	void extensionHooksUseSectionWithValues(TdlModule module) throws ResultException {
		ResultException ex = null;

		Iterator<ExtensionHook> hooks = module.getAllExtensionHook();
		while(hooks.hasNext()){
			ExtensionHook hook = hooks.next();
			
			if (hook.getUsesSection().getValueIsEmpty()){
				if (ex == null)
					ex = new ResultException();
				ex.addError("The Section used by ExtensionHook " + hook.getName() + " does not have any configurable values; it should.",hook.getFile(),hook.getLineNumber());
				
			}
		}
		if (ex != null)
			throw(ex);
	}
	
	/**
	 * Checks that all extension hooks are indicated as "many" when they are referenced.
	 * @throws ResultException  
	 */
	void extensionHooksAlwaysMany(TdlModule module) throws ResultException {
		ResultException ex = null;

		Iterator<Section> sections = module.getAllSection();
		while(sections.hasNext()){
			Section section = sections.next();
			ContainsIterableDMW it = section.getContainsIterable();
			while(it.hasNext()){
    			Contains c = it.getNext();
    			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
    			
    			if (ce instanceof ExtensionHook){
    				if (c.getOccurences() != CardinalityEnum.MANY){
	    				if (ex == null)
	    					ex = new ResultException();
	    				ex.addError("Reference to ExtensionHook: " + ce.getName() + " should be specified as many, not " + c.getOccurences(),ce.getFile(),ce.getLineNumber());
    				}
    			}
			}
		}
		if (ex != null)
			throw(ex);
	}

	/**
	 * Checks that TextualArtifacts only refer to Sections, not ExtensionHooks.
	 * @param module the module being processed.
	 * @throws ResultException
	 */
	void onlySectionsInArtifact(TdlModule module) throws ResultException {
		ResultException ex = null;

		Iterator<TextualArtifact> artifacts = module.getAllTextualArtifact();
		while(artifacts.hasNext()){
			TextualArtifact artifact = artifacts.next();
			ContainsIterableDMW it = artifact.getContainsIterable();
			while(it.hasNext()){
    			Contains c = it.getNext();
    			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
    			
    			if (ce instanceof ExtensionHook){
    				if (ex == null)
    					ex = new ResultException();
    				ex.addError("ExtensionHook: " + ce.getName() + " can only be used in Sections, not TextualArtifacts");
    			}
			}
			if (ex != null){
				ex.setLocationInfo(artifact.getFile(), artifact.getLineNumber());
				throw(ex);
			}
		}
	}

	@Override
	public void generate(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws IOException {
		System.out.println("HERE");
		
		FileUpdateManager.instance().reportProgress(System.out);
		FileUpdateManager.instance().generationStarting();
		
		String gendir = location.getConfigParentDirectory() + File.separator + "generated" + File.separator + "dmtdl";
		createIfRequired(gendir);
		
		Iterator<TextualArtifact> artifacts = module.getAllTextualArtifact();
		while(artifacts.hasNext()){
			artifacts.next().generateTextualArtifactClass(gendir);
		}
		
		Iterator<Section> sections = module.getAllSection();
		while(sections.hasNext()){
			sections.next().generateSectionClass(gendir);
		}
		
		module.generateTemplateLoader(gendir);
		
		module.generateExtensionInterface(gendir);
		
		FileUpdateManager.instance().generationComplete();
	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub

	}

	/**
	 * Creates the specified directory is it doesn't already exist.
	 */
	protected void createIfRequired(String outdir){
		if (outdir == null)
			return;
		
		File dir = new File(outdir);
		if (!dir.exists())
			dir.mkdirs();
	}

	@Override
	public void generate(TdlModuleDefinitionManager definitions) throws IOException {
		Iterator<TdlModule> modules = definitions.getAllTdlModule();
		while(modules.hasNext()){
			TdlModule module = modules.next();
			ConfigLocation location = getLocation(module);
			generate(module, location, definitions);
		}
	}


}
