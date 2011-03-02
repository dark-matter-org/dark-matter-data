package org.dmd.util;

import java.io.DataInputStream;
import java.io.InputStream;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dms.SchemaManager;

public class DmcInputStream extends DataInputStream implements DmcInputStreamIF {

	SchemaManager	schema;
	
	public DmcInputStream(InputStream is, SchemaManager sm){
		super(is);
		schema = sm;
	}
	
//	@Override
//	public int available() throws ResultException {
//		try {
//			return(dis.available());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}

	@SuppressWarnings("unchecked")
	@Override
	public DmcAttribute getAttributeInstance(DmcAttributeInfo ai) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DmcObject getDMOInstance(String cn) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public boolean readBoolean() throws ResultException {
//		try {
//			return(dis.readBoolean());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public byte readByte() throws ResultException {
//		try {
//			return(dis.readByte());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public char readChar() throws ResultException {
//		try {
//			return(dis.readChar());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public double readDouble() throws ResultException {
//		try {
//			return(dis.readDouble());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public float readFloat() throws ResultException {
//		try {
//			return(dis.readFloat());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public int readInt() throws ResultException {
//		try {
//			return(dis.readInt());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public long readLong() throws ResultException {
//		try {
//			return(dis.readLong());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public short readShort() throws ResultException {
//		try {
//			return(dis.readShort());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public String readUTF() throws ResultException {
//		try {
//			return(dis.readUTF());
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
	
	
}
