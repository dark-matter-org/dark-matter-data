package org.dmd.features.extgwt.extended;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.generated.dmw.MvcControllerDMW;

public class MvcController extends MvcControllerDMW {
	
	public MvcController(){
		super();
		
		System.out.println("YEEHAH!\n");
	}
	
	public MvcController(DmcObject obj){
		super(obj);
	}
	
}
