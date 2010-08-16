package org.dmd.dmc;

import org.junit.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.DmcTypeInteger;
import org.dmd.dmc.types.DmcTypeString;

public class TestDmcObject {
	
	private DmcObject dmo;
	
	@Before
	public void initialize(){
		dmo = new DmcObject();
	}

	@Test
	public void testInstantion(){
		assertNotNull("DmcObject should be instantiated without Exceptions", dmo);
	}
	
	@Test
	public void testSetString() throws InstantiationException, IllegalAccessException, DmcValueException {
		String value = "testValue";
		
		dmo.set("attr", DmcTypeString.class, "testValue");
		assertEquals("Single valued String is set and returned", value, dmo.get("attr").getSV());
	}
	
	@Test
	public void testSetIntegerAsInt() throws InstantiationException, IllegalAccessException, DmcValueException {
		Integer value = 9;
		
		dmo.set("attr", DmcTypeInteger.class, 9);
		assertEquals("Single valued Integer is set and returned", value, dmo.get("attr").getSV());
	}
	
	@Test
	public void testSetIntegerAsInteger() throws InstantiationException, IllegalAccessException, DmcValueException {
		Integer value = 9;
		
		dmo.set("attr", DmcTypeInteger.class, new Integer(9));
		assertEquals("Single valued Integer is set and returned", value, dmo.get("attr").getSV());
	}
	
	@Test
	public void testSetIntegerAsString() throws InstantiationException, IllegalAccessException, DmcValueException {
		Integer value = 9;
		
		dmo.set("attr", DmcTypeInteger.class, "9");
		assertEquals("Single valued Integer is set and returned", value, dmo.get("attr").getSV());
	}
	
	@Test(expected=DmcValueException.class)
	public void testSetIntegerAsBigString() throws InstantiationException, IllegalAccessException, DmcValueException {
		dmo.set("attr", DmcTypeInteger.class, "9845938479637967279876958790867286486398795246274987576398756983759867");
	}
	
	@Test(expected=DmcValueException.class)
	public void testSetIntegerInvalid() throws InstantiationException, IllegalAccessException, DmcValueException {
		dmo.set("attr", DmcTypeInteger.class, "notAnInteger");
	}
	
	
	
	
}
