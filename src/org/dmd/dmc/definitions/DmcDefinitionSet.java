package org.dmd.dmc.definitions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.types.DotName;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The DmcDefinitionSet class provides a mechanism to store a set of definitions
 * with the possibility that the DefinitionName of some of the definitions may clash.
 * @param <DEF> 
 */
public class DmcDefinitionSet<DEF extends DmcDefinitionIF> {
	
	static boolean debug = false;
	
	// The definitions keyed by DefinitionName, there could be more than one definition with the same name
	TreeMap<DefinitionName,ArrayList<DEF>>	map;
	
	// The dotnames of a set of definitions must be unique
	TreeMap<DotName,DEF>	dotmap;
	
	// In some cases, it's useful to know the longest name; usually when formatting code
	int longestName;
	
	/**
	 * Constructs a new definition set.
	 */
	public DmcDefinitionSet(){
		map = new TreeMap<DefinitionName, ArrayList<DEF>>();
		dotmap = new TreeMap<DotName, DEF>();
	}
	
	static public void debug(boolean f){
		debug = f;
	}
	
	/**
	 * Adds the specified definition. If the dotname of the definition already exists, an IllegalState
	 * exception is thrown.
	 * @param def the definition to be added.
	 */
	public void add(DEF def){
		ArrayList<DEF> existing = map.get(def.getName());
		
		if (debug)
			DebugInfo.debug(def.getName() + "    " + def.getDotName().getNameString());
		
		if (existing == null){
			existing = new ArrayList<DEF>(1);
			map.put(def.getName(), existing);
		}
		else{
			if (debug)
				DebugInfo.debug("CLASHING: " + def.getName());
		}
		existing.add(def);
		
		if (def.getName().getNameString().length() > longestName)
			longestName = def.getName().getNameString().length();
		
		DEF existingDot = dotmap.get(def.getDotName());
		if (existingDot != null)
			throw(new IllegalStateException("The dotname of these definitions clash: \n" + existingDot.toOIF() + "\n\n" + def.toOIF()));
		dotmap.put(def.getDotName(), def);
	}
	
	/**
	 * @return the number of definitions in this set.
	 */
	public int size(){
		return(dotmap.size());
	}
	
	/**
	 * @return the length of the longest DefinitionName
	 */
	public int getLongestName(){
		return(longestName);
	}
	
	/**
	 * @param name the name of the object you're looking for
	 * @return the definition or null if it doesn't exist.
	 */
	public DEF getDefinition(DotName name){
		return(dotmap.get(name));
	}
	
	/**
	 * @return the set of definition in this set.
	 */
	public Collection<DEF> values(){
		return(dotmap.values());
	}
	
	/**
	 * Attempts to return a definition based on its name.
	 * @param name the name of the definition you're looking for
	 * @return the definition or null if it doesn't exist
	 * @throws DmcNameClashException if there's more than one definition with the specified
	 * name, we throw an exception
	 */
	public DEF getDefinition(String name) throws DmcNameClashException {
		ArrayList<DEF> existing = map.get(name);
		
		if (existing.size() == 1)
			return(existing.get(0));
		
		@SuppressWarnings("unchecked")
		DmcNameClashException mdce = new DmcNameClashException("",(ArrayList<DmcNamedObjectIF>) existing);
		throw(mdce);
	}
	
	/**
	 * @return all the dot names for which we have a definition in the set
	 */
	public String getAllDotNames(){
		StringBuffer sb = new StringBuffer();
		
		for(DotName dn : dotmap.keySet()){
			sb.append(dn.toString() + "\n");
		}
		
		return(sb.toString());
	}

}
