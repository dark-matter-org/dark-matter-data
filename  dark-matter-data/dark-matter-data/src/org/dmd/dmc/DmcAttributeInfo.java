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

import java.io.Serializable;

import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;

/**
 * The DmcAttributeInfo class is a helper class that stores a small amount of information
 * about the individual attributes that comprise a generated Dark Matter object (DMO). This
 * information is used to assist with serialization and deserialization of objects in
 * a generic manner. In some regards, it can be seen as serving a similar purpose to 
 * the information provided to the Google Protocol Buffer mechanisms, except that it 
 * is derived from the AttributeDefinition of Dark Matter Schema (DMS) specifications.
 */
@SuppressWarnings("serial")
public class DmcAttributeInfo implements Serializable {

	// The string name of the attribute
	public String 				name;
	
	// The identifier of this attribute within the context of a particular class. This
	// is used to look up the attribute's information when deserializing an attribute.
	// We look up the information so that we can instantiate the correct DmcAttribute
	// derivative to hold the attribute value.
	public int 					id;
	
	// The name of the type of DmcAttribute used to store these values
	public String 				type;
	
	// Indicates whether the attribute is single valued, multi-valued, hashed or mapped
	public ValueTypeEnum		valueType;
	
	// Indicates if an attribute is transient or persistent
	public DataTypeEnum			dataType;
	
	// A flag to indicate if this is a mandatory (must have) or a may have attribute.
	// This is used by the AttributeSet validator to determine whether the attribute set 
	// for an object is sane.
	public Boolean	mandatory;
	
	public DmcAttributeInfo(){
		
	}
	
	public DmcAttributeInfo(String n, int i, String t, ValueTypeEnum at, DataTypeEnum dte, Boolean opt){
		name 		= n;
		id			= i;
		type		= t;
		valueType	= at;
		dataType	= dte;
		mandatory	= opt;
	}
	
	public String toString(){
		return(name + " " + id + " " + type + " " + valueType + " " + mandatory);
	}

}
