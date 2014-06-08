package org.dmd.dms.tools.meta;

import java.io.File;
import java.io.IOException;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.tools.meta.MetaGen;
import org.junit.Before;
import org.junit.Test;

public class MetaGenTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Generator running from: " + workingDir);
	}

	@Test
	public void generate() throws IOException, DMFeedbackSet {
		MetaGen generator = new MetaGen();
		
		generator.generate(workingDir + "/src/org/dmd/dms");
		
	}
}
