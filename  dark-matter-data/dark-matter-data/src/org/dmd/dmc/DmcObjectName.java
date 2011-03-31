package org.dmd.dmc;

import java.io.Serializable;

/**
 * The DmcObjectName class provides a base type from which all types that represent object names
 * should be derived. The common base allows for wrapping of these types by generated code that 
 * makes object naming easier to handle in a consistent way.
 */
@SuppressWarnings("serial")
abstract public class DmcObjectName implements DmcMappedAttributeIF, Comparable<DmcObjectName>, Serializable {
	
	public DmcObjectName(){
		
	}

    /**
     * Return the name of the object as a String. Regardless of how the name is
     * internally represented, it must have a String representation.
     * @return The name of the object.
     */
    abstract public String getNameString();
    
    /**
     * Internally, names may not be particularly suited to display in user interfaces.
     * This method should be overloaded to provide an informative presentation name.
     * @return A string.
     */
    abstract public String getPresentationString();
    
    /**
     * Implementing classes must overload this method to initialize their name
     * properly with the String form of their name. This can basically be seen as
     * implying that you must have a constructor for your name implementation that
     * takes a String as argument. We need setNameString() so that we can create
     * DmcTypeNamedObjectREF values based on a String.
     * @param n The name value as a String.
     */
    abstract public void setNameString(String n) throws DmcValueException;

    /**
     * Implementors should check to see if the object is of the same type. If not, 
     * return false. If so, use whatever comparison strategy applies to your name.
     * @param obj The comparison object.
     * @return True if the names match.
     */
    abstract public boolean equals(Object obj);
    
    /**
     * Returns the hash code for this name.
     * @return An int hash code.
     */
    abstract public int hashCode();

    /**
     * The object name values must be individually serializable since they are part of
     * a more complex type, namely the DmcTypeNamedObjectREF.
     * @param dos The output stream.
     * @throws Exception
     */
	abstract public void serializeIt(DmcOutputStreamIF dos) throws Exception;
	
    /**
     * Likewise, they must also be individually deserializable since they are part of
     * a more complex type, namely the DmcTypeNamedObjectREF.
     * @param dos The output stream.
     * @throws Exception
     */
	abstract public void deserializeIt(DmcInputStreamIF dis) throws Exception;
	
	/**
	 * @return A clone of the object name derivative.
	 */
	abstract public DmcObjectName cloneIt();

	/**
	 * Returns the portion of the name that provides a unique key for storage in maps and sets.
	 */
	abstract public Object getKey();

	/**
	 * Returns the key value as a String.
	 */
	abstract public String getKeyAsString();

	/**
	 * Compares the name to another name for order.
	 */
	abstract public int compareTo(DmcObjectName o);
	
	/**
	 * @return just the name of the name class e.g. StringName, IntegerName etc.
	 */
	abstract public String getNameClass();
	
	/**
	 * @return a new DmcObjectName derivative.
	 */
	abstract public DmcObjectName getNew();

}
