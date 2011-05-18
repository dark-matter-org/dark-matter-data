package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ViewDMW;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.SelectionTypeEnum;
import org.dmd.util.codegen.ImportManager;

/**
 * The View class extends the basic View definition to provide a variety of consistency checking
 * and the creation of various information required to format the View interface.
 */
public class View extends ViewDMW {
	
	

	public View(){
		
	}
	
	protected View(ViewDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public void getInterfaceImports(){
		if (getDisplayDMO() != null){
			ImportManager.addImport(getDisplayDMO().getDataClass().getObject().getDmoImport(), "Data class");
			if (getDisplayDMO().getCardinality() == SelectionTypeEnum.MULTI)
				ImportManager.addImport("java.util.List", "Multi-valued data");
		}
	}
	
	public String getDataMethods(){
		StringBuffer sb = new StringBuffer();
		
		if (getDisplayDMO() != null){
			String capped = GenUtility.capTheName(getDisplayDMO().getVarName());

			if (getDisplayDMO().getCardinality() == SelectionTypeEnum.SINGLE){
				sb.append("    public void set" + capped + "(" + getDisplayDMO().getDataClass().getObjectName() + "DMO " + getDisplayDMO().getVarName() + ");\n\n");
				sb.append("    public " + getDisplayDMO().getDataClass().getObjectName() + "DMO get" + capped + "();\n\n");
			}
			else{
				sb.append("    public void set" + capped + "(List<" + getDisplayDMO().getDataClass().getObjectName() + "DMO> " + getDisplayDMO().getVarName() + ");\n\n");
				sb.append("    public List<" + getDisplayDMO().getDataClass().getObjectName() + "DMO> get" + capped + "();\n\n");
			}
		}
		
		return(sb.toString());
	}
}
