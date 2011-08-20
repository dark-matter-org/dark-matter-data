package org.dmd.mvw.types;

import static org.junit.Assert.*;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.MethodWithArgs;
import org.junit.Test;

public class MethodWithArgsTest {

	@Test
	public void testOK1() throws DmcValueException{
		MethodWithArgs mwa = null;
		
		mwa = new MethodWithArgs("void contactChanged(ContactDMO dmo) Called with the user hits Apply");
		
		assertEquals("Return type should be void","void",mwa.getReturnType());
		
		assertEquals("Comment should be 'Called with the user hits Apply'","Called with the user hits Apply",mwa.getComment());
		
//		try {
//			mwa = new MethodWithArgs("contact");
//		} catch (DmcValueException e1) {
//			System.out.println(e1);
//			assertTrue("Unexpected exception", false);
//		}
//		
//		try {
//			gwm = new GetWithOptions("contact MOOSE");
//			assertTrue("Should have indicated that the the option was illegal.", false);
//		} catch (DmcValueException e1) {
//			System.out.println(e1);
//			assertTrue("Expected exception", true);
//		}
//		
//		try {
//			gwm = new GetWithOptions("contact DMPERRORS RPCERRORS CENTRALERRORS CACHE CREATED DELETED MODIFIED");
//			System.out.println(gwm.toString());
//		} catch (DmcValueException e1) {
//			System.out.println(e1);
//			assertTrue("Unexpected exception", false);
//		}
//		
		

	}
}
