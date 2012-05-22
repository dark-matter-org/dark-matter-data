package org.dmd.mvw.tools.mvwgenerator.extended.menus;

import org.dmd.mvw.tools.mvwgenerator.extended.CodeGenComponentIF;
import org.dmd.mvw.tools.mvwgenerator.extended.Component;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ActionBindingDMW;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;

public class ActionBinding extends ActionBindingDMW implements CodeGenComponentIF {
	
	boolean			initialized;
	ImportManager	imports;

	public ActionBinding(){
		
	}
	
	public String getImports(){
		return(imports.getFormattedImports());
	}
	
	public void initCodeGenInfo(){
		
		if (!initialized){
			initialized = true;
			imports = new ImportManager();		
	
			imports.addImport("org.dmd.mvw.client.mvwmenus.base.Action", "Base class" + " - " + DebugInfo.getWhereWeAreNowShort());
			imports.addImport("org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF", "Trigger interface" + " - " + DebugInfo.getWhereWeAreNowShort());
			
			Component component = getImplementedBy();
			String genPackage = component.getDefinedInModule().getGenPackage();	
			String compImport = genPackage + ".generated.mvw." + component.genSubPackage() + "." + component.getComponentName() + "BaseImpl";
			
			imports.addImport(compImport, "Implementing component" + " - " + DebugInfo.getWhereWeAreNowShort());
		}
		
	}

	@Override
	public void resetCodeGenInfo() {
		initialized = false;
		imports		= null;
		
	}
}
