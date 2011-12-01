package org.dmd.dmt.shared;


import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.types.SomeRelation;
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
	
}
