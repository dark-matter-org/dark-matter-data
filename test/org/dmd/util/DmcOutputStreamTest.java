package org.dmd.util;

import org.junit.Test;

public class DmcOutputStreamTest {

	@Test
	public void test(){
		
		short valcount = toUint16(65535);
		
		System.out.println("short = " + valcount);
		
		int ivalcount = toUint32(valcount);
		
		System.out.println("integer = " + ivalcount);
	}
	
	short toUint16(int i)
	{
	    return (short) i;
	}

	int toUint32(short s)
	{
	    return s & 0xFFFF;
	}
}
