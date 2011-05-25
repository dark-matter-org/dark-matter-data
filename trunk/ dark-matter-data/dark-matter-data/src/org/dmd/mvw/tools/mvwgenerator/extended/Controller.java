package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ControllerDMW;

public class Controller extends ControllerDMW {

	public Controller(){
		
	}
	
	public void initCodeGenInfo(){
		if (!initialized){
			initialized = true;
			super.initCodeGenInfo();
			
			
		}
	}
}
