package org.dmd.dmt.shared;

import java.util.Iterator;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.TestDataCache;
import org.dmd.dmt.TestLogger;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLazyResolution {
	
	static String OBJ3REF = "References to: obj1\n  obj3 via SV objRef\n"; 
	
	static {
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().logger(new TestLogger());
	}

	@Test
	public void testBasicResolutionSV() throws DmcValueException {
		TestDataCache cache = new TestDataCache();
		
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		obj1.setSvString("Some value");
		cache.add(obj1);
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		obj2.setSvString("Some other value");
		cache.add(obj2);
		
		DmcOmni.instance().reset();
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
		
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		obj3.setSvString("Some other value");
		cache.add(obj3);
		
		obj3.setObjRef("obj1");
	
		ObjWithRefsREF obj = obj3.getObjRef();
		
		assertNotNull("Reference to obj1 should be resolved.", obj);
		
		assertEquals("Referred object should be obj1 instance", obj.getObject(), obj1);
		
		System.out.println("obj1.getBackrefs() = " + obj1.getBackRefs());

		assertEquals("obj1 getBackRefs() must indicate obj3 reference", obj1.getBackRefs(), OBJ3REF);

		System.out.println("obj1.getBackrefs() = " + obj1.getBackRefs());
		
		System.out.println("\n---------------------------------------- testBasicResolutionSV()\n\n");
	}

	@SuppressWarnings("static-access")
	@Test
	public void testCleanupDeadRef() throws DmcValueException {
		TestDataCache cache = new TestDataCache();
		
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		obj1.setSvString("Some value");
		cache.add(obj1);
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		obj2.setSvString("Some other value");
		cache.add(obj2);
		
		DmcOmni.instance().reset();
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().cleanUpDeadRefs(true);
		
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		obj3.setSvString("Some other value");
		cache.add(obj3);
		
		obj3.setObjRef("obj4");
		
		assertNotNull("obj3 SHOULD have the objRef attribute", obj3.get(obj3.__objRef.id));
	
		@SuppressWarnings("unused")
		ObjWithRefsREF obj = obj3.getObjRef();
		
		assertNull("obj3 should NOT have the objRef attribute", obj3.get(obj3.__objRef.id));
				
		System.out.println("\n---------------------------------------- testCleanupDeadRef()\n\n");
	}
	
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
		
		DmcOmni.instance().reset();
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
		DmcOmni.instance().setCacheIF(cache);
		
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
		
		assertNotNull("MV objref shouldn't be null", objIT);
		
		assertEquals("Should be 2 values in the MV reference.", 2, obj3.getObjRefMVSize());
		
		while(objIT.hasNext()){
			ObjWithRefsREF ref = objIT.next();
			System.out.println(ref.getObject().toOIF(15));
		}
		
		System.out.println(obj1.getBackRefs());
		
		System.out.println(obj2.getBackRefs());
		
		cache.delete(obj1.getName());
		
		assertEquals("Should be 1 value in the MV reference.", 1, obj3.getObjRefMVSize());
		
		cache.delete(obj2.getName());
		
		assertEquals("Should be no values in the MV reference.", 0, obj3.getObjRefMVSize());
		
		
		
		System.out.println(obj3.toOIF(15));
		
	}
	
	@Test
	public void testBackrefTrackingHashMap() throws DmcValueException{
		ObjWithRefs obj1 = new ObjWithRefs();
		obj1.setName("object1");
		
		ObjWithRefs obj2 = new ObjWithRefs();
		obj2.setName("object2");

		DmcOmni.instance().reset();
		DmcOmni.instance().backRefTracking(true);
		
		obj1.addObjRefHM(obj2);
	}


}
