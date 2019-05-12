package org.dmd.templates.tools.xml;

public class XmlText extends XmlPart {

	String text;
	
	public XmlText(String t){
		text = t;
	}
	
	public String toString(String indent){
		return(indent + text);
	}
	
	public String toString(){
		return(text);
	}
}
