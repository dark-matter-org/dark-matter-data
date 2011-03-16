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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//import org.dmd.util.exceptions.DebugInfo;

/**
 * The DmcAttribute is an abstract base class from which all attribute values
 * associated with Dark Matter Core Objects must be derived. The class is parameterized
 * to allow for easy "wrapping" of existing Java types. The only caveat for the
 * types being wrapped is that they must be serializable. You need only implement the
 * typeCheck() function in your derived class and you're good to go.
 * <P>
 * The DmcAttribute merely provides a mechanism for constructing name/value pairs
 * for single and multi-valued attributes. There are three primary interfaces on
 * a DmcAttribute: set() - sets the value of a single-valued attribute - add(), del() -
 * add and delete values from multi-valued attributes. To completely remove
 * an attribute value from an object, the DmcObject.rem() function is called.
 * <P>
 * The DmcAttribute and it's derivatives are generally not used directly; their 
 * functionality is usually hidden by a wrapper class designed for use in the context
 * where the data payload of a DmcObject is being used. At the wrapper level,
 * you will continue to use the underlying Java types that comprise the class
 * in question.
 */
@SuppressWarnings("serial")
abstract public class DmcAttribute<E> implements Cloneable, Serializable, Comparable<String> {

	// The name of this attribute. Again, at this level, it doesn't matter what
	// this is and there is no concept of object validity.
	private String 				name;
	
	// The identifier of this attribute. This is uniquely defined in schema and dumped
	// as part of the DmcAttributeInfo that's statically created for all Dark Matter Objects.
	private Integer				ID;
	
	// Additional data used by wrapper classes. This data is local to whatever context
	// in which the attribute is used and thus IS NOT SERIALIZED.
	transient private Object 	auxData;
	
	// Holder for single valued attributes
	protected E					sv;
	
	// Holder for multi-valued attributes
	protected ArrayList<E>		mv;
	
	// Holder for mapped attributes, either sorted or unsorted
	protected Map<Object,E>		map;
	
	// Holder for sets of attributes, either sorted or unsorted
	protected Set<E>			set;
	
//	// Holder for hashmapped attributes 
//	protected Map<Object,E>		hm;
//	
//	// Holder for sorted/mapped attributes
//	protected TreeMap<Object,E>	tm;
//	
//	// Holder for attributes stored in HashSets
//	protected HashSet<E>		hs;
//	
//	// Holder for attributes stored in TreeSets
//	protected TreeSet<E>		ts;
	
	// Part of the convenience mechanism used with tracking of modifications at
	// the DmcAttribute level. We hang on to the last value added to or deleted from
	// a multi-valued attribute so that it can be used in creating the Modification.
	transient Object			lastValue;
	
	// This information may be initialized when we're created, depending on the circumstances.
	// When used in the context of GWT serialized objects, this information must be re-initialized
	// when DMOs arrive on the client side. That's because we only serialize the ID.
	transient protected DmcAttributeInfo	attrInfo;
	
	/**
	 * Constructs a new attribute value holder.
	 */
	public DmcAttribute(){
		sv 	= null;
		mv 	= null;
		map	= null;
		set	= null;
//		hm = null;
//		tm = null;
//		hs = null;
//		ts = null;
	}
		
	/**
	 * Constructs a new attribute value holder.
	 */
	public DmcAttribute(DmcAttributeInfo ai){
		sv 			= null;
		mv 			= null;
		map			= null;
		set			= null;
//		hm 			= null;
//		tm 			= null;
		attrInfo	= ai;
		name		= ai.name;
		ID			= ai.id;
	}
	
	/**
	 * @return The attribute info if it has been set.
	 */
	public DmcAttributeInfo getAttributeInfo(){
		return(attrInfo);
	}
	
	/**
	 * Sets the attribute info associated with this attribute. You should only call this
	 * method if you know what you're doing! It's primarily used by the deserialization
	 * mechanisms.
	 * @param ai The attribute information.
	 */
	public void setAttributeInfo(DmcAttributeInfo ai){
		attrInfo 	= ai;
		name 		= ai.name;
		ID 			= ai.id;
	}
	
	/**
	 * Returns the unique attribute ID.E
	 * @return The ID.
	 */
	public Integer getID(){
		return(ID);
	}
	
	/**
	 * Sets auxiliary data on this attribute. The content of any auxiliary data is
	 * based on the usage context and is transient from a serialization perspective.
	 * @param obj Your auxiliary data.
	 */
	public void setAuxData(Object obj){
		auxData = obj;
	}
	
	/**
	 * Returns any auxiliary data previously set on the attribute.
	 * @return Your auxiliary data.
	 */
	public Object getAuxData(){
		return(auxData);
	}
	
	/**
	 * Sets the name of this attribute. This is generally only meant for use by generated code.
	 * If you're not extending the Dark Matter framework in some way, USE WITH CAUTION!
	 * @param name The name of the attribute.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return The name of this attribute.
	 */
	public String getName(){
		return(name);
	}
	
    /**
     * Compares the name of this attribute to the specified String for order.
     */
    public int compareTo(String o){
        return(getName().compareTo(o));
    }

    /**
     * Returns this attribute in Object Instance Format (OIF) which is basically the attribute
     * name followed by the string representation of the value of the attribute. For multi-valued
     * attributes, each value is dumped on a separate line, prepended with its name.
     */
	public void toOIF(StringBuffer sb) {
//		if (attrInfo == null)
//        	throw(new IllegalStateException("Attribute info is not available on this attribute."));
//
//		switch(attrInfo.valueType){
//		case SINGLE:
//			if (sv != null){
//				if (sv instanceof DmcNamedObjectIF)
//					sb.append(name + " " + ((DmcNamedObjectIF)sv).getObjectName() + "\n");
//				else
//					sb.append(name + " " + sv + "\n");
//			}
//			break;
//		case MULTI:
//			if (mv != null){
//				for(E value : mv){
//					if (value instanceof DmcNamedObjectIF)
//						sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//					else
//						sb.append(name + " " + value + "\n");
//				}
//			}
//			break;
//		case HASHMAPPED:
//		case SORTMAPPED:
//			if (map != null){
//				for(E value : map.values()){
//					if (value instanceof DmcNamedObjectIF)
//						sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//					else
//						sb.append(name + " " + value + "\n");				
//				}
//			}
//			break;
//		case HASHSET:
//		case TREESET:
//			if (set != null){
//				Iterator<E> it = set.iterator();
//				while(it.hasNext()){
//					E value = it.next();
//					if (value instanceof DmcNamedObjectIF)
//						sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//					else
//						sb.append(name + " " + value + "\n");				
//				}
//			}
//			break;
//		}
		
		if (sv != null){
			if (sv instanceof DmcNamedObjectIF)
				sb.append(name + " " + ((DmcNamedObjectIF)sv).getObjectName() + "\n");
			else
				sb.append(name + " " + sv + "\n");
		}
		if (mv != null){
			for(E value : mv){
				if (value instanceof DmcNamedObjectIF)
					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
				else
					sb.append(name + " " + value + "\n");
			}
		}
		if (map != null){
			for(E value : map.values()){
				if (value instanceof DmcNamedObjectIF)
					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
				else
					sb.append(name + " " + value + "\n");				
			}
		}
		if (set != null){
			Iterator<E> it = set.iterator();
			while(it.hasNext()){
				E value = it.next();
				if (value instanceof DmcNamedObjectIF)
					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
				else
					sb.append(name + " " + value + "\n");				
			}
		}
		


//		if (sv != null){
//			if (sv instanceof DmcNamedObjectIF)
//				sb.append(name + " " + ((DmcNamedObjectIF)sv).getObjectName() + "\n");
//			else
//				sb.append(name + " " + sv + "\n");
//		}
//		if (mv != null){
//			for(E value : mv){
//				if (value instanceof DmcNamedObjectIF)
//					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//				else
//					sb.append(name + " " + value + "\n");
//			}
//		}
//		if (hm != null){
//			for(E value : hm.values()){
//				if (value instanceof DmcNamedObjectIF)
//					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//				else
//					sb.append(name + " " + value + "\n");				
//			}
//		}
//		if (tm != null){
//			for(E value : tm.values()){
//				if (value instanceof DmcNamedObjectIF)
//					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//				else
//					sb.append(name + " " + value + "\n");				
//			}
//		}
	}
	
    /**
     * Returns this attribute in Object Instance Format (OIF) which is basically the attribute
     * name followed by the string representation of the value of the attribute. For multi-valued
     * attributes, each value is dumped on a separate line, prepended with its name.
	 * @param sb The string buffer to which we append the attribute values
	 * @param padding The amount of padding to provide for the "left-justified" attribute name.  
	 */
	public void toOIF(StringBuffer sb, int padding) {
//		if (attrInfo == null)
//        	throw(new IllegalStateException("Attribute info is not available on this attribute."));

//		switch(attrInfo.valueType){
//		case SINGLE:
//			if (sv != null){
//				addNameWithPadding(name,padding,sb);
//				if (sv instanceof DmcNamedObjectIF)
//					sb.append(name + " " + ((DmcNamedObjectIF)sv).getObjectName() + "\n");
//				else
//					sb.append(name + " " + sv + "\n");
//			}
//			break;
//		case MULTI:
//			if (mv != null){
//				for(E value : mv){
//					addNameWithPadding(name,padding,sb);
//					if (value instanceof DmcNamedObjectIF)
//						sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//					else
//						sb.append(name + " " + value + "\n");
//				}
//			}
//			break;
//		case HASHMAPPED:
//		case SORTMAPPED:
//			if (map != null){
//				for(E value : map.values()){
//					addNameWithPadding(name,padding,sb);
//					if (value instanceof DmcNamedObjectIF)
//						sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//					else
//						sb.append(name + " " + value + "\n");				
//				}
//			}
//			break;
//		case HASHSET:
//		case TREESET:
//			if (set != null){
//				Iterator<E> it = set.iterator();
//				while(it.hasNext()){
//					addNameWithPadding(name,padding,sb);
//					E value = it.next();
//					if (value instanceof DmcNamedObjectIF)
//						sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//					else
//						sb.append(name + " " + value + "\n");				
//				}
//			}
//			break;
//		}

		if (sv != null){
			addNameWithPadding(name,padding,sb);
			if (sv instanceof DmcNamedObjectIF)
				sb.append(name + " " + ((DmcNamedObjectIF)sv).getObjectName() + "\n");
			else
				sb.append(name + " " + sv + "\n");
		}
		if (mv != null){
			for(E value : mv){
				addNameWithPadding(name,padding,sb);
				if (value instanceof DmcNamedObjectIF)
					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
				else
					sb.append(name + " " + value + "\n");
			}
		}
		if (map != null){
			for(E value : map.values()){
				addNameWithPadding(name,padding,sb);
				if (value instanceof DmcNamedObjectIF)
					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
				else
					sb.append(name + " " + value + "\n");				
			}
		}
		if (set != null){
			Iterator<E> it = set.iterator();
			while(it.hasNext()){
				addNameWithPadding(name,padding,sb);
				E value = it.next();
				if (value instanceof DmcNamedObjectIF)
					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
				else
					sb.append(name + " " + value + "\n");				
			}
		}


//		if (sv != null){
//			addNameWithPadding(name,padding,sb);
//			if (sv instanceof DmcNamedObjectIF)
//				sb.append(" " + ((DmcNamedObjectIF)sv).getObjectName() + "\n");
//			else
//				sb.append(" " + sv + "\n");
//		}
//		if (mv != null){
//			for(E value : mv){
//				addNameWithPadding(name,padding,sb);
//				if (value instanceof DmcNamedObjectIF)
//					sb.append(" " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//				else
//					sb.append(" " + value + "\n");
//			}
//		}
//		if (hm != null){
//			for(E value : hm.values()){
//				addNameWithPadding(name,padding,sb);
//				if (value instanceof DmcNamedObjectIF)
//					sb.append(" " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//				else
//					sb.append(" " + value + "\n");				
//			}
//		}
//		if (tm != null){
//			for(E value : tm.values()){
//				addNameWithPadding(name,padding,sb);
//				if (value instanceof DmcNamedObjectIF)
//					sb.append(" " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
//				else
//					sb.append(" " + value + "\n");				
//			}
//		}

	}
	
	/**
	 * Adds the attribute name and pads it with the required number of spaces. If the name is
	 * longer than the padding, we do nothing.
	 * @param attrName The name of the attribute.
	 * @param padding  The amount of padding.
	 * @param sb       The buffer where we're building the output.
	 */
	private void addNameWithPadding(String attrName, int padding, StringBuffer sb){
		sb.append(attrName);
		if (attrName.length() < padding){
			for(int i=attrName.length(); i<padding; i++)
				sb.append(" ");
		}
	}
	
	/**
	 * Appends this attribute to the string buffer with the appropriate
	 * indent and padding of the attribute name.
	 * @param sb      The string buffer being populated.
	 * @param padding The width of the area in which the name will be displayed.
	 * @param indent  The padding in front of the attribute name.
	 */
	void toJSON(StringBuffer sb, int padding, String indent){
    	sb.append(indent);
    	addJSONNameWithPadding(this,sb,padding);
    	
    	if (sv == null){
    		sb.append("[\n");
    		formatValueAsJSON(sb, padding, indent + "  ");
    		sb.append("\n" + indent + "]");
    	}
    	else
    		formatValueAsJSON(sb, padding, indent + "  ");
    }

    void toCompactJSON(StringBuffer sb){
    	sb.append("\"" + name + "\":");
    	
    	if (sv == null){
    		sb.append("[");
    		formatValueAsCompactJSON(sb);
    		sb.append("]");
    	}
    	else
    		formatValueAsCompactJSON(sb);
    	
    }
    
    /**
     * This method may be overloaded to properly format attributes that refer directly
     * to DmcObjects or that are object references.
     */
    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
    	if (mv == null){
    		sb.append("\"" + sv.toString() + "\"");
    	}
    	else {
    		int max = mv.size()- 1;
    		for(int i=0; i<mv.size(); i++){
        		sb.append(indent + "  " + "\"" + mv.get(i).toString() + "\"");
        		if (i < max)
        			sb.append(", \n");
    		}
    	}
    }
    
    /**
     * This method may be overloaded to properly format attributes that refer directly
     * to DmcObjects or that are object references.
     */
    protected void formatValueAsCompactJSON(StringBuffer sb) {
    	if (mv == null){
    		sb.append("\"" + sv.toString() + "\"");
    	}
    	else {
    		int max = mv.size()- 1;
    		for(int i=0; i<mv.size(); i++){
        		sb.append("\"" + mv.get(i).toString() + "\"");
        		if (i < max)
        			sb.append(",");
    		}
    	}
    }
    
	/**
	 * Adds the attribute name and pads it with the required number of spaces. If the name is
	 * longer than the padding, we do nothing.
	 * @param attrName The name of the attribute.
	 * @param padding  The amount of padding.
	 * @param sb       The buffer where we're building the output.
	 */
	private void addJSONNameWithPadding(DmcAttribute<?> attr, StringBuffer sb, int padding){
		sb.append("\"" + attr.getName() + "\": ");
		
		// If this is a multivalued attribute, don't apply the padding. This will leave
		// the starting bracket just after the attribute name.
		if (attr.sv == null)
			return;
		
		if (attr.getName().length() < padding){
			for(int i=attr.getName().length(); i<padding; i++)
				sb.append(" ");
		}
	}
	
	/**
	 * Sets the value of a single-valued attribute.
	 * @param value The value to be set
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	public void set(Object value) throws DmcValueException {
		if (value == null)
			return;
		
		lastValue = value;
		
        switch(attrInfo.valueType){
        case SINGLE:
            sv = typeCheck(value);
            break;
        case MULTI:
        	throw(new IllegalStateException("The set() method cannot be called on MULTI attributes."));
        case HASHMAPPED:
        case SORTMAPPED:
        	throw(new IllegalStateException("The set() method cannot be called on HASHMAPPED/SORTMAPPED attributes."));
        case HASHSET:
        case TREESET:
        	throw(new IllegalStateException("The set() method cannot be called on HASHSET/TREESET attributes."));
        }

//      sv = typeCheck(value);
//		mv = null;		
	}
	
	/**
	 * Returns the single-valued attribute value.
	 * @return E
	 */
	public E getSV(){
		return(sv);
	}
	
	/**
	 * Adds the specified value to a multi-valued attribute. NOTE: multi-valued attributes DON'T
	 * allow duplicate values.
	 * @param value The value to be added
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	public void add(Object value) throws DmcValueException {
		if (value == null)
			return;
		
		lastValue = value;
		E checkedVal = typeCheck(value);;
		
        switch(attrInfo.valueType){
        case SINGLE:
            if (sv != null)
            	throw(new IllegalStateException("The add() method is not valid single-valued attribute:" + getName()));
            break;
        case MULTI:
            if (mv == null)
            	mv = new ArrayList<E>();
            mv.add(checkedVal);
            break;
        case HASHMAPPED:
        case SORTMAPPED:
        	throw(new IllegalStateException("The add() method should be overloaded by the DmcHashedAttribute class."));
        case HASHSET:
            if (set == null)
            	set = new HashSet<E>();
            set.add(checkedVal);
        	break;
        case TREESET:
            if (set == null)
            	set = new TreeSet<E>();
            set.add(checkedVal);
            break;
        }

//		sv = null;
//		if (mv == null)
//			mv = new ArrayList<E>();
//		
//		E checkedVal = typeCheck(value);
//		
//		if (!mv.contains(checkedVal))
//			mv.add(typeCheck(checkedVal));
	}
	
	/**
	 * Derived classes must overload this method to determine if the value passed
	 * in conforms with their type criteria.
	 * @param value
	 * @return E
	 * @throws DmcValueException
	 */
	abstract protected E typeCheck(Object value) throws DmcValueException;
	
	/**
	 * Derived classes should return a new, empty version of themselves.
	 * @return
	 */
	abstract protected DmcAttribute<?> getOneOfMe();
	
	/**
	 * Derived classes should make a deep clone of themselves.
	 * @param original
	 * @return A deep clone of this object.
	 */
	abstract protected E cloneValue(E original);
	
	/**
	 * Removes a value from a multi-valued attribute.
	 * @param v The value to be removed.
	 */
	public void del(Object v){
		if (v == null)
			return;
		
		lastValue = v;
		
		E val = null;
		try {
			val = typeCheck(v);
		} catch (DmcValueException e) {
			throw(new IllegalStateException(e.getMessage(), e));
		}
		
        switch(attrInfo.valueType){
        case SINGLE:
            if (sv != null)
            	throw(new IllegalStateException("The del() method cannot be called on SINGLE attributes."));
        case MULTI:
            if (mv == null)
            	throw(new IllegalStateException("Tried to remove a value from a null MULTI attribute"));
            mv.remove(val);
            break;
        case HASHMAPPED:
        case SORTMAPPED:
        	throw(new IllegalStateException("The del() method should be overloaded by the DmcHashedAttribute class."));
        case HASHSET:
        case TREESET:
            if (set == null)
            	throw(new IllegalStateException("Tried to remove a value from a null HASHSET/TREESET attribute."));
            set.remove(val);
            break;
        }

//        if (mv == null)
//			return;
//		
//		try {
//			E val = typeCheck(v);
//			
//			mv.remove(val);
//		} catch (DmcValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	/**
	 * Returns an Iterator over a multi-valued attribute's values.
	 * @return Iterator<E>
	 */
	public Iterator<E> getMV(){
		Iterator<E> rc = null;
		
//		switch(attrInfo.valueType){
//		case SINGLE:
//        	throw(new IllegalStateException("The getMV() method cannot be called on SINGLE attributes."));
//		case MULTI:
//			if (mv != null)
//				rc = mv.iterator();
//			break;
//		case HASHMAPPED:
//		case SORTMAPPED:
//			if (map != null)
//				map.values().iterator();
//			break;
//		case HASHSET:
//		case TREESET:
//			if (set != null)
//				set.iterator();
//			break;
//		}
		
		if (mv != null)
			rc = mv.iterator();
		else if (map != null)
			rc = map.values().iterator();
		else if (set != null)
			rc = set.iterator();
		
		return(rc);
	}

	/**
	 * For a multi-valued attribute, this returns the number of values in the attribute.
	 * If the attribute is single-valued, 0 is returned.
	 * @return the number of values.
	 */
	public int getMVSize(){
		int rc = 0;

		switch(attrInfo.valueType){
		case SINGLE:
        	throw(new IllegalStateException("The getMVSize() method cannot be called on SINGLE attributes."));
		case MULTI:
			if (mv != null)
				rc = mv.size();
			break;
		case HASHMAPPED:
		case SORTMAPPED:
			if (map != null)
				map.size();
			break;
		case HASHSET:
		case TREESET:
			if (set != null)
				set.size();
			break;
		}

		return(rc);
	}
	
	/**
	 * A convenience function to return the nth value from a multi-valued attribute.
	 * @param index The value index.
	 * @return E
	 */
	public E getMVnth(int index){
		if (mv != null)
			return(mv.get(index));
		return(null);
	}
	
	/**
	 * Returns the value associated with the specified key for HASHMAPPED or SORTMAPPED
	 * attributes. This method is overloaded in DmcHashedAttribute - it returns null at this level.
	 * @param key
	 * @return
	 */
	public E getByKey(Object key){
		E rc = null;
        switch(attrInfo.valueType){
        case SINGLE:
        	throw(new IllegalStateException("The getByKey() method cannot be called on SINGLE attributes."));
        case MULTI:
            break;
        case HASHMAPPED:
        case SORTMAPPED:
            if (map != null)
            	rc = map.get(key);
            break;
        case HASHSET:
        case TREESET:
        	throw(new IllegalStateException("The getByKey() method cannot be called on HASHSET/TREESET attributes."));
        }
        
        return(rc);
	}
	
	/**
	 * Returns the string representation of this attribute.
	 */
	public String toString(){
		return(getString());
	}
	
	/**
	 * This method must be overloaded to return the appropriate String representation of the value
	 * for this type of attribute.
	 * @return The String form of the value.
	 */
	abstract public String getString();
	
//	abstract public DmcAttribute<E> getNewInstance();

	/**
	 * If we have a multi-valued attribute, we checked to see it it contains the specified value.
	 * @param obj The object we're looking for.
	 * @return true if the object is contained by the attribute.
	 */
	public boolean contains(Object obj){
		boolean rc = false;
		
        switch(attrInfo.valueType){
        case SINGLE:
        	throw(new IllegalStateException("The contains() method cannot be called on SINGLE attributes."));
        case MULTI:
            if (mv != null)
            	rc = mv.contains(obj);
            break;
        case HASHMAPPED:
        case SORTMAPPED:
            if (map != null)
            	rc = map.containsValue(obj);
            break;
        case HASHSET:
        case TREESET:
            if (set != null)
            	rc = set.contains(obj);
            break;
        }

        return(rc);
//        if (mv == null)
//			return(false);
//		
//		return(mv.contains(obj));
	}
	
	/**
	 * This is a convenience function for use with the modification tracking. It gives
	 * us the last value added to a multi-value attribute.
	 * @return The last value added or deleted.
	 */
	public Object getLastMVValue(){
		return(lastValue);
//		if (mv != null){
//			if (mv.size() >= 1){
//				E lastVal = mv.get(mv.size()-1);
//				return(lastVal);
//			}
//		}
//		return(null);
	}
	
    @SuppressWarnings("unchecked")
	public DmcAttribute clone(){
    	DmcAttribute rc = this.getOneOfMe();
    	rc.attrInfo = attrInfo;
    	
        switch(attrInfo.valueType){
        case SINGLE:
            if (sv != null)
            	rc.sv = this.cloneValue(sv);
            break;
        case MULTI:
            if (mv != null){
                rc.mv = new ArrayList<E>();
	            for(E val : mv){
	                rc.mv.add(this.cloneValue(val));
	            }
            }
            break;
        case HASHMAPPED:
            if (map != null){
            	// We should never get here - this is overloaded by the DmcHashedAttribute
            	throw(new IllegalStateException("The clone() operation for HASHMAPPED values is only supported on DmcHashedAttributes"));
            }
            break;
        case SORTMAPPED:
            if (map != null){
            	// We should never get here - this is overloaded by the DmcHashedAttribute
            	throw(new IllegalStateException("The clone() operation for SORTMAPPED values is only supported on DmcHashedAttributes"));
            }
            break;
        case HASHSET:
            if (set != null){
            	
            }
            break;
        case TREESET:
            if (set != null){
            	
            }
            break;
        }

//        if (mv == null){
//            rc.sv = this.cloneValue(sv);
//        }
//        else{
//            rc.mv = new ArrayList<E>();
//            for(E val : mv){
//                rc.mv.add(this.cloneValue(val));
//            }
//        }
        return(rc);
    }
    
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
    // TODO: SERIALIZATION
    abstract public void serializeType(DmcOutputStreamIF dos) throws Exception;

    abstract public void deserializeSV(DmcInputStreamIF dis) throws Exception;

    abstract public void deserializeMV(DmcInputStreamIF dis) throws Exception;

    /**
     * Serializes this attribute value.
     * @param ai The attribute information.
     * @param dos The stream to which we're serialized.
     * @throws IOException
     * @throws DmcValueException 
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception, DmcValueException {
    	if (attrInfo == null)
        	throw(new IllegalStateException("This attribute cannot be serialized because its DmcAttributeInfo is not available."));
    	
        switch(attrInfo.valueType){
        case SINGLE:
            break;
        case MULTI:
            if (mv != null)
            	dos.writeShort(mv.size());
            break;
        case HASHMAPPED:
        case SORTMAPPED:
            if (map != null)
            	dos.writeShort(map.size());
            break;
        case HASHSET:
        case TREESET:
            if (set != null)
            	dos.writeShort(set.size());
            break;
        }

//        // WRITE: the attribute id
//    	dos.writeShort(attrInfo.id);
////    	DebugInfo.debug("    id: " + attrInfo.id);
//    	
//    	// If we're multi-valued, write the number of values
//    	if (mv != null){
////        	DebugInfo.debug("    mv: " + mv.size());
//    		dos.writeShort(mv.size());
//    	}
//    	else if (hm != null){
////        	DebugInfo.debug("    hm: " + hm.size());
//    		dos.writeShort(hm.size());
//    	}
//    	else if (tm != null){
////        	DebugInfo.debug("    tm: " + tm.size());
//    		dos.writeShort(tm.size());
//    	}
    	
    	serializeType(dos);
    }
    
    /**
     * This method will deserialize this attribute from an input stream. This method
     * is overridden in DmcHashedAttribute to handle hashed attributes.
     * @param dis The input stream.
     * @throws Exception if you've tried to store a non-DmcHashedAttribute derivative as HASHMAPPED or SORTMAPPED.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
    	// At this point, the DmwWrapperDMO has instantiated us based on the attribute info.
    	// If we're multivalued, the next thing we need to do is read our length - otherwise,
    	// we just call on our derived class to read itself from the stream
    	switch(attrInfo.valueType){
    	case SINGLE:
    		deserializeSV(dis);
    		break;
    	case MULTI:
    		deserializeMV(dis);
    		break;
    	case HASHMAPPED:
    	case SORTMAPPED:
    		throw(new IllegalStateException("The " + this.getClass().getName() + " class must be derived from DmcHashedAttribute in order to store HASHMAPPED or SORTMAPPED values."));
    	case HASHSET:
    	case TREESET:
    		throw(new IllegalStateException("SET deserialization not implemented yet"));
    	}
    }
    
}
