package org.dmd.dmc.types;

import org.dmd.dmc.DmcObjectNameIF;

/**
 * The StringName provide the simplest form of naming an object i.e. just a String.
 */
public class StringName implements DmcObjectNameIF {
	
	String name;
	
	public StringName(){
		
	}
	
	public StringName(String n){
		name = n;
	}

	@Override
	public String getNameString() {
		return(name);
	}

	@Override
	public boolean equals(Object obj){
		return(name.equals(obj));
	}
	
	@Override
	public int hashCode(){
		return(name.hashCode());
	}
}
