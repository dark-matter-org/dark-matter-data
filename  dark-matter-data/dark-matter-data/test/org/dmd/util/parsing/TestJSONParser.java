package org.dmd.util.parsing;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.enums.ScopeEnum;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;
import org.junit.*;

public class TestJSONParser {

	@Test
	public void testParseReadableObject() throws DmcValueException, ResultException {
		JSONParser parser = new JSONParser();
		PrintfFormat	format = new PrintfFormat("%-15s");
		
		GetRequestDMO	request = new GetRequestDMO();
		request.setFQN("JUNK:1");
		request.setRequestID("42");
		request.setScope(ScopeEnum.BASE);
		request.setSessionID("session1");
		
		System.out.println(request.toJSON(15, ""));
		
		DmcUncheckedObject obj = parser.parse(request.toJSON(15, ""));
		
		System.out.println("\n\n" + obj.toOIF(format));
	}

	@Test
	public void testParseCompactObject() throws DmcValueException, ResultException {
		JSONParser parser = new JSONParser();
		PrintfFormat	format = new PrintfFormat("%-15s");
		
		GetRequestDMO	request = new GetRequestDMO();
		request.setFQN("JUNK:1");
		request.setRequestID("42");
		request.setScope(ScopeEnum.BASE);
		request.setSessionID("session1");
		
		System.out.println(request.toCompactJSON());
		
		DmcUncheckedObject obj = parser.parse(request.toCompactJSON());
		
		System.out.println("\n\n" + obj.toOIF(format));
	}
}
