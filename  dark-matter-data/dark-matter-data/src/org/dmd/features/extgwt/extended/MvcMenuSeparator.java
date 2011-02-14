package org.dmd.features.extgwt.extended;

import org.dmd.features.extgwt.generated.dmw.MvcMenuSeparatorDMW;

public class MvcMenuSeparator extends MvcMenuSeparatorDMW {

	public String getDefaultImport(){
		MvcMenu menu = getAddToMenu();
		
		if (menu instanceof MvcToolBar){
			return("org.dmd.features.extgwt.client.util.menu.DefaultToolbarSeparator");
		}
		else{
			return("org.dmd.features.extgwt.client.util.menu.DefaultMenuSeparator");
		}
	}
	
	public String getDefaultClass(){
		MvcMenu menu = getAddToMenu();
		
		if (menu instanceof MvcToolBar){
			return("DefaultToolbarSeparator");
		}
		else{
			return("DefaultMenuSeparator");
		}
	}

	public String getInstantiation(){
		StringBuffer sb = new StringBuffer();
		sb.append("        " + getVariableName() + " = new " + getDefaultClass() + "(");
		sb.append("\"" + getName() + "\",");
		sb.append("\"" + getMenuOrder() + "\",");
		sb.append("\"" + getAddToMenu().getName() + "\"");
		sb.append(");");
		
		return(sb.toString());
	}

}
