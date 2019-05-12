package org.dmd.templates.tools.xml;

import java.util.ArrayList;

import org.dmd.dmc.util.ParsedNameValuePair;

public class XmlElement extends XmlPart {

	// The name of the element
	String 							name;
	
	String							body;
	
	// Set to true if it's of the form <p />
	boolean							empty;
	
	// The elements embedded within this element
	ArrayList<XmlPart>			subParts;
	
	ArrayList<ParsedNameValuePair>	attributes;
	String attrString;
	
	int								line;
	
	public XmlElement(String n, int l){
		name 		= n;
		body		= null;
		empty 		= false;
		subParts	= null;
		attributes	= null;
		attrString	= null;
		line		= l;
	}
	
	public int subElementCount(){
		if (subParts == null)
			return(0);
		return(subParts.size());
	}
	
	public String name(){
		return(name);
	}
	
	public void addText(XmlText xt){
		if (subParts == null)
			subParts = new ArrayList<XmlPart>();
		subParts.add(xt);
	}
	
	public String body(){
		return(body);
	}
	
	public void setEmpty(){
		empty = true;
	}
	
	public boolean isEmpty(){
		return(empty);
	}
	
	public void attributes(String attributeInfo){
		attrString = attributeInfo;
	}
	
	public void addElement(XmlElement xe){
		if (subParts == null)
			subParts = new ArrayList<XmlPart>();
		subParts.add(xe);
	}
	
	public String toString(){
		return(toString(""));
	}
		
	public String toString(String indent){
		if (empty){
			return(indent + "<" + name + " />");
		}
		else{
			StringBuffer sb = new StringBuffer();
			
			sb.append(indent + "<" + name + " ");
			
			if (attributes != null){
				
			}
			
			if (attrString != null){
				sb.append(attrString);
			}
			
			sb.append(">\n");
			
			if (body != null){
				sb.append(body + "\n");
			}
			
			if (subParts != null){
				for(XmlPart xe : subParts){
					sb.append(xe.toString(indent + "  "));
				}
			}
			
			sb.append(indent + "</" + name + ">");
			
			return(sb.toString());
		}
	}
}
