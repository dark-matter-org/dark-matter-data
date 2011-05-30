package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.RunContextItemDMW;
import org.dmd.util.codegen.ImportManager;

public class RunContextItem extends RunContextItemDMW {
	
	// Item order, left padded with 0's plus the name
	String sortKey;

	public RunContextItem(){
		
	}
	
	public String getSortKey(){
		if (sortKey == null){
			String tmp = getItemOrder().toString();
			if (tmp.length() == 4)
				sortKey = tmp + getItemName().getNameString();
			if (tmp.length() == 3)
				sortKey = "0" + tmp + getItemName().getNameString();
			else if (tmp.length() == 2)
				sortKey = "00" + tmp + getItemName().getNameString();
			else if (tmp.length() == 1)
				sortKey = "000" + tmp + getItemName().getNameString();
			else
				throw(new IllegalStateException("RunContextItem itemOrder must be 4 digits or less!"));
				
		}
		return(sortKey);
	}
	
	public String getItemType(){
		int lastdot = getUseClass().lastIndexOf(".");
		
		return(getUseClass().substring(lastdot + 1));
	}
	
	public String getDefinition(){
		return("    private final " + getItemType() + " " + getItemName() + ";\n");
	}
	
	public String getInstantiation(){
		return("        " + getItemName() + " = " + getConstruction() + ";\n");
	}
	
	public String getImplVariable(){
		return("    protected final " + getItemType() + " " + getItemName() + ";\n");
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
	
	public void addUsageImplImports(ImportManager im){
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
