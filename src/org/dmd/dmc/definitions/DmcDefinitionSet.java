package org.dmd.dmc.definitions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DotName;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.DSDefinition;
//import org.dmd.util.exceptions.DebugInfo;
import org.dmd.dmw.DmwNamedObjectWrapper;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.exceptions.ResultException;

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
	
	static boolean debug = false;
	
	// The definitions keyed by DefinitionName, there could be more than one definition with the same name.
	// The name is simply the name of the definition.
	private TreeMap<DefinitionName,ArrayList<DEF>>	nameMap;
	
	// The dotnames of a set of definitions must be unique. The dot name is
	// of the form module.name.type
	private TreeMap<DotName,DEF>					fullDotNameMap;
	
	// The name and type map may contain ambiguous entries, so it is similar to the 
	// name map, however, the dot names are of the form name.type
	private TreeMap<DotName,ArrayList<DEF>>			nameAndTypeMap;
	
	// In some cases, it's useful to know the longest definition name; usually when formatting code
	private int 									longestName;
	
	// The name of this definition set
	private String 									setName;
	
	// If className is set, the definition set works in a somewhat different way in order to
	// allow for the maintenance of types derived from a base type. For
	private String 									className;
	
	// The global definition set. Any definitions added to a set that has a handle to the
	// global definition set will be added to this as well.
	private DmcDefinitionSet<DSDefinition>			globalSet;
	
	// This is set to true if this set is a global set so that we can enforce addition
	// to the set via internal mechanisms i.e. via the addGlobal() method.
	private boolean									isGlobalSet;
	
	// Handle to the definition set from which our class is derived
	private DmcDefinitionSet<?>			derivedFromSet;
	
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
		derivedFromSet	= null;
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
		derivedFromSet	= null;
	}
	
	/**
	 * Constructs a new global definition set. This type of set doesn't have a class
	 * name and is used to store a global mapping of definitions of all types.
	 * This form of the constructor also allows you to give the definition a name
	 * that can be useful for debugging purposes.
	 * @param sn the set name - so that we can see the name of this set when debugging
	 * @param cn the class name
	 */
	public DmcDefinitionSet(String sn, String cn){
		nameMap 		= new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap 	= new TreeMap<DotName, DEF>();
		nameAndTypeMap 	= new TreeMap<DotName, ArrayList<DEF>>();
		setName 		= sn;
		className		= cn;
		globalSet		= null;
		isGlobalSet		= true;
		derivedFromSet	= null;
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
		derivedFromSet	= null;
	}
	
	/**
	 * Constructs a new definition set.
	 * @param cn the name of the class of definition being stored in this definition set
	 * @param gs the global definition set
	 * @param derivedFrom definition set for class from which we're derived
	 */
	public DmcDefinitionSet(String cn, DmcDefinitionSet<DSDefinition> gs, DmcDefinitionSet<?> derivedFrom){
		nameMap 		= new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap 	= new TreeMap<DotName, DEF>();
		nameAndTypeMap 	= new TreeMap<DotName, ArrayList<DEF>>();
		setName 		= cn;
		className		= cn;
		globalSet		= gs;
		isGlobalSet		= false;
		derivedFromSet	= derivedFrom;
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
//		if (debug){
//			if (setName == null)
//				DebugInfo.debug(" : " + nameAndTypeName);
//			else
//				DebugInfo.debug(" - " + setName + " : " + nameAndTypeName);
//		}
		ArrayList<DEF> existingNameAndTypeSet = nameAndTypeMap.get(nameAndTypeName);
		
		if (existingNameAndTypeSet == null){
			existingNameAndTypeSet = new ArrayList<DEF>(1);
			nameAndTypeMap.put(nameAndTypeName, existingNameAndTypeSet);
		}
		else{
//			if (debug){
//				if (setName == null)
//					DebugInfo.debug("NAME-TYPE CLASH: " + nameAndTypeName);
//				else
//					DebugInfo.debug("NAME-TYPE CLASH - " + setName + "    : " + nameAndTypeName);
//			}
		}
		existingNameAndTypeSet.add(def);
	}
	
	/**
	 * This method is used to delete definitions from the nameAndType map.
	 * @param def
	 * @param nameAndTypeName
	 */
	void deleteByNameAndType(DEF def, DotName nameAndTypeName){
		ArrayList<DEF> existingNameAndTypeSet = nameAndTypeMap.get(nameAndTypeName);
		
		if (existingNameAndTypeSet == null){
			throw(new IllegalStateException("No entry in nameAndTypeMap for: " + def.toOIF()));
		}
		else{
			if (!existingNameAndTypeSet.remove(def))
				throw(new IllegalStateException("Could not delete entry in nameAndTypeMap for: " + def.toOIF()));

		}
	}
	
	/**
	 * This method is used to add definitions to the nameMap.
	 * @param def
	 */
	void addByName(DEF def){
//		if (debug){
//			if (setName == null)
//				DebugInfo.debug(" : " + def.getName());
//			else
//				DebugInfo.debug(" - " + setName + " : " + def.getName());
//		}
		ArrayList<DEF> existingNameSet = nameMap.get(def.getName());
		
		if (existingNameSet == null){
			existingNameSet = new ArrayList<DEF>(1);
			nameMap.put(def.getName(), existingNameSet);
		}
		else{
//			if (debug){
//				if (setName == null)
//					DebugInfo.debug("NAMEMAP CLASH: " + def.getName());
//				else
//					DebugInfo.debug("NAMEMAP CLASH - " + setName + "    : " + def.getName());
//			}
		}
		existingNameSet.add(def);
	}
	
	/**
	 * This method is used to delete definitions from the nameMap.
	 * @param def the definition to be removed.
	 */
	void deleteByName(DEF def){
		ArrayList<DEF> existingNameSet = nameMap.get(def.getName());
		
		if (existingNameSet == null){
			throw(new IllegalStateException("No entry in nameMap for: " + def.toOIF()));
		}
		else{
			if (!existingNameSet.remove(def))
				throw(new IllegalStateException("Could not delete entry in nameMap for: " + def.toOIF()));
		}
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
		
//		if (debug){
//			if (setName == null)
//				DebugInfo.debug(" : " + fullName);
//			else
//				DebugInfo.debug(" - " + setName + " : " + fullName);
//		}
//		addByName(def);
		addByNameAndType(def, nameAndTypeName);
		addByFullName(def, fullName);
	}
	
	/**
	 * This method is called on a global set to remove an alias for a definition in the
	 * case of derived definition types. 
	 * @param def the definition.
	 * @param fullName the definition's fully qualified name.
	 * @param nameAndTypeName the definition's name and type name.
	 */
	void deleteGlobal(DEF def, DotName fullName, DotName nameAndTypeName){
		if (!isGlobalSet)
			throw(new IllegalStateException(""));
		
		deleteByNameAndType(def, nameAndTypeName);
		deleteByFullName(fullName);
	}
	
	void addByFullName(DEF def, DotName fullName){
//		if (debug){
//			if (setName == null)
//				DebugInfo.debug(" : " + fullName);
//			else
//				DebugInfo.debug(" - " + setName + " : " + fullName);
//		}
		if (fullDotNameMap.get(fullName) != null){
			throw(new IllegalStateException("Clashing fully qualified name: " + fullName + " - in definition set: " + setName + " - For definition: \n\n" + def.toOIF()));
		}
		fullDotNameMap.put(fullName, def);			
	}
	
	/**
	 * Deletes the definition from the full name map.
	 * @param fullName the dot name of the definition to be deleted.
	 */
	void deleteByFullName(DotName fullName){
		if (fullDotNameMap.remove(fullName)== null)			
			throw(new IllegalStateException("Could not delete entry in fullDotNameMap for: " + fullName));
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
	 * Deletes the specified object from this definition set.
	 * @param dn the fully qualified name of a definition.
	 * @throws ResultException if the object deosn't exist or is of the wrong class.
	 */
	@SuppressWarnings("unchecked")
	public void delete(DotName dn) throws ResultException {
		DSDefinition dsd = fullDotNameMap.get(dn);
		if (dsd == null) {
			throw(new ResultException("The specified object: " + dn.getNameString() + " of class: " + className + "  doesn't exist"));
		}
		else {
			if (dsd.getConstructionClassName().equals(className)) {
				delete((DEF)dsd);
			}
			else
				throw(new ResultException("The specified object: " + dn.getNameString() + " is not of class: " + className));
		}
	}
	
	/**
	 * When we delete up the chain of derivation, we have a small hack to get around the
	 * fact that our derivedFromSet is not typed, so go through this intermediate function
	 * to cast the derived definition to the correct type.
	 * @param dsd the definition to be deleted
	 * @throws ResultException
	 */
	protected void deleteFromBase(DSDefinition dsd) throws ResultException {
		@SuppressWarnings("unchecked")
		DEF def = (DEF) dsd;
		delete(def);
	}
	
	/**
	 * Deletes the specified definition from all maps. If the definition has any references
	 * to it (that are not self referential), an exception is thrown.
	 * @param def the definition to be deleted.
	 */
	public void delete(DEF def) throws ResultException {
		ArrayList<DmwWrapper> refs = def.getReferringObjects();
		ResultException	ex = null;
		if (refs.size() > 0) {
			for(DmwWrapper wrapper: refs) {
				DSDefinition referring = (DSDefinition) wrapper;
				if (def.getDotName().equals(referring.getDotName()))
					continue;
				if (ex == null)
					ex = new ResultException("Cannot delete object because of outstanding references: " + def.getDotName());
				ex.moreMessages(referring.getDotName().getNameString());
			}
			if (ex != null)
				throw(ex);
		}
		try {
			DotName nameAndTypeName = new DotName(def.getName()+ "." + className);
			DotName fullName = new DotName(def.getNameOfModuleWhereThisCameFrom()+ "." + def.getName() + "." + className);

			deleteByName(def);
			deleteByNameAndType(def, nameAndTypeName);
			deleteByFullName(fullName);
			
			if (globalSet != null)
				globalSet.deleteGlobal(def, fullName, nameAndTypeName);
			
			if (derivedFromSet != null)
				derivedFromSet.deleteFromBase(def);
				
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
	 * This method is used to support GetRequest retrieval when a definition manager is used
	 * as a caching mechanism.
	 * @return An iterator over the set of objects in the index. It will be an empty iterator
     * if there are no objects.
	 */
	@SuppressWarnings("unchecked")
	public Collection<DmwNamedObjectWrapper> getIndex(){
		synchronized (fullDotNameMap) {
			if (fullDotNameMap.size() == 0)
				return((((List<DmwNamedObjectWrapper>) Collections.EMPTY_LIST)));
				
			LinkedList<DmwNamedObjectWrapper> values = new LinkedList<DmwNamedObjectWrapper>();
			
			for(DEF def: fullDotNameMap.values()) {
				values.add(def);
			}
	
			return(values);
		}
	}
	
	/**
	 * Attempts to return a definition based on its name.
	 * @param name the name of the definition you're looking for
	 * @return the definition or null if it doesn't exist
	 * @throws DmcNameClashException if there's more than one definition with the specified name, we throw an exception
	 * @throws DmcValueException 
	 */
	public DEF getDefinition(String name) throws DmcNameClashException, DmcValueException {
		DefinitionName dn = new DefinitionName(name);
		ArrayList<DEF> existing = nameMap.get(dn);
		
		if (existing == null)
			return(null);
		
		if (existing.size() == 0)
			return(null);
		
		if (existing.size() == 1)
			return(existing.get(0));
		
//		@SuppressWarnings("unchecked")
		ArrayList<DmcNamedObjectIF> clash = new ArrayList<>();
		for(DEF def: existing) {
			clash.add(def);
		}
		DmcNameClashException mdce = new DmcNameClashException("",clash);
		throw(mdce);
	}
	
	/**
	 * Gets the definitions with the specified name.
	 * @param name the name of the definition.
	 * @return an Iterator over the available definitions with that name or null.
	 * @throws DmcValueException
	 */
	public Iterator<DEF> getDefinitionsByName(String name) throws DmcValueException {
		DefinitionName dn = new DefinitionName(name);
		ArrayList<DEF> defs = nameMap.get(dn);
		if (defs == null)
			return(null);
		return(defs.iterator());
	}
	
	/**
	 * Using just the name of the definition (without the module), let's you know how many
	 * definitions of that name exist.
	 * @param name the definition name
	 * @return the number of definitions with that name
	 * @throws DmcValueException
	 */
	public int getDefinitionCountByName(String name) throws DmcValueException {
		DefinitionName dn = new DefinitionName(name);
		ArrayList<DEF> defs = nameMap.get(dn);
		if (defs == null)
			return(0);
		return(defs.size());
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
		
		ArrayList<DmcNamedObjectIF>	namedObjects = new ArrayList<DmcNamedObjectIF>();
		for(DEF obj: existing) {
			namedObjects.add(obj);
		}

		DmcNameClashException mdce = new DmcNameClashException("",namedObjects);
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

	public String summary() {
		StringBuilder sb = new StringBuilder();
		
		if (fullDotNameMap.size() == 0)
			return("");
		
		if (setName != null)
			sb.append("setname:     " + setName + "\n");
		
		if (className != null)
			sb.append("classname:   " + className + "\n");
		
		if (derivedFromSet != null)
			sb.append("derivedfrom: " + derivedFromSet.className + "\n");

		sb.append("fullDotNameMap: " + fullDotNameMap.size() + "\n");
		for(DotName dn: fullDotNameMap.keySet()) {
			DEF def = fullDotNameMap.get(dn);
			if (def == null)
				sb.append("    " + dn + " -- no value\n");
			else
				sb.append("    " + dn + " -- " + def.getConstructionClassName() + "\n");
				
		}
		sb.append("\n");
		
		sb.append("nameMap:\n");
		for(DefinitionName dn: nameMap.keySet()) {
			sb.append("    " + dn.getNameString() + "\n");
			ArrayList<DEF> defs = nameMap.get(dn);
			if (defs == null)
				continue;
			for(DEF def: defs) {
				sb.append("        " + def.getDotName());
			}
		}
		sb.append("\n");
		
		sb.append("nameAndTypeMap:\n");
		for(DotName dn: nameAndTypeMap.keySet()) {
			sb.append("    " + dn.getNameString() + "\n");
			ArrayList<DEF> defs = nameAndTypeMap.get(dn);
			if (defs == null)
				continue;
			for(DEF def: defs) {
				sb.append("        " + def.getDotName());
			}
		}
		sb.append("\n\n");
		
		return(sb.toString());
	}
}
