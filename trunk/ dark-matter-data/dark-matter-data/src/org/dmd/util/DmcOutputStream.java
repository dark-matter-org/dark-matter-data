package org.dmd.util;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.util.exceptions.ResultException;

public class DmcOutputStream implements DmcOutputStreamIF{
	
	DataOutputStream	dos;
	
	public DmcOutputStream(OutputStream os){
		dos = new DataOutputStream(os);
	}

	@Override
	public void writeBoolean(boolean v) throws ResultException {
		try {
			dos.writeBoolean(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeByte(int v) throws ResultException {
		try {
			dos.writeByte(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeBytes(String v) throws ResultException {
		try {
			dos.writeBytes(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeChar(int v) throws ResultException {
		try {
			dos.writeChar(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeChars(String v) throws ResultException {
		try {
			dos.writeChars(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeDouble(double v) throws ResultException {
		try {
			dos.writeDouble(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeFloat(float v) throws ResultException {
		try {
			dos.writeFloat(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeInt(int v) throws ResultException {
		try {
			dos.writeInt(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeLong(long v) throws ResultException {
		try {
			dos.writeLong(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeShort(int v) throws ResultException {
		try {
			dos.writeShort(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	@Override
	public void writeUTF(String v) throws ResultException {
		try {
			dos.writeUTF(v);
		} catch (IOException e) {
			throw(new ResultException(e));
		}
	}

	
}
