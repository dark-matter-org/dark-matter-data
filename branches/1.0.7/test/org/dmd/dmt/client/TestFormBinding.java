package org.dmd.dmt.client;

import static org.junit.Assert.fail;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.Tracker;
import org.dmd.dmc.types.StringName;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmt.client.generated.mvw.forms.TestBasicNamedObjectFixedBinding;
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.junit.Test;

public class TestFormBinding {

	static boolean initialized = false;

//	@Before
//	public void initialize() throws ResultException, DmcValueException, IOException {
//			
//		if (!initialized){
//			DebugInfo.debug("STARTING...");
//			DmpSchemaAG dmp = new DmpSchemaAG();
//			DmtSchemaAG dmt = new DmtSchemaAG();			
//			DmwOmni.instance().addSchema(dmp);
//			DmwOmni.instance().addSchema(dmt);
//			initialized = true;
//		}
//	}

	@Test
	public void testBinding() throws DmcValueException {
		
		Tracker	tracker = new Tracker();
		
		TestBasicNamedObjectFixedBinding	binding = new TestBasicNamedObjectFixedBinding();
		binding.setTracker(tracker);
		
		TestBasicNamedObjectFixedDMO	editObject = new TestBasicNamedObjectFixedDMO();
		editObject.setName(new StringName("object 1"));
		editObject.setSvString("single valued string");
		
		TestBasicObjectFixedDMO	obj1 = new TestBasicObjectFixedDMO();
		obj1.setSvBoolean(true);
		obj1.setSvString("object 1");
		
		editObject.setNthMvIdxUnnamedObj(1, obj1);
		
		binding.setObject(editObject);
		
		binding.getMvIdxUnnamedObj1().showDisplayValue();
		
		// This object is eqivalent to the first object value we set and we shouldn't
		// wind up with any modifications from the binding
		TestBasicObjectFixedDMO	obj2 = new TestBasicObjectFixedDMO();
		obj2.setSvBoolean(true);
		obj2.setSvString("object 1");
		
		binding.getMvIdxUnnamedObj1().setValue(obj2);
		
		if (binding.getModRec().getModifier().getMVSize() == 0){
			System.out.println("No mods 1");
		}
		else{
			System.out.println("Mods occurred 1");
			fail("No modifications should have been indicated");
		}
		
		TestBasicObjectFixedDMO	obj3 = new TestBasicObjectFixedDMO();
		obj3.setSvBoolean(true);
		obj3.setSvString("object 3");
		
		binding.getMvIdxUnnamedObj1().setValue(obj3);
		
		DmcTypeModifierMV mods = binding.getModRec().getModifier();
		
		if (mods.getMVSize() == 0){
			System.out.println("No mods 2");
		}
		else{
			System.out.println("Mods occurred 2");
			System.out.println(mods.modifierFormat());
		}
		
		////////////////////////////////////////////////////////////////
		binding.setObject(editObject);
		
		
		TestBasicObjectFixedDMO	obj4 = new TestBasicObjectFixedDMO();
		obj4.setSvBoolean(true);
		obj4.setSvString("object 4");
		
		binding.getMvIdxUnnamedObj4().setValue(obj4);
		
		mods = binding.getModRec().getModifier();
		
		if (mods.getMVSize() == 0){
			System.out.println("No mods 3");
		}
		else{
			System.out.println("Mods occurred 3");
			System.out.println(mods.modifierFormat());
		}
		
		
		
//		TestBasicObjectFixedDMO obj1 = new TestBasicObjectFixedDMO();
//		
//		TestBasicObjectFixedDMO obj2 = new TestBasicObjectFixedDMO();
//		
//		
//		if (!obj1.equals(obj2))
//			fail("The objects should be equal");
//		
//		obj1.setSvBoolean(true);
//		obj2.setSvBoolean(true);
//		
//		if (!obj1.equals(obj2))
//			fail("The objects should be equal");
//		
//		obj2.setSvBoolean(false);
//		if (obj1.equals(obj2))
//			fail("The objects should not be equal");
//		obj2.setSvBoolean(true);
//		
//		obj1.setSvString("domain1");
//		obj2.setSvString("domain2");
//		
//		if (obj1.equals(obj2))
//			fail("The objects should not be equal");
//
//		obj2.setSvString("domain1");
//		
//		if (!obj1.equals(obj2))
//			fail("The objects should be equal");
//		
//		TestBasicObjectFixedDMO ind1 = new TestBasicObjectFixedDMO();
//		ind1.setSvInteger(1);
//		ind1.setSvString("domain1");
//		
//		TestBasicObjectFixedDMO ind2 = new TestBasicObjectFixedDMO();
//		ind2.setSvInteger(2);
//		ind2.setSvString("domain2");
//		
//		obj1.setNthMvIdxUnnamedObj(1, ind1);
//		
//		if (obj1.equals(obj2))
//			fail("The objects should not be equal");
//		
//		obj2.setNthMvIdxUnnamedObj(2, ind2);
//		
//		if (obj1.equals(obj2))
//			fail("The objects should not be equal");
//		
//		obj1.setNthMvIdxUnnamedObj(2, ind2);
//		obj2.setNthMvIdxUnnamedObj(1, ind1);
//		
//		if (!obj1.equals(obj2))
//			fail("The objects should be equal");
//		
//		TestBasicObjectFixedDMO ind31 = new TestBasicObjectFixedDMO();
//		ind31.setSvInteger(3);
//		ind31.setSvString("domain3");
//		
//		TestBasicObjectFixedDMO ind32 = new TestBasicObjectFixedDMO();
//		ind32.setSvInteger(3);
//		ind32.setSvString("domain 3");
//		
//		TestBasicObjectFixedDMO ind33 = new TestBasicObjectFixedDMO();
//		ind33.setSvInteger(3);
//		ind33.setSvString("domain3");
//		
//		obj1.setNthMvIdxUnnamedObj(3, ind31);
//		obj2.setNthMvIdxUnnamedObj(3, ind32);
//		
//		if (obj1.equals(obj2))
//			fail("The objects should not be equal");
//		
//		obj2.setNthMvIdxUnnamedObj(3, ind33);
//		
//		if (!obj1.equals(obj2))
//			fail("The objects should be equal");
//		
	}
	
	
}
