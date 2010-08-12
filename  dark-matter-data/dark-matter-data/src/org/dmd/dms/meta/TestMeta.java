package org.dmd.dms.meta;

import org.dmd.dms.MetaSchemaAG;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;


public class TestMeta {

	public TestMeta(){
		
	}
	
	public void initMeta(){
		PrintfFormat format = new PrintfFormat("%-24s");
		
		@SuppressWarnings("unused")
		MetaSchemaAG m = new MetaSchemaAG();
		
		DebugInfo.debug("\n" + MetaSchemaAG._ClassDefinition.getDmcObject().toOIF(15));
	}
}
