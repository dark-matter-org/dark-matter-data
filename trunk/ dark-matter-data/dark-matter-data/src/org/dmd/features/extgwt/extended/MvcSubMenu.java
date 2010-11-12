package org.dmd.features.extgwt.extended;

import org.dmd.features.extgwt.generated.dmw.MvcSubMenuDMW;

public class MvcSubMenu extends MvcSubMenuDMW {

	@Override
	public String getDefaultImport(){
		MvcMenu menu = getAddToMenu();
		if (menu instanceof MvcToolBar)
			return("org.dmd.features.extgwt.client.util.menu.DefaultToolbarSubmenu");
		else
			return("org.dmd.features.extgwt.client.util.menu.DefaultMenubarSubmenu");
	}
	
	@Override
	public String getDefaultClass(){
		MvcMenu menu = getAddToMenu();
		if (menu instanceof MvcToolBar)
			return("DefaultToolbarSubmenu");
		else
			return("DefaultMenubarSubmenu");
	}

	@Override
	public String getInstantiation(){
		MvcMenu menu = getAddToMenu();
		StringBuffer sb = new StringBuffer();
		
		if (getCustomRender()){
			return(null);
		}
		else{
			if (menu instanceof MvcToolBar){
				sb.append("        " + getVariableName() + " = new " + getDefaultClass() + "(");
				sb.append("\"" + getName() + "\", ");
				sb.append("\"" + getMenuOrder() + "\", ");
				sb.append("\"" + getAddToMenu().getName() + "\", ");
				sb.append("\"" + getDisplayLabel() + "\"");
				sb.append(");\n");
			}
			else{
				return(null);
			}
		}
		
		return(sb.toString());
	}

}
