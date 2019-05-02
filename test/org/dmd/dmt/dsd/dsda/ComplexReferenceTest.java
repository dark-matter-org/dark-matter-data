package org.dmd.dmt.dsd.dsda;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmt.dsd.dsda.server.extended.ABConceptX;
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;
import org.dmd.dmt.dsd.dsda.tools.config.ModuleAConfigLoader;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;


public class ComplexReferenceTest {

	static String runningDir;
	static String configDir;

	@Before
	public void initialize() throws IOException, ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
		File curr = new File(".");
		runningDir = curr.getCanonicalPath();
		configDir = runningDir + "/test/org/dmd/dmt/dsd/dsda/data";
	}
	@Test
	public void test() throws DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, ResultException {
		DmcOmni.instance().backRefTracking(true);
		
		ModuleAConfigLoader loader = new ModuleAConfigLoader();
		
		loader.load(configDir);
		
		ABConceptX concept1 = null;
		ABConceptX concept2 = null;
		
		Iterator<ABConceptX> it = loader.definitionmanager().getABConceptXDefinitionsByName("concept1");
		while(it.hasNext()) {
			concept1 = it.next();
			
			System.out.println(concept1.getBackRefs() + "\n");
			
			ArrayList<DmwWrapper> refs = concept1.getReferringObjectsViaAttribute(DsdADMSAG.__referenceToAB);
			
			System.out.println(concept1.toOIF());
		}
		
		try {
			loader.definitionmanager().deleteDefinition(concept1.getDotName());
			
			assertEquals("Should have thrown an exception about outstdanding references", false, true);
			
		} catch (ResultException e) {
			System.out.println("Expected exception:\n\n" + e.toString());

		}
		
		it = loader.definitionmanager().getABConceptXDefinitionsByName("concept2");
		while(it.hasNext()) {
			concept2 = it.next();
		}
		
		// Removing this should remove the references to concept1
		concept2.remReferenceToAB();
		
		ArrayList<DmwWrapper> refs = concept1.getReferringObjectsViaAttribute(DsdADMSAG.__referenceToAB);

		assertEquals("Should have no references to concept1 references", 0, refs.size());

		
		
	}
}
