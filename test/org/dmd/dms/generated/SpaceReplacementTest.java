package org.dmd.dms.generated;

import org.junit.Test;

public class SpaceReplacementTest {

	@Test
	public void testReplacement(){
		String withLineFeeds = "this is a line\nwith line\nfeeds";
		
		System.out.println("\"" + withLineFeeds + "\"");
		
		String fixed = withLineFeeds.replaceAll("\n", "\\\\n");
		
		System.out.println("\"" + fixed + "\"");
		
	}
}
