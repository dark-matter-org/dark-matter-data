package org.dmd.dmw;

import java.io.IOException;
import java.util.HashMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.conversion.AttributeReadInterceptor;
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

	public DmwDeserializer(SchemaManager s){
		schema = s;
		attrRI = new HashMap<DmcAttributeInfo, AttributeReadInterceptor>();
		classRI = new HashMap<Integer, DmwDeserializer.ClassSpecificInfo>();
	}
	
	/**
	 * Returns the schema we're using to interpret the input stream.
	 * @return
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
		
		ClassSpecificInfo csi = classRI.get(dmo.getConstructionClassInfo().id);
		
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
		
		boolean shouldIntercept(DmcAttribute<?> attr){
			if (attrRI.containsKey(attr.getAttributeInfo()))
				return(true);
			return(false);
		}
	}
}
