package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PresenterDMW;
import org.dmd.util.exceptions.ResultException;

public class Presenter extends PresenterDMW {

	StringBuffer		presenterInterfaces;

	// The run context item that's automatically created for us in the definition manager
	RunContextItem		runContextItem;

	public Presenter(){
		
	}
	
	@Override
	public void resetCodeGenInfo() {
		super.resetCodeGenInfo();
		initialized 		= false;
		presenterInterfaces	= null;
	}

	public void setRunContextItem(RunContextItem i){
		runContextItem = i;
	}
	
	public RunContextItem getRunContextItem(){
		return(runContextItem);
	}
	
	public String getPresenterInterfaces(){
		if (hasCommsMethods()){
			presenterInterfaces.append(", ResponseHandlerIF");
			if (handlesObjectEvents())
				presenterInterfaces.append(", EventHandlerIF");
		}
//		if (isCentralDMPErrorHandler()){
//			if (presenterInterfaces.length() > 0)
//				presenterInterfaces.append(", ");
//			presenterInterfaces.append("CentralDMPErrorHandlerIF");
//		}
//		if (isCentralRPCErrorHandler()){
//			if (presenterInterfaces.length() > 0)
//				presenterInterfaces.append(", ");
//			presenterInterfaces.append("CentralRPCErrorHandlerIF");
//		}
		return(presenterInterfaces.toString());
	}
	
	public void initCodeGenInfo(boolean rpc, boolean dmp) throws ResultException{
		if (!initialized){
			presenterInterfaces = new StringBuffer();
			
			if (getInstantiatesPresenterHasValue()){
				for(Presenter presenter: getInstantiatesPresenterIterable()){
					addUsesRunContextItem(presenter.getRunContextItem());
				}
			}
			
			super.initCodeGenInfo(rpc,dmp);

			if(getManagesViewHasValue()){
				boolean first = true;
				for(View view: getManagesViewIterable()){
					imports.addImportsFrom(view.getPresenterImplImports());
					if (first){
						first = false;
						presenterInterfaces.append(" implements ");
					}
					else
						presenterInterfaces.append(", ");
					presenterInterfaces.append(view.getViewName() + "PresenterIF");
				}
			}
		}
	}
	
	/**
	 * @return the fully qualified name of this presenter's extended implementation.
	 */
	public String getExtendedClassImport(){
		if (getSubpackage() == null)
			return(getDefinedInModule().getGenPackage() + ".extended." + getPresenterName());
		else
			return(getDefinedInModule().getGenPackage() + ".extended." + getSubpackage() + "." + getPresenterName());
		
	}
	
	/**
	 * @return the import for PresenterAsyncIF associated with this presenter. 
	 */
	public String getAsyncImport(){
		return(getDefinedInModule().getGenPackage() + ".generated.mvw.presenters." + getPresenterName() + "AsyncIF");
	}
	
	/**
	 * @return the PresenterAsyncIF name for this presenter. 
	 */
	public String getAsyncInterface(){
		return(getPresenterName() + "AsyncIF");
	}
	
	
	
	@Override
	public String genSubPackage(){
		return("presenters");
	}

}
