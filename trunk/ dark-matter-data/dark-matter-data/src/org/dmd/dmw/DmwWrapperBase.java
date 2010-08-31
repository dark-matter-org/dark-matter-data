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

import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcContainer;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmwBase class provides a common base for Dark Matter Wrapper classes
 * and provides basic functionality beyond what's defined for a DmcContainer.
 */
public abstract class DmwWrapperBase extends DmcContainer {
	
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
	
	////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("unchecked")
	protected abstract ArrayList getAuxDataHolder();

	////////////////////////////////////////////////////////////////////////////////
	
	public String toOIF(){
		return(core.toOIF());
	}
	
	public String toOIF(int padding){
		return(core.toOIF(padding));
	}
	
	/**
	 * This method can be called to resolve references only to objects defined as part of a schema..
	 * @param sm The schema manager that understands the schema of the object being resolved.
	 * @throws ResultException 
	 */
	public void resolveReferences(SchemaManager sm) throws ResultException{
		resolveReferences(sm, null);
	}
	
	/**
	 * This method is generally called by a DmwObjectFactory instance when it attempts
	 * to resolve object reference attributes.
	 * @param sm The schema manager that understands the schema of the object being resolved.
	 * @param rx An additional name resolver for non-schema related objects. This may be null.
	 * @throws ResultException 
	 */
	@SuppressWarnings("unchecked")
	public void resolveReferences(SchemaManager sm, DmcNameResolverIF rx) throws ResultException {
//		DebugInfo.debug(DebugInfo.getCurrentStack());
		
//		DebugInfo.debug("\n**\n" + this.toOIF(15));
		Iterator<String> it = core.getAttributeNames();
		while(it.hasNext()){
			String name = it.next();
//			DebugInfo.debug("checking: " + name);
			AttributeDefinition ad = sm.adef(name);
			if (ad.getType().getIsRefType()){
				
//				DebugInfo.debug("    resolving: " + ad.getType().getName());
				
				DmcAttribute attr = core.get(name);
				
				if (ad.getIsMultiValued()){
					ArrayList auxData = (ArrayList) attr.getAuxData();
					
					if (auxData == null){
						auxData = getAuxDataHolder();
						attr.setAuxData(auxData);
					}
					
					for(int i=0; i<attr.getMVSize(); i++){
						DmcNamedObjectREF obj = (DmcNamedObjectREF) attr.getMVnth(i);
//						DebugInfo.debug("    " + obj.getObjectName());
						
						if (obj.isResolved()){
//							DebugInfo.debug("    already resolved");
						}
						else{
							DmcNamedObjectIF res = resolve(sm,rx,ad,obj);
							auxData.add(res);
						}
					}
				}
				else{
					DmcNamedObjectREF obj = (DmcNamedObjectREF) attr.getSV();
//					DebugInfo.debug("    " + obj.getObjectName());
					
					if (obj.isResolved()){
//						DebugInfo.debug("    already resolved");
					}
					else{
						resolve(sm,rx,ad,obj);
					}
				}
			}
		}
		
//		DebugInfo.debug("**\n\n");
	}
	
	/**
	 * Attempt to resolve the specified object reference by checking it against the schema and,
	 * if not found in the schema, in the alternate name resolver if it's available.
	 * @param sm The schema manager.
	 * @param rx The alternate name resolver.
	 * @param ad The attribute through which the object is accessed.
	 * @param obj The object reference.
	 * @throws ResultException
	 */
	@SuppressWarnings("unchecked")
	DmcNamedObjectIF resolve(SchemaManager sm, DmcNameResolverIF rx, AttributeDefinition ad, DmcNamedObjectREF obj) throws ResultException{
		DmcNamedObjectIF resolved = (DmcNamedObjectIF) sm.findNamedObject(obj.getObjectName());
//		DmcNamedObjectREF resolved = (DmcNamedObjectREF) sm.findNamedObject(obj.getObjectName());
		
//		DebugInfo.debug("                  " + obj.getObjectName());
//		if (ad.getName().equals("isNamedBy")){
//			DebugInfo.debug("    Trying to resolve: " + obj.getObjectName());
//		}
			
		if (resolved == null){
//			DebugInfo.debug("******** NULL");
			// Couldn't find it in the schema, try the alternate resolver if we have it
			if (rx != null)
				resolved = (DmcNamedObjectREF) rx.findNamedObject(obj.getObjectName());
		}
		if (resolved == null){
//			DebugInfo.debug("******** NULL");
			ResultException ex = new ResultException();
			ex.addError("Reference to object of type " + ad.getType().getObjectName() + " can't be found: " + obj.getObjectName());
			throw(ex);
		}
		
		if (resolved instanceof DmwWrapperBase){
//			DebugInfo.debug("WRAPPER");

			obj.setObject((DmcNamedObjectIF) ((DmwWrapperBase)resolved).getDmcObject());
		}
		else{
//			DebugInfo.debug("DMO");

			obj.setObject(resolved);
		}
		
		return(resolved);
	}
}
