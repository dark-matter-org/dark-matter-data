package org.dmd.dmc;

import org.dmd.util.exceptions.ResultException;

/**
 * The DmcSchemaIF interface is required when deserializing objects from a DmcInputStreamIF.
 * It provides methods to retrieve DMO object instances and attribute containers based on
 * construction class names and type names.
 * <P>
 * We require this class to decouple the generated DMOs from any dependency on the Dark Matter
 * Schema mechanisms. 
 */
public interface DmcSchemaIF {

	/**
	 * Returns an instance of object based on the class name.
	 * @param cn The construction class name.
	 * @return The appropriate DMO.
	 * @throws ResultException
	 */
	public DmcObject getDMOInstance(String cn) throws ResultException;
	
	/**
	 * Returns an instance of the appropriate DmcAttribute based on the attribute info.
	 * @param ai The attribute info.
	 * @return A DmcAttribute.
	 * @throws ResultException
	 */
	@SuppressWarnings("unchecked")
	public DmcAttribute getAttributeInstance(DmcAttributeInfo ai) throws ResultException;
}
