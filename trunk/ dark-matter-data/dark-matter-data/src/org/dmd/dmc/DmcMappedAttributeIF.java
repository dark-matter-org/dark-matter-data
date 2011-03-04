package org.dmd.dmc;

/**
 * The DmcMappedAttributeIF interface defines attribute values that have
 * an associated key value that allows them to be stored in a Map.
 */
public interface DmcMappedAttributeIF {

	/**
	 * Returns the key associated with this attribute value.
	 * @return The key value.
	 */
	public Object getKey();
	
	/**
	 * Returns the key value represented as a string. we could just call the toString()
	 * method on the Object, but having this forces you implement an appropriate String
	 * conversion method for the key.
	 * @return A String.
	 */
	public String getKeyAsString();
}
