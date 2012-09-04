package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;
import java.util.ArrayList;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.CheapSplitter;
import org.dmd.dms.AttributeDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FieldEditorDefinition;

/**
 * The EditField type allows for compact specification of an association between an 
 * attribute and the type of field editor used to present and alter it. The string form
 * of the type is:
 * <p />
 * [attribute name] [field editor] <RO | MUST> <: label> <: tip>
 * <p />
 * The label and the tip are optional since that information may be provide via property
 * files for I18N support.
 * <p />
 * The field may be specified as read-only (RO) or as mandatory (MUST). The logic here is
 * that if a field is mandatory, it must be writable.
 */
@SuppressWarnings("serial")
public class EditField implements DmcMappedAttributeIF, Serializable {
	
	AttributeDefinition		attrDef;
	FieldEditorDefinition	editorDef;

	String	attribute;
	String	fieldEditor;
	boolean	readOnly;
	boolean	must;
	String	label;
	String	tip;
	
	public EditField(){
		attribute 	= null;
		fieldEditor = null;
		readOnly	= false;
		must		= false;
		label		= null;
		tip			= null;
	}
	
	public EditField(String an, String ft, boolean ro, boolean m, String l, String t){
		attribute 	= an;
		fieldEditor = ft;
		readOnly	= ro;
		must		= m;
		label		= l;
		tip			= t;
	}
	
	public EditField(EditField ef){
		attribute 	= ef.attribute;
		fieldEditor = ef.fieldEditor;
		readOnly	= ef.readOnly;
		must		= ef.must;
		label		= ef.label;
		tip			= ef.tip;
	}
	
	public EditField(String v) throws DmcValueException{
		String value = v.replaceAll("\t", " ").trim();
		int spacepos = value.indexOf(" ");
		
		if (spacepos == -1){
			throw(new DmcValueException("Missing field editor: " + v + " - should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
		}
		else{
			int colonpos = value.indexOf(":");
			
			if (colonpos == -1){
				// We don't have label or tooltip, parse the attribute editor <RO|MUST>
				parseFirstPart(value);
			}
			else{
				String firstPart = value.substring(0,colonpos);
				parseFirstPart(firstPart);
				
				String secondPart = value.substring(colonpos);
				parseSecondPart(secondPart.trim());
			}
		}
		
	}
	
	void parseFirstPart(String value) throws DmcValueException {
		boolean wantAttr 	= true;
		boolean wantEditor 	= true;
		boolean haveOption	= false;
		String[] vals = value.split(" ");
		
		for(int i=0; i<vals.length; i++){
			if (vals[i].length() == 0)
				continue;
			if (wantAttr){
				attribute = vals[i];
				wantAttr = false;
				continue;
			}
			if (wantEditor){
				fieldEditor = vals[i];
				wantEditor = false;
				continue;
			}
			if (!haveOption){
				if (vals[i].equals("RO")){
					readOnly = true;
					haveOption = true;
					continue;
				}
				if (vals[i].equals("MUST")){
					must = true;
					haveOption = true;
					continue;
				}
				throw(new DmcValueException("Unknown field option: " + vals[i] + " - should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
			}
			throw(new DmcValueException("Extraneous option: " + vals[i] + " - should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
		}
	}
	
	void parseSecondPart(String value) throws DmcValueException {
		ArrayList<String> tokens = CheapSplitter.split(value, ':', true, true);
//		boolean missingLabel = false;
		boolean wantLabel 	= false;
		boolean wantTip		= false;
		int colonCount = 0;
		
		if (tokens.size() == 1)
			throw(new DmcValueException("Missing label - value should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));

		for(int i=0; i<tokens.size(); i++){
			if (tokens.get(i).equals(":")){
				colonCount++;
				if (colonCount == 1)
					wantLabel = true;
				else if (colonCount == 2)
					wantTip = true;
				else if (colonCount > 2)
					throw(new DmcValueException("Extraneous colons - value should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
				continue;
			}
			if (wantLabel){
				label = tokens.get(i);
				if (label.length() == 0)
					throw(new DmcValueException("Missing label - should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
				wantLabel = false;
				continue;
			}
			if (wantTip){
				tip = tokens.get(i);
				if (tip.length() == 0)
					throw(new DmcValueException("Missing tool tip - should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
				wantTip = false;
				continue;
			}
			String garbage = tokens.get(i);
			
			throw(new DmcValueException("Extraneous tokens/space: *" + garbage + "* [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
		}
		
		if (wantLabel)
			throw(new DmcValueException("Missing label - should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
		if (wantTip)
			throw(new DmcValueException("Missing tool tip - should be of the form: [attribute name] [field editor] <RO|MUST> <: label> <: tip>"));
			
	}
	
	public void setAttrDef(AttributeDefinition ad){
		attrDef = ad;
	}
	
	public AttributeDefinition getAttrDef(){
		return(attrDef);
	}
	
	public void setEditorDef(FieldEditorDefinition fed){
		editorDef = fed;
	}
	
	public FieldEditorDefinition getEditorDef(){
		return(editorDef);
	}
	
	public String getAttribute(){
		return(attribute);
	}
		
	public String getFieldEditor(){
		return(fieldEditor);
	}
		
	public String getLabel(){
		return(label);
	}
		
	public String getTip(){
		return(tip);
	}
	
	public boolean isReadOnly(){
		return(readOnly);
	}
	
	public boolean isMandatory(){
		return(must);
	}
		
	@Override
	public String toString(){
		String option = "";
		if (readOnly)
			option = " RO";
		if (must)
			option = " MUST";
		
		if (label == null){
			return(attribute + " " + fieldEditor + option);
		}
		else if (tip == null){
			return(attribute + " " + fieldEditor + option + " : " + label);
		}
		else{
			return(attribute + " " + fieldEditor + option + " : " + label + " : " + tip);
		}
	}

	@Override
	public Object getKey() {
		return(attribute);
	}

	@Override
	public String getKeyAsString() {
		return(attribute);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		boolean rc = false;
		
		if (obj instanceof EditField){
			EditField other = (EditField)obj;
			
			if (readOnly != other.readOnly)
				return(false);
			
			if (must != other.must)
				return(false);
			
			if (attribute.equals(other.attribute)){
				if (fieldEditor.equals(other.fieldEditor)){
					if (label == null){
						if (other.label == null)
							rc = true;
					}
					else{
						if (other.label != null){
							if (label.equals(other.label)){
								if (tip == null){
									if (other.tip == null)
										rc = true;
								}
								else{
									if (other.tip != null){
										if (tip.equals(other.tip))
											rc = true;
									}
								}
							}
						}
					}
				}
			}
		}
		return(rc);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(attribute);
		dos.writeUTF(fieldEditor);
		dos.writeUTF(label);
		dos.writeUTF(tip);
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		attribute 	= dis.readUTF();
		fieldEditor 	= dis.readUTF();
		label 		= dis.readUTF();
		tip 		= dis.readUTF();
	}
}
