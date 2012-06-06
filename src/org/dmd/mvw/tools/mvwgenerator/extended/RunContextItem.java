package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.RunContextItemDMW;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

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
	
	/**
	 * A convenience override to set the camelCaseName when the itemName is set.
	 */
	@Override
	public void setItemName(Object value) throws DmcValueException {
		super.setItemName(value);
		setCamelCaseName(value);
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
	
	public String getDefinition(PrintfFormat format){
		// If the entry is not a singleton and is create on demand, we don't need to hang on
		// to its handle in the run context
		if (!isSingleton() && isCreateOnDemand())
			return("");
		StringBuilder sb = new StringBuilder();
		sb.append("    // Defined in module: " + getDefinedInModule().getCamelCaseName() + "\n");
		
		if (isSingleton())
			sb.append("    private " + format.sprintf(getItemType()) + " " + getItemName() + ";\n\n");
		else
			sb.append("    private final " + format.sprintf(getItemType()) + " " + getItemName() + ";\n\n");
		
		return(sb.toString());
//		return("    private final " + format.sprintf(getItemType()) + " " + getItemName() + ";\n");
	}
	
	public String getInstantiation(PrintfFormat format){
		if (isCreateOnDemand())
			return("");
		return("        " + format.sprintf(getItemName()) + " = " + getConstruction() + ";\n");
	}
	
	public String getImplVariable(){
		if (isCreateOnDemand()){
			if (isSingleton())
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
				if ((presenter != null) && (presenter.isCodeSplit()) ){
					sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public void get" + getPlainName() + "Async(){\n");
					sb.append("        ((" + getRunContextInterfaceName() + ")runcontext).get" + capped + "(this);\n");
					sb.append("    }\n\n");					
				}
				else{
					if (isSingleton()){
						sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
						sb.append("    public " + getItemType() + " get" + getPlainName() + "(){\n");
						sb.append("        return( ((" + getRunContextInterfaceName() + ")runcontext).get" + capped + "());\n");
						sb.append("    }\n\n");
					}
					else{
						sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
						sb.append("    public " + getItemType() + " getNew" + getPlainName() + "(){\n");
						sb.append("        return( ((" + getRunContextInterfaceName() + ")runcontext).get" + capped + "());\n");
						sb.append("    }\n\n");
					}
				}
			}
			else{
				String pres	= view.getViewName() + "IF." + view.getViewName() + "PresenterIF";
				sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + getItemType() + " getNew" + getPlainName() + "(" + pres + " presenter){\n");
				sb.append("        return( ((" + getRunContextInterfaceName() + ")runcontext).get" + capped + "(presenter));\n");
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
		return("        " + getItemName() + " = ((" + getRunContextInterfaceName() + ")rc).get" + capped + "();\n");
	}
	
	public String getInterfaceMethod(PrintfFormat format){
		String capped = GenUtility.capTheName(getItemName().getNameString());
		if (view == null){
			if ( (presenter != null) && (presenter.isCodeSplit())){
				return("    public " + format.sprintf("void") + " get" + capped + "(" + presenter.getAsyncInterface() + " requester);\n");
			}
			else
				return("    public " + format.sprintf(getItemType()) + " get" + capped + "();\n");
		}
		else{
			String pres = view.getViewName() + "IF." + view.getViewName() + "PresenterIF";
			return("    public " + format.sprintf(getItemType()) + " get" + capped + "(" + pres + " presenter);\n");
		}
	}
	
	public String getImplMethod(WebApplication app){
		String 			capped 	= GenUtility.capTheName(getItemName().getNameString());
		StringBuilder 	sb 		= new StringBuilder();
		
		if (isCreateOnDemand()){
			if (presenter != null){
				if (presenter.isCodeSplit()){
					sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    @Override\n");
					sb.append("    public void get" + capped + "(final " + presenter.getAsyncInterface() + " requester){\n");
					if (isSingleton()){
						sb.append("        if (" +  getItemName() + " == null){\n");
						sb.append("            final " + app.getRunContextName() + " thisContext = this;\n");
						sb.append("            GWT.runAsync(new RunAsyncCallback() {\n");
						sb.append("\n");
						sb.append("                @Override\n");
						sb.append("                public void onSuccess() {\n");
						sb.append("                    " + getItemName() + " = " + getConstruction() + ";\n");
						sb.append("                    requester.async" + presenter.getPresenterName() + "Ready(" + getItemName() + ");\n");
						sb.append("                }\n");
						sb.append("\n");
						sb.append("                @Override\n");
						sb.append("                public void onFailure(Throwable reason) {\n");
						sb.append("                    centralAsyncErrorHandler.handleAsyncCodeError(\"" + getConstruction() + "\",reason);\n");
						sb.append("                }\n");
						sb.append("            });\n");
						sb.append("        }\n");
						sb.append("        else\n");
						sb.append("            requester.async" + presenter.getPresenterName() + "Ready(" + getItemName() + ");\n");
					}
					else{
						sb.append("        GWT.runAsync(new RunAsyncCallback() {\n");
						sb.append("        	\n");
						sb.append("        	   @Override\n");
						sb.append("        	   public void onSuccess() {\n");
						sb.append("               requester.async" + presenter.getPresenterName() + "Ready(" + getConstruction() + ");\n");
						sb.append("        	   }\n");
						sb.append("        	\n");
						sb.append("        	   @Override\n");
						sb.append("        	   public void onFailure(Throwable reason) {\n");
						sb.append("        		   centralAsyncErrorHandler.handleAsyncCodeError(\"" + getConstruction() + "\",reason);\n");
						sb.append("        	   }\n");
						sb.append("        });\n");
					}
					sb.append("    }\n");
					sb.append("\n");
				}
				else{
					sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    @Override\n");
					sb.append("    public " + getItemType() + " get" + capped + "(){\n");
					if (isSingleton()){
						sb.append("        if (" +  getItemName() + " == null)\n");
						sb.append("            " + getItemName() + " = " + getConstruction() + ";\n");
						sb.append("        return(" + getItemName() + ");\n");
					}
					else{
						sb.append("        return(" + getConstruction() + ");\n");
					}
					sb.append("    }\n");
					sb.append("\n");
				}
			}

			if (view != null){
				String pres	= view.getViewName() + "IF." + view.getViewName() + "PresenterIF";
				String args = "";
				
				if (view.getUsesRunContextItemHasValue())
					args = "presenter, this";
				else
					args = "presenter";
				
				sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    @Override\n");
				sb.append("    public " + getItemType() + " get" + capped + "(" + pres + " presenter){\n");
				if (isSingleton()){
					sb.append("        if (" +  getItemName() + " == null)\n");
					if (args.length() > 0)
					sb.append("            " + getItemName() + " = " + getConstruction() + "(" + args + ");\n");
					sb.append("        return(" + getItemName() + ");\n");
				}
				else{
					sb.append("        " + getItemType() + " view = " + getConstruction() + "(" + args + ");\n");
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
		
//		im.addImport(getUseClass(), "Used by " + getItemName());
		
		if (view != null){
			im.addImport(view.getViewImport(),"The " + view.getViewName());
		}
		if ( (presenter != null) && (presenter.isCodeSplit()) ){
			im.addImport(presenter.getAsyncImport(),"Asynchronous creation of " + presenter.getPresenterName());
		}
		else{
			im.addImport(getUseClass(), "Used by " + getItemName());			
		}
	}
	
	/**
	 * @return the name of the run context interface associated with this item.
	 */
	public String getRunContextInterfaceName(){
		String mod = GenUtility.capTheName(getDefinedInModule().getModuleName().getNameString());
		return(mod + "RunContextIF");
	}
		
	/**
	 * @param im the import manager
	 */
	public void addUsageImplImports(ImportManager im){
//		im.addImport(getUseClass(), "Used by " + getItemName());
		
		String mod = GenUtility.capTheName(getDefinedInModule().getModuleName().getNameString());
		String prefix = getDefinedInModule().getGenPackage() + ".generated.mvw.";
		im.addImport(prefix + mod + "RunContextIF", mod + " run context");
		
		if (view != null){
			im.addImport(view.getViewImport(), "The " + view.getViewName());
		}
		
		if ( (presenter != null) && (presenter.isCodeSplit())){
			im.addImport(presenter.getAsyncImport(), "Asynchronous creation of " + presenter.getPresenterName());
		}
		else{
			im.addImport(getUseClass(), "Used by " + getItemName());			
		}
	}
	
	public void addRunContextImplImports(ImportManager im){
		im.addImport(getUseClass(), "Used by " + getItemName());
		if (getImportThisHasValue()){
			for(String imp: getImportThisIterable()){
				im.addImport(imp, "Used by " + getItemName());
			}
		}
		
//		String mod = GenUtility.capTheName(getDefinedInModule().getModuleName().getNameString());
//		String prefix = getDefinedInModule().getGenPackage() + ".generated.mvw.";
//		im.addImport(prefix + mod + "RunContextIF", mod + " run context");
		
		if (view != null){
			im.addImport(view.getViewImport(), "The " + view.getViewName());
		}
		
		if ( (presenter != null) && (presenter.isCodeSplit()) ){
			im.addImport(presenter.getAsyncImport(), "Needed to create " + presenter.getPresenterName() + " instances asynchronously");
			im.addImport("com.google.gwt.core.client.GWT","Access to runAsynch()");
			im.addImport("com.google.gwt.core.client.RunAsyncCallback","Handling runAsync() results");
		}
		
	}
	
	public boolean refersToAsyncCode(){
		if ( (presenter != null) && (presenter.isCodeSplit()) )
			return(true);
		
		return(false);
	}
	
	public String getAsyncInterface(){
		if ( (presenter != null) && (presenter.isCodeSplit()) )
			return(presenter.getAsyncInterface());
		return(null);
	}
}
