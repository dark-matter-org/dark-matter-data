package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.BroadcastEventDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.BroadcastEventDMW;

public class BroadcastEvent extends BroadcastEventDMW {

	public BroadcastEvent(){
		
	}
	
	protected BroadcastEvent(BroadcastEventDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
}
