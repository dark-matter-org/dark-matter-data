package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PresenterDMW;

public class Presenter extends PresenterDMW {

	StringBuffer		presenterInterfaces;

	public Presenter(){
		
	}
	
	public String getPresenterInterfaces(){
		return(presenterInterfaces.toString());
	}
	
	public void initCodeGenInfo(){
		if (!initialized){
			super.initCodeGenInfo();
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
