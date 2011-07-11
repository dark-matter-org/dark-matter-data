package org.dmd.dmc;

import java.util.Map;
import java.util.TreeMap;

import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;

/**
 * The DmcClassInfo class is a helper class that stores a small amount of information
 * derived from a a ClassDefinition. This information is used to assist during object
 * deserialization and may also be used in filtering.
 */
public class DmcClassInfo {

	// The string name of the attribute
	final public String 		name;
	
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
	
	public DmcClassInfo(String n, int i, ClassTypeEnum ct, DataTypeEnum dt, DmcClassInfo bc, DmcAttributeInfo na){
		name			= n;
		id				= i;
		classType		= ct;
		dataType		= dt;
		derivedFrom		= bc;
		byID			= new TreeMap<Integer,DmcAttributeInfoRef>();
		nameAttribute	= na;
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

}
