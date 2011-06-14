package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ActivityDMW;
import org.dmd.util.exceptions.ResultException;

public class Activity extends ActivityDMW {

	StringBuffer 	interfaces;
	
	// The place where we run
	Place			myPlace;

	public void setPlace(Place p){
		myPlace = p;
	}
	
	public Place getPlace(){
		return(myPlace);
	}
	
	public String getInterfaces(){
		if (hasCommsMethods()){
			if (interfaces.length() == 0)
				interfaces.append("implements ResponseHandlerIF");
			else
				interfaces.append(", ResponseHandlerIF");
		}
		return(interfaces.toString());
	}
	
	@Override
	public String getBaseClassName(){
		String base = super.getBaseClassName();
		
		if (base.length() == 0){
			if (isAbstractActivity())
				return(" extends AbstractActivity ");
			else
				return(" implements Activity ");
		}
		
		return(" extends " + base + " ");
	}
	
	/**
	 * @return The fully qualified name of the class that extends this Activity's base implementation.
	 */
	public String getImplementationClass(){
		if (getSubpackage() == null)
			return(getDefinedInModule().getGenPackage() + ".extended." + getActivityName());
		else
			return(getDefinedInModule().getGenPackage() + ".extended." + getSubpackage() + "." + getActivityName());
	}


	public void initCodeGenInfo(boolean rpc, boolean dmp) throws ResultException {
		if (!initialized){
			super.initCodeGenInfo(rpc,dmp);
			interfaces = new StringBuffer();
			
			imports.addImport("org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF", "Always need context for Activities");

			if(getManagesViewHasValue()){
				boolean first = true;
				for(View view: getManagesViewIterable()){
					imports.addImportsFrom(view.getPresenterImplImports());
					if (first){
						first = false;
						interfaces.append(" implements ");
					}
					else
						interfaces.append(", ");
					interfaces.append(view.getViewName() + "Presenter");
				}
			}
			
			if (getUseBaseClass() == null){
				if (isAbstractActivity())
					imports.addImport("com.google.gwt.activity.shared.AbstractActivity", "Is abstract activity");
				else
					imports.addImport("com.google.gwt.activity.shared.Activity", "Is an activity");
			}
			
		}

	}

}
