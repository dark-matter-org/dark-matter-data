package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ControllerDMW;
import org.dmd.util.exceptions.ResultException;

public class Controller extends ControllerDMW {
	
	StringBuffer		controllerInterfaces;

	public Controller(){
		
	}
	
	public String getControllerInterfaces(){
		if (hasCommsMethods()){
			controllerInterfaces.append("implements ResponseHandlerIF");
		}
		if (isCentralDMPErrorHandler()){
			if (controllerInterfaces.length() > 0)
				controllerInterfaces.append(", ");
			else
				controllerInterfaces.append("implements ");
			controllerInterfaces.append("CentralDMPErrorHandlerIF");
		}
		if (isCentralRPCErrorHandler()){
			if (controllerInterfaces.length() > 0)
				controllerInterfaces.append(", ");
			else
				controllerInterfaces.append("implements ");
			controllerInterfaces.append("CentralRPCErrorHandlerIF");
		}
		if (controllerInterfaces.length() > 0)
			controllerInterfaces.append(" ");
		return(controllerInterfaces.toString());
	}
	
	public void initCodeGenInfo() throws ResultException{
		if (!initialized){
			initialized = true;
			super.initCodeGenInfo();
			
			controllerInterfaces = new StringBuffer();
		}
	}
}