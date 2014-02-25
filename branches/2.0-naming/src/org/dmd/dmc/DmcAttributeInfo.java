//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmc;

import org.dmd.dmc.types.DotName;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;

/**
 * The DmcAttributeInfo class is a helper class that stores a small amount of information
 * about the individual attributes that comprise a generated Dark Matter object (DMO). This
 * information is used to assist with serialization and deserialization of objects in
 * a generic manner. In some regards, it can be seen as serving a similar purpose to 
 * the information provided to the Google Protocol Buffer mechanisms, except that its
 * information is derived from the AttributeDefinition of Dark Matter Schema (DMS) specifications.
 */
public class DmcAttributeInfo implements Comparable<DmcAttributeInfo> {

	// The qualified name of the attribute i.e. schema.attribute
	final public DotName		qualifiedName;
	
	// The string name of the attribute
	final public String 		name;
	
	// The DMD identifier of this attribute. This is used to look up the attribute's 
	// information when deserializing an attribute. We look up the information so
	// that we can instantiate the correct DmcAttribute derivative to hold the attribute value.
	final public int 			id;
	
	// The name of the type of DmcAttribute used to store these values
	final public String 		type;
	
	// Indicates whether the attribute is single valued, multi-valued, hashed or mapped
	final public ValueTypeEnum	valueType;
	
	// Indicates if an attribute is transient or persistent
	final public DataTypeEnum	dataType;
	
	final public int			indexSize;
	
	// For reference attributes, indicates whether the reference is weak i.e. no exception thrown
	// when the name can't be resolved.
	final public boolean		weakReference;
	
	/**
	 * This form is used in ComplexTypeDefinitions - it has no schema name.
	 * @param n the name of the attribute.
	 * @param i the identifier - always 0
	 * @param t the type
	 * @param at the valueType
	 * @param dte the data type - always UNKNOWN
	 */
	public DmcAttributeInfo(String n, int i, String t, ValueTypeEnum at, DataTypeEnum dte){
		qualifiedName	= new DotName("NOT_SET",n);
		name 			= n;
		id				= i;
		type			= t;
		valueType		= at;
		dataType		= dte;
		indexSize		= 0;
		weakReference	= false;
	}
	
	/**
	 * This form is used in ComplexTypeDefinitions - it has no schema name.
	 * @param n the name of the attribute.
	 * @param i the identifier - always 0
	 * @param t the type
	 * @param at the valueType
	 * @param dte the data type - always UNKNOWN
	 * @param is index size - always 0
	 * @param wr weak reference flag
	 */
	public DmcAttributeInfo(String n, int i, String t, ValueTypeEnum at, DataTypeEnum dte, int is, boolean wr){
		qualifiedName	= new DotName("NOT_SET",n);
		name 			= n;
		id				= i;
		type			= t;
		valueType		= at;
		dataType		= dte;
		indexSize		= is;
		weakReference	= wr;
	}
	
	public DmcAttributeInfo(String schema, String n, int i, String t, ValueTypeEnum at, DataTypeEnum dte){
		qualifiedName	= new DotName(schema,n);;
		name 			= n;
		id				= i;
		type			= t;
		valueType		= at;
		dataType		= dte;
		indexSize		= 0;
		weakReference	= false;
	}
	
//	public DmcAttributeInfo(String n, int i, String t, ValueTypeEnum at, DataTypeEnum dte, int is){
//		qualifiedName	= new DotName("NOT_SET",n);;
//		name 			= n;
//		id				= i;
//		type			= t;
//		valueType		= at;
//		dataType		= dte;
//		indexSize		= is;
//	}
	
	public DmcAttributeInfo(String schema, String n, int i, String t, ValueTypeEnum at, DataTypeEnum dte, int is){
		qualifiedName 	= new DotName(schema,n);
		name 			= n;
		id				= i;
		type			= t;
		valueType		= at;
		dataType		= dte;
		indexSize		= is;
		weakReference	= false;
	}
	
	public DmcAttributeInfo(String schema, String n, int i, String t, ValueTypeEnum at, DataTypeEnum dte, int is, boolean wr){
		qualifiedName 	= new DotName(schema,n);
		name 			= n;
		id				= i;
		type			= t;
		valueType		= at;
		dataType		= dte;
		indexSize		= is;
		weakReference	= wr;
	}
	
//	public String toString(){
//		return(name + " " + id + " " + type + " " + valueType + " " + dataType + " must: " + mandatory + " index: " + indexSize);
//	}

	public String toString(){
		return(qualifiedName + " " + name + " " + id + " " + type + " " + valueType + " " + dataType + " index: " + indexSize + " weak: " + weakReference);
	}

	@Override
	public int compareTo(DmcAttributeInfo dai) {
		if (id == dai.id)
			return(0);
		if (id < dai.id)
			return(-1);
		return(1);
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof DmcAttributeInfo){
			if (id == ((DmcAttributeInfo)obj).id)
				return(true);
		}
		return(false);
	}

	@Override
	public int hashCode(){
		return(id);
	}

}
