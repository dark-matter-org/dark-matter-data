package org.dmd.dmv.server.extended;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.DmcTypeString;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dmv.server.generated.dmw.MayRuleDMW;

public class MayRule extends MayRuleDMW {

	@SuppressWarnings("unchecked")
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
		
		// An extensible class allows any attribute
		if (cd.getClassType() == ClassTypeEnum.EXTENSIBLE)
			return;
		
		DmcTypeString ocl = (DmcTypeString) obj.get(DmcObject._ocl);
		if (ocl == null){
			System.out.println("NO OCL");
		}
		
		for(DmcAttribute attr : obj.getAttributes().values()){
			if (attr.getName().equals("objectClass") || attr.getName().equals("ocl"))
				continue;
			
			for(int i=0; i<ocl.getMVSize(); i++){
				cd = schema.cdef(ocl.getMVnth(i));
				if (cd == null){
					if (ex == null)
						ex = new DmcValueExceptionSet();
					
					ex.add(new DmcValueException("Unknown class or auxiliary class: " + ocl.getMVnth(i)));
					throw(ex);
				}
				if (cd.hasAttribute(attr.getName()) == null){
					if (ex == null)
						ex = new DmcValueExceptionSet();
					
					ex.add(new DmcValueException("Attribute: " + attr.getName() + " is not a valid member of class(es): " + ocl.getString()));
				}
				else{
					// Stop hunting as soon as we find it
					break;
				}
			}
			
		}
		
		if (ex != null)
			throw(ex);
	}

	@Override
	public void applyRule(SchemaManager schema, DmcObject obj,
			DmcTypeModifier modifier) throws DmcValueExceptionSet {
		// TODO Auto-generated method stub
		
	}

}
