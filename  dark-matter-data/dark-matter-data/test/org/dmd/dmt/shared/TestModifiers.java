package org.dmd.dmt.shared;

import static org.junit.Assert.assertEquals;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.IntegerToString;
import org.dmd.dmc.types.Modifier;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtASAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
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
	
	static {
		DmcOmni.instance().addAttributeSchema(DmtASAG.instance());
	}
	
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
	
	@Test
	public void testSVChanges() throws DmcValueException, DmcValueExceptionSet{
		DmcTypeModifierMV	mods 		= null;
		boolean 			anyChanges	= false;
		ObjWithRefs	obj1	= new ObjWithRefs();
		ObjWithRefs	obj2	= new ObjWithRefs();

		mods = new DmcTypeModifierMV();
		obj1.setModifier(mods);
		obj1.setName("name 1");
		
		anyChanges = obj2.applyModifier(mods);
		assertEquals("Expecting applyModifier() to return true.", true, anyChanges);

		anyChanges = obj2.applyModifier(mods);
		assertEquals("Expecting applyModifier() to return false.", false, anyChanges);

	}
	
	@Test
	public void testMVChanges() throws DmcValueException, DmcValueExceptionSet{
		DmcTypeModifierMV	mods 		= null;
		boolean 			anyChanges	= false;
		ObjWithRefs	obj1	= null;
		ObjWithRefs	obj2	= new ObjWithRefs();

		obj1 = new ObjWithRefs();
		mods = new DmcTypeModifierMV();
		obj1.setModifier(mods);
		obj1.addMvString("string1");
		
		anyChanges = obj2.applyModifier(mods);
		assertEquals("Expecting applyModifier() to return true.", true, anyChanges);

		obj1 = new ObjWithRefs();
		mods = new DmcTypeModifierMV();
		obj1.setModifier(mods);
		obj1.addMvString("string2");
		obj1.addIntToString(new IntegerToString(2,"string 2"));
		obj1.addIntToString(new IntegerToString(3,"string 3"));
		
		anyChanges = obj2.applyModifier(mods);
		assertEquals("Expecting applyModifier() to return true.", true, anyChanges);

		obj1 = new ObjWithRefs();
		mods = new DmcTypeModifierMV();
		obj1.setModifier(mods);
		obj1.delMvString("string1");
		
		Iterator<Modifier> it = mods.getMV();
		while(it.hasNext()){
			Modifier mod = it.next();
			System.out.println(">>> " + mod.toString());

		}
		
		anyChanges = obj2.applyModifier(mods);
		assertEquals("Expecting applyModifier() to return true.", true, anyChanges);

		System.out.println(obj2.toOIF(15));
	}
	
	
	@Test
	public void testModifierSlices() throws DmcValueException, DmcValueExceptionSet{
		ObjWithRefs	obj = new ObjWithRefs();
		
		obj.setName("object 1");
		obj.setSvString("one value");
		obj.addMvString("value1");
		obj.addMvString("value2");
		obj.addIntToString(new IntegerToString(5, "five"));
		
		ObjWithRefs recorder = obj.getModificationRecorder();
		
		recorder.setSvString("a new string");
		recorder.addIntToString(new IntegerToString(10,"ten"));
		
		System.out.println(obj.toOIF());
		
		System.out.println(recorder.toOIF());
		
		DMPEvent event = new DMPEvent(DMPEventTypeEnum.MODIFIED,recorder);
		
		System.out.println(event.toOIF());
		
		DMPEvent sliced =  event.getSlice(DmtASAG.__sliceOfNamed);
		
		System.out.println(sliced.toOIF());
		
//		ObjWithRefsDMO sliced = obj.getSlice(DmtASAG.__sliceOfNamed);
//		
//		System.out.println(sliced.toOIF());
//		
//		assertEquals("Sliced object should have 3 attributes", 3, sliced.numberOfAttributes());

	}
	
	
}
