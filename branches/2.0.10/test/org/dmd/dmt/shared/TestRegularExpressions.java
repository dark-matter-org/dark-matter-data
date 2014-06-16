package org.dmd.dmt.shared;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestRegularExpressions {

	@Test
	public void testCamelCase(){
		String ok 					= "hereIsAValidName";
		String okOneLetter 			= "a";
		String okWithNumbers		= "hereIsAValidNameWith99";
		String startsWithNumber 	= "9NineNoNotValid";
		String hasOtherCharacters	= "wow!";
		
		String camelCase = "[a-zA-Z][a-zA-Z0-9]*";
		
		assertTrue("It matched", ok.matches(camelCase));
		
		assertTrue("It matched", okWithNumbers.matches(camelCase));
		
		assertTrue("It matched", okOneLetter.matches(camelCase));
		
		assertFalse("This shouldn't match!", startsWithNumber.matches(camelCase));
		
		assertFalse("This shouldn't match!", hasOtherCharacters.matches(camelCase));
		
	}
}
