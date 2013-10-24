package org.dmd.mvw.tools.mvwgenerator.util;

import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.exceptions.ResultException;

public class RunContextItemCollection {

	String	implName;
	
	TreeMap<String,RunContextItem>	byOrder;
	
	TreeMap<String,RunContextItem>	byName;
	
	// Run context interfaces
	TreeSet<String>	interfaces;
	
	int	longestTypeName;
	int longestItemName;
	
	public RunContextItemCollection(String in){
		implName 	= in;
		byOrder 	= new TreeMap<String, RunContextItem>();
		byName 		= new TreeMap<String, RunContextItem>();
		interfaces	= new TreeSet<String>();
		longestTypeName	= 0;
		longestItemName		= 0;
	}
	
	public int getLongestTypeName(){
		return(longestTypeName);
	}
	
	public int getLongestItemName(){
		return(longestItemName);
	}
	
	public TreeMap<String,RunContextItem> getItemsByName(){
		return(byName);
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
		byOrder.put(rci.getSortKey(), rci);
		interfaces.add(rci.getRunContextInterfaceName());
		
		if (rci.getItemType().length() > longestTypeName)
			longestTypeName = rci.getItemType().length();
		
		if (rci.getItemName().getNameString().length() > longestItemName)
			longestItemName = rci.getItemName().getNameString().length();
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
