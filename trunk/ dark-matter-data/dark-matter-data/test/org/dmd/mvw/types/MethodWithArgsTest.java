package org.dmd.mvw.types;

import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.MethodWithArgs;
import org.junit.Test;

public class MethodWithArgsTest {

	@Test
	public void testStringConstructor(){
		MethodWithArgs mwa = null;
		
		try {
			mwa = new MethodWithArgs("functionName");
			assertTrue("Should have indicated that the argument vector was missing.", false);
		} catch (DmcValueException e1) {
			assertTrue("Expected exception", true);
		}
		
		try {
			mwa = new MethodWithArgs("functionName(");
			assertTrue("Should have indicated that the argument vector was missing.", false);
		} catch (DmcValueException e1) {
			assertTrue("Expected exception", true);
		}
		
		try {
			mwa = new MethodWithArgs("functionName()");
			assertTrue("Empty argvector is ok.", true);
		} catch (DmcValueException e1) {
			System.out.println(e1);
			assertTrue("Unexpected exception", false);
		}
		
		try {
			mwa = new MethodWithArgs("functionName(Contact contact)      com.example.Contact");
			System.out.println(mwa);
			assertTrue("Empty argvector is ok.", true);
		} catch (DmcValueException e1) {
			System.out.println(e1);
			assertTrue("Unexpected exception", false);
		}
		
		

	}
}
