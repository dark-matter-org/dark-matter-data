package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ComponentDMW;
import org.dmd.util.codegen.ImportManager;

public class Component extends ComponentDMW {

	protected boolean initialized;
	
	protected ImportManager	imports;
	
	StringBuffer		presenterInterfaces;

	public Component(){
		
	}
	
	protected Component(ComponentDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	@Override
	public Component getModificationRecorder() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getImports(){
		return(imports.getFormattedImports());
	}
	
	public String getPresenterInterfaces(){
		return(presenterInterfaces.toString());
	}
	
	protected void initCodeGenInfo(){
		imports = new ImportManager();
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
		
		if (getHandlesEventHasValue()){
			for(Event event: getHandlesEventIterable()){
				event.addImport(imports);
				event.handledBy(this);
			}
		}
		
		if (getFiresEventHasValue()){
			for(Event event: getFiresEventIterable()){
				event.addImport(imports);
				event.firedBy(this);
			}
		}
	}

}
