package org.dmd.dmt.server;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedDMW;
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestIterators {

	private SchemaManager schema;
	
	@Before
	public void initialize() throws ResultException, DmcValueException, DmcNameClashException {
		schema = new SchemaManager();
		schema.manageSchema(new DmtSchemaAG());
	}

	@Test
	public void addMVObjectREFs() throws DmcValueException{
		TestBasicNamedObjectFixedDMW	obj1 = new TestBasicNamedObjectFixedDMW();
		obj1.setName("Object1");
		obj1.addMvString("val1");
		obj1.addMvString("val2");
		
		TestBasicNamedObjectFixedDMW	obj2 = new TestBasicNamedObjectFixedDMW();
		obj2.setName("Object2");
		obj2.setSvString("Just one string");
		
		TestBasicNamedObjectFixedDMW	obj3 = new TestBasicNamedObjectFixedDMW();
		obj3.setName("Object3");
		obj3.addMvString("one");
		obj3.addMvString("two");
		
		obj1.addMvTestBasicNamedObjectFixed(obj2);
		obj1.addMvTestBasicNamedObjectFixed(obj3);
		
		System.out.println(obj1.toOIF(20));
		
		for(TestBasicNamedObjectFixedDMW obj: obj1.getMvTestBasicNamedObjectFixedIterable()){
			System.out.println(obj.toOIF(20));
		}
		
		// Remove the references and see that we get the empty list back and have
		// no difficulty
		obj1.remMvTestBasicNamedObjectFixed();
		for(TestBasicNamedObjectFixedDMW obj: obj1.getMvTestBasicNamedObjectFixedIterable()){
			System.out.println(obj.toOIF(20));
		}
		
	}
	
	@Test
	public void testPrimitiveIterators() throws DmcValueException{
		TestBasicObjectFixedDMW	tbo = new TestBasicObjectFixedDMW();
		
		tbo.addIntToString("5 Five");
		tbo.addIntToString("1 One");
		tbo.addIntToString("500 Five Hundred");
		tbo.addIntToString("33 Thirty Three");
		
		tbo.addMvString("value1");
		tbo.addMvString("value2");
		
		System.out.println(tbo.toOIF(15));
		
//		for(String s: tbo.getMvStringValueIterable()){
//			System.out.println(s);
//		}
		
//		for(IntegerToString its: tbo.getIntToString()){
//			System.out.println(its);
//		}
	}
}
