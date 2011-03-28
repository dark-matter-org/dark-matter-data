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
import java.io.IOException;
import java.io.OutputStream;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

public class DmcTraceableOutputStream implements DmcOutputStreamIF {
	
	DataOutputStream	dos;
	
	boolean				calledFrom;
	PrintfFormat		format;
	
	public DmcTraceableOutputStream(OutputStream os, boolean cf, int padding) {
		dos = new DataOutputStream(os);
		calledFrom = cf;
		format = new PrintfFormat("%-" + padding + "s");
	}

	@Override
	public void writeAttributeID(DmcAttributeInfo ai) throws Exception {
		dos.writeShort(ai.id);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println(" attrid: " + ai.id + "  " + ai.name);
	}

	@Override
	public void writeAttributeCount(int count) throws Exception {
		dos.writeShort(count);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println(" # attr: " + count);
	}

	@Override
	public void writeValueCount(int size) throws Exception {
		dos.writeShort(size);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println(" # vals: " + size);
	}

	@Override
	public void writeBoolean(boolean v) throws IOException {
		dos.writeBoolean(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("boolean: " + v);
	}

	@Override
	public void writeByte(int v) throws IOException {
		dos.writeByte(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("    int: " + v);
	}

	@Override
	public void writeBytes(String v) throws IOException {
		dos.writeBytes(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println(" string: " + v);
	}

	@Override
	public void writeChar(int v) throws IOException {
		dos.writeChar(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("   char: " + v);
	}

	@Override
	public void writeChars(String v) throws IOException {
		dos.writeChars(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("  chars: " + v);
	}

	@Override
	public void writeDouble(double v) throws IOException {
		dos.writeDouble(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("double: " + v);
	}

	@Override
	public void writeFloat(float v) throws IOException {
		dos.writeFloat(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("  float: " + v);
	}

	@Override
	public void writeInt(int v) throws IOException {
		dos.writeInt(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("boolean: " + v);
	}

	@Override
	public void writeLong(long v) throws IOException {
		dos.writeLong(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("   long: " + v);
	}

	@Override
	public void writeShort(int v) throws IOException {
		dos.writeShort(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("  short: " + v);
	}

	@Override
	public void writeUTF(String v) throws IOException {
		dos.writeUTF(v);
		if (calledFrom)
			System.out.print(format.sprintf(DebugInfo.getShortWhereWeWereCalledFrom()) + " ");
		System.out.println("    utf: " + v);
	}

	
}
