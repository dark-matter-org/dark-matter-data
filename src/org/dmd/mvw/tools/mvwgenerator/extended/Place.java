package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PlaceDMW;
import org.dmd.util.codegen.ImportManager;

public class Place extends PlaceDMW implements CodeGenComponentIF {
	
	boolean			initialized;
	ImportManager	imports;

	public Place(){
		initialized	= false;
		imports 	= new ImportManager();
	}

	protected Place(PlaceDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public void initCodeGenInfo(){
		if (!initialized){
			imports = new ImportManager();
			
			imports.addImport("com.google.gwt.place.shared.Prefix", "Required for Prefix annotation");
			imports.addImport("org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF", "Needed to construct activity");
			
			if (getRunsActivity().isCodeSplit()){
				imports.addImport("com.google.gwt.core.client.GWT", "Access to runAsynch()");
				imports.addImport("com.google.gwt.core.client.RunAsyncCallback", "Handling runAsync() results");
				imports.addImport("com.google.gwt.activity.shared.Activity", "So we can return an Activity");
				imports.addImport("org.dmd.mvw.client.mvw.MvwAsyncPlace", "Our base class");
				imports.addImport("org.dmd.mvw.client.mvw.MvwAsyncPlaceController", "Handles our asynch callback that the activity is ready");
			}
			else
				imports.addImport("org.dmd.mvw.client.mvw.MvwPlace", "Our base class");
			imports.addImport("com.google.gwt.place.shared.PlaceTokenizer", "Tokenizer interface");
			
			imports.addImport(getRunsActivity().getImplementationClass(), "Runs this activity");
		}
	}
	
	public String getImports(){
		return(imports.getFormattedImports());
	}
	
	public String getPlaceImport(){
		return(getDefinedInModule().getGenPackage() + ".generated.mvw.places." + getPlaceName());
	}

	@Override
	public void resetCodeGenInfo() {
		initialized	= false;
		imports		= null;
	}
	
}
