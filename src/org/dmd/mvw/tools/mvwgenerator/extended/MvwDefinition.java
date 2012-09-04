package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MvwDefinitionDMW;

abstract public class MvwDefinition extends MvwDefinitionDMW {
	
	public MvwDefinition(){
		
	}

	protected MvwDefinition(MvwDefinitionDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
}
