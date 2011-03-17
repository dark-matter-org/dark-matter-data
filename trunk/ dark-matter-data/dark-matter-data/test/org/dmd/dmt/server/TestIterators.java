package org.dmd.dmt.server;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedDMW;
import org.dmd.util.exceptions.ResultException;
import org.junit.*;

public class TestIterators {

	private SchemaManager schema;
	
	@Before
	public void initialize() throws ResultException, DmcValueException{
		schema = new SchemaManager();
		schema.manageSchema(new DmtSchemaAG());
	}

	@Test
	public void addMVObjectREFs() throws DmcValueException{
		TestBasicNamedObjectFixedDMW	obj1 = new TestBasicNamedObjectFixedDMW();
		obj1.setName("Object 1");
		obj1.addMvStringValue("val1");
		obj1.addMvStringValue("val2");
		
		TestBasicNamedObjectFixedDMW	obj2 = new TestBasicNamedObjectFixedDMW();
		obj2.setName("Object 2");
		obj2.setSvStringValue("Just one string");
		
		TestBasicNamedObjectFixedDMW	obj3 = new TestBasicNamedObjectFixedDMW();
		obj3.setName("Object 3");
		obj3.addMvStringValue("one");
		obj3.addMvStringValue("two");
		
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
}
