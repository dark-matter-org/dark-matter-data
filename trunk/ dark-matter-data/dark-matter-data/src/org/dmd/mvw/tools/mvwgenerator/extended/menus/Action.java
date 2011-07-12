package org.dmd.mvw.tools.mvwgenerator.extended.menus;

import org.dmd.mvw.tools.mvwgenerator.extended.Component;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ActionDMW;
import org.dmd.util.codegen.ImportManager;

public class Action extends ActionDMW {
	
	ImportManager	imports;

	public Action(){
		
	}
	
	public String getImports(){
		return(imports.getFormattedImports());
	}
	
	public void initCodeGenInfo(){
		imports = new ImportManager();		

		imports.addImport("org.dmd.mvw.client.mvwmenus.base.Action", "Base class");
		imports.addImport("org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF", "Trigger interface");
		
		Component component = getImplementedBy();
		String genPackage = component.getDefinedInModule().getGenPackage();	
		String compImport = genPackage + ".generated.mvw." + component.genSubPackage() + "." + component.getComponentName() + "BaseImpl";
		
		imports.addImport(compImport, "Implementing component");
		
	}
}
