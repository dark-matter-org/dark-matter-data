package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PresenterDMW;
import org.dmd.util.exceptions.ResultException;

public class Presenter extends PresenterDMW {

	StringBuffer		presenterInterfaces;

	public Presenter(){
		
	}
	
	public String getPresenterInterfaces(){
		if (hasCommsMethods()){
			presenterInterfaces.append(", ResponseHandlerIF");
		}
		if (isCentralDMPErrorHandler()){
			if (presenterInterfaces.length() > 0)
				presenterInterfaces.append(", ");
			presenterInterfaces.append("CentralDMPErrorHandlerIF");
		}
		if (isCentralRPCErrorHandler()){
			if (presenterInterfaces.length() > 0)
				presenterInterfaces.append(", ");
			presenterInterfaces.append("CentralRPCErrorHandlerIF");
		}
		return(presenterInterfaces.toString());
	}
	
	public void initCodeGenInfo() throws ResultException{
		if (!initialized){
			super.initCodeGenInfo();
			presenterInterfaces = new StringBuffer();
			
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
					presenterInterfaces.append(view.getViewName() + "Presenter");
				}
			}
		}

	}
}
