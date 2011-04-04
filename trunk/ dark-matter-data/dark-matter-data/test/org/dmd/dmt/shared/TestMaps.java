package org.dmd.dmt.shared;

import java.util.TreeMap;

import org.dmd.dmc.types.IntegerToString;
import org.junit.Test;

public class TestMaps {
	
	@Test
	public void testMapReturns(){
		TreeMap<Object,IntegerToString>	tm = new TreeMap<Object, IntegerToString>();
		
		IntegerToString val1 = new IntegerToString(1, "value 1");
		IntegerToString val2 = new IntegerToString(2, "value 2");
		IntegerToString val3 = new IntegerToString(1, "value 3");
		IntegerToString val4 = new IntegerToString(1, "value 1");

		IntegerToString rc = null;
		
		rc = tm.put(val1.getKey(), val1);
		if (rc == null)
			System.out.println("rc = null");
		else
			System.out.println(rc.toString());
		
		rc = tm.put(val2.getKey(), val2);
		if (rc == null)
			System.out.println("rc = null");
		else
			System.out.println(rc.toString());
		
		rc = tm.put(val3.getKey(), val3);
		if (rc == null)
			System.out.println("rc = null");
		else
			System.out.println(rc.toString());
		
		rc = tm.put(val4.getKey(), val4);
		if (rc == null)
			System.out.println("rc = null");
		else
			System.out.println(rc.toString());
		
		rc = tm.put(val1.getKey(), val1);
		if (rc == null)
			System.out.println("rc = null");
		else{
			if (val1.valuesAreEqual(rc))
				System.out.println("nothing changed " + rc.toString());
			else
				System.out.println(rc.toString());
		}
		
		
		
	}
}
