package org.dmd.mvw.types;

import static org.junit.Assert.*;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.EventWithArgs;
import org.junit.Test;

public class EventWithArgsTest {

	@Test
	public void testStringConstructor() throws DmcValueException{
		EventWithArgs ewa = null;
		
		try {
			ewa = new EventWithArgs("DeleteObjectEvent");
		} catch (DmcValueException e1) {
			assertTrue("Should not have thrown an exception", false);
		}
		
		try {
			ewa = new EventWithArgs("DeleteObjectEvent (");
			assertTrue("Should have thrown an exception - missing )", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
		
		try {
			ewa = new EventWithArgs("DeleteObjectEvent String value)");
			assertTrue("Should have thrown an exception - missing (", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
		
		try {
			ewa = new EventWithArgs("DeleteObjectEvent String value)");
			assertTrue("Should have thrown an exception - missing (", false);
		} catch (DmcValueException e) {
			System.out.println("Got expected exception:\n" + e.toString());
		}
		
		try{
			ewa = new EventWithArgs("DeleteObjectEvent (String value)");
			
			assertEquals("Event name should be DeletObjectEvent", "DeleteObjectEvent", ewa.getEventName());
			
			assertEquals("Arg vector should be (String value)", "(String value)", ewa.getArgVector());
			
			System.out.println(ewa);
			
		} catch (DmcValueException e1) {
			assertTrue("Should not have thrown an exception", false);
		}
		
		try{
			ewa = new EventWithArgs("DeleteObjectEvent (Hashmap<String,String> value) java.util.Hashmap      java.util.Map");
			
			assertEquals("Event name should be DeletObjectEvent", "DeleteObjectEvent", ewa.getEventName());
			
			assertEquals("Arg vector should be (Hashmap<String,String> value)", "(Hashmap<String,String> value)", ewa.getArgVector());
			
			System.out.println(ewa);
			
		} catch (DmcValueException e1) {
			assertTrue("Should not have thrown an exception", false);
		}
		
		
		
	}
}
