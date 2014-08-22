package org.dmd.util.debug;

import org.junit.Test;

public class DebugManagerTest {

	@Test
	public void test(){
		@SuppressWarnings("unused")
		DebugChannelIF channel = DebuggableThing.debugTestCat1.getChannel();
		
		
		DebugManager.instance();
	}
	
}
