package org.dmd.dsd.tools.dsdwizard;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class WizardGenerationTest {
	
	@Test
	public void generateBadWorkspace() throws IOException, ResultException {
		String ws = getWorkspace() + "/moose";
		String[] args = {"-workspace", ws , "-srcdir", "org/dmd/dsd/tools/dsdwizard/com/example/gpb"};

		DSDWizard wizard = new DSDWizard(args);
		
		try {
			wizard.run();
			assertEquals("Expecting bad workspace exception",true, false);
		}
		catch(ResultException e){
			DebugInfo.debug("Got expected exception:\n" + e);
		}
	}

	@Test
	public void generateGoodWorkspace() throws IOException, ResultException {
		String ws = getWorkspace() + "/test";
		String[] args = {"-workspace", ws , "-srcdir", "org/dmd/dsd/tools/dsdwizard/com/example/gpb", "-dsdname", "gpb"};

		DSDWizard wizard = new DSDWizard(args);
		
		wizard.run();
	}

	String getWorkspace() throws IOException{
        File curr = new File(".");
        String runDir;
		runDir = curr.getCanonicalPath();
		return(runDir);
	}

}
