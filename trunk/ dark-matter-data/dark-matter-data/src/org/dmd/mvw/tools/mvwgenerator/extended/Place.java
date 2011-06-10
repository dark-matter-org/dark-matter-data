package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PlaceDMW;
import org.dmd.util.exceptions.ResultException;

public class Place extends PlaceDMW {

	public Place(){
		
	}

	protected Place(PlaceDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public void initCodeGenInfo() throws ResultException {
	}
}
