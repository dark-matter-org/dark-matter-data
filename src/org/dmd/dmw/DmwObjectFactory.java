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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcObject;
//import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DotName;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmc.util.NamedStringArray;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dmw.DmwWrapper;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmwObjectFactory takes an DmcUncheckedObject and creates DmwWrapperBase derived
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
	public DmwWrapper createWrapper(DmcUncheckedObject uco) throws ResultException, DmcValueException, ClassNotFoundException, DmcNameClashException {
		DmwWrapper 			rc = null;
		DmcObject			dmo	= null;
		ClassDefinition		cd	= null;
		AttributeDefinition	ad	= null;
		
		if ((cd = schema.isClass((String)uco.classes.get(0))) == null){
			DebugInfo.debug("UncheckedObject:\n\n" + uco.toOIF());
        	ResultException ex = new ResultException();
            ex.result.addResult(Result.ERROR,"Unknown class: " + uco.classes.get(0));
            throw(ex);
		}
		
		
		rc	= cd.newInstance();
		dmo = rc.getDmcObject();
						
		// And add any auxiliary classes if we have them
		for(int i=1; i<uco.classes.size(); i++){
			if ((cd = schema.isClass((String)uco.classes.get(i))) == null){
				DebugInfo.debug("UncheckedObject AUX:\n\n" + uco.toOIF());
	        	ResultException ex = new ResultException();
	            ex.result.addResult(Result.ERROR,"Unknown class: " + uco.classes.get(i));
	            throw(ex);
			}
			rc.addAux(cd);
		}
				
		Iterator<String> names = uco.getAttributeNames();
		while(names.hasNext()){
			String n = names.next();
			DmcAttributeInfo ai = dmo.getAttributeInfo(n);
			
			if (ai == null){
	        	ResultException ex = new ResultException();
	            ex.result.addResult(Result.ERROR,"Unknown attribute: " + n + " in object:\n\n" + uco.toOIF());
	            throw(ex);
			}
			
			DotName dn = new DotName(ai.qualifiedName, "AttributeDefinition");
//			ad = schema.adef(ai.qualifiedName);
			ad = schema.adef(dn);
			
			if (ad == null){
	        	ResultException ex = new ResultException();
	            ex.result.addResult(Result.ERROR,"Unknown attribute: " + n);
	            throw(ex);
			}
			
//			// If the DMO doesn't directly support the attribute i.e. it's not in it
//			// attribute info map, the attribute must be associated with an auxiliary class.
//			// So, we have to get the DmcAttributeInfo from the attribute definition.
//			if (ai == null){
//				ai = DmcOmni.instance().getInfo(ad.getDmdID());
//				if (ai == null){
//		        	ResultException ex = new ResultException();
//		            ex.result.addResult(Result.ERROR,"Could not retrieve DmcAttributeInfo for: " + n);
//		            throw(ex);
//				}
//			}
			
			NamedStringArray values = null;
			
			switch(ad.getValueType()){
			case SINGLE:
				values = uco.get(n);
				
				if (values.size() > 1){
		        	ResultException ex = new ResultException();
		            ex.result.addResult(Result.ERROR,"Multiple values for a single-valued attribute: " + n);
		            throw(ex);
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
				} catch (DmcValueException e) {
					e.setAttributeName(ad.getName().getNameString());
					throw(e);
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
					} catch (DmcValueException e) {
						throw(e);
					}
				}				
				break;
			}
			
		}
		
		return(rc);
	}
}
