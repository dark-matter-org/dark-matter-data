//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.util;

import java.io.DataOutputStream;
import java.io.OutputStream;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcOutputStreamIF;

public class DmcOutputStream extends DataOutputStream implements DmcOutputStreamIF{
	
	public DmcOutputStream(OutputStream os){
		super(os);
	}

	@Override
	public void writeAttributeID(DmcAttributeInfo ai) throws Exception {
		super.writeShort(ai.id);
	}

	@Override
	public void writeAttributeCount(int count) throws Exception {
		super.writeShort(count);
	}

	@Override
	public void writeValueCount(int size) throws Exception {
		super.writeShort(size);
	}


//	@Override
//	public void writeBoolean(boolean v) throws ResultException {
//		try {
//			dos.writeBoolean(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeByte(int v) throws ResultException {
//		try {
//			dos.writeByte(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeBytes(String v) throws ResultException {
//		try {
//			dos.writeBytes(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeChar(int v) throws ResultException {
//		try {
//			dos.writeChar(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeChars(String v) throws ResultException {
//		try {
//			dos.writeChars(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeDouble(double v) throws ResultException {
//		try {
//			dos.writeDouble(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeFloat(float v) throws ResultException {
//		try {
//			dos.writeFloat(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeInt(int v) throws ResultException {
//		try {
//			dos.writeInt(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeLong(long v) throws ResultException {
//		try {
//			dos.writeLong(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeShort(int v) throws ResultException {
//		try {
//			dos.writeShort(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}
//
//	@Override
//	public void writeUTF(String v) throws ResultException {
//		try {
//			dos.writeUTF(v);
//		} catch (IOException e) {
//			throw(new ResultException(e));
//		}
//	}

	
}
