package org.dmd.dmp.shared.generated.dmo;

//import static org.junit.Assert.assertNotNull;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class TestLoginResponse {

	@Test
	public void testObjectClass() throws DmcValueException {
		LoginRequestDMO request = new LoginRequestDMO();
		
		request.addRequestID(54);
		request.setUserName("peter");
		request.setPassword("password");
		
		System.out.println(request.toOIF(15));
		
	}

}
