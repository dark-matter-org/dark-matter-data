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

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;

/**
 * The Dark Matter Core Object is the basic entity on which all aspects of the 
 * Dark Matter Data framework are based. 
 *
 */
@SuppressWarnings("serial")
public class DmcObject implements Serializable {
	
	// This is the handle to the container object that wraps this object. This
	// may or may not have a value, depending on the usage context. Also,
	// the behaviour of this object is completely up to whoever implements it.
	// This handle facilitates hooks for things like object change notification.
	transient DmcContainerIF container;

	// At this level, all we have is a simple collection of attributes.
	@SuppressWarnings("unchecked")
	protected Map<String,DmcAttribute>	attributes;
	
	@SuppressWarnings("unchecked")
	public DmcObject(){
		attributes = new TreeMap<String, DmcAttribute>();
	}

	/**
	 * This method sets the value of a single-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param <T>      	The class 
	 * @param attrname  The attribute name.
	 * @param attrclass The derived class of DmcAttribute used to store this attribute value.
	 * @param value     The value to be stored.
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute> T set(String attrname, Class<T> dmcattrclass, Object value) throws InstantiationException, IllegalAccessException, DmcValueException{
		DmcAttribute attr = (DmcAttribute) attributes.get(attrname);
		
		if (attr == null){
			attr = (DmcAttribute) dmcattrclass.newInstance();
			attr.setName(attrname);
			attributes.put(attrname, attr);
		}
		
		if (container == null){
			attr.set(value);
		}
		else{
			if (container.getListenerManager() == null)
				attr.set(value);
			else{
		    	/**
		    	 * TODO implement attribute change listener hooks
		    	 */
			}
		}
		
		return (T) (attr);
	}
	
	/**
	 * Returns the holder of value for the named attribute. Use this with caution!
	 * This is generally used only by derived warpper classes of DmcObject.
	 * @param name The name of the attribute.
	 * @return DmcAttribute
	 */
	@SuppressWarnings("unchecked")
	public DmcAttribute get(String name){
		return(attributes.get(name));
	}
	
	/**
	 * This method adds a value to a multi-valued attribute. If you had previously set the
	 * same attribute to a different type, you get a class cast exception.
	 * @param <T>      	The class 
	 * @param attrname  The attribute name.
	 * @param attrclass The derived class of DmcAttribute used to store this attribute value.
	 * @param value     The value to be stored.
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute> T add(String attrname, Class<T> dmcattrclass, Object value) throws InstantiationException, IllegalAccessException, DmcValueException{
		DmcAttribute attr = (DmcAttribute) attributes.get(attrname);
		
		if (attr == null){
			attr = (DmcAttribute) dmcattrclass.newInstance();
			attr.setName(attrname);
			attributes.put(attrname, attr);
		}
		
		if (container == null){
			attr.add(value);
		}
		else{
			if (container.getListenerManager() == null)
				attr.add(value);
			else{
		    	/**
		    	 * TODO implement attribute change listener hooks
		    	 */
			}
		}

		return (T) (attr);
	}
	
	/**
	 * This method deletes a value from a multi-valued attribute.
	 * @param <T>      	The class 
	 * @param attrname  The attribute name.
	 * @param attrclass The derived class of DmcAttribute used to store this attribute value.
	 * @param value     The value to be stored.
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute> T del(String attrname, Object value) throws InstantiationException, IllegalAccessException, DmcValueException{
		DmcAttribute attr = (DmcAttribute) attributes.get(attrname);
		
		if (attr == null){
			return(null);
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

		return (T) (attr);
	}
	
	/**
	 * Removes the specified attribute from the object.
	 * @param an The attribute name.
	 */
	@SuppressWarnings("unchecked")
	public <T extends DmcAttribute> T rem(String an){
		T attr = (T) attributes.remove(an);
		
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
			if (!attr.getName().equals("objectClass"))
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
			if (!attr.getName().equals("objectClass"))
				attr.toOIF(sb,padding);
		}

		return(sb.toString());
	}
	
	
	
	/**
	 * A convenience method to display the class information for an object.
	 * @param sb The buffer we append to.
	 */
	@SuppressWarnings("unchecked")
	private void appendClassNames(StringBuffer sb){
		DmcTypeNamedObjectREF classes = (DmcTypeNamedObjectREF) this.get("objectClass");
		
		// Dump the construction class and any auxiliary classes
		if (classes != null){
			Iterator<DmcNamedObjectIF> cls = classes.getMV();
			while(cls.hasNext()){
				DmcNamedObjectIF obj = cls.next();
				sb.append(obj.getName());
				if (cls.hasNext())
					sb.append(" ");
			}
			sb.append("\n");
		}

	}
	
	/**
	 * @return An iterator over the names of this object's attributes.
	 */
	public Iterator<String> getAttributeNames(){
		return(attributes.keySet().iterator());
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
	
	
	
}
