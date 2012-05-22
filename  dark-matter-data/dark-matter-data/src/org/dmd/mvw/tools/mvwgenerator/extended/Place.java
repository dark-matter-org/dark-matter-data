package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PlaceDMW;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;

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
			
			imports.addImport("com.google.gwt.place.shared.Prefix", "Required for Prefix annotation" + " - " + DebugInfo.getWhereWeAreNowShort());
			imports.addImport("org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF", "Needed to construct activity" + " - " + DebugInfo.getWhereWeAreNowShort());
			
			if (getRunsActivity().isCodeSplit()){
				imports.addImport("com.google.gwt.core.client.GWT", "Access to runAsynch()" + " - " + DebugInfo.getWhereWeAreNowShort());
				imports.addImport("com.google.gwt.core.client.RunAsyncCallback", "Handling runAsync() results" + " - " + DebugInfo.getWhereWeAreNowShort());
				imports.addImport("com.google.gwt.activity.shared.Activity", "So we can return an Activity" + " - " + DebugInfo.getWhereWeAreNowShort());
				imports.addImport("org.dmd.mvw.client.mvw.MvwAsyncPlace", "Our base class" + " - " + DebugInfo.getWhereWeAreNowShort());
				imports.addImport("org.dmd.mvw.client.mvw.MvwAsyncPlaceController", "Handles our asynch callback that the activity is ready" + " - " + DebugInfo.getWhereWeAreNowShort());
			}
			else
				imports.addImport("org.dmd.mvw.client.mvw.MvwPlace", "Our base class" + " - " + DebugInfo.getWhereWeAreNowShort());
			imports.addImport("com.google.gwt.place.shared.PlaceTokenizer", "Tokenizer interface" + " - " + DebugInfo.getWhereWeAreNowShort());
			
			imports.addImport(getRunsActivity().getImplementationClass(), "Runs this activity" + " - " + DebugInfo.getWhereWeAreNowShort());
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
