package org.dmd.dmc.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class ComplexTypeSplitterTest {

	@Test
	public void test() throws DmcValueException{
		ArrayList<ParsedNameValuePair> rc = null;
		
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
		
		try{
			rc = ComplexTypeSplitter.parse("Integer tag version=1.1.2.3 comment=\"this is cool!");
			assertEquals("Expected exception", true, false);
		}
		catch(DmcValueException ex){
			System.out.println("Expected exception:\n\n" + ex.toString());
		}
		
		try{
			rc = ComplexTypeSplitter.parse("Integer tag version=1.1.2.3 comment=\"this is cool! obsolete=\"2.0.1.1\"");
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
		
		rc = ComplexTypeSplitter.parse("Integer tag version=1.1.2.3 comment=\"\"");
		
		assertEquals("Should be 4 values", 4, rc.size());
		assertEquals("First value should be Integer", "Integer", rc.get(0).value);
		assertEquals("Second value should be tag", "tag", rc.get(1).value);
		assertEquals("Third value name should be version", "version", rc.get(2).name);
		assertEquals("Third value should be 1.1.2.3", "1.1.2.3", rc.get(2).value);
		assertEquals("Fourth value name should be comment", "comment", rc.get(3).name);
		assertEquals("Fourth value should be null", null, rc.get(3).value);
		
		rc = ComplexTypeSplitter.parse("   Integer tag version=1.1.2.3 	\t	comment=\"this 	is cool!\"");
		
		assertEquals("Should be 4 values", 4, rc.size());
		assertEquals("First value should be Integer", "Integer", rc.get(0).value);
		assertEquals("Second value should be tag", "tag", rc.get(1).value);
		assertEquals("Third value name should be version", "version", rc.get(2).name);
		assertEquals("Third value should be 1.1.2.3", "1.1.2.3", rc.get(2).value);
		assertEquals("Fourth value name should be comment", "comment", rc.get(3).name);
		assertEquals("Fourth value should be \"this is cool!\"", "this is cool!", rc.get(3).value);
		
		// Using a mix of single tokens and quoted text
		rc = ComplexTypeSplitter.parse("Integer tag 1.1.2.3 \"this 	is cool!\"");
		
		assertEquals("Should be 4 values", 4, rc.size());
		assertEquals("First value should be Integer", "Integer", rc.get(0).value);
		assertEquals("Second value should be tag", "tag", rc.get(1).value);
		assertEquals("Third value should be 1.1.2.3", "1.1.2.3", rc.get(2).value);
		assertEquals("Fourth value should be \"this is cool!\"", "this is cool!", rc.get(3).value);
		for(ParsedNameValuePair nvp: rc){
			System.out.println(nvp.toString());
		}
		
		// OK
		rc = ComplexTypeSplitter.parse("Integer:tag:version=1.1.2.3:comment=\"this is cool!\"",':');
		
		assertEquals("Should be 4 values", 4, rc.size());
		assertEquals("First value should be Integer", "Integer", rc.get(0).value);
		assertEquals("Second value should be tag", "tag", rc.get(1).value);
		assertEquals("Third value name should be version", "version", rc.get(2).name);
		assertEquals("Third value should be 1.1.2.3", "1.1.2.3", rc.get(2).value);
		assertEquals("Fourth value name should be comment", "comment", rc.get(3).name);
		assertEquals("Fourth value should be \"this is cool!\"", "this is cool!", rc.get(3).value);

//		ComplexTypeSplitter.debug=true;
		//OK
		rc = ComplexTypeSplitter.parse("Integer::version=1.1.2.3:comment=\"this is cool!\"",':');
		assertEquals("Should be 4 values", 4, rc.size());
		assertEquals("First value should be Integer", "Integer", rc.get(0).value);
		assertEquals("Second value should be null", null, rc.get(1).value);
		assertEquals("Third value name should be version", "version", rc.get(2).name);
		assertEquals("Third value should be 1.1.2.3", "1.1.2.3", rc.get(2).value);
		assertEquals("Fourth value name should be comment", "comment", rc.get(3).name);
		assertEquals("Fourth value should be \"this is cool!\"", "this is cool!", rc.get(3).value);
		
//		ComplexTypeSplitter.debug=true;
		
		rc = ComplexTypeSplitter.parse("name type id comment=\"various things\" version=1.2.3.4");
//		for(NameValuePair nvp: rc){
//			System.out.println(nvp.toString());
//		}
		assertEquals("Should be 5 values", 5, rc.size());
		
		rc = ComplexTypeSplitter.parse("v1::v3",':');
		assertEquals("Should be 3 values", 3, rc.size());
//		for(NameValuePair nvp: rc){
//			System.out.println(nvp.toString());
//		}
		
//		ComplexTypeSplitter.debug=true;

		rc = ComplexTypeSplitter.parse("::",':');
		assertEquals("Should be 3 values", 3, rc.size());
//		for(NameValuePair nvp: rc){
//			System.out.println(nvp.toString());
//		}
		
		// Greedy parsing with no value for the greedy part
		rc = ComplexTypeSplitter.parse("first value: secondvalue :",':',2);
		assertEquals("Should be 3 values", 3, rc.size());

		// Greedy parsing with the greedy part 
		rc = ComplexTypeSplitter.parse("first value: secondvalue : here's the greedy part ",':',2);
		assertEquals("Should be 3 values", 3, rc.size());

		ComplexTypeSplitter.debug = true;
		// Greedy parsing with the greedy part that contains another separator - which shouldn't matter
		rc = ComplexTypeSplitter.parse("first value: secondvalue :here's the greedy part : with some other stuff",':',2);
		assertEquals("Should be 3 values", 3, rc.size());
		assertEquals("Greedy value should be \"here's the greedy part : with some other stuff\"", "here's the greedy part : with some other stuff", rc.get(2).value);
		

	}

}
