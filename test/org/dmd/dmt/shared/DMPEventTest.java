package org.dmd.dmt.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dmt.server.extended.ObjWithRefs;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;


public class DMPEventTest {
	
//	@Rule
//	public TemporaryFolder folder = new TemporaryFolder();
	
	static String testDataPath = "/test/org/dmd/dmt/shared/data";
	
	static boolean initialized = false;
	
	static File	temp;
	
//	SchemaManager schema;
//	String			
	
	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DebugInfo.debug("STARTING...");
			DmpSchemaAG dmp = new DmpSchemaAG();
			DmtSchemaAG dmt = new DmtSchemaAG();			
			DmwOmni.instance().addSchema(dmp);
			DmwOmni.instance().addSchema(dmt);
			DebugInfo.debug("FINISHED...");
			
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
	public void testPersistentFormCreate() throws Exception{
		
		ObjWithRefs	obj1 = new ObjWithRefs();
		obj1.setName(new StringName("obj1"));
		obj1.setSvString("some string");
		obj1.addNonperString("value 1");
		obj1.addNonperString("value 2");

		DMPEvent	event = new DMPEvent();
		event.setEventTypeDMP(DMPEventTypeEnum.CREATED);
		event.setSourceObject(obj1);
		event.setSourceObjectClass(obj1.getConstructionClass());
		event.setSource(obj1.getObjectName());
		
		DMPEvent	alterred = event.getPersistentForm();
		ObjWithRefsDMO persistent = (ObjWithRefsDMO) alterred.getSourceObject();
		
		assertNotNull("svString should be there.", persistent.getSvString());

		assertEquals("nonPerString should NOT be there", 0, persistent.getNonperStringSize());
	}
	
	@Test
	public void testPersistentFormModify() throws Exception {
		
		ObjWithRefs	obj1 = new ObjWithRefs();
		obj1.setName(new StringName("obj1"));
		obj1.setSvString("some string");
		
		ObjWithRefs mods = obj1.getModificationRecorder();
		mods.setOnOff(true);
		mods.addNonperString("value 1");
		mods.addNonperString("value 2");

		DMPEvent	event = new DMPEvent();
		event.setEventTypeDMP(DMPEventTypeEnum.MODIFIED);
		event.setSourceObjectClass(obj1.getConstructionClass());
		event.setModify(mods.getModifier());
		
		System.out.println(event.toOIF());
		
		DMPEvent	alterred = event.getPersistentForm();
		System.out.println(event.toOIF());

		assertEquals("onOff should be there", true, alterred.thisAttributeModified(DmtDMSAG.__onOff));
		
		assertEquals("nonPerString should NOT be there", false, alterred.thisAttributeModified(DmtDMSAG.__nonperString));
	}
	
}
