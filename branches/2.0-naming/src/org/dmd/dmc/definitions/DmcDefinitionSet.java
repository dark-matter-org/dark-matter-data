package org.dmd.dmc.definitions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DotName;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The DmcDefinitionSet class provides a mechanism to store a set of definitions
 * with the possibility that the DefinitionName of some of the definitions may clash.
 * @param <DEF> 
 */
public class DmcDefinitionSet<DEF extends DmcDefinitionIF> {
	
	static boolean debug = true;
	
	// The definitions keyed by DefinitionName, there could be more than one definition with the same name.
	// The name is simply the name of the definition.
	TreeMap<DefinitionName,ArrayList<DEF>>	nameMap;
	
	// The dotnames of a set of definitions must be unique. The dot name is
	// of the form module.name.type
	TreeMap<DotName,DEF>	fullDotNameMap;
	
	// The name and type map may contain ambiguous entries, so it is similar to the 
	// name map, however, the dot names are of the form name.type
	TreeMap<DotName,ArrayList<DEF>>	nameAndTypeMap;
	
	// In some cases, it's useful to know the longest name; usually when formatting code
	int longestName;
	
	String setName;
	
	/**
	 * Constructs a new definition set.
	 */
	public DmcDefinitionSet(){
		nameMap = new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap = new TreeMap<DotName, DEF>();
		nameAndTypeMap = new TreeMap<DotName, ArrayList<DEF>>();
		setName = null;
	}
	
	/**
	 * Constructs a new definition set.
	 * @param sn the set name - so that we can see the name of this set when debugging
	 */
	public DmcDefinitionSet(String sn){
		nameMap = new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap = new TreeMap<DotName, DEF>();
		nameAndTypeMap = new TreeMap<DotName, ArrayList<DEF>>();
		setName = sn;
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
		ArrayList<DEF> existingNameSet = nameMap.get(def.getName());
		ArrayList<DEF> existingNameAndTypeSet = null;
		
		// This is a hack for now - we need to get the nameAndTypeNames in the meta schema
		if (def.getNameAndTypeName() != null)
			nameAndTypeMap.get(def.getNameAndTypeName());
		
		if (debug){
			if (setName == null)
				DebugInfo.debug(def.getName() + "    " + def.getDotName().getNameString());
			else
				DebugInfo.debug(" to definition set: " + setName + "    " + def.getName() + "    " + def.getDotName().getNameString());
		}
		
		if (existingNameSet == null){
			existingNameSet = new ArrayList<DEF>(1);
			nameMap.put(def.getName(), existingNameSet);
		}
		else{
			if (debug){
				if (setName == null)
					DebugInfo.debug("CLASHING: " + def.getName());
				else
					DebugInfo.debug("CLASHING in definition set: " + setName + "    : " + def.getName());
			}
		}
		existingNameSet.add(def);
		
		if (def.getNameAndTypeName() != null){
			if (existingNameAndTypeSet == null){
				existingNameAndTypeSet = new ArrayList<DEF>(1);
				nameAndTypeMap.put(def.getNameAndTypeName(), existingNameAndTypeSet);
			}
			else{
				if (debug){
					if (setName == null)
						DebugInfo.debug("CLASHING: " + def.getNameAndTypeName());
					else
						DebugInfo.debug("CLASHING in definition set: " + setName + "    : " + def.getNameAndTypeName());
				}
			}
			existingNameAndTypeSet.add(def);
		}
		
		
		if (def.getName().getNameString().length() > longestName)
			longestName = def.getName().getNameString().length();
		
		DEF existingDot = fullDotNameMap.get(def.getDotName());
		if (existingDot != null)
			throw(new IllegalStateException("The dotname of these definitions clash: \n" + existingDot.toOIF() + "\n\n" + def.toOIF()));
		fullDotNameMap.put(def.getDotName(), def);
	}
	
	/**
	 * @return the number of definitions in this set.
	 */
	public int size(){
		return(fullDotNameMap.size());
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
		return(fullDotNameMap.get(name));
	}
	
	/**
	 * @return the set of definition in this set.
	 */
	public Collection<DEF> values(){
		return(fullDotNameMap.values());
	}
	
	/**
	 * Attempts to return a definition based on its name.
	 * @param name the name of the definition you're looking for
	 * @return the definition or null if it doesn't exist
	 * @throws DmcNameClashException if there's more than one definition with the specified
	 * name, we throw an exception
	 * @throws DmcValueException 
	 */
	public DEF getDefinition(String name) throws DmcNameClashException, DmcValueException {
		DefinitionName dn = new DefinitionName(name);
		ArrayList<DEF> existing = nameMap.get(dn);
		
		if (existing == null)
			return(null);
		
		if (existing.size() == 1)
			return(existing.get(0));
		
		@SuppressWarnings("unchecked")
		DmcNameClashException mdce = new DmcNameClashException("",(ArrayList<DmcNamedObjectIF>) existing);
		throw(mdce);
	}
	
	/**
	 * Attempts to return a definition based on the defname.type form of its name. This is useful
	 * in situations where name resolution is being done via the findNamedObjectMayClash() mechanisms
	 * where we have the name of the object and the attribute via which the reference is being made,
	 * which gives us the type information.
	 * @param dn the defname.type form of a definition name
	 * @return the definition or null if it doesn't exist
	 * @throws DmcNameClashException DmcNameClashException if there's more than one definition with the specified
	 * name, we throw an exception
	 * @throws DmcValueException
	 */
	public DEF getDefinitionByNameAndType(DotName dn) throws DmcNameClashException {
		ArrayList<DEF> existing = nameAndTypeMap.get(dn);
		
		if (existing == null)
			return(null);
		
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
		
		for(DotName dn : fullDotNameMap.keySet()){
			sb.append(dn.toString() + "\n");
		}
		
		return(sb.toString());
	}

}
