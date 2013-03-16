package org.dmd.mvw.types;

import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.MethodWithArgs;
import org.junit.Test;

public class GetWithModsTest {

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
			assertTrue("Should have indicated that the return type was missing.", false);
		} catch (DmcValueException e1) {
			System.out.println("Expected:\n" + e1);
			assertTrue("Expected exception", true);
		}
		
		try {
			mwa = new MethodWithArgs("setContact(Contact contact)");
			assertTrue("Should have indicated that the return type was missing.", false);
		} catch (DmcValueException e1) {
			System.out.println("Expected:\n" + e1);
			assertTrue("Expected exception", true);
		}
		
		try {
			mwa = new MethodWithArgs("void ()");
			assertTrue("Should have indicated that the method name was missing.", false);
		} catch (DmcValueException e1) {
			assertTrue("Expected exception", true);
		}
		
		try {
			mwa = new MethodWithArgs("void            ()");
			assertTrue("Should have indicated that the method name was missing.", false);
		} catch (DmcValueException e1) {
			assertTrue("Expected exception", true);
		}
		
		try {
			mwa = new MethodWithArgs("void functionName()");
			assertTrue("Empty argvector is ok.", true);
		} catch (DmcValueException e1) {
			System.out.println(e1);
			assertTrue("Unexpected exception", false);
		}
		
		try {
			mwa = new MethodWithArgs("void setContact(Contact contact)      We set the contact to be displayed");
			System.out.println(mwa);
			assertTrue("Empty argvector is ok.", true);
		} catch (DmcValueException e1) {
			System.out.println(e1);
			assertTrue("Unexpected exception", false);
		}
		
		

	}
}
