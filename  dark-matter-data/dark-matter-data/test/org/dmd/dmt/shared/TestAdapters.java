package org.dmd.dmt.shared;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.Modifier;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dms.generated.adapters.StringMVAdapter;
import org.dmd.dms.generated.adapters.StringSVAdapter;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestAdapters {

	static boolean initialized = false;

	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
		if (!initialized){
//			DebugInfo.debug("STARTING...");
			DmpSchemaAG dmp = new DmpSchemaAG();
			DmtSchemaAG dmt = new DmtSchemaAG();			
			DmwOmni.instance().addSchema(dmp);
			DmwOmni.instance().addSchema(dmt);
			
	        File curr = new File(".");
	        String runDir;
			runDir = curr.getCanonicalPath();
			
			initialized = true;
		}
	}

	@Test
	public void testStringSV() throws DmcValueException{
		ObjWithRefsDMO	obj = new ObjWithRefsDMO();
		obj.setName("object1");
		obj.setSvString("string one");
		
		StringSVAdapter	adapter = new StringSVAdapter(DmtDMSAG.__svString);
		adapter.setExisting(obj.get(DmtDMSAG.__svString));
		
		assertEquals("Has value should be true", true, adapter.hasValue());
		
		adapter.set("new value");
		assertEquals("Value has changed", true, adapter.valueChanged());
		
		ObjWithRefsDMO	modrec = obj.getModificationRecorder();
		
		adapter.addMods(modrec.getModifier());
		
		assertEquals("The modrec should have one change", 1, modrec.getModifier().getMVSize());
		
		Modifier mod = modrec.getModifier().getMVnth(0);

		assertEquals("Modify operation should be SET", mod.getModifyType(), ModifyTypeEnum.SET);

		System.out.println(modrec.toOIF());
		
		adapter.setEmpty();
		
		assertEquals("Has value should be false", false, adapter.hasValue());
		
		modrec = obj.getModificationRecorder();
		
		adapter.addMods(modrec.getModifier());
		
		mod = modrec.getModifier().getMVnth(0);
		
		assertEquals("Modify operation should be REM", mod.getModifyType(), ModifyTypeEnum.REM);
		
		System.out.println(modrec.toOIF());
		
	}
	

	@Test
	public void testStringMV() throws DmcValueException{
		ObjWithRefsDMO	obj = new ObjWithRefsDMO();
		obj.setName("object1");
		obj.addMvString("value 1");
		obj.addMvString("value 2");
		
		StringMVAdapter	adapter = new StringMVAdapter(DmtDMSAG.__mvString);
		adapter.setExisting(obj.get(DmtDMSAG.__mvString));
		
		assertEquals("Has value should be true", true, adapter.hasValue());
		
		adapter.add("new value");
		assertEquals("Value has changed", true, adapter.valueChanged());
		
		ObjWithRefsDMO	modrec = obj.getModificationRecorder();
		
		adapter.addMods(modrec.getModifier());
		
		assertEquals("The modrec should have one change", 1, modrec.getModifier().getMVSize());
		
		Modifier mod = modrec.getModifier().getMVnth(0);

		assertEquals("Modify operation should be ADD", mod.getModifyType(), ModifyTypeEnum.ADD);

		System.out.println(modrec.toOIF());
		
		/////
		
		adapter.del("value 1");
		
		modrec = obj.getModificationRecorder();
		
		adapter.addMods(modrec.getModifier());
		
		assertEquals("The modrec should have two change", 2, modrec.getModifier().getMVSize());
		
		mod = modrec.getModifier().getMVnth(1);

		assertEquals("Modify operation should be DEL", mod.getModifyType(), ModifyTypeEnum.DEL);

		System.out.println(modrec.toOIF());
		
		
		/////
		adapter.setEmpty();
		
		assertEquals("Has value should be false", false, adapter.hasValue());
		
		modrec = obj.getModificationRecorder();
		
		adapter.addMods(modrec.getModifier());
		
		mod = modrec.getModifier().getMVnth(0);
		
		assertEquals("Modify operation should be REM", mod.getModifyType(), ModifyTypeEnum.REM);
		
		System.out.println(modrec.toOIF());
		
	}
}
