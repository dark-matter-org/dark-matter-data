package org.dmd.dmc;


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
	
	public int available() throws Exception;

	public boolean readBoolean() throws Exception;
	
	public byte readByte() throws Exception;
	
	public char readChar() throws Exception;
	
	public double readDouble() throws Exception;
	
	public float readFloat() throws Exception;
	
	public int readInt() throws Exception;
	
	public long readLong() throws Exception;
	
	public short readShort() throws Exception;
	
	public String readUTF() throws Exception;
		
	/**
	 * Returns an instance of object based on the class name.
	 * @param cn The construction class name.
	 * @return The appropriate DMO.
	 * @throws Exception
	 */
	public DmcObject getDMOInstance(String cn) throws Exception;
	
	/**
	 * Returns an instance of the appropriate DmcAttribute based on the attribute info.
	 * @param ai The attribute info.
	 * @return A DmcAttribute.
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public DmcAttribute getAttributeInstance(DmcAttributeInfo ai) throws Exception;

}
