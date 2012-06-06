package org.dmd.dmg.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGeneratorUtils {

	@Test
	public void testDotnameToCamelCase(){
		String input = "here.is.a.test";
		String output = GeneratorUtils.dotNameToCamelCase(input);
		String expected = "HereIsATest";
		
		assertEquals("Expecting proper camel case translation.", output, expected);
	}
	
	@Test
	public void testDotNameToUpperCaseConstant(){
		String input = "here.is.a.test";
		String output = GeneratorUtils.dotNameToUpperCaseConstant(input);
		String expected = "HERE_IS_A_TEST";
		
		assertEquals("Expecting proper upper case constant translation.", output, expected);
	}
}
