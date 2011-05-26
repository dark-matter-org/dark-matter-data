package org.dmd.mvw.types;

import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.GetWithOptions;
import org.junit.Test;

public class MethodWithArgsTest {

	@Test
	public void testStringConstructor(){
		GetWithOptions gwm = null;
		
		try {
			gwm = new GetWithOptions("contact");
		} catch (DmcValueException e1) {
			System.out.println(e1);
			assertTrue("Unexpected exception", false);
		}
		
		try {
			gwm = new GetWithOptions("contact MOOSE");
			assertTrue("Should have indicated that the the option was illegal.", false);
		} catch (DmcValueException e1) {
			System.out.println(e1);
			assertTrue("Expected exception", true);
		}
		
		try {
			gwm = new GetWithOptions("contact DMPERRORS RPCERRORS CENTRALERRORS CACHE CREATED DELETED MODIFIED");
			System.out.println(gwm.toString());
		} catch (DmcValueException e1) {
			System.out.println(e1);
			assertTrue("Unexpected exception", false);
		}
		
		

	}
}
