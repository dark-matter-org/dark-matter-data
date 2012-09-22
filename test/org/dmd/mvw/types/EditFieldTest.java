package org.dmd.mvw.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.EditField;
import org.junit.Test;

@SuppressWarnings("unused")
public class EditFieldTest {

	@Test
	public void missingEditorField() throws DmcValueException{
		EditField ef = null;
		
		try {
			ef = new EditField("attribute");
			assertTrue("Should have indicated that the edit field was malformed", false);
		} catch (DmcValueException e1) {
			assertTrue("Expected exception", true);
		}
	}

	@Test
	public void haveAttributeAndEditor() throws DmcValueException{
		EditField ef = null;
		
		ef = new EditField("attribute editor");
		assertEquals("Attribute name should be attribute", "attribute", ef.getAttribute());
		
		ef = new EditField("attribute editor");
		assertEquals("Editor name should be editor", "editor", ef.getFieldEditor());
				
	}

	@Test
	public void labelMissing() throws DmcValueException{
		EditField ef = null;
				
		try {
			ef = new EditField("attribute editor : ");
			assertTrue("Should have indicated that the label was missing.", false);
		} catch (DmcValueException e1) {
			System.out.println("Expected:\n" + e1);
			assertTrue("Expected exception", true);
		}
		
	}

	@Test
	public void haveLabel() throws DmcValueException{
		EditField ef = null;
				
		ef = new EditField("attribute editor : field label");
		assertEquals("Label should be field label", "field label", ef.getLabel());
		
	}

	@Test
	public void missingtoolTip() throws DmcValueException{
		EditField ef = null;
				
		try {
			ef = new EditField("attribute editor : label : ");
			assertTrue("Should have indicated that the tool tip was missing.", false);
		} catch (DmcValueException e1) {
			System.out.println("Expected:\n" + e1);
			assertTrue("Expected exception", true);
		}
		
	}

	@Test
	public void extraneousTokens() throws DmcValueException{
		EditField ef = null;
				
		try {
			ef = new EditField("attribute editor : label : tooltip :");
			assertTrue("Should have indicated extraneous colons.", false);
		} catch (DmcValueException e1) {
			System.out.println("Expected:\n" + e1);
			assertTrue("Expected exception", true);
		}
		
		try {
			ef = new EditField("attribute editor :: label : tooltip ");
			assertTrue("Should have indicated extraneous colons.", false);
		} catch (DmcValueException e1) {
			System.out.println("Expected:\n" + e1);
			assertTrue("Expected exception", true);
		}
		
	}

	@Test
	public void haveToolTip() throws DmcValueException {
		EditField ef = null;
				
		ef = new EditField("attribute editor : label : tool tip");
		assertEquals("Tool tip should be tool tip", "tool tip", ef.getTip());
		
	}

	@Test
	public void isReadonly() throws DmcValueException{
		EditField ef = null;
		
		ef = new EditField("attribute editor RO");
		assertEquals("Should be read only", true, ef.isReadOnly());
		
		ef = new EditField("attribute      editor RO ");
		assertEquals("Should be read only", true, ef.isReadOnly());
		
		ef = new EditField("attribute editor RO: label : tool tip");
		assertEquals("Should be read only", true, ef.isReadOnly());
		
		ef = new EditField("attribute      editor RO : label : tool tip");
		assertEquals("Should be read only", true, ef.isReadOnly());
		
	}

	@Test
	public void isMandatory() throws DmcValueException{
		EditField ef = null;
		
		ef = new EditField("attribute editor MUST: label : tool tip");
		assertEquals("Should be read only", true, ef.isMandatory());
		
		ef = new EditField("attribute editor MUST");
		assertEquals("Should be mandatory", true, ef.isMandatory());
		
	}
}
