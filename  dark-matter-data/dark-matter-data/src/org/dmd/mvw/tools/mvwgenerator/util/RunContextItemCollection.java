package org.dmd.mvw.tools.mvwgenerator.util;

import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.exceptions.ResultException;

public class RunContextItemCollection {

	String	implName;
	
	TreeMap<Integer,RunContextItem>	byOrder;
	
	TreeMap<String,RunContextItem>	byName;
	
	TreeSet<String>	interfaces;
	
	public RunContextItemCollection(String in){
		implName 	= in;
		byOrder 	= new TreeMap<Integer, RunContextItem>();
		byName 		= new TreeMap<String, RunContextItem>();
		interfaces	= new TreeSet<String>();
	}
	
	public void addItem(RunContextItem rci) throws ResultException{
		RunContextItem existing = byName.get(rci.getItemName().getNameString());
		if (existing != null){
			ResultException ex = new ResultException();
			ex.addError("Clashing run context item name: " + rci.getItemName());
			ex.result.lastResult().moreMessages("Originally defined in module: " + existing.getDefinedInModule().getModuleName());
			ex.result.lastResult().moreMessages("Redefined in module: " + rci.getDefinedInModule().getModuleName());
			throw(ex);
		}
		byName.put(rci.getItemName().getNameString(), rci);
		byOrder.put(rci.getItemOrder(), rci);
		interfaces.add(rci.getInterfaceName());
	}
	
	public RunContextItem getItem(String name){
		return(byName.get(name));
	}
	
	public String getAllInterfaces(){
		StringBuilder sb = new StringBuilder();
		
		boolean first = true;
		for(String i: interfaces){
			if (first)
				first = false;
			else
				sb.append(", ");
			sb.append(i);
		}
		
		return(sb.toString());
	}
}
