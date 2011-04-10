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
package org.dmd.dmc.types;

import java.io.Serializable;
import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;

/**
 * The DmcTypeNamedObjectREF is a base type from which all references to named objects
 * are derived. This stuff is a bit complicated and this class overrides most of the
 * basic functionality of the DmcAttribute to make this happen. This is because unlike 
 * basic attribute types, types derived from this one allow you to set the contents of
 * the attribute to be a String name, or a DmcObject that implements the DmcNamedObjectIF
 * interface. 
 * <P>
 * The values of this kind of attribute are derived from DmcNamedObjectREF which allows
 * you to store just the name of an object, or the name of the object and the object itself.
 * This provides the concept of resolved/unresolved object references. For instance, if you
 * parse a bunch of objects from a file and they contain object reference attributes, they
 * will appear as just the names of other objects. Later, you can attempt to resolve
 * these references (or not). Depending on the context in which you're using your data,
 * this mechanism gives you the option of lazily resolving (or perhaps retrieving) the
 * objects to which this type of attribute refers. 
 */
@SuppressWarnings({ "serial", "unchecked" })
abstract public class DmcTypeNamedObjectREF<HELPER extends DmcNamedObjectREF, NAMETYPE extends DmcObjectNameIF> extends DmcAttribute<HELPER> implements Serializable {
		
	/**
	 * Constructs a new object reference attribute. 
	 */
	public DmcTypeNamedObjectREF(){
	}
	
	public DmcTypeNamedObjectREF(DmcAttributeInfo ai){
		super(ai);
	}
		
	/**
	 * @return A new DmcNamedObjectREF derivative instance.
	 */
	abstract protected HELPER getNewHelper();
	
	abstract protected NAMETYPE getNewName();
	
	/**
	 * Checks if the object is an instance of the appropriate type.
	 * @param value The value to be tested.
	 * @return True if the object is the appropriate type.
	 */
	abstract protected boolean isDMO(Object value);
	
	abstract protected String getDMOClassName();
	
	/**
	 * Attempts to resolve references with the specified name resolver.
	 * @param rx The resolver.
	 * @throws DmcValueException  
	 */
	public void resolveReferences(DmcNameResolverIF rx) throws DmcValueException {
		if (attrInfo.valueType == ValueTypeEnum.SINGLE){
			HELPER ref = getSV();
			if (ref.getObject() == null){
				DmcNamedObjectIF obj = (DmcNamedObjectIF) rx.findNamedDMO(ref.getObjectName());
				if (obj == null)
					throw(new DmcValueException(getName(),"Could not resolve reference to: " + ref.getObjectName()));
					
				ref.setObject(obj);
			}
		}
		else{
			Iterator<HELPER> it = getMV();
			if (it != null){
				while(it.hasNext()){
					HELPER ref = it.next();
					if (ref.getObject() == null){
						DmcNamedObjectIF obj = (DmcNamedObjectIF) rx.findNamedDMO(ref.getObjectName());
						if (obj == null)
							throw(new DmcValueException(getName(),"Could not resolve reference to: " + ref.getObjectName()));
							
						ref.setObject(obj);
					}
				}
			}
		}
	}
	
	/**
	 * This method is called from derived classes if the lazy resolution mechanism has been
	 * turned on via the DmcOmni.
	 * <P>
	 * We try to find the object(s) referred to in the reference. If so, we set the object on the 
	 * reference (thus making it resolved). 
	 * <P>
	 * We also check to see if backref tracking has been turned on in DmcOmni. If so, we create
	 * the backref modifier and add it to the object we're referring to.
	 * <P>
	 * If the reference(s) can't be resolved we return a flag that indicates that the attribute
	 * should remove itself from the object (since there's nothing of value in it).
	 * @param referrer The object doing the referring.
	 * @param ref      The ref to be resolved.
	 * @return true if this attribute needs to be removed from the object.
	 */
	public boolean doLazyResolution(DmcObject referrer){
		boolean deleteUs = false;
		
		// If we're already resolved, don't bother trying again
		if (weAreResolved())
			return(deleteUs);
		
		if (attrInfo == null){
			if ( (attrInfo = DmcOmni.instance().getInfo(ID)) == null)
				throw (new IllegalStateException("Unable to get attribute info for ID: " + ID));
		}
		
		if (attrInfo.valueType == ValueTypeEnum.SINGLE){
			DmcNamedObjectREF ref = getSV();
			
			// We can't resolve the reference, so we need to be removed
			if (!resolveIt(referrer, ref))
				deleteUs = true;
		}
		else{
    		Iterator<DmcNamedObjectREF> it = (Iterator<DmcNamedObjectREF>) getMV();
    		while(it.hasNext()){
    			DmcNamedObjectREF ref = it.next();
    			if (!resolveIt(referrer, ref)){
    				// Delete the reference from our multi-valued container - we can do
    				// this safely because we're iterating over a copy of the collection
    				del(ref);
    			}
    		}
    		
    		// There's nothing left in the collection, so we need to be removed
    		if (getMVSize() == 0)
    			deleteUs = true;
		}
		
		return(deleteUs);
	}
	
	/**
	 * Determines of the reference can be resolved.
	 * @param referrer The object doing the referring.
	 * @param ref The object reference.
	 * @return true if the reference can be resolved.
	 */
	private boolean resolveIt(DmcObject referrer, DmcNamedObjectREF ref){
		boolean resolved = true;
		
		DmcObject obj = DmcOmni.instance().findNamedDMO(ref.getObjectName());
		
		// Couldn't find it - nuttin' we can do 'bout dat!
		if (obj == null){
			DmcOmni.instance().logDeadReference(referrer, this, ref.getObjectName());
			
			if (DmcOmni.instance().cleanUpDeadRefs())
				resolved = false;
		}
		else{
			// Set the object in the reference
			ref.setObject((DmcNamedObjectIF) obj);
			
			// And if backref tracking is on, inform the object that it's being tracked
			if (DmcOmni.instance().backRefTracking()){
				Modifier backrefMod = null;
				if (attrInfo.valueType == ValueTypeEnum.SINGLE)
					backrefMod = new Modifier(ModifyTypeEnum.SET,this,referrer);
				else
					backrefMod = new Modifier(ModifyTypeEnum.ADD,this,referrer);
				
				obj.addBackref(backrefMod);
			}
		}
		
		return(resolved);
	}
	
    protected boolean weAreResolved(){
    	boolean rc = false;
    	
    	if (attrInfo.valueType == ValueTypeEnum.SINGLE){
    		DmcNamedObjectREF ref = getSV();
    		if (ref.getObject() != null)
    			rc = true;
    	}
    	else{
    		Iterator<DmcNamedObjectREF> it = (Iterator<DmcNamedObjectREF>) getMV();
    		if (DmcOmni.instance().cleanUpDeadRefs()){
    			// IF we're cleaning up dead refs, we need only check the first
    			// element to see if we're resolved. That's because it's an all
    			// or nothing deal - we resolve everything in one shot and if something
    			// isn't resolved, it will have been tossed
    			DmcNamedObjectREF ref = it.next();
    	    	if (ref.getObject() != null)
    	    		rc = true;
    		}
    		else{
    			// Otherwise, we must cycle through all refs
    			rc = true;
    			while(it.hasNext()){
    				if (it.next().getObject() == null){
    					rc = false;
    					break;
    				}
    			}
    		}
    	}
    	
    	return(rc);
    }



}
