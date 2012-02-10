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
import org.dmd.dmc.types.NameContainer;
import org.dmd.dmc.types.StringName;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;
import org.dmd.dmw.DmwDeserializer;
import org.dmd.util.DmcTraceableInputStream;
import org.dmd.util.DmcTraceableOutputStream;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestModifiers {

	static String testDataPath = "/test/org/dmd/dmt/shared/data";
	
	static File	temp;
	static boolean initialized = false;
	
	static private SchemaManager schema;
	
	@Before
	public void initialize() throws ResultException, DmcValueException, IOException{
		if (!initialized){
			schema = new SchemaManager();
			schema.manageSchema(new DmpSchemaAG());
			schema.manageSchema(new DmtSchemaAG());
			
	        File curr = new File(".");
	        String runDir;
			runDir = curr.getCanonicalPath();
			System.out.println("*** Serialization running from: " + runDir);
	
			temp = new File(runDir + File.separator + "serialize.txt");
			
			System.out.println("temp: " + temp.getAbsolutePath() + "\n\n");
			initialized = true;
		}
	}

	@Test
	public void testPrimitiveTypes() throws DmcValueException{
		System.out.println("\n***** testPrimitiveTypes\n");
		
		DmcOmni.instance().reset();
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmtDMSAG.instance());

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
	public void testDeletionOfNonexistentValues() throws DmcValueException{
		System.out.println("\n***** testDeletionOfNonexistentValues\n");
		
		TestBasicObjectFixedDMO	dmo = new TestBasicObjectFixedDMO();
		
		dmo.setModifier(new DmcTypeModifierMV());
		
		dmo.remMvBoolean();
		
		
		StringBuffer	sb = new StringBuffer();
		dmo.getModifier().toOIF(sb);
		System.out.println(sb.toString());
	}
	
	@Test
	public void applyModifer() throws DmcValueException, DmcValueExceptionSet{
		System.out.println("\n***** applyModifer\n");
		
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
		System.out.println("\n***** serializeModifer\n");
		
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));
		
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());

		ObjWithRefs	obj1	= new ObjWithRefs();
		ObjWithRefs	obj2	= new ObjWithRefs();
		
		obj1.setName("obj1");
		
		obj2.setName("obj2");
		
		DmcTypeModifierMV	mods = new DmcTypeModifierMV();
		
		obj1.setModifier(mods);
		obj1.setSvString("a new string");
		obj1.setObjRef(obj2);
		obj1.remIntToString();
		
		StringBuffer	sb = new StringBuffer();
		obj1.getModifier().toOIF(sb);
		System.out.println("The modifier in:\n\n" + sb.toString() + "\n");

		DMPEvent	event = new DMPEvent(DMPEventTypeEnum.MODIFIED,obj1);
		
		System.out.println(obj1.toOIF(15));
		
		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		event.serializeIt(dos);
		
		os.close();
	}
	
	@Test
	public void deserializeModifer() throws Exception {
		System.out.println("\n***** deserializeModifer\n");
		
		DataInputStream			is 				= new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		DmwDeserializer			deserializer 	= new DmwDeserializer(schema);
		DmcTraceableInputStream dis 			= new DmcTraceableInputStream(is, schema, true, 35);
		
		ObjWithRefs	obj3	= new ObjWithRefs();
		obj3.setName("obj3");
		
		DMPEvent event = (DMPEvent) deserializer.deserialize(dis);
		
		StringBuffer	sb = new StringBuffer();
		event.getModifyAttribute().toOIF(sb);
		System.out.println("The modifier out:\n\n" + sb.toString() + "\n");

		
		
		obj3.applyModifier(event.getModifyAttribute());
		
		System.out.println(obj3.toOIF(15));
	}
	
	@Test
	public void testSVChanges() throws DmcValueException, DmcValueExceptionSet{
		System.out.println("\n***** testSVChanges\n");
		
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
		System.out.println("\n***** testMVChanges\n");
		
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
		obj1.addMvTestEnum(DmtTestEnum.TEST1);
		obj1.addMvTestEnum(DmtTestEnum.TEST2);
		obj1.addMvTestEnum(DmtTestEnum.TEST3);
		
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
		System.out.println("\n***** testModifierSlices\n");
		
		ObjWithRefs	obj = new ObjWithRefs();
		
		obj.setName("object 1");
		obj.setSvString("one value");
		obj.addMvString("value1");
		obj.addMvString("value2");
		obj.addIntToString(new IntegerToString(5, "five"));
		
		ObjWithRefs recorder = obj.getModificationRecorder();
		
		recorder.setSvString("a new string");
		recorder.addIntToString(new IntegerToString(10,"ten"));
		recorder.addMvTestEnum(DmtTestEnum.TEST1);
		recorder.addMvTestEnum(DmtTestEnum.TEST2);
		recorder.delMvTestEnum(DmtTestEnum.TEST3);
		recorder.addHsTestEnum(DmtTestEnum.TEST1);
		recorder.addHsTestEnum(DmtTestEnum.TEST3);
		
		
		System.out.println(obj.toOIF());
		
		System.out.println(recorder.toOIF());
		
		DMPEvent event = new DMPEvent(DMPEventTypeEnum.MODIFIED,recorder);
		
		System.out.println(event.toOIF());
		
		DMPEvent sliced =  event.getSlice(DmtDMSAG.__sliceOfNamed);
		
		System.out.println(sliced.toOIF());
		
//		ObjWithRefsDMO sliced = obj.getSlice(DmtASAG.__sliceOfNamed);
//		
//		System.out.println(sliced.toOIF());
//		
//		assertEquals("Sliced object should have 3 attributes", 3, sliced.numberOfAttributes());

	}
	
	@Test
	public void testDelFromMissingMappedAttribute() throws DmcValueException, DmcValueExceptionSet{
		System.out.println("\n***** testDelFromMissingMappedAttribute\n");
		
		ObjWithRefs	obj = new ObjWithRefs();
		obj.setName("object 1");

		ObjWithRefs modrec = obj.getModificationRecorder();
		modrec.delIntToString(5);
		
		
		SetRequest request = new SetRequest(modrec);
		
		System.out.println("Modify missing intToString:\n\n" + request);
		
		ObjWithRefs	obj2 = new ObjWithRefs();
		obj2.setName("object 2");
		obj2.addIntToString(new IntegerToString(10,"ten"));
		obj2.addIntToString(new IntegerToString(5,"five"));
		
		System.out.println("OBJ2\n\n" + obj2);
		
		obj2.applyModifier(modrec.getModifier());
		
		System.out.println("OBJ2\n\n" + obj2);		
		
	}
	
	@Test
	public void testDuplicateValueInHashSetValue() throws DmcValueException{
		System.out.println("\n***** testDuplicateValueInHashSetValue\n");
		
		ObjWithRefs	obj = new ObjWithRefs();
		obj.setName("object 1");

		ObjWithRefs modrec = obj.getModificationRecorder();
		
		modrec.addMvString("another value");
		modrec.addHsTestEnum(DmtTestEnum.TEST1);
		modrec.addHsTestEnum(DmtTestEnum.TEST1);

		SetRequest request = new SetRequest(modrec);
		
		System.out.println(request);
	}
	
	@Test
	public void testOIFObjectWithModifier() throws DmcValueException{
		System.out.println("\n***** testOIFObjectWithModifier\n");
		
		ObjWithRefs	obj = new ObjWithRefs();
		obj.setName("object 1");

		ObjWithRefs modrec = obj.getModificationRecorder();
		
		modrec.addMvString("another value");
		modrec.addHsTestEnum(DmtTestEnum.TEST1);

		System.out.println(modrec.toOIF());
		
		modrec = obj.getModificationRecorder();
		
		System.out.println(modrec.toOIF());

		
		
	}
	
	@Test
	public void testHashSetChangesRecorded(){
		ObjWithRefs obj1 = new ObjWithRefs();
		
		DmcTypeModifierMV mods = new DmcTypeModifierMV();
		
		obj1.setModifier(mods);
		
		obj1.addHsString("joe");
		
		assertEquals("Expecting a single value in the modifier.", 1, mods.getMVSize());
		
		obj1.addHsString("joe");
		
		assertEquals("Expecting a single value in the modifier.", 1, mods.getMVSize());
		
		obj1.addHsString("bill");
		
		assertEquals("Expecting 2 values in the modifier.", 2, mods.getMVSize());
		
		StringName sn = new StringName("some name");
		
		obj1.addHsStringName(sn);
		
		assertEquals("Expecting 3 values in the modifier.", 3, mods.getMVSize());
		
		System.out.println(">>> testHashSetChangesRecorded \n\n" + obj1.toOIF());
		
		
	}
	
}
