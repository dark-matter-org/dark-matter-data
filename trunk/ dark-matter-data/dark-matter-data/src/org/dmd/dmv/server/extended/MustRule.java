package org.dmd.dmv.server.extended;


import java.util.Iterator;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dmv.server.generated.dmw.MustRuleDMW;

/**
 * The MustRule verifies that an object has all of its mandatory attributes.
 */
public class MustRule extends MustRuleDMW {

	@Override
	public void applyRule(SchemaManager schema, DmcObject obj) throws DmcValueExceptionSet {
		String constructionClass = obj.getConstructionClassName();
		DmcValueExceptionSet ex	= null;
		
		if (constructionClass == null){
			ex = new DmcValueExceptionSet();
			ex.add(new DmcValueException("Object has no construction class defined."));
			throw(ex);
		}
		
		ClassDefinition cd = schema.cdef(constructionClass);
		
		if (cd == null){
			ex = new DmcValueExceptionSet();
			ex.add(new DmcValueException("Unknown object class: " + constructionClass));
			throw(ex);
		}
		
		while(true){
			Iterator<AttributeDefinition> must = cd.getMust();
			if (must != null){
				while(must.hasNext()){
					AttributeDefinition ad = must.next();
					
					if (obj.get(ad.getName()) == null){
						if (ex == null)
							ex = new DmcValueExceptionSet();
						
						ex.add(new DmcValueException(ad.getName(),"Missing mandatory attribute for class " + cd.getName()));
					}
				}
			}
			
			// Continue up the derivation hierarchy and stop when we get to the top
			cd = cd.getDerivedFrom();
			if (cd == null)
				break;
		}
	}

	@Override
	public void applyRule(SchemaManager schema, DmcObject obj, DmcTypeModifier modifier) throws DmcValueExceptionSet {
		// TODO Auto-generated method stub
		
	}

}
