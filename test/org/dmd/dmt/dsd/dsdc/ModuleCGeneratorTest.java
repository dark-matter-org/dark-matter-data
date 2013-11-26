package org.dmd.dmt.dsd.dsdc;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleCGenerator;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class ModuleCGeneratorTest {
	
	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Generator running from: " + workingDir);
	}
	
	@Test
	public void testGenerator() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet {
		ModuleCGenerator generator = new ModuleCGenerator();
		
		String[] args = { 	"-workspace", 	workingDir,
							"-srcdir",		"test/org/dmd/dmt/dsd"
				};
		
		generator.run(args);
	}
}
