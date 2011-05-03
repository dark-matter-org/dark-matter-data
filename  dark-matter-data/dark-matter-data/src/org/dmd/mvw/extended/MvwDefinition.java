package org.dmd.mvw.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.generated.dmo.MvwDefinitionDMO;
import org.dmd.mvw.generated.dmw.MvwDefinitionDMW;

public class MvwDefinition extends MvwDefinitionDMW {

	public MvwDefinition(){
		
	}
	
	public MvwDefinition(MvwDefinitionDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}
	
	@Override
	public MvwDefinition getModificationRecorder() {
		// TODO Auto-generated method stub
		return null;
	}

}
