package org.dmd.dmt.shared;


import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.StringName;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dmt.TestDataCache;
import org.dmd.dmt.TestLogger;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.types.SomeRelation;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.DebugInfo;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestExtendedReferences {

	@Test
	public void testCreation() throws DmcValueException{
		SomeRelation	rel = new SomeRelation(new StringName("some name"), 4, 2);
		
		assertNotNull(rel.getName());
		
		System.out.println(rel);
	}
	
	@Test
	public void testParsing() throws DmcValueException{
		SomeRelation	rel = new SomeRelation("some name:4:2");
		
		assertEquals("some name", rel.getName().getNameString());
		assertEquals(4,rel.getCount().intValue());
		assertEquals(2,rel.getOrder().intValue());
		
		System.out.println(rel);
	}
	
	@Test
	public void testSetRequest() throws DmcValueException{
		SomeRelation	rel = new SomeRelation(new StringName("some name"), 4, 2);

		ObjWithRefsDMO	owr = new ObjWithRefsDMO();
		owr.setName(new StringName("obj1"));
		
		ObjWithRefsDMO modrec = owr.getModificationRecorder();
		modrec.setNthSomeRelationMVI(0, rel);
		
		SetRequestDMO	request = new SetRequestDMO();
        request.add(MetaDMSAG.__modify, modrec.getModifier());
        
        System.out.println(request.toOIF());
	}
	
	@Test
	public void testModification() throws DmcValueException, DmcValueExceptionSet{
		DmpSchemaAG dmp = new DmpSchemaAG();
		DmtSchemaAG dmt = new DmtSchemaAG();			
		DmwOmni.instance().addSchema(dmp);
		DmwOmni.instance().addSchema(dmt);

		SomeRelation	rel = new SomeRelation(new StringName("some name"), 4, 2);

		ObjWithRefs	owr1 = new ObjWithRefs();
		owr1.setName(new StringName("obj1"));
		
		ObjWithRefs	owr2 = new ObjWithRefs();
		owr2.setName(new StringName("obj2"));
		
		ObjWithRefs modrec = owr1.getModificationRecorder();
		modrec.setNthSomeRelationMVI(0, rel);
		
		owr2.applyModifier(modrec.getModifier());
		
        System.out.println(owr2.toOIF());
	}
	
	@Test
	public void testReferenceTracking1() throws DmcValueException, DmcValueExceptionSet {
		System.out.println("\n>>> testReferenceTracking1()\n\n");
		
		TestDataCache cache = new TestDataCache();
		DmcOmni.instance().reset();
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		DmcOmni.instance().addResolver(cache);
		DmcOmni.instance().logger(new TestLogger());
		DmcOmni.instance().lazyResolution(true);
		DmcOmni.instance().backRefTracking(true);
				
		ObjWithRefsDMO objA = new ObjWithRefsDMO();
		objA.setName("objA");
		cache.add(objA);
		
		SomeRelation relA = new SomeRelation();
		relA.setObject(objA);
		relA.setCount(1);
		relA.setOrder(5);
		
		DebugInfo.debug(relA.toString());
		
		ObjWithRefsDMO objB = new ObjWithRefsDMO();
		objB.setName("objB");
		cache.add(objB);
		
		ObjWithRefsDMO mainOBJ = new ObjWithRefsDMO();
		mainOBJ.setName("mainOBJ");
		cache.add(mainOBJ);
		
		SomeRelation relB = new SomeRelation();
		relB.setObject(objB);
		relB.setCount(2);
		relB.setOrder(3);
		
		DebugInfo.debug(relB.toString());
		
		///////////////////////////////////////////////////////////////////////
		
		ObjWithRefsDMO modrec = mainOBJ.getModificationRecorder();
		
		modrec.setNthSomeRelationMVI(0, relA);
		
		mainOBJ.applyModifier(modrec.getModifier());
		
		assertEquals("objA should indicate that it has 1 reference", 1, objA.referenceCount());

		assertEquals("objB should indicate that it has 0 references", 0, objB.referenceCount());

		///////////////////////////////////////////////////////////////////////
		// Replacing one reference with another
		
		modrec = mainOBJ.getModificationRecorder();
		
		modrec.setNthSomeRelationMVI(0, relB);
		
		mainOBJ.applyModifier(modrec.getModifier());
		
		assertEquals("objA should indicate that it has 0 references", 0, objA.referenceCount());

		assertEquals("objB should indicate that it has 1 reference", 1, objB.referenceCount());

		///////////////////////////////////////////////////////////////////////
		// Removing all references by setting index to null
		
		modrec = mainOBJ.getModificationRecorder();
		
		modrec.setNthSomeRelationMVI(0, null);
		
		mainOBJ.applyModifier(modrec.getModifier());
		
		assertEquals("objA should indicate that it has 0 references", 0, objA.referenceCount());

		assertEquals("objB should indicate that it has 0 references", 0, objB.referenceCount());

		DebugInfo.debug(mainOBJ.toString());
		
		System.out.println("\n<<< testReferenceTracking1()\n\n");
	}
	

	
}
