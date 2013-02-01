package org.dmd.dmc;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;

/**
 * The DmcClassInfo class is a helper class that stores a small amount of information
 * derived from a a ClassDefinition. This information is used to assist during object
 * deserialization and may also be used in filtering.
 */
public class DmcClassInfo implements Comparable<DmcClassInfo>{

	// The string name of the class
	final public String 		name;
	
	// The fully qualified name of the DMO
	final public String			dmoImport;
	
	// The DMD identifier of this attribute. This is used to look up the attribute's 
	// information when deserializing an attribute. We look up the information so
	// that we can instantiate the correct DmcAttribute derivative to hold the attribute value.
	final public int 			id;
	
	// The type of the class
	final public ClassTypeEnum	classType;
	
	// Indicates if an attribute is transient or persistent
	final public DataTypeEnum	dataType;
	
	// The class from which this class is derived
	final public DmcClassInfo	derivedFrom;
	
	final TreeMap<Integer,DmcAttributeInfoRef>	byID;
	
	final public DmcAttributeInfo	nameAttribute;
	
	// This is populated when the class is managed as part of the DmcOmni
	transient TreeMap<String,DmcClassInfo>	derivedClasses;
	
	public DmcClassInfo(String n, String di, int i, ClassTypeEnum ct, DataTypeEnum dt, DmcClassInfo bc, DmcAttributeInfo na){
		name			= n;
		dmoImport		= di;
		id				= i;
		classType		= ct;
		dataType		= dt;
		derivedFrom		= bc;
		byID			= new TreeMap<Integer,DmcAttributeInfoRef>();
		nameAttribute	= na;
		derivedClasses	= null;
	}
	
	public DmcClassInfo(String n, int i, ClassTypeEnum ct, DataTypeEnum dt, DmcClassInfo bc, DmcAttributeInfo na){
		name			= n;
		dmoImport		= null;
		id				= i;
		classType		= ct;
		dataType		= dt;
		derivedFrom		= bc;
		byID			= new TreeMap<Integer,DmcAttributeInfoRef>();
		nameAttribute	= na;
		derivedClasses	= null;
	}
	
	public void addMust(DmcAttributeInfo info){
		byID.put(info.id, new DmcAttributeInfoRef(info, true));
	}
	
	public void addMay(DmcAttributeInfo info){
		byID.put(info.id, new DmcAttributeInfoRef(info, false));
	}
	
	public Map<Integer,DmcAttributeInfoRef>	getIdToAttr(){
		return(byID);
	}
	
	/**
	 * Determines if the attribute is optional. If the attribute isn't in our set of attributes,
	 * we indicate that it's optional - this could happen in the case of extensible classes,
	 * or when auxiliary classes are involved. And, of course, auxiliary classes can't specify
	 * mandatory attributes.
	 * @param ai
	 * @return true if the attribute is optional.
	 */
	public boolean isOptional(DmcAttributeInfo ai){
		DmcAttributeInfoRef existing = byID.get(ai.id);
		
		if (existing == null)
			return(true);
		
		if (existing.mandatory)
			return(false);
		
		return(true);
	}
	
	/**
	 * @param ai The info associated with the attribute we're checking.
	 * @return true if the attribute is contained in our allowed attributes map.
	 */
	public boolean allowsAttribute(DmcAttributeInfo ai){
		boolean rc = true;
		if (byID.get(ai.id) == null){
			if (derivedFrom == null)
				rc = false;
			else
				rc = derivedFrom.allowsAttribute(ai);
		}
		return(rc);
	}
	
	/**
	 * @param id The id of an attribute.
	 * @return The attribute info if the id is in our allowed attributes map.
	 */
	public DmcAttributeInfo allowsAttribute(Integer id){
		DmcAttributeInfo rc = null;
		DmcAttributeInfoRef air = byID.get(id);
		if (air == null){
			if (derivedFrom != null)
				rc = derivedFrom.allowsAttribute(id);
		}
		else
			rc = air.info;
		return(rc);
	}
	
	/**
	 * Checks to see if this class or any of its base classes matches the specified ID.
	 * @param otherID The id to be tested.
	 * @return true if we match the ID and false otherwise.
	 */
	public boolean isInstanceOf(int otherID){
		boolean rc = false;
		
		if (id == otherID)
			rc = true;
		else{
			if (derivedFrom != null)
				rc = derivedFrom.isInstanceOf(otherID);
		}
		
		return(rc);
	}
	
	/**
	 * Checks to see if this class or any of its base classes matches the specified class name.
	 * @param className The name to be tested.
	 * @return true if we match the name and false otherwise.
	 */
	public boolean isInstanceOf(String className){
		boolean rc = false;
		
		if (name.equals(className))
			rc = true;
		else{
			if (derivedFrom != null)
				rc = derivedFrom.isInstanceOf(className);
		}
		
		return(rc);
	}
	
	public String toString(){
		return(name + " " + id + " " + classType + " " + dataType);
	}

	@Override
	public int compareTo(DmcClassInfo dci) {
		if (id == dci.id)
			return(0);
		if (id < dci.id)
			return(-1);
		return(1);
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof DmcClassInfo){
			if (id == ((DmcClassInfo)obj).id)
				return(true);
		}
		return(false);
	}

	@Override
	public int hashCode(){
		return(id);
	}

	void addDerivedClass(DmcClassInfo ci){
		if (derivedClasses == null)
			derivedClasses = new TreeMap<String, DmcClassInfo>();
		derivedClasses.put(ci.name, ci);
	}
	
	public Iterator<DmcClassInfo> getDerivedClasses(){
		if (derivedClasses != null){
			return(derivedClasses.values().iterator());
		}
		return(null);
	}

}
