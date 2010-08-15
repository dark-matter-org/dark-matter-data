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
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmwBase class provides a common base for Dark Matter Wrapper classes
 * and provides basic functionality beyond what's defined for a DmcContainer.
 */
public class DmwWrapperBase extends DmcContainer {
	
    protected DmwWrapperBase(DmcObject obj) {
        super(obj);
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
	}

	public String toOIF(){
		return(core.toOIF());
	}
	
	public String toOIF(int padding){
		return(core.toOIF(padding));
	}
	
	/**
	 * This method is generally called by a DmwObjectFactory instance when it attempts
	 * to resolve object reference attributes.
	 * @param sm The schema manager that understands the schema of the object being resolved.
	 * @param rx An additional name resolver for non-schema related objects. This may be null.
	 * @throws ResultException 
	 */
	@SuppressWarnings("unchecked")
	public void resolveReferences(SchemaManager sm, DmcNameResolverIF rx) throws ResultException{
		Iterator<String> it = core.getAttributeNames();
		while(it.hasNext()){
			String name = it.next();
			AttributeDefinition ad = sm.adef(name);
			if (ad.getType().getIsRefType()){
				DmcAttribute attr = core.get(name);
				if (ad.getIsMultiValued()){
					
				}
				else{
					DmcNamedObjectREF obj = (DmcNamedObjectREF) attr.getSV();
					DmsDefinition resolved = (DmsDefinition) sm.findNamedObject(obj.getName());
					if (resolved == null){
						ResultException ex = new ResultException();
						ex.addError("Reference to object of type " + ad.getType().getName() + " can't be found: " + obj.getName());
						throw(ex);
					}
					
					obj.setObject((DmcNamedObjectIF) resolved.getDmcObject());
				}
			}
		}
	}
}
