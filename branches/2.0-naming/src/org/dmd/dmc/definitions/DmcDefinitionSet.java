package org.dmd.dmc.definitions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DotName;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.DSDefinition;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The DmcDefinitionSet class provides a mechanism to store a set of definitions
 * with the possibility that the DefinitionName of some of the definitions may clash.
 * <p/>
 * The resulting class stores three different types of maps and, depending on
 * the constructor used to create it, populates those maps in slightly different 
 * ways. The subtleties of the population has to do with how definitions are named
 * and references to them resolved.
 * <p/>
 * The nameMap for a given 
 * @param <DEF> 
 */
public class DmcDefinitionSet<DEF extends DSDefinition> {
	
	static boolean debug = true;
	
	// The definitions keyed by DefinitionName, there could be more than one definition with the same name.
	// The name is simply the name of the definition.
	TreeMap<DefinitionName,ArrayList<DEF>>	nameMap;
	
	// The dotnames of a set of definitions must be unique. The dot name is
	// of the form module.name.type
	TreeMap<DotName,DEF>					fullDotNameMap;
	
	// The name and type map may contain ambiguous entries, so it is similar to the 
	// name map, however, the dot names are of the form name.type
	TreeMap<DotName,ArrayList<DEF>>			nameAndTypeMap;
	
	// In some cases, it's useful to know the longest definition name; usually when formatting code
	int 									longestName;
	
	// The name of this definition set
	String 									setName;
	
	// If className is set, the definition set works in a somewhat different way in order to
	// allow for the maintenance of types derived from a base type. For
	String 									className;
	
	// The global definition set. Any definitions added to a set that has a handle to the
	// global definition set will be added to this as well.
	DmcDefinitionSet<DSDefinition>			globalSet;
	
	// This is set to true if this set is a global set so that we can enforce addition
	// to the set via internal mechanisms i.e. via the addGlobal() method.
	boolean									isGlobalSet;
	
	/**
	 * Constructs a new global definition set. This type of set doesn't have a class
	 * name and is used to store a global mapping of definitions of all types.
	 */
	public DmcDefinitionSet(){
		nameMap 		= new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap 	= new TreeMap<DotName, DEF>();
		nameAndTypeMap 	= new TreeMap<DotName, ArrayList<DEF>>();
		setName 		= null;
		className		= null;
		globalSet		= null;
		isGlobalSet		= false;
	}
	
	/**
	 * Constructs a new global definition set. This type of set doesn't have a class
	 * name and is used to store a global mapping of definitions of all types.
	 * This form of the constructor also allows you to give the definition a name
	 * that can be useful for debugging purposes.
	 * @param sn the set name - so that we can see the name of this set when debugging
	 */
	public DmcDefinitionSet(String sn){
		nameMap 		= new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap 	= new TreeMap<DotName, DEF>();
		nameAndTypeMap 	= new TreeMap<DotName, ArrayList<DEF>>();
		setName 		= sn;
		className		= null;
		globalSet		= null;
		isGlobalSet		= true;
	}
	
	/**
	 * Constructs a new definition set.
	 * @param cn the name of the class of definition being stored in this definition set
	 * @param gs the global definition set
	 */
	public DmcDefinitionSet(String cn, DmcDefinitionSet<DSDefinition> gs){
		nameMap 		= new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap 	= new TreeMap<DotName, DEF>();
		nameAndTypeMap 	= new TreeMap<DotName, ArrayList<DEF>>();
		setName 		= cn;
		className		= cn;
		globalSet		= gs;
		isGlobalSet		= false;
	}
	
	static public void debug(boolean f){
		debug = f;
	}
	
	/**
	 * This method is used to add definitions to the nameAndType map.
	 * @param def
	 * @param nameAndTypeName
	 */
	void addByNameAndType(DEF def, DotName nameAndTypeName){
		if (debug){
			if (setName == null)
				DebugInfo.debug(" : " + nameAndTypeName);
			else
				DebugInfo.debug(" - " + setName + " : " + nameAndTypeName);
		}
		ArrayList<DEF> existingNameAndTypeSet = nameAndTypeMap.get(nameAndTypeName);
		
		if (existingNameAndTypeSet == null){
			existingNameAndTypeSet = new ArrayList<DEF>(1);
			nameAndTypeMap.put(nameAndTypeName, existingNameAndTypeSet);
		}
		else{
			if (debug){
				if (setName == null)
					DebugInfo.debug("NAME-TYPE CLASH: " + nameAndTypeName);
				else
					DebugInfo.debug("NAME-TYPE CLASH - " + setName + "    : " + nameAndTypeName);
			}
		}
		existingNameAndTypeSet.add(def);
	}
	
	/**
	 * This method is used to add definitions to the nameMap.
	 * @param def
	 */
	void addByName(DEF def){
		if (debug){
			if (setName == null)
				DebugInfo.debug(" : " + def.getName());
			else
				DebugInfo.debug(" - " + setName + " : " + def.getName());
		}
		ArrayList<DEF> existingNameSet = nameMap.get(def.getName());
		
		if (existingNameSet == null){
			existingNameSet = new ArrayList<DEF>(1);
			nameMap.put(def.getName(), existingNameSet);
		}
		else{
			if (debug){
				if (setName == null)
					DebugInfo.debug("NAMEMAP CLASH: " + def.getName());
				else
					DebugInfo.debug("NAMEMAP CLASH - " + setName + "    : " + def.getName());
			}
		}
		existingNameSet.add(def);
	}
	
	/**
	 * This method is called on a global set to add an alias for a definition in the
	 * case of derived definition types. 
	 * @param def the definition.
	 * @param fullName the definition's fully qualified name.
	 * @param nameAndTypeName the definition's name and type name.
	 */
	void addGlobal(DEF def, DotName fullName, DotName nameAndTypeName){
		if (!isGlobalSet)
			throw(new IllegalStateException(""));
		
		if (debug){
			if (setName == null)
				DebugInfo.debug(" : " + fullName);
			else
				DebugInfo.debug(" - " + setName + " : " + fullName);
		}
//		addByName(def);
		addByNameAndType(def, nameAndTypeName);
		addByFullName(def, fullName);
	}
	
	void addByFullName(DEF def, DotName fullName){
		if (debug){
			if (setName == null)
				DebugInfo.debug(" : " + fullName);
			else
				DebugInfo.debug(" - " + setName + " : " + fullName);
		}
		if (fullDotNameMap.get(fullName) != null){
			throw(new IllegalStateException("Clashing fully qualified name: " + fullName + " - in definition set: " + setName + " - For definition: \n\n" + def.toOIF()));
		}
		fullDotNameMap.put(fullName, def);			
	}
	
	/**
	 * Adds the specified definition. If the dotname of the definition already exists, an IllegalState
	 * exception is thrown.
	 * @param def the definition to be added.
	 */
	public void add(DEF def){
		try {
			if (className == null){
				// TODO: This is here for backwards compatibility with the original usage of definition sets in the SchemaManager - eventually, this will be removed
				DotName nameAndTypeName = new DotName(def.getName()+ "." + def.getConstructionClassName());
				addByName(def);
				addByNameAndType(def, nameAndTypeName);
				addByFullName(def, def.getDotName());
			}
			else{
				DotName nameAndTypeName = new DotName(def.getName()+ "." + className);
				DotName fullName = new DotName(def.getNameOfModuleWhereThisCameFrom()+ "." + def.getName() + "." + className);
				
				addByName(def);
				addByNameAndType(def,nameAndTypeName);
				addByFullName(def, fullName);
				
				if (globalSet != null)
					globalSet.addGlobal(def, fullName, nameAndTypeName);
			}
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
