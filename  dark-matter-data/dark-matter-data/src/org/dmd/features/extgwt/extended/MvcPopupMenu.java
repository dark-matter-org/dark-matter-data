package org.dmd.features.extgwt.extended;

import org.dmd.features.extgwt.generated.dmw.MvcPopupMenuDMW;

public class MvcPopupMenu extends MvcPopupMenuDMW {

	@Override
	public String getDefaultImport(){
		return("org.dmd.features.extgwt.client.util.menu.DefaultPopupMenu");
	}
	
	@Override
	public String getDefaultClass(){
		return("DefaultPopupMenu");
	}

	@Override
	public String getInstantiation(){
		if (getCustomRender()){
			return(null);
		}
		else{
			StringBuffer sb = new StringBuffer();
			sb.append("        " + getVariableName() + " = new " + getDefaultClass() + "(");
			sb.append("\"" + getName() + "\", ");
			sb.append("\"" + getUseForModelClass() + "\"");
			sb.append(");\n");
			return(sb.toString());
		}
	}

}
