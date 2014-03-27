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
import org.dmd.dms.generated.types.DmcTypeModifierMV;
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
	
	static String OBJ3REF_PART1 = "References to: obj1 ("; 
	static String OBJ3REF_PART2 = ")\n  (ObjWithRefs) obj3 via SV objRef\n"; 
	
	static String OBJ3MVREF_PART1 = "References to: obj1 (";
	static String OBJ3MVREF_PART2 = ")\n  (ObjWithRefs) obj3 via MV objRefMV\n";
	
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
	public void testSingleValuedReference() throws DmcValueException, DmcValueExceptionSet {
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
		
		///////////////////////////////////////////////////////////////////////
		// Lazy resolution of SV objref
		
		// obj3 objRef -> obj unresolved
		obj3.setObjRef("obj1");
	
		// Lazy resolution of SV objRef
		ObjWithRefsREF obj = obj3.getObjRef();
		
		assertNotNull("Reference to obj1 should be resolved.", obj);
		
		assertEquals("Referred object should be obj1 instance", obj.getObject(), obj1);
		
		System.out.println("TEST 1: obj1.getBackrefs() = " + obj1.getBackRefs());

		String comparison = OBJ3REF_PART1 + System.identityHashCode(obj1) + OBJ3REF_PART2;
		assertEquals("obj1 getBackRefs() must indicate obj3 reference", obj1.getBackRefs(), comparison);
		
		///////////////////////////////////////////////////////////////////////
		// REM of an SV objref

		obj3.remObjRef();
		
		assertEquals("obj1 should have no references", false, obj1.isReferenced());
		
		///////////////////////////////////////////////////////////////////////
		// Multiple referring objects via SV objref
		
		obj2.setObjRef(obj1);
		
		obj3.setObjRef(obj1);
		
		assertEquals("obj1 should indicate that it has 2 references", obj1.referenceCount(), 2);
				
		obj2.remObjRef();

		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);
		
		obj3.remObjRef();
		
		assertEquals("obj1 should indicate that it has no reference", obj1.referenceCount(), 0);
		
		///////////////////////////////////////////////////////////////////////
		// Lazy resolution after applying modifier
		
		ObjWithRefsDMO modrec;
		
		modrec = obj3.getModificationRecorder();
		
		modrec.setObjRef("obj1");
		
		obj3.applyModifier(modrec.getModifier());
		
		obj3.getObjRef();
		
		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);
		
		obj3.remObjRef();

		assertEquals("obj1 should indicate that it has no reference", obj1.referenceCount(), 0);
		
		///////////////////////////////////////////////////////////////////////
		// direct set and overwrite of sv objref via modifier
		
		modrec = obj3.getModificationRecorder();

		modrec.setObjRef(obj1);
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);
		
		modrec = obj3.getModificationRecorder();

		modrec.setObjRef(obj2);
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has no reference", obj1.referenceCount(), 0);
		
		assertEquals("obj2 should indicate that it has 1 reference", obj2.referenceCount(), 1);
		
		
		obj3.remObjRef();
		
		///////////////////////////////////////////////////////////////////////
		// Explicit resolution after applying modifier
		
		modrec = obj3.getModificationRecorder();
		
		modrec.setObjRef("obj1");
		
		obj3.applyModifier(modrec.getModifier());
		
		obj3.resolveReferencesExceptClass(cache);
		
		assertEquals("obj1 should indicate that it has 1 reference", obj1.referenceCount(), 1);
		
		///////////////////////////////////////////////////////////////////////
		// Overwriting an SV objref via a modifier
		
		modrec = obj3.getModificationRecorder();
		
		modrec.setObjRef("obj2");
		
		obj3.applyModifier(modrec.getModifier());
		
		obj3.resolveReferencesExceptClass(cache);
		
		assertEquals("obj1 should indicate that it has no reference", obj1.referenceCount(), 0);
		
		assertEquals("obj2 should indicate that it has 1 reference", obj2.referenceCount(), 1);
		
		obj3.remObjRef();
		
		assertEquals("obj2 should indicate that it has no reference", obj2.referenceCount(), 0);
		
		///////////////////////////////////////////////////////////////////////
		// Overwriting an SV directly
		
		obj3.setObjRef(obj1);
		
		obj3.setObjRef(obj2);
		
		assertEquals("obj1 should indicate that it has no reference", obj1.referenceCount(), 0);
		
		assertEquals("obj2 should indicate that it has 1 reference", obj2.referenceCount(), 1);
		
		///////////////////////////////////////////////////////////////////////
		// Clean up of backrefs after modifier REM
		
		modrec = obj3.getModificationRecorder();
		
		modrec.remObjRef();
		
		obj3.applyModifier(modrec.getModifier());

		assertEquals("obj2 should indicate that it has no reference", obj2.referenceCount(), 0);

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
		
		///////////////////////////////////////////////////////////////////////
		// Lazy resolution of an MV objref
		
		obj3.addObjRefMV("obj1");
	
		Iterator<ObjWithRefsREF> obj = obj3.getObjRefMV();
		
		assertNotNull("Reference to obj1 should be resolved.", obj);
		
		String comparison = OBJ3MVREF_PART1 + System.identityHashCode(obj1) + OBJ3MVREF_PART2;
		assertEquals("obj1 getBackRefs() must indicate obj3 reference", comparison, obj1.getBackRefs());
		
		///////////////////////////////////////////////////////////////////////
		// Direct removal of an MV objref value
		
		obj3.delObjRefMV(obj1);
		
		assertEquals("obj1 should have no references", false, obj1.isReferenced());
		
		///////////////////////////////////////////////////////////////////////
		// Multiple references to an object via MV objrefs
		
		obj2.addObjRefMV(obj1);
		
		obj3.addObjRefMV(obj1);
		
		assertEquals("obj1 should indicate that it has 2 references", 2, obj1.referenceCount());
				
		obj2.delObjRefMV(obj1);

		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());
				
		obj3.delObjRefMV(obj1.getName());

		assertEquals("obj1 should indicate that it has 0 references", 0, obj1.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// Objref adds via modifier
		
		ObjWithRefsDMO modrec = obj3.getModificationRecorder();
		modrec.addObjRefMV(obj1);
		modrec.addObjRefMV(obj2);
		
		System.out.println(modrec.toOIF(15));
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());
		
		assertEquals("obj2 should indicate that it has 1 reference", 1, obj2.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// Objref del via modifier
		
		modrec = obj3.getModificationRecorder();
		modrec.delObjRefMV(obj1);
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());
		
		assertEquals("obj3 objRefMVSize should be 1", 1, obj3.getObjRefMVSize());
		
		obj3.remObjRefMV();
		
		///////////////////////////////////////////////////////////////////////
		// resolution after modifier
		
		modrec = obj3.getModificationRecorder();
		
		modrec.addObjRefMV("obj1");
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());

		obj3.resolveReferencesExceptClass(cache);
		
		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());

		
		modrec = obj3.getModificationRecorder();
		
		modrec.addObjRefMV("obj2");
		
		obj3.applyModifier(modrec.getModifier());
		
		obj3.resolveReferencesExceptClass(cache);
		
		assertEquals("obj2 should indicate that it has 1 reference", 1, obj2.referenceCount());
		
		
		modrec = obj3.getModificationRecorder();
		
		modrec.delObjRefMV("obj1");
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());
		
		
		// Testing direct modification of an object
		DmcTypeModifierMV mods = new DmcTypeModifierMV();
		obj3.setModifier(mods);
		
		obj3.addObjRefMV(obj1);
		
		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());

		assertEquals("mods should be size 1", 1, mods.getMVSize());
		
		obj3.delObjRefMV(obj1);
		
		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());

		assertEquals("mods should be size 2", 2, mods.getMVSize());
		
		
		
		System.out.println("\n<<< testMultivaluedReference()\n\n");
	}
	
	@Test
	public void testNthReferences() throws DmcValueException, DmcValueExceptionSet {
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
		
		///////////////////////////////////////////////////////////////////////
		// set nth objref

		obj3.setNthIndexedObjRef(1, obj1);
		
		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());

		///////////////////////////////////////////////////////////////////////
		// set nth objref to null

		obj3.setNthIndexedObjRef(1, null);
		
		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// replace an existing ref with a different one

		obj3.setNthIndexedObjRef(3, obj1);
		
		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());
		
		obj3.setNthIndexedObjRef(3, obj2);
		
		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());
		assertEquals("obj2 should indicate that it has 1 reference", 1, obj2.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// remove nth attribute

		obj3.remIndexedObjRef();
		
		assertEquals("obj2 should indicate that it has no reference", 0, obj2.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// set nth via modifier

		ObjWithRefsDMO modrec = obj3.getModificationRecorder();
		
		modrec.setNthIndexedObjRef(2, obj1);
		modrec.setNthIndexedObjRef(5, obj2);
		
		obj3.applyModifier(modrec.getModifier());
		
		System.out.println(obj3.toOIF());

		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());
		assertEquals("obj2 should indicate that it has 1 reference", 1, obj2.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// set nth to null
		
		modrec = obj3.getModificationRecorder();
		
		modrec.setNthIndexedObjRef(2, null);
		
		obj3.applyModifier(modrec.getModifier());

		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// replace nth via  modifier
		
		modrec = obj3.getModificationRecorder();
		
		modrec.setNthIndexedObjRef(5, obj1);
		
		obj3.applyModifier(modrec.getModifier());

		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());
		assertEquals("obj2 should indicate that it has no reference", 0, obj2.referenceCount());
		
		obj3.remIndexedObjRef();

		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());
		
		
		
		
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
		
		///////////////////////////////////////////////////////////////////////
		// single valued extref
		
		obj3.setSomeRelationSV(rel1);
		
		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());

		///////////////////////////////////////////////////////////////////////
		// single valued extref removed
		
		obj3.remSomeRelationSV();
		
		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// lazy resolution of mv extref
		
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
		
		
		ObjWithRefsDMO modrec = obj3.getModificationRecorder();
		
		SomeRelation	relm1 = new SomeRelation(obj1, 1, 1);
		SomeRelation	relm2 = new SomeRelation(obj2, 2, 2);
//		SomeRelation	relm3 = new SomeRelation(obj3, 3, 3);
		
		///////////////////////////////////////////////////////////////////////
		// sv extref via modifier
		
		modrec.setSomeRelationSV(relm1);
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has 1 reference", 1, obj1.referenceCount());
		
		///////////////////////////////////////////////////////////////////////
		// replace sv extref via modifier
		
		modrec = obj3.getModificationRecorder();
		
		modrec.setSomeRelationSV(relm2);
		
		obj3.applyModifier(modrec.getModifier());
		
		assertEquals("obj1 should indicate that it has no reference", 0, obj1.referenceCount());
		assertEquals("obj2 should indicate that it has 1 reference", 1, obj2.referenceCount());
		
		
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
