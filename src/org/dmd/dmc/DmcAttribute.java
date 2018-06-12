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

import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dms.generated.types.DmcTypeModifierMV;

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
 * for single and multi-valued attributes. There are four primary modification 
 * interfaces on a DmcAttribute:
 * <ul>
 * <li> set() - sets the value of a single-valued attribute </li>
 * <li> setMVnth() - sets the nth value of an indexed, multi-valued attribute </li>
 * <li> add() - adds a value to a multi-valued attribute </li>
 * <li> del() - deletes a value from a multi-valued attribute </li>
 * </ul>
 * To completely remove an attribute value from an object, the DmcObject.rem() function is called.
 * <P>
 * Retrieval of values is accomplished via:
 * <ul>
 * <li> getSV()    - which returns a single value</li>
 * <li> getMV()    - which returns an Iterator over multiple values</li>
 * <li> getMVnth() - which returns the nth value of an indexed, multi-valued attribute</li>
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
		if (attrInfo == null){
			attrInfo = DmcOmni.instance().getInfo(ID);
			if (attrInfo == null)
				throw(new IllegalStateException("Unknown attribute ID: " + ID + " - you are missing a required schema."));
		}
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
	 * For indexed, multi-valued attributes, we set the nth value as specified. If the value at the index
	 * is to be removed, set the value to null.
	 * @param index The value index.
	 * @param value The value to be set. if the value is null, that index location is nulled.
	 * @return E
	 */
	public VALUE setMVnth(int index, Object value) throws DmcValueException {
    	throw(new IllegalStateException("The setMVnth() method should be overloaded automatically by the DmcType[VALUE]MV class"));
	}
	
	/**
	 * This method is overloaded in DmcHashedAttribute - it returns null at this level.
	 * @param key
	 * @return the value associated with the specified key for HASHMAPPED or TREEMAPPED
	 * attributes.
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
	
	/**
	 * If we have an indexed, multi-valued attribute, this method will traverse all of the slots to determine if we still
	 * have any non-null values.
	 * @return true if there are any values an false otherwise.
	 */
	public boolean hasValue(){
    	throw(new IllegalStateException("The hasValue() method should be overloaded automatically by the DmcType[VALUE]MV classes"));		
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
     * @param dos The stream to which we're serialized.
     * @throws IOException
     * @throws DmcValueException 
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
    	if (attrInfo == null){
    		// Try to resolve it and if it's still unknown we're buggered
    		attrInfo = DmcOmni.instance().getInfo(ID);
    		if (attrInfo == null)
    			throw(new IllegalStateException("This attribute cannot be serialized because its DmcAttributeInfo is not available. ID = " + ID));
    	}
    	
    	// WRITE: the attribute id
    	dos.writeAttributeID(attrInfo);

    	if (getMVSize() == 0){
        	serializeValue(dos,getSV());
    	}
    	else{
    		dos.writeValueCount(getMVSize());
    		
    		if (attrInfo.indexSize == 0){
	    		Iterator<VALUE> iterator = getMV();
	    		if (iterator != null){
	    			while(iterator.hasNext()){
	    				serializeValue(dos, iterator.next());
	    			}
	    		}
    		}
    		else{
    			// For indexed attributes we have to add a bit more encoding. If we have a value
    			// at a particular index, we write the index and then serialize the value. If the
    			// value at an index is null, we write -1 for the index and nothing for the value.
    			for (int index=0; index<getMVSize(); index++){
    				VALUE value = getMVnth(index);
    				if (value == null)
    					dos.writeInt(-1);
    				else{
    					dos.writeInt(index);
    					serializeValue(dos, value);
    				}
    					
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
    		
    		if (attrInfo.indexSize == 0){
	    		for(int i=0; i< size; i++){
	    			add(deserializeValue(dis));
	    		}
    		}
    		else{
	    		for(int i=0; i< size; i++){
	    			int index = dis.readInt();
	    			
	    			if (index == -1)
	    				continue;
	    			
	    			VALUE value = deserializeValue(dis);
	    			setMVnth(index, value);
	    		}
    		}
     		break;
     	}
    }
    
	////////////////////////////////////////////////////////////////////////////////
	// Formatting
    
    /**
     * This method is called in toOIF() to format an attribute value. If you want
     * a different String display format for a type of value, you can overload this
     * in your DmcType implementation. This method is NOT called for object names.
     */
    protected String formatValue(VALUE value){
    	return(value.toString());
    }
    
    /**
     * Returns this attribute in Object Instance Format (OIF) which is basically the attribute
     * name followed by the string representation of the value of the attribute. For multi-valued
     * attributes, each value is dumped on a separate line, prepended with its name.
     */
	public void toOIF(StringBuffer sb) {
		String name = "???";
		if (attrInfo == null){
			if ( (attrInfo = DmcOmni.instance().getInfo(ID)) != null)
				name = attrInfo.name;
		}
		else
			name = attrInfo.name;
		
//		boolean isDmcObject = false;
//		if ((attrInfo != null) && (attrInfo.type.equals("DmcObject")))
//			isDmcObject = true;
//		if ()
		
		if (getMVSize() == 0){
			if (getSV() instanceof DmcObject){
				sb.append("\n{\n" + ((DmcObject)getSV()).toOIF() + "}\n");
			}
			else{
				if (getSV() instanceof DmcExtendedReferenceIF)
					sb.append(name + " " + formatValue(getSV()) + "\n");
				else if (getSV() instanceof DmcNamedObjectIF)
					sb.append(name + " " + ((DmcNamedObjectIF)getSV()).getObjectName() + "\n");
				else
					sb.append(name + " " + formatValue(getSV()) + "\n");
			}
		}
		else{
			Iterator<VALUE> iterator = getMV();
			if (iterator != null){
				boolean first 		= true;
				int 	dmoCount 	= 0;

				if ((attrInfo != null) && (attrInfo.indexSize > 0)){
					// For indexed attributes we display the index before each value and null
					// values are allowed
					int index = 0;
					boolean pad = false;
					if (attrInfo.indexSize > 10)
						pad = true;
					
					while(iterator.hasNext()){
						VALUE value = iterator.next();
						
						String indexstr = "" + index + " ";
						if ((index < 10) && pad)
							indexstr = " " + index + " ";
						
						if (value == null){
							sb.append(name + " " + indexstr + "\n");
						}
						else{
							if (value instanceof DmcObject){
//								dmoCount++;
//								if (first){
//									sb.append("[\n");
//									first = false;
//								}
								sb.append(" {\n" + ((DmcObject)value).toOIF() + "}\n");
							}
							else{
								if (value instanceof DmcExtendedReferenceIF)
									sb.append(name + " " + indexstr + formatValue(value) + "\n");
								else if (value instanceof DmcNamedObjectIF)
									sb.append(name + " " + indexstr + ((DmcNamedObjectIF)value).getObjectName() + "\n");
								else
									sb.append(name + " " + indexstr + formatValue(value) + "\n");

							}
						}
						index++;
					}
//					if (dmoCount > 0)
//						sb.append("]\n");
				}
				else{
					while(iterator.hasNext()){
						VALUE value = iterator.next();
						if (value instanceof DmcObject){
							dmoCount++;
							if (first){
								sb.append("[\n");
								first = false;
							}
							sb.append("{\n" + ((DmcObject)value).toOIF() + "}\n");
						}
						else{
							if (value instanceof DmcExtendedReferenceIF)
								sb.append(name + " " + formatValue(value) + "\n");	
							else if (value instanceof DmcNamedObjectIF)
								sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
							else
								sb.append(name + " " + formatValue(value) + "\n");	
						}
					}
					if (dmoCount > 0)
						sb.append("]\n");
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
		
//		boolean isDmcObject = false;
//		if ((attrInfo != null) && (attrInfo.type.equals("DmcObject")))
//			isDmcObject = true;

		if (getMVSize() == 0){
			if (getSV() instanceof DmcObject){
				sb.append(name + "\n{\n" + ((DmcObject)getSV()).toOIF() + "}\n");
			}
			else{
				if ( (getSV() instanceof DmcNamedObjectIF) && !(getSV() instanceof DmcExtendedReferenceIF)){
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
					sb.append(" " + formatValue(getSV()) + "\n");
				}
			}
		}
		else{
			Iterator<VALUE> iterator = getMV();
			if (iterator != null){
				boolean first 		= true;
				int 	dmoCount 	= 0;
				
				if ( (attrInfo != null) && (attrInfo.indexSize > 0) ){
					// For indexed attributes we display the index before each value and null
					// values are allowed
					int index = 0;
					boolean pad = false;
					if (attrInfo.indexSize > 10)
						pad = true;

					while(iterator.hasNext()){
						VALUE value = iterator.next();
						
						String indexstr = "" + index + " ";
						if ((index < 10) && pad)
							indexstr = " " + index + " ";

						if (value == null){
							addNameWithPadding(name,padding,sb);
							sb.append(indexstr + "\n");
						}
						else{
							if (value instanceof DmcObject){
//								if (first){
									addNameWithPadding(name,padding,sb);
									sb.append(indexstr);
//									first = false;
//								}
								sb.append(" {\n" + ((DmcObject)value).toOIF() + "}\n");
							}
							else{
								addNameWithPadding(name,padding,sb);
								sb.append(indexstr);
								
								if (value instanceof DmcExtendedReferenceIF)
									sb.append(" " + formatValue(value) + "\n");
								else if (value instanceof DmcNamedObjectIF)
									sb.append(" " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
								else
									sb.append(" " + formatValue(value) + "\n");
							}
						}
						index++;
					}
				}
				else{
					while(iterator.hasNext()){
						VALUE value = iterator.next();
						if (value instanceof DmcObject){
							dmoCount++;
							if (first){
								addNameWithPadding(name,padding,sb);
								sb.append("\n[\n");
								first = false;
							}
							sb.append("{\n" + ((DmcObject)value).toOIF() + "}\n");
						}
						else{
							addNameWithPadding(name,padding,sb);
							if (value instanceof DmcExtendedReferenceIF)
								sb.append(" " + formatValue(value) + "\n");
							else if (value instanceof DmcNamedObjectIF)
								sb.append(" " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
							else
								sb.append(" " + formatValue(value) + "\n");
						}
					}
					if (dmoCount > 0)
						sb.append("]\n");
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
     * Returns this attribute as just "value" with no line feeds. This is to format the
     * attributes that are part of modifiers. Such attribute always have only one value, so
     * this method will throw an IllegalStateException if there's more than one value in the 
     * attribute.
     */
	public String modifierFormat() {
		String rc = null;
		
		if (getMVSize() == 0){
			if (getSV() instanceof DmcExtendedReferenceIF)
				rc = "" + getSV();
			else if (getSV() instanceof DmcNamedObjectIF)
				rc = "" + ((DmcNamedObjectIF)getSV()).getObjectName();
			else
				rc = "" + getSV();
		}
		else{
			if (attrInfo.indexSize == 0){
				if (getMVSize() > 1){
					throw(new IllegalStateException("Multiple values in an attribute used by  a Modifier."));
				}
				
				Iterator<VALUE> iterator = getMV();
				if (iterator != null){
					while(iterator.hasNext()){
						VALUE value = iterator.next();
						if (value instanceof DmcExtendedReferenceIF)
							rc = "" + value;
						else if (value instanceof DmcNamedObjectIF)
							rc = "" + ((DmcNamedObjectIF)value).getObjectName();
						else
							rc = "" + value;
					}
				}
			}
			else{
				for(int index=0; index<getMVSize(); index++){
					VALUE value = getMVnth(index);
					if (value == null)
						continue;
					if (value instanceof DmcExtendedReferenceIF)
						rc = "" + value;
					else if (value instanceof DmcNamedObjectIF)
						rc = "" + ((DmcNamedObjectIF)value).getObjectName();
					else
						rc = "" + value;					
				}
			}
		}
		return(rc);
	}
	
	protected void addModsSV(DmcTypeModifierMV mods, DmcAttribute<?> existingValue, DmcAdapterIF adapter){
		try {
			if (existingValue == null){
				if (adapter.hasValue())
					mods.add(new Modifier(ModifyTypeEnum.SET, this.cloneIt()));
			}
			else{
				if (!adapter.hasValue())
					mods.add(new Modifier(ModifyTypeEnum.REM, attrInfo));
				else
					mods.add(new Modifier(ModifyTypeEnum.SET, this.cloneIt()));
			}
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
		}
	}
	
	protected boolean valueChangedSV(DmcAttribute<?> existingValue, DmcAdapterIF adapter){
		boolean rc = false;
		
		if (existingValue == null){
			if (adapter.hasValue())
				rc = true;
		}
		else{
			if (!adapter.hasValue())
				rc = true;
			else{
				// NOTE: originally, we just compared the values directly,
				// but, this doesn't work for complex types, so now, we
				// compare the string representations of the values
				if (!existingValue.getSV().toString().equals(adapter.getValue().toString()))
					rc = true;
//				if (!existingValue.getSV().equals(adapter.getValue()))
//					rc = true;
			}
		}
		
		return(rc);
	}
	
	protected void addModsMV(DmcTypeModifierMV mods, DmcAttribute<?> existingValue, DmcAdapterIF adapter){
		try {
			if (existingValue == null){
				if (adapter.hasValue()){
					if (attrInfo.indexSize == 0){
						Iterator<VALUE> it = getMV();
						while(it.hasNext()){
							VALUE current = it.next();
							DmcAttribute<?> mod = getNew();
							mod.add(current);
							mods.add(new Modifier(ModifyTypeEnum.ADD, mod));
						}
					}
					else{
						for(int index=0; index<getMVSize(); index++){
							if (getMVnth(index) != null){
								DmcAttribute<?> mod = getNew();
								mod.setMVnth(index,getMVnth(index));
								mods.add(new Modifier(ModifyTypeEnum.NTH, mod, index));
							}
						}
					}
				}
			}
			else{
				if (!adapter.hasValue())
					mods.add(new Modifier(ModifyTypeEnum.REM, attrInfo));
				else{
					// Have to determine the delta
					if (attrInfo.indexSize == 0){
						Iterator<?> eit = existingValue.getMV();
						while(eit.hasNext()){
							Object current = eit.next();
							if (!contains(current)){
								// The value no longer exists, delete it
								DmcAttribute<?> mod = getNew();
								mod.add(current);
								mods.add(new Modifier(ModifyTypeEnum.DEL, mod));
							}
						}
						Iterator<VALUE> it = getMV();
						while(it.hasNext()){
							VALUE current = it.next();
							if (!existingValue.contains(current)){
								// The existing value is missing this value, add it
								DmcAttribute<?> mod = getNew();
								mod.add(current);
								mods.add(new Modifier(ModifyTypeEnum.ADD, mod));
							}
						}
					}
					else{
						for(int index=0; index<getMVSize(); index++){
							Object existing = existingValue.getMVnth(index);
							Object current  = getMVnth(index);
							boolean replace = false;
							
							if (existing == null){
								if (current != null)
									replace = true;
							}
							else{
								if (current == null)
									replace = true;
								else{
									if (!existing.equals(current))
										replace = true;
								}
							}
							
							if (replace){
								DmcAttribute<?> mod = getNew();
								mod.setMVnth(index,current);
								mods.add(new Modifier(ModifyTypeEnum.NTH, mod, index));
							}
						}
					}
				}
			}
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
		}
	}
	
	protected boolean valueChangedMV(DmcAttribute<?> existingValue, DmcAdapterIF adapter){
		boolean rc = false;
		
		if (existingValue == null){
			if (adapter.hasValue())
				rc = true;
		}
		else{
			if (!adapter.hasValue())
				rc = true;
			else{
				if (attrInfo.indexSize == 0){
					if (existingValue.getMVSize() != getMVSize())
						rc = true;
					else{
						Iterator<VALUE>	iterator = getMV();
						while(iterator.hasNext()){
							VALUE val = iterator.next();
							if (!existingValue.contains(val)){
								rc = true;
								break;
							}
						}
					}
				}
				else{
					for(int i=0; i<attrInfo.indexSize; i++){
						Object existing = existingValue.getMVnth(i);
						Object current  = getMVnth(i);
						
						if (existing == null){
							if (current != null){
								rc = true;
								break;
							}
						}
						else{
							if (current == null){
								rc = true;
								break;
							}
							else{
								if (!existing.equals(current))
									rc = true;
							}
						}
					}
				}
					
			}
		}
		
		return(rc);
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
    	
    	if (getMVSize() == 0){
    		formatValueAsJSON(sb, padding, indent + "  ");
    	}
    	else{
    		sb.append("[\n");
    		formatValueAsJSON(sb, padding, indent + "  ");
    		sb.append("\n" + indent + "]");
    	}
    }

    void toCompactJSON(StringBuffer sb){
		String name = "???";
		if (attrInfo == null){
			if ( (attrInfo = DmcOmni.instance().getInfo(ID)) != null)
				name = attrInfo.name;
		}
		else
			name = attrInfo.name;

		sb.append("\"" + name + "\":");
    	
    	if (getMVSize() == 0){
    		formatValueAsCompactJSON(sb);
    	}
    	else{
    		sb.append("[");
			formatValueAsCompactJSON(sb);
			sb.append("]");
    	}
    }
    
    /**
     * This method may be overloaded to properly format attributes that refer directly
     * to DmcObjects or that are object references.
     */
    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
    	if (getMVSize() == 0){
    		String value = getSV().toString();
    		if (value.contains("\\"))
    			value = value.replace("\\", "\\\\");
        	if (value.contains("\\\\n"))
    			value = value.replace("\\\\n", "\\n");
    		if (value.contains("\t"))
    			value = value.replace("\t", "\\t");
    		if (value.contains("\""))
    			value = value.replace("\"", "\\\"");
//    		sb.append("\"" + getSV().toString().replace("\"", "\\\"") + "\"");
    		sb.append("\"" + value + "\"");
    	}
    	else {
    		Iterator<VALUE> it = getMV();
    		while(it.hasNext()){
    			VALUE jvalue = it.next();
    			String value = jvalue.toString();
        		if (value.contains("\\"))
        			value = value.replace("\\", "\\\\");
            	if (value.contains("\\\\n"))
        			value = value.replace("\\\\n", "\\n");
        		if (value.contains("\t"))
        			value = value.replace("\t", "\\t");
        		if (value.contains("\""))
        			value = value.replace("\"", "\\\"");
//        		sb.append(indent + "  " + "\"" + value.toString().replace("\"", "\\\"") + "\"");
        		sb.append(indent + "  " + "\"" + value + "\"");
        		if (it.hasNext())
        			sb.append(", \n");        			
    		}
//    		int max = getMVSize()- 1;
//    		for(int i=0; i<getMVSize(); i++){
//        		sb.append(indent + "  " + "\"" + getMVnth(i).toString() + "\"");
//        		if (i < max)
//        			sb.append(", \n");
//    		}
    	}
    }
    
    /**
     * This method may be overloaded to properly format attributes that refer directly
     * to DmcObjects or that are object references.
     */
    protected void formatValueAsCompactJSON(StringBuffer sb) {
    	if (getMVSize() == 0){
    		sb.append("\"" + getSV().toString().replace("\"", "\\\"") + "\"");
    	}
    	else {
    		int max = getMVSize()- 1;
    		for(int i=0; i<getMVSize(); i++){
        		sb.append("\"" + getMVnth(i).toString().replace("\"", "\\\"") + "\"");
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
		if (getMVSize() > 0)
			return;
		
		if (attr.getName().length() < padding){
			for(int i=attr.getName().length(); i<padding; i++)
				sb.append(" ");
		}
	}
	

}
