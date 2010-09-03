package org.dmd.features.extgwt.types;

import org.dmd.dmc.DmcValueException;

public class ForwardedEvent {

	String eventName;
	
	String viewName;
	
	public ForwardedEvent(){
		
	}
	
	public ForwardedEvent(String v) throws DmcValueException {
		set(v);
	}
	
	public void set(String value) throws DmcValueException {
		if (value == null){
			throw(new DmcValueException("null value passed to EnumValue.set()"));
		}
		
		String v = value.trim();
		
		int space1 = v.indexOf(" ");

		if (space1 == -1){
			throw(new DmcValueException("Incorrect number of tokens for ForwardedEvent(): " + v));
		}
		
		eventName = v.substring(0,space1);
		
		viewName = v.substring(space1 + 1);
		
	}
}
