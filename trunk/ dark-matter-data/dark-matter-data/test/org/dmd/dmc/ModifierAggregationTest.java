package org.dmd.dmc;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.dmd.dmc.types.StringName;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class ModifierAggregationTest {

	boolean initialized = false;

	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DebugInfo.debug("STARTING...");
			DmpSchemaAG dmp = new DmpSchemaAG();
			DmtSchemaAG dmt = new DmtSchemaAG();			
			DmwOmni.instance().addSchema(dmp);
			DmwOmni.instance().addSchema(dmt);
			initialized = true;
		}
	}

	@Test
	public void testBasicAggregation() throws DmcValueExceptionSet, DmcValueException {
		ObjWithRefs	obj1 = new ObjWithRefs();
		
		obj1.startModificationAggregation();
		
		obj1.setModifier(new DmcTypeModifierMV());
		
		obj1.setName(new StringName("object1"));
		obj1.setAnotherSVString("some string");
		
		obj1.applyCurrentModification();
		
		System.out.println("After first modification:\n\n" + obj1.toOIF());
		
		assertEquals("anotherSVString should be some string", "some string", obj1.getAnotherSVString());
		
		obj1.setModifier(new DmcTypeModifierMV());
		
		obj1.addHsString("string1");
		obj1.addHsString("string2");
		
		obj1.setSvBoolean(true);
		
		obj1.applyCurrentModification();
		
		assertEquals("svBoolean should be true", true, obj1.isSvBoolean());
		
		DmcTypeModifierMV mods = obj1.stopModificationAggregation();
		
		StringBuffer sb = new StringBuffer();
		mods.toOIF(sb);
		System.out.println(sb.toString());
		
		System.out.println(obj1.toOIF());
	}
}
