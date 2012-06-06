package org.dmd.dms.types;

import static org.junit.Assert.*;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class EnumValueTest {

	@SuppressWarnings("unused")
	@Test
	public void testNull(){
		EnumValue ev = null;
		
		try {
			ev = new EnumValue((String)null);
			assertTrue("Null should cause error", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testMissingEnumName(){
		EnumValue ev = null;
		
		try {
			ev = new EnumValue("0    ");
			assertTrue("Null should cause error", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testNotInteger(){
		EnumValue ev = null;
		
		try {
			ev = new EnumValue("x UNKNOWN No value set    ");
			assertTrue("Null should cause error", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testMissingDescription(){
		EnumValue ev = null;
		
		try {
			ev = new EnumValue("0 UNKNOWN ");
			assertTrue("Null should cause error", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
	}
	
	@Test
	public void testValidNoLabel() throws DmcValueException {
		EnumValue ev = new EnumValue("0 UNKNOWN No value set");
		
		assertEquals("ID should be 0", (int)0, (int)ev.getId());
		
		assertEquals("Enum value name should be UNKNOWN", "UNKNOWN", ev.getName());
		
		assertEquals("Description should be: No value set", "No value set", ev.getDescription());
		
	}
	
	@Test
	public void testValidNoLabelWithTabs() throws DmcValueException {
		EnumValue ev = new EnumValue("0\tUNKNOWN\t\tNo value set");
		
		assertEquals("ID should be 0", (int)0, (int)ev.getId());
		
		assertEquals("Enum value name should be UNKNOWN", "UNKNOWN", ev.getName());
		
		assertEquals("Description should be: No value set", "No value set", ev.getDescription());
		
	}
	
	@Test
	public void testValidNoLabelWithExtraSpace() throws DmcValueException {
		EnumValue ev = new EnumValue("0      UNKNOWN          No value set");
		
		assertEquals("ID should be 0", (int)0, (int)ev.getId());
		
		assertEquals("Enum value name should be UNKNOWN", "UNKNOWN", ev.getName());
		
		assertEquals("Description should be: No value set", "No value set", ev.getDescription());
		
	}
	
	@Test
	public void testValidWithLabel() throws DmcValueException {
		EnumValue ev = new EnumValue("0 UNKNOWN No value set : Unknown");
		
		assertEquals("ID should be 0", (int)0, (int)ev.getId());
		
		assertEquals("Enum value name should be UNKNOWN", "UNKNOWN", ev.getName());
		
		assertEquals("Description should be: No value set", "No value set", ev.getDescription());
		
		assertEquals("Label should be: Unknown", "Unknown", ev.getLabel());
		
	}
	
	@Test
	public void testValidWithLabelWithTabs() throws DmcValueException {
		EnumValue ev = new EnumValue("0 \tUNKNOWN \tNo value set \t: Unknown");
		
		assertEquals("ID should be 0", (int)0, (int)ev.getId());
		
		assertEquals("Enum value name should be UNKNOWN", "UNKNOWN", ev.getName());
		
		assertEquals("Description should be: No value set", "No value set", ev.getDescription());
		
		assertEquals("Label should be: Unknown", "Unknown", ev.getLabel());
		
	}
}
