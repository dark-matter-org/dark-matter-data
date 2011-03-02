package org.dmd.dmc;

import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmcInputStreamIF is used to isolate the Dark Matter Core functionality
 * associated with serialization from particular Java IO libraries that aren't
 * supported in all contexts e.g. Google Web Toolkit.
 * <P>
 * It also provides separation from the Dark Matter Schema mechanisms which, likewise,
 * are not provided in all contexts. The schema related methods are required to allow
 * for the deserialization of object reference attributes.
 */
public interface DmcInputStreamIF {
	
	public int available() throws ResultException;

	public boolean readBoolean() throws ResultException;
	
	public byte readByte() throws ResultException;
	
	public char readChar() throws ResultException;
	
	public double readDouble() throws ResultException;
	
	public float readFloat() throws ResultException;
	
	public int readInt() throws ResultException;
	
	public long readLong() throws ResultException;
	
	public short readShort() throws ResultException;
	
	public String readUTF() throws ResultException;
	
	/**
	 * Sets the schema that's used to assist with object and attribute container creation.
	 * @param sm
	 */
	public void setSchema(SchemaManager sm);
	
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
