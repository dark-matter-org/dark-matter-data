package org.dmd.dmt.shared;

import java.util.Iterator;

import org.dmd.dmc.types.StringToString;
import org.dmd.dmt.shared.generated.dmo.PrimitiveTSDMO;
import org.junit.Test;

public class TestTreeStringToString {

	@Test
	public void test1(){
		PrimitiveTSDMO dmo = new PrimitiveTSDMO();
		
		dmo.addTsStringToString(new StringToString("B", "B value"));
		dmo.addTsStringToString(new StringToString("A", "A value"));
		dmo.addTsStringToString(new StringToString("1", "1 value"));
		
		Iterator<StringToString> it = dmo.getTsStringToString();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
