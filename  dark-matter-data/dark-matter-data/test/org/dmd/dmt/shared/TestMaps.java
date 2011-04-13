package org.dmd.dmt.shared;

import java.util.TreeMap;
import java.util.Vector;

import org.dmd.dmc.types.IntegerToString;
import org.junit.Test;

public class TestMaps {
	
	static final int	CONTAINER 	= 0;
	static final int	BACKREFS	= 1;
	static final int	MODIFIER	= 2;
	static final int	LASTVAL		= 3;

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
	
	@Test
	public void testVectors(){
		Vector<Object>	vector = null;
			
		if (vector == null){
			vector = new Vector<Object>(1,1);
			vector.add(null);
		}
		
		vector.set(CONTAINER, 0);
		
		System.out.println(">>> " + vector.elementAt(0));
		
		vector.add(-1);
		vector.add(-1);
		vector.add(-1);
		vector.set(MODIFIER, 2);

		System.out.println(" size = " + vector.size());
		
		System.out.println(">>> " + vector.elementAt(MODIFIER));
		
		
	}
}