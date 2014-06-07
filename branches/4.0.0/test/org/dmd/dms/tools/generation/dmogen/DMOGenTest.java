package org.dmd.dms.tools.generation.dmogen;

import java.io.File;
import java.io.IOException;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DmcNameClashException;
import org.dmd.core.rules.DmcRuleExceptionSet;
import org.junit.Before;
import org.junit.Test;

public class DMOGenTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
        int lastSlash = workingDir.lastIndexOf(File.separator);
        workingDir = workingDir.substring(0, lastSlash);
		System.out.println("*** Generator running from: " + workingDir);
	}

	@Test
	public void test() throws DmcRuleExceptionSet, DmcNameClashException, DMFeedbackSet, IOException{
		String[] args = { "-workspace", workingDir,
				"-targets", "dmp",
				"-srcdir", "/dark-matter-refactor/src/org/dmd/dmp"
		};

		DMOGen gen = new DMOGen();
		gen.run(args);
	}
}
