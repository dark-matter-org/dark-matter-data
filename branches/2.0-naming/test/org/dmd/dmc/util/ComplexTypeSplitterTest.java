package org.dmd.dmc.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class ComplexTypeSplitterTest {

	@Test
	public void test() throws DmcValueException{
		ArrayList<NameValuePair> rc = null;
		
		rc = ComplexTypeSplitter.parse("\"hello\"");
		
		assertEquals("Should be one value", 1, rc.size());
		
		assertEquals("Expected hello", "hello", rc.get(0).value);
		
		try{
			rc = ComplexTypeSplitter.parse("\"hello");
			assertEquals("Expected exception", true, false);	
		}
		catch(DmcValueException ex){
			System.out.println("Expected exception:\n\n" + ex.toString());
		}
		
		rc = ComplexTypeSplitter.parse("tag");
		
		assertEquals("Should be one value", 1, rc.size());
		assertEquals("Expected tag", "tag", rc.get(0).value);
		
		try{
			rc = ComplexTypeSplitter.parse("hey\"");
			assertEquals("Expected exception", true, false);
		}
		catch(DmcValueException ex){
			System.out.println("Expected exception:\n\n" + ex.toString());
		}
		
		try{
			rc = ComplexTypeSplitter.parse("version= blah");
			assertEquals("Expected exception", true, false);
		}
		catch(DmcValueException ex){
			System.out.println("Expected exception:\n\n" + ex.toString());
		}
		
		try{
			rc = ComplexTypeSplitter.parse("version=");
			assertEquals("Expected exception", true, false);
		}
		catch(DmcValueException ex){
			System.out.println("Expected exception:\n\n" + ex.toString());
		}
		
		rc = ComplexTypeSplitter.parse("Integer tag");
		
		assertEquals("Should be 2 values", 2, rc.size());
		assertEquals("First value should be Integer", "Integer", rc.get(0).value);
		assertEquals("Second value should be tag", "tag", rc.get(1).value);
		
		rc = ComplexTypeSplitter.parse("Integer tag version=1.1.2.3");
		
		assertEquals("Should be 3 values", 3, rc.size());
		assertEquals("First value should be Integer", "Integer", rc.get(0).value);
		assertEquals("Second value should be tag", "tag", rc.get(1).value);
		assertEquals("Third value name should be version", "version", rc.get(2).name);
		assertEquals("Third value should be 1.1.2.3", "1.1.2.3", rc.get(2).value);
		
		try{
			rc = ComplexTypeSplitter.parse("Integer tag version=1.1.2.3 comment\"this is cool!\"");
			assertEquals("Expected exception", true, false);
		}
		catch(DmcValueException ex){
			System.out.println("Expected exception:\n\n" + ex.toString());
		}
		
		rc = ComplexTypeSplitter.parse("Integer tag version=1.1.2.3 comment=\"this is cool!\"");
		
		assertEquals("Should be 4 values", 4, rc.size());
		assertEquals("First value should be Integer", "Integer", rc.get(0).value);
		assertEquals("Second value should be tag", "tag", rc.get(1).value);
		assertEquals("Third value name should be version", "version", rc.get(2).name);
		assertEquals("Third value should be 1.1.2.3", "1.1.2.3", rc.get(2).value);
		assertEquals("Fourth value name should be comment", "comment", rc.get(3).name);
		assertEquals("Fourth value should be \"this is cool!\"", "this is cool!", rc.get(3).value);
		
		
	}

}
