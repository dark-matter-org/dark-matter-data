package org.dmd.dmw;

import java.util.Iterator;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeString;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedObject;

/**
 * The DmwObjectFactory takes DmcUncheckedObject and creates DmwWrapperBase derived
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
	 * @param uco The unchecked object.
	 * @return A wrapper derivative with a set of (as yet) unchecked attributes.
	 * @throws ResultException 
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public DmwWrapperBase createWrapper(DmcUncheckedObject uco) throws ResultException, DmcValueException{
		DmwWrapperBase 		rc = null;
		DmcObject			dmo	= null;
		ClassDefinition		cd	= null;
		AttributeDefinition	ad	= null;
		
		if ((cd = schema.isClass((String)uco.classes.get(0))) == null){
        	ResultException ex = new ResultException();
            ex.result.addResult(Result.ERROR,"Unknown class: " + uco.classes.get(0));
            throw(ex);
		}
		
		rc = cd.newInstance();
		dmo = rc.getDmcObject();
		
		Iterator<String> names = uco.getAttributeNames();
		while(names.hasNext()){
			String n = names.next();
			ad = schema.adef(n);
			
			if (ad == null){
	        	ResultException ex = new ResultException();
	            ex.result.addResult(Result.ERROR,"Unknown attribute: " + n);
	            throw(ex);
			}
			
			Class tc = ad.getType().getTypeClass();
			
			if (ad.getIsMultiValued()){
				DmcTypeString values = (DmcTypeString) uco.get(n);
				Iterator<String> it = values.getMV();
				
				while(it.hasNext())
					try {
						dmo.add(ad.getName(), tc, it.next());
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (DmcValueException e) {
						throw(e);
					}
			}
			else{
				DmcTypeString values = (DmcTypeString) uco.get(n);
				
				try {
					dmo.set(ad.getName(), tc, values.getMVnth(0));
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DmcValueException e) {
					throw(e);
				}
			}
			
		}
		
		return(rc);
	}
}
