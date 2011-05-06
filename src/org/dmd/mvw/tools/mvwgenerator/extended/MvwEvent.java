package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwEventDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MvwEventDMW;

abstract public class MvwEvent extends MvwEventDMW {
	
	public MvwEvent(){
		
	}

	protected MvwEvent(MvwEventDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
}
