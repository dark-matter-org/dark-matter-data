package org.dmd.dmp.generated.dmo;

import org.dmd.dmc.DmcValueException;
import org.junit.*;

public class TestLoginRequestDMO {

	@Test
	public void testInstantiation() throws DmcValueException{
		LoginRequestDMO dmo = new LoginRequestDMO();
		
		dmo.setUserName("me");
		dmo.setPassword("pass");
		dmo.setRequestID(9);
		
		System.out.println(dmo.toOIF(12));
	}
}
