package org.dmd.dmt.shared;

import java.util.Iterator;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.TestDataCache;
import org.dmd.dmt.TestLogger;
import org.dmd.dmt.shared.generated.dmo.DmtASAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;
import org.junit.Test;

public class TestLazyResolution {
	
	static {
		DmcOmni.instance().addAttributeSchema(DmtASAG.instance());
		DmcOmni.instance().logger(new TestLogger());
	}

//	@Test
//	public void testBasicResolutionSV() throws DmcValueException {
//		TestDataCache cache = new TestDataCache();
//		
//		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
//		obj1.setName("obj1");
//		obj1.setSvString("Some value");
//		cache.add(obj1);
//		
//		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
//		obj2.setName("obj2");
//		obj2.setSvString("Some other value");
//		cache.add(obj2);
//		
//		DmcOmni.instance().addResolver(cache);
//		DmcOmni.instance().logger(new TestLogger());
//		DmcOmni.instance().lazyResolution(true);
//		DmcOmni.instance().backRefTracking(true);
//		
//		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
//		obj3.setName("obj3");
//		obj3.setSvString("Some other value");
//		cache.add(obj3);
//		
//		obj3.setObjRef("obj1");
//	
//		ObjWithRefsREF obj = obj3.getObjRef();
//		
//		if (obj == null)
//			System.out.println("obj3.getObj() = null");
//		else if (obj.getObject() == null)
//			System.out.println("obj3.getObj().getObject() = null");
//		else
//			System.out.println("Resolved: \n" + obj.getObject().toOIF(15));
//		
//		System.out.println(obj1.getBackRefs());
//	}
//
//	@Test
//	public void testCleanupDeadRef() throws DmcValueException {
//		TestDataCache cache = new TestDataCache();
//		
//		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
//		obj1.setName("obj1");
//		obj1.setSvString("Some value");
//		cache.add(obj1);
//		
//		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
//		obj2.setName("obj2");
//		obj2.setSvString("Some other value");
//		cache.add(obj2);
//		
//		DmcOmni.instance().addResolver(cache);
//		DmcOmni.instance().lazyResolution(true);
//		DmcOmni.instance().cleanUpDeadRefs(true);
//		
//		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
//		obj3.setName("obj3");
//		obj3.setSvString("Some other value");
//		cache.add(obj3);
//		
//		obj3.setObjRef("obj4");
//	
//		ObjWithRefsREF obj = obj3.getObjRef();
//		
//		if (obj == null)
//			System.out.println("obj3.getObj() = null");
//		else if (obj.getObject() == null)
//			System.out.println("obj3.getObj().getObject() = null");
//		else
//			System.out.println("Resolved: " + obj.getObject().toOIF(15));
//		
//	}
	
	@Test
	public void testBasicResolutionMV() throws DmcValueException {
		TestDataCache cache = new TestDataCache();
		
		System.out.println("Creating OBJ 1\n");
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		obj1.setSvString("Some value");
		cache.add(obj1);
		
		System.out.println("\n\nCreating OBJ 2\n");
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		obj2.setSvString("Some other value");
		cache.add(obj2);
		
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
		
		System.out.println("\n\nCreating OBJ 3\n");
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		obj3.setSvString("Some other value");
		cache.add(obj3);
		
		System.out.println("\n\nAdding ref to OBJ 1\n");
		obj3.addObjRefMV("obj1");
		
		System.out.println("\n\nAdding ref to OBJ 2\n");
		obj3.addObjRefMV("obj2");
	
		System.out.println("\nGetting ref iterator...");
		Iterator<ObjWithRefsREF> objIT = obj3.getObjRefMV();
		
		if (objIT == null)
			System.out.println("obj3.getObjRefMV() = null\n");
		
		while(objIT.hasNext()){
			ObjWithRefsREF ref = objIT.next();
			System.out.println(ref.getObject().toOIF(15));
		}
		
		System.out.println(obj1.getBackRefs());
		
		System.out.println(obj2.getBackRefs());
	}


}
