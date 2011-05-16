package org.dmd.mvw.types;

import static org.junit.Assert.*;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.EventWithArgs;
import org.junit.Test;

public class EventWithArgsTest {

	@Test
	public void testStringConstructor(){
		EventWithArgs ewa = null;
		
		try {
			ewa = new EventWithArgs("deleteObject");
		} catch (DmcValueException e1) {
			assertTrue("Should not have thrown an exception", false);
		}
		
		try {
			ewa = new EventWithArgs("deleteObject (");
			assertTrue("Should have thrown an exception - missing )", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
		
		try {
			ewa = new EventWithArgs("deleteObject String value)");
			assertTrue("Should have thrown an exception - missing (", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
		
	}
}
