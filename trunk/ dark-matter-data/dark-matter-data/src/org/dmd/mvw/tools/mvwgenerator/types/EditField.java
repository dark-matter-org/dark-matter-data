package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The EditField type allows for compact specification of an association between an 
 * attribute and the type of field editor used to present and alter it. The string form
 * of the type is:
 * <p />
 * [attribute name] [field editor] <: label> <: tip>
 * <p />
 * The label and the tip are optional since that information may be provide via property
 * files for I18N support.
 */
@SuppressWarnings("serial")
public class EditField implements DmcMappedAttributeIF, Serializable {

	String	attribute;
	String	fieldEditor;
	String	label;
	String	tip;
	
	public EditField(){
		attribute 	= null;
		fieldEditor 	= null;
		label		= null;
		tip			= null;
	}
	
	public EditField(String an, String ft, String l, String t){
		attribute 	= an;
		fieldEditor 	= ft;
		label		= l;
		tip			= t;
	}
	
	public EditField(EditField ef){
		attribute 	= ef.attribute;
		fieldEditor 	= ef.fieldEditor;
		label		= ef.label;
		tip			= ef.tip;
	}
	
	public EditField(String v) throws DmcValueException{
		String value = v.trim();
		int spacepos = value.indexOf(" ");
		
		if (spacepos == -1){
			throw(new DmcValueException("Malformed EditField: " + v + " - should be of the form: [attribute name] [field editor] <: label> <: tip>"));
		}
		else{
			attribute = value.substring(0,spacepos);
			String remainder = value.substring(spacepos + 1).trim();
			int colonpos = remainder.indexOf(":");
			
			if (colonpos == -1){
				fieldEditor = remainder;
			}
			else{
				fieldEditor = remainder.substring(0,colonpos).trim();
				
				if ( (colonpos + 1) < remainder.length()){
					remainder = remainder.substring(colonpos + 1).trim();
					colonpos = remainder.indexOf(":");
					
					if (colonpos == -1)
						label = remainder;
					else
						label = remainder.substring(0,colonpos).trim();

					if ( (colonpos + 1) < remainder.length()){
						remainder = remainder.substring(colonpos + 1).trim();
						tip = remainder;
					}
					else{
						throw(new DmcValueException("Missing value for tool tip after colon."));
					}
					
				}
				else{
					throw(new DmcValueException("Missing value for label after colon."));
				}
			}
		}
		
			
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
		
	@Override
	public String toString(){
		if (label == null){
			return(attribute + " " + fieldEditor);
		}
		else if (tip == null){
			return(attribute + " " + fieldEditor + " : " + label);
		}
		else{
			return(attribute + " " + fieldEditor + " : " + label + " : " + tip);
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
