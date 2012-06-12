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
package org.dmd.dmw;

import java.io.IOException;
import java.util.HashMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.conversion.AttributeReadInterceptor;
import org.dmd.dmc.conversion.ObjectReadInterceptor;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.ClassDefinitionREF;
import org.dmd.util.exceptions.ResultException;

public class DmwDeserializer {

	SchemaManager	schema;
	
	// Interceptors for particular attributes, applied regardless of what
	// objects they are found in
	HashMap<DmcAttributeInfo,AttributeReadInterceptor>	attrRI;
	
	// Interceptors for attributes used in a particular class of object.
	HashMap<Integer,ClassSpecificInfo>					classRI;
	
	// Object level interceptors
	HashMap<DmcClassInfo, ObjectReadInterceptor>		objRI;

	public DmwDeserializer(SchemaManager s){
		schema 	= s;
		attrRI 	= new HashMap<DmcAttributeInfo, AttributeReadInterceptor>();
		classRI = new HashMap<Integer, DmwDeserializer.ClassSpecificInfo>();
		objRI	= new HashMap<DmcClassInfo, ObjectReadInterceptor>();
	}
	
	/**
	 * @return the schema we're using to interpret the input stream.
	 */
	public SchemaManager getSchema(){
		return(schema);
	}
	
	/**
	 * Adds an attribute specific interceptor. This implies that the attribute read
	 * process will be intercepted for all instances of the specific attribute.
	 * @param ai The attribute info.
	 * @param ari The interceptor.
	 */
	public void addInterceptor(DmcAttributeInfo ai, AttributeReadInterceptor ari){
		if (attrRI.containsKey(ai))
			throw(new IllegalStateException("Duplicate interceptor for attribute: " + ai));
		attrRI.put(ai,ari);
	}
	
	/**
	 * Adds a class specific attribute interceptor. If the attribute doesn't have a
	 * general interceptor, the interceptor will be called when the attribute is being
	 * processed within the context of the specified class.
	 * @param dci The class info.
	 * @param ai The attribute info.
	 * @param ari The interceptor.
	 */
	public void addInterceptor(DmcClassInfo dci, DmcAttributeInfo ai, AttributeReadInterceptor ari){
		ClassSpecificInfo csi = classRI.get(dci.id);
		if (csi == null)
			csi = new ClassSpecificInfo(dci);
		csi.addInterceptor(ai, ari);
	}
	
	/**
	 * Adds an object level interceptor for the specified class.
	 * @param dci The class info.
	 * @param ori The object interceptor.
	 */
	public void addInterceptor(DmcClassInfo dci, ObjectReadInterceptor ori){
		if (objRI.containsKey(dci))
			throw(new IllegalStateException("Duplicate interceptor for object class: " + dci));
		objRI.put(dci, ori);
	}
	
	
	/**
	 * This method will read the next serialized object from the input stream and return it.
	 * @param dis The input stream.
	 * @return A wrapped DMO.
	 * @throws Exception 
	 * @throws IOException
	 * @throws ResultException 
	 * @throws Exception 
	 */
	public DmwWrapper deserialize(DmcInputStreamIF dis) throws Exception {
		DmwWrapper rc = null;
		DmcObject dmo = null;
				
		// READ: the number of classes in the objectClass
		int classCount = dis.readInt();
		
		// READ: the construction class ID
		int classID = dis.readInt();
		
		// Try to find the class in the schema
		ClassDefinition cd = schema.isClass(classID);
		
		if (cd == null)
			throw new IllegalStateException("Unknown class ID: " + classID + " ensure that you have loaded the required schemas.");
		
		// Instantiate the object
		rc = cd.newInstance();
		dmo = rc.getDmcObject();
				
		// Add the auxiliary classes if they exist
		if (classCount > 1){
			for(int i=1; i<classCount; i++){
				classID = dis.readInt();
				cd = schema.isClass(classID);
				dmo.addAux(new ClassDefinitionREF(cd.getDMO()));
			}
		}
		
		// READ: the number of attributes
		int 		attrCount = dis.readAttributeCount();
		
		for(int i=0; i<attrCount; i++){
			DmcAttribute<?> attr = dis.getAttributeInstance();
			
			// READ: the current attribute
			attr.deserializeIt(dis);
			
			if (attr.getAttributeInfo().valueType == ValueTypeEnum.SINGLE)
				dmo.set(attr.getAttributeInfo(), attr);
			else
				dmo.add(attr.getAttributeInfo(), attr);
		}
		
		return(rc);
	}	

	/**
	 * This method will read the next serialized object from the input stream and apply any
	 * required attribute level data conversions.
	 * @param dis The input stream.
	 * @return A wrapped DMO.
	 * @throws Exception 
	 * @throws IOException
	 * @throws ResultException 
	 * @throws Exception 
	 */
	public DmwWrapper deserializeWithConversion(DmcInputStreamIF dis) throws Exception {
		DmwWrapper rc = null;
		DmcObject dmo = null;
				
		// READ: the number of classes in the objectClass
		int classCount = dis.readInt();
		
		// READ: the construction class ID
		int classID = dis.readInt();
		
		// Try to find the class in the schema
		ClassDefinition cd = schema.isClass(classID);
		
		if (cd == null)
			throw new IllegalStateException("Unknown class ID: " + classID + " ensure that you have loaded the required schemas.");
		
		// Instantiate the object
		rc = cd.newInstance();
		dmo = rc.getDmcObject();
		
//DebugInfo.debug("*** INSTANTIATED: " + cd.getConstructionClassName());
				
		// Add the auxiliary classes if they exist
		if (classCount > 1){
			for(int i=1; i<classCount; i++){
				classID = dis.readInt();
				cd = schema.isClass(classID);
				dmo.addAux(new ClassDefinitionREF(cd.getDMO()));
			}
		}
		
		// READ: the number of attributes
		int 		attrCount = dis.readAttributeCount();
//DebugInfo.debug("*** attribute count: " + attrCount);
		
		ClassSpecificInfo csi = classRI.get(dmo.getConstructionClassInfo().id);
		
		for(int i=0; i<attrCount; i++){
			DmcAttribute<?> attr = dis.getAttributeInstance();
			
//DebugInfo.debug("*** ATTRIBUTE: " + attr.getName());

			AttributeReadInterceptor ari = attrRI.get(attr.getAttributeInfo());
			
			// If we don't have a global attribute interceptor, see if there's a class specific one
			if ( (ari == null) && (csi != null) )
				ari = csi.getInterceptor(attr);
			
			if (ari == null)
				attr.deserializeIt(dis);
			else
				ari.handleAttribute(dis, attr);
			
			if (attr.getAttributeInfo().valueType == ValueTypeEnum.SINGLE)
				dmo.set(attr.getAttributeInfo(), attr);
			else
				dmo.add(attr.getAttributeInfo(), attr);
		}
		
		ObjectReadInterceptor ori = objRI.get(dmo.getConstructionClassInfo());
		if (ori != null)
			ori.handleObject(dmo);
		
		return(rc);
	}	

	class ClassSpecificInfo {
		DmcClassInfo		classInfo;
		HashMap<DmcAttributeInfo,AttributeReadInterceptor>	attrRI;
		
		ClassSpecificInfo(DmcClassInfo dci){
			classInfo = dci;
			attrRI = new HashMap<DmcAttributeInfo, AttributeReadInterceptor>();
		}
		
		void addInterceptor(DmcAttributeInfo ai, AttributeReadInterceptor ari){
			if (attrRI.containsKey(ai))
				throw(new IllegalStateException("Duplicate interceptor for attribute: " + ai));
			attrRI.put(ai,ari);			
		}
		
		AttributeReadInterceptor getInterceptor(DmcAttribute<?> attr){
			return(attrRI.get(attr.getAttributeInfo()));
		}
	}
}
