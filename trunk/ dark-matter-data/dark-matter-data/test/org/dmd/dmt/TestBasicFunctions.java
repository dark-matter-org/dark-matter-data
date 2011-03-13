package org.dmd.dmt;

import java.util.UUID;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.UUIDLite;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.auxw.TestBasicAuxiliaryDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO;
import org.dmd.util.exceptions.ResultException;
import org.junit.*;
import static org.junit.Assert.assertEquals;

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
		tbo.setSvStringValue("some value");
		tbo.addMvStringValue("val 1");
		tbo.addMvStringValue("val 2");
		
		System.out.println(tbo.toOIF(15));
		
		TestBasicAuxiliaryDMO.setSvAuxString(tbo, "some aux value");
		
		System.out.println(tbo.toOIF(15));
		
		TestBasicAuxiliaryDMO.remSvAuxString(tbo);
		
		System.out.println(tbo.toOIF(15));
		
		tbo.addIntToString("5 Five");
		tbo.addIntToString("1 One");
		tbo.addIntToString("500 Five Hundred");
		tbo.addIntToString("33 Thirty Three");
		
		System.out.println(tbo.toOIF(15));
		
		System.out.println("Get 500: " + tbo.getIntToStringByKey(500));
	}
	
	@Test
	public void testUUIDNaming() throws DmcValueException{
		UUIDNamedObjectDMO obj = new UUIDNamedObjectDMO();
		UUID uuid = UUID.randomUUID();
		UUIDLite lite = new UUIDLite(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
		
		obj.setUuidName(lite);
		
		System.out.println(obj.toOIF(15));
	}
}
