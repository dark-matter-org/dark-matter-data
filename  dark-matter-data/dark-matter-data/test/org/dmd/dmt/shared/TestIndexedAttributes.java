package org.dmd.dmt.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.IntegerToString;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dms.util.DmoDeserializer;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmw.DmwDeserializer;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.DmcTraceableInputStream;
import org.dmd.util.DmcTraceableOutputStream;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestIndexedAttributes {

	static boolean initialized = false;

	static File	temp;

	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DebugInfo.debug("STARTING...");
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
	public void testBasic(){
		ObjWithRefsDMO obj = new ObjWithRefsDMO();
		
		obj.setNthIndexedString(0, "value1");
		
		System.out.println(obj.toOIF());
		
		assertEquals("Value at index 0 should be value1", "value1", obj.getNthIndexedString(0));
		
		assertEquals("Value at index 4 should be null", null, obj.getNthIndexedString(4));
		
		try{
			obj.setNthIndexedString(-1, "garbage");
			assertTrue("Should have thrown index exception", false);
		}
		catch(Exception ex){
			System.out.println("Got expected exception:\n" + ex.toString());
		}
		
		try{
			obj.setNthIndexedString(6, "garbage");
			assertTrue("Should have thrown index exception", false);
		}
		catch(Exception ex){
			System.out.println("Got expected exception:\n" + ex.toString());
		}
		
		obj.setNthIndexedString(0, null);
		
		assertEquals("Value at index 0 should be null", null, obj.getNthIndexedString(0));
	}
	
	@Test
	public void testObjRefs() throws DmcValueException {
		System.out.println("");
		
		ObjWithRefsDMO obj = new ObjWithRefsDMO();
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");

		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");

		ObjWithRefsDMO obj4 = new ObjWithRefsDMO();
		obj4.setName("obj4");

		obj.setNthIndexedObjRef(0, obj2);
		
		obj.setNthIndexedObjRef(4, obj3);
		
		obj.setNthIndexedObjRef(9, obj4);
		
		assertNotNull("Value at index 4 should not be null", obj.getNthIndexedObjRef(4));

		assertEquals("Value at index 4 should be obj3", obj3.getName().getNameString(), obj.getNthIndexedObjRef(4).getName().getNameString());

		System.out.println(obj.toOIF(15));
		
		obj.setNthIndexedObjRef(4, null);
		
		assertNull("Value at index 4 should be null", obj.getNthIndexedObjRef(4));
	}
	
	@Test
	public void testModifiers() throws DmcValueException {
		System.out.println("");
		
		ObjWithRefsDMO obj = new ObjWithRefsDMO();
		obj.setName("obj1");
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");

		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");

		ObjWithRefsDMO obj4 = new ObjWithRefsDMO();
		obj4.setName("obj4");
		
		ObjWithRefsDMO modrec = obj.getModificationRecorder();

		modrec.setNthIndexedObjRef(0, obj2);
		
		modrec.setNthIndexedObjRef(4, obj3);
		
		modrec.setNthIndexedObjRef(9, obj4);
		
		System.out.println(modrec.toOIF(15));
		
	}
	
	@Test
	public void serializeBasic() throws Exception {
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		System.out.println("");
		
		ObjWithRefsDMO obj = new ObjWithRefsDMO();
		obj.setName("obj1");
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");

		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");

		ObjWithRefsDMO obj4 = new ObjWithRefsDMO();
		obj4.setName("obj4");
		
		obj.setNthIndexedObjRef(0, obj2);
		
		obj.setNthIndexedObjRef(4, obj3);
		
		obj.setNthIndexedObjRef(9, obj4);

		System.out.println("Serializing:\n\n" + obj.toOIF(15) + "\n");
		
		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		obj.serializeIt(dos);
	}
	
	@Test
	public void deserializeBasic() throws Exception{
		System.out.println("");

		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
		DmoDeserializer	deserializer = new DmoDeserializer(DmwOmni.instance().getSchema());

		DmcObject obj = deserializer.deserialize(dis);
		
		System.out.println("\nRead from file:\n\n" + obj.toOIF());
		
	}
	
	@Test
	public void serializeSetRequestDMW() throws Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("object1");
	
		ObjWithRefs obj2 = new ObjWithRefs();
		obj2.setName("obj2");

		ObjWithRefs obj3 = new ObjWithRefs();
		obj3.setName("obj3");

		ObjWithRefs obj4 = new ObjWithRefs();
		obj4.setName("obj4");

		ObjWithRefs modrec = obj.getModificationRecorder();
		modrec.setNthIndexedString(3, "fourth string");
		modrec.setNthIndexedString(4, null);
		modrec.setNthIndexedObjRef(0, obj2);
		modrec.setNthIndexedObjRef(4, obj3);
		modrec.setNthIndexedObjRef(5, null);
		modrec.setNthIndexedObjRef(9, obj4);
		
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
		
		System.out.println(request);
		
	}

}
