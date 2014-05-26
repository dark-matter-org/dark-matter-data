package org.dmd.dms.server.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DmcNameClashException;
import org.dmd.core.interfaces.DmcNamedObjectIF;
import org.dmd.dms.server.extended.DSDefinition;
import org.dmd.dms.shared.types.DefinitionName;
import org.dmd.dms.shared.types.DotName;
import org.dmd.util.runtime.DebugInfo;

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
public class DmcDefinitionSetNew<DEF extends DSDefinition> {
	
	static boolean debug = true;
	
	// The name of the definition class stored in this collection
	String 										className;

	// If the class associated with this collection is structural, we don't allow
	// name clashes based on fullDotName
	boolean										structural;
	
	// If this class of definition is derived from another, this is
	// collection for thaht base class. This allows use to flow the 
	// addition of new definitions up the derivation hierarchy.
	// If it's null, it means that this is the global definition
	// set for all DSDefinitions.
	DmcDefinitionSetNew<? extends DSDefinition>	baseClassSet;

	DmcDefinitionSetNew<DSDefinition>			globalSet;

	// The definitions keyed by DefinitionName, there could be more than one definition with the same name.
	// The name is simply the name of the definition.
	TreeMap<DefinitionName,ArrayList<DEF>>		nameMap;
	
	// The dotnames of a set of definitions must be unique. The dot name is
	// of the form module.name.type
	TreeMap<DotName,DEF>						fullDotNameMap;
	
	// The name and type map may contain ambiguous entries, so it is similar to the 
	// name map, however, the dot names are of the form name.type
	TreeMap<DotName,ArrayList<DEF>>				nameAndTypeMap;
	
	// For abstract definitions in modules that allow for the creation of different
	// structural definitions with the same name (e.g. ClassDefinitions and TypeDefinitions in
	// the DmsModule) we can have the situation where normal full names are not
	// sufficient to distinguish between definitions. In this case, we have to 
	// generate a full name that also includes the type of the structural class
	// in addition to the type of the abstract class.
	// 
	TreeMap<DotName,ArrayList<DEF>>				clashingFullNames;
	
	// In some cases, it's useful to know the longest definition name; usually when formatting code
	int 										longestName;
	
	
	/**
	 * Constructs the global definition set.
	 * @param cn
	 */
	public DmcDefinitionSetNew(String cn){
		className 			= cn;
		baseClassSet		= null;
		globalSet			= null;
		structural			= false;
		nameMap				= new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap		= new TreeMap<DotName, DEF>();
		nameAndTypeMap		= new TreeMap<DotName, ArrayList<DEF>>();
		
		clashingFullNames	= new TreeMap<DotName, ArrayList<DEF>>();		
	}
	
	public DmcDefinitionSetNew(String cn, boolean s, DmcDefinitionSetNew<?> bcs, DmcDefinitionSetNew<DSDefinition> gs){
		className		= cn;
		baseClassSet	= bcs;
		globalSet		= gs;
		structural		= s;
		nameMap				= new TreeMap<DefinitionName, ArrayList<DEF>>();
		fullDotNameMap		= new TreeMap<DotName, DEF>();
		nameAndTypeMap		= new TreeMap<DotName, ArrayList<DEF>>();
		
		if (!structural)
			clashingFullNames = new TreeMap<DotName, ArrayList<DEF>>();
	}
	
	/**
	 * Adds the specified definition. This method can only be called to add definition instances
	 * to a structural definition collection of the appropriate type i.e. the object being added
	 * must have the same construction class as the class of this collection. 
	 * <p/>
	 * The object will be added up the definition hierarchy automatically, based on the way the
	 * various definition sets were constructed based on their derivation hierarchy.
	 * @param def the definition to be added.
	 * @throws DMFeedbackSet  
	 */
	public void add(DEF def) throws DMFeedbackSet {
		if (!structural)
			throw(new IllegalStateException("You may only add to structural class definition sets"));
		
		if (!def.getConstructionClassName().equals(className))
			throw(new IllegalStateException("Construction class name of definition does not match the class name of this definition set."));
		
		// Create the name and type name for this definition
		DotName nameAndTypeName = new DotName(def.getName()+ "." + className);
		
		addByName(def);
		addByNameAndType(def, nameAndTypeName);
		
		// Create the full name for the definition
		DotName fullName = new DotName(def.getNameOfModuleWhereThisCameFrom()+ "." + def.getName() + "." + className);
		
		addByFullName(def, fullName);
		
		baseClassSet.addToBaseSet(def);
		globalSet.addByFullName(def, fullName);
		globalSet.addByNameAndType(def, nameAndTypeName);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * This method is used to add definitions to the nameMap.
	 * @param def
	 */
	void addByName(DEF def){
		if (debug){
			DebugInfo.debug(" - " + className + " : " + def.getName());
		}
		ArrayList<DEF> existingNameSet = nameMap.get(def.getName());
		
		if (existingNameSet == null){
			existingNameSet = new ArrayList<DEF>(1);
			nameMap.put(def.getName(), existingNameSet);
		}
		else{
			if (debug){
				DebugInfo.debug("NAMEMAP CLASH - " + className + "    : " + def.getName());
			}
		}
		existingNameSet.add(def);
		
		if (def.getName().getNameString().length() > longestName)
			longestName = def.getName().getNameString().length();
	}

	/**
	 * This method is used to add definitions to the nameAndType map.
	 * @param def
	 * @param nameAndTypeName
	 */
	void addByNameAndType(DEF def, DotName nameAndTypeName){
		if (debug){
			DebugInfo.debug(" - " + className + " : " + nameAndTypeName);
		}
		ArrayList<DEF> existingNameAndTypeSet = nameAndTypeMap.get(nameAndTypeName);
		
		if (existingNameAndTypeSet == null){
			existingNameAndTypeSet = new ArrayList<DEF>(1);
			nameAndTypeMap.put(nameAndTypeName, existingNameAndTypeSet);
		}
		else{
			if (debug){
				DebugInfo.debug("NAME-TYPE CLASH - " + className + "    : " + nameAndTypeName);
			}
		}
		existingNameAndTypeSet.add(def);
	}
	
	void addByFullName(DEF def, DotName fullName){
		if (debug){
			DebugInfo.debug(" - " + className + " : " + fullName);
		}
		if (fullDotNameMap.get(fullName) != null){
			throw(new IllegalStateException("Clashing fully qualified name: " + fullName + " - in definition set: " + className + " - For definition: \n\n" + def.toOIF()));
		}
		fullDotNameMap.put(fullName, def);			
	}
	
	///////////////////////////////////////////////////////////////////////////

	void addToBaseSet(DSDefinition newDef) throws DMFeedbackSet {
		@SuppressWarnings("unchecked")
		DEF def = (DEF) newDef;
		
		if (structural){
			// Create the name and type name for this definition
			DotName nameAndTypeName = new DotName(def.getName()+ "." + className);
			
			addByName(def);
			addByNameAndType(def, nameAndTypeName);
			
			// Create the full name for the definition
			DotName fullName = new DotName(def.getNameOfModuleWhereThisCameFrom()+ "." + def.getName() + "." + className);
			
			addByFullName(def, fullName);
		}
		else{
			// Create the name and type name for this definition
			DotName nameAndTypeName = new DotName(def.getName()+ "." + className);
			
			addByName(def);
			addByNameAndType(def, nameAndTypeName);

			// Create the full name for the definition
			DotName fullName = new DotName(def.getNameOfModuleWhereThisCameFrom()+ "." + def.getName() + "." + className);
			
			addByFullNameMyClash(def, fullName);
		}
		
		if (baseClassSet != null)
			baseClassSet.addToBaseSet(def);
	}
	
	void addByFullNameMyClash(DEF newDEF, DotName fullName) throws DMFeedbackSet{
		if (debug){
			DebugInfo.debug(" - " + className + " : " + fullName);
		}
		
		// We check to see if we've had any other clashing names
		ArrayList<DEF> previousClash = clashingFullNames.get(fullName);
		
		if (previousClash == null){
			// No previous clashes, so check to see if we have a clash now
			DEF existingDEF = fullDotNameMap.get(fullName);
			
			if (existingDEF == null){
				// So far, so good, we can add to our full name map
				fullDotNameMap.put(fullName, newDEF);							
			}
			else{
				if (debug)
					DebugInfo.debug(" - " + className + " : ADJUSTING FULL NAME: " + fullName);

				// We have a clash, so we have to fall back to the more 
				// complete naming mechanism. We'll create a clashing
				// full name entry and add the two conflicting definitions.
				// We'll then create new full names for those definitions.
				ArrayList<DEF> newClash = new ArrayList<DEF>();
				newClash.add(existingDEF);
				newClash.add(newDEF);
				clashingFullNames.put(fullName, newClash);
				
				// Remove the non-unique full name
				fullDotNameMap.remove(fullName);
				
				DotName newExisting = new DotName(existingDEF.getNameOfModuleWhereThisCameFrom() + "." + existingDEF.getName() + "." + existingDEF.getConstructionClassName() + "." + className);
				DotName newForNew 	= new DotName(newDEF.getNameOfModuleWhereThisCameFrom() + "." + newDEF.getName() + "." + newDEF.getConstructionClassName() + "." + className);
				
				if (fullDotNameMap.put(newExisting, existingDEF) != null)
					throw(new IllegalStateException("Clashing expanded full dot names: " + newExisting.getNameString() + " - for entry: \n" + existingDEF.toOIF()));
				
				if (fullDotNameMap.put(newForNew, newDEF) != null)
					throw(new IllegalStateException("Clashing expanded full dot names: " + newForNew.getNameString() + " - for entry: \n" + newDEF.toOIF()));
				if (debug){
					DebugInfo.debug(" - " + className + " : NEW EXISTING: " + newExisting);
					DebugInfo.debug(" - " + className + " : NEW NEW     : " + newForNew);
				}
			}
		}
		else{
			// We had a previous clash with this name, so we'll create an expanded full name and add
			// this new entry to the existing clash
			DotName newForNew 	= new DotName(newDEF.getNameOfModuleWhereThisCameFrom() + "." + newDEF.getName() + "." + newDEF.getConstructionClassName() + "." + className);

			if (fullDotNameMap.put(newForNew, newDEF) != null)
				throw(new IllegalStateException("Clashing expanded full dot names: " + newForNew.getNameString() + " - for entry: \n" + newDEF.toOIF()));

			previousClash.add(newDEF);
		}
				
	}
	
	static public void debug(boolean f){
		debug = f;
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
	public DEF getDefinition(String name) throws DMFeedbackSet {
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
	public DEF getDefinitionByNameAndType(DotName dn) throws DMFeedbackSet {
		ArrayList<DEF> existing = nameAndTypeMap.get(dn);
		
		if (existing == null)
			return(null);
		
		if (existing.size() == 1)
			return(existing.get(0));
		
		@SuppressWarnings("unchecked")
		DmcNameClashException mdce = new DmcNameClashException("Multiple objects with the same name: " + dn,(ArrayList<DmcNamedObjectIF>) existing);
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
