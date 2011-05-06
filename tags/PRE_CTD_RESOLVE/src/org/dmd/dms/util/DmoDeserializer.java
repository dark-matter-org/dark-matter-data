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
package org.dmd.dms.util;

import java.io.IOException;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREF;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmoDeserializer will deserialize a single DMO object from an input stream.
 * If you have an input stream with multiple objects, simply call the deserialize
 * method as often as required!
 * <P>
 * The DmoDeserializer is required to prevent unwanted dependencies between DMOs and
 * the Dark Matter Schema (DMS) specification mechanisms.
 */
public class DmoDeserializer {
	
	SchemaManager	schema;

	public DmoDeserializer(SchemaManager s){
		schema = s;
	}
	
	/**
	 * Returns the schema we're using to interpret the input stream.
	 * @return
	 */
	public SchemaManager getSchema(){
		return(schema);
	}
	
	//NOTE: WE MIGHT WANT THE WRAPPED OBJECT AS WELL cd.newInstance()
	
	/**
	 * This method will read a set of serialized objects from the input stream and return them.
	 * @param dis The input stream.
	 * @return An array of Dark Matter Objects (DMO).
	 * @throws Exception 
	 * @throws IOException
	 * @throws ResultException 
	 * @throws Exception 
	 */
	public DmcObject deserialize(DmcInputStreamIF dis) throws Exception {
		DmcObject dmo = null;
		
		// READ: The first part of any object is its objectClass attribute; read its
		//       id and instantiate an objectClass attribute to deserialize the class
		//       and AUX classes.
		DmcTypeClassDefinitionREF	oc   = (DmcTypeClassDefinitionREF) dis.getAttributeInstance();
		oc.deserializeIt(dis);
		oc.resolveReferences(schema);
		
		ClassDefinition cd = (ClassDefinition) oc.getMVnth(0).getObject().getContainer();
		
		// Instantiate the object
		dmo = cd.newDMOInstance();
		
		// Add the auxiliary classes if they exist
		if (oc.getMVSize() > 1){
			for(int i=1; i<oc.getMVSize(); i++){
				dmo.addAux(oc.getMVnth(i));
			}
		}
		
		// READ: the number of attributes
		int attrCount = dis.readAttributeCount();
		
		for(int i=0; i<attrCount; i++){
			DmcAttribute<?> attr = dis.getAttributeInstance();
			
			// READ: the current attribute
			attr.deserializeIt(dis);
			
			if (attr.getAttributeInfo().valueType == ValueTypeEnum.SINGLE)
				dmo.set(attr.getAttributeInfo(), attr);
			else
				dmo.add(attr.getAttributeInfo(), attr);
		}
		
		return(dmo);
	}	
	
}
