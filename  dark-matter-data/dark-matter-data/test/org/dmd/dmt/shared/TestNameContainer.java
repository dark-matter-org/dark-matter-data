package org.dmd.dmt.shared;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.IntegerName;
import org.dmd.dmc.types.StringName;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.junit.Test;


public class TestNameContainer {

	@Test
	public void testNamesInHashSet() throws DmcValueException{
		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("object1");
		
		IntegerName in1 = new IntegerName(42);
		IntegerName in2 = new IntegerName(9);
		StringName	sn1 = new StringName("joe");
		StringName	sn2 = new StringName("bill");
		StringName	sn3 = new StringName("sally");
		
		obj.addHsNames(in1);
		obj.addHsNames(in2);
		obj.addHsNames(sn1);
		obj.addHsNames(sn2);
		
		System.out.println(obj);
		
		if (obj.hsNamesContains(in1))
			System.out.println("have " + in1);
		
		if (obj.hsNamesContains(sn3))
			System.out.println("      have " + sn3);
		else
			System.out.println("don't have " + sn3);
		
		ObjWithRefs modrec = obj.getModificationRecorder();
		
		modrec.addHsNames(sn3);
		modrec.delHsNames(in1);
		modrec.delHsNames(sn2);
		modrec.addHsNames(sn3);
		
		SetRequest request = new SetRequest(modrec);
		
		System.out.println("\n\n" + request);
	}
}
