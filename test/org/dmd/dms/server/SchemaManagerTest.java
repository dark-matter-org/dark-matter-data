package org.dmd.dms.server;

import static org.junit.Assert.assertNotNull;

import org.dmd.core.feedback.DMFeedbackSet;
import org.junit.Test;

public class SchemaManagerTest {

	@Test
	public void test() throws DMFeedbackSet{
		SchemaManager manager = new SchemaManager();
		
		assertNotNull("Should be able to find ClassDefinition", manager.getClassDefinition("ClassDefinition"));
	}
}
