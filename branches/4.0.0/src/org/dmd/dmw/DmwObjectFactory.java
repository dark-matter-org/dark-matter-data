//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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

import java.util.Iterator;

import org.dmd.core.DmcAttribute;
import org.dmd.core.DmcObject;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.core.util.NamedStringArray;
import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.extended.ClassDefinition;
import org.dmd.dms.server.SchemaManager;
import org.dmd.dms.shared.types.DotName;
import org.dmd.util.runtime.DebugInfo;


/**
 * The DmwObjectFactory takes an DMUncheckedObject and creates DmwWrapperBase derived
 * class based on schemas contained in the SchemaManager. 
 */
public class DmwObjectFactory {
	
	SchemaManager schema;
	
	public DmwObjectFactory(SchemaManager sm){
		schema = sm;
	}
	
	/**
	 * This function will attempt to instantiate the correct type of wrapper derivative
	 * for the unchecked object passed in. The only level of checking performed at this
	 * stage is validity of the class and attribute names and the validity of base types
	 * like Integer, Boolean etc. As to whether the attributes are valid for the object,
	 * or whether the attribute values are sane must be performed elsewhere.
	 * <P>
	 * Likewise, if there are object references, they will NOT BE RESOLVED! 
	 * <P>
	 * You must perform resolution of the references elsewhere, perhaps using the default
	 * name resolution mechanism of the DmwWrapperBase.
	 * @param uco The unchecked object.
	 * @return A wrapper derivative with a set of (as yet) unchecked attributes.
	 * @throws ResultException 
	 * @throws DmcValueException 
	 * @throws ClassNotFoundException  
	 * @throws DmcNameClashException 
	 */
	public DmwWrapper createWrapper(DMUncheckedObject uco) throws DMFeedbackSet, ClassNotFoundException {
		DmwWrapper 			rc = null;
		DmcObject			dmo	= null;
		ClassDefinition		cd	= null;
		AttributeDefinition	ad	= null;
		
		if ((cd = schema.getClassDefinition(uco.getConstructionClass())) == null){
			DebugInfo.debug("UncheckedObject:\n\n" + uco.toOIF());
        	DMFeedbackSet ex = new DMFeedbackSet("Unknown class: " + uco.getConstructionClass());
            throw(ex);
		}
		
		
		rc	= cd.newInstance();
		dmo = rc.getDmcObject();
						
		// And add any auxiliary classes if we have them
		for(int i=1; i<uco.getClasses().size(); i++){
			if ((cd = schema.getClassDefinition((String)uco.getClasses().get(i))) == null){
//				DebugInfo.debug("UncheckedObject AUX:\n\n" + uco.toOIF());
				throw(new DMFeedbackSet("Unknown auxiliary class: " + uco.getClasses().get(i)));
			}
			rc.addAux(cd);
		}
				
		Iterator<String> names = uco.getAttributeNames();
		while(names.hasNext()){
			String n = names.next();
			DmcAttributeInfo ai = dmo.getAttributeInfo(n);
			
			if (ai == null){
				throw(new DMFeedbackSet("Unknown attribute: " + n + " in object:\n\n" + uco.toOIF()));
			}
			
			DotName dn = new DotName(ai.qualifiedName, "AttributeDefinition");
			ad = schema.getAttributeDefinition(dn);
			
			if (ad == null){
				throw(new DMFeedbackSet("Couldn't find attribute definition for: " + n + " in object:\n\n" + uco.toOIF()));
			}
						
			NamedStringArray values = null;
			
			switch(ad.getValueType()){
			case SINGLE:
				values = uco.get(n);
				
				if (values.size() > 1){
					throw(new DMFeedbackSet("Multiple values for a single-valued attribute: " + n, uco.getFile(), uco.getLineNumber()));
				}
				
				try {
					// Try to get the attribute
					DmcAttribute<?> attr = dmo.get(ad.getName().getNameString());
					
					// If we can't find the attribute container, create it
					if (attr == null)
						attr = ad.getType().getAttributeHolder(ai);
					
					// Set the value
					attr.set(values.get(0));
					
					// Store the attribute
					dmo.set(ai, attr);
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}			
				break;
			case MULTI:
			case HASHMAPPED:
			case TREEMAPPED:
			case HASHSET:
			case TREESET:
				values = uco.get(n);
				
				for(String attrVal: values){
					try {
						// Try to get the attribute
						DmcAttribute<?> attr = dmo.get(ad.getName().getNameString());
						
						// If we can't find the attribute container, create it
						if (attr == null)
							attr = ad.getType().getAttributeHolder(ai);
												
						// Add the value to the container
						attr.add(attrVal);
					
						// Store the attribute
						dmo.add(ai, attr);
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}				
				break;
			}
			
		}
		
		return(rc);
	}
}
