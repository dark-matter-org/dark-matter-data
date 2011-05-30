package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PlaceDMW;

public class Place extends PlaceDMW {

	public Place(){
		
	}

	protected Place(PlaceDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
}
