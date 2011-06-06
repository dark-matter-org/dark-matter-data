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
import org.dmd.dmc.DmcContainer;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
import org.dmd.dms.generated.dmo.DmwWrapperDMO;
import org.dmd.dms.generated.dmw.ClassDefinitionIterableDMW;
import org.dmd.dms.generated.types.ClassDefinitionREF;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFMV;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmwWrapper class provides a common base for Dark Matter Wrapper classes
 * in a Full Jave Environment and provides basic functionality beyond what's 
 * defined for a DmcContainer.
 */
public abstract class DmwWrapper extends DmcContainer {
	
	protected DmwWrapper(){
		
	}
	
    protected DmwWrapper(DmcObject obj) {
        super(obj);
    }

    protected DmwWrapper(DmcObject obj, ClassDefinition cd) {
        super(obj);
		if (cd != null){
			// Now that the objectClass is stored in the DmcObject as a DmcTypeClassDefinitionREF, we
			// just "resolve" the reference to point to this ClassDefinition
			DmwWrapperDMO dmo = (DmwWrapperDMO) obj;
			Iterator<ClassDefinitionREF> ocl = dmo.getObjectClass();
			if (ocl != null){
				ClassDefinitionREF cdr = ocl.next();
				if (cdr != null){
					cdr.setObject((ClassDefinitionDMO) cd.getDmcObject());
				}
			}
		}        
    }
    
    public boolean applyModifier(DmcTypeModifierMV mods) throws DmcValueExceptionSet, DmcValueException{
    	return(getDmcObject().applyModifier(mods));
    }
    
    /**
     * Serializes our underlying DMO.
     * @param dos the output stream.
     * @throws Exception
     * @throws DmcValueException
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception, DmcValueException {
    	getDmcObject().serializeIt(dos);
    }
    
    public String getConstructionClassName(){
    	if (getDmcObject() == null)
    		return(null);
    	return(getDmcObject().getConstructionClassName());
    }
    
    @SuppressWarnings("unchecked")
	public ClassDefinitionIterableDMW getObjectClass(){
        DmcAttribute attr = (DmcTypeClassDefinitionREFMV) core.get(DmwWrapperDMO.__objectClass);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

	////////////////////////////////////////////////////////////////////////////////
	// DmcContainerIF implementation
	
	@Override
	public DmcObject getDmcObject() {
		return core;
	}

	@Override
	public void setDmcObject(DmcObject obj) {
		core = obj;
		obj.setContainer(this);
	}
	
	/**
	 * @return The construction class definition for this object.
	 */
	public ClassDefinition getConstructionClass(){
		ClassDefinitionREF cdr = core.getConstructionClass();
		if (cdr == null)
			return(null);
		if (cdr.getObject() == null)
			return(null);
		return (ClassDefinition) (cdr.getObject().getContainer());
	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	public String toOIF(){
		return(core.toOIF());
	}
	
	public String toOIF(int padding){
		return(core.toOIF(padding));
	}
	
	public String toString(){
		return(core.toOIF());
	}
	
	/**
	 * This method can be called to resolve references only to objects defined as part of a schema..
	 * @param sm The schema manager that understands the schema of the object being resolved.
	 * @throws ResultException 
	 * @throws DmcValueExceptionSet 
	 */
	public void resolveReferences(DmcNameResolverIF resolver) throws DmcValueExceptionSet {
		getDmcObject().resolveReferences(resolver);
	}
		
	/**
	 * Attempt to resolve the specified object reference by checking it against the schema and,
	 * if not found in the schema, in the alternate name resolver if it's available.
	 * @param sm The schema manager.
	 * @param rx The alternate name resolver.
	 * @param ad The attribute through which the object is accessed.
	 * @param obj The object reference.
	 * @throws ResultException
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	DmcNamedObjectIF resolve(SchemaManager sm, DmcNameResolverIF rx, AttributeDefinition ad, DmcNamedObjectREF obj) throws DmcValueException{
		DmcNamedObjectIF resolved = (DmcNamedObjectIF) sm.findNamedObject(obj.getObjectName());
			
		if (resolved == null){
			// Couldn't find it in the schema, try the alternate resolver if we have it
			if (rx != null)
				resolved = (DmcNamedObjectIF) rx.findNamedObject(obj.getObjectName());
		}
		if (resolved == null){
			DmcValueException	dve = new DmcValueException("Reference to object of type " + ad.getType().getObjectName() + " via attribute: " + ad.getName().getNameString() + " can't be found: " + obj.getObjectName());
			throw(dve);
		}
		
		if (resolved instanceof DmwWrapper){
			obj.setObject((DmcNamedObjectIF) ((DmwWrapper)resolved).getDmcObject());
		}
		else{
			obj.setObject(resolved);
		}
		
		return(resolved);
	}
}
