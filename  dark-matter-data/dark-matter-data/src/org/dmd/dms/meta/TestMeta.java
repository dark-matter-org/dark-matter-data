package org.dmd.dms.meta;

import org.dmd.dms.MetaSchemaAG;
import org.dmd.util.exceptions.DebugInfo;


public class TestMeta {

	public TestMeta(){
		
	}
	
	public void initMeta(){
		
		@SuppressWarnings("unused")
		MetaSchemaAG m = new MetaSchemaAG();
		
		DebugInfo.debug("\n" + MetaSchemaAG._ClassDefinition.getDmcObject().toOIF(15));
	}
}
