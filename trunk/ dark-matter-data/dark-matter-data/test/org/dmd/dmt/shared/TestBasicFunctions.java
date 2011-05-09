package org.dmd.dmt.shared;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.IntegerName;
import org.dmd.dmc.types.IntegerToString;
import org.dmd.dmc.types.UUIDName;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.auxw.TestBasicAuxiliaryDMO;
import org.dmd.dmt.shared.generated.dmo.DmtASAG;
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
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
		schema.manageSchema(new DmpSchemaAG());
		schema.manageSchema(new DmtSchemaAG());
	}

	@Test
	public void testBasicObject() throws ResultException, DmcValueException{
		
		TestBasicObjectFixedDMO tbo = new TestBasicObjectFixedDMO();
		tbo.setSvString("some value");
		tbo.addMvString("val 1");
		tbo.addMvString("val 2");
		tbo.setSvDate("20110508:102205");
		
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
		IntegerNamedObjectDMO	intobj	= null;
		
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
	
	@Test
	public void testSliceBasicObject() throws ResultException, DmcValueException{
		
		TestBasicObjectFixedDMO tbo = new TestBasicObjectFixedDMO();
		
		tbo.addHsDate(new Date());
		tbo.setSvBoolean(true);
		tbo.setSvInteger(56);
		tbo.setSvString("some value");
		tbo.addMvFloat(89.0f);
		tbo.addMvFloat(125.6f);
		
		System.out.println(tbo.toOIF());
		
		TestBasicObjectFixedDMO sliced = tbo.getSlice(DmtASAG.__slice1);
		
		System.out.println(sliced.toOIF());
		
		assertEquals("Sliced object should only have 2 attributes", 2, sliced.numberOfAttributes());

	}
	
	@Test
	public void testSliceNamedObject() throws ResultException, DmcValueException{
		
		ObjWithRefsDMO	obj = new ObjWithRefsDMO();
		
		obj.setName("object 1");
		obj.setSvString("one value");
		obj.addMvString("value1");
		obj.addMvString("value2");
		obj.addIntToString(new IntegerToString(5, "five"));
		
		System.out.println(obj.toOIF());
		
		ObjWithRefsDMO sliced = obj.getSlice(DmtASAG.__sliceOfNamed);
		
		System.out.println(sliced.toOIF());
		
		assertEquals("Sliced object should have 3 attributes", 3, sliced.numberOfAttributes());

	}
	
	@Test
	public void testSlicedCreateEvent() throws ResultException, DmcValueException{
		
		ObjWithRefs	obj = new ObjWithRefs();
		
		obj.setName("object 1");
		obj.setSvString("one value");
		obj.addMvString("value1");
		obj.addMvString("value2");
		obj.addIntToString(new IntegerToString(5, "five"));
		
		System.out.println("testSlicedCreateEvent()\n");
		
		System.out.println(obj.toOIF());
		
		DMPEvent baseEvent = new DMPEvent(DMPEventTypeEnum.CREATED,obj);
		
		System.out.println(baseEvent.toOIF());
		
		DMPEvent slicedEvent = baseEvent.getSlice(DmtASAG.__sliceOfNamed);
		
		System.out.println("Sliced event:\n\n" + slicedEvent.toOIF());
		
		DmcObject source = slicedEvent.getSourceObject();
		
		assertEquals("Sliced source object should have 3 attributes", 3, source.numberOfAttributes());

	}
}
