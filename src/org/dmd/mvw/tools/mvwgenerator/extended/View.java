package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ViewDMW;

public class View extends ViewDMW {

	public View(){
		
	}
	
	protected View(ViewDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
}
