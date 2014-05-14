package org.dmd.dms.tools.generation.meta;

import java.io.File;
import java.io.IOException;

import org.dmd.core.feedback.DMFeedbackSet;
import org.junit.Before;
import org.junit.Test;

public class MetaGenPart1Test {

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
		
//		try {
			generator.generate(workingDir + "/src/org/dmd/dms", true);
//		} catch (DMFeedbackSet e) {
//			System.err.println(e.toString());
//		}
	}
}
