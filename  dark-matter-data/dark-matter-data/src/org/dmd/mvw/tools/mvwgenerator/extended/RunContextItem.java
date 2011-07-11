package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.RunContextItemDMW;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;

public class RunContextItem extends RunContextItemDMW {
	
	// Item order, left padded with 0's plus the name
	String sortKey;
	
	// If this is an item associated with a View, this will have been set via
	// the MvwDefinitionManager. We generate a different kind of on demand method
	// for views, one that takes the View's presenter.
	View	view;
	
	// Likewise, if it's associated with a presenter, this is it.
	Presenter	presenter;

	public RunContextItem(){
		super();
	}
	
	public RunContextItem(RunContextItemDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}
	
	public void setView(View v){
		view = v;
	}
	
	public void setPresenter(Presenter p){
		presenter = p;
	}
	
	public String getPlainName(){
		int rci = getItemName().getNameString().indexOf("RCI");
		
		if (rci == -1)
			return(getItemName().getNameString());
		
		return(getItemName().getNameString().substring(0,rci));
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
		if (isCreateOnDemand())
			return("");
		return("    private final " + getItemType() + " " + getItemName() + ";\n");
	}
	
	public String getInstantiation(){
		if (isCreateOnDemand())
			return("");
		return("        " + getItemName() + " = " + getConstruction() + ";\n");
	}
	
	public String getImplVariable(){
		if (isCreateOnDemand()){
			if (isTheOne())
				return("    private " + getItemType() + " " + getItemName() + ";\n");
			else
				return("");
		}
		
		return("    protected final " + getItemType() + " " + getItemName() + ";\n");
	}
	
	public String getOnDemandMethod(){
		if (isCreateOnDemand()){
			String capped = GenUtility.capTheName(getItemName().getNameString());
			StringBuilder sb = new StringBuilder();
			if (view == null){
				sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + getItemType() + " getNew" + getPlainName() + "(){\n");
				sb.append("        return( ((" + getInterfaceName() + ")runcontext).get" + capped + "());\n");
				sb.append("    }\n\n");		
			}
			else{
				String pres	= view.getViewName() + "." + view.getViewName() + "Presenter";
				sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + getItemType() + " getNew" + getPlainName() + "(" + pres + " presenter){\n");
				sb.append("        return( ((" + getInterfaceName() + ")runcontext).get" + capped + "(presenter));\n");
				sb.append("    }\n\n");
			}
			return(sb.toString());
		}
		return("");
	}
	
	public String getImplVariableAssignment(){
		if (isCreateOnDemand())
			return("");
		
		String capped = GenUtility.capTheName(getItemName().getNameString());
		return("        " + getItemName() + " = ((" + getInterfaceName() + ")rc).get" + capped + "();\n");
	}
	
	public String getInterfaceMethod(){
		String capped = GenUtility.capTheName(getItemName().getNameString());
		if (view == null)
			return("    public " + getItemType() + " get" + capped + "();\n");
		else{
			String pres = view.getViewName() + "." + view.getViewName() + "Presenter";
			return("    public " + getItemType() + " get" + capped + "(" + pres + " presenter);\n");
		}
	}
	
	public String getImplMethod(){
		String 			capped 	= GenUtility.capTheName(getItemName().getNameString());
		StringBuilder 	sb 		= new StringBuilder();
		
		if (isCreateOnDemand()){
			if (view == null){
				sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    @Override\n");
				sb.append("    public " + getItemType() + " get" + capped + "(){\n");
				if (isTheOne()){
					sb.append("        if (" +  getItemName() + " == null)\n");
					sb.append("            " + getItemName() + " = " + getConstruction() + "();\n");
					sb.append("        return(" + getItemName() + ");\n");
				}
				else{
					sb.append("        return(" + getConstruction() + ");\n");
				}
				sb.append("    }\n");
				sb.append("\n");
			}
			else{
				String args = "";
				String pres	= view.getViewName() + "." + view.getViewName() + "Presenter";
				
				if (view.getUsesRunContextItemHasValue()){
					args = "this";
				}
				
				sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    @Override\n");
				sb.append("    public " + getItemType() + " get" + capped + "(" + pres + " presenter){\n");
				if (isTheOne()){
					sb.append("        if (" +  getItemName() + " == null)\n");
					sb.append("            " + getItemName() + " = " + getConstruction() + "(" + args + ");\n");
					sb.append("        " + getItemName()+ ".setPresenter(presenter);\n");
					sb.append("        return(" + getItemName() + ");\n");
				}
				else{
					sb.append("        " + getItemType() + " view = " + getConstruction() + "(" + args + ");\n");
					sb.append("        view.setPresenter(presenter);\n");
					sb.append("        return(view);\n");
				}
				sb.append("    }\n");
				sb.append("\n");
			}
		}
		else{
			sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    @Override\n");
			sb.append("    public " + getItemType() + " get" + capped + "(){\n");
			sb.append("        return(" + getItemName() + ");\n");
			sb.append("    }\n");
			sb.append("\n");
		}
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
