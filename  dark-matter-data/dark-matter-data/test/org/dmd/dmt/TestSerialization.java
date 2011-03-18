package org.dmd.dmt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.UUIDName;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoDeserializer;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO;
import org.dmd.util.DmcInputStream;
import org.dmd.util.DmcOutputStream;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestSerialization {
	
	SchemaManager schema;
	
	@Before
	public void initialize() throws ResultException, DmcValueException{
		schema = new SchemaManager();
		schema.manageSchema(new DmtSchemaAG());
	}

	@Test
	public void testSerialize() throws Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream("/Users/peter/Desktop/serialized.oif"));
//		DataOutputStream os = new DataOutputStream(new FileOutputStream("C:/Documents and Settings/pstrong/Desktop/serialize/serialized.oif"));
		
		UUIDNamedObjectDMO	obj = new UUIDNamedObjectDMO();
		obj.setUuidName(getNewName());
		obj.setSvBooleanValue(true);
		obj.addMvBooleanValue(true);
		obj.addMvBooleanValue(false);
		obj.setSvDateValue(new Date());
		
		DmcOutputStream dos = new DmcOutputStream(os);

		obj.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void testDeserialize() throws Exception {
		DataInputStream	is = new DataInputStream(new FileInputStream("/Users/peter/Desktop/serialized.oif"));
//		DataInputStream	is = new DataInputStream(new FileInputStream("C:/Documents and Settings/pstrong/Desktop/serialize/serialized.oif"));
		
		DmoDeserializer	deserializer = new DmoDeserializer(schema);

		DmcInputStream dis = new DmcInputStream(is,deserializer.getSchema());
		
		ArrayList<DmcObject> dmos = new ArrayList<DmcObject>();
		while(dis.available() > 0){
			dmos.add(deserializer.deserialize(dis));
		}
		
		for(DmcObject dmo: dmos){
			System.out.println(dmo.toOIF(15));
		}

	}
	
	UUIDName getNewName(){
		UUID uuid = UUID.randomUUID();
		return(new UUIDName(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits()));
	}

}
