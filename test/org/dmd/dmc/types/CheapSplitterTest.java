package org.dmd.dmc.types;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class CheapSplitterTest {

	@Test
	public void test() throws DmcValueException{
		ArrayList<String> strings = CheapSplitter.split(": here : we : go", ':', true, true);
		
		System.out.println(strings.toString());
		assertEquals("Size should be 6", 6, strings.size());
		assertEquals("Fourth value should be we", "we", strings.get(3).trim());

		strings = CheapSplitter.split(":", ':', false, true);
		assertEquals("Size should be 0", 0, strings.size());
		
		strings = CheapSplitter.split(":", ':', true, true);
		assertEquals("Size should be 1", 1, strings.size());
		
		strings = CheapSplitter.split("start :", ':', true, true);
		assertEquals("Size should be 2", 2, strings.size());
		
		strings = CheapSplitter.split("start :", ':', false, true);
		assertEquals("Size should be 1", 1, strings.size());
		
		strings = CheapSplitter.split(": field label : tool tip", ':', true, true);
		assertEquals("Size should be 4", 4, strings.size());
		assertEquals("First value should be colon", ":", strings.get(0));
		assertEquals("Second value should be field label", "field label", strings.get(1));
		assertEquals("Third value should be colon", ":", strings.get(2));
		assertEquals("Fourth value should be colon", "tool tip", strings.get(3));
		
		
	}

}
