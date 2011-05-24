package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.RunContextItemDMW;
import org.dmd.util.codegen.ImportManager;

public class RunContextItem extends RunContextItemDMW {

	public RunContextItem(){
		
	}
	
	public String getItemType(){
		int lastdot = getUseClass().lastIndexOf(".");
		
		return(getUseClass().substring(lastdot + 1));
	}
	
	public String getInstantiation(){
		return("    private final " + getItemType() + " " + getItemName() + " = " + getConstruction() + ";\n");
	}
	
	public String getImplVariable(){
		return("    private final " + getItemType() + " " + getItemName() + ";\n");
	}
	
	public String getImplVariableAssignment(){
		String capped = GenUtility.capTheName(getItemName().getNameString());
		return("        " + getItemName() + " = ((" + getInterfaceName() + ")rc).get" + capped + "();\n");
	}
	
	public String getInterfaceMethod(){
		String capped = GenUtility.capTheName(getItemName().getNameString());
		return("    public " + getItemType() + " get" + capped + "();\n");
	}
	
	public String getImplMethod(){
		String capped = GenUtility.capTheName(getItemName().getNameString());
		StringBuilder sb = new StringBuilder();
		sb.append("    @Override\n");
		sb.append("    public " + getItemType() + " get" + capped + "(){\n");
		sb.append("        return(" + getItemName() + ");\n");
		sb.append("    }\n");
		sb.append("\n");
		return(sb.toString());
	}
	
	public void addInterfaceImports(ImportManager im){
		im.addImport(getUseClass(), "Used by " + getItemName());
	}
	
	public String getInterfaceName(){
		String mod = GenUtility.capTheName(getDefinedInModule().getModuleName().getNameString());
		return(mod + "RunContextIF");
	}
	
	public void addViewImplImports(ImportManager im){
		im.addImport(getUseClass(), "Used by " + getItemName());
		
		String mod = GenUtility.capTheName(getDefinedInModule().getModuleName().getNameString());
		String prefix = getDefinedInModule().getGenPackage() + ".generated.mvw.";
		im.addImport(prefix + mod + "RunContextIF", mod + " run context");
	}
	
	public void addRunContextImplImports(ImportManager im){
		im.addImport(getUseClass(), "Used by " + getItemName());
		if (getImportThisHasValue()){
			for(String imp: getImportThisIterable()){
				im.addImport(imp, "Used by " + getItemName());
			}
		}
		
		String mod = GenUtility.capTheName(getDefinedInModule().getModuleName().getNameString());
		String prefix = getDefinedInModule().getGenPackage() + ".generated.mvw.";
		im.addImport(prefix + mod + "RunContextIF", mod + " run context");
	}
}
