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
package org.dmd.dmc;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.Modifier;
import org.dmd.dmc.types.StringName;
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.ClassDefinitionREF;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFMV;
import org.dmd.dms.generated.types.DmcTypeModifierMV;

/**
 * The Dark Matter Core (DMC) Object is the basic entity on which all aspects of the 
 * Dark Matter Data framework are based. 
 * <P>
 * The DMC object is basically a typed holder for a collection of attributes. At this
 * level, the DMC is abstract; it is the derived, auto-generated, Dark Matter Objects (DMOs)
 * that give a DMC identity. Storing the attributes as a collection introduces a small
 * amount of overhead to DMOs, but allows for operational concepts such as serialization,
 * modification, formatting, cloning etc. that are all provided automatically. It also allows
 * for the use of DMOs in environments where accessing values by name (for example 
 * in GWT-based applications) is a necessity.
 * <p>
 * In addition to the attribute collection, the only constant overhead for a DMC object
 * is the info Vector. The info Vector will contain various information at various times
 * during the life cycle of an object, but will only take up additional space as required.
 * Again, there is some overhead, but the benefits of that overhead are very useful.
 * <p>
 * There are currently 6 additional pieces of information stored for a DMC object:
 * <ul>
 * <li>
 * CONTAINER[0] - if the DMO is wrapped by a DMW generated class, this holds the
 * reference to the DMW. This supports the automatic casting of a DMO to its DMW wrapper
 * type via the use of auto generated Iterable classes.
 * </li>
 * <li>
 * BACKREFS[1] - in order to behave nicely with Java garbage collection, the named
 * object reference mechanisms of Dark Matter will maintain knowledge of which resolved
 * reference attributes are pointing at a particular DMO instance. If the DMO is deleted,
 * it can automatically remove the reference to itself in the reference attributes. This is
 * a work around for the fact that the GWT JRE Emulation mechanisms don't support the
 * java.lang.ref.WeakReference mechanisms. Back reference tracking must be enabled
 * via the DmcOmni.instance.backRefTracking() method.
 * </li>
 * <li>
 * MODIFIER[2] - the Modifier is used to record changes that are made to an object so that 
 * the modifications can be distributed via the Dark Matter Protocol Event (DMPEvent) and
 * then applied to remote objects. This mechanism supports very succinct notification of
 * changes to objects and only includes the object deltas, not the entire object. The MODIFIER
 * and the LASTVAL (described next) will only exist on the object if it has been modified.
 * </li>
 * <li>
 * LASTVAL[3] - the LASTVAL is just a handle to the last value that was added to or deleted
 * from a multi-valued attribute. It is required to support the Modifier concept.
 * </li>
 * <li>
 * MODREC[4] - the MODREC flag is just a Boolean to indicate that the object is a 
 * temporary construct that will be used as a MODification RECorder to populate a 
 * DmcTypeModifier with a set of changes to be applied to an object in a cache or a 
 * remote object. This value is set when a DMO/DMW is constructed with a DmcTypeModifierMV.
 * This distinction is required to prevent applying backrefs to an object when an object
 * referring to it is in MODREC mode. If we didn't keep track of this, we would wind up
 * tracking references twice.
 * </li>
 * <li>
 * AGGREGATOR[5] - the AGGREGATOR provides a mechanism to aggregate a set of different
 * modifications into a single modification, usually for the purpose of generating a single
 * event based on a complex series of modifications against an object. Such operations
 * can be required when a series of changes are made to an object in a single thread
 * of execution e.g. complex algorithms that have to iterate over a set of objects and
 * make multiple changes to each object. In order to reduce the number of events, the
 * set of operations can be aggregated and sent as a single event. The operational sequence
 * for this would look like: <br>
 * obj->startModificationAggregation()<br>
 * obj->setModifier()<br>
 * [object changes]<br>
 * obj->applyCurrentModifer()<br>
 * object->setModifier()<br>
 * [object changes]<br>
 * object->applyCurrentModifier()<br>
 * obj->stopModificationAggregation()<br>
 * <p/>
 * The stopModificationAggregation() will return a single {@link DmcTypeModifierMV} that
 * contains all of the changes that have been made.
 * </li>
 * </ul>
 */
@SuppressWarnings("serial")
abstract public class DmcObject implements Serializable {
	
	// The indices of data stored in our dynamic info vector
	static final int	CONTAINER 		= 0;
	static final int	BACKREFS		= 1;
	static final int	MODIFIER		= 2;
	static final int	LASTVAL			= 3;
	static final int	MODREC			= 4;
	static final int	AGGREGATOR		= 5;
	
	// The associated sizes of the info vector when storing various information. 
	// All of this information is static to cut down on needless operations.
	static final int	CONTAINER_SIZE 	= 1;
	static final int	BACKREFS_SIZE	= 2;
	static final int	MODIFIER_SIZE	= 3;
	static final int	LASTVAL_SIZE	= 4;
	static final int	MODREC_SIZE		= 5;
	static final int	AGGREGATOR_SIZE	= 6;
	
	// The objectClass attribute is common to all objects and indicates the construction class
	// and any auxiliary classes associated with the object
    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("objectClass",1,"ClassDefinitionREF",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
	
	// At this level, all we have is a simple collection of attributes.
	protected Map<Integer, DmcAttribute<?>>	attributes;
	
	// The info map is used to reduce the memory footprint of the DmcObject by compacting
	// various additional information that may be required into a single value. This comes
	// with a slight processing overhead, but that's seen to be reasonable when you're
	// trying to store lots of DMOs in memory.
	// 
	transient Vector<Object>				info;
	
	public DmcObject(){
		attributes 	= new HashMap<Integer, DmcAttribute<?>>();
		info		= null;
	}
	
	/**
	 * A protected constructor for derived classes that lets us set the object class
	 * attribute from the most specific derived class.
	 * @param oc The class name.
	 */
	protected DmcObject(String oc){
		attributes 	= new HashMap<Integer, DmcAttribute<?>>();
		info		= null;
		
		// All objects have a well known construction class which is the first
		// entry in their objectClass attribute.
        DmcAttribute<?> attr = new DmcTypeClassDefinitionREFMV(__objectClass);
        try {
            attr.add(new StringName(oc));
			add(__objectClass,attr);
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Setting the objectClass using a String shouldn't ever croak!", e));
		}
	}
	
	/**
	 * @return the number of attributes excluding the objectClass.
	 */
	public int numberOfAttributes(){
		return(attributes.size() - 1);
	}
	
	/**
	 * @return The class definition reference for this object. Realize that this may just contain the
	 * name of the class, not the reference to the ClassDefinition itself; it all depends on the 
	 * operational context.
	 */
	public Iterator<ClassDefinitionREF> getObjectClass(){
		DmcTypeClassDefinitionREFMV objClass = (DmcTypeClassDefinitionREFMV) attributes.get(__objectClass.id);
		if (objClass == null)
			throw(new IllegalStateException("A DMO shouldn't exist without its objClass attribute!"));
		return(objClass.getMV());
	}
	
	/**
	 * @return The class definition reference for this object. Realize that this may just contain the
	 * name of the class, not the reference to the ClassDefinition itself; it all depends on the 
	 * operational context.
	 */
	public ClassDefinitionREF getConstructionClass(){
		DmcTypeClassDefinitionREFMV objClass = (DmcTypeClassDefinitionREFMV) attributes.get(__objectClass.id);
		if (objClass == null)
			throw(new IllegalStateException("A DMO shouldn't exist without its objClass attribute!"));
		return(objClass.getMVnth(0));
	}
	
	/**
	 * @return The class info associated with this object.
	 */
	public DmcClassInfo getConstructionClassInfo(){
		return(getConstructionClass().getClassInfo());
	}
	
	/**
	 * If a class of object doesn't support back reference tracking, it will overload this
	 * method to return false. Otherwise, back reference tracking can be turned on for all 
	 * objects. This distinction is important for things like Dark Matter Protocol messages
	 * where we would want to ensure that object references could be resolved, but we wouldn't
	 * want to update back references in those objects to which the messages referred.
	 * @return
	 */
	public boolean supportsBackrefTracking(){
		return(true);
	}
	
	/**
	 * We cycle through the DmcClassInfo associated with our object class and any auxiliary classes
	 * and determine if the attribute is allowable.
	 * @param ai The attribute info for the attribute in question.
	 * @return true is the attribute is allowed and false otherwise.
	 */
	public boolean allowsAttribute(DmcAttributeInfo ai){
		boolean rc = false;
		
		if (ai.id == __objectClass.id)
			return(true);
		
		DmcTypeClassDefinitionREFMV objClass = (DmcTypeClassDefinitionREFMV) attributes.get(__objectClass.id);
		for(int i=0; i<objClass.getMVSize(); i++){
			if (objClass.getMVnth(i).getClassInfo().allowsAttribute(ai)){
				rc = true;
				break;
			}
		}
		
		return(rc);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Abstracts that are overridden in DMOs

	/**
	 * Auto-generated derived classes override this to return an empty instance 
	 * of themselves. This supports cloning.
	 * @return An instance of the derived class.
	 */
	abstract public DmcObject getNew();
	
	/**
	 * Auto-generated derived classes override this to return an instance of themselves 
	 * with just the specified slice of attributes. In the case of named objects, the 
	 * object name is always part of the slice.
	 * @return An instance of the derived class with the specified slice of attributes.
	 */
	abstract public DmcObject getSlice(DmcSliceInfo info);
	
	public void validate() throws DmcValueExceptionSet {
		Iterator<DmcObjectValidator> ovds = getObjectValidators().values().iterator();
		while(ovds.hasNext()){
			DmcObjectValidator ov = ovds.next();
			ov.validate(this);
		}
	}
	
	protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
		throw(new IllegalStateException("getAttributeValidators() must be overriden in the DMO"));
	}
	
	protected Map<String,DmcObjectValidator> getObjectValidators(){
		throw(new IllegalStateException("getObjectValidators() must be overriden in the DMO"));
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Utility mechanisms to manage the info Vector
	
	/**
	 * Sets the container that's currently wrapping this object.
	 * @param c the container.
	 */
	public void setContainer(DmcContainerIF c){
		setInfo(CONTAINER,CONTAINER_SIZE,c);
	}
	
	/**
	 * @return The container that's currently wrapping this object or null if there isn't one.
	 */
	public DmcContainerIF getContainer(){
		return (DmcContainerIF) (getInfo(CONTAINER,CONTAINER_SIZE));
	}
	
	/**
	 * This method is used when we're tracking backrefs. The modifier will contain the
	 * OPPOSITE of the SET/ADD operation that's creating a reference to THIS object.
	 * @param mod
	 */
	public void addBackref(Modifier mod){
		synchronized (attributes){		
			if (getBackref() == null){
				setInfo(BACKREFS,BACKREFS_SIZE,new DmcTypeModifierMV());
			}
			try {
				getBackref().add(mod);
			} catch (DmcValueException e) {
				throw(new IllegalStateException("Backref modifier shouldn't throw exceptions.",e));
			}
		}
	}
	
	/**
	 * @return true if this object has any other objects referring to it. This mechanism is
	 * only valid if you've turned on back reference tracking via DmcOmni.
	 */
	public boolean isReferenced(){
		synchronized (attributes){		
			if (getBackref() == null)
				return(false);
			if (getBackref().getMVSize() > 0)
				return(true);
			return(false);
		}
	}
	
	/**
	 * @return the number of references to this object.  This mechanism is
	 * only valid if you've turned on back reference tracking via DmcOmni.
	 */
	public int referenceCount(){
		synchronized (attributes){		
			if (getBackref() == null)
				return(0);
			
			return(getBackref().getMVSize());
		}
	}
	
	/**
	 * This method is used to remove back references from an object to the objects
	 * that refer to it. Back reference tracking is controlled via the DmcOmni. You
	 * shouldn't be calling this directly - if you do, all bets are off!
	 * @param mod The modifier representing the removal operation for the back reference.
	 */
	public void removeBackref(Modifier mod){
		synchronized (attributes){		
			if (getBackref() == null)
				throw(new IllegalStateException("Tried to remove backreference from an object with no backrefs."));
			getBackref().del(mod);
		}
	}
	
	protected DmcTypeModifierMV getBackref(){
		return (DmcTypeModifierMV) (getInfo(BACKREFS, BACKREFS_SIZE));
	}
	
	/**
	 * This method sets the modifier of the object which will track all changes made
	 * to the object. Set the modifier to null to stop change tracking.
	 * @param m
	 */
	@SuppressWarnings("unchecked")
	public void setModifier(DmcTypeModifierMV m){
		if (m == null)
			shrinkInfo(MODIFIER);
		else{
			setInfo(MODIFIER,MODIFIER_SIZE,m);
			ArrayList<DmcTypeModifierMV>	agg = (ArrayList<DmcTypeModifierMV>) getInfo(AGGREGATOR,AGGREGATOR_SIZE);
			if (agg != null){
				agg.add(m);
			}
		}
	}
	
	/**
	 * Returns the current set of modifications (if any were made).
	 * @return
	 */
	public DmcTypeModifierMV getModifier(){
		return (DmcTypeModifierMV) getInfo(MODIFIER, MODIFIER_SIZE);
	}
	
	/**
	 * This method is called in the add()/del() methods on DMOs to store the last value that was
	 * added/deleted from a multi-valued attribute.
	 * @param val
	 */
	protected void  setLastValue(Object val){
		// If we don't have a modifier and backref tracking IS NOT turned on, don't bother
		// storing the last value.
		if ( (getModifier() == null) && (!DmcOmni.instance().backRefTracking()) )
			return;
			
		setInfo(LASTVAL,LASTVAL_SIZE,val);
	}

	/**
	 * This method is used within DmcObject when adding modify operations for add()/del().
	 * @return The last value added or deleted.
	 */
	protected Object getLastValue(){
		return(getInfo(LASTVAL,LASTVAL_SIZE));
	}
	
	/**
	 * When a DMO is constructed with A DmcTypeModifier, this flag is set to true.
	 * @param f
	 */
	protected void modrec(Boolean f){
		setInfo(MODREC,MODREC_SIZE,f);
	}
	
	protected Boolean isModrec(){
		Boolean mr = (Boolean) getInfo(MODREC,MODREC_SIZE);
		if (mr == null)
			return(false);
		return(mr);
	}
	
	/**
	 * This method will begin aggregating a series of changes made to the object. Each time you
	 * call setModifier() the DmcTypeModifierMV will be stored. When you are finished with the
	 * set of modifications, call stopModificationAggregation() and you will receive the entire
	 * set of modifications in a single DmcTypeModifierMV instance.
	 * <p/>
	 * NOTE: this mechanism is meant for use on objects that ARE NOT modification recorders i.e.
	 * objects that were created via the getModificationRecorder() method. It is only meant to be
	 * used when manually setting the modifier.
	 */
	@SuppressWarnings("unchecked")
	public void startModificationAggregation(){
		if (isModrec())
			throw(new IllegalStateException("This method should only be used when manually setting the modifier on an object."));
		ArrayList<DmcTypeModifierMV>	agg = (ArrayList<DmcTypeModifierMV>) getInfo(AGGREGATOR,AGGREGATOR_SIZE);
		if (agg == null){
			agg = new ArrayList<DmcTypeModifierMV>();
			setInfo(AGGREGATOR, AGGREGATOR_SIZE, agg);
		}
	}
	
	/**
	 * This is a convenience method that applies the current set of modifications to this object.
	 * You should have previously used setModifier() to set a modifier on the object.
	 * @return true if any changes were made and false otherwise.
	 * @throws DmcValueExceptionSet
	 * @throws DmcValueException
	 */
	public boolean applyCurrentModification() throws DmcValueExceptionSet, DmcValueException {
		if (getModifier() == null)
			throw(new IllegalStateException("There is no modifier to apply!"));
		
		// Pull out the modifier and hang on to it. We then wipe the modifier so that
		// we can actually apply it to the object. If we don't do this, the object thinks
		// it's in modrec mode and won't actually apply the changes.
		DmcTypeModifierMV mods = getModifier();
		setLastValue(null);
		setModifier(null);
		
		boolean rc = applyModifier(mods);
		return(rc);
	}
	
	/**
	 * @return The entire set of modifications that have been applied since startModificationAggregation()
	 * was called.
	 */
	@SuppressWarnings("unchecked")
	public DmcTypeModifierMV stopModificationAggregation(){
		DmcTypeModifierMV rc = new DmcTypeModifierMV();
		
		ArrayList<DmcTypeModifierMV>	agg = (ArrayList<DmcTypeModifierMV>) getInfo(AGGREGATOR,AGGREGATOR_SIZE);
		
		if (agg != null){
			for(DmcTypeModifierMV mv: agg){
				for(int i=0; i<mv.getMVSize(); i++){
					try {
						rc.add(mv.getMVnth(i));
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Adding a Modifier to DmcTypeModifierMV shouldn't thrown an exception", e));
					}
				}
			}
		}
		
		shrinkInfo(AGGREGATOR);

		return(rc);
	}
	
	/**
	 * This method manages the info vector and grows it to the appropriate size to manage
	 * the additional information required.
	 * @param index        The index of the information we're storing.
	 * @param requiredSize The required size of the info vector when storing this information.
	 * @param value        The value to be stored.
	 */
	void setInfo(int index, int requiredSize, Object value){
//		DebugInfo.debug("SET INFO " + ((DmcNamedObjectIF)this).getObjectName() + " " + index + " " + System.identityHashCode(this));
		if (info == null){
			// When we first create the info vector, we'll set it to size 1 and
			// then add the number of required spots - so, if we're storing a
			// LASTVAL, we wind up adding 4 empty spots. 
			info = new Vector<Object>(1,1);
			
//			DebugInfo.debug("NEW INFO " + ((DmcNamedObjectIF)this).getObjectName() + " " + index + " " + System.identityHashCode(this));
			
			switch(index){
			case AGGREGATOR:
				info.add(null);
			case MODREC:
				info.add(null);
			case LASTVAL:
				info.add(null);
			case MODIFIER:
				info.add(null);
			case BACKREFS:
				info.add(null);
			case CONTAINER:
				info.add(null);
			}
		}
		if (info.size() < requiredSize){
			// If info is less than the required size, grow it
			while(info.size() < requiredSize)
				info.add(null);
		}
		info.set(index, value);
	}
	
	/**
	 * This method will return the info at the specified index if it's available.
	 * @param index
	 * @param requiredSize
	 * @return
	 */
	Object getInfo(int index, int requiredSize){
//		DebugInfo.debug("GET INFO " + ((DmcNamedObjectIF)this).getObjectName() + " " + index + " " + System.identityHashCode(this));
		
		if (info == null){
//			DebugInfo.debug("GET INFO [0] " + ((DmcNamedObjectIF)this).getObjectName() + " " + index + " " + System.identityHashCode(this));
			return(null);
		}
//		DebugInfo.debug("GET INFO [" + info.size() + "] " + ((DmcNamedObjectIF)this).getObjectName() + " " + index + " " + System.identityHashCode(this));
		if (info.size() < requiredSize)
			return(null);
		return(info.get(index));
	}
	
	/**
	 * The intention is to keep the size of the info vector as small as possible in order
	 * to reduce overhead at the object level. This method is called in instances where
	 * info data is no longer required i.e. when the modifier is removed from the object
	 * and when there are no longer any backrefs.
	 * @param index
	 */
	void shrinkInfo(int index){
		Vector<Object> newinfo = null;
		if (index == MODIFIER){
			if (info.get(AGGREGATOR) != null){
				info.set(MODIFIER, null);
				return;
			}
			
			if (info.get(BACKREFS) == null){
				if (info.get(CONTAINER) != null){
					// We just have the container, shrink to 1
					newinfo = new Vector<Object>(1,1);
					newinfo.add(info.get(CONTAINER));
				}
				// If the container was null, we'll wind up nulling the info vector
			}
			else{
				// We have backrefs, so shrink to 2
				newinfo = new Vector<Object>(2,1);
				newinfo.add(info.get(CONTAINER));
				newinfo.add(info.get(BACKREFS));
			}
		}
		else if (index == BACKREFS){
			if (info.size() > BACKREFS_SIZE){
				// For some reason, we have mods and lastvalue, so just leave things
				// When the modifier is cleaned up, we'll also get rid of the backref space
				info.set(BACKREFS, null);
			}
			else{
				if (info.get(CONTAINER) != null){
					// Shrink to 1
					newinfo = new Vector<Object>(1,1);
					newinfo.add(info.get(CONTAINER));
				}
				// If the container was null, we'll wind up nulling the info vector
			}
		}
		else if (index == AGGREGATOR){
			// Aggregators are never used with object's that were created as modification recorders,
			// so we can always shrink by at least 2 spaces.
			int finalSize = LASTVAL_SIZE;
			if (getLastValue() == null){
				finalSize = MODIFIER_SIZE;
				if (getModifier() == null){
					finalSize = BACKREFS_SIZE;
					if (getBackref() == null){
						finalSize = CONTAINER_SIZE;
						if (getContainer() == null)
							finalSize = 0;
					}
				}
			}
			
			if (finalSize == 0){
				newinfo = null;
			}
			else{
				newinfo = new Vector<Object>(finalSize, 1);
				for(int i=0; i<finalSize; i++)
					newinfo.add(info.get(i));
			}
		}
		info = newinfo;
		newinfo = null;
	}
	

	////////////////////////////////////////////////////////////////////////////////
	// Back reference tracking

	/**
	 * This method should be called by whatever mechanism you're using to manage a collection
	 * of DMOs. It will automatically removed references to this object that are contained in
	 * object reference attributes if you have set DmcOmni.backRefTracking(true). 
	 */
	public void youAreDeleted(){
		if (DmcOmni.instance().backRefTracking()){
			DmcTypeModifierMV mods = getBackref();
			if (mods != null)
				DmcOmni.instance().removeReferences(mods);
			
			// And in the other direction - we see if we have any references to other
			// object and remove the backrefs
			for(DmcAttribute<?> attr : attributes.values()){
				if (attr.ID == __objectClass.id)
					continue;
					
				if (attr instanceof DmcTypeNamedObjectREF<?, ?>){
					((DmcTypeNamedObjectREF<?, ?>)attr).removeBackReferences();
				}
			}
			
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Attribute information
	
	/**
	 * This method is generally used by object parsers to determine whether or not an attribute
	 * is natively supported by a DMO (in which case it returns the attribute info) or whether
	 * the attribute in question is associated with an auxiliary class (in which case we get
	 * the appropriate attribute info from the AttributeDefinition).
	 * @param an The attribute id.
	 * @return The attribute info or null.
	 */
	public DmcAttributeInfo getAttributeInfo(String an){
//		DmcAttributeInfo rc = getStringToAttrInfo().get(an);
		DmcAttributeInfo rc = DmcOmni.instance().getAttributeInfo(an);
		
		if (rc == null){
			if (an.equals(__objectClass.name))
				rc = __objectClass;
		}
		
		return(rc);
	}
	
	/**
	 * This method is generally used by object parsers to determine whether or not an attribute
	 * is allowed by any of the classes in our objectClass attribute.
	 * @param an The attribute id.
	 * @return The attribute info or null.
	 */
	public DmcAttributeInfo getAttributeInfo(Integer id){
		DmcAttributeInfo rc = null;
//		
//		if (getIdTo AttrInfo() != null)
//			return(getIdToAttrInfo().get(id));
//		
//		return(rc);
//		
				
		if (id == __objectClass.id)
			return(__objectClass);
		
		DmcTypeClassDefinitionREFMV objClass = (DmcTypeClassDefinitionREFMV) attributes.get(__objectClass.id);
		for(int i=0; i<objClass.getMVSize(); i++){
			rc = objClass.getMVnth(i).getClassInfo().allowsAttribute(id);
			if (rc != null)
				break;
		}
		
		return(rc);

	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Object class access/manipulation
	
	/**
	 * @return The class name of this object.
	 */
	public String getConstructionClassName(){
		DmcTypeClassDefinitionREFMV ocl = (DmcTypeClassDefinitionREFMV) get(__objectClass.id);
		
		if (ocl != null){
			if (ocl.getMVSize() > 0){
				return(ocl.getMVnth(0).getObjectName().getNameString());
			}
		}
		
		return(null);
	}
	
    /**
     * Adds the specified auxiliary class name to the object.
     * @param cd The auxiliary class name.
     * @throws DmcValueException  
     */
    public void addAux(String cd) throws DmcValueException {
    	DmcTypeClassDefinitionREFMV ocl = (DmcTypeClassDefinitionREFMV) get(__objectClass.id);

		if (ocl != null)
			ocl.add(cd);
    }
    
    /**
     * Adds the specified auxiliary class name to the object.
     * @param cd The auxiliary class name.
     * @throws DmcValueException  
     */
    public void addAux(ClassDefinitionREF cd) throws DmcValueException {
    	DmcTypeClassDefinitionREFMV ocl = (DmcTypeClassDefinitionREFMV) get(__objectClass.id);

		if (ocl != null)
			ocl.add(cd);
    }
    
    /**
     * Removes the specified auxiliary class name from the object.
     * @param cd The auxiliary class name.
     */
    public void removeAux(String cd){
    	DmcTypeClassDefinitionREFMV ocl = (DmcTypeClassDefinitionREFMV) get(__objectClass.id);

		if (ocl != null)
			ocl.del(cd);
    }

    /**
     * Determines if the specified class is in our ocl.
     * @param cd The auxiliary class name.
     */
    public boolean hasAux(String cd){
    	DmcTypeClassDefinitionREFMV ocl = (DmcTypeClassDefinitionREFMV) get(__objectClass.id);

		if (ocl == null)
			return(false);
		
		return(ocl.contains(cd));
    }

	////////////////////////////////////////////////////////////////////////////////
	// Attribute access
	
	/**
	 * Returns the holder of value for the named attribute. Use this with caution!
	 * This is generally used only by derived wrapper classes of DmcObject.
	 * @param name The name of the attribute.
	 * @return DmcAttribute
	 */
	public DmcAttribute<?> get(String name){
		DmcAttributeInfo ai = getAttributeInfo(name);
		if (ai == null)
			return(null);
		return (attributes.get(ai.id));
	}
	
	/**
	 * Returns the holder of the value for the named attribute. Use this with caution!
	 * This is generally used only by derived wrapper classes of DmcObject.
	 * @param _name The name of the attribute.
	 * @return DmcAttribute
	 */
	public DmcAttribute<?> get(Integer id){
		return (attributes.get(id));
	}
	
	/**
	 * Returns the holder of the value for the named attribute. Use this with caution!
	 * This is generally used only by derived wrapper classes of DmcObject.
	 * @param _name The name of the attribute.
	 * @return DmcAttribute
	 */
	public DmcAttribute<?> get(DmcAttributeInfo ai){
		DmcAttribute<?> rc = attributes.get(ai.id);
		
		// If you ask for the attribute using its attribute info and we find it, we check to
		// see if it's set on the attribute. If not, we set it. This may seem weird, but it's 
		// because the link to the DmcAttributeInfo is lost when DMOs are transported over
		// GWT's serialization mechanisms. However, when we use generated DMOs to access the 
		// the attributes, THEY have the attribute info, and so we just set it back on the 
		// attribute.
		
		if ( (rc != null) && (rc.getAttributeInfo() == null))
			rc.setAttributeInfo(ai);
		
		return (rc);
	}
	
	/**
	 * Retrieves the names of attributes in this object. If you only want the single
	 * valued attributes.
	 * @param onlySV  if true, will only return single valued attribute names.
	 * @return The set of attribute names.
	 */
	public ArrayList<String> getAttributeNames(boolean onlySV){
		ArrayList<String>	names = new ArrayList<String>();
		for(DmcAttribute<?> attr: attributes.values()){
			if (onlySV){
				if (attr.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
					names.add(attr.getName());
				}
			}
			else
				names.add(attr.getName());
		}
		return(names);
	}
	
	/**
	 * @return The attributes that comprise this object. USE THIS WITH CAUTION!
	 */
	public Map<Integer,DmcAttribute<?>> getAttributes(){
		return(attributes);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Attribute modification
	
	/**
	 * This method sets the value of a single-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param attrName  The attribute name.
	 * @param attr      The attribute to be stored.
	 * @throws DmcValueException 
	 */
	public <T extends DmcAttribute<?>> T set(String attrName, DmcAttribute<?> attr) throws DmcValueException {
		DmcAttributeInfo ai = getAttributeInfo(attrName);
		
		if (ai == null){
			DmcValueException dve = new DmcValueException("Invalid attribute: " + attrName + " for class: " + this.getClass().getName());
			throw(dve);
		}
		
		return(set(ai,attr));
	}
	
	/**
	 * This method sets the value of a single-valued attribute.
	 * @param attrName  The attribute info.
	 * @param attr      The attribute to be stored.
	 * @param previous  The previous value of the attribute, used in back reference tracking.
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute<?>> T set(DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {		
		synchronized (attributes) {
			DmcAttribute<?> existing = attributes.get(ai.id);
			
			if (existing == null){
				attributes.put(ai.id, attr);
				attr.setAttributeInfo(ai);
			}
			
			// BIG NOTE: performing modification of an object and performing backref tracking
			// are MUTUALLY EXCLUSIVE behaviours. We don't want to track backrefs when we have
			// a modifier on an object because we would wind up tracking the references twice,
			// once while creating the modifier and again when the modifier is applied.
			if (getModifier() == null){
				if (supportsBackrefTracking()){
					if (DmcOmni.instance().backRefTracking() && DmcOmni.instance().trackThisAttribute(attr.ID)){
						if (attr instanceof DmcTypeNamedObjectREF){
							// We're modifying a reference attribute, so track that puppy
							DmcObject obj = ((DmcObject)((DmcNamedObjectREF<?>)attr.getSV()).getObject());
							if (obj != null){
								Modifier backrefMod = new Modifier(ModifyTypeEnum.SET,attr,this);
								obj.addBackref(backrefMod);
								
								// Let the reference know the backref modifier - this allows us to 
								// easily remove the backref if the reference is deleted
								((DmcNamedObjectREF<?>)attr.getSV()).setBackrefModifier(backrefMod);
							}
						}
					}
				}
			}
			else{
				getModifier().add(new Modifier(ModifyTypeEnum.SET, attr));
			}
			
//		if ( (getContainer() != null) && (getContainer().getListenerManager() == null) ){
//			// TODO implement attribute change listener hooks
//		}
			
			return (T) (attr);
		}
	}
	
	/**
	 * This method adds a value to a multi-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param attrName  The attribute name.
	 * @param attr      The attribute value to be stored.
	 * @throws DmcValueException 
	 */
	public <T extends DmcAttribute<?>> T add(String attrName, DmcAttribute<?> attr) throws DmcValueException {
		DmcAttributeInfo ai = getAttributeInfo(attrName);
		
		if (ai == null){
			DmcValueException dve = new DmcValueException("Invalid attribute: " + attrName + " for class: " + this.getClass().getName());
			throw(dve);
		}
		
		return(add(ai,attr));
	}
	
	/**
	 * This method adds a value to a multi-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param ai   The attribute info.
	 * @param attr The attribute value to be stored.
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute<?>> T add(DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {
		synchronized (attributes) {
			DmcAttribute<?> existing = (DmcAttribute<?>) attributes.get(ai.id);
			
			if (existing == null){
				attributes.put(ai.id, attr);
				attr.setAttributeInfo(ai);
			}
			
			// BIG NOTE: performing modification of an object and performing backref tracking
			// are MUTUALLY EXCLUSIVE behaviours. We don't want to track backrefs when we have
			// a modifier on an object because we would wind up tracking the references twice,
			// once while creating the modifier and again when the modifier is applied.
			if (getModifier() == null){
				if (supportsBackrefTracking()){
					// TODO: need to have the upper bound of the IDs for the meta schema available
					// so that we can check whether we want to track the back references.
//					if (DmcOmni.instance().backRefTracking() && (attr.ID > 200)){
					if (DmcOmni.instance().backRefTracking() && DmcOmni.instance().trackThisAttribute(attr.ID)){
						if ( (attr instanceof DmcTypeNamedObjectREF) && (getLastValue() != null)){
							DmcObject obj = ((DmcObject)((DmcNamedObjectREF<?>)getLastValue()).getObject());
							if (obj != null){
								// We're modifying a reference attribute, so track that puppy
								DmcAttribute<?> mod = attr.getNew();
								mod.setAttributeInfo(ai);
								mod.add(getLastValue());
								
								Modifier backrefMod = new Modifier(ModifyTypeEnum.ADD,mod,this);
								((DmcObject)((DmcNamedObjectREF<?>)getLastValue()).getObject()).addBackref(backrefMod);
								
								// Let the reference know the backref modifier - this allows us to 
								// easily remove the backref if the reference is deleted
								((DmcNamedObjectREF<?>)getLastValue()).setBackrefModifier(backrefMod);
							}
						}
					}
				}
			}
			else{
				if (getLastValue() == null){
					// Last value can be null in the case of SET attributes since we don't 
					// actually add a value to the SET if it already exists. However, in other
					// cases, this is a code error - so pitch a fit!
					if ( (ai.valueType != ValueTypeEnum.HASHMAPPED) && (ai.valueType != ValueTypeEnum.TREEMAPPED)){
						// This is okay
					}
					else if ( (ai.valueType != ValueTypeEnum.HASHSET) && (ai.valueType != ValueTypeEnum.TREESET)){
						throw(new IllegalStateException("Last value shouldn't be null."));
					}
				}
				else{
					// Get an attribute value holder of the same type and hang on to the last
					// value that was added to it
					DmcAttribute<?> mod = attr.getNew();
					mod.setAttributeInfo(ai);
					
					mod.add(getLastValue());
					getModifier().add(new Modifier(ModifyTypeEnum.ADD, mod));
				}
			}
			
			
//		if ( (getContainer() != null) && (getContainer().getListenerManager() == null) ){
//			// TODO implement attribute change listener hooks
//		}
	
			return (T) (attr);
		}
	}
	
	/**
	 * This method deletes a value from a multi-valued attribute.
	 * @param <T>      	The class 
	 * @param attrname  The attribute name.
	 * @param value     The value to be stored.
	 * @throws DmcValueException 
	 * @throws DmcValueException 
	 */
	public <T extends DmcAttribute<?>> T del(String attrName, Object value){
		DmcAttributeInfo ai = getAttributeInfo(attrName);
		
		if (ai == null)
			return(null);
		
		return(del(ai,value));
	}
	
	/**
	 * This method is called in generated DMOs to handle the case where we're
	 * using an empty DMO to create a modifier. When we perform del(), we have 
	 * no attribute, so the DMO del() method constructs the DmcAttribute on our
	 * behalf. 
	 * @param mod The appropriately typed attribute holder.
	 * @param value The value to be deleted.
	 */
	protected void delFromEmptyAttribute(DmcAttribute<?> mod, Object value){
		try {
			mod.add(value);
			getModifier().add(new Modifier(ModifyTypeEnum.DEL, mod));		
		} catch (DmcValueException e) {
			if ( (mod.getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED) ||
			     (mod.getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED) ){
				throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception. This is a MAPPED attribute and typeCheck () should accept just the key value as well as the mapped type itself.", e));
			}
			
			throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
		}
	}
	
	/**
	 * This method deletes a value from a multi-valued attribute.
	 * @param <T>      	The class 
	 * @param attrname  The attribute name.
	 * @param value     The value to be stored.
	 * @throws DmcValueException 
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute<?>> T del(DmcAttributeInfo ai, Object value){
		synchronized (attributes) {
			DmcAttribute<?> attr = (DmcAttribute<?>) attributes.get(ai.id);
			DmcNamedObjectREF<?> ref = null;
			
			if (getModifier() != null){
				try {
					DmcAttribute<?> mod = attr.getNew();
					mod.setAttributeInfo(ai);
					
					mod.add(value);
					getModifier().add(new Modifier(ModifyTypeEnum.DEL, mod));
				} catch (DmcValueException e) {
					throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
				}
			}
			
			Object rc = null;
			if ( (value instanceof DmcNamedObjectREF) && !(value instanceof DmcExtendedReferenceIF)){
				DmcNamedObjectREF<?> key = (DmcNamedObjectREF<?>)value;
				if (key.getObject() == null)
					rc = attr.del(key.getObjectName());
				else
					rc = attr.del(key.getObject());
				
			}
			else{
				if ( (attr.attrInfo.valueType == ValueTypeEnum.HASHSET) || (attr.attrInfo.valueType == ValueTypeEnum.TREESET))
					rc = attr.del(value);
				else if (value instanceof DmcExtendedReferenceIF)
					rc = attr.del(value);
				else if (value instanceof DmcMappedAttributeIF)
					rc = attr.del(((DmcMappedAttributeIF)value).getKey());
				else if (value instanceof DmcNamedObjectIF)
					rc = attr.del(((DmcNamedObjectIF)value).getObjectName());
				else
					rc = attr.del(value);
			}
			
			if (rc instanceof DmcNamedObjectREF)
				ref = (DmcNamedObjectREF<?>) rc;
			
			// BIG NOTE: performing modification of an object and performing backref tracking
			// are MUTUALLY EXCLUSIVE behaviours. We don't want to track backrefs when we have
			// a modifier on an object because we would wind up tracking the references twice,
			// once while creating the modifier and again when the modifier is applied.
			if ((ref != null) && (getModifier() == null)){
//System.out.println("Resolved ref " + ref.getObjectName().getNameString() + " hash = " + System.identityHashCode(ref));
				if (supportsBackrefTracking()){
					// TODO: need to have the upper bound of the IDs for the meta schema available
					// so that we can check whether we want to track the back references.
//					if (DmcOmni.instance().backRefTracking() && (attr.ID > 200)){
					if (DmcOmni.instance().backRefTracking() && DmcOmni.instance().trackThisAttribute(attr.ID)){
						if (ref.getObject() != null){
							if (ref.getBackrefModifier() != null)
								((DmcObject)ref.getObject()).removeBackref(ref.getBackrefModifier());
						}
					}
				}
			}
			
			
//			if (getContainer() == null){
//				attr.del(value);
//			}
//			else{
////			if (getContainer().getListenerManager() == null)
//				attr.del(value);
////			else{
////				// TODO implement attribute change listener hooks
////			}
//			}
			
			// If we have no further elements in the multi-value attribute, remove it
			if (attr.getMVSize() == 0)
				rem(ai);
	
			return (T) (attr);
		}
	}
		
	/**
	 * Removes the specified attribute from the object.
	 * @param an The attribute name.
	 * @throws DmcValueException 
	 */
	public <T extends DmcAttribute<?>> T rem(String attrName){
		DmcAttributeInfo ai = getAttributeInfo(attrName);
		
		if (ai == null)
			return(null);
		
		return(rem(ai));
	}
	
	/**
	 * Removes the specified attribute from the object.
	 * @param an The attribute name.
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute<?>> T rem(DmcAttributeInfo ai){
		synchronized (attributes) {
			T attr = (T) attributes.remove(ai.id);
			
			if (getModifier() != null){
				try {
					getModifier().add(new Modifier(ModifyTypeEnum.REM, ai));
				} catch (DmcValueException e) {
					throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
				}
			}
			
			// BIG NOTE: performing modification of an object and performing backref tracking
			// are MUTUALLY EXCLUSIVE behaviours. We don't want to track backrefs when we have
			// a modifier on an object because we would wind up tracking the references twice,
			// once while creating the modifier and again when the modifier is applied.
			if ((getModifier() == null) && (attr != null)){
				if (supportsBackrefTracking()){
					if (attr instanceof DmcTypeNamedObjectREF){
						((DmcTypeNamedObjectREF<?,?>)attr).removeBackReferences();
//						// TODO: need to have the upper bound of the IDs for the meta schema available
//						// so that we can check whether we want to track the back references.
//						if (DmcOmni.instance().backRefTracking() && (attr.ID > 200)){
//							if (attr.attrInfo.valueType == ValueTypeEnum.SINGLE){
//								DmcNamedObjectREF ref = (DmcNamedObjectREF) attr.getSV();
//								if (ref.getObject() != null){
//									if (ref.getBackrefModifier() != null)
//										((DmcObject)ref.getObject()).removeBackref(ref.getBackrefModifier());
//								}
//							}
//							else{
//								for(int i=0; i< attr.getMVSize(); i++){
//									DmcNamedObjectREF ref = (DmcNamedObjectREF) attr.getMVnth(i);
//									if ((ref != null) && (ref.getObject() != null)){
//										if (ref.getBackrefModifier() != null)
//											((DmcObject)ref.getObject()).removeBackref(ref.getBackrefModifier());
//									}
//								}
//							}
//						}
					}
				}
			}
			

			
//		if ( (getContainer() != null) && (getContainer().getListenerManager() != null)){
//			// TODO implement attribute change listener hooks
//		}
			
			return(attr);
		}
	}
	
	// Commented this out for now - shouldn't be used because of the complexity of having
	// to know the previous value for purposes of reference tracking.
//	/**
//	 * This method adds a value to a multi-valued attribute. If you had previously set the
//	 * same attribute to a different type, you get a class cast exception.
//	 * @param attrName  The attribute name.
//	 * @param attr      The attribute value to be stored.
//	 * @throws DmcValueException 
//	 */
//	@SuppressWarnings("unchecked")
//	public <T extends DmcAttribute> T nth(String attrName, int index, DmcAttribute attr) throws DmcValueException {
//		DmcAttributeInfo ai = getAttributeInfo(attrName);
//		
//		if (ai == null){
//			DmcValueException dve = new DmcValueException("Invalid attribute: " + attrName + " for class: " + this.getClass().getName());
//			throw(dve);
//		}
//		
//		return(nth(ai,index,attr,null));
//	}
	
	/**
	 * This method is called in generated DMOs to handle the case where we're
	 * using an empty DMO to create a modifier. When we perform setNth(#,null),
	 * we have no attribute, so we create a specialized modifier. 
	 * @param mod The appropriately typed attribute holder.
	 * @param value The value to be deleted.
	 */
	protected void nthNullFromEmptyAttribute(DmcAttributeInfo ai, int idx){
		try {
			getModifier().add(new Modifier(ModifyTypeEnum.NTH, ai, idx));		
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
		}
	}
	
	/**
	 * This method adds a value to a multi-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param ai   The attribute info.
	 * @param attr The attribute value to be stored.
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	protected <T extends DmcAttribute<?>> T nth(DmcAttributeInfo ai, int index, DmcAttribute<?> attr, Object previous) throws DmcValueException {
		synchronized (attributes) {
			DmcAttribute<?> existing = (DmcAttribute<?>) attributes.get(ai.id);
			
			if (existing == null){
				attributes.put(ai.id, attr);
				attr.setAttributeInfo(ai);
			}
			
			// BIG NOTE: performing modification of an object and performing backref tracking
			// are MUTUALLY EXCLUSIVE behaviours. We don't want to track backrefs when we have
			// a modifier on an object because we would wind up tracking the references twice,
			// once while creating the modifier and again when the modifier is applied.
			if (getModifier() == null){
				if (supportsBackrefTracking()){
					// TODO: need to have the upper bound of the IDs for the meta schema available
					// so that we can check whether we want to track the back references.
//					if (DmcOmni.instance().backRefTracking() && (attr.ID > 200)){
					if (DmcOmni.instance().backRefTracking() && DmcOmni.instance().trackThisAttribute(attr.ID)){
						if ( (attr instanceof DmcTypeNamedObjectREF) && (getLastValue() != null)){
							DmcObject obj = ((DmcObject)((DmcNamedObjectREF<?>)getLastValue()).getObject());
							if (obj != null){
								// We're modifying a reference attribute, so track that puppy
								DmcAttribute<?> mod = attr.getNew();
								mod.setAttributeInfo(ai);
								mod.add(getLastValue());
								
								Modifier backrefMod = new Modifier(ModifyTypeEnum.NTH,mod,this,index);
								((DmcObject)((DmcNamedObjectREF<?>)getLastValue()).getObject()).addBackref(backrefMod);
								
								((DmcNamedObjectREF<?>)getLastValue()).setBackrefModifier(backrefMod);
							}
						}
						if (attr instanceof DmcTypeNamedObjectREF){
							// And now some tricky stuff. Due to the fact that the nth() mechanisms can
							// result in a previous value being removed and replaced in one operation,
							// we have to take this into account when tracking back references. Any
							// previous value for this index is passed in to us from the generated
							// nth() method so that we can clean up the back reference if required.
							if (previous != null){
								DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>) previous;
								if (ref.getObject() != null){
									if (ref.getBackrefModifier() != null)
										((DmcObject)ref.getObject()).removeBackref(ref.getBackrefModifier());
								}
							}
						}
					}
				}
			}
			else{
				if (getLastValue() == null){
					// Last value can be null in the case of indexed multi-valued attributes since this
					// is how we remove an indexed value.
					if ( (ai.indexSize == 0) || (ai.valueType != ValueTypeEnum.MULTI))
						throw(new IllegalStateException("Code gen error! The nth() interface is not applicable to attribute: " + ai.name + " of valueType: " + ai.valueType));
					getModifier().add(new Modifier(ModifyTypeEnum.NTH, ai, index));
				}
				else{
					// Get an attribute value holder of the same type and hang on to the last
					// value that was added to it
					DmcAttribute<?> mod = attr.getNew();
					mod.setAttributeInfo(ai);
					
					mod.setMVnth(index, getLastValue());
					getModifier().add(new Modifier(ModifyTypeEnum.NTH, mod, index));
				}
			}
			
			
			// If there are no longer values stored in the attribute, remove it
			if (!attr.hasValue())
				rem(ai);
			
//		if ( (getContainer() != null) && (getContainer().getListenerManager() == null) ){
//			// TODO implement attribute change listener hooks
//		}
			
			return (T) (attr);
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Object formatting
	
	/**
	 * Returns the object in its native Object Instance Format.
	 */
	public String toString(){
		return(toOIF(15));
	}
	
	/**
	 * Returns the references to this object formatted as a String. This will only
	 * return a value if you've turned on backref tracking via the DmcOmni.
	 */
	public String getBackRefs(){
		synchronized(attributes){		
			DmcTypeModifierMV mods = getBackref();
			if (mods == null)
				return("No backrefs to " + ((DmcNamedObjectIF)this).getObjectName());
			else{
				StringBuffer sb = new StringBuffer();
				sb.append("References to: " + ((DmcNamedObjectIF)this).getObjectName() + "\n");
				
				Iterator<Modifier> modit = mods.getMV();
				if (modit != null){
					while(modit.hasNext()){
						Modifier mod = modit.next();
						DmcNamedObjectIF referrer 	= mod.getReferringObject();
						DmcObject		 obj		= (DmcObject) referrer;
						DmcAttribute<?> attr = mod.getAttribute();
						if (attr.attrInfo.valueType == ValueTypeEnum.SINGLE)
							sb.append("  (" + obj.getConstructionClassName() + ") " + referrer.getObjectName() + " via SV " + attr.getName() + "\n");
						else{
							if (attr.attrInfo.indexSize == 0)
								sb.append("  (" + obj.getConstructionClassName() + ") " +  referrer.getObjectName() + " via MV " + attr.getName() + "\n");
							else
								sb.append("  (" + obj.getConstructionClassName() + ") " +  referrer.getObjectName() + " via INDEX " + mod.getIndex() + " " + attr.getName() + "\n");
						}
					}
				}
				return(sb.toString());
			}
		}
	}
	
	/**
	 * Returns the objects that are referring to this object. This will only
	 * return a value if you've turned on backref tracking via the DmcOmni.
	 */
	public ArrayList<DmcObject> getReferringObjects(){
		ArrayList<DmcObject>	rc = new ArrayList<DmcObject>();
		
		synchronized(attributes){
			DmcTypeModifierMV mods = getBackref();
			if (mods != null){
				Iterator<Modifier> modit = mods.getMV();
				if (modit != null){
					while(modit.hasNext()){
						Modifier mod = modit.next();
						rc.add((DmcObject)mod.getReferringObject());
					}
				}
			}
			return(rc);
		}
	}
	
	/**
	 * Returns the object in Object Instance Format (OIF). The attribute values
	 * will be automatically aligned beyond the length of the longest attribute
	 * name.
	 * @return The String representation of the object.
	 */
	public String toOIF(){
		int longest = 0;
		for(DmcAttribute<?> attr : attributes.values()){
			if (attr.ID == __objectClass.id)
				continue;
			if (attr.getName().length() > longest)
				longest = attr.getName().length();
		}

		return(toOIF(longest+2));
	}
	
	/**
	 * Returns the object in Object Instance Format (OIF).
	 * @return The String representation of the object.
	 */
	public String toOIFNoPadding(){
		StringBuffer	sb = new StringBuffer();
		
		appendClassNames(sb);
		
		if (getModifier() == null){
			// Dump the attribute values
			for(DmcAttribute<?> attr : attributes.values()){
				if ( attr.getID() != __objectClass.id )
					attr.toOIF(sb);
			}
		}
		else{
			// If we have a naming attribute and it's available, dump it
			if ( (getConstructionClassInfo() != null) && (getConstructionClassInfo().nameAttribute != null) ){
				DmcAttribute<?> attr = get(getConstructionClassInfo().nameAttribute);
				if (attr != null)
					attr.toOIF(sb);
			}
			// Just dump the modifier not the attributes
			getModifier().toOIF(sb);
		}

		return(sb.toString());
	}
	
	/**
	 * Returns the object in Object Instance Format (OIF) with the attribute name left
	 * justified in an amount of space indicated by padding. This just provides a more
	 * readable version of the object.
	 * @param padding The amount of space in which to display the attribute names.
	 * @return The String representation of the object.
	 */
	public String toOIF(int padding){
		StringBuffer	sb = new StringBuffer();
		
		appendClassNames(sb);
		
		if (getModifier() == null){
			// Dump the attribute values
			TreeMap<String,DmcAttribute<?>> sorted = new TreeMap<String, DmcAttribute<?>>();
			
			for(DmcAttribute<?> attr : attributes.values())
				sorted.put(attr.getName(), attr);
			
			for(DmcAttribute<?> attr : sorted.values()){
				if ( attr.getID() != __objectClass.id )
					attr.toOIF(sb,padding);
			}
		}
		else{
			// If we have a naming attribute and it's available, dump it
			if ( (getConstructionClassInfo() != null) && (getConstructionClassInfo().nameAttribute != null) ){
				DmcAttribute<?> attr = get(getConstructionClassInfo().nameAttribute);
				if (attr != null)
					attr.toOIF(sb, padding);
			}
			
			// Just dump the modifier, not the attributes
			if (getModifier().getMVSize() > 0)
				getModifier().toOIF(sb, padding);
			else
				sb.append("* no modifications\n");
		}
		

		return(sb.toString());
	}
	
	///////////////////////////////////////////////////////////////////////////
	// JSON formatting
	
	public String toJSON(){
		StringBuffer sb = new StringBuffer();
		
		toJSON(sb,0,"");
		
		return(sb.toString());
	}
	
	public String toJSON(int padding, String indent){
		StringBuffer sb = new StringBuffer();
		
		toJSON(sb,padding,indent);
		
		return(sb.toString());
	}
	
	public void toJSON(StringBuffer sb, int padding, String indent){
		String indentPlus = indent + "  ";
		
		sb.append(indent + "{ \"" + getConstructionClassName() + "\": {\n");
		
        // We attempt to dump the object class information first. This
        // isn't guaranteed when we receive a JSON object parsing, but
        // we do it here so that it's obvious what type of object you're
        // dealing with.
        DmcAttribute<?> oc = get(__objectClass.id);
        
        if (oc != null){
    		sb.append(indentPlus + "  \"objectClass\": [\n" );
    		oc.formatValueAsJSON(sb, padding, indentPlus + "  ");
    		sb.append("\n" + indentPlus + "  ]");
    		
        	sb.append(",\n");
        }
        
        Iterator<DmcAttribute<?>> it = attributes.values().iterator();
        while(it.hasNext()){
        	DmcAttribute<?> attr = it.next();

            if (attr.getID() == __objectClass.id){
        		if (!it.hasNext()){
        			
        			// The object class is the last attribute, so get rid
        			// of the extraneous ,\n
        			sb.deleteCharAt(sb.length()-1);
        			sb.deleteCharAt(sb.length()-1);
           		}
        		continue;
        	}

        	attr.toJSON(sb, padding, indentPlus + "  ");
        	
            if (it.hasNext()){
            	sb.append(",\n");
            }
        }
   
//        sb.append("\n" + indentPlus + "}");
        
        sb.append(indent + "\n}}");

	}
	
	public String toCompactJSON(){
		StringBuffer sb = new StringBuffer();
		toCompactJSON(sb);
		return(sb.toString());
	}
	
	public void toCompactJSON(StringBuffer sb){
		sb.append("{\"" + getConstructionClassName() + "\":{");
		
        sb.append("{");
        
        // We attempt to dump the object class information first. This
        // isn't guaranteed when we receive a JSON object parsing, but
        // we do it here so that it's obvious what type of object you're
        // dealing with.
        DmcAttribute<?> oc = get(__objectClass.id);
        
        if (oc != null){
    		sb.append("\"objectClass\":[");
    		oc.formatValueAsCompactJSON(sb);
    		sb.append("]");
    		
        	sb.append(",");
        }
        
        Iterator<DmcAttribute<?>> it = attributes.values().iterator();
        while(it.hasNext()){
        	DmcAttribute<?> attr = it.next();

            if ( attr.getName().equals(__objectClass.name)){
        		if (!it.hasNext()){
        			
        			// The object class is the last attribute, so get rid
        			// of the extraneous ,
        			sb.deleteCharAt(sb.length()-1);
           		}
        		continue;
        	}

        	attr.toCompactJSON(sb);
        	
            if (it.hasNext()){
            	sb.append(",");
            }
        }
   
        sb.append("}");

        sb.append("}");
	}
	
	
	
	/**
	 * A convenience method to display the class information for an object.
	 * @param sb The buffer we append to.
	 */
	private void appendClassNames(StringBuffer sb){
		if (getModifier() != null)
			return;
		
		DmcTypeClassDefinitionREFMV classes = (DmcTypeClassDefinitionREFMV) this.get(__objectClass.id);
		
		// Dump the construction class and any auxiliary classes
		if (classes != null){
			Iterator<ClassDefinitionREF> cls = classes.getMV();
			while(cls.hasNext()){
				ClassDefinitionREF cdr = cls.next();
				sb.append(cdr.getObjectName());
				if (cls.hasNext())
					sb.append(" ");
			}
			sb.append("\n");
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Object reference resolution
	
	/**
	 * This method is generally called by code that uses a DmoObjectFactory to create DMO
	 * instances. At this level, there is no concept of schemas, merely named objects. All
	 * this method does is attempt to resolve references to named objects using the provided
	 * name resolver.
	 * @param rx A name resolver.
	 * @throws Exception 
	 */
	public void resolveReferences(DmcNameResolverIF rx) throws DmcValueExceptionSet {
		resolveReferences(rx, false);
	}
	
	/**
	 * This method is used to resolve references in environments where the complete schema
	 * and its associated ClassDefinition objects are not available e.g. in GWT UIs. Resolution
	 * is performed as usual, but we skip the object class.
	 * @param rx A name resolver.
	 * @throws DmcValueExceptionSet
	 */
	public void resolveReferencesExceptClass(DmcNameResolverIF rx) throws DmcValueExceptionSet {
		resolveReferences(rx, true);
	}
	
	/**
	 * We perform object resolution and optionally skip the class attribute.
	 * @param rx A name resolver.
	 * @param skipClass Indicates whether we should skip the class attribute or not.
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public void resolveReferences(DmcNameResolverIF rx, boolean skipClass) throws DmcValueExceptionSet {
		synchronized (attributes) {
			DmcValueExceptionSet	errors = null;
	
			for(DmcAttribute<?> attr : attributes.values()){
				if (skipClass && (attr.ID == __objectClass.id))
					continue;
					
				if (attr instanceof DmcTypeNamedObjectREF){
//System.out.println("DmcObject.resolveReferences() resolving: " + attr.getName());
					DmcTypeNamedObjectREF reference = (DmcTypeNamedObjectREF) attr;
					
					if (attr.getMVSize() == 0){
						DmcNamedObjectREF ref = (DmcNamedObjectREF) attr.getSV();
						if (ref.isResolved())
							continue;
						
						DmcNamedObjectIF  	obj 			= rx.findNamedObject(ref.getObjectName(),attr.ID);
						DmcObject 			resolvedObject 	= null;
						
						if (obj == null){
							DmcValueException ex = new DmcValueException("Could not resolve reference to: " + ref.getObjectName() + " via attribute: " + attr.getName());
							if (errors == null)
								errors = new DmcValueExceptionSet();
							errors.add(ex);
						}
						else{
							if (obj instanceof DmcContainerIF){
								ref.setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
								resolvedObject = ((DmcContainerIF)obj).getDmcObject();
							}
							else{
								ref.setObject(obj);
								resolvedObject = (DmcObject)obj;
							}
						}
						
						// NOTE: we wouldn't do the backref tracking in the case of DMP
						// messages (which are marked as supportsBackrefTracking false).
						if (supportsBackrefTracking()){
//							if (DmcOmni.instance().backRefTracking() && (attr.ID > 200)){
							if (DmcOmni.instance().backRefTracking() && DmcOmni.instance().trackThisAttribute(attr.ID)){
								Modifier backrefMod = new Modifier(ModifyTypeEnum.SET,attr,this);
								resolvedObject.addBackref(backrefMod);
								
								// Let the reference know the backref modifier - this allows us to 
								// easily remove the backref if the reference is deleted
								ref.setBackrefModifier(backrefMod);
							}
						}

					}
					else{
						Iterator<DmcNamedObjectREF> refs = reference.getMV();
						if (refs != null){
							int currIndex = -1;
							while(refs.hasNext()){
								currIndex++;
								DmcNamedObjectREF ref = refs.next();
								
								// Note: ref may be null if this is an indexed attribute and
								// there is no value at the current index
								if ( (ref == null) || ref.isResolved())
									continue;
								
								DmcNamedObjectIF  	obj 			= rx.findNamedObject(ref.getObjectName(),attr.ID);
								DmcObject 			resolvedObject 	= null;
								
								if (obj == null){
									DmcValueException ex = new DmcValueException("Could not resolve reference to: " + ref.getObjectName() + " via attribute: " + attr.getName());
									if (errors == null)
										errors = new DmcValueExceptionSet();
									errors.add(ex);
								}
								else{
									if (obj instanceof DmcContainerIF){
										ref.setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
										resolvedObject = ((DmcContainerIF)obj).getDmcObject();
									}
									else{
										ref.setObject(obj);
										resolvedObject = (DmcObject)obj;
									}
									
									// NOTE: we wouldn't do the backref tracking in the case of DMP
									// messages (which are marked as supportsBackrefTracking false).
									if (supportsBackrefTracking()){
//										if (DmcOmni.instance().backRefTracking() && (attr.ID > 200)){
										if (DmcOmni.instance().backRefTracking() && DmcOmni.instance().trackThisAttribute(attr.ID)){
											if (attr.attrInfo.indexSize == 0){
												// We're modifying a reference attribute, so track that puppy
												DmcAttribute<?> mod = attr.getNew();
												mod.setAttributeInfo(attr.attrInfo);
												try {
													if (ref instanceof DmcExtendedReferenceIF)
														mod.add(ref);
													else
														mod.add(resolvedObject);
												} catch (DmcValueException e) {
													throw(new IllegalStateException("Creating backref for MV attribute during object resolution shouldn't throw exception.",e));
												}
												
												Modifier backrefMod = new Modifier(ModifyTypeEnum.ADD,mod,this);
												resolvedObject.addBackref(backrefMod);
												
												// Let the reference know the backref modifier - this allows us to 
												// easily remove the backref if the reference is deleted
												ref.setBackrefModifier(backrefMod);
											}
											else{
												DmcAttribute<?> mod = attr.getNew();
												mod.setAttributeInfo(attr.attrInfo);
												try {
													if (ref instanceof DmcExtendedReferenceIF)
														mod.setMVnth(currIndex, null);
													else
														mod.setMVnth(currIndex, null);
												} catch (DmcValueException e) {
													throw(new IllegalStateException("Creating backref for indexed attribute during object resolution shouldn't throw exception.",e));
												}
												
												Modifier backrefMod = new Modifier(ModifyTypeEnum.NTH,mod,this,currIndex);
												resolvedObject.addBackref(backrefMod);
												
												ref.setBackrefModifier(backrefMod);
											}
										}
									}
								}
							}
						}
					}
				}
				else if (attr instanceof DmcTypeComplexTypeWithRefs){
					try {
						((DmcTypeComplexTypeWithRefs)attr).resolve(rx, attr.getName());
					} catch (DmcValueException e) {
						if (errors == null)
							errors = new DmcValueExceptionSet();
						errors.add(e);
					}
				}
			}
			
			if (errors != null)
				throw(errors);
		}
	}
	
//	/**
//	 * We perform object resolution and optionally skip the class attribute.
//	 * @param rx A name resolver.
//	 * @param skipClass Indicates whether we should skip the class attribute or not.
//	 * @throws Exception 
//	 */
//	@SuppressWarnings("unchecked")
//	public void resolveReferencesWithBackrefs(DmcNameResolverIF rx, boolean skipClass) throws DmcValueExceptionSet {
//		synchronized (attributes) {
//			DmcValueExceptionSet	errors = null;
//	
//			for(DmcAttribute attr : attributes.values()){
//				if (skipClass && (attr.ID == __objectClass.id))
//					continue;
//					
//				if (attr instanceof DmcTypeNamedObjectREF){
//					DmcTypeNamedObjectREF ref = (DmcTypeNamedObjectREF) attr;
////					try {
////						ref.resolveReferences(rx);
//						ref.doLazyResolution(this);
////					} catch (DmcValueException e) {
////						if (errors == null)
////							errors = new DmcValueExceptionSet();
////						errors.add(e);
////					}
//				}
//				else if (attr instanceof DmcTypeComplexTypeWithRefs){
//					try {
//						((DmcTypeComplexTypeWithRefs)attr).resolve(rx, attr.getName());
//					} catch (DmcValueException e) {
//						if (errors == null)
//							errors = new DmcValueExceptionSet();
//						errors.add(e);
//					}
//				}
//			}
//			
//			if (errors != null)
//				throw(errors);
//		}
//	}
	
	public DmcObject cloneIt(){
		synchronized (attributes) {
			// Get a derived object of the right type
			DmcObject rc = getNew();
			
			try {
				DmcAttribute<?> ocl = get(__objectClass.id);
				if (ocl != null){
					rc.add(__objectClass, ocl.cloneIt());
				}
				for(DmcAttribute<?> attr : attributes.values()){
					DmcAttribute<?> copy = attr.cloneIt();
					rc.add(copy.getAttributeInfo(), copy);
				}
			} catch (DmcValueException e) {
				throw(new IllegalStateException("DmcObject cloning shouldn't throw an exception.", e));
			}
			
			return(rc);
		}
	}
	
	/**
	 * Creates a shallow copy of this object.
	 * @return
	 */
	public DmcObject shallowCopy(){
		synchronized (attributes) {
			// Get a derived object of the right type
			DmcObject rc = getNew();
			
			for(DmcAttribute<?> attr : attributes.values()){
				rc.attributes.put(attr.ID, attr);
			}
			
			return(rc);
		}
	}
	
	/**
	 * This method will take the specified slice of attributes out of this object and
	 * populate the object that holds the slice.
	 * @param sliceContainer the container that will get the slice of attributes if they exist.
	 * @param info The specification of the slice.
	 */
	protected void populateSlice(DmcObject sliceContainer, DmcSliceInfo info){
		synchronized (attributes) {
			if (this instanceof DmcNamedObjectIF){
				// We also take the name attribute if this is a named object
				DmcAttribute<?> na = ((DmcNamedObjectIF)this).getObjectNameAttribute();
				sliceContainer.attributes.put(na.ID, na);
			}
			
			for(Integer id: info.attrIDs){
				DmcAttribute<?> attr = attributes.get(id);
				if (attr != null)
					sliceContainer.attributes.put(id, attr);
			}
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Object modification
	
	/**
	 * This method applies the modification operations defined in the modifier to this object.
	 * @param mods The modifications to be applied.
	 * @throws DmcValueExceptionSet
	 * @throws DmcValueException
	 * @return true if any changes were made to the object and false otherwise. 
	 */
	@SuppressWarnings("unchecked")
	public boolean applyModifier(DmcTypeModifier mods) throws DmcValueExceptionSet, DmcValueException {
		synchronized (attributes) {
			boolean anyChange = false;
			
			// Check that the modifier is resolved
			mods.resolved();
			
			DmcAttribute<?> existing = null;
			
			Iterator<Modifier> modifiers = mods.getMV();
			while(modifiers.hasNext()){
				Modifier mod = modifiers.next();
				existing = get(mod.getAttributeName());
				
				switch(mod.getModifyType()){
				case ADD:
					if (existing == null){
						Iterator<Object> it = (Iterator<Object>) mod.getAttribute().getMV();
						Object value = it.next();
						if (value instanceof DmcNamedObjectREF){
							// we do things a little different for object refs because it relies on the lastValue
							// to create the backref modifier
							existing = mod.getAttribute().getNew();
							
							DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>)value;
							Object lastValue = existing.add(ref);
							setLastValue(lastValue);
							
							add(existing.attrInfo,existing);
						}
						else{
							// NOTE: we add a clone of the attribute since, if we don't, we wind
							// up storing the attribute instance that's in the modifier and adding
							// stuff to it!
							add(mod.getAttributeName(), mod.getAttribute().cloneIt());
						}
						anyChange = true;
					}
					else{
						Iterator<Object> it = (Iterator<Object>) mod.getAttribute().getMV();
						Object value = it.next();
						// NOTE: there will only ever be one value in the attribute and we have
						// to use an Iterator to get the value out.
	
						if ((value instanceof DmcNamedObjectREF) && !(value instanceof DmcExtendedReferenceIF)){
							// If the attribute is an object reference, we have to determine
							// whether we have the object or just its name - and perform the
							// add() accordingly.
							DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>)value;
							Object lastValue = existing.add(ref);
							
							if (lastValue != null){
								setLastValue(lastValue);
								anyChange = true;
								add(existing.attrInfo,existing);
							}
						}
						else{
							if ( existing.add(value) != null)
								anyChange = true;
						}
					}
					break;
				case DEL:
					if (existing == null){
						// The attribute being modified doesn't exist
						// TODO what to do with the deletion of a value from a non-existent attribute???
					}
					else{
						// NOTE: there will only ever be one value in the attribute and we have
						// to use an Iterator to get the value out.
						Iterator<Object> it = (Iterator<Object>) mod.getAttribute().getMV();
						Object value = it.next();
						
						if ( (value instanceof DmcNamedObjectREF) && !(value instanceof DmcExtendedReferenceIF)){						
							// If the attribute is an object reference, we have to determine
							// whether we have the object or just its name - and perform the
							// del() accordingly.
							DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>)value;
							
							setLastValue(ref);
							anyChange = true;
							del(existing.attrInfo, value);
						}
						else{
							if (value instanceof DmcMappedAttributeIF){
								if (existing.del(((DmcMappedAttributeIF)value).getKey()) != null)
									anyChange = true;
							}

							else if ( existing.del(value) != null){
								anyChange = true;
							}
						}
						
						if (existing.getMVSize() == 0){
							rem(existing.getAttributeInfo());
						}
					}
					break;
				case SET:
					if (existing == null){
						set(mod.getAttributeName(),mod.getAttribute());
						anyChange = true;
					}
					else{
						Object value = mod.getAttribute().getSV();
						
						if (value instanceof DmcNamedObjectREF){
							// We had a value in this attribute to start with, so clean
							// up the back reference before we apply the new value
							((DmcTypeNamedObjectREF<?, ?>)existing).removeBackReferences();
							
							DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>)value;
							if (existing.set(ref) != null){
								set(existing.attrInfo,existing);
								anyChange = true;
							}
						}
						else{
							if (existing.set(mod.getAttribute().getSV()) != null)
								anyChange = true;
						}
					}
					break;
				case NTH:
					// When a value is nulled, the modifier just contains the attribute info, not 
					// a value holding attribute. 
					int index = mod.getIndex();
					Object value = null;
					
					if (mod.getAttribute() != null)
						value = mod.getAttribute().getMVnth(index);
					
					if (existing == null){
						// NOTE: we add a clone of the attribute since, if we don't, we wind
						// up storing the attribute instance that's in the modifier and adding
						// stuff to it! 
						if (value != null){
							setLastValue(value);
							nth(mod.getAttribute().attrInfo,index,mod.getAttribute().cloneIt(),null);
							anyChange = true;
						}
					}
					else{
						Object previous = existing.getMVnth(index);
						
						if (value == null){
							// We're removing the value at the current slot
							
							// We currently have a value and we're nulling it so there's been a change
							if (previous != null){
								existing.setMVnth(index, value);
								setLastValue(value);
								nth(existing.attrInfo, index, existing, previous);
								anyChange = true;
							}
						}
						else{

							if ((value instanceof DmcNamedObjectREF) && !(value instanceof DmcExtendedReferenceIF)){
								// If the attribute is an object reference, we have to determine
								// whether we have the object or just its name - and perform the
								// add() accordingly.
								DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>)value;
								
								if (existing.setMVnth(index, ref) != null){
									setLastValue(ref);
									nth(existing.attrInfo, index, existing, previous);
									anyChange = true;
								}
								
							}
							else{
								if ( existing.setMVnth(index,value) != null)
									anyChange = true;
							}
							
						}
						
						if (!existing.hasValue()){
							rem(existing.getAttributeInfo());
						}

					}
					break;
				case REM:
					if (rem(mod.getAttributeName()) != null)
						anyChange = true;
					break;
				}
			}
			
			return(anyChange);
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Object serialization
	
	/**
	 * Returns the data type of our construction class if we're in an operational context
	 * where the underlying class definition is available; otherwise, UNKNOWN is returned.
	 */
	public DataTypeEnum getDataType(){
		DataTypeEnum rc = DataTypeEnum.UNKNOWN;
		
		DmcTypeClassDefinitionREFMV objClass = (DmcTypeClassDefinitionREFMV) attributes.get(__objectClass.id);
		if (objClass != null){
			ClassDefinitionREF ref = objClass.getMVnth(0);
			if (ref.getObject() != null){
				ClassDefinitionDMO dmo = ref.getObject();
				rc = dmo.getDataType();
			}
		}
			
		return(rc);
	}
	
    /**
     * Serializes the object using Dark Matter serialization techniques.
     * @param dos
     * @throws IOException 
     * @throws DmcValueException  
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception, DmcValueException {
		synchronized (attributes) {
			// WRITE: the objectClass
			DmcTypeClassDefinitionREFMV oc = (DmcTypeClassDefinitionREFMV) get(__objectClass.id);
			// WRITE: the object class is serialized as [class count] id id id...
			dos.writeInt(oc.getMVSize());
			for(int i=0; i<oc.getMVSize(); i++){
				dos.writeInt(oc.getMVnth(i).getClassInfo().id);
			}
	
			// We have to determine the number of attributes we're going to write. That will
			// depend on the dataType of the attributes and the mode that the output stream
			// is in.
			//
			// We never write the objectClass attribute or count it towards the number of attributes
			// to be serialized.
			int attrcount = 0;
			Iterator<DmcAttribute<?>> it = attributes.values().iterator();
			while (it.hasNext()) {
				DmcAttribute<?> attr = it.next();
				if (attr.getID() != __objectClass.id){
					if (attr.getAttributeInfo().dataType == DataTypeEnum.TRANSIENT)
						continue;
					if (dos.isFile()){
						if (attr.getAttributeInfo().dataType == DataTypeEnum.PERSISTENT)
							attrcount++;
					}
					else
						attrcount++;
				}
			}
			
			// WRITE: the number of attributes
			dos.writeAttributeCount(attrcount);
	
			it = attributes.values().iterator();
			while (it.hasNext()) {
				DmcAttribute<?> attr = it.next();
				
				if (attr.getID() != __objectClass.id){
					if (attr.getAttributeInfo().dataType == DataTypeEnum.TRANSIENT)
						continue;
					if (dos.isFile()){
						if (attr.getAttributeInfo().dataType == DataTypeEnum.PERSISTENT)
							attr.serializeIt(dos);
					}
					else
						attr.serializeIt(dos);
				}
			}
		}
    }
    
    public void deserializeIt(DmcInputStreamIF dis)  throws Exception {
    	int attrCount = dis.readAttributeCount();
    	
    	for(int i=0; i<attrCount; i++){
    		int attrID = dis.readAttributeID();
    		DmcAttribute<?> attr = null;
    		try{
    			attr = dis.getAttributeInstance(attrID);
    			
    			if (attr instanceof DmcTypeNamedObjectREF<?,?>){
    				
    			}
    		}
    		catch(Exception ex){
    			throw(new IllegalStateException("While decoding: " + getConstructionClassName(), ex));
    		}
    		attr.deserializeIt(dis);
    		add(attr.attrInfo, attr);
    	}
    }

    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * This method should be used with extreme caution! It will forceably unresolve all
     * reference attributes on the object and clear any back reference tracking information.
     */
    @SuppressWarnings("unchecked")
	public void clearReferenceInfo(){
		for(DmcAttribute<?> attr : attributes.values()){
			if (attr instanceof DmcTypeNamedObjectREF){
				DmcTypeNamedObjectREF reference = (DmcTypeNamedObjectREF) attr;
				if (attr.getMVSize() == 0){
					DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>) attr.getSV();
					ref.setObject(null);
				}
				else{
					Iterator<DmcNamedObjectREF<?>> refs = reference.getMV();
					if (refs != null){
						int currIndex = -1;
						while(refs.hasNext()){
							currIndex++;
							DmcNamedObjectREF<?> ref = refs.next();
							if (ref != null){
								ref.setObject(null);
							}
						}
					}
				}
			}
		}
		setInfo(BACKREFS,BACKREFS_SIZE,null);
		shrinkInfo(BACKREFS);
    }
}
