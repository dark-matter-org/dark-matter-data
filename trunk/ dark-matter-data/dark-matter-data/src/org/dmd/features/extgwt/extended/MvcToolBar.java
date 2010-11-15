package org.dmd.features.extgwt.extended;

import org.dmd.features.extgwt.generated.dmw.MvcToolBarDMW;

public class MvcToolBar extends MvcToolBarDMW {

	@Override
	public String getDefaultImport(){
		return("org.dmd.features.extgwt.client.util.menu.DefaultToolbar");
	}
	
	@Override
	public String getDefaultClass(){
		return("DefaultToolbar");
	}

	@Override
	public String getInstantiation(){
		if (getCustomRender()){
			return(null);
		}
		else{
			return("        " + getVariableName() + " = new " + getDefaultClass() + "(\"" + getName() + "\");\n");
		}
	}
}
