package org.dmd.dmt.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.StringName;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;
import org.dmd.dmt.TestDataCache;
import org.dmd.dmt.TestLogger;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;
import org.dmd.dmt.shared.generated.types.SomeRelation;
import org.dmd.dmw.DmwDeserializer;
import org.dmd.dmw.DmwOmni;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.DmcTraceableInputStream;
import org.dmd.util.DmcTraceableOutputStream;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestReferenceTracking {
	
	static String OBJ3REF = "References to: obj1\n  (ObjWithRefs) obj3 via SV objRef\n"; 
	
	static String OBJ3MVREF = "References to: obj1\n  (ObjWithRefs) obj3 via MV objRefMV\n"; 
	
	static File	temp;

	static {
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().logger(new TestLogger());
	}

	static boolean initialized = false;

	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DebugInfo.debug("STARTING...");
			DmpSchemaAG dmp = new DmpSchemaAG();
			DmtSchemaAG dmt = new DmtSchemaAG();			
			DmwOmni.instance().addSchema(dmp);
			DmwOmni.instance().addSchema(dmt);
			
	        File curr = new File(".");
	        String runDir;
			runDir = curr.getCanonicalPath();
			System.out.println("*** Serialization running from: " + runDir);
	
			temp = new File(runDir + File.separator + "serialize.txt");
			
			initialized = true;
		}
	}

	@Test
	public void testSingleValuedReference() throws DmcValueException {
		System.out.println("\n>>> testSingleValuedReference()\n\n");
		
		TestDataCache cache = new TestDataCache();
		DmcOmni.instance().reset();
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
				
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		cache.add(obj1);
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		cache.add(obj2);
		
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		cache.add(obj3);
		
		obj3.setObjRef("obj1");
	
		ObjWithRefsREF obj = obj3.getObjRef();
		
		assertNotNull("Reference to obj1 should be resolved.", obj);
		
		assertEquals("Referred object should be obj1 instance", obj.getObject(), obj1);
		
		System.out.println("TEST 1: obj1.getBackrefs() = " + obj1.getBackRefs());

		assertEquals("obj1 getBackRefs() must indicate obj3 reference", obj1.getBackRefs(), OBJ3REF);
		
		obj3.remObjRef();
		
		assertEquals("obj1 should have no references", false, obj1.isReferenced());
		
		System.out.println("TEST 1: obj1.getBackrefs() = " + obj1.getBackRefs());
		
		obj2.setObjRef(obj1);
		
		obj3.setObjRef(obj1);
		
		assertEquals("obj1 should indicate that it has 2 references", obj1.referenceCount(), 2);
		
		System.out.println("TEST 1: obj1.getBackrefs() = " + obj1.getBackRefs());
		
		obj2.remObjRef();

		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);
		
		System.out.println("TEST 1: obj1.getBackrefs() = " + obj1.getBackRefs());

		System.out.println("\n<<< testSingleValuedReference()\n\n");
	}
	
	@Test
	public void testMultivaluedReference() throws DmcValueException, DmcValueExceptionSet {
		System.out.println("\n>>> testMultivaluedReference()\n\n");
		
		TestDataCache cache = new TestDataCache();
		DmcOmni.instance().reset();
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
				
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		cache.add(obj1);
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		cache.add(obj2);
		
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		cache.add(obj3);
		
		obj3.addObjRefMV("obj1");
	
		Iterator<ObjWithRefsREF> obj = obj3.getObjRefMV();
		
		assertNotNull("Reference to obj1 should be resolved.", obj);
		
		System.out.println("TEST 2: obj1.getBackrefs() = " + obj1.getBackRefs());

		assertEquals("obj1 getBackRefs() must indicate obj3 reference", obj1.getBackRefs(), OBJ3MVREF);
		
		obj3.delObjRefMV(obj1);
		
		assertEquals("obj1 should have no references", false, obj1.isReferenced());
		
		System.out.println("TEST 2: obj1.getBackrefs() = " + obj1.getBackRefs());
		
		obj2.addObjRefMV(obj1);
		
		obj3.addObjRefMV(obj1);
		
		assertEquals("obj1 should indicate that it has 2 references", obj1.referenceCount(), 2);
		
		System.out.println("TEST 2: obj1.getBackrefs() = " + obj1.getBackRefs());
		
		obj2.delObjRefMV(obj1);

		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);
		
		System.out.println("TEST 2: obj1.getBackrefs() = " + obj1.getBackRefs());
		
		obj3.delObjRefMV(obj1.getName());

		assertEquals("obj1 should indicate that it has 0 references", obj1.referenceCount(), 0);
		
		System.out.println(obj3.toOIF());
		
		ObjWithRefsDMO modrec = obj3.getModificationRecorder();
		modrec.setObjRef(obj2);
		modrec.addObjRefMV(obj1);
		
		System.out.println(modrec.toOIF(15));
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);
		
		assertEquals("obj2 should indicate that it has 1 reference", obj2.referenceCount(), 1);
		
		System.out.println("\n<<< testMultivaluedReference()\n\n");
	}
	
	@Test
	public void testNthReferences() throws DmcValueException {
		System.out.println("\n>>> testNthReferences()\n\n");
		
		TestDataCache cache = new TestDataCache();
		DmcOmni.instance().reset();
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
				
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		cache.add(obj1);
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		cache.add(obj2);
		
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		cache.add(obj3);
		
		obj3.setNthIndexedObjRef(1, obj1);
		
		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);

		obj3.setNthIndexedObjRef(1, null);
		
		assertEquals("obj1 should indicate that it has no reference", obj1.referenceCount(), 0);
		
		ObjWithRefsDMO modrec = obj3.getModificationRecorder();
		modrec.setNthIndexedObjRef(2, obj1);
		
		// There are no string or object name interfaces for the set nth stuff at the moment
//		obj3.setNthIndexedObjRef(2, "obj1");
		
		System.out.println("\n<<< testNthReferences()\n\n");
	}
	
	@Test
	public void testExtendedReferences() throws DmcValueException, DmcValueExceptionSet {
		System.out.println("\n>>> testExtendedReferences()\n\n");
		
		TestDataCache cache = new TestDataCache();
		DmcOmni.instance().reset();
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
				
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		cache.add(obj1);
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		cache.add(obj2);
		
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		cache.add(obj3);
		
		SomeRelation	rel1 = new SomeRelation(obj1, 1, 1);

		obj3.addSomeRelationMV(rel1);
		
		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);
		
		SomeRelation	rel2 = new SomeRelation(new StringName("obj3"), 3, 3);
		
		obj1.addSomeRelationMV(rel2);
		
		obj1.getSomeRelationMV();
		
		assertEquals("obj3 should indicate that it has 1 reference", obj3.referenceCount(), 1);

		SomeRelation	rel3 = new SomeRelation(new StringName("obj2"), 2, 2);

		obj3.addSomeRelationMV(rel3);
		
		obj3.getSomeRelationMV();
		
//		obj3.resolveReferencesExceptClass(cache);
		
		assertEquals("obj2 should indicate that it has 1 reference", obj2.referenceCount(), 1);
		
//		obj3.delSomeRelationMV("obj2:2:2");
		obj3.delSomeRelationMV(rel3);
		
		assertEquals("obj2 should indicate that it has no reference", obj2.referenceCount(), 0);
		
		obj3.setNthSomeRelationMVI(2, rel3);
		
		assertEquals("obj2 should indicate that it has 1 reference", obj2.referenceCount(), 1);

		obj3.setNthSomeRelationMVI(2, null);
		
		assertEquals("obj2 should indicate that it has no reference", obj2.referenceCount(), 0);
		
		System.out.println("\n<<< testExtendedReferences()\n\n");
		
	}
	
	@Test
	public void testResolveNthReferences() throws Exception {
		System.out.println("\n>>> testResolveNthReferences()\n\n");
		
		TestDataCache cache = new TestDataCache();
		DmcOmni.instance().reset();
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
		DmcOmni.instance().setCacheIF(cache);
				
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		cache.add(obj1);
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		cache.add(obj2);
		
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		cache.add(obj3);
		
		SomeRelation	rel3 = new SomeRelation(obj2, 2, 2);

		obj3.setNthIndexedObjRef(1, obj1);
		obj3.addObjRefMV(obj1);
		obj3.setObjRef(obj2);
		obj3.setNthSomeRelationMVI(2, rel3);
		
		assertEquals("obj1 should indicate that it has 2 references", obj1.referenceCount(), 2);
		
		assertEquals("obj2 should indicate that it has 2 references", obj2.referenceCount(), 2);
		
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));
		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);
		obj3.serializeIt(dos);
		os.close();
		
		// Remove the references
		obj3.setNthIndexedObjRef(1, null);
		obj3.remObjRef();
		obj3.remObjRefMV();
		obj3.setNthSomeRelationMVI(2, null);
		
		assertEquals("obj1 should indicate that it has no reference", obj1.referenceCount(), 0);
		
		assertEquals("obj2 should indicate that it has no reference", obj2.referenceCount(), 0);
		
		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		DmwDeserializer	deserializer = new DmwDeserializer(DmwOmni.instance().getSchema());
		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
		ArrayList<DmwWrapper> dmws = new ArrayList<DmwWrapper>();
		while(dis.available() > 0){
			dmws.add(deserializer.deserialize(dis));
		}
		
		for(DmwWrapper wrapper: dmws){
			System.out.println(wrapper.toOIF());
			wrapper.resolveReferences(cache);
//			wrapper.getDmcObject().resolveReferencesWithBackrefs(cache, false);
			
			// Hang on to this for some more testing below
			obj3 = (ObjWithRefsDMO) wrapper.getDmcObject();
		}
		
		assertEquals("obj1 should indicate that it has 2 references", obj1.referenceCount(), 2);
		
		assertEquals("obj2 should indicate that it has 2 references", obj2.referenceCount(), 2);
		
		assertEquals("obj1.isReferenced() should be true", obj1.isReferenced(), true);
		
		obj3.remObjRef();
		
		assertEquals("obj2 should indicate that it has 1 reference", obj2.referenceCount(), 1);
		
		System.out.println(obj1.getBackRefs());

//		obj3.setNthSomeRelationMVI(2, null);
//		
//		assertEquals("obj2 should indicate that it has 1 reference", obj2.referenceCount(), 1);
		
		obj2.youAreDeleted();
//		
//		assertEquals("obj1 should indicate that it has no reference", obj1.referenceCount(), 0);
//		
//		ObjWithRefsDMO modrec = obj3.getModificationRecorder();
//		modrec.setNthIndexedObjRef(2, obj1);
		
		// There are no string or object name interfaces for the set nth stuff at the moment
//		obj3.setNthIndexedObjRef(2, "obj1");
		
		System.out.println("\n<<< testResolveNthReferences()\n\n");
	}
	
	@Test
	public void testReferencesUsingApplyModifier() throws DmcValueException, DmcValueExceptionSet {
		System.out.println("\n>>> testReferencesUsingApplyModifier()\n\n");
		
		TestDataCache cache = new TestDataCache();
		DmcOmni.instance().reset();
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
				
		ObjWithRefsDMO obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		cache.add(obj1);
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		cache.add(obj2);
		
		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");
		cache.add(obj3);
		
		ObjWithRefsDMO modrec = obj3.getModificationRecorder();
		
		modrec.setObjRef("obj2");
		
//		obj3.applyModifier(modrec.getModifier());
//		
//		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);

		System.out.println("\n<<< testReferencesUsingApplyModifier()\n\n");
	}
	


}
