package org.dmd.dmt.shared.types;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class KeyedTypeTest {

	@Test
	public void checkConstruction1(){
		KeyedType kt = new KeyedType("key and some value");
		
		assertEquals("key should be key", "key", kt.getKeyAsString());
		
		assertEquals("value should be \"and some value\"", "and some value", kt.getValue());
	}

	@Test
	public void checkConstruction2(){
		KeyedType kt = new KeyedType("key");
		
		assertEquals("key should be key", "key", kt.getKeyAsString());
		
		assertEquals("value should be null", null, kt.getValue());
	}
	

}
