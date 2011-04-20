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
import java.util.Iterator;

//import org.dmd.util.exceptions.DebugInfo;

/**
 * The DmcAttribute is an abstract base class from which all attribute values
 * associated with Dark Matter Core Objects must be derived. The class is parameterized
 * to allow for easy "wrapping" of existing Java types. The only caveat for the
 * types being wrapped is that they must be marked as Serializable and they
 * must have an empty signature default constructor; this is required to allow
 * for use of GWT serialization.
 * <P>
 * To define a new type you need two parts, the VALUE class (which is supplied as
 * the VALUE parameter to this class) and, by convention, a DmcType[VALUE] class
 * that is derived from DmcAttribute. The DmcType[VALUE] class must implement
 * four functions: typeCheck(), cloneValue(), serializeValue() and deserializeValue().
 * The DmcType[VALUE] class is abstract.
 * <P>
 * The remainder of the functionality required is generated as part of the 
 * Dark Matter Object (DMO) generation process. This process results in VALUE specific
 * implementations of single-valued (SV), multi-valued(MV), mapped (MAP for HashMap
 * and TreeMap)and set (SET for HashSet and TreeSet) to be created in your
 * generated.types package for a particular schema. Each of these implementations
 * is derived from your DmcType[VALUE] class and overload the appropriate methods
 * defined in DmcAttribute. 
 * <P>
 * The DmcAttribute merely provides a mechanism for constructing ID/VALUE pairs
 * for single and multi-valued attributes. There are three primary modification 
 * interfaces on a DmcAttribute:
 * <ul>
 * <li> set() - sets the value of a single-valued attribute </li>
 * <li> add() - adds a value to a multi-valued attribute </li>
 * <li> del() - delets a value from a multi-valued attribute </li>
 * </ul>
 * To completely remove an attribute value from an object, the DmcObject.rem() function is called.
 * <P>
 * Retrieval of values is accomplished via:
 * <ul>
 * <li> getSV()    - which returns a single value</li>
 * <li> getMV()    - which returns an Iterator over multiple values</li>
 * <li> getByKey() - which returns a keyed value</li>
 * </ul>
 * The DmcAttribute and it's derivatives are generally not used directly; their 
 * functionality is hidden behind a generated DMO which provides typed interfaces
 * to access and manipulate attribute values.
 */
@SuppressWarnings("serial")
abstract public class DmcAttribute<VALUE> implements Cloneable, Serializable, Comparable<String> {

	// The identifier of this attribute. This is uniquely defined in schema and dumped
	// as part of the DmcAttributeInfo that's statically created for all Dark Matter Objects.
	protected Integer	ID;
			
	// This information may be initialized when we're created, depending on the circumstances.
	// When used in the context of GWT serialized objects, this information must be re-initialized
	// when DMOs arrive on the client side. That's because we only serialize the ID.
	transient protected DmcAttributeInfo attrInfo;
	
	/**
	 * Constructs a new attribute value holder.
	 */
	protected DmcAttribute(){
		ID			= -1;
		attrInfo	= null;
	}
		
	/**
	 * Constructs a new attribute value holder.
	 */
	protected DmcAttribute(DmcAttributeInfo ai){
		ID			= ai.id;
		attrInfo	= ai;
	}
		
	////////////////////////////////////////////////////////////////////////////////
	// Methods that actually do something at this level ;-)

	/**
	 * @return The attribute info if it has been set.
	 */
	public DmcAttributeInfo getAttributeInfo(){
		if (attrInfo == null)
			attrInfo = DmcOmni.instance().getInfo(ID);

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
	 * @return The name of this attribute.
	 */
	public String getName(){
		return(attrInfo.name);
	}
	
    /**
     * Compares the name of this attribute to the specified String for order.
     */
    public int compareTo(String o){
        return(getName().compareTo(o));
    }

	////////////////////////////////////////////////////////////////////////////////
	// Abstracts that should be overridden in your DmcType[VALUE] class

	/**
	 * Derived classes must overload this method to determine if the value passed
	 * in conforms with their type criteria.
	 * @param value
	 * @return E
	 * @throws DmcValueException
	 */
	abstract protected VALUE typeCheck(Object value) throws DmcValueException;
	
	/**
	 * This method must be overridden to clone whatever value is stored in this attribute.
	 * The concept of clone constructors was considered, but this doesn't work for 
	 * enumerated values.
	 * @param original
	 * @return A clone of the value.
	 */
	abstract protected VALUE cloneValue(VALUE original);
	
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * This method must be overridden to serialize the specified value to the 
	 * output stream.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    abstract public void serializeValue(DmcOutputStreamIF dos, VALUE value) throws Exception;

    /**
     * This method must be overridden to read a single value from the input stream.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    abstract public VALUE deserializeValue(DmcInputStreamIF dis) throws Exception;

	
	
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	// Methods that are overridden by the auto-generated SV, MV, MAP, SET classes
	//
	// These class are generated automatically for you when you run the DMO generator.
	// They are generated to the generated.types package.

	/**
	 * Derived classes must return a new, empty version of themselves. This is required
	 * in order to be GWT compatible since the Class.newInstance() method IS NOT SUPPORTED.
	 * @return An instance of the appropriate DmcAttribute derivative. This mechanism
	 * is required to support the DmcTypeModifier concepts that allow you to record the
	 * changes made on an object and transmit them in modification events.
	 */
	abstract protected DmcAttribute<?> getNew();
	
	////////////////////////////////////////////////////////////////////////////////
	// Single value methods.

	/**
	 * Sets the value of a single-valued attribute.
	 * @param value The value to be set
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	public VALUE set(Object value) throws DmcValueException {
    	throw(new IllegalStateException("The set() method should be overloaded automatically by the DmcType[VALUE]SV class"));
	}
	
	/**
	 * Returns the single-valued attribute value.
	 * @return VALUE
	 */
	public VALUE getSV(){
    	throw(new IllegalStateException("The getSV() method should be overloaded automatically by the DmcType[VALUE]SV class"));
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Multi value methods

	/**
	 * Adds the specified value to a multi-valued attribute. NOTE: multi-valued attributes DON'T
	 * allow duplicate values.
	 * @param value The value to be added
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	public VALUE add(Object value) throws DmcValueException {
    	throw(new IllegalStateException("The add() method should be overloaded automatically by the DmcType[VALUE]MV/MAP/SET classes"));
	}
	
	/**
	 * Removes a value from a multi-valued attribute.
	 * @param v The value to be removed.
	 */
	public VALUE del(Object v){
    	throw(new IllegalStateException("The del() method should be overloaded automatically by the DmcType[VALUE]MV/MAP/SET classes"));
	}
	
	/**
	 * Returns an Iterator over a multi-valued attribute's values.
	 * @return Iterator<VALUE>
	 */
	public Iterator<VALUE> getMV(){
    	throw(new IllegalStateException("The getMV() method should be overloaded automatically by the DmcType[VALUE]MV/MAP/SET classes"));
	}

	/**
	 * For a multi-valued attribute, this returns the number of values in the attribute.
	 * If the attribute is single-valued, 0 is returned.
	 * @return the number of values.
	 */
	public int getMVSize(){
    	throw(new IllegalStateException("The getMVSize() method should be overloaded automatically by the DmcType[VALUE]MV/MAP/SET classes"));
	}
	
	/**
	 * A convenience function to return the nth value from a multi-valued attribute.
	 * @param index The value index.
	 * @return E
	 */
	public VALUE getMVnth(int index){
    	throw(new IllegalStateException("The getMVnth() method should be overloaded automatically by the DmcType[VALUE]MV class"));
	}
	
	/**
	 * Returns the value associated with the specified key for HASHMAPPED or TREEMAPPED
	 * attributes. This method is overloaded in DmcHashedAttribute - it returns null at this level.
	 * @param key
	 * @return
	 */
	public VALUE getByKey(Object key){
    	throw(new IllegalStateException("The getByKey() method should be overloaded automatically by the DmcType[VALUE]MAP class"));
	}
	
	/**
	 * If we have a multi-valued attribute, we checked to see it it contains the specified value.
	 * @param obj The object we're looking for.
	 * @return true if the object is contained by the attribute.
	 */
	public boolean contains(Object obj){
    	throw(new IllegalStateException("The contains() method should be overloaded automatically by the DmcType[VALUE]MV/MAP/SET classes"));
	}
	
	/**
	 * If we have a mapped attribute, we checked to see it it contains the specified key.
	 * @param key The key we're looking for.
	 * @return true if the object is contained by the attribute.
	 */
	public boolean containsKey(Object key){
    	throw(new IllegalStateException("The containsKey() method should be overloaded automatically by the DmcType[VALUE]MAP classes"));
	}
	

	////////////////////////////////////////////////////////////////////////////////
	// Cloning
	
	// Depends on abstract cloneValue() implemented in the DmcType[VALUE] class
    
    // for cloning, should just enforce that the VALUE type supports a clone constructor
    // except that that dooesn't work for Enums.
    
    // However, just push the cloning down to the generated classes

	/**
	 * This method is overridden in the auto-generated classes to create a deep clone
	 * of the attribute.
	 */
	abstract public DmcAttribute<VALUE> cloneIt();
    
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
    /**
     * Serializes this attribute value.
     * @param ai The attribute information.
     * @param dos The stream to which we're serialized.
     * @throws IOException
     * @throws DmcValueException 
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
    	if (attrInfo == null)
        	throw(new IllegalStateException("This attribute cannot be serialized because its DmcAttributeInfo is not available."));
    	
    	// WRITE: the attribute id
    	dos.writeAttributeID(attrInfo);

    	if (getMVSize() == 0){
        	serializeValue(dos,getSV());
    	}
    	else{
    		dos.writeValueCount(getMVSize());
    		
    		Iterator<VALUE> iterator = getMV();
    		if (iterator != null){
    			while(iterator.hasNext()){
    				serializeValue(dos, iterator.next());
    			}
    		}
    	}
    }
    
    /**
     * This method will deserialize this attribute from an input stream. This method
     * is overridden in DmcHashedAttribute to handle hashed attributes.
     * @param dis The input stream.
     * @throws Exception if you've tried to store a non-DmcHashedAttribute derivative as HASHMAPPED or TREEMAPPED.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
    	// At this point, the DmwWrapperDMO has instantiated us based on the attribute info.
    	// If we're multivalued, the next thing we need to do is read our length - otherwise,
    	// we just call on our derived class to read itself from the stream
    	switch(attrInfo.valueType){
    	case SINGLE:
    		set(deserializeValue(dis));
    		break;
    	case MULTI:
    	case HASHMAPPED:
    	case TREEMAPPED:
    	case HASHSET:
    	case TREESET:
    		// READ: the number of values
    		int size = dis.readValueCount();
    		
    		for(int i=0; i< size; i++){
    			add(deserializeValue(dis));
    		}
     		break;
     	}
    }
    
	////////////////////////////////////////////////////////////////////////////////
	// Formatting
    
    /**
     * Returns this attribute in Object Instance Format (OIF) which is basically the attribute
     * name followed by the string representation of the value of the attribute. For multi-valued
     * attributes, each value is dumped on a separate line, prepended with its name.
     */
	public void toOIF(StringBuffer sb) {
		String name = "???";
		if (attrInfo != null)
			name = attrInfo.name;
		
		if (getMVSize() == 0){
			if (getSV() instanceof DmcNamedObjectIF)
				sb.append(name + " " + ((DmcNamedObjectIF)getSV()).getObjectName() + "\n");
			else
				sb.append(name + " " + getSV() + "\n");
		}
		else{
			Iterator<VALUE> iterator = getMV();
			if (iterator != null){
				while(iterator.hasNext()){
					VALUE value = iterator.next();
					if (value instanceof DmcNamedObjectIF)
						sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
					else
						sb.append(name + " " + value + "\n");	
				}
			}
		}
	}
	
    /**
     * Returns this attribute in Object Instance Format (OIF) which is basically the attribute
     * name followed by the string representation of the value of the attribute. For multi-valued
     * attributes, each value is dumped on a separate line, prepended with its name.
	 * @param sb The string buffer to which we append the attribute values
	 * @param padding The amount of padding to provide for the "left-justified" attribute name.  
	 */
	@SuppressWarnings("unchecked")
	public void toOIF(StringBuffer sb, int padding) {
		String name = "???";
		if (attrInfo == null){
			if ( (attrInfo = DmcOmni.instance().getInfo(ID)) != null)
				name = attrInfo.name;
		}
		else
			name = attrInfo.name;
		
		if (getMVSize() == 0){
			if (getSV() instanceof DmcNamedObjectIF){
				addNameWithPadding(name,padding,sb);
				sb.append(" " + ((DmcNamedObjectIF)getSV()).getObjectName() + "\n");
			}
			else if (getSV() instanceof DmcAttribute<?>){
				DmcAttribute<?> da = (DmcAttribute<?>) getSV();
				if (da.getMVSize() == 0){
					addNameWithPadding(name,padding,sb);
					sb.append(" " + da.getName() + " " + da.getSV().toString() + "\n");
				}
				else{
					Iterator<Object> iterator = (Iterator<Object>) da.getMV();
					if (iterator != null){
						while(iterator.hasNext()){
							Object obj = iterator.next();
							addNameWithPadding(name,padding,sb);
							sb.append(" " + da.getName() + " " + obj.toString() + "\n");
						}
					}
				}
			}
			else{
				addNameWithPadding(name,padding,sb);
				sb.append(" " + getSV() + "\n");
			}
		}
		else{
			Iterator<VALUE> iterator = getMV();
			if (iterator != null){
				while(iterator.hasNext()){
					VALUE value = iterator.next();
					addNameWithPadding(name,padding,sb);
					if (value instanceof DmcNamedObjectIF)
						sb.append(" " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
					else
						sb.append(" " + value.toString() + "\n");
				}
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
	private void addNameWithPadding(String attrName, int padding, StringBuffer sb){
		sb.append(attrName);
		if (attrName.length() < padding){
			for(int i=attrName.length(); i<padding; i++)
				sb.append(" ");
		}
	}
	
    /**
     * Returns this attribute as just "name value" with no line feeds. This is to format the
     * attributes that are part of modifiers. Such attribute always have only one value, so
     * this method will throw an IllegalStateException if there's more than one value in the 
     * attribute.
     */
	public String modifierFormat() {
		String rc = null;
		
		String name = "???";
		if (attrInfo != null)
			name = attrInfo.name;
		
		if (getMVSize() == 0){
			if (getSV() instanceof DmcNamedObjectIF)
				rc = name + " " + ((DmcNamedObjectIF)getSV()).getObjectName();
			else
				rc = name + " " + getSV();
		}
		else{
			if (getMVSize() > 1)
				throw(new IllegalStateException("Multiple values in an attribute used by  a Modifier."));
			
			Iterator<VALUE> iterator = getMV();
			if (iterator != null){
				while(iterator.hasNext()){
					VALUE value = iterator.next();
					if (value instanceof DmcNamedObjectIF)
						rc = name + " " + ((DmcNamedObjectIF)value).getObjectName();
					else
						rc = name + " " + value;	
				}
			}
		}
		return(rc);
	}
	

	
//	/**
//	 * Appends this attribute to the string buffer with the appropriate
//	 * indent and padding of the attribute name.
//	 * @param sb      The string buffer being populated.
//	 * @param padding The width of the area in which the name will be displayed.
//	 * @param indent  The padding in front of the attribute name.
//	 */
//	void toJSON(StringBuffer sb, int padding, String indent){
//    	sb.append(indent);
//    	addJSONNameWithPadding(this,sb,padding);
//    	
//    	if (sv == null){
//    		sb.append("[\n");
//    		formatValueAsJSON(sb, padding, indent + "  ");
//    		sb.append("\n" + indent + "]");
//    	}
//    	else
//    		formatValueAsJSON(sb, padding, indent + "  ");
//    }
//
//    void toCompactJSON(StringBuffer sb){
//    	sb.append("\"" + name + "\":");
//    	
//    	if (sv == null){
//    		sb.append("[");
//    		formatValueAsCompactJSON(sb);
//    		sb.append("]");
//    	}
//    	else
//    		formatValueAsCompactJSON(sb);
//    	
//    }
//    
//    /**
//     * This method may be overloaded to properly format attributes that refer directly
//     * to DmcObjects or that are object references.
//     */
//    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
//    	if (mv == null){
//    		sb.append("\"" + sv.toString() + "\"");
//    	}
//    	else {
//    		int max = mv.size()- 1;
//    		for(int i=0; i<mv.size(); i++){
//        		sb.append(indent + "  " + "\"" + mv.get(i).toString() + "\"");
//        		if (i < max)
//        			sb.append(", \n");
//    		}
//    	}
//    }
//    
//    /**
//     * This method may be overloaded to properly format attributes that refer directly
//     * to DmcObjects or that are object references.
//     */
//    protected void formatValueAsCompactJSON(StringBuffer sb) {
//    	if (mv == null){
//    		sb.append("\"" + sv.toString() + "\"");
//    	}
//    	else {
//    		int max = mv.size()- 1;
//    		for(int i=0; i<mv.size(); i++){
//        		sb.append("\"" + mv.get(i).toString() + "\"");
//        		if (i < max)
//        			sb.append(",");
//    		}
//    	}
//    }
//    
//	/**
//	 * Adds the attribute name and pads it with the required number of spaces. If the name is
//	 * longer than the padding, we do nothing.
//	 * @param attrName The name of the attribute.
//	 * @param padding  The amount of padding.
//	 * @param sb       The buffer where we're building the output.
//	 */
//	private void addJSONNameWithPadding(DmcAttributeNG<?> attr, StringBuffer sb, int padding){
//		sb.append("\"" + attr.getName() + "\": ");
//		
//		// If this is a multivalued attribute, don't apply the padding. This will leave
//		// the starting bracket just after the attribute name.
//		if (attr.sv == null)
//			return;
//		
//		if (attr.getName().length() < padding){
//			for(int i=attr.getName().length(); i<padding; i++)
//				sb.append(" ");
//		}
//	}
	

}
