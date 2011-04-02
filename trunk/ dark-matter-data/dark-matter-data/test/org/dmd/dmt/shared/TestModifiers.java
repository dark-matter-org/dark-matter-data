package org.dmd.dmt.shared;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dms.util.DmoDeserializer;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.server.generated.dmw.ObjWithRefsDMW;
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmw.DmwDeserializer;
import org.dmd.util.DmcTraceableInputStream;
import org.dmd.util.DmcTraceableOutputStream;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestModifiers {

	static String testDataPath = "/test/org/dmd/dmt/shared/data";
	
	File	temp;
	
	private SchemaManager schema;
	
	@Before
	public void initialize() throws ResultException, DmcValueException, IOException{
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
	public void testPrimitiveTypes() throws DmcValueException{
		TestBasicObjectFixedDMO	dmo = new TestBasicObjectFixedDMO();
		
		TestBasicNamedObjectFixedDMO	namedDMO = new TestBasicNamedObjectFixedDMO();
		namedDMO.setName("ME");
		
		dmo.setSvBoolean(true);
		dmo.setSvString("one value");
		
		System.out.println(dmo.toOIF(15));
		
		DmcTypeModifierMV mods = new DmcTypeModifierMV();
		
		dmo.setModifier(mods);
		
		dmo.setSvString("a new value");
		dmo.setSvTestBasicNamedObjectFixed(namedDMO);
		
		StringBuffer	sb = new StringBuffer();
		mods.toOIF(sb);
		System.out.println(sb.toString());
		
		
	}
	
	@Test
	public void applyModifer() throws DmcValueException, DmcValueExceptionSet{
		ObjWithRefs	obj1	= new ObjWithRefs();
		ObjWithRefs	obj2	= new ObjWithRefs();
		ObjWithRefs	obj3	= new ObjWithRefs();
		
		obj1.setName("obj1");
		
		obj2.setName("obj2");
		
		DmcTypeModifierMV	mods = new DmcTypeModifierMV();
		
		obj1.setModifier(mods);
		obj1.setSvString("a new string");
		obj1.setObjRef(obj2);
		
		DMPEvent	event = new DMPEvent(DMPEventTypeEnum.MODIFIED,obj1);
		
		System.out.println(obj1.toOIF(15));
		
		obj3.setName("obj3");
		
		obj3.applyModifier(event.getModifyAttribute());
		
		System.out.println(obj3.toOIF(15));
	}
	
	
	@Test
	public void serializeModifer() throws Exception {
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		ObjWithRefs	obj1	= new ObjWithRefs();
		ObjWithRefs	obj2	= new ObjWithRefs();
		
		obj1.setName("obj1");
		
		obj2.setName("obj2");
		
		DmcTypeModifierMV	mods = new DmcTypeModifierMV();
		
		obj1.setModifier(mods);
		obj1.setSvString("a new string");
		obj1.setObjRef(obj2);
		
		DMPEvent	event = new DMPEvent(DMPEventTypeEnum.MODIFIED,obj1);
		
		System.out.println(obj1.toOIF(15));
		
		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		event.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeModifer() throws Exception {
		DataInputStream			is 				= new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		DmwDeserializer			deserializer 	= new DmwDeserializer(schema);
		DmcTraceableInputStream dis 			= new DmcTraceableInputStream(is, schema, true, 35);
		
		ObjWithRefs	obj3	= new ObjWithRefs();
		obj3.setName("obj3");
		
		DMPEvent event = (DMPEvent) deserializer.deserialize(dis);
		
		obj3.applyModifier(event.getModifyAttribute());
		
		System.out.println(obj3.toOIF(15));
	}
	
	
}
