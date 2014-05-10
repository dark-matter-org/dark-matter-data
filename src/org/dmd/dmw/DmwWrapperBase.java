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

import org.dmd.core.DmcContainer;
import org.dmd.core.DmcNamedObjectREF;
import org.dmd.core.DmcObject;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcNameResolverIF;
import org.dmd.core.interfaces.DmcNamedObjectIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.extended.ClassDefinition;
import org.dmd.dms.server.extended.SchemaManager;
import org.dmd.dms.server.generated.dmw.ClassDefinitionIterableDMW;
import org.dmd.dms.shared.generated.types.ClassDefinitionREF;
import org.dmd.dms.shared.generated.types.DmcTypeClassDefinitionREFMV;
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;


/**
 * The DmwWrapperBase class provides a common base for Dark Matter Wrapper classes
 * and provides basic functionality beyond what's defined for a DmcContainer.
 */
public abstract class DmwWrapperBase extends DmcContainer {
	
	
    protected DmwWrapperBase(DmcObject obj) {
        super(obj);
    }

    protected DmwWrapperBase(DmcObject obj, ClassDefinition cd) {
        super(obj);
    }
    
    public boolean applyModifier(DmcTypeModifierMV mods) throws DMFeedbackSet {
    	return(getDmcObject().applyModifier(mods));
    }
    
    /**
     * Serializes our underlying DMO.
     * @param dos the output stream.
     * @throws Exception
     * @throws DmcValueException
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception, DMFeedbackSet {
    	getDmcObject().serializeIt(dos);
    }
    
    public String getConstructionClassName(){
    	if (getDmcObject() == null)
    		return(null);
    	return(getDmcObject().getConstructionClassName());
    }
    
	public ClassDefinitionIterableDMW getObjectClass(){
    	DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) core.get(DmcObject.__objectClass);
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
	 * This method calls resolveReferences() on the underlying DMO.
	 * @param resolver an entity that can resolve schema related references and references to other objects.
	 * @throws DMFeedbackSet 
	 */
	public void resolveReferences(DmcNameResolverIF resolver) throws DMFeedbackSet {
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	DmcNamedObjectIF resolve(SchemaManager sm, DmcNameResolverIF rx, AttributeDefinition ad, DmcNamedObjectREF obj) throws DMFeedbackSet{
		DmcNamedObjectIF resolved = (DmcNamedObjectIF) sm.findNamedObject(obj.getObjectName());
			
		if (resolved == null){
			// Couldn't find it in the schema, try the alternate resolver if we have it
			if (rx != null)
				resolved = (DmcNamedObjectIF) rx.findNamedObject(obj.getObjectName());
		}
		if (resolved == null){
			throw(new DMFeedbackSet("Reference to object of type " + ad.getType().getObjectName() + " via attribute: " + ad.getName().getNameString() + " can't be found: " + obj.getObjectName()));
		}
		
		if (resolved instanceof DmwWrapperBase){
			obj.setObject((DmcNamedObjectIF) ((DmwWrapperBase)resolved).getDmcObject());
		}
		else{
			obj.setObject(resolved);
		}
		
		return(resolved);
	}
}
