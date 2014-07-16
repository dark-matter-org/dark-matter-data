package org.dmd.dmt.shared;

import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;


public class IntegerToStringTest {

	static boolean initialized = false;
	
	static private SchemaManager schema;
	
	@Before
	public void initialize() throws ResultException, DmcValueException, IOException{
		if (!initialized){
			schema = new SchemaManager();
			schema.manageSchema(new DmpSchemaAG());
			schema.manageSchema(new DmtSchemaAG());
			initialized = true;
		}
	}

	@Test
	public void testBasicUsage() throws DmcValueException{
		ObjWithRefsDMO	dmo = new ObjWithRefsDMO();
		
		dmo.setName("obj1");
		dmo.addIntToString("1 one");
		dmo.addIntToString("2 two");
		
		System.out.println(dmo.toOIF());
		
		dmo.addIntToString("1 uno");
		
		System.out.println(dmo.toOIF());
	}
	
	@Test
	public void testWithModifier() throws DmcValueException, DmcValueExceptionSet{
		
		ObjWithRefsDMO	obj1 = new ObjWithRefsDMO();
		
		obj1.setName("obj1");
		
		ObjWithRefsDMO	modrec = obj1.getModificationRecorder();

		modrec.addIntToString("1 one");
		modrec.addIntToString("2 two");
		
		obj1.applyModifier(modrec.getModifier());
		
		System.out.println(obj1.toOIF());
		
		modrec = obj1.getModificationRecorder();
		modrec.addIntToString("1 uno");
		
		obj1.applyModifier(modrec.getModifier());

		System.out.println(obj1.toOIF());
		
		modrec = obj1.getModificationRecorder();
		modrec.delIntToString(1);
		
		obj1.applyModifier(modrec.getModifier());

		System.out.println(obj1.toOIF());
				
	}
	
	
}
