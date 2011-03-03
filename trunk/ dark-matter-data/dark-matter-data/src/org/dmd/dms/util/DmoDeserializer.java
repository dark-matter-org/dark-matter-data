package org.dmd.dms.util;

import java.io.IOException;
import java.util.ArrayList;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmoDeserializer will deserialize a set of DMO objects from an input stream.
 * The deserializer is required to prevent unwanted dependencies between DMOs and
 * the Dark Matter Schema (DMS) specification mechanisms.
 */
public class DmoDeserializer {
	
	SchemaManager	schema;

	public DmoDeserializer(SchemaManager s){
		schema = s;
	}
	
	//NOTE: WE MIGHT WANT THE WRAPPED OBJECT AS WELL cd.newInstance()
	
	/**
	 * This method will read a set of serialized objects from the input stream and return them.
	 * @param dis The input stream.
	 * @return An array of Dark Matter Objects (DMO).
	 * @throws Exception 
	 * @throws ResultException 
	 * @throws IOException
	 * @throws ResultException 
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<DmcObject> deserialize(DmcInputStreamIF dis) throws ResultException, Exception {
		ArrayList<DmcObject>	rc = new ArrayList<DmcObject>();
		
		// TODO: SERIALIZATION
		while(dis.available() > 0){
			// READ: The first part of any object is its class name
			String cn = dis.readUTF();
			
			DebugInfo.debug("class: " + cn);
			ClassDefinition cd = schema.isClass(cn);
			
			if (cd == null){
				ResultException ex = new ResultException("Unknown class in serialized stream: " + cn);
				throw(ex);
			}
			
			DmcObject dmo = cd.newDMOInstance();
			
			// READ: the number of attributes
			int attrCount = dis.readShort();
			DebugInfo.debug("attr count: " + attrCount);
			
			for(int i=0; i<attrCount; i++){
				// READ: the attribute ID
				int attrID = dis.readShort();
				
				DebugInfo.debug("attr ID: " + attrID);
				
				DmcAttributeInfo 	ai 	= dmo.getAttributeMap().get(attrID);
				
				DebugInfo.debug(ai.toString());
				
				TypeDefinition		ad	= schema.isType(ai.type);
				if (ad == null){
					ResultException ex = new ResultException("Unknown type in a serialized object: " + ai.type);
					throw(ex);
				}
				DmcAttribute attr 	= (DmcAttribute) ad.getTypeClass().newInstance();
				attr.setAttributeInfo(ai);
				
				// READ: the current attribute
				attr.deserializeIt(dis);
				
				dmo.set(ai.name, attr);
			}
			
			rc.add(dmo);
		}
		
		return(rc);
	}
	
	
}
