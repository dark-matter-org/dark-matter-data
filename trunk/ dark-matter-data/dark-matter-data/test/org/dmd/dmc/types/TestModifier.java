package org.dmd.dmc.types;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class TestModifier {

	@Test
	public void testNull(){
		try{
			new Modification((String)null);
			fail("Exception should have been raised for null value.");
		}
		catch(DmcValueException ex){
			assertTrue("Null value check",true);
			System.out.println(ex);
		}
		
	}

	@Test
	public void testOneToken(){
		try{
			new Modification("attributeName");
			fail("Exception should have been raised for incorrect number of tokens.");
		}
		catch(DmcValueException ex){
			assertTrue("Single token check",true);
			System.out.println(ex);
		}
		
	}

	@Test
	public void unknownOperationTwoTokens(){
		try{
			new Modification("attributeName MOOSE");
			fail("Exception should have been raised for an unknown operation.");
		}
		catch(DmcValueException ex){
			assertTrue("Unknown operation with two tokens",true);
			System.out.println(ex);
		}
		
	}

	@Test
	public void unknownOperationThreeTokens(){
		try{
			new Modification("attributeName MOOSE inTheWoods");
			fail("Exception should have been raised for an unknown operation.");
		}
		catch(DmcValueException ex){
			assertTrue("Unknown operation with three tokens",true);
			System.out.println(ex);
		}
		
	}

	@Test
	public void extraneousREMTokens(){
		try{
			new Modification("attributeName REM something");
			fail("Exception should have been raised for extraneous tokens.");
		}
		catch(DmcValueException ex){
			assertTrue("Extraneous tokens in a REM operation",true);
			System.out.println(ex);
		}
	}

	@Test
	public void missingSETTokens(){
		try{
			new Modification("attributeName SET");
			fail("Exception should have been raised for missing SET value.");
		}
		catch(DmcValueException ex){
			assertTrue("Missing tokens for SET",true);
			System.out.println(ex);
		}
	}

	@Test
	public void missingADDTokens(){
		try{
			new Modification("attributeName ADD");
			fail("Exception should have been raised for missing ADD value");
		}
		catch(DmcValueException ex){
			assertTrue("Missing tokens for ADD",true);
			System.out.println(ex);
		}
	}

	@Test
	public void missingDELTokens(){
		try{
			new Modification("attributeName DEL");
			fail("Exception should have been raised for missing DEL value");
		}
		catch(DmcValueException ex){
			assertTrue("Missing tokens for DEL",true);
			System.out.println(ex);
		}
	}
	
	@Test
	public void okayADD() throws DmcValueException {
		Modification mod = new Modification("attributeName DEL value1");
		assertTrue("Parsed okay",true);
		
		System.out.println(mod);
	}
	
	
	
}
