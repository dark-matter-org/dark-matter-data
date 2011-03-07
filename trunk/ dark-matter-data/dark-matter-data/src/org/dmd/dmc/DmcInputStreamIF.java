//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
