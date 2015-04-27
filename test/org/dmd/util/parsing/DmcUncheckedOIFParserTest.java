package org.dmd.util.parsing;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class DmcUncheckedOIFParserTest {

	final static String datadir = "/test/org/dmd/util/parsing/testdata";
	static String runningDir;
	static boolean initialized = false;

	@Before
	public void setup() throws IOException {
		if (!initialized){
	        File curr = new File(".");
	        runningDir = curr.getCanonicalPath();
			System.out.println("*** Running from: " + runningDir);
	
			try {
				// When run in a test suite, this loading should only take place once
				if (DmwOmni.instance().getSchema().isSchema("dmt") == null){
					DmwOmni.instance().addSchema(new DmtSchemaAG());
				}
			} catch (DmcValueException e) {
				DebugInfo.debug(e.toString());
			}
			initialized = true;
		}
	}

	@Test
	public void testNameContainerParsing() throws ResultException, DmcValueException, DmcRuleExceptionSet {
		ObjectLoader loader = new ObjectLoader();
		
		loader.load(runningDir + datadir + "/request-with-name-container.oif");
		
		
	}

	@Test
	public void badNameAttribute() throws ResultException, DmcValueException, DmcRuleExceptionSet {
		ObjectLoader loader = new ObjectLoader();
		
		try{
			loader.load(runningDir + datadir + "/request-with-bad-name-attribute.oif");
	        assertTrue("Should have thrown bad naming attribute exception", false);
		} catch(ResultException ex){
			// Expected exception
		}
		
		
	}

	@Test
	public void missingContainerValue() throws ResultException, DmcValueException, DmcRuleExceptionSet {
		ObjectLoader loader = new ObjectLoader();
		
		try{
			loader.load(runningDir + datadir + "/request-with-missing-container-value.oif");
	        assertTrue("Should have thrown missing value for name in container", false);
		} catch(ResultException ex){
			// Expected exception
		}
		
	}
}
