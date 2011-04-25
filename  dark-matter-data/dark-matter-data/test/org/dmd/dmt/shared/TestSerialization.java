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
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.IntegerToString;
import org.dmd.dmc.types.UUIDName;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.DmwWrapper;
import org.dmd.dms.util.DmoDeserializer;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmw.DmwDeserializer;
import org.dmd.dmw.DmwOmni;
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
	
	static boolean initialized = false;
	
	static File	temp;
	
//	SchemaManager schema;
//	String			
	
	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DmpSchemaAG dmp = new DmpSchemaAG();
			DmtSchemaAG dmt = new DmtSchemaAG();			
			DmwOmni.instance().addSchema(dmp);
			DmwOmni.instance().addSchema(dmt);
			
	        File curr = new File(".");
	        String runDir;
			runDir = curr.getCanonicalPath();
			System.out.println("*** Serialization running from: " + runDir);
	
			temp = new File(runDir + File.separator + "serialize.txt");
			
			System.out.println("temp: " + temp.getAbsolutePath());
			
			initialized = true;
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
		eventDMW.setSourceObject(dmo);
		eventDMW.setObjClass(dmo.getConstructionClassName());
		eventDMW.setSource(dmo.getObjectName());
		
		
		DMPEventDMO event = new DMPEventDMO();
		event.setEventTypeDMP(DMPEventTypeEnum.CREATED);
		event.setSourceObject(dmo);
		event.setObjClass(dmo.getConstructionClassName());
		event.setSource(dmo.getObjectName());
		
		System.out.println("\nStoring to file:\n\n" + event.toOIF(15) + "\n");

		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		event.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeEventDMO() throws Exception {
		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		
		DmoDeserializer	deserializer = new DmoDeserializer(DmwOmni.instance().getSchema());

//		DmcInputStream dis = new DmcInputStream(is,deserializer.getSchema());
		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
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
					System.out.println(event.getSourceObject().toOIF(15));
				}
			}
		}

	}
	
	@Test
	public void serializeDMPEventDMW() throws Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		ObjWithRefs dmw2 = new ObjWithRefs();
		dmw2.setName("name2");

		ObjWithRefs dmw = new ObjWithRefs();
		dmw.setName("name1");
		dmw.setSvString("some value");
		dmw.setObjRef(dmw2);
		
		

		DMPEvent	eventDMW = new DMPEvent(DMPEventTypeEnum.CREATED,dmw);
		eventDMW.setObjClass(dmw.getConstructionClassName());
		eventDMW.setSource(dmw.getDMO().getObjectName());
		
		
		System.out.println("\nStoring to file:\n\n" + eventDMW.toOIF(15) + "\n");

		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		eventDMW.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeEventDMW() throws Exception {
		DmcOmni.instance().backRefTracking(true);

		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		
		DmwDeserializer	deserializer = new DmwDeserializer(DmwOmni.instance().getSchema());

//		DmcInputStream dis = new DmcInputStream(is,deserializer.getSchema());
		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
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
					System.out.println(event.getSourceObject().toOIF(15));
				}
			}
		}

	}
	
	@Test
	public void serializeCreateRequestDMW() throws Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		ObjWithRefs dmw2 = new ObjWithRefs();
		dmw2.setName("name2");

		ObjWithRefs dmw = new ObjWithRefs();
		dmw.setName("name1");
		dmw.setSvString("some value");
		dmw.setObjRef(dmw2);
		
		CreateRequest	request = new CreateRequest();
		request.addRequestID(1);
		request.setNewObject(dmw);
		
		System.out.println("\nStoring to file:\n\n" + request.toOIF(15) + "\n");

		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		request.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeCreateRequestDMW() throws Exception {
		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		
		DmwDeserializer	deserializer = new DmwDeserializer(DmwOmni.instance().getSchema());

		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
		CreateRequest request = (CreateRequest) deserializer.deserialize(dis);
		
		System.out.println(request.toOIF(15));
		
		ObjWithRefs dmw = (ObjWithRefs) request.getNewObjectWrapped();
		
		System.out.println("\n\nThe new object wrapped:\n" + dmw.toOIF(15));
	}
	
	
	@Test
	public void serializeSetRequestDMW() throws Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("object1");
	
		ObjWithRefs modrec = obj.getModificationRecorder();
		modrec.addIntToString(new IntegerToString(5,"five"));

		
		SetRequest	request = new SetRequest(modrec);
		request.addRequestID(1);
		
		System.out.println("\nStoring to file:\n\n" + request.toOIF(15) + "\n");

		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		request.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeSetRequestDMW() throws Exception {
		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		
		DmwDeserializer	deserializer = new DmwDeserializer(DmwOmni.instance().getSchema());

		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
		SetRequest request = (SetRequest) deserializer.deserialize(dis);
		
		System.out.println(request.toOIF(15));
		
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
