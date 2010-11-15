package org.dmd.features.extgwt.extended;

import org.dmd.features.extgwt.generated.dmw.MvcMenuItemDMW;

public class MvcMenuItem extends MvcMenuItemDMW {

	public String getDefaultImport(){
		MvcMenu menu = getAddToMenu();
		
		if (menu instanceof MvcToolBar){
			return("org.dmd.features.extgwt.client.util.menu.DefaultToolbarItem");
		}
		else{
			return("org.dmd.features.extgwt.client.util.menu.DefaultMenuItem");
		}
	}
	
	public String getDefaultClass(){
		MvcMenu menu = getAddToMenu();
		
		if (menu instanceof MvcToolBar){
			return("DefaultToolbarItem");
		}
		else{
			return("DefaultMenuItem");
		}
	}

	public String getInstantiation(){
		if (getCustomRender()){
			return(null);
		}
		else{
			StringBuffer sb = new StringBuffer();
			sb.append("        " + getVariableName() + " = new " + getDefaultClass() + "(");
			sb.append("\"" + getName() + "\",");
			sb.append("\"" + getMenuOrder() + "\",");
			sb.append("\"" + getTriggersAction().getName() + "\",");
			sb.append("\"" + getAddToMenu().getName() + "\",");
			sb.append("\"" + getDisplayLabel() + "\"");
			sb.append(");");
			
			return(sb.toString());
		}
	}

}
