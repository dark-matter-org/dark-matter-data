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
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.util.DmoDeserializer;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
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
	public void testBasicDMO(){
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
	public void testBasicDMW(){
		ObjWithRefs obj = new ObjWithRefs();
		
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
		System.out.println("\n\ntestObjRefs()\n");
		
		ObjWithRefsDMO obj = new ObjWithRefsDMO();
		
		ObjWithRefsDMO obj2 = new ObjWithRefsDMO();
		obj2.setName("obj2");

		ObjWithRefsDMO obj3 = new ObjWithRefsDMO();
		obj3.setName("obj3");

		ObjWithRefsDMO obj4 = new ObjWithRefsDMO();
		obj4.setName("obj4");
		
		TestBasicObjectFixedDMO	noname1 = new TestBasicObjectFixedDMO();
		noname1.addHsInteger(56);
		noname1.setSvBoolean(true);
		noname1.setSvString("one string");

		obj.setNthIndexedObjRef(0, obj2);
		
		obj.setNthIndexedObjRef(4, obj3);
		
		obj.setNthIndexedObjRef(9, obj4);
		
		obj.setNthIndexedPlainObjRef(5, noname1);
		
		assertNotNull("Value at index 4 should not be null", obj.getNthIndexedObjRef(4));

		assertEquals("Value at index 4 should be obj3", obj3.getName().getNameString(), obj.getNthIndexedObjRef(4).getName().getNameString());

		System.out.println(obj.toOIF());
		
		obj.setNthIndexedObjRef(4, null);
		
		assertNull("Value at index 4 should be null", obj.getNthIndexedObjRef(4));
	}
	
	
	@Test
	public void testRemovalOfEmptyAttributes() throws DmcValueException {
		System.out.println("\ntestRemovalOfEmptyAttributes\n");
		
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
		
		System.out.println(obj.toOIF(15));
		
		obj.setNthIndexedObjRef(0, null);
		obj.setNthIndexedObjRef(4, null);
		obj.setNthIndexedObjRef(9, null);
		
		assertNull("IndexObj attribute should be null", obj.get(DmtDMSAG.__indexedObjRef));

		System.out.println(obj.toOIF(15));
		
	}
	
	@Test
	public void testModifiers1() throws DmcValueException, DmcValueExceptionSet {
		System.out.println("\ntestModifiers1");
		
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
		modrec.setNthIndexedObjRef(0, null);
		
		System.out.println(modrec.toOIF(15));
		
		obj.applyModifier(modrec.getModifier());
		
		System.out.println(obj.toOIF());
	}
	
	@Test
	public void testModifiers2() throws DmcValueException {
		System.out.println("\ntestModifiers2");
		
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
		
		modrec.setNthIndexedObjRef(0, null);
		modrec.setNthIndexedObjRef(4, null);
		modrec.setNthIndexedObjRef(9, null);
		
		System.out.println(modrec.toOIF(15));
		
	}
	
	@Test
	public void serializeBasic() throws Exception {
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		System.out.println("\nserializeBasic()\n");
		
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
		System.out.println("\ndeserializeBasic()\n");

		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
		DmoDeserializer	deserializer = new DmoDeserializer(DmwOmni.instance().getSchema());

		DmcObject obj = deserializer.deserialize(dis);
		
		System.out.println("\nRead from file:\n\n" + obj.toOIF());
		
	}
	
	@Test
	public void serializeSetRequestDMW() throws Exception{
		System.out.println("\nserializeSetRequestDMW()\n");
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
		System.out.println("\ndeserializeSetRequestDMW()\n");
		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("object1");
	
		DataInputStream			is 				= new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		DmwDeserializer			deserializer 	= new DmwDeserializer(DmwOmni.instance().getSchema());
		DmcTraceableInputStream dis 			= new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
		SetRequest request = (SetRequest) deserializer.deserialize(dis);
		
		System.out.println("\n\n" + request + "\n");
		
		obj.applyModifier(request.getModifyAttribute());
		
		System.out.println("Modified object:\n\n" + obj.toOIF());

	}

	@Test
	public void serializeModifyEventDMW() throws Exception{
		System.out.println("\nserializeModifyEventDMW()\n");
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
		modrec.setNthIndexedString(4, "fifth string");
		modrec.setNthIndexedString(1, "second string");
		modrec.setNthIndexedObjRef(0, obj2);
		modrec.setNthIndexedObjRef(4, obj3);
		modrec.setNthIndexedObjRef(5, null);
		modrec.setNthIndexedObjRef(9, obj4);
		
		DMPEvent event = new DMPEvent(DMPEventTypeEnum.MODIFIED,modrec);
				
		System.out.println("\nStoring to file:\n\n" + event.toOIF() + "\n");

		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		event.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeModifyEventDMW() throws Exception {
		System.out.println("\ndeserializeModifyEventDMW()\n");
		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("object1");
	
		DataInputStream			is 				= new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		DmwDeserializer			deserializer 	= new DmwDeserializer(DmwOmni.instance().getSchema());
		DmcTraceableInputStream dis 			= new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
		DMPEvent event = (DMPEvent) deserializer.deserialize(dis);
		
		System.out.println("\n\n" + event + "\n");
		
		obj.applyModifier(event.getModifyAttribute());
		
		System.out.println("Modified object:\n\n" + obj.toOIF());

	}

	@Test
	public void testModifiersRemovalFromMissingAttribute() throws DmcValueException {
		System.out.println("\ntestModifiersRemovalFromMissingAttribute");
		
		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("obj1");
				
		ObjWithRefs modrec = obj.getModificationRecorder();

		modrec.setNthIndexedObjRef(0, null);
		modrec.setNthIndexedObjRef(4, null);
		modrec.setNthIndexedObjRef(9, null);
		
		assertEquals("Only three operations should exist in the modifier.", 3, modrec.getModifier().getMVSize());
		
		System.out.println(modrec.toOIF(15));
		
		DMPEvent event = new DMPEvent(DMPEventTypeEnum.MODIFIED,modrec);
		
		System.out.println(event.toOIF(15));
	}
	
	@Test
	public void testApplyModifierBaseType() throws DmcValueException, DmcValueExceptionSet {
		System.out.println("\ntestApplyModifierBaseType");
		
		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("obj1");
		
		obj.setNthIndexedString(0, "zeroeth");
		obj.setNthIndexedString(3, "fourth");
		
		System.out.println(obj.toOIF());
				
		ObjWithRefs modrec = obj.getModificationRecorder();
		
		modrec.setNthIndexedString(4, "fifth");
		modrec.setNthIndexedString(3, null);

		System.out.println(modrec.toOIF(15));
		
		obj.applyModifier(modrec.getModifier());
		
		assertEquals("3rd index should be null", null, obj.getNthIndexedString(3));
		
		assertEquals("4th index should be fifth", "fifth", obj.getNthIndexedString(4));
		
		System.out.println(obj.toOIF());
	}
	
	@Test
	public void testApplyModifierPlainObjectsSerialize() throws Exception {
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		System.out.println("\ntestApplyModifierPlainObjects");
		
		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("obj1");
		
		TestBasicObjectFixedDMW	obj2 = new TestBasicObjectFixedDMW();
		obj2.setSvString("obj2 SV string");
		
		TestBasicObjectFixedDMW	obj3 = new TestBasicObjectFixedDMW();
		obj3.setSvString("obj3 SV string");
		
		obj.setNthIndexedPlainObjRef(0, obj2);
		obj.setNthIndexedPlainObjRef(4, obj3);
		
		System.out.println(obj.toOIF());
				
		ObjWithRefs modrec = obj.getModificationRecorder();
		
		modrec.setNthIndexedPlainObjRef(4, null);

		System.out.println(modrec.toOIF(15));
		
		obj.applyModifier(modrec.getModifier());
		
		assertNotNull("0th index should not be null", obj.getNthIndexedPlainObjRef(0));
		
		assertNull("4th index should be null", obj.getNthIndexedPlainObjRef(4));
		
		System.out.println(obj.toOIF());
		
		DMPEvent event = new DMPEvent(DMPEventTypeEnum.MODIFIED,modrec);
		
		System.out.println(event.toOIF(15));
		
		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		event.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void testApplyModifierPlainObjectsDeserialize() throws Exception {
		System.out.println("\ntestApplyModifierPlainObjectsDeserialize()\n");
		
		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("obj1");
		
		TestBasicObjectFixedDMW	obj2 = new TestBasicObjectFixedDMW();
		obj2.setSvString("obj2 SV string");
		
		TestBasicObjectFixedDMW	obj3 = new TestBasicObjectFixedDMW();
		obj3.setSvString("obj3 SV string");
		
		obj.setNthIndexedPlainObjRef(0, obj2);
		obj.setNthIndexedPlainObjRef(4, obj3);
	
		DataInputStream			is 				= new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		DmwDeserializer			deserializer 	= new DmwDeserializer(DmwOmni.instance().getSchema());
		DmcTraceableInputStream dis 			= new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);
		
		DMPEvent event = (DMPEvent) deserializer.deserialize(dis);
		
		System.out.println("\n\n" + event + "\n");
		
		boolean modified = obj.applyModifier(event.getModifyAttribute());
		
		assertEquals("Object should be flagged as modified", true, modified);
		
		assertNotNull("0th index should not be null", obj.getNthIndexedPlainObjRef(0));
		
		assertNull("4th index should be null", obj.getNthIndexedPlainObjRef(4));
		
		System.out.println("Modified object:\n\n" + obj.toOIF());

	}

	@Test
	public void removeAllValues() throws DmcValueException, DmcValueExceptionSet {
		System.out.println("\nremoveAllValues()");
		
		ObjWithRefs obj = new ObjWithRefs();
		obj.setName("obj1");
		obj.setNthIndexedString(0, "string0");
		obj.setNthIndexedString(3, "string3");
		
		System.out.println("BEFORE:\n" + obj.toOIF());
				
		ObjWithRefs modrec = obj.getModificationRecorder();

		modrec.setNthIndexedString(0, null);
		modrec.setNthIndexedString(3, null);
		
		obj.applyModifier(modrec.getModifier());
		
		assertNull("The empty attribute should have been removed.", obj.getDMO().get(DmtDMSAG.__indexedString));
		
		System.out.println(obj.toOIF());
		
	}
	


}
