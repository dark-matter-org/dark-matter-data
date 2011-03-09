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
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmwBase class provides a common base for Dark Matter Wrapper classes
 * and provides basic functionality beyond what's defined for a DmcContainer.
 */
public abstract class DmwWrapperBase extends DmcContainer {
	
	// The actual class definitions - construction class followed by auxiliary classes
	protected ArrayList<ClassDefinition>	objectClass;
	
    protected DmwWrapperBase(DmcObject obj) {
        super(obj);
        objectClass = new ArrayList<ClassDefinition>();
    }

    protected DmwWrapperBase(DmcObject obj, ClassDefinition cd) {
        super(obj);
        objectClass = new ArrayList<ClassDefinition>();
        objectClass.add(cd);
    }
    
//    /**
//     * Adds the specified auxiliary class to the object.
//     * @param cd The auxiliary class definition.
//     * @throws DmcValueException  
//     */
//    public void addAux(ClassDefinition cd) throws DmcValueException {
//    	if (!objectClass.contains(cd)){
//    		objectClass.add(cd);
//    		
//    		core.addAux(cd.getName());
//    	}
//    }
//    
//    /**
//     * Removes the specified auxiliary class from the object.
//     * @param cd The auxiliary class definition.
//     */
//    public void removeAux(ClassDefinition cd){
//    	objectClass.remove(cd);
//    	core.removeAux(cd.getName());
//    }
//    
//    /**
//     * Determines if the specified class is in our objectClass list.
//     * @param cd The class definition.
//     * @return true if the definition is there.
//     */
//    public boolean hasAux(ClassDefinition cd){
//    	return(objectClass.contains(cd));
//    }

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
	
	/**
	 * @return The construction class definition for this object.
	 */
	public ClassDefinition getConstructionClass(){
		if (objectClass.size() > 0)
			return(objectClass.get(0));
		return(null);
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
	 * @throws DmcValueExceptionSet 
	 */
	public void resolveReferences(SchemaManager sm) throws DmcValueExceptionSet{
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
	public void resolveReferences(SchemaManager sm, DmcNameResolverIF rx) throws DmcValueExceptionSet {
		DmcValueExceptionSet	errors = null;
		
//		DebugInfo.debug(DebugInfo.getCurrentStack());
		
//DebugInfo.debug("\n**\n" + this.toOIF(15));
		Iterator<String> it = core.getAttributeNames().iterator();
		while(it.hasNext()){
			String name = it.next();
//DebugInfo.debug("checking: " + name);
//
//if (name .equals("namingAttribute")){
//	DebugInfo.debug("Here");
//}
			// We're filtering out the DmcObject ocl attribute - this will likely evaporate at some point
//			if (name.equals(DmcObject.__objectClass.name))
//				continue;
			
			AttributeDefinition ad = sm.adef(name);
			
			if (ad == null){
				errors = new DmcValueExceptionSet();
				errors.add(new DmcValueException(name, "Unknown attribute."));
				throw(errors);
			}
			if (ad.getType().getIsRefType()){
				
//				DebugInfo.debug("    resolving: " + ad.getType().getName());
				
//				DmcAttribute attr = core.get(name);
				DmcAttribute attr = core.get(ad.getDmdID());
				
				DmcNamedObjectREF obj = null;
				
				switch(ad.getValueType()){
				case SINGLE:
					obj = (DmcNamedObjectREF) attr.getSV();
//					DebugInfo.debug("    " + obj.getObjectName());
					
					if (obj.isResolved()){
//						DebugInfo.debug("    already resolved");
					}
					else{
						DmcNamedObjectIF res;
						try {
							res = resolve(sm,rx,ad,obj);
							attr.setAuxData(res);
						} catch (DmcValueException e) {
							if (errors == null)
								errors = new DmcValueExceptionSet();
							errors.add(e);
						}
					}
					break;
				case MULTI:
					ArrayList auxData = (ArrayList) attr.getAuxData();
					
					if (auxData == null){
//						DebugInfo.debug("    Creating the auxData holder");
						auxData = getAuxDataHolder();
						attr.setAuxData(auxData);
					}
					
					for(int i=0; i<attr.getMVSize(); i++){
						obj = (DmcNamedObjectREF) attr.getMVnth(i);
//						DebugInfo.debug("    " + obj.getObjectName());
						
						if (obj.isResolved()){
//							DebugInfo.debug("    already resolved");
						}
						else{
							DmcNamedObjectIF res;
							try {
								res = resolve(sm,rx,ad,obj);
								auxData.add(res);
							} catch (DmcValueException e) {
								if (errors == null)
									errors = new DmcValueExceptionSet();
								errors.add(e);
							}
							
						}
					}
					break;
				case HASHMAPPED:
					break;
				case SORTMAPPED:
					break;
				}

				
//				if (ad.getIsMultiValued()){
//					ArrayList auxData = (ArrayList) attr.getAuxData();
//					
//					if (auxData == null){
//						auxData = getAuxDataHolder();
//						attr.setAuxData(auxData);
//					}
//					
//					for(int i=0; i<attr.getMVSize(); i++){
//						DmcNamedObjectREF obj = (DmcNamedObjectREF) attr.getMVnth(i);
////						DebugInfo.debug("    " + obj.getObjectName());
//						
//						if (obj.isResolved()){
////							DebugInfo.debug("    already resolved");
//						}
//						else{
//							DmcNamedObjectIF res;
//							try {
//								res = resolve(sm,rx,ad,obj);
//								auxData.add(res);
//							} catch (DmcValueException e) {
//								if (errors == null)
//									errors = new DmcValueExceptionSet();
//								errors.add(e);
//							}
//							
//						}
//					}
//				}
//				else{
//					DmcNamedObjectREF obj = (DmcNamedObjectREF) attr.getSV();
////					DebugInfo.debug("    " + obj.getObjectName());
//					
//					if (obj.isResolved()){
////						DebugInfo.debug("    already resolved");
//					}
//					else{
//						DmcNamedObjectIF res;
//						try {
//							res = resolve(sm,rx,ad,obj);
//							attr.setAuxData(res);
//						} catch (DmcValueException e) {
//							if (errors == null)
//								errors = new DmcValueExceptionSet();
//							errors.add(e);
//						}
//					}
//				}
			}
		}
		
		if (errors != null)
			throw(errors);
		
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
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	DmcNamedObjectIF resolve(SchemaManager sm, DmcNameResolverIF rx, AttributeDefinition ad, DmcNamedObjectREF obj) throws DmcValueException{
		DmcNamedObjectIF resolved = (DmcNamedObjectIF) sm.findNamedObject(obj.getObjectName());
//		DmcNamedObjectREF resolved = (DmcNamedObjectREF) sm.findNamedObject(obj.getObjectName());
		
//		DebugInfo.debug("                  " + obj.getObjectName());
		if (ad.getName().equals("isNamedBy")){
//			DebugInfo.debug("    Trying to resolve: " + obj.getObjectName());
		}
			
		if (resolved == null){
//			DebugInfo.debug("******** NULL Couldn't find it in the schema - trying alternate resolver");
			// Couldn't find it in the schema, try the alternate resolver if we have it
			if (rx != null)
				resolved = (DmcNamedObjectIF) rx.findNamedObject(obj.getObjectName());
		}
		if (resolved == null){
//			DebugInfo.debug("******** NULL");
//			ResultException ex = new ResultException();
//			ex.addError("Reference to object of type " + ad.getType().getObjectName() + " can't be found: " + obj.getObjectName());
//			throw(ex);
			
			DmcValueException	dve = new DmcValueException(ad.getName().getNameString(), "Reference to object of type " + ad.getType().getObjectName() + " can't be found: " + obj.getObjectName());
			throw(dve);
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
