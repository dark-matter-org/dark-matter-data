package org.dmd.dmw;

import java.io.IOException;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dms.ClassDefinition;
import org.dmd.dmw.DmwWrapper;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREF;
import org.dmd.util.exceptions.ResultException;

public class DmwDeserializer {

	SchemaManager	schema;

	public DmwDeserializer(SchemaManager s){
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
	public DmwWrapper deserialize(DmcInputStreamIF dis) throws Exception {
		DmwWrapper rc = null;
		DmcObject dmo = null;
		
		// READ: The first part of any object is its objectClass attribute; read its
		//       id and instantiate an objectClass attribute to deserialize the class
		//       and AUX classes.
		DmcTypeClassDefinitionREF	oc   = (DmcTypeClassDefinitionREF) dis.getAttributeInstance();
		oc.deserializeIt(dis);
		oc.resolveReferences(schema);
		
		ClassDefinition cd = (ClassDefinition) oc.getMVnth(0).getObject().getContainer();
		
		// Instantiate the object
		rc = cd.newInstance();
		dmo = rc.getDmcObject();
		
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
		
		return(rc);
	}	

}
