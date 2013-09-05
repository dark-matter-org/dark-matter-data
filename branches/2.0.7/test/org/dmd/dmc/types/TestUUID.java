package org.dmd.dmc.types;

import java.util.UUID;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUUID {

	@Test
	public void testUUIDFromString() throws DmcValueException{
		UUID 		real = UUID.randomUUID();
		
		UUIDLite 	lite = new UUIDLite(real.toString());
		
		
		System.out.println(real.toString());
		
		System.out.println(lite.toString() + "\n");
		
		assertEquals(real.toString(),lite.toString());
	}
	
	@Test
	public void testUUIDFromLongs(){
		UUID 		real = UUID.randomUUID();
		
		UUIDLite 	lite = new UUIDLite(real.getMostSignificantBits(),real.getLeastSignificantBits());
		
		System.out.println(real.toString());
		System.out.println(lite.toString() + "\n");
		
		assertEquals(real.toString(),lite.toString());
	}
		
}
