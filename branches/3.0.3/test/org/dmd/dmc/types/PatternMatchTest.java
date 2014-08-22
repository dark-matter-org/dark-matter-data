package org.dmd.dmc.types;

import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class PatternMatchTest {

	@Test
	public void test() throws DmcValueException{
		
		String test = "TestEnum";
		boolean result = test.matches("^.*Enum");
		assertEquals("The pattern should have matched",true,result);
		
		String test2 = "Enum";
		result = test2.matches("^.*Enum");
		assertEquals("The pattern should have matched",true,result);
		
	}

}
