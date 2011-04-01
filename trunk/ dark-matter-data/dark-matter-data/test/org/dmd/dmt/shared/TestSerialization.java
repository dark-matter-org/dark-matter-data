package org.dmd.dmt.shared;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.UUIDName;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.server.generated.dmw.DMPEventDMW;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.DmwWrapper;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoDeserializer;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedDMW;
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmw.DmwDeserializer;
import org.dmd.util.DmcTraceableInputStream;
import org.dmd.util.DmcTraceableOutputStream;
import org.dmd.util.exceptions.ResultException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSerialization {
	
//	@Rule
//	public TemporaryFolder folder = new TemporaryFolder();
	
	static String testDataPath = "/test/org/dmd/dmt/shared/data";
	
	File	temp;
	
	SchemaManager schema;
//	String			
	
	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
		if (schema == null){
			schema = new SchemaManager();
			schema.manageSchema(new DmpSchemaAG());
			schema.manageSchema(new DmtSchemaAG());
			
	        File curr = new File(".");
	        String runDir;
			runDir = curr.getCanonicalPath();
			System.out.println("*** Serialization running from: " + runDir);
	
			temp = new File(runDir + File.separator + "serialize.txt");
			
			System.out.println("temp: " + temp.getAbsolutePath());
		}
	}

	@Test
	public void testSerialize() throws Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));
		
//		UUIDNamedObjectDMO	obj = new UUIDNamedObjectDMO();
//		obj.setUuidName(getNewName());
//		obj.setSvBooleanValue(true);
//		obj.addMvBooleanValue(true);
//		obj.addMvBooleanValue(false);
//		obj.setSvDateValue(new Date());
		
		TestBasicObjectFixedDMO	dmo = new TestBasicObjectFixedDMO();
		dmo.setSvString("onevalue");
		dmo.setSvBoolean(true);
		dmo.addMvBoolean(true);
		dmo.addMvBoolean(false);
		dmo.setSvDouble(56.08D);
		dmo.addMvDouble(1256.89D);
		dmo.addMvDouble(5653.5654D);
		dmo.setSvLong(9);
		dmo.addMvLong(567);
		dmo.addMvLong(123);
		
		dmo.addHsDouble(83);
		dmo.addHsDouble(15);
		dmo.addHsDouble(83);
		dmo.addHsDouble(15);
		
		System.out.println("\nStoring to file:\n\n" + dmo.toOIF(15) + "\n");
		
//		DmcOutputStream dos = new DmcOutputStream(os);
		
		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		dmo.serializeIt(dos);
		
		os.close();
	}
	
//	@Test
//	public void testDeserialize() throws Exception {
//		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
//		
//		DmoDeserializer	deserializer = new DmoDeserializer(schema);
//
////		DmcInputStream dis = new DmcInputStream(is,deserializer.getSchema());
//		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, schema, true, 35);
//		
//		ArrayList<DmcObject> dmos = new ArrayList<DmcObject>();
//		while(dis.available() > 0){
//			dmos.add(deserializer.deserialize(dis));
//		}
//		
//		System.out.println("\nRead from file:\n");
//		for(DmcObject dmo: dmos){
//			System.out.println(dmo.toOIF(15) + "\n");
//		}
//
//	}
//	
//	@Test
//	public void serializeNamedObject() throws Exception{
//		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));
//
//		TestBasicNamedObjectFixedDMO dmo = new TestBasicNamedObjectFixedDMO();
//		dmo.setName("name1");
//		dmo.setSvString("some value");
//		dmo.addMvString("value 1");
//		dmo.addMvString("value 2");
//		
//		System.out.println("\nStoring to file:\n\n" + dmo.toOIF(15) + "\n");
//
//		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);
//
//		dmo.serializeIt(dos);
//		
//		os.close();
//	}
//	
//	@Test
//	public void deserializeNamedObject() throws Exception {
//		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
//		
//		DmoDeserializer	deserializer = new DmoDeserializer(schema);
//
////		DmcInputStream dis = new DmcInputStream(is,deserializer.getSchema());
//		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, schema, true, 35);
//		
//		ArrayList<DmcObject> dmos = new ArrayList<DmcObject>();
//		while(dis.available() > 0){
//			dmos.add(deserializer.deserialize(dis));
//		}
//		
//		System.out.println("\nRead from file:\n");
//		for(DmcObject dmo: dmos){
//			System.out.println(dmo.toOIF(15) + "\n");
//		}
//
//	}
	
	@Test
	public void serializeDMPEventDMO() throws Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		TestBasicNamedObjectFixedDMO dmo = new TestBasicNamedObjectFixedDMO();
		dmo.setName("name1");
		dmo.setSvString("some value");
		dmo.addMvString("value 1");
		dmo.addMvString("value 2");

		DMPEvent	eventDMW = new DMPEvent();
		eventDMW.setEventTypeDMP(DMPEventTypeEnum.CREATED);
		eventDMW.setEventObject(dmo);
		eventDMW.setObjClass(dmo.getConstructionClassName());
		eventDMW.setObjName(dmo.getObjectName());
		
		
		DMPEventDMO event = new DMPEventDMO();
		event.setEventTypeDMP(DMPEventTypeEnum.CREATED);
		event.setEventObject(dmo);
		event.setObjClass(dmo.getConstructionClassName());
		event.setObjName(dmo.getObjectNameAttribute());
		
		System.out.println("\nStoring to file:\n\n" + event.toOIF(15) + "\n");

		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		event.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeEventDMO() throws Exception {
		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		
		DmoDeserializer	deserializer = new DmoDeserializer(schema);

//		DmcInputStream dis = new DmcInputStream(is,deserializer.getSchema());
		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, schema, true, 35);
		
		ArrayList<DmcObject> dmos = new ArrayList<DmcObject>();
		while(dis.available() > 0){
			dmos.add(deserializer.deserialize(dis));
		}
		
		System.out.println("\nRead from file:\n");
		for(DmcObject dmo: dmos){
			System.out.println(dmo.toOIF(15) + "\n");
			
			if (dmo instanceof DMPEventDMO){
				DMPEventDMO event = (DMPEventDMO) dmo;
				
				if (event.getEventTypeDMP() == DMPEventTypeEnum.CREATED){
					System.out.println("Object CREATED:\n\n");
					System.out.println(event.getEventObject().toOIF(15));
				}
			}
		}

	}
	
	@Test
	public void serializeDMPEventDMW() throws Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		TestBasicNamedObjectFixedDMW dmw = new TestBasicNamedObjectFixedDMW();
		dmw.setName("name1");
		dmw.setSvString("some value");
		dmw.addMvString("value 1");
		dmw.addMvString("value 2");

		DMPEvent	eventDMW = new DMPEvent();
		eventDMW.setEventTypeDMP(DMPEventTypeEnum.CREATED);
		eventDMW.setEventObject(dmw.getDMO());
		eventDMW.setObjClass(dmw.getConstructionClassName());
		eventDMW.setObjName(dmw.getDMO().getObjectName());
		
		
//		DMPEventDMO event = new DMPEventDMO();
//		event.setEventTypeDMP(DMPEventTypeEnum.CREATED);
//		event.setEventObject(dmo);
//		event.setObjClass(dmo.getConstructionClassName());
//		event.setObjName(dmo.getObjectNameAttribute());
		
		System.out.println("\nStoring to file:\n\n" + eventDMW.toOIF(15) + "\n");

		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		eventDMW.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeEventDMW() throws Exception {
		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		
		DmwDeserializer	deserializer = new DmwDeserializer(schema);

//		DmcInputStream dis = new DmcInputStream(is,deserializer.getSchema());
		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, schema, true, 35);
		
		ArrayList<DmwWrapper> dmws = new ArrayList<DmwWrapper>();
		while(dis.available() > 0){
			dmws.add(deserializer.deserialize(dis));
		}
		
		System.out.println("\nRead from file:\n");
		for(DmwWrapper dmw: dmws){
			System.out.println(dmw.toOIF(15) + "\n");
			
			if (dmw instanceof DMPEvent){
				DMPEvent event = (DMPEvent) dmw;
				
				if (event.getEventTypeDMP() == DMPEventTypeEnum.CREATED){
					System.out.println("Object CREATED:\n\n");
					System.out.println(event.getEventObject().toOIF(15));
				}
			}
		}

	}
	
	
	
	
	UUIDName getNewName(){
		UUID uuid = UUID.randomUUID();
		return(new UUIDName(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits()));
	}
	
	@After
	public void after(){
//		if (temp != null)
//			temp.delete();
	}
}
