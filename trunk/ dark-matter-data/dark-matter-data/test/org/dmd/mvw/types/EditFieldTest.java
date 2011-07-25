package org.dmd.mvw.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.EditField;
import org.junit.Test;

public class EditFieldTest {

	@Test
	public void testStringConstructor() throws DmcValueException{
		EditField ef = null;
		
		try {
			ef = new EditField("attribute");
			assertTrue("Should have indicated that the edit field was malformed", false);
		} catch (DmcValueException e1) {
			assertTrue("Expected exception", true);
		}
		
		ef = new EditField("attribute editor");
		assertEquals("Attribute name should be attribute", "attribute", ef.getAttribute());
		
		ef = new EditField("attribute editor");
		assertEquals("Editor name should be editor", "editor", ef.getFieldEditor());
		
		try {
			ef = new EditField("attribute editor : ");
			assertTrue("Should have indicated that the label was missing.", false);
		} catch (DmcValueException e1) {
			System.out.println("Expected:\n" + e1);
			assertTrue("Expected exception", true);
		}
		
		ef = new EditField("attribute editor : label");
		assertEquals("Label should be label", "label", ef.getLabel());
		
		try {
			ef = new EditField("attribute editor : label : ");
			assertTrue("Should have indicated that the tool tip was missing.", false);
		} catch (DmcValueException e1) {
			System.out.println("Expected:\n" + e1);
			assertTrue("Expected exception", true);
		}
		
		ef = new EditField("attribute editor : label : tool tip");
		assertEquals("Tool tip should be tool tip", "tool tip", ef.getTip());
		
		

	}
}
