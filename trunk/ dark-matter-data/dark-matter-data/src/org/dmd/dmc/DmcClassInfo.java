package org.dmd.dmc;

import java.io.Serializable;

import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;

/**
 * The DmcClassInfo class is a helper class that stores a small amount of information
 * derived from a a ClassDefinition. This information is used to assist during object
 * deserialization and may also be used in filtering.
 */
@SuppressWarnings("serial")
public class DmcClassInfo  implements Serializable {

	// The string name of the attribute
	final public String 		name;
	
	// The DMD identifier of this attribute. This is used to look up the attribute's 
	// information when deserializing an attribute. We look up the information so
	// that we can instantiate the correct DmcAttribute derivative to hold the attribute value.
	final public int 			id;
	
	// The type of the class
	final ClassTypeEnum			classType;
	
	// Indicates if an attribute is transient or persistent
	final public DataTypeEnum	dataType;
	
	// The class from which this class is derived
	final public DmcClassInfo	derivedFrom;
	
//	public DmcClassInfo(String n, int i, ClassTypeEnum ct, DataTypeEnum dt){
//		name		= n;
//		id			= i;
//		classType	= ct;
//		dataType	= dt;
//	}
	
	public DmcClassInfo(String n, int i, ClassTypeEnum ct, DataTypeEnum dt, DmcClassInfo bc){
		name		= n;
		id			= i;
		classType	= ct;
		dataType	= dt;
		derivedFrom	= bc;
	}
	
	/**
	 * Checks to see if this class or any of its base classes matches the the specified ID.
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
	
	public String toString(){
		return(name + " " + id + " " + classType + " " + dataType);
	}

}
