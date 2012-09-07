package org.dmd.dmt.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFSET;
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFSET;
import org.junit.Test;

public class EmptyMultiValuedAttributeTest {

	@Test
	public void testMVAccessors() throws DmcValueException {
		
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());
		
//		DmcTypeObjWithRefsREFSET	dmv = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__hsUnnamedObj);
		DmcTypeTestBasicObjectFixedREFSET	dmv = new DmcTypeTestBasicObjectFixedREFSET(DmtDMSAG.__hsUnnamedObj);
		
		TestBasicObjectFixedDMO	fix1 = new TestBasicObjectFixedDMO();
		fix1.setSvBoolean(true);
		
//		ObjWithRefsDMO	obj1 = new ObjWithRefsDMO();
//		obj1.setName("obj1");
//		
//		ObjWithRefsDMO	obj2 = new ObjWithRefsDMO();
//		obj2.setName("obj2");
//		
//		dmv.add(obj1);
		
		dmv.add(fix1);
		
		assertNotNull("Iterator shouldn't be null", dmv.getMV());
		
		assertEquals("Size should be 1", 1, dmv.getMVSize());
//		dmv.contains(obj1);
		
		dmv.del(fix1);
		
		assertEquals("Size should be 0", 0, dmv.getMVSize());

		assertNotNull("Iterator shouldn't be null", dmv.getMV());
		
		///////////////////////////////////////////////////////////////////////
		
		DmcTypeObjWithRefsREFSET	refset = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__hsUnnamedObj);
		
		ObjWithRefsDMO	obj1 = new ObjWithRefsDMO();
		obj1.setName("obj1");
		
		ObjWithRefsDMO	obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");
		
		refset.add(obj1);
				
		assertNotNull("Iterator shouldn't be null", refset.getMV());
		
		assertEquals("Size should be 1", 1, refset.getMVSize());
		refset.contains(obj1);
		
		refset.del(obj1);
		
		assertEquals("Size should be 0", 0, refset.getMVSize());

		assertNotNull("Iterator shouldn't be null", refset.getMV());

	}
}
