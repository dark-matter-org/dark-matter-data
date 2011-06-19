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
	public String 				name;
	
	// The DMD identifier of this attribute. This is used to look up the attribute's 
	// information when deserializing an attribute. We look up the information so
	// that we can instantiate the correct DmcAttribute derivative to hold the attribute value.
	public int 					id;
	
	// The type of the class
	ClassTypeEnum				classType;
	
	// Indicates if an attribute is transient or persistent
	public DataTypeEnum			dataType;
	
	public DmcClassInfo(String n, int i, ClassTypeEnum ct, DataTypeEnum dt){
		name		= n;
		id			= i;
		classType	= ct;
		dataType	= dt;
	}
	
	public String toString(){
		return(name + " " + id + " " + classType + " " + dataType);
	}

}
