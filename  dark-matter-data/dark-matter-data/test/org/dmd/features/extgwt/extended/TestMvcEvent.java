package org.dmd.features.extgwt.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.util.GeneratorUtils;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestMvcEvent {

	@Test
	public void testGetHandleLocalFunctionCallWithSimpleType() throws DmcValueException {
		String expected = "            handleAppTestEvent((FolderDMO)event.getType());\n";
		
		MvcEvent event = new MvcEvent();
		event.setName("app.test");
//		event.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(event.getName()));
		event.setUserDataType("org.dmd.features.extgwt.examples.generated.dmo.FolderDMO");
		event.setDescription("Some description");
		
		System.out.println(event.getAbstractFunction());
		
		assertEquals("Event data is cast properly.", expected, event.getHandleLocalFunctionCall());
	}
	
	@Test
	public void testGetHandleLocalFunctionCallWithNoData() throws DmcValueException {
		String expected = "            handleAppTestEvent();\n";
		
		MvcEvent event = new MvcEvent();
		event.setName("app.test");
//		event.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(event.getName()));
		event.setDescription("Some description");

		System.out.println(event.getAbstractFunction());

		assertEquals("No event data.", expected, event.getHandleLocalFunctionCall());
	}
	
	@Test
	public void testGetHandleLocalFunctionCallWithCollectoin() throws DmcValueException {
		String expected = "            handleAppTestEvent((List<FolderDMO>)event.getType());\n";
		
		MvcEvent event = new MvcEvent();
		event.setName("app.test");
//		event.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(event.getName()));
		event.setUserDataType("org.dmd.features.extgwt.examples.generated.dmo.FolderDMO");
		event.setUserDataCollection("java.util.List");
		event.setDescription("Some description");

		System.out.println(event.getAbstractFunction());

		assertEquals("Collection of event data.", expected, event.getHandleLocalFunctionCall());
	}
	
	@Test
	public void testGetHandleLocalFunctionCallWithGenericCollectoin() throws DmcValueException {
		String expected = "            handleAppTestEvent((TreeMap<String,FolderDMO>)event.getType());\n";
		
		MvcEvent event = new MvcEvent();
		event.setName("app.test");
//		event.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(event.getName()));
		event.setUserDataType("org.dmd.features.extgwt.examples.generated.dmo.FolderDMO");
		event.setUserDataCollection("java.util.TreeMap");
		event.setUserDataGenericSpec("<String,FolderDMO>");
		event.setDescription("Some description");

		System.out.println(event.getAbstractFunction());

		assertEquals("Collection of event data.", expected, event.getHandleLocalFunctionCall());
	}
	
	
}
