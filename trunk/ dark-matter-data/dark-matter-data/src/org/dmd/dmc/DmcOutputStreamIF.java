package org.dmd.dmc;


public interface DmcOutputStreamIF {

	public void writeBoolean(boolean v) throws Exception;
	
	public void writeByte(int v) throws Exception;
	
	public void writeBytes(String v) throws Exception;
	
	public void writeChar(int v) throws Exception;
	
	public void writeChars(String v) throws Exception;
	
	public void writeDouble(double v) throws Exception;
	
	public void writeFloat(float v) throws Exception;
	
	public void writeInt(int v) throws Exception;
	
	public void writeLong(long v) throws Exception;
	
	public void writeShort(int v) throws Exception;
	
	public void writeUTF(String v) throws Exception;

}
