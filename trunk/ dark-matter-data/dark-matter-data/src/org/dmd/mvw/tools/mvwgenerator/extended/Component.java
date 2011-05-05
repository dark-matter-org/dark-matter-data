package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ComponentDMW;

public class Component extends ComponentDMW {

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

}
