package org.dmd.dmt.shared;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.UUID;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.IntegerName;
import org.dmd.dmc.types.UUIDName;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.auxw.TestBasicAuxiliaryDMO;
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestBasicFunctions {

	private SchemaManager schema;
	
	@Before
	public void initialize() throws ResultException, DmcValueException{
		schema = new SchemaManager();
		schema.manageSchema(new DmtSchemaAG());
	}

	@Test
	public void testBasicObject() throws ResultException, DmcValueException{
		
		TestBasicObjectFixedDMO tbo = new TestBasicObjectFixedDMO();
		tbo.setSvString("some value");
		tbo.addMvString("val 1");
		tbo.addMvString("val 2");
		
		System.out.println(tbo.toOIF(15));
		
		TestBasicAuxiliaryDMO.setSvString(tbo, "some aux value");
		
		System.out.println(tbo.toOIF(15));
		
		TestBasicAuxiliaryDMO.remSvString(tbo);
		
		System.out.println(tbo.toOIF(15));
		
		tbo.addIntToString("5 Five");
		tbo.addIntToString("1 One");
		tbo.addIntToString("500 Five Hundred");
		tbo.addIntToString("33 Thirty Three");
		
		System.out.println(tbo.toOIF(15));
		
		System.out.println("Get 500: " + tbo.getIntToString(500));
	}
	
	@Test
	public void testUUIDNaming() throws DmcValueException{
		HashMap<DmcObjectNameIF,DmcObject>	map = new HashMap<DmcObjectNameIF, DmcObject>();
		
		UUIDNamedObjectDMO		obj = null;
		UUIDName 				name1 = null;
		UUIDName 				name2 = null;
		
		IntegerName				name3 = null;
		IntegerNamedObjectDMO	intobj	= null;;
		
		obj = new UUIDNamedObjectDMO();
		name1 = getNewName();
		obj.setUuidName(name1);
		obj.setSvString("UUID Object 1");
		
		map.put(obj.getObjectName(), obj);
		
		obj = new UUIDNamedObjectDMO();
		name2 = getNewName();
		obj.setUuidName(name2);
		obj.setSvString("UUID Object 2");
		
		map.put(obj.getObjectName(), obj);
		
		name3	= new IntegerName(42);
		intobj = new IntegerNamedObjectDMO();
		intobj.setIntegerName(name3);
		intobj.setSvString("Integer Object 1");
		
		map.put(intobj.getObjectName(), intobj);
		
		for(DmcObject object: map.values()){
			System.out.println(object.toOIF(15) + "\n");
		}
		
		DmcObject stored = null;
		
		stored = map.get(name3);
		assertNotNull("Retrieval by IntegerName", stored);
		System.out.println(stored.toOIF(15) + "\n");
		
		stored = map.get(name1);
		assertNotNull("Retrieval by UUIDName", stored);
		System.out.println(stored.toOIF(15) + "\n");
		
		
	}
	
	UUIDName getNewName(){
		UUID uuid = UUID.randomUUID();
		return(new UUIDName(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits()));
	}
}
