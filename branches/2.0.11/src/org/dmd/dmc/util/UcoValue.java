package org.dmd.dmc.util;

public class UcoValue implements AttributeValueIF {
	
	DmcUncheckedObjectNEW value;

	public UcoValue(DmcUncheckedObjectNEW uco){
		value = uco;
	}
	
	public DmcUncheckedObjectNEW getValue(){
		return(value);
	}
}
