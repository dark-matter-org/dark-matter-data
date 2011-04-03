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
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.Modifier;
import org.dmd.dmc.types.StringName;
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
 * level, the DMC is abstract; it is the derived, auto-generated Dark Matter Objects (DMOs)
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
 * There are currently 4 additional pieces of information stored for a DMC object:
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
 * it can automatically null the reference to itself in the reference attributes. This is
 * a work around for the fact that the GWT JRE Emulation mechanisms don't support the
 * java.lang.ref.WeakReference mechanisms.
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
 * </ul>
 */
@SuppressWarnings("serial")
abstract public class DmcObject implements Serializable {
	
	static final int	CONTAINER 	= 0;
	static final int	BACKREFS	= 1;
	static final int	MODIFIER	= 2;
	static final int	LASTVAL		= 3;
	
	// The objectClass attribute is common to all objects and indicates the construction class
	// and any auxiliary classes associated with the object
    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("objectClass",1,"ClassDefinitionREF",ValueTypeEnum.MULTI,true);
	
	// At this level, all we have is a simple collection of attributes.
	protected Map<Integer, DmcAttribute<?>>	attributes;
	
	// If the modifier is set on an object, all changes to the object are tracked.
	transient DmcTypeModifierMV				modifier;
	
	// In order to build modifiers without imposing unnecessary storage on DmcAttributes,
	// the attribute access functions in generated DMOs store the last typeChecked() value
	// here.
	transient Object						lastValue;
	
	// This is the handle to the container object that wraps this object. This
	// may or may not have a value, depending on the usage context. Also,
	// the behaviour of this object is completely up to whoever implements it.
	// This handle facilitates hooks for things like object change notification.
	transient DmcContainerIF 				container;

	// The info map is used to reduce the memory footprint of the DmcObject by compacting
	// various additional information that may be required into a single value. This comes
	// with a slight processing overhead, but that's seen to be reasonable when you're
	// trying to store lots of DMOs in memory.
	// 
	transient Vector<Object>				info;
	
	public DmcObject(){
		attributes 	= new TreeMap<Integer, DmcAttribute<?>>();
		info		= null;
	}
	
	/**
	 * A protected constructor for derived classes that lets us set the object class
	 * attribute from the most specific derived class.
	 * @param oc The class name.
	 */
	@SuppressWarnings("unchecked")
	protected DmcObject(String oc){
		attributes 	= new TreeMap<Integer, DmcAttribute<?>>();
		info		= null;
		
		// All objects have a well known construction class which is the first
		// entry in their objectClass attribute.
        DmcAttribute attr = new DmcTypeClassDefinitionREFMV(__objectClass);
        try {
            attr.add(new StringName(oc));
			add(__objectClass,attr);
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Setting the objectClass using a String shouldn't never croak!", e));
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Abstracts that are overridden in DMOs

	/**
	 * Auto-generated derived classes override this to return their attribute mapping.
	 * @return The map of unique integer IDs to attribute info.
	 */
	abstract public Map<Integer,DmcAttributeInfo> getIdToAttrInfo();
	
	/**
	 * Auto-generated derived classes override this to return their attribute mapping.
	 * @return The map of attribute name to attribute info.
	 */
	abstract public Map<String,DmcAttributeInfo> getStringToAttrInfo();
	
	/**
	 * Auto-generated derived classes override this to return an empty instance 
	 * of themselves. This supports cloning.
	 * @return An instance of the derived class.
	 */
	abstract public DmcObject getNew();
	
	////////////////////////////////////////////////////////////////////////////////
	// Utility mechanisms to manage the info Vector
	
	/**
	 * This method sets the modifier of the object which will track all changes made
	 * to the object. Set the modifier to null to stop change tracking.
	 * @param m
	 */
	public void setModifier(DmcTypeModifierMV m){
		modifier = m;
	}
	
	/**
	 * Returns the current set of modifications (if any were made).
	 * @return
	 */
	public DmcTypeModifierMV getModifier(){
		return(modifier);
	}
	
	/**
	 * Sets the container that's currently wrapping this object.
	 * @param c the container.
	 */
	public void setContainer(DmcContainerIF c){
		container = c;
	}
	
	/**
	 * @return The container that's currently wrapping this object or null if there isn't one.
	 */
	public DmcContainerIF getContainer(){
		return(container);
	}
	
	protected Object getLastValue(){
		return(lastValue);
	}

	protected void  setLastValue(Object val){
		lastValue = val;
	}

	/**
	 * This method should be called by whatever mechanism you're using to manage a collection
	 * of DMOs. It will automatically removed references to this object that are contained in
	 * object reference attributes if you have set DmcOmni.backRefTracking(true).
	 */
	public void youAreDeleted(){
		if (DmcOmni.instance().backRefTracking()){
			
		}
	}
	
	public void youAreBeingWatched(DmcAttribute<?> attr){
		
	}
	
	public void notLongerInterested(DmcAttribute<?> attr){

	}
	

	////////////////////////////////////////////////////////////////////////////////

	/**
	 * This method is generally used by object parsers to determine whether or not an attribute
	 * is natively supported by a DMO (in which case it returns the attribute info) or whether
	 * the attribute in question is associated with an auxiliary class (in which case we get
	 * the appropriate attribute info from the AttributeDefinition).
	 * @param an The attribute id.
	 * @return The attribute info or null.
	 */
	public DmcAttributeInfo getAttributeInfo(String an){
		DmcAttributeInfo rc = null;
		
		if (getStringToAttrInfo() != null)
			return(getStringToAttrInfo().get(an));
		
		return(rc);
	}
	
	/**
	 * This method is generally used by object parsers to determine whether or not an attribute
	 * is natively supported by a DMO (in which case it returns the attribute info) or whether
	 * the attribute in question is associated with an auxiliary class (in which case we get
	 * the appropriate attribute info from the AttributeDefinition).
	 * @param an The attribute name.
	 * @return The attribute info or null.
	 */
	public DmcAttributeInfo getAttributeInfo(Integer id){
		DmcAttributeInfo rc = null;
		
		if (getIdToAttrInfo() != null)
			return(getIdToAttrInfo().get(id));
		
		return(rc);
	}
	
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

	/**
	 * Returns the holder of value for the named attribute. Use this with caution!
	 * This is generally used only by derived wrapper classes of DmcObject.
	 * @param name The name of the attribute.
	 * @return DmcAttribute
	 */
	@SuppressWarnings("unchecked")
	public DmcAttribute get(String name){
		DmcAttributeInfo ai = getAttributeInfo(name);
		if (ai == null)
			return(null);
		return (attributes.get(ai.id));
	}
	
	/**
	 * Returns the holder of value for the named attribute. Use this with caution!
	 * This is generally used only by derived wrapper classes of DmcObject.
	 * @param name The name of the attribute.
	 * @return DmcAttribute
	 */
	@SuppressWarnings("unchecked")
	public DmcAttribute get(Integer id){
		return (attributes.get(id));
	}
	
	/**
	 * Returns the holder of value for the named attribute. Use this with caution!
	 * This is generally used only by derived wrapper classes of DmcObject.
	 * @param name The name of the attribute.
	 * @return DmcAttribute
	 */
	@SuppressWarnings("unchecked")
	public DmcAttribute get(DmcAttributeInfo ai){
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
	 * This method sets the value of a single-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param attrName  The attribute name.
	 * @param attr      The attribute to be stored.
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute> T set(String attrName, DmcAttribute attr) throws DmcValueException {
		DmcAttributeInfo ai = getAttributeInfo(attrName);
		
		if (ai == null){
			DmcValueException dve = new DmcValueException(attrName, "This attribute isn't valid for " + this.getClass().getName());
			throw(dve);
		}
		
		return(set(ai,attr));
	}
	
	/**
	 * This method sets the value of a single-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param attrName  The attribute info.
	 * @param attr      The attribute to be stored.
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute> T set(DmcAttributeInfo ai, DmcAttribute attr) throws DmcValueException {		
		DmcAttribute existing = attributes.get(ai.id);
		
		if (existing == null){
			attributes.put(ai.id, attr);
			attr.setAttributeInfo(ai);
		}
		
		if (getModifier() != null){
			getModifier().add(new Modifier(ModifyTypeEnum.SET, attr));
		}
		
		if ( (getContainer() != null) && (getContainer().getListenerManager() == null) ){
	    	/**
	    	 * TODO implement attribute change listener hooks
	    	 */
		}
		
		return (T) (attr);
	}
	
	/**
	 * This method adds a value to a multi-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param attrName  The attribute name.
	 * @param attr      The attribute value to be stored.
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute> T add(String attrName, DmcAttribute attr) throws DmcValueException {
		DmcAttributeInfo ai = getAttributeInfo(attrName);
		
		if (ai == null){
			DmcValueException dve = new DmcValueException(attrName, "This attribute isn't valid for " + this.getClass().getName());
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
	public <T extends DmcAttribute> T add(DmcAttributeInfo ai, DmcAttribute attr) throws DmcValueException {
		DmcAttribute existing = (DmcAttribute) attributes.get(ai.id);
		
		if (existing == null){
			attributes.put(ai.id, attr);
			attr.setAttributeInfo(ai);
		}
		
		if (getModifier() != null){
			// Get an attribute value holder of the same type and hang on to the last
			// value that was added to it
			DmcAttribute mod = attr.getNew();
			mod.setAttributeInfo(ai);
			
			mod.add(getLastValue());
			getModifier().add(new Modifier(ModifyTypeEnum.ADD, mod));
		}
		
		if ( (getContainer() != null) && (getContainer().getListenerManager() == null) ){
	    	/**
	    	 * TODO implement attribute change listener hooks
	    	 */
		}

		return (T) (attr);
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
	public <T extends DmcAttribute> T del(String attrName, Object value){
		DmcAttributeInfo ai = getAttributeInfo(attrName);
		
		if (ai == null)
			return(null);
		
		return(del(ai,value));
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
	public <T extends DmcAttribute> T del(DmcAttributeInfo ai, Object value){
		DmcAttribute attr = (DmcAttribute) attributes.get(ai.id);
		
		if (attr == null){
			if (getModifier() != null){
				throw(new IllegalStateException("HAVE TO HANDLE DELETION FROM A NON-EXISTENT ATTRIBUTE FOR MODIFIERS!"));
			}
			return(null);
		}
		
		if (getModifier() != null){
			try {
				DmcAttribute mod = attr.getNew();
				mod.setAttributeInfo(ai);
				
				mod.add(value);
				getModifier().add(new Modifier(ModifyTypeEnum.DEL, mod));
			} catch (DmcValueException e) {
				throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
			}
		}
		
		if (getContainer() == null){
			attr.del(value);
		}
		else{
			if (getContainer().getListenerManager() == null)
				attr.del(value);
			else{
		    	/**
		    	 * TODO implement attribute change listener hooks
		    	 */
			}
		}
		
		// If we have no further elements in the multi-value attribute, remove it
		if (attr.getMVSize() == 0)
			rem(ai);

		return (T) (attr);
	}
		
	/**
	 * Removes the specified attribute from the object.
	 * @param an The attribute name.
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute> T rem(String attrName){
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
	public <T extends DmcAttribute> T rem(DmcAttributeInfo ai){
		T attr = (T) attributes.remove(ai.id);
		
		if (getModifier() != null){
			try {
				getModifier().add(new Modifier(ModifyTypeEnum.REM, null));
			} catch (DmcValueException e) {
				throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
			}
		}
		
		if ( (getContainer() != null) && (getContainer().getListenerManager() != null)){
	    	/**
	    	 * TODO implement attribute change listener hooks
	    	 */
		}
		
		return(attr);
	}
	
	/**
	 * Returns the object in its native Object Instance Format.
	 */
	public String toString(){
		return(toOIF());
	}
	
	/**
	 * Returns the object in Object Instance Format (OIF).
	 * @return The String representation of the object.
	 */
	@SuppressWarnings("unchecked")
	public String toOIF(){
		StringBuffer	sb = new StringBuffer();
		
		appendClassNames(sb);
		
		// Dump the attribute values
		for(DmcAttribute attr : attributes.values()){
			if ( attr.getID() != __objectClass.id )
				attr.toOIF(sb);
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
	@SuppressWarnings("unchecked")
	public String toOIF(int padding){
		StringBuffer	sb = new StringBuffer();
		
		appendClassNames(sb);
		
		// Dump the attribute values
		for(DmcAttribute attr : attributes.values()){
			if ( attr.getID() != __objectClass.id )
				attr.toOIF(sb,padding);
		}

		return(sb.toString());
	}
	
//	public String toJSON(){
//		StringBuffer sb = new StringBuffer();
//		
//		toJSON(sb,0,"");
//		
//		return(sb.toString());
//	}
//	
//	public String toJSON(int padding, String indent){
//		StringBuffer sb = new StringBuffer();
//		
//		toJSON(sb,padding,indent);
//		
//		return(sb.toString());
//	}
//	
//	@SuppressWarnings("unchecked")
//	public void toJSON(StringBuffer sb, int padding, String indent){
//        sb.append(indent + "{\n");
//        
//        // We attempt to dump the object class information first. This
//        // isn't guaranteed when we receive a JSON object parsing, but
//        // we do it here so that it's obvious what type of object you're
//        // dealing with.
//        DmcAttribute oc = get(__objectClass.id);
////        if (oc == null)
////        	oc = get(_ocl);
//        
//        if (oc != null){
//    		sb.append(indent + "  \"objectClass\": [\n" );
//    		oc.formatValueAsJSON(sb, padding, indent + "  ");
//    		sb.append("\n" + indent + "  ]");
//    		
//        	sb.append(",\n");
//        }
//        
//        Iterator<DmcAttribute<?>> it = attributes.values().iterator();
//        while(it.hasNext()){
//        	DmcAttribute attr = it.next();
////        	if ( (attr.getName().equals("objectClass")) || (attr.getName().equals(_ocl))){
//            if (attr.getName().equals(__objectClass.name)){
//        		if (!it.hasNext()){
//        			
//        			// The object class is the last attribute, so get rid
//        			// of the extraneous ,\n
//        			sb.deleteCharAt(sb.length()-1);
//        			sb.deleteCharAt(sb.length()-1);
//           		}
//        		continue;
//        	}
//
//        	attr.toJSON(sb, padding, indent + "  ");
//        	
//            if (it.hasNext()){
//            	sb.append(",\n");
//            }
//        }
//   
//        sb.append("\n" + indent + "}");
//
//	}
//	
//	public String toCompactJSON(){
//		StringBuffer sb = new StringBuffer();
//		toCompactJSON(sb);
//		return(sb.toString());
//	}
//	
//	@SuppressWarnings("unchecked")
//	public void toCompactJSON(StringBuffer sb){
//        sb.append("{");
//        
//        // We attempt to dump the object class information first. This
//        // isn't guaranteed when we receive a JSON object parsing, but
//        // we do it here so that it's obvious what type of object you're
//        // dealing with.
//        DmcAttribute oc = get(__objectClass.id);
////        if (oc == null)
////        	oc = get(_ocl);
//        
//        if (oc != null){
//    		sb.append("\"objectClass\":[");
//    		oc.formatValueAsCompactJSON(sb);
//    		sb.append("]");
//    		
//        	sb.append(",");
//        }
//        
//        Iterator<DmcAttribute<?>> it = attributes.values().iterator();
//        while(it.hasNext()){
//        	DmcAttribute attr = it.next();
////        	if ( (attr.getName().equals("objectClass")) || (attr.getName().equals(_ocl))){
//            if ( attr.getName().equals(__objectClass.name)){
//        		if (!it.hasNext()){
//        			
//        			// The object class is the last attribute, so get rid
//        			// of the extraneous ,
//        			sb.deleteCharAt(sb.length()-1);
//           		}
//        		continue;
//        	}
//
//        	attr.toCompactJSON(sb);
//        	
//            if (it.hasNext()){
//            	sb.append(",");
//            }
//        }
//   
//        sb.append("}");
//
//	}
//	
	
	
	/**
	 * A convenience method to display the class information for an object.
	 * @param sb The buffer we append to.
	 */
	private void appendClassNames(StringBuffer sb){
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
	
	/**
	 * @return An iterator over the names of this object's attributes.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<String> getAttributeNames(){
		ArrayList<String>	names = new ArrayList<String>();
		for(DmcAttribute attr: attributes.values()){
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
	
	/**
	 * This method is generally called by code that uses a DmoObjectfactory to create DMO
	 * instances. At this level, there is no concept of schemas, merely named objects. All
	 * this method does is attempt to resolve references to named objects using the provided
	 * name resolver.
	 * @param rx A name resolver.
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public void resolveReferences(DmcNameResolverIF rx) throws DmcValueExceptionSet {
		DmcValueExceptionSet	errors = null;
//		DebugInfo.debug(DebugInfo.getCurrentStack());
		
//		DebugInfo.debug("\n**\n" + this.toOIF(15));
		for(DmcAttribute attr : attributes.values()){
			if (attr instanceof DmcTypeNamedObjectREF){
				DmcTypeNamedObjectREF reference = (DmcTypeNamedObjectREF) attr;
				
				if (attr.getMVSize() == 0){
					DmcNamedObjectREF ref = (DmcNamedObjectREF) attr.getSV();
					DmcNamedObjectIF  obj = rx.findNamedObject(ref.getObjectName());
					
					if (obj == null){
						DmcValueException ex = new DmcValueException(attr.getName(),"Could not resolve reference to: " + ref.getObjectName());
						if (errors == null)
							errors = new DmcValueExceptionSet();
						errors.add(ex);
					}
					else
						ref.setObject(obj);
				}
				else{
					Iterator<DmcNamedObjectREF> refs = reference.getMV();
					if (refs != null){
						while(refs.hasNext()){
							DmcNamedObjectREF ref = refs.next();
							DmcNamedObjectIF  obj = rx.findNamedObject(ref.getObjectName());
							
							if (obj == null){
								DmcValueException ex = new DmcValueException(attr.getName(),"Could not resolve reference to: " + ref.getObjectName());
								if (errors == null)
									errors = new DmcValueExceptionSet();
								errors.add(ex);
							}
							else
								ref.setObject(obj);
						}
					}
				}
			}
		}
		
		// 
		if (errors != null)
			throw(errors);
	}
	
	@SuppressWarnings("unchecked")
	public DmcObject cloneIt(){
		// Get a derived object of the right type
		DmcObject rc = getNew();
		
		try {
			DmcAttribute ocl = get(__objectClass.id);
			if (ocl != null){
				rc.add(__objectClass, ocl.cloneIt());
			}
			for(DmcAttribute attr : attributes.values()){
				DmcAttribute copy = attr.cloneIt();
				rc.add(copy.getName(), copy);
			}
		} catch (DmcValueException e) {
			throw(new IllegalStateException("DmcObject cloning shouldn't throw an exception.", e));
		}
		
		return(rc);
	}
	
	/**
	 * This method applies the modification operations defined in the modifier to this object.
	 * @param mods The modifications to be applied.
	 * @throws DmcValueExceptionSet
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public void applyModifier(DmcTypeModifier mods) throws DmcValueExceptionSet, DmcValueException {
		// Check that the modifier is resolved
		mods.resolved();
		
		DmcAttribute existing = null;
		
		Iterator<Modifier> modifiers = mods.getMV();
		while(modifiers.hasNext()){
			Modifier mod = modifiers.next();
			existing = get(mod.getAttributeName());
			
			switch(mod.getModifyType()){
			case ADD:
				if (existing == null)
					add(mod.getAttributeName(), mod.getAttribute());
				else{
					Object value = mod.getAttribute().getMVnth(0);
					
					if (value instanceof DmcNamedObjectREF){
						// If the attribute is an object reference, we have to determine
						// whether we have the object or just its name - and perform the
						// add() accordingly.
						DmcNamedObjectREF ref = (DmcNamedObjectREF)value;
						if (ref.getObject() == null)
							existing.add(ref.getObjectName());
						else
							existing.add(ref.getObject());
					}
					else
						existing.add(mod.getAttribute().getMVnth(0));
				}
				break;
			case DEL:
				if (existing == null){
					// The attribute being modified doesn't exist
					// TODO what to do with the deletion of a value from a non-existent attribute???
				}
				else{
					Object value = mod.getAttribute().getMVnth(0);
					
					if (value instanceof DmcNamedObjectREF){						
						// If the attribute is an object reference, we have to determine
						// whether we have the object or just its name - and perform the
						// del() accordingly.
						DmcNamedObjectREF ref = (DmcNamedObjectREF)value;
						if (ref.getObject() == null)
							existing.del(ref.getObjectName());
						else
							existing.del(ref.getObject());
					}
					else
						existing.del(mod.getAttribute().getMVnth(0));
				}
				break;
			case SET:
				if (existing == null)
					set(mod.getAttributeName(),mod.getAttribute());
				else{
					Object value = mod.getAttribute().getSV();
					
					if (value instanceof DmcNamedObjectREF){						
						// If the attribute is an object reference, we have to determine
						// whether we have the object or just its name - and perform the
						// set() accordingly.
						DmcNamedObjectREF ref = (DmcNamedObjectREF)value;
						if (ref.getObject() == null)
							existing.set(ref.getObjectName());
						else
							existing.set(ref.getObject());
					}
					else
						existing.set(mod.getAttribute().getSV());
				}
				break;
			case REM:
				rem(mod.getAttributeName());
				break;
			}
		}
	}
	
    /**
     * A serialized object will be structured as follows:
     * [UTF] (this construction class name)
     * @param dos
     * @throws IOException 
     * @throws DmcValueException  
     */
//    @SuppressWarnings("unchecked")
    public void serializeIt(DmcOutputStreamIF dos) throws Exception, DmcValueException {
		// WRITE: the objectClass
		DmcAttribute<?> oc = get(1);
		oc.serializeIt(dos);

		// WRITE: the number of attributes
		// NOTE: we reduce the count by 1 because we write the objectClass
		// attribute separately
		dos.writeAttributeCount(attributes.size() - 1);

		Iterator<DmcAttribute<?>> it = attributes.values().iterator();
		while (it.hasNext()) {
			DmcAttribute<?> attr = it.next();
			if (attr.getID() != 1) {
				// DebugInfo.debug("attr: " + attr.getName());
				attr.serializeIt(dos);
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
    		}
    		catch(Exception ex){
    			throw(new IllegalStateException("While decoding: " + getConstructionClassName(), ex));
    		}
    		attr.deserializeIt(dis);
    		add(attr.attrInfo, attr);
    	}
    }

}
