package org.dmd.mvw.tools.mvwgenerator.extended.menus;

import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuItemDMW;
import org.dmd.mvw.tools.mvwgenerator.util.RunContextItemCollection;
import org.dmd.util.exceptions.ResultException;

public class MenuItem extends MenuItemDMW {
	
	RunContextItem I18NRCI;
	String label;

	public MenuItem(){
		
	}
	
	public String getLabelForCreation(){
		return(label);
	}
	
	public RunContextItem getRCI(){
		return(I18NRCI);
	}
	
	public void initLabelInfo(RunContextItemCollection context) throws ResultException {
		if (getDisplayLabel() == null){
			if (getDisplayLabelI18N() == null){
				ResultException errors  = new ResultException();
				errors.addError("The " + getElementName() + " MenuItem must have either a displayLabel or a displayLabelI18N defined.");
				errors.result.lastResult().fileName(getFile());
				errors.result.lastResult().lineNumber(getLineNumber());			
				throw(errors);
			}
			int period = getDisplayLabelI18N().indexOf(".");
			if (period == -1){
				ResultException errors  = new ResultException();
				errors.addError("The " + getElementName() + " MenuItem has a malformed displayLabelI18N: " + getDisplayLabelI18N());
				errors.result.lastResult().fileName(getFile());
				errors.result.lastResult().lineNumber(getLineNumber());			
				throw(errors);
			}
			String rciString = getDisplayLabelI18N().substring(0, period).trim();
			
			RunContextItem rci = context.getItem(rciString);
			
			if (rci == null){
				ResultException errors  = new ResultException();
				errors.addError("The " + getElementName() + " MenuItem refers to an unknown RunContextItem in its displayLabelI18N: " + rciString);
				errors.result.lastResult().fileName(getFile());
				errors.result.lastResult().lineNumber(getLineNumber());			
				throw(errors);
			}
			I18NRCI = rci;
			
			label = getDisplayLabelI18N();
		}
		else{
			I18NRCI = null;
			label = "\"" + getDisplayLabel() + "\"";
		}
	}
}
