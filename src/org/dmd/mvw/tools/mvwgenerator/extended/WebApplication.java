package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.WebApplicationDMW;

public class WebApplication extends WebApplicationDMW {

	public WebApplication(){
		
	}
	
	public String getRunContextName(){
		return(GenUtility.capTheName(getAppName().getNameString()) + "RunContextIF");
	}
	
}
