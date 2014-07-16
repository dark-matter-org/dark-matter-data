package org.dmd.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DmcOutputStreamTest {
	
	static String testDataPath = "/test/org/dmd/util/data";
	
	static boolean initialized = false;
	
	static File	temp;

	@Before
	public void initialize() throws IOException {
		if (!initialized){
	        File curr = new File(".");
	        String runDir;
			runDir = curr.getCanonicalPath();
			System.out.println("*** Serialization running from: " + runDir);
	
			temp = new File(runDir + File.separator + "serialize.txt");
			
			System.out.println("temp: " + temp.getAbsolutePath());
			
			initialized = true;
			
		}
	}
	
	@Test
	public void serialize() throws Exception {
		DmcOutputStream os = new DmcOutputStream(new FileOutputStream(temp.getAbsolutePath()));
		
//		Varint.writeUnsignedVarInt(309, os);
//		os.writeShort(34567);
		os.writeValueCount(650987);
		os.writeValueCount(32767);
		os.writeValueCount(32768);
		os.writeValueCount(15);
		os.writeValueCount(Integer.MAX_VALUE);

		os.close();
	}
	
	@Test
	public void deserialize() throws Exception {
		DmcInputStream	is = new DmcInputStream(new FileInputStream(temp.getAbsolutePath()),null);
		
//		int value = Varint.readUnsignedVarInt(is);
//		int value = is.readShort();
//		System.out.println("value= " + value);
		int valcount = is.readValueCount();
		
		assertEquals("Value 1 should be 650987", 650987, valcount);
		
		System.out.println("valcount: " + valcount);
		
		valcount = is.readValueCount();
		
		assertEquals("Value 2 should be 32767", 32767, valcount);
		
		System.out.println("valcount: " + valcount);
		
		valcount = is.readValueCount();

		assertEquals("Value 3 should be 32768", 32768, valcount);
		
		System.out.println("valcount: " + valcount);
		
		valcount = is.readValueCount();
		
		assertEquals("Value 4 should be 15", 15, valcount);
		
		System.out.println("valcount: " + valcount);
		
		valcount = is.readValueCount();
		
		assertEquals("Value 5 should be 2147483647", Integer.MAX_VALUE, valcount);
		
		System.out.println("valcount: " + valcount);
		

		is.close();
	}
	
//	public void writeValCount(int vc, DmcOutputStream os) throws IOException {
//		if (vc < 0)
//			throw(new IllegalStateException("Can't encode a negative integer value count."));
//		
//		System.out.println("Writing " + vc);
//		
//		if (vc > 32767){
//			short high = (short) ((vc >> 16) | 0x8000);
//			short low = (short) vc;
////			
////			System.out.println("out high = " + high);
////			System.out.println("out  low = " + low);
//			
//			os.writeShort((short) ((vc >> 16) | 0x8000));
//			os.writeShort(vc);
//		}
//		else{
//			os.writeShort(vc);
//		}
//	}
//	
//	public int readValCount(DmcInputStream is) throws IOException{
//		short high = is.readShort();
//		
//		if (high < 0){
//			short low = is.readShort();
//			
////			System.out.println("in high = " + high);
////			System.out.println("in  low = " + low);
//			
////			int rc = ( ((high & 0x7FFF) << 16) | (low & 0xFFFF));
//			return(((high & 0x7FFF) << 16) | (low & 0xFFFF));
//		}
//		
//		return(high);
//	}

//	@Test
//	public void test(){
//		
//		short valcount = toUint16(32767);
//		
//		System.out.println("short = " + valcount);
//		
//		int ivalcount = toUint32(valcount);
//		
//		System.out.println("integer = " + ivalcount);
//	}
//	
//	short toUint16(int i)
//	{
//	    return (short) i;
//	}
//
//	int toUint32(short s)
//	{
//	    return s & 0xFFFF;
//	}
	
	
	
}
