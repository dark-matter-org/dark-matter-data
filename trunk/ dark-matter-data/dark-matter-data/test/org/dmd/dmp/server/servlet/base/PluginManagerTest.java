package org.dmd.dmp.server.servlet.base;

import java.net.URL;
import static org.junit.Assert.*;

import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class PluginManagerTest {

	@Test
	public void testInstantiation(){
		PluginManager pm;
		try {
			pm = new PluginManager();
		} catch (ResultException e1) {
			assertTrue("No exceptions from instantiation of PluginManager", false);
		} catch (DmcValueException e1) {
			assertTrue("No exceptions from instantiation of PluginManager", false);
		}
	}

	@Test
	public void testInvalidObject() throws ResultException, DmcValueException {
		PluginManager pm = new PluginManager();
		URL url = this.getClass().getResource("invalidObject.oif");

		try {
			pm.loadPlugins(url.getFile());
			assertTrue("Should have complained about invalid object", false);
		} catch (ResultException e) {
			System.out.println("Expected exception: \n" + e);
		} catch (DmcValueException e) {
			assertTrue("Should not have value exceptions", false);
		}
	}
	
	@Test
	public void testUnknownObject() throws ResultException, DmcValueException {
		PluginManager pm = new PluginManager();
		URL url = this.getClass().getResource("unknownObject.oif");

		try {
			pm.loadPlugins(url.getFile());
			assertTrue("Should have complained about unknown object", false);
		} catch (ResultException e) {
			System.out.println("Expected exception: \n" + e);
		} catch (DmcValueException e) {
			assertTrue("Should not have value exceptions", false);
		}
	}
	
	@Test
	public void testMissingAttribute() throws ResultException, DmcValueException {
		PluginManager pm = new PluginManager();
		URL url = this.getClass().getResource("missingAttributes.oif");

		try {
			pm.loadPlugins(url.getFile());
			assertTrue("Should have complained about missing attributes", false);
		} catch (ResultException e) {
			System.out.println("Expected exception: \n" + e);
		} catch (DmcValueException e) {
			assertTrue("Should not have value exceptions", false);
		}
	}
	
	@Test
	public void testBadPluginClass() throws ResultException, DmcValueException {
		PluginManager pm = new PluginManager();
		URL url = this.getClass().getResource("classNotFound.oif");

		try {
			pm.loadPlugins(url.getFile());
			assertTrue("Should have complained about plugin class not found.", false);
		} catch (ResultException e) {
			System.out.println("Expected exception: \n" + e);
		} catch (DmcValueException e) {
			assertTrue("Should not have value exceptions", false);
		}
	}
	
	@Test
	public void testMissingSecurity() throws ResultException, DmcValueException {
		PluginManager pm = new PluginManager();
		URL url = this.getClass().getResource("missingSecurity.oif");

		try {
			pm.loadPlugins(url.getFile());
			assertTrue("Should have complained about missing security plugin.", false);
		} catch (ResultException e) {
			System.out.println("Expected exception: \n" + e);
		} catch (DmcValueException e) {
			assertTrue("Should not have value exceptions", false);
		}
	}
	
	@Test
	public void testBasicPlugins() throws ResultException, DmcValueException {
		PluginManager pm = new PluginManager();
		URL url = this.getClass().getResource("basicPlugins.oif");

		try {
			pm.loadPlugins(url.getFile());
			pm.start();
		} catch (ResultException e) {
			System.out.println(e);
			assertTrue("Should have been no exceptions.", false);
		} catch (DmcValueException e) {
			System.out.println(e);
			assertTrue("Should have been no exceptions.", false);
		}
		
		pm.getCache().dumpObjects(System.out);
	}
	
	
}
