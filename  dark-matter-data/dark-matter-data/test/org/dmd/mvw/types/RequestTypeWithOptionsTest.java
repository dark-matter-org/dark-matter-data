package org.dmd.mvw.types;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.RequestOptionEnum;
import org.dmd.mvw.tools.mvwgenerator.types.RequestTypeWithOptions;
import org.junit.Test;

public class RequestTypeWithOptionsTest {

	@SuppressWarnings("unused")
	@Test
	public void testToowFewTokens(){
		RequestTypeWithOptions rt = null;
		
		try {
			rt = new RequestTypeWithOptions("junk");
			assertTrue("Should have indicated too few tokens.", false);			
		} catch (DmcValueException e) {
			System.out.println("Expected exception: " + e.toString());
		}
	}

	@Test
	public void testTypeAndFunction() throws DmcValueException{
		RequestTypeWithOptions rt = null;
		
		rt = new RequestTypeWithOptions("SetRequest setContact Contact");
		assertEquals("Request type should be Set", "Set", rt.getRequestType());			
		assertEquals("Function should be setContact", "setContact", rt.getFunctionName());			
		assertEquals("Class name should be Contact", "Contact", rt.getClassName());			
	}

	@SuppressWarnings("unused")
	@Test
	public void testIncorrectOption() throws DmcValueException{
		RequestTypeWithOptions rt = null;
		
		try {
			rt = new RequestTypeWithOptions("SetRequest setContact");
			assertTrue("Should have indicated missing class.", false);			
		} catch (DmcValueException e) {
			System.out.println("Expected exception: " + e.toString());
		}
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testIncorrectOption2() throws DmcValueException{
		RequestTypeWithOptions rt = null;
		
		try {
			rt = new RequestTypeWithOptions("SetRequest setContact CENTRALERRORS");
			assertTrue("Should have indicated missing class.", false);			
		} catch (DmcValueException e) {
			System.out.println("Expected exception: " + e.toString());
		}
	}
	
	@Test
	public void testValidOptions() throws DmcValueException{
		RequestTypeWithOptions rt = null;
		
		rt = new RequestTypeWithOptions("SetRequest setContact Contact CENTRALERRORS DMPERRORS");
		assertEquals("Request type should be Set", "Set", rt.getRequestType());			
		assertEquals("Function should be setContact", "setContact", rt.getFunctionName());
		HashSet<RequestOptionEnum>	options = rt.getOptions();
		
		assertEquals("Should have 2 options", 2, options.size());
		
		assertEquals("Should have CONTRALERRORS option", true, options.contains(RequestOptionEnum.CENTRALERRORS));
		
		assertEquals("Should have DMPERRORS option", true, options.contains(RequestOptionEnum.DMPERRORS));
	}

	@SuppressWarnings("unused")
	@Test
	public void testInvalidUnlessGetRequest1() throws DmcValueException{
		RequestTypeWithOptions rt = null;
		
		try {
			rt = new RequestTypeWithOptions("SetRequest setContact CENTRALERRORS CACHE");
			assertTrue("Should have indicated invalid option.", false);			
		} catch (DmcValueException e) {
			System.out.println("Expected exception: " + e.toString());
		}
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testInvalidUnlessGetRequest2() throws DmcValueException{
		RequestTypeWithOptions rt = null;
		
		try {
			rt = new RequestTypeWithOptions("SetRequest setContact CENTRALERRORS EVENTS");
			assertTrue("Should have indicated invalid option.", false);			
		} catch (DmcValueException e) {
			System.out.println("Expected exception: " + e.toString());
		}
	}
	
	@Test
	public void testValidGetOptions() throws DmcValueException{
		RequestTypeWithOptions rt = null;
		
		rt = new RequestTypeWithOptions("GetRequest getContact CENTRALERRORS CACHE EVENTS");
		assertEquals("Request type should be Get", "Get", rt.getRequestType());			
		assertEquals("Function should be getContact", "getContact", rt.getFunctionName());
		HashSet<RequestOptionEnum>	options = rt.getOptions();
		
		assertEquals("Should have 3 options", 3, options.size());
		
		assertEquals("Should have CACHE option", true, options.contains(RequestOptionEnum.CACHE));
	}

	@Test
	public void testFallbackToDefaultErrors() throws DmcValueException{
		RequestTypeWithOptions rt = null;
		
		rt = new RequestTypeWithOptions("SetRequest setContact Contact");
		assertEquals("Request type should be Set", "Set", rt.getRequestType());		
		assertEquals("Function should be setContact", "setContact", rt.getFunctionName());
		HashSet<RequestOptionEnum>	options = rt.getOptions();
		
		assertNotNull("Should have options", options);
		
		assertEquals("Should have 2 options", 2, options.size());
		
		assertEquals("Should have DMPERRORS option", true, options.contains(RequestOptionEnum.DMPERRORS));
		
		assertEquals("Should have CENTRALRPCERRORS option", true, options.contains(RequestOptionEnum.CENTRALRPCERRORS));
	}

	@Test
	public void testFallbackToCentralRPCErrors() throws DmcValueException {
		RequestTypeWithOptions rt = null;
		
		rt = new RequestTypeWithOptions("SetRequest setContact Contact DMPERRORS");
		assertEquals("Request type should be Set", "Set", rt.getRequestType());		
		assertEquals("Function should be setContact", "setContact", rt.getFunctionName());
		HashSet<RequestOptionEnum>	options = rt.getOptions();
		
		assertNotNull("Should have options", options);
		
		assertEquals("Should have 2 options", 2, options.size());
		
		assertEquals("Should have DMPERRORS option", true, options.contains(RequestOptionEnum.DMPERRORS));
		
		assertEquals("Should have CENTRALRPCERRORS option", true, options.contains(RequestOptionEnum.CENTRALRPCERRORS));
	}

	@Test
	public void testFallbackToCentralDMPErrors() throws DmcValueException {
		RequestTypeWithOptions rt = null;
		
		rt = new RequestTypeWithOptions("SetRequest setContact Contact RPCERRORS");
		assertEquals("Request type should be Set", "Set", rt.getRequestType());		
		assertEquals("Function should be setContact", "setContact", rt.getFunctionName());
		HashSet<RequestOptionEnum>	options = rt.getOptions();
		
		assertNotNull("Should have options", options);
		
		assertEquals("Should have 2 options", 2, options.size());
		
		assertEquals("Should have RPCERRORS option", true, options.contains(RequestOptionEnum.RPCERRORS));
		
		assertEquals("Should have CENTRALDMPERRORS option", true, options.contains(RequestOptionEnum.CENTRALDMPERRORS));
	}



}
