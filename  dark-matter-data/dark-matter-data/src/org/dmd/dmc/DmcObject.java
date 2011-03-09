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

import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.Modification;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.ClassDefinitionREF;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREF;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The Dark Matter Core Object is the basic entity on which all aspects of the 
 * Dark Matter Data framework are based. 
 *
 */
@SuppressWarnings("serial")
public class DmcObject implements Serializable {
	
//	public final static String _ocl = "ocl";
//	public final static String _objectClass = "objectClass";
	
	// The objectClass attribute is common to all objects and indicates the construction class
	// and any auxiliary classes associated with the object
    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("objectClass",1,"ClassDefinitionREF",ValueTypeEnum.MULTI,true);
	
	// If the modifier is set on an object, all changes to the object are
	// tracked.
	DmcTypeModifier							modifier;
	
	// This is the handle to the container object that wraps this object. This
	// may or may not have a value, depending on the usage context. Also,
	// the behaviour of this object is completely up to whoever implements it.
	// This handle facilitates hooks for things like object change notification.
	transient DmcContainerIF 				container;

	// At this level, all we have is a simple collection of attributes.
	@SuppressWarnings("unchecked")
	protected Map<Integer, DmcAttribute>	attributes;
	
	// The attribute type mapping created for DMOs
	// Key: unique attribute id
	transient Map<Integer,DmcAttributeInfo>	idToAttrInfo;
	
	// The attribute type mapping created for DMOs
	// Key: attribute name
	transient Map<String,DmcAttributeInfo>	stringToAttrInfo;
	
	@SuppressWarnings("unchecked")
	public DmcObject(){
		attributes = new TreeMap<Integer, DmcAttribute>();
	}
	
	/**
	 * A protected constructor for derived classes that lets us set the object class
	 * attribute from the most specific derived class.
	 * @param oc The class name.
	 */
	@SuppressWarnings("unchecked")
	protected DmcObject(String oc){
		attributes = new TreeMap<Integer, DmcAttribute>();
        DmcAttribute attr = new DmcTypeClassDefinitionREF();
        try {
        	// NOTE: we use the ocl (object class list) attribute to store the string based
        	// class name for Dark Matter Core objects. However, in Dark Matter Wrapper objects
        	// used on the server, we have access to the objectClass attribute which has
        	// references to actual Dark Matter Schema (DMS) class definitions. This approach 
        	// prevents us from having to depend on the DMS information in a client.
            attr.add(oc);
			add(__objectClass,attr);
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * A protected constructor for derived classes that lets us set the object class
	 * attribute from the most specific derived class.
	 * @param oc The class name.
	 */
	@SuppressWarnings("unchecked")
	protected DmcObject(String oc, Map<Integer,DmcAttributeInfo> imap, Map<String,DmcAttributeInfo> smap){
		attributes = new TreeMap<Integer, DmcAttribute>();
        DmcAttribute attr = new DmcTypeClassDefinitionREF();
        try {
        	// NOTE: we use the ocl (object class list) attribute to store the string based
        	// class name for Dark Matter Core objects. However, in Dark Matter Wrapper objects
        	// used on the server, we have access to the objectClass attribute which has
        	// references to actual Dark Matter Schema (DMS) class definitions. This approach 
        	// prevents us from having to depend on the DMS information in a client.
            attr.add(oc);
			add(__objectClass,attr);
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		idToAttrInfo = imap;
		stringToAttrInfo = smap;
	}
	
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
		
		if (stringToAttrInfo != null)
			return(stringToAttrInfo.get(an));
		
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
		
		if (idToAttrInfo != null)
			return(idToAttrInfo.get(id));
		
		return(rc);
	}
	
	/**
	 * Returns the attribute information map if this object was instantiated using a generated
	 * DMO class.
	 * @return
	 */
	public Map<Integer,DmcAttributeInfo> getAttributeMap(){
		return(idToAttrInfo);
	}
	
	/**
	 * This method sets the modifier of the object which will track all changes made
	 * to the object. Set the modifier to null to stop change tracking.
	 * @param m
	 */
	public void setModifier(DmcTypeModifier m){
		modifier = m;
	}
	
	/**
	 * Returns the current set of modifications (if any were made).
	 * @return
	 */
	public DmcTypeModifier getModifier(){
		return(modifier);
	}
	
	/**
	 * @return The class name of this object.
	 */
	public String getConstructionClassName(){
		DmcTypeClassDefinitionREF ocl = (DmcTypeClassDefinitionREF) get(__objectClass.id);
		
		if (ocl != null){
			if (ocl.getMVSize() > 0){
				return(ocl.getMVnth(0).getObjectName());
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
    	DmcTypeClassDefinitionREF ocl = (DmcTypeClassDefinitionREF) get(__objectClass.id);

		if (ocl != null)
			ocl.add(cd);
    }
    
    /**
     * Removes the specified auxiliary class name from the object.
     * @param cd The auxiliary class name.
     */
    public void removeAux(String cd){
    	DmcTypeClassDefinitionREF ocl = (DmcTypeClassDefinitionREF) get(__objectClass.id);

		if (ocl != null)
			ocl.del(cd);
    }

    /**
     * Determines if the specified class is in our ocl.
     * @param cd The auxiliary class name.
     */
    public boolean hasAux(String cd){
    	DmcTypeClassDefinitionREF ocl = (DmcTypeClassDefinitionREF) get(__objectClass.id);

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
		DmcAttributeInfo ai = stringToAttrInfo.get(name);
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
		return (attributes.get(ai.id));
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
		DmcAttributeInfo ai = stringToAttrInfo.get(attrName);
		
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
		
		if (modifier != null){
			modifier.add(new Modification(ModifyTypeEnum.SET, attr));
		}
		
		if ( (container != null) && (container.getListenerManager() == null) ){
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
		DmcAttributeInfo ai = stringToAttrInfo.get(attrName);
		
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
		
		if (modifier != null){
			// Get an attribute value holder of the same type and hang on to the last
			// value that was added to it
			DmcAttribute mod = attr.getOneOfMe();
			mod.setName(attr.getName());
			
			mod.add(attr.getLastMVValue());
			modifier.add(new Modification(ModifyTypeEnum.ADD, mod));
		}
		
		if ( (container != null) && (container.getListenerManager() == null) ){
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
		DmcAttributeInfo ai = stringToAttrInfo.get(attrName);
		
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
			return(null);
		}
		
		if (modifier != null){
			try {
				DmcAttribute mod = attr.getOneOfMe();
				mod.setName(attr.getName());
				
				mod.add(value);
				modifier.add(new Modification(ModifyTypeEnum.DEL, mod));
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (container == null){
			attr.del(value);
		}
		else{
			if (container.getListenerManager() == null)
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
		DmcAttributeInfo ai = stringToAttrInfo.get(attrName);
		
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
		
		if (modifier != null){
			try {
				modifier.add(new Modification(ModifyTypeEnum.REM, null));
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if ( (container != null) && (container.getListenerManager() != null)){
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
//			if ( (!attr.getName().equals(_ocl)) && (!attr.getName().equals(_objectClass)) )
			
			if ( !attr.getName().equals(__objectClass.name) )
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
//			if ( (!attr.getName().equals(_ocl)) && (!attr.getName().equals(_objectClass)) )

//			DebugInfo.debug("PRINTING OBJECTCLASS!!!");

			if ( !attr.getName().equals(__objectClass.name) )
				attr.toOIF(sb,padding);
		}

		return(sb.toString());
	}
	
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
	
	@SuppressWarnings("unchecked")
	public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        
        // We attempt to dump the object class information first. This
        // isn't guaranteed when we receive a JSON object parsing, but
        // we do it here so that it's obvious what type of object you're
        // dealing with.
        DmcAttribute oc = get(__objectClass.id);
//        if (oc == null)
//        	oc = get(_ocl);
        
        if (oc != null){
    		sb.append(indent + "  \"objectClass\": [\n" );
    		oc.formatValueAsJSON(sb, padding, indent + "  ");
    		sb.append("\n" + indent + "  ]");
    		
        	sb.append(",\n");
        }
        
        Iterator<DmcAttribute> it = attributes.values().iterator();
        while(it.hasNext()){
        	DmcAttribute attr = it.next();
//        	if ( (attr.getName().equals("objectClass")) || (attr.getName().equals(_ocl))){
            if (attr.getName().equals(__objectClass.name)){
        		if (!it.hasNext()){
        			
        			// The object class is the last attribute, so get rid
        			// of the extraneous ,\n
        			sb.deleteCharAt(sb.length()-1);
        			sb.deleteCharAt(sb.length()-1);
           		}
        		continue;
        	}

        	attr.toJSON(sb, padding, indent + "  ");
        	
            if (it.hasNext()){
            	sb.append(",\n");
            }
        }
   
        sb.append("\n" + indent + "}");

	}
	
	public String toCompactJSON(){
		StringBuffer sb = new StringBuffer();
		toCompactJSON(sb);
		return(sb.toString());
	}
	
	@SuppressWarnings("unchecked")
	public void toCompactJSON(StringBuffer sb){
        sb.append("{");
        
        // We attempt to dump the object class information first. This
        // isn't guaranteed when we receive a JSON object parsing, but
        // we do it here so that it's obvious what type of object you're
        // dealing with.
        DmcAttribute oc = get(__objectClass.id);
//        if (oc == null)
//        	oc = get(_ocl);
        
        if (oc != null){
    		sb.append("\"objectClass\":[");
    		oc.formatValueAsCompactJSON(sb);
    		sb.append("]");
    		
        	sb.append(",");
        }
        
        Iterator<DmcAttribute> it = attributes.values().iterator();
        while(it.hasNext()){
        	DmcAttribute attr = it.next();
//        	if ( (attr.getName().equals("objectClass")) || (attr.getName().equals(_ocl))){
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

	}
	
	
	
	/**
	 * A convenience method to display the class information for an object.
	 * @param sb The buffer we append to.
	 */
//	@SuppressWarnings("unchecked")
	private void appendClassNames(StringBuffer sb){
//		DmcTypeNamedObjectREF classes = (DmcTypeNamedObjectREF) this.get("ocl");
//		
//		// Dump the construction class and any auxiliary classes
//		if (classes != null){
//			Iterator<DmcNamedObjectIF> cls = classes.getMV();
//			while(cls.hasNext()){
//				DmcNamedObjectIF obj = cls.next();
//				sb.append(obj.getObjectName());
//				if (cls.hasNext())
//					sb.append(" ");
//			}
//			sb.append("\n");
//		}
		
//		DmcTypeString classes = (DmcTypeString) this.get(__objectClass.id);
		DmcTypeClassDefinitionREF classes = (DmcTypeClassDefinitionREF) this.get(__objectClass.id);
		
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
//		return(attributes.keySet().iterator());
		return(names);
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
	
	/**
	 * @return The attributes that comprise this object. USE THIS WITH CAUTION!
	 */
	@SuppressWarnings("unchecked")
	public Map<Integer,DmcAttribute> getAttributes(){
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
				
				if (attr.sv != null){
					DmcNamedObjectREF ref = (DmcNamedObjectREF) attr.sv;
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
				if (attr.mv != null){
					ArrayList<DmcNamedObjectREF> refs = reference.getObjectReferences();
					for(DmcNamedObjectREF ref : refs){
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
		
		// 
		if (errors != null)
			throw(errors);
	}
	
	/**
	 * This method is overloaded by derived DMO classes to return the core object of the right type.
	 * @return An empty DmcObject of the derived type.
	 */
	public DmcObject getOneOfMe(){
		DmcObject rc = new DmcObject();
		// TODO: SERIALIZATION
//		rc.idToAttrInfo = idToAttrInfo;
//		rc.stringToAttrInfo = stringToAttrInfo;
		return(rc);
	}
//	abstract public DmcObject getOneOfMe();
	
	@SuppressWarnings("unchecked")
	public DmcObject clone(){
		// Get a derived object of the right type
		DmcObject rc = getOneOfMe();
		
		try {
			DmcAttribute ocl = get(__objectClass.id);
			if (ocl != null){
				rc.add(__objectClass, ocl.clone());
			}
			for(DmcAttribute attr : attributes.values()){
				DmcAttribute copy = attr.clone();
				rc.add(copy.getName(), copy);
			}
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		
		Iterator<Modification> modifiers = mods.getMV();
		while(modifiers.hasNext()){
			Modification mod = modifiers.next();
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
						
						// _ocl is gone, so we shouldn't need this now
//						// And a final complexity associated with the objectClass - if this
//						// is the objectClass attribute we also update the _ocl attribute
//						if (mod.getAttributeName().equals(__objectClass.name)){
//							addAux(ref.getObjectName());
//						}
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
		
						// _ocl is gone, so we shouldn't need this now
//						// And a final complexity associated with the objectClass - if this
//						// is the objectClass attribute we also update the _ocl attribute
//						if (mod.getAttributeName().equals(__objectClass.name)){
//							removeAux(ref.getObjectName());
//						}

					}
					else
						existing.del(mod.getAttribute().getMVnth(0));
				}
				break;
			case SET:
				if (existing == null)
					set(mod.getAttributeName(),mod.getAttribute());
				else{
					Object value = mod.getAttribute().sv;
					
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
						existing.set(mod.getAttribute().sv);
				}
				break;
			case REM:
				rem(mod.getAttributeName());
				break;
			}
		}
	}
	
    // TODO: SERIALIZATION
    /**
     * A serialized object will be structured as follows:
     * [UTF] (this construction class name)
     * @param dos
     * @throws IOException 
     * @throws DmcValueException  
     */
    @SuppressWarnings("unchecked")
    public void serializeIt(DmcOutputStreamIF dos) throws Exception, DmcValueException {
    	   // WRITE: the class name
    	   dos.writeUTF(this.getConstructionClassName());
    	
    	   // WRITE: the number of attributes
    	   // NOTE: We reduce the count by 1 because don't write the object class at the moment
//    	   dos.writeShort(attributes.size()-1);
    	
    	   // Write each of the attributes
    	   for(DmcAttribute attr: attributes.values()){
//    		   if (attr.getName().equals(_ocl))
//    			   continue;
    		       		   
    		   attr.serializeIt(dos);
    	   }
    }

}
