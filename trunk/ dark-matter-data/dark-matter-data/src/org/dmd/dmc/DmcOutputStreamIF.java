package org.dmd.dmc;

import org.dmd.util.exceptions.ResultException;

public interface DmcOutputStreamIF {

	public void writeBoolean(boolean v) throws ResultException;
	
	public void writeByte(int v) throws ResultException;
	
	public void writeBytes(String v) throws ResultException;
	
	public void writeChar(int v) throws ResultException;
	
	public void writeChars(String v) throws ResultException;
	
	public void writeDouble(double v) throws ResultException;
	
	public void writeFloat(float v) throws ResultException;
	
	public void writeInt(int v) throws ResultException;
	
	public void writeLong(long v) throws ResultException;
	
	public void writeShort(int v) throws ResultException;
	
	public void writeUTF(String v) throws ResultException;

}
